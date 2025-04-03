package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgdw extends eyfy implements eyht {
    public static final cgdw a;
    private static volatile eyhz e;
    public int b;
    public boolean c;
    public int d;

    static {
        cgdw cgdwVar = new cgdw();
        a = cgdwVar;
        eyfy.registerDefaultInstance(cgdw.class, cgdwVar);
    }

    private cgdw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", cgdy.a});
        }
        if (ordinal == 3) {
            return new cgdw();
        }
        if (ordinal == 4) {
            return new cgdv();
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
        synchronized (cgdw.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
