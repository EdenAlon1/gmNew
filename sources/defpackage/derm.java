package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class derm {
    public static volatile fedg a;
    private static volatile febs b;

    private derm() {
    }

    public static febs a() {
        febs febsVar;
        febs febsVar2 = b;
        if (febsVar2 != null) {
            return febsVar2;
        }
        synchronized (derm.class) {
            febsVar = b;
            if (febsVar == null) {
                febp a2 = febs.a();
                a2.c = febr.UNARY;
                a2.d = febs.c("stargate.SatelliteSessionStateNotificationService", "OnSatelliteSessionStateChanged");
                a2.b();
                deqw deqwVar = deqw.a;
                eyfc eyfcVar = ffag.a;
                a2.a = new ffae(deqwVar);
                a2.b = new ffae(deqy.a);
                febsVar = a2.a();
                b = febsVar;
            }
        }
        return febsVar;
    }
}
