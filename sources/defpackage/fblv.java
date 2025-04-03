package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fblv extends eyfy implements eyht {
    public static final fblv a;
    private static volatile eyhz d;
    public int b;
    public long c;

    static {
        fblv fblvVar = new fblv();
        a = fblvVar;
        eyfy.registerDefaultInstance(fblv.class, fblvVar);
    }

    private fblv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fblv();
        }
        if (ordinal == 4) {
            return new fblu();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fblv.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
