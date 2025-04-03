package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awwc extends eyfy implements eyht {
    public static final awwc a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public boolean d;
    public awxf e;

    static {
        awwc awwcVar = new awwc();
        a = awwcVar;
        eyfy.registerDefaultInstance(awwc.class, awwcVar);
    }

    private awwc() {
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
            return new awwc();
        }
        if (ordinal == 4) {
            return new awwb();
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
        synchronized (awwc.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
