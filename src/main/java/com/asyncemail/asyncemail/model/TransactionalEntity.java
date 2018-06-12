package com.asyncemail.asyncemail.model;

import org.joda.time.DateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;




@MappedSuperclass    // has no separate table defined for it
public class TransactionalEntity implements Serializable {
    /*
     * The default serial version UID
     */
    private static final long serialVersionUID = 1L;

    /**
     * The primary key identifier
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * A secondary unique identifier which may be used as a reference to this
     * entity by external systems
     **/
    @NotNull
    private String referenceId = UUID.randomUUID().toString();

    /**
     * The entity instance version used for optimistic locking.
     **/
    @Version
    private Integer version;

    /**
     * The reference to the entity or process which created this entity instance.
     **/
    @NotNull
    private String createdBy;

    /**
     * The timestamp when this entity instance was created
     **/
    @NotNull
    private DateTime createdAt;


    /**
     * A reference to the entity or process which most recently updated this
     * entity instance
     **/
    private String updatedBy;


    /**
     * The timestamp when this entity instance was most recemtly updated
     **/
    private DateTime upadatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public DateTime getUpadatedAt() {
        return upadatedAt;
    }

    public void setUpadatedAt(DateTime upadatedAt) {
        this.upadatedAt = upadatedAt;
    }

    /**
     *Determines the equality of two Transactional objects. If the
     * supplied object is null, returns false. If both objects are of the same
     * class, and their <code>id</> values are populated and equal, return
     * <code>true</code>. Otherwise, return <code>false</code>.
     *
     * @param o An Object
     * @return A boolean
     * @see java.lang.Object#equals(Object)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionalEntity that = (TransactionalEntity) o;
        return Objects.equals(getId(), that.getId());
    }


    /**
     * Returns the hash value of this object.
     *
     * @return An int
     * @see java.lang.Object#hashCode
     **/
    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }
}
