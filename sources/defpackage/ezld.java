package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezld extends eyfy implements eyht {
    public static final ezld a;
    private static volatile eyhz k;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public eohv i;
    public int j;

    static {
        ezld ezldVar = new ezld();
        a = ezldVar;
        eyfy.registerDefaultInstance(ezld.class, ezldVar);
    }

    private ezld() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004\u0004\u0005\f\u0006\f\u0007ဉ\u0000\b\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new ezld();
        }
        if (ordinal == 4) {
            return new ezlc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezld.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
