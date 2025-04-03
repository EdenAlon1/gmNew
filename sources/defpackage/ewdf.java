package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewdf extends eyfy implements eyht {
    public static final ewdf a;
    private static volatile eyhz d;
    public int b = 0;
    public ewdi c;
    private int e;
    private Object f;

    static {
        ewdf ewdfVar = new ewdf();
        a = ewdfVar;
        eyfy.registerDefaultInstance(ewdf.class, ewdfVar);
    }

    private ewdf() {
        eyee eyeeVar = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0001\u0003\u0007\u0004\u0000\u0000\u0000\u0003<\u0000\u0004<\u0000\u0006ဉ\u0000\u0007<\u0000", new Object[]{"f", "b", "e", ewdt.class, ewdp.class, "c", ewcb.class});
        }
        if (ordinal == 3) {
            return new ewdf();
        }
        if (ordinal == 4) {
            return new ewde();
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
        synchronized (ewdf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
