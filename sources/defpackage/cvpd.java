package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpd extends eyfy implements eyht {
    public static final cvpd a;
    private static volatile eyhz c;
    public long b;

    static {
        cvpd cvpdVar = new cvpd();
        a = cvpdVar;
        eyfy.registerDefaultInstance(cvpd.class, cvpdVar);
    }

    private cvpd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new cvpd();
        }
        if (ordinal == 4) {
            return new cvpc();
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
        synchronized (cvpd.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
