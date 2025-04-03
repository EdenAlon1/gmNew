package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqec extends eyfy implements eyht {
    public static final eqec a;
    private static volatile eyhz f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        eqec eqecVar = new eqec();
        a = eqecVar;
        eyfy.registerDefaultInstance(eqec.class, eqecVar);
    }

    private eqec() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u000f\u0001\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001<\u0000\u0002ဈ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"d", "c", "b", eqcy.class, "e", eqde.class, eqcy.class, eqdb.class, eqdg.class, eqdi.class, eqdk.class, eqes.class, eqdq.class, eqdm.class, eqdv.class, eqef.class, eqea.class, eqeq.class});
        }
        if (ordinal == 3) {
            return new eqec();
        }
        if (ordinal == 4) {
            return new eqeb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqec.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
