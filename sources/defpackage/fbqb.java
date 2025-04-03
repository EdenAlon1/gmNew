package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbqb {
    public static volatile febs a;
    public static volatile febs b;
    public static volatile febs c;
    public static volatile febs d;
    public static volatile febs e;
    public static volatile febs f;
    public static volatile febs g;
    public static volatile febs h;
    public static volatile febs i;
    public static volatile febs j;
    public static volatile febs k;
    public static volatile febs l;
    public static volatile febs m;
    private static volatile febs n;

    private fbqb() {
    }

    public static fbqa a(fdxk fdxkVar) {
        return (fbqa) fbqa.h(new fbpz(), fdxkVar);
    }

    public static febs b() {
        febs febsVar;
        febs febsVar2 = n;
        if (febsVar2 != null) {
            return febsVar2;
        }
        synchronized (fbqb.class) {
            febsVar = n;
            if (febsVar == null) {
                febp a2 = febs.a();
                a2.c = febr.UNARY;
                a2.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "LookupRegistered");
                a2.b();
                fcad fcadVar = fcad.a;
                eyfc eyfcVar = ffag.a;
                a2.a = new ffae(fcadVar);
                a2.b = new ffae(fcaf.a);
                febsVar = a2.a();
                n = febsVar;
            }
        }
        return febsVar;
    }
}
