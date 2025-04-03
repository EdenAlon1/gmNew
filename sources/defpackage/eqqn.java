package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqqn extends eyfy implements eyht {
    public static final eqqn a;
    private static volatile eyhz g;
    public int b;
    public Object d;
    public int c = 0;
    public eyee e = eyee.b;
    public eygi f = emptyIntList();

    static {
        eqqn eqqnVar = new eqqn();
        a = eqqnVar;
        eyfy.registerDefaultInstance(eqqn.class, eqqnVar);
    }

    private eqqn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ည\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007ࠞ\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"d", "c", "b", "e", eqqi.class, eqpu.class, eqpk.class, eqpi.class, eqpr.class, "f", eqqc.a, eqpp.class, eqqb.class, eqqm.class, eqpy.class, eqqk.class, eqpw.class, eqpn.class});
        }
        if (ordinal == 3) {
            return new eqqn();
        }
        if (ordinal == 4) {
            return new eqpl();
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
        synchronized (eqqn.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
