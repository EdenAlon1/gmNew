package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chjp {
    public static final cfup a = cfvl.h(cfvl.b, "tachyon_cms_environment", "prod");

    public static String a() {
        char c;
        if (!csjc.e()) {
            return "instantmessaging-pa-us.googleapis.com";
        }
        String str = (String) a.e();
        int hashCode = str.hashCode();
        if (hashCode != -1897523141) {
            if (hashCode == 1439571273 && str.equals("autopush")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("staging")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? "instantmessaging-pa-us.googleapis.com" : "instantmessaging-staging-rcs-us-pa.sandbox.googleapis.com" : "instantmessaging-autopush-rcs-pa.sandbox.googleapis.com";
    }
}
