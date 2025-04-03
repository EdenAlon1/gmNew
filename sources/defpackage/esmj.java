package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esmj extends eyfy implements eyht {
    public static final esmj a;
    private static volatile eyhz c;
    public esmf b;
    private int d;

    static {
        esmj esmjVar = new esmj();
        a = esmjVar;
        eyfy.registerDefaultInstance(esmj.class, esmjVar);
    }

    private esmj() {
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
            return new esmj();
        }
        if (ordinal == 4) {
            return new esmi();
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
        synchronized (esmj.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
