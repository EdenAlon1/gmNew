package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfjb {
    public static volatile fedg a;
    private static volatile febs b;
    private static volatile febs c;
    private static volatile febs d;

    private dfjb() {
    }

    public static febs a() {
        febs febsVar;
        febs febsVar2 = d;
        if (febsVar2 != null) {
            return febsVar2;
        }
        synchronized (dfjb.class) {
            febsVar = d;
            if (febsVar == null) {
                febp a2 = febs.a();
                a2.c = febr.UNARY;
                a2.d = febs.c("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", "GetCustomD2DItem");
                a2.b();
                dfjg dfjgVar = dfjg.a;
                eyfc eyfcVar = ffag.a;
                a2.a = new ffae(dfjgVar);
                a2.b = new ffae(dfji.a);
                febsVar = a2.a();
                d = febsVar;
            }
        }
        return febsVar;
    }

    public static febs b() {
        febs febsVar;
        febs febsVar2 = c;
        if (febsVar2 != null) {
            return febsVar2;
        }
        synchronized (dfjb.class) {
            febsVar = c;
            if (febsVar == null) {
                febp a2 = febs.a();
                a2.c = febr.UNARY;
                a2.d = febs.c("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", "GetMetadata");
                a2.b();
                dfjk dfjkVar = dfjk.a;
                eyfc eyfcVar = ffag.a;
                a2.a = new ffae(dfjkVar);
                a2.b = new ffae(dfjm.a);
                febsVar = a2.a();
                c = febsVar;
            }
        }
        return febsVar;
    }

    public static febs c() {
        febs febsVar;
        febs febsVar2 = b;
        if (febsVar2 != null) {
            return febsVar2;
        }
        synchronized (dfjb.class) {
            febsVar = b;
            if (febsVar == null) {
                febp a2 = febs.a();
                a2.c = febr.UNARY;
                a2.d = febs.c("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", "Handshake");
                a2.b();
                dfjo dfjoVar = dfjo.a;
                eyfc eyfcVar = ffag.a;
                a2.a = new ffae(dfjoVar);
                a2.b = new ffae(dfjq.a);
                febsVar = a2.a();
                b = febsVar;
            }
        }
        return febsVar;
    }
}
