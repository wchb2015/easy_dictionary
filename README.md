
### 添加单词

#### 请求参数

字段名 | 含义 | 类型 | 必需	 | 备注 | 生成规则
---|--- |--- |--- |--- |---
row 1 col 1 | row 1 col 2  |  |  | |
row 2 col 1 | row 2 col 2  |  |  | |

#### 请求模板

#### 响应参数

字段名 | 含义 | 类型 | 必需	 | 备注 | 生成规则
---|--- |--- |--- |--- |---
row 1 col 1 | row 1 col 2  |  |  | |
row 2 col 1 | row 2 col 2  |  |  | |

#### 响应模板


###  查询单词

#### 请求参数

字段名 | 含义 | 类型 | 必需	 | 备注 | 生成规则
---|--- |--- |--- |--- |---
row 1 col 1 | row 1 col 2  |  |  | |
row 2 col 1 | row 2 col 2  |  |  | |

#### 请求模板

#### 响应参数

字段名 | 含义 | 类型 | 必需	 | 备注 | 生成规则
---|--- |--- |--- |--- |---
row 1 col 1 | row 1 col 2  |  |  | |
row 2 col 1 | row 2 col 2  |  |  | |

#### 响应模板


### TODO POST 创建一个用户
### TODO POST 修改一个用户
### TODO POST 通过ID删除一个用户


```
https://www.kancloud.cn/thinkphp/mysql-design-optimalize/39325
{
    "requestUrl":"test",
    "requestType":"GET",
    "responseType":"Multiple",
    "name":"222interfaceName",
    "description":"",
    "isMock":true,
    "developer":"zhongbei.wang",
    "status":"doing",
    "requestParameterList":[
        {
            "identifier":"id",
            "dataType":"Number",
            "name":"",
            "isRequired":false,
            "remark":""
        },
        {
            "identifier":"name",
            "dataType":"String",
            "name":"",
            "isRequired":false,
            "remark":""
        }
    ],
    "responseParameterList":[

    ],
    "responseTemplates":[

    ],
    "resHeader":"",
    "tags":[

    ],
    "requestJson":"",
    "responseJson":"",
    "project_id":"596dd04172dcce6502f6e7c1"
}
```

#### 请求参数

字段名 | 含义 | 类型 | 必需	 | 备注 | 生成规则
---|--- |--- |--- |--- |---
row 1 col 1 | row 1 col 2  |  |  | |
row 2 col 1 | row 2 col 2  |  |  | |

#### 请求模板

#### 响应参数

字段名 | 含义 | 类型 | 必需	 | 备注 | 生成规则
---|--- |--- |--- |--- |---
row 1 col 1 | row 1 col 2  |  |  | |
row 2 col 1 | row 2 col 2  |  |  | |

#### 响应模板

```
create table dictionary(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'ID',
  user_id BIGINT NOT NUll COMMENT '用户ID',
  word VARCHAR(100) NOT NUll COMMENT '单词',
  meaning_list json NOT NULL COMMENT '含义集合',
 `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建时间',
 `updated_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新时间',
  PRIMARY KEY (id),
  key idx_user_id(user_id),
  key idx_word(word),
  UNIQUE KEY `uk_user_id_word` (`user_id`,`word`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='词典';

```

```
{
    "user_id":1,
    "word":"good",
    "meaning_list":[
        {
            "wordClass":"Adjective",
            "english":"good",
            "chinese":"真好",
            "example":"It is good!"
        },
        {
            "wordClass":"Adjective",
            "english":"good",
            "chinese":"真好",
            "example":"It is good!"
        },
        {
            "wordClass":"Adjective",
            "english":"good",
            "chinese":"真好",
            "example":"It is good!"
        }
    ]
}

Noun("n", "名词", 1),
Verb("v", "动词", 2),
Adjective("adj", "形容词", 3),
Adverb("adv", "副词", 4),
Pronoun("pron", "代词", 5),
Preposition("prep", "介词", 6),
Conjunction("conj", "连词", 7),
Determiner("deter", "限定词", 8),
Exclamation("excl", "感叹词", 9);


SCRIPTS_DIR=`dirname "$0"`
PROJECT_DIR=`cd $SCRIPTS_DIR && pwd`
DT=`date +"%Y%m%d_%H%M%S"`

MEM_OPTS="-Xms200m -Xmx200m -Xmn100m"
GC_OPTS="$GC_OPTS -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -XX:CMSInitiatingOccupancyFraction=60 -XX:CMSTriggerRatio=70 -XX:+ParallelRefProcEnabled"
GC_OPTS="$GC_OPTS -Xloggc:${PROJECT_DIR}/logs/gc_${DT}.log"
GC_OPTS="$GC_OPTS -XX:+PrintGCDateStamps -XX:+PrintGCDetails"
GC_OPTS="$GC_OPTS -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=${PROJECT_DIR}/tmp/heapdump_${DT}.hprof"
START_OPTS="$START_OPTS -Djava.io.tmpdir=$PROJECT_DIR/tmp/"
START_OPTS="$START_OPTS -Duser.dir=$PROJECT_DIR"

#run java
mkdir -p "$PROJECT_DIR/tmp/"
mkdir -p "$PROJECT_DIR/logs/"
exec ${JAVA_HOME}/bin/java -server $MEM_OPTS $GC_OPTS $JMX_OPTS $START_OPTS -classpath $CLASS_PATH $MAIN_CLASS

# END OF FILE
```


```
CREATE TABLE future_daily_price (
  `id`                   BIGINT       NOT NULL AUTO_INCREMENT,
  `contract_name`        VARCHAR(50)  NOT NULL COMMENT '合约名称',
  `date`                 datetime     NOT NULL COMMENT '日期yyyy-mm-dd',
  `opening_price`        SMALLINT     NOT NULL COMMENT '开盘价',
  `closing_price`        SMALLINT     NOT NULL COMMENT '收盘价',
  `the_highest_price`    SMALLINT     NOT NULL COMMENT '最高价',
  `the_lowest_price`     SMALLINT     NOT NULL COMMENT '最低价',
  `average_price`        SMALLINT     NOT NULL COMMENT '结算价(日成交均价)',
  `open_interest`        INT          NOT NULL COMMENT '持仓量',
  `volume`               INT          NOT NULL COMMENT '成交量',
  `oc_spread`            SMALLINT     NOT NULL COMMENT '价差(开盘收盘)',
  `hl_spread`            SMALLINT     NOT NULL COMMENT '价差(最高最低)',
  `contract_code`        VARCHAR(10)  NOT NULL COMMENT '合约CODE',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建时间',
  `updated_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新时间',
  PRIMARY KEY (id),
  UNIQUE KEY `unique_key_date_contract` (`date`,`contract_name`)
)
  ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8
  COMMENT = '期货每日价格表';
```