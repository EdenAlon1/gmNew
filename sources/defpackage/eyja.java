package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyja extends eyfy implements eyht {
    public static final eyja a;
    private static volatile eyhz d;
    public long b;
    public int c;

    static {
        eyja eyjaVar = new eyja();
        a = eyjaVar;
        eyfy.registerDefaultInstance(eyja.class, eyjaVar);
    }

    private eyja() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new eyja();
        }
        if (ordinal == 4) {
            return new eyiz();
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
        synchronized (eyja.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
