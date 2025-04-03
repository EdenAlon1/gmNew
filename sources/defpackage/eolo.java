package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eolo extends eyfy implements eyht {
    public static final eolo a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        eolo eoloVar = new eolo();
        a = eoloVar;
        eyfy.registerDefaultInstance(eolo.class, eoloVar);
    }

    private eolo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0005င\u0004", new Object[]{"b", "c", eoll.a, "d"});
        }
        if (ordinal == 3) {
            return new eolo();
        }
        if (ordinal == 4) {
            return new eoln();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eolo.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
