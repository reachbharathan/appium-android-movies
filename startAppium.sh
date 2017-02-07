#!/usr/bin/env bash
appium --address "127.0.0.1" --session-override --pre-launch --debug-log-spacing --default-capabilities '{"platformName":"Android","platformVersion":"5.1","automationName":"Appium","deviceName":"Nexus_5_API_22","app":"src/test/resources/BitbarSampleApp.apk"}'
