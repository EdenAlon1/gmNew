package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewjj {
    public static volatile febs a;
    public static volatile febs b;
    public static volatile febs c;
    public static volatile febs d;
    public static volatile febs e;
    public static volatile febs f;
    public static volatile febs g;
    public static volatile febs h;
    public static volatile febs i;
    private static volatile febs j;

    private ewjj() {
    }

    public static ewji a(fdxk fdxkVar) {
        return (ewji) ewji.h(new ewjh(), fdxkVar);
    }

    public static febs b() {
        febs febsVar;
        febs febsVar2 = j;
        if (febsVar2 != null) {
            return febsVar2;
        }
        synchronized (ewjj.class) {
            febsVar = j;
            if (febsVar == null) {
                febp a2 = febs.a();
                a2.c = febr.UNARY;
                a2.d = febs.c("google.internal.contactsui.v1.CustardService", "GetProfilePhotoState");
                a2.b();
                ewkb ewkbVar = ewkb.a;
                eyfc eyfcVar = ffag.a;
                a2.a = new ffae(ewkbVar);
                a2.b = new ffae(ewkh.a);
                febsVar = a2.a();
                j = febsVar;
            }
        }
        return febsVar;
    }
}
