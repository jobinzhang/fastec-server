package com.example.fastec.mapper;

import static com.example.fastec.mapper.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.fastec.bean.User;
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
public interface UserMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, phone, passwrod, portrait, description, sex, token, pushId, createTime, updateTime, lastReceiveMsg);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<User> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<User> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserResult")
    Optional<User> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="passwrod", property="passwrod", jdbcType=JdbcType.VARCHAR),
        @Result(column="portrait", property="portrait", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="push_id", property="pushId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.BIGINT),
        @Result(column="last_receive_msg", property="lastReceiveMsg", jdbcType=JdbcType.BIGINT)
    })
    List<User> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, user, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, user, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(phone).toProperty("phone")
            .map(passwrod).toProperty("passwrod")
            .map(portrait).toProperty("portrait")
            .map(description).toProperty("description")
            .map(sex).toProperty("sex")
            .map(token).toProperty("token")
            .map(pushId).toProperty("pushId")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(lastReceiveMsg).toProperty("lastReceiveMsg")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<User> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, user, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(phone).toProperty("phone")
            .map(passwrod).toProperty("passwrod")
            .map(portrait).toProperty("portrait")
            .map(description).toProperty("description")
            .map(sex).toProperty("sex")
            .map(token).toProperty("token")
            .map(pushId).toProperty("pushId")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(lastReceiveMsg).toProperty("lastReceiveMsg")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(passwrod).toPropertyWhenPresent("passwrod", record::getPasswrod)
            .map(portrait).toPropertyWhenPresent("portrait", record::getPortrait)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(sex).toPropertyWhenPresent("sex", record::getSex)
            .map(token).toPropertyWhenPresent("token", record::getToken)
            .map(pushId).toPropertyWhenPresent("pushId", record::getPushId)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
            .map(lastReceiveMsg).toPropertyWhenPresent("lastReceiveMsg", record::getLastReceiveMsg)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<User> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, user, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<User> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, user, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<User> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, user, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<User> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, user, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(phone).equalTo(record::getPhone)
                .set(passwrod).equalTo(record::getPasswrod)
                .set(portrait).equalTo(record::getPortrait)
                .set(description).equalTo(record::getDescription)
                .set(sex).equalTo(record::getSex)
                .set(token).equalTo(record::getToken)
                .set(pushId).equalTo(record::getPushId)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(lastReceiveMsg).equalTo(record::getLastReceiveMsg);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(passwrod).equalToWhenPresent(record::getPasswrod)
                .set(portrait).equalToWhenPresent(record::getPortrait)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(token).equalToWhenPresent(record::getToken)
                .set(pushId).equalToWhenPresent(record::getPushId)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(lastReceiveMsg).equalToWhenPresent(record::getLastReceiveMsg);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(User record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(phone).equalTo(record::getPhone)
            .set(passwrod).equalTo(record::getPasswrod)
            .set(portrait).equalTo(record::getPortrait)
            .set(description).equalTo(record::getDescription)
            .set(sex).equalTo(record::getSex)
            .set(token).equalTo(record::getToken)
            .set(pushId).equalTo(record::getPushId)
            .set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .set(lastReceiveMsg).equalTo(record::getLastReceiveMsg)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(User record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(phone).equalToWhenPresent(record::getPhone)
            .set(passwrod).equalToWhenPresent(record::getPasswrod)
            .set(portrait).equalToWhenPresent(record::getPortrait)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(sex).equalToWhenPresent(record::getSex)
            .set(token).equalToWhenPresent(record::getToken)
            .set(pushId).equalToWhenPresent(record::getPushId)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .set(lastReceiveMsg).equalToWhenPresent(record::getLastReceiveMsg)
            .where(id, isEqualTo(record::getId))
        );
    }
}