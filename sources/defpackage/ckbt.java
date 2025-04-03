package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbt extends eyfy implements eyht {
    public static final ckbt a;
    private static volatile eyhz h;
    public int b;
    public Object d;
    public ckbg f;
    public int c = 0;
    public String e = "";
    public String g = "";

    static {
        ckbt ckbtVar = new ckbt();
        a = ckbtVar;
        eyfy.registerDefaultInstance(ckbt.class, ckbtVar);
    }

    private ckbt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0001\u0002\u0007\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0005Ȉ\u0006ဉ\u0000\u0007ለ\u0001", new Object[]{"d", "c", "b", ckbr.class, ckbp.class, "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new ckbt();
        }
        if (ordinal == 4) {
            return new ckbs();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ckbt.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
