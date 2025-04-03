package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eonm extends eyfy implements eyht {
    public static final eonm a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eonm eonmVar = new eonm();
        a = eonmVar;
        eyfy.registerDefaultInstance(eonm.class, eonmVar);
    }

    private eonm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"c", "b", eqaf.class, epzz.class, epzu.class, epzn.class, epzs.class, epzw.class, eqai.class, eqak.class, epyy.class, epzl.class, epzj.class, epzh.class, epzf.class, epzb.class});
        }
        if (ordinal == 3) {
            return new eonm();
        }
        if (ordinal == 4) {
            return new eonl();
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
        synchronized (eonm.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
