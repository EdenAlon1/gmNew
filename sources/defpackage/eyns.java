package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyns extends eyfy implements eyht {
    public static final eyns a;
    private static volatile eyhz f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        eyns eynsVar = new eyns();
        a = eynsVar;
        eyfy.registerDefaultInstance(eyns.class, eynsVar);
    }

    private eyns() {
    }

    public static /* synthetic */ void a(eyns eynsVar) {
        eynsVar.c = 4;
        eynsVar.d = true;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004:\u0000\u0005ဈ\u0000\u0006<\u0000", new Object[]{"d", "c", "b", eynn.class, eynr.class, "e", eynp.class});
        }
        if (ordinal == 3) {
            return new eyns();
        }
        if (ordinal == 4) {
            return new eynl();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyns.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
