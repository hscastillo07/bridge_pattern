package org.bridge_pattern.controller;

import org.bridge_pattern.service.BridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/config")
public class BridgeController {

    private final BridgeService bridgeService;

    @Autowired
    public BridgeController(BridgeService bridgeService) {
        this.bridgeService = bridgeService;
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/web/json")
    public String getWebJsonConfig() {
        return bridgeService.generateWebConfigJson();
    }

    @GetMapping("/mobile/yaml")
    public String getMobileYamlConfig() {
        return bridgeService.generateMobileConfigYaml();
    }

    @GetMapping("/desktop/xml")
    public String getDesktopXmlConfig() {
        return bridgeService.generateDesktopConfigXml();
    }

    @GetMapping("/generate")
    public String generateConfig(@RequestParam String appType, @RequestParam String formatType) {
        return bridgeService.generateConfig(appType, formatType);
    }
}
