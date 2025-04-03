package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxa extends eyfy implements eyht {
    public static final awxa a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public boolean d;
    public awxf e;

    static {
        awxa awxaVar = new awxa();
        a = awxaVar;
        eyfy.registerDefaultInstance(awxa.class, awxaVar);
    }

    private awxa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new awxa();
        }
        if (ordinal == 4) {
            return new awwz();
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
        synchronized (awxa.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
