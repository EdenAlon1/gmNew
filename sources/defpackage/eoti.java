package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoti extends eyfy implements eyht {
    public static final eoti a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public long e;

    static {
        eoti eotiVar = new eoti();
        a = eotiVar;
        eyfy.registerDefaultInstance(eoti.class, eotiVar);
    }

    private eoti() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0004\u0007\u0004\u0000\u0000\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007ဂ\u0003", new Object[]{"d", "c", "b", epip.class, epik.class, epim.class, "e"});
        }
        if (ordinal == 3) {
            return new eoti();
        }
        if (ordinal == 4) {
            return new eotg();
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
        synchronized (eoti.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
