package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfao {
    public final Context a;
    private final dfan b;

    public dfao(Context context) {
        dfan dfanVar = new dfan();
        this.a = context;
        this.b = dfanVar;
    }

    public static String a(String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        String str = strArr[0];
        try {
            URL url = new URL(str);
            builder.appendQueryParameter("url", url.getProtocol() + "://" + url.getHost());
            return "weblogin:".concat(String.valueOf(builder.build().getQuery()));
        } catch (MalformedURLException unused) {
            throw new IllegalArgumentException("Invalid URL: ".concat(String.valueOf(str)));
        }
    }

    public final void b(List list) {
        Set cmjVar;
        String str;
        int size = list.size();
        int i = 128;
        if (size == 0) {
            cmjVar = new cmj();
        } else {
            cmjVar = size <= 128 ? new cmj(size) : new HashSet(size, 0.75f);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dfhz dfhzVar = (dfhz) it.next();
            String str2 = !dfhzVar.f.isEmpty() ? dfhzVar.f : dfhzVar.e;
            if (TextUtils.isEmpty(str2) || dfhzVar.c.isEmpty() || dfhzVar.d.isEmpty()) {
                Log.w("WebLoginHelper", "Invalid cookie.");
            } else {
                Boolean valueOf = (dfhzVar.b & 32) != 0 ? Boolean.valueOf(dfhzVar.h) : null;
                dfwv.l(str2);
                String str3 = (true != dezm.a(valueOf) ? "http" : "https") + "://" + str2;
                String str4 = dfhzVar.c;
                String str5 = dfhzVar.d;
                String str6 = dfhzVar.e;
                String str7 = dfhzVar.g;
                Boolean valueOf2 = (dfhzVar.b & 64) != 0 ? Boolean.valueOf(dfhzVar.i) : null;
                Boolean valueOf3 = (dfhzVar.b & 32) != 0 ? Boolean.valueOf(dfhzVar.h) : null;
                Long valueOf4 = (dfhzVar.b & i) != 0 ? Long.valueOf(dfhzVar.j) : null;
                int i2 = dfhzVar.b;
                if ((i2 & 256) != 0) {
                    int a = dfhy.a(dfhzVar.k);
                    str = (a == 0 || a == 1) ? "UNKNOWN_PRIORITY" : a != 2 ? a != 3 ? "HIGH" : "MEDIUM" : "LOW";
                } else {
                    str = null;
                }
                String str8 = (i2 & 512) != 0 ? dfhzVar.l : null;
                boolean z = ((i2 & 1024) == 0 || dfhzVar.m.isEmpty()) ? false : true;
                if (str4 == null) {
                    str4 = "";
                }
                Boolean valueOf5 = Boolean.valueOf(z);
                StringBuilder sb = new StringBuilder(str4);
                sb.append('=');
                if (!TextUtils.isEmpty(str5)) {
                    sb.append(str5);
                }
                if (dezm.a(valueOf2)) {
                    sb.append(";HttpOnly");
                }
                if (dezm.a(valueOf3)) {
                    sb.append(";Secure");
                }
                if (!TextUtils.isEmpty(str6)) {
                    sb.append(";Domain=");
                    sb.append(str6);
                }
                if (!TextUtils.isEmpty(str7)) {
                    sb.append(";Path=");
                    sb.append(str7);
                }
                if (valueOf4 != null && valueOf4.longValue() > 0) {
                    sb.append(";Max-Age=");
                    sb.append(valueOf4);
                }
                if (!TextUtils.isEmpty(str)) {
                    sb.append(";Priority=");
                    sb.append(str);
                }
                if (!TextUtils.isEmpty(str8)) {
                    sb.append(";SameSite=");
                    sb.append(str8);
                }
                if (dezm.a(valueOf5)) {
                    sb.append(";SameParty");
                }
                String sb2 = sb.toString();
                Log.d("WebLoginHelper", "Setting cookie for url: ".concat(str3));
                this.b.a.setCookie(str3, sb2);
                cmjVar.add(str3);
            }
            i = 128;
        }
    }
}
