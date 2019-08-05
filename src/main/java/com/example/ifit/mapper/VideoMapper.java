package com.example.ifit.mapper;

import com.example.ifit.entity.Video;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoMapper {

    /**
     *
     * @param author_id
     * @return
     */
    List<Video> listfindByAuthorId(long author_id);

    /**
     *
     * @param video_id
     * @return
     */
    List<Video> listfindByVideoId(long video_id);

    /**
     *
     * @param video
     * @return
     */
    int insertVideo(Video video);

    /**
     *
     * @param id
     * @return
     */
    boolean deleteById(long id);

    /**
     *
     * @param name
     * @param id
     * @return
     */
    boolean updateNameById(@Param("name") String name, @Param("id") long id);

    /**
     *
     * @param like
     * @param id
     * @return
     */
    boolean updateLikeById(@Param("like") int like,@Param("id") long id);

    /**
     *
     * @param unlike
     * @param id
     * @return
     */
    boolean updateUnlikeById(@Param("unlike") int unlike,@Param("id") long id);

    /**
     *
     * @param recommend
     * @param id
     * @return
     */
    boolean updateRecommendById(@Param("recommend") int recommend,@Param("id") long id);
}
