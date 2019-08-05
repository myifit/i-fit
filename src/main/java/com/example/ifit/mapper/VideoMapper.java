package com.example.ifit.mapper;

import com.example.ifit.entity.Video;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoMapper {

    /**
     *
     * @param authorId
     * @return
     */
    List<Video> listfindByAuthorId(long authorId);

    /**
     *
     * @param videoId
     * @return
     */
    List<Video> listfindByVideoId(long videoId);

    /**
     *
     * @param video
     * @return
     */
    boolean insertVideo(Video video);

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
