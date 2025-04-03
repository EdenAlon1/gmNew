package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rrg extends eyfy implements eyht {
    public static final rrg a;
    private static volatile eyhz d;
    public int b;
    public float c;

    static {
        rrg rrgVar = new rrg();
        a = rrgVar;
        eyfy.registerDefaultInstance(rrg.class, rrgVar);
    }

    private rrg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new rrg();
        }
        if (ordinal == 4) {
            return new rrf();
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
        synchronized (rrg.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
