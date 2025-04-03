package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erxi extends eyfy implements eyht {
    public static final erxi a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        erxi erxiVar = new erxi();
        a = erxiVar;
        eyfy.registerDefaultInstance(erxi.class, erxiVar);
    }

    private erxi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0001\u0000\u0002\u000f\u000e\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"c", "b", eruy.class, esac.class, esde.class, escg.class, esec.class, ertu.class, erut.class, erwq.class, ervv.class, esbg.class, eruh.class, ervz.class, esdp.class, ervx.class});
        }
        if (ordinal == 3) {
            return new erxi();
        }
        if (ordinal == 4) {
            return new erxg();
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
        synchronized (erxi.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
