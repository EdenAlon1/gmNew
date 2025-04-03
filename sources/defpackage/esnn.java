package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esnn extends eyfy<esnn, esnl> implements eyht {
    public static final esnn a;
    private static volatile eyhz g;
    public Object c;
    public int e;
    public int b = 0;
    public String d = "";
    public String f = "";

    static {
        esnn esnnVar = new esnn();
        a = esnnVar;
        eyfy.registerDefaultInstance(esnn.class, esnnVar);
    }

    private esnn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u001d\u0001\u0000\u0001Õ\u001d\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉd<\u0000e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000o<\u0000È<\u0000É<\u0000Ê<\u0000Ë<\u0000Ì<\u0000Í<\u0000Î<\u0000Ï<\u0000Ð<\u0000Ñ<\u0000Ò<\u0000Ó<\u0000Ô<\u0000Õ<\u0000", new Object[]{"c", "b", "d", "e", "f", esnd.class, eyex.class, eyex.class, eyex.class, eyex.class, eyex.class, eyex.class, eyex.class, eyex.class, esnt.class, esmq.class, eyex.class, eyex.class, eyex.class, eyex.class, eyex.class, eyex.class, eyex.class, esnb.class, eyex.class, esmz.class, esmt.class, esmn.class, esmx.class, eyex.class, eyex.class});
        }
        if (ordinal == 3) {
            return new esnn();
        }
        if (ordinal == 4) {
            return new esnl();
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
        synchronized (esnn.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
