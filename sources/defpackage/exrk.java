package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exrk extends eyfy implements eyht {
    public static final exrk a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        exrk exrkVar = new exrk();
        a = exrkVar;
        eyfy.registerDefaultInstance(exrk.class, exrkVar);
    }

    private exrk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0001\u0000\u0001\n\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", exrp.class, exrv.class, exqk.class, exso.class, exrg.class, exta.class, exsb.class, exrx.class, exrz.class});
        }
        if (ordinal == 3) {
            return new exrk();
        }
        if (ordinal == 4) {
            return new exrj();
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
        synchronized (exrk.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
