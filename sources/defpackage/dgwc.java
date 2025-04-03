package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgwc extends eyfy implements eyht {
    public static final dgwc a;
    private static volatile eyhz c;
    public dgwe b;
    private int d;

    static {
        dgwc dgwcVar = new dgwc();
        a = dgwcVar;
        eyfy.registerDefaultInstance(dgwc.class, dgwcVar);
    }

    private dgwc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new dgwc();
        }
        if (ordinal == 4) {
            return new dgwb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dgwc.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
