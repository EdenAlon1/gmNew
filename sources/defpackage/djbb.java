package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djbb {
    static final diyy a = dizd.a(182478066);
    public static final ContentType b;
    public static final String c;
    public static final ContentType d;
    public static final String e;
    public static final ContentType f;
    public static final ContentType g;
    public static final ContentType h;
    public static final ContentType i;

    static {
        eifc d2 = ContentType.d();
        d2.f("application");
        d2.e("vnd.google.rcs.encrypted");
        ContentType g2 = d2.g();
        b = g2;
        c = g2.toString();
        eifc d3 = ContentType.d();
        d3.f("application");
        d3.e("vnd.google.rcs.ftd");
        ContentType g3 = d3.g();
        d = g3;
        e = g3.toString();
        eifc d4 = ContentType.d();
        d4.f("application");
        d4.e("vnd.google.rcs.success");
        f = d4.g();
        eifc d5 = ContentType.d();
        d5.f("video");
        d5.e("aliasing");
        g = d5.g();
        eifc d6 = ContentType.d();
        d6.f("video");
        d6.e("key-frame-request");
        h = d6.g();
        eifc d7 = ContentType.d();
        d7.f("video");
        d7.e("ok");
        i = d7.g();
    }

    public static boolean a(ContentType contentType) {
        return ((Boolean) a.a()).booleanValue() ? b.f(contentType) || g.f(contentType) : b(contentType.toString());
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        if (!((Boolean) a.a()).booleanValue()) {
            return c.equals(str) || "video/aliasing".equals(str);
        }
        try {
            return a(ContentType.e(str));
        } catch (IllegalArgumentException unused) {
            dkty.q("Failed to parse MIME type: %s", str);
            return false;
        }
    }

    public static boolean c(ContentType contentType) {
        return ((Boolean) a.a()).booleanValue() ? d.f(contentType) || h.f(contentType) : d(contentType.toString());
    }

    public static boolean d(String str) {
        if (str == null) {
            return false;
        }
        if (!((Boolean) a.a()).booleanValue()) {
            return e.equals(str) || "video/key-frame-request".equals(str);
        }
        try {
            return c(ContentType.e(str));
        } catch (IllegalArgumentException unused) {
            dkty.q("Failed to parse MIME type: %s", str);
            return false;
        }
    }

    public static boolean e(ContentType contentType) {
        return ((Boolean) a.a()).booleanValue() ? f.f(contentType) || i.f(contentType) : f(contentType.toString());
    }

    public static boolean f(String str) {
        if (str == null) {
            return false;
        }
        if (!((Boolean) a.a()).booleanValue()) {
            return "video/ok".equals(str) || "application/vnd.google.rcs.success".equals(str);
        }
        try {
            return e(ContentType.e(str));
        } catch (IllegalArgumentException unused) {
            dkty.q("Failed to parse MIME type: %s", str);
            return false;
        }
    }
}
