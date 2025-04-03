package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvah extends eyfy implements eyht {
    public static final cvah a;
    private static volatile eyhz g;
    public boolean b;
    public boolean c;
    public eyhm f = eyhm.a;
    public eygr d = emptyProtobufList();
    public eygr e = emptyProtobufList();

    static {
        cvah cvahVar = new cvah();
        a = cvahVar;
        eyfy.registerDefaultInstance(cvah.class, cvahVar);
    }

    private cvah() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0002\u0000\u0001\u0007\u0002\u0007\u0003\u001b\u0004\u001b\u00052", new Object[]{"b", "c", "d", eyja.class, "e", eyja.class, "f", cvag.a});
        }
        if (ordinal == 3) {
            return new cvah();
        }
        if (ordinal == 4) {
            return new cvaf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cvah.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
