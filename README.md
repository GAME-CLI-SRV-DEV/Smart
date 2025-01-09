# 스마트
![image](https://github.com/user-attachments/assets/05bd93f3-3113-4bca-8477-43e4dfbea612)

![image](https://github.com/user-attachments/assets/b817ae66-faa5-467d-b41f-167ad1ce6ec9)

Paper와 Spigot을 포크한 뒤 스펀지를 추가한 서버 구현체. 

Copyright (C) 2022-2025, Approximaster Studios 2004. All Rights Reversed. Bukkit/Spigot is Licensed Under GPLv3 and it's a Registered Trademark of SpigotMC Pty Ltd and Bukkit Team. and Sponge API is Licensed under MIT and it's a Registered Trademark of SpongePowered.

# 서버 시작
서버를 시작하려면, java -jar ApproximasterSmartServer2004-paperclip-1.21.4-R0.1-SNAPSHOT-Mojmap.jar를 입력하세요. 컴퓨터에 설치한 채로 시작하는 경우, smartstart를 입력하세요. 
```
downloading mojang-1.21.4.jar
Applying patches
Starting org.bukkit.craftbukkit.main...
[14:19:15 INFO]: [bootstrap] Running Java 21 (Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58; Oracle Corporation null) on Windows 10 10.0 (amd64)

똑똑한 서버 모드 로더, 스마트!

Copyright (C) 2022-2025, Approximaster Studios 2004, All Rights Reversed.

SSSSSSS M      M     A     RRRRRRR  TTTTTTT
S       MM    MM  A     A  R      R    T
SSSSSSS M M  M M AAAAAAAAA RRRRRRR     T
      S M   M  M A       A R      R    T
SSSSSSS M      M A       A R      R    T

Loading...

[14:19:16 INFO]: [bootstrap] Loading Smart 1.21.4-DEV-master@XXXXXXX for Minecraft 1.21.4...
[14:19:17 INFO]: [PluginInitializerManager] Initializing plugins...
[14:19:18 INFO]: [PluginInitializerManager] Initialized 3 plugins
[14:19:18 INFO]: [PluginInitializerManager] Bukkit plugins (3):
BukkitPlugin (1.0), SpongePlugin (2.0), SmartModLoader(1.21.4-R0.1-SNAPSHOT)
[14:19:18 INFO]: [PluginInitializerManager] Smart Mods (1):
SmartMod (1.2)
[14:19:18 WARN]: This Server is Based On Bukkit, and we support Sponge/Rainbow Plugins. unfortunately, Sponge/Rainbow Plugin Would have to use plugin.yml, so we can trick the Bukkit API we Loading Bukkit Plugin.
[14:19:18 INFO]: Slimefun is integrated to this project. Put the Slimefun Jar to Override The Version. 
[14:19:22 INFO]: Environment: Environment[sessionHost=https://sessionserver.mojang.com, servicesHost=https://api.minecraftservices.com, name=PROD]
[14:19:23 INFO]: Loaded 1290 recipes
[14:19:23 INFO]: Loaded 1399 advancements
[14:19:26 INFO]: Starting minecraft server version 1.21.4
[14:19:26 INFO]: Loading properties
[14:19:26 INFO]: This server is running Smart Version 1.21.4-DEV/master@XXXXXXX (Implementing Bukkit API version 1.21.4-R0.1-SNAPSHOT)
[14:19:27 INFO]: [spark] This server bundles the spark profiler. For more information please visit https://docs.papermc.io/paper/profiling.
[14:19:27 INFO]: Server Ping Player Sample Count: 12
[14:19:27 INFO]: Using 4 threads for Netty based IO
[14:19:28 INFO]: [ChunkTaskScheduler] Chunk system is using 1 I/O threads, 1 worker threads, and population gen parallelism of 1 threads
[14:19:28 INFO]: Default game type: SURVIVAL
[14:19:28 INFO]: Generating keypair
[14:19:28 INFO]: Starting Minecraft server on *:25566
[14:19:28 INFO]: Using default channel type
[14:19:28 INFO]: Paper: Using Java compression from Velocity.
[14:19:28 INFO]: Paper: Using Java cipher from Velocity.
[14:19:29 INFO]: [BukkitPlugin] Loading BukkitPlugin v1.0
[14:19:29 INFO]: Hello!
[14:19:29 INFO]: [SpongePlugin] Loading SpongePlugin v2.0
[14:19:29 INFO]: Hi!
[14:19:29 INFO]: Loading Slimefun Library...
[14:19:29 INFO]: Smart is Loading
[14:19:29 ERROR]: [dough: skins] Failed to detect skull nbt methods
java.lang.NoSuchMethodException: net.minecraft.world.level.block.entity.TileEntitySkull.a(com.mojang.authlib.GameProfile)
	at java.base/java.lang.Class.getMethod(Class.java:2395) ~[?:?]
	at Slimefun4-Dev (1).jar/io.github.thebusybiscuit.slimefun4.libraries.dough.skins.nms.PlayerHeadAdapter18.<init>(PlayerHeadAdapter18.java:23) ~[Slimefun4-Dev (1).jar:?]
	at Slimefun4-Dev (1).jar/io.github.thebusybiscuit.slimefun4.libraries.dough.skins.nms.PlayerHeadAdapter.get(PlayerHeadAdapter.java:31) ~[Slimefun4-Dev (1).jar:?]
	at Slimefun4-Dev (1).jar/io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead.<clinit>(PlayerHead.java:23) ~[Slimefun4-Dev (1).jar:?]
	at Slimefun4-Dev (1).jar/io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils.getCustomHead(SlimefunUtils.java:246) ~[Slimefun4-Dev (1).jar:?]
	at Slimefun4-Dev (1).jar/io.github.thebusybiscuit.slimefun4.core.services.localization.Language.<init>(Language.java:52) ~[Slimefun4-Dev (1).jar:?]
	at Slimefun4-Dev (1).jar/io.github.thebusybiscuit.slimefun4.core.services.LocalizationService.<init>(LocalizationService.java:67) ~[Slimefun4-Dev (1).jar:?]
	at Slimefun4-Dev (1).jar/io.github.thebusybiscuit.slimefun4.implementation.Slimefun.onPluginStart(Slimefun.java:300) ~[Slimefun4-Dev (1).jar:?]
	at Slimefun4-Dev (1).jar/io.github.thebusybiscuit.slimefun4.implementation.Slimefun.onEnable(Slimefun.java:241) ~[Slimefun4-Dev (1).jar:?]
	at org.bukkit.plugin.java.JavaPlugin.setEnabled(JavaPlugin.java:287) ~[plazma-api-1.20.6-R0.1-SNAPSHOT.jar:?]
	at io.papermc.paper.plugin.manager.PaperPluginInstanceManager.enablePlugin(PaperPluginInstanceManager.java:202) ~[plazma-1.20.6.jar:1.20.6-DEV-c531844]
	at io.papermc.paper.plugin.manager.PaperPluginManagerImpl.enablePlugin(PaperPluginManagerImpl.java:109) ~[plazma-1.20.6.jar:1.20.6-DEV-c531844]
	at org.bukkit.plugin.SimplePluginManager.enablePlugin(SimplePluginManager.java:519) ~[plazma-api-1.20.6-R0.1-SNAPSHOT.jar:?]
	at org.bukkit.craftbukkit.CraftServer.enablePlugin(CraftServer.java:630) ~[?:?]
	at org.bukkit.craftbukkit.CraftServer.enablePlugins(CraftServer.java:579) ~[?:?]
	at net.minecraft.server.MinecraftServer.loadWorld0(MinecraftServer.java:685) ~[plazma-1.20.6.jar:1.20.6-DEV-c531844]
	at net.minecraft.server.MinecraftServer.loadLevel(MinecraftServer.java:447) ~[plazma-1.20.6.jar:1.20.6-DEV-c531844]
	at net.minecraft.server.dedicated.DedicatedServer.initServer(DedicatedServer.java:366) ~[plazma-1.20.6.jar:1.20.6-DEV-c531844]
	at net.minecraft.server.MinecraftServer.runServer(MinecraftServer.java:1158) ~[plazma-1.20.6.jar:1.20.6-DEV-c531844]
	at net.minecraft.server.MinecraftServer.lambda$spin$0(MinecraftServer.java:332) ~[plazma-1.20.6.jar:1.20.6-DEV-c531844]
	at java.base/java.lang.Thread.run(Thread.java:1583) ~[?:?]
[14:19:29 INFO]: Environment: Environment[sessionHost=https://sessionserver.mojang.com, servicesHost=https://api.minecraftservices.com, name=PROD]
[14:19:29 INFO]: [Slimefun] Loaded language "ko"
[14:19:29 INFO]: [Slimefun] Available languages: en, de, fr, it, es, ru, pl, uk, sv, nl, da, cs, ro, bg, pt, pt-BR, hu, lv, sk, vi, id, zh-CN, zh-TW, ja, ko, he, ar, tr, fa, th, tl
[14:19:29 INFO]: [Slimefun] Using legacy storage for player data
[14:19:29 INFO]: [Slimefun] Enabled Analytics Service
[14:19:29 INFO]: [Slimefun] Starting Auto-Updater...
[14:19:29 INFO]: [Slimefun] Loading GEO-Resources...
[14:19:29/INFO]: [Slimefun] MetricsModule does not exist, downloading...
[14:19:29 INFO]: [Slimefun] Loading Tags...
[14:19:29 INFO]: [Slimefun] Loading items...
[14:19:29 INFO]: [Slimefun] # Starting download of MetricsModule build: #29
[14:19:29 WARN]: [Slimefun] Failed to start metrics as the file could not be downloaded.
[14:19:29 INFO]: [Slimefun] Loading researches...
[14:19:29 INFO]: [Slimefun] Loading Wiki pages...
[14:19:29 INFO]: [Slimefun] Registering listeners...
[14:19:29 INFO]: [Slimefun] Loading Third-Party plugin integrations...
[14:19:29 INFO]: [Slimefun] Hooked into Plugin: WorldEdit v7.3.3+6788-6359df8
[14:19:29 INFO]: [Slimefun] Slimefun has finished loading in 1.19s
.
.
.
.
.
[14:19:37 INFO]: Preparing level "world"
[14:19:37 INFO]: Preparing start region for dimension minecraft:overworld
[14:19:37 INFO]: Time elapsed: 679 ms
[14:19:37 INFO]: Preparing start region for dimension minecraft:the_nether
[14:19:37 INFO]: Time elapsed: 165 ms
[14:19:37 INFO]: Preparing start region for dimension minecraft:the_end
[14:19:38 INFO]: Time elapsed: 159 ms
.
.
.
.
.
[14:19:37 INFO]: [Slimefun] Collecting Snapshots of all Recipes...
[14:19:37 INFO]: [Slimefun] Found 1,175 Recipes!
[14:19:37 INFO]: 
[14:19:37 INFO]: ######################### - Slimefun vDev - 1149 - #########################
[14:19:37 INFO]: 
[14:19:37 INFO]: Successfully loaded 557 Items and 259 Researches
[14:19:37 INFO]: ( 555 Items from Slimefun, 2 Items from 1 Addons )
[14:19:37 INFO]: 
[14:19:37 INFO]: Slimefun is an Open-Source project that is kept alive by a large community.
[14:19:37 INFO]: Consider helping us maintain this project by contributing on GitHub!
[14:19:37 INFO]: 
[14:19:37 INFO]:  - Source Code:  https://github.com/Slimefun/Slimefun4
[14:19:37 INFO]:  - Wiki:         https://github.com/Slimefun/Slimefun4/wiki
[14:19:37 INFO]:  - Addons:       https://github.com/Slimefun/Slimefun4/wiki/Addons
[14:19:37 INFO]:  - Bug Reports:  https://github.com/Slimefun/Slimefun4/issues
[14:19:37 INFO]:  - Discord:      https://discord.gg/slimefun
[14:19:37 INFO]: 
[14:19:37 INFO]: [Slimefun] Loading Blocks for World "world"
[14:19:37 INFO]: [Slimefun] This may take a long time...
[14:19:37 INFO]: [Slimefun] Loading Blocks... 100% (FINISHED - 3ms)
[14:19:37 INFO]: [Slimefun] Loaded a total of 113 Blocks for World "world"
[14:19:37 INFO]: [Slimefun] Avg: 0.03ms/Block
[14:19:37 INFO]: [Slimefun] Loading Blocks for World "world_nether"
[14:19:37 INFO]: [Slimefun] This may take a long time...
[14:19:37 INFO]: [Slimefun] Loading Blocks... 100% (FINISHED - 0ms)
[14:19:37 INFO]: [Slimefun] Loaded a total of 0 Blocks for World "world_nether"
[14:19:37 INFO]: [Slimefun] Loading Blocks for World "world_the_end"
[14:19:37 INFO]: [Slimefun] This may take a long time...
[14:19:37 INFO]: [Slimefun] Loading Blocks... 100% (FINISHED - 0ms)
[14:19:37 INFO]: [Slimefun] Loaded a total of 0 Blocks for World "world_the_end"
[14:19:37 INFO]: [dough: protection] Loading Protection Modules...
[14:19:37 INFO]: [dough: protection] This may happen more than once.
.
.
.
[14:19:37 INFO]: 라이브러리를 성공적으로 로딩하였습니다. API 실행 중...
[14:19:37 INFO]: SmartModLoaderAPI is Loading...
[14:19:37 INFO]: SmartModLoaderAPI: Loading Mod: SmartMod 1.2
[14:19:37 INFO]: [com.ddnsgeek.approximasterstudios2004.server.SmartModLoader.main] Loading SmartMod v1.2
[14:19:37 INFO]: [com.ddnsgeek.approximasterstudios2004.server.SmartModLoader.api.ClassMod.Legacy] Alert: WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING
[14:19:37 INFO]: [com.ddnsgeek.approximasterstudios2004.server.SmartModLoader.api.ClassMod.Legacy] Alert: Smart 모드 SmartMod는 몹을 추가하는데 Craftbukkit/NMS에 액세스하였습니다. Smart 모드는 MysticMob 통합 API를 사용해야만 합니다.
[14:19:37 INFO]: [com.ddnsgeek.approximasterstudios2004.server.SmartModLoader.api.ClassMod.Legacy] Alert: Smart 모드 SmartMod는 아이템을 추가하는데 Bukkit의 ItemStack/CraftItemStack을 사용했습니다. Smart 모드는 Slimefun의 ItemStack을 사용하여야만 합니다.
[14:19:37 INFO]: [com.ddnsgeek.approximasterstudios2004.server.SmartModLoader.api.ClassMod.Legacy] Alert: 따라서 해당 모드는 SmartModPlugin을 Implement하나 Bukkit 플러그인으로 분류합니다. Bukkit 플러그인 상태의 Smart 모드는 일부 기능이 작동하지 않습니다.
[14:19:37 INFO]: Smart가 성공적으로 시작되었습니다.
[14:19:37 INFO]: Done! (X.xxs) Type "help" for help.
smart
[14:19:40 INFO] smartmodloader version 1.21.4-R0.1-SNAPSHOT
Copyright (C) 2025-2024 Approximaster Studios 2004. All Rights Reversed.
Some Features of Bukkit API is Deprecated.
```
라이브러리 로딩/시작에 성공했을 시에는\
초록색으로 라이브러리를 성공적으로 로딩하였습니다. API 실행 중\
문구가 출력되지만,
일부 라이브러리가 로딩/시작했을 시에는\
노란색으로 라이브러리를 성공적으로 로딩하였지만. 일부분 시작되었습니다. (모드 기능 일부 제한으로 실행 중)\
아예 시작에 실패한 경우,
빨간색으로 라이브러리를 시작할 수 없습니다! 모드로더가 종료됩니다...\
문구가 출력됩니다. 완전 시작에 실패한 경우에는, 스마트모드로더가 기능하지 않으며 버킷, 스펀지 플러그인만 구동가능합니다. 



# 스마트 역대 로고 변천사
![image](https://github.com/user-attachments/assets/365c5f27-fc6d-4fbe-b7aa-cf2eabcdf5db)\
2B2T에이이앤비이 서버버킷부문 버킷X(폐지: 2022년 5월)\
게임앤클라이언트 녹양스피곳(녹양중학교 교표를 로고로 사용, 폐지: 2024년 5월)\
![image](https://github.com/user-attachments/assets/fb5d0028-5b14-4d14-b423-c6a5789fd5cf)\
게임앤클라이언트 라디오액티브 -> 게임앤클라이언트 상상 -> 아프록시마스터 스튜디오 상상(폐지: 2024년 11월 개발 중단, 2025년 브랜드 폐지)

