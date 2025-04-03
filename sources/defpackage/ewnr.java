package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewnr extends eyfy implements eyht {
    public static final ewnr a;
    private static volatile eyhz c;
    public ewnp b;
    private int d;

    static {
        ewnr ewnrVar = new ewnr();
        a = ewnrVar;
        eyfy.registerDefaultInstance(ewnr.class, ewnrVar);
    }

    private ewnr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new ewnr();
        }
        if (ordinal == 4) {
            return new ewnq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewnr.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
