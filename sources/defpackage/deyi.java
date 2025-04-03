package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deyi extends eyfy implements eyht {
    public static final deyi a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        deyi deyiVar = new deyi();
        a = deyiVar;
        eyfy.registerDefaultInstance(deyi.class, deyiVar);
    }

    private deyi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", dexs.class, dexq.class, deyb.class, deyh.class, dexz.class, deyd.class, dexx.class, dexm.class, dexo.class, deyf.class});
        }
        if (ordinal == 3) {
            return new deyi();
        }
        if (ordinal == 4) {
            return new dexh();
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
        synchronized (deyi.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
