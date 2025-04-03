package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eppr extends eyfy implements eyht {
    public static final eppr a;
    private static volatile eyhz j;
    public int b;
    public Object d;
    public Object f;
    public Object h;
    public eyev i;
    public int c = 0;
    public int e = 0;
    public int g = 0;

    static {
        eppr epprVar = new eppr();
        a = epprVar;
        eyfy.registerDefaultInstance(eppr.class, epprVar);
    }

    private eppr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0003\u0001\u0002ĭ\u000e\u0000\u0000\u0000\u0002ဉ\u0000e<\u0000f<\u0000g<\u0000É<\u0001Ê<\u0001Ë<\u0001Ì<\u0001Í<\u0001Î<\u0001Ï<\u0001Ð<\u0001Ñ<\u0001ĭ<\u0002", new Object[]{"d", "c", "f", "e", "h", "g", "b", "i", eptv.class, epqn.class, epru.class, eprw.class, epqg.class, eprl.class, epqp.class, epro.class, eppw.class, eppt.class, epqi.class, eprq.class, epqk.class});
        }
        if (ordinal == 3) {
            return new eppr();
        }
        if (ordinal == 4) {
            return new eppq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eppr.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
