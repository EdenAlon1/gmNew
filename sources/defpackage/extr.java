package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class extr extends eyfy implements eyht {
    public static final extr a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        extr extrVar = new extr();
        a = extrVar;
        eyfy.registerDefaultInstance(extr.class, extrVar);
    }

    private extr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0000\u0001\t\u0007\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"c", "b", exue.class, extk.class, extn.class, exwc.class, extt.class, exvp.class, exug.class});
        }
        if (ordinal == 3) {
            return new extr();
        }
        if (ordinal == 4) {
            return new extq();
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
        synchronized (extr.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
