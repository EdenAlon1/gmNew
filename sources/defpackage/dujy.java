package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dujy {
    private static volatile dujy a;
    private final dukh b;
    private final CookieManager c;

    public dujy(dukh dukhVar) {
        CookieManager cookieManager = new CookieManager();
        this.c = cookieManager;
        this.b = dukhVar;
        String string = dukhVar.a.getString("SET_COOKIE_URI", "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            cookieManager.put(new URI(string), Collections.singletonMap("Set-Cookie", new ArrayList(dukhVar.a.getStringSet("SET_COOKIE_VALUE", Collections.EMPTY_SET))));
        } catch (IOException | URISyntaxException e) {
            Log.e("HatsCookieManager", "Failed to restore cookies from persistence.", e);
        }
    }

    public static dujy a(Context context) {
        if (a == null) {
            synchronized (dujy.class) {
                if (a == null) {
                    a = new dujy(dukh.a(context));
                }
            }
        }
        return a;
    }

    public final String b(String str) {
        try {
            for (Map.Entry<String, List<String>> entry : this.c.get(new URI(str), Collections.EMPTY_MAP).entrySet()) {
                if ("Cookie".equalsIgnoreCase(entry.getKey())) {
                    return TextUtils.join(";", entry.getValue());
                }
            }
            return "";
        } catch (IOException | URISyntaxException e) {
            Log.e("HatsCookieManager", "Failed to get cookies", e);
            return "";
        }
    }

    public final void c(String str, Map map) {
        try {
            this.c.put(new URI(str), map);
            for (Map.Entry entry : map.entrySet()) {
                if ("Set-Cookie".equalsIgnoreCase((String) entry.getKey())) {
                    this.b.a.edit().putString("SET_COOKIE_URI", str).putStringSet("SET_COOKIE_VALUE", new HashSet((List) entry.getValue())).apply();
                    return;
                }
            }
        } catch (IOException | URISyntaxException e) {
            Log.e("HatsCookieManager", "Failed to store cookies", e);
        }
    }
}
