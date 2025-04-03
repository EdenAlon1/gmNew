package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eywv extends eyfy implements eyht {
    public static final eywv a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        eywv eywvVar = new eywv();
        a = eywvVar;
        eyfy.registerDefaultInstance(eywv.class, eywvVar);
    }

    private eywv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002\u083f\u0000", new Object[]{"d", "c", "b", "e", eywu.a, eywt.a});
        }
        if (ordinal == 3) {
            return new eywv();
        }
        if (ordinal == 4) {
            return new eyws();
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
        synchronized (eywv.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
