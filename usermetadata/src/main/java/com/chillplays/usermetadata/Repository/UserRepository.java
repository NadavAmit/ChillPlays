package com.chillplays.usermetadata.Repository;

import com.chillplays.usermetadata.Entity.UserMetaData;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserMetaData,Long> {
}
