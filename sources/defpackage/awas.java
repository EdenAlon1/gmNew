package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awas extends eyfy implements eyht {
    public static final awas a;
    private static volatile eyhz k;
    public int b;
    public awup d;
    public long e;
    public boolean f;
    public awui g;
    public boolean h;
    public long j;
    public String c = "";
    public String i = "";

    static {
        awas awasVar = new awas();
        a = awasVar;
        eyfy.registerDefaultInstance(awas.class, awasVar);
    }

    private awas() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဂ\u0007\tဉ\u0001", new Object[]{"b", "c", "e", "f", "g", "h", "i", "j", "d"});
        }
        if (ordinal == 3) {
            return new awas();
        }
        if (ordinal == 4) {
            return new awar();
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
        synchronized (awas.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
