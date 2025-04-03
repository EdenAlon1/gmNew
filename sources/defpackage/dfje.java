package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfje {
    public static volatile fedg a;
    private static volatile febs b;
    private static volatile febs c;

    private dfje() {
    }

    public static febs a() {
        febs febsVar;
        febs febsVar2 = b;
        if (febsVar2 != null) {
            return febsVar2;
        }
        synchronized (dfje.class) {
            febsVar = b;
            if (febsVar == null) {
                febp a2 = febs.a();
                a2.c = febr.UNARY;
                a2.d = febs.c("com.google.android.gms.backup.customd2dapi.CustomD2DTargetService", "Handshake");
                a2.b();
                dfjs dfjsVar = dfjs.a;
                eyfc eyfcVar = ffag.a;
                a2.a = new ffae(dfjsVar);
                a2.b = new ffae(dfju.a);
                febsVar = a2.a();
                b = febsVar;
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
        synchronized (dfje.class) {
            febsVar = c;
            if (febsVar == null) {
                febp a2 = febs.a();
                a2.c = febr.UNARY;
                a2.d = febs.c("com.google.android.gms.backup.customd2dapi.CustomD2DTargetService", "RestoreCustomD2DItem");
                a2.b();
                dfkj dfkjVar = dfkj.a;
                eyfc eyfcVar = ffag.a;
                a2.a = new ffae(dfkjVar);
                a2.b = new ffae(dfkl.a);
                febsVar = a2.a();
                c = febsVar;
            }
        }
        return febsVar;
    }
}
