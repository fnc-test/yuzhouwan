package com.yuzhouwan.hacker.json.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


/**
 * Copyright @ 2023 yuzhouwan.com
 * All right reserved.
 * Function：JSON Parse Benchmark
 *
 * @author Benedict Jin
 * @since 2018/7/30
 */
@State(Scope.Thread)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(Mode.AverageTime)
public class JSONParseBenchmark {

    @Param({"{\"data\":[],\"error\":\"\",\"msg\":\"正常\",\"statusCode\":\"0\",\"total\":0}",
            "{\"data\":[{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"}],\"error\":\"\",\"msg\":\"正常\",\"statusCode\":\"0\",\"total\":1}",
            "{\"data\":[{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"},{\"gds_cd\":\"10000007680\",\"brand_cd\":\"00015599D\",\"gen_gds_cd\":\"10000007657\"}],\"error\":\"\",\"msg\":\"正常\",\"statusCode\":\"0\",\"total\":200}"})
    private String str;

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(JSONParseBenchmark.class.getSimpleName())
                .forks(1)
                .warmupIterations(1)
                .measurementIterations(3)
                .threads(1)
                .build();
        new Runner(opt).run();
    }

    @Setup
    public void setUp() {
        // do nothing
    }

    @Benchmark
    public void parseObject() {
        JSONObject obj = JSON.parseObject(str);
        JSONArray data = JSON.parseArray(obj.get("data").toString());
        for (Object d : data) {
            JSONObject parseObject = JSON.parseObject(d.toString());
            Object gdsCd = parseObject.get("gds_cd");
            if (!"10000007680".equals(gdsCd)) {
                throw new RuntimeException("error in parseObject");
            }
        }
    }

    @Benchmark
    public void parseClass() {
        Result obj = JSON.parseObject(str, Result.class);
        List<Map<String, Object>> data = obj.getData();
        for (Map<String, Object> datum : data) {
            Object gdsCd = datum.get("gds_cd");
            if (!"10000007680".equals(gdsCd)) {
                throw new RuntimeException("error in parseClass");
            }
        }
    }

    /*
    Benchmark                            Mode  Cnt   Score    Error  Units
    JSONParseBenchmark.parseClass   0    avgt    3  ≈ 10⁻³           ms/op
    JSONParseBenchmark.parseClass   1    avgt    3   0.001 ±  0.001  ms/op
    JSONParseBenchmark.parseClass   200  avgt    3   0.152 ±  0.296  ms/op
    JSONParseBenchmark.parseObject  0    avgt    3   0.001 ±  0.001  ms/op
    JSONParseBenchmark.parseObject  1    avgt    3   0.003 ±  0.004  ms/op
    JSONParseBenchmark.parseObject  200  avgt    3   0.440 ±  0.295  ms/op
    */
    @TearDown
    public void tearDown() {
        // do nothing
    }
}
