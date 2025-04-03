package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pga {
    public static final pey a;
    public static final pfa b;
    public static final pey c;
    public static final pey d;
    public static final pfa e;
    public static final pfe f;
    public static final pfa g;
    public static final pfa h;

    static {
        new pey("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        new pey("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        new pfb("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        new pez("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        new pfc("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        new pfc("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        new pfc("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        new pfc("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        new pfc("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        new pfc("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        new pez("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        new pez("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        new pez("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        new pez("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        new pez("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        new pez("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        new pey("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        new pey("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        new pez("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        new pfc("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        new pez("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        new pey("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        new pey("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        new pfc("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        new pfc("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        new pfc("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        a = new pey("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        new pey("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        b = new pfa("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        c = new pey("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        new pey("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        d = new pey("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        new pey("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        new pfb("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        new pfb("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        new pfe("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        new pfe("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        new pfd();
        new pfo();
        new pfn();
        new pfn();
        new pfe("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        new pfx();
        new pfa("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        e = new pfa("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        f = new pfe("FORCE_DARK", "FORCE_DARK");
        g = new pfa("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        h = new pfa("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        new pfa("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        new pfa("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        new pfa("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        new pfa("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        new pfa("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        new pfa("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        new pfa("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        new pfy();
        new pfa("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        new pfa("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        new pfa("MUTE_AUDIO", "MUTE_AUDIO");
        new pfa("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        new pfa("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
        new pfa("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
        new pfa("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");
        new pfz();
        new pfa("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");
        new pfa("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");
        new pfa("PRERENDER_URL_V2", "PRERENDER_URL_V2");
        new pfa("SPECULATIVE_LOADING_CONFIG", "SPECULATIVE_LOADING_CONFIG");
    }

    public static boolean a(String str) {
        Set<pfj> unmodifiableSet = DesugarCollections.unmodifiableSet(pfg.a);
        HashSet hashSet = new HashSet();
        for (pfj pfjVar : unmodifiableSet) {
            if (pfjVar.b().equals(str)) {
                hashSet.add(pfjVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((pfj) it.next()).c()) {
                return true;
            }
        }
        return false;
    }
}
