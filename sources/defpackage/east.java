package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class east {
    private static final entd a = entd.c("GnpSdk");

    public static easr g() {
        easr easrVar = new easr();
        easrVar.a = (byte) (easrVar.a | 12);
        return easrVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final String h() {
        String c = c();
        if (c.startsWith("//")) {
            c = "https:".concat(String.valueOf(c));
        }
        String str = c;
        boolean startsWith = str.startsWith("https://www.gstatic.com/gnp_");
        if (eera.a(str) || startsWith) {
            int b = b() == -1 ? -1 : b();
            int a2 = a() != -1 ? a() : -1;
            if (!startsWith) {
                int i = eeqy.a;
                String b2 = eera.b(str, 0, b, a2);
                if (b2 != null) {
                    return b2;
                }
                if (b == 0) {
                    if (a2 != 0) {
                        b = 0;
                    }
                }
                return eerb.a(b, a2, str);
            }
            dulo duloVar = new dulo();
            duloVar.a.d(eycx.WIDTH, Integer.valueOf(b));
            duloVar.a.c(eycx.WIDTH);
            duloVar.a.d(eycx.HEIGHT, Integer.valueOf(a2));
            duloVar.a.c(eycx.HEIGHT);
            try {
                try {
                    dulm dulmVar = new dulm(Uri.parse(str));
                    boolean z = true;
                    emxf.b(true, "options is null");
                    emxf.b(true, "url is null");
                    if (dulmVar.a() == null) {
                        z = false;
                    }
                    emxf.b(z, "url path is null");
                    String a3 = dulmVar.a();
                    if (a3.contains("=")) {
                        throw new eycr("url path cannot already contain =");
                    }
                    String c2 = eyct.c("", duloVar.a(), false);
                    if (!c2.isEmpty()) {
                        a3 = eyct.c.g(a3, c2, new Object[0]);
                    }
                    return dulmVar.b(a3).a.toString();
                } catch (eycr e) {
                    throw new duln(e);
                }
            } catch (duln e2) {
                ((ensz) ((ensz) ((ensz) a.j()).g(e2)).h("com/google/android/libraries/notifications/platform/media/GnpMedia", "getDownloadUrl", ']', "GnpMedia.java")).q("SCS options could not be added. Using raw url.");
                return str;
            }
        }
        return str;
    }
}
