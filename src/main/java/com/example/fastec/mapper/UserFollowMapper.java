package com.example.fastec.mapper;

import static com.example.fastec.mapper.UserFollowDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.fastec.bean.UserFollow;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UserFollowMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, alias, createTime, originUserId, targetUserId, updateTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserFollow> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UserFollow> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserFollowResult")
    Optional<UserFollow> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserFollowResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="alias", property="alias", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="origin_user_id", property="originUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="target_user_id", property="targetUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.BIGINT)
    })
    List<UserFollow> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userFollow, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userFollow, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UserFollow record) {
        return MyBatis3Utils.insert(this::insert, record, userFollow, c ->
            c.map(id).toProperty("id")
            .map(alias).toProperty("alias")
            .map(createTime).toProperty("createTime")
            .map(originUserId).toProperty("originUserId")
            .map(targetUserId).toProperty("targetUserId")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UserFollow> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, userFollow, c ->
            c.map(id).toProperty("id")
            .map(alias).toProperty("alias")
            .map(createTime).toProperty("createTime")
            .map(originUserId).toProperty("originUserId")
            .map(targetUserId).toProperty("targetUserId")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UserFollow record) {
        return MyBatis3Utils.insert(this::insert, record, userFollow, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(alias).toPropertyWhenPresent("alias", record::getAlias)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(originUserId).toPropertyWhenPresent("originUserId", record::getOriginUserId)
            .map(targetUserId).toPropertyWhenPresent("targetUserId", record::getTargetUserId)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UserFollow> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userFollow, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UserFollow> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userFollow, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UserFollow> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userFollow, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UserFollow> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userFollow, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UserFollow record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(alias).equalTo(record::getAlias)
                .set(createTime).equalTo(record::getCreateTime)
                .set(originUserId).equalTo(record::getOriginUserId)
                .set(targetUserId).equalTo(record::getTargetUserId)
                .set(updateTime).equalTo(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserFollow record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(alias).equalToWhenPresent(record::getAlias)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(originUserId).equalToWhenPresent(record::getOriginUserId)
                .set(targetUserId).equalToWhenPresent(record::getTargetUserId)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UserFollow record) {
        return update(c ->
            c.set(alias).equalTo(record::getAlias)
            .set(createTime).equalTo(record::getCreateTime)
            .set(originUserId).equalTo(record::getOriginUserId)
            .set(targetUserId).equalTo(record::getTargetUserId)
            .set(updateTime).equalTo(record::getUpdateTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UserFollow record) {
        return update(c ->
            c.set(alias).equalToWhenPresent(record::getAlias)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(originUserId).equalToWhenPresent(record::getOriginUserId)
            .set(targetUserId).equalToWhenPresent(record::getTargetUserId)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}