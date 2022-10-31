package cn.vorbote.messagesendersample.controllers;

import cn.vorbote.message.sender.tencent.TencentSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DemoController<br>
 * Created at 31/10/2022 17:43
 *
 * @author theod
 */
@Slf4j
@RestController
public class DemoController {

    private final TencentSender tencentSender;

    @Autowired
    public DemoController(TencentSender tencentSender) {
        this.tencentSender = tencentSender;
    }

    @GetMapping("/demo")
    public Map<String, Object> hello() {
        log.info("Bean [tencentSender] exist? {}", tencentSender != null);
        log.info("Type of bean [tencentSender] is {}", tencentSender.getClass());

        return new HashMap<>() {{
            put("code", 200);
            put("message", "Hello!");
        }};
    }

}
