package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbov {
    public static volatile febs a;
    public static volatile febs b;
    public static volatile febs c;
    public static volatile febs d;
    public static volatile febs e;
    public static volatile febs f;
    public static volatile febs g;
    private static volatile febs h;

    private fbov() {
    }

    public static fbot a(fdxk fdxkVar) {
        return (fbot) fbot.h(new fbos(), fdxkVar);
    }

    public static fbou b(fdxk fdxkVar) {
        return new fbou(fdxkVar, fdxj.a.f(ffat.a, ffar.ASYNC));
    }

    public static febs c() {
        febs febsVar;
        febs febsVar2 = h;
        if (febsVar2 != null) {
            return febsVar2;
        }
        synchronized (fbov.class) {
            febsVar = h;
            if (febsVar == null) {
                febp a2 = febs.a();
                a2.c = febr.UNARY;
                a2.d = febs.c("google.internal.communications.instantmessaging.v1.Messaging", "SendMessage");
                a2.b();
                fbzv fbzvVar = fbzv.a;
                eyfc eyfcVar = ffag.a;
                a2.a = new ffae(fbzvVar);
                a2.b = new ffae(fbzx.a);
                febsVar = a2.a();
                h = febsVar;
            }
        }
        return febsVar;
    }
}
