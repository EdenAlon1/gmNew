package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esnk extends eyfy implements eyht {
    public static final esnk a;
    private static volatile eyhz e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        esnk esnkVar = new esnk();
        a = esnkVar;
        eyfy.registerDefaultInstance(esnk.class, esnkVar);
    }

    private esnk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u001b\u0001\u0000\u0001Õ\u001b\u0000\u0000\u0000\u0001Ȉd<\u0000e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000o<\u0000È<\u0000É<\u0000Ê<\u0000Ë<\u0000Ì<\u0000Í<\u0000Î<\u0000Ï<\u0000Ð<\u0000Ñ<\u0000Ò<\u0000Ó<\u0000Ô<\u0000Õ<\u0000", new Object[]{"c", "b", "d", eyex.class, esnh.class, esnf.class, eyex.class, esnx.class, esnv.class, esmd.class, eyex.class, esmj.class, esnr.class, eyex.class, esnz.class, eyex.class, eyex.class, esod.class, esob.class, eyex.class, eyex.class, eyex.class, esmh.class, eyex.class, eyex.class, esml.class, esmv.class, esmb.class, esnp.class});
        }
        if (ordinal == 3) {
            return new esnk();
        }
        if (ordinal == 4) {
            return new esni();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esnk.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
