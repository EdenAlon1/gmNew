package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezla extends eyfy implements eyht {
    public static final ezla a;
    private static volatile eyhz f;
    public int b;
    public boolean c;
    public int d;
    public eohv e;

    static {
        ezla ezlaVar = new ezla();
        a = ezlaVar;
        eyfy.registerDefaultInstance(ezla.class, ezlaVar);
    }

    private ezla() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ezla();
        }
        if (ordinal == 4) {
            return new ezkz();
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
        synchronized (ezla.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
