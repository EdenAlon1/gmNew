package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depv {
    public static volatile fedg a;
    private static volatile febs b;
    private static volatile febs c;

    private depv() {
    }

    public static febs a() {
        febs febsVar;
        febs febsVar2 = b;
        if (febsVar2 != null) {
            return febsVar2;
        }
        synchronized (depv.class) {
            febsVar = b;
            if (febsVar == null) {
                febp a2 = febs.a();
                a2.c = febr.UNARY;
                a2.d = febs.c("stargate.DatagramNotificationService", "OnDatagramSent");
                a2.b();
                deqo deqoVar = deqo.a;
                eyfc eyfcVar = ffag.a;
                a2.a = new ffae(deqoVar);
                a2.b = new ffae(deqq.a);
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
        synchronized (depv.class) {
            febsVar = c;
            if (febsVar == null) {
                febp a2 = febs.a();
                a2.c = febr.UNARY;
                a2.d = febs.c("stargate.DatagramNotificationService", "OnReceiveDatagram");
                a2.b();
                deqs deqsVar = deqs.a;
                eyfc eyfcVar = ffag.a;
                a2.a = new ffae(deqsVar);
                a2.b = new ffae(dequ.a);
                febsVar = a2.a();
                c = febsVar;
            }
        }
        return febsVar;
    }
}
