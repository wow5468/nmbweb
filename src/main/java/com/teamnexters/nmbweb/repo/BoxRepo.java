package com.teamnexters.nmbweb.repo;

import com.teamnexters.nmbweb.entity.BoxEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by limjuhyun on 8/2/16.
 */
public interface BoxRepo extends JpaRepository<BoxEntity, String> {
    List<BoxEntity> findByUseridAndShuserid(String userid, String shUserid);
}

