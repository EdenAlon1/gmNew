package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqoh extends eyfy implements eyht {
    public static final eqoh a;
    private static volatile eyhz i;
    public int b;
    public Object d;
    public int e;
    public eqoe g;
    public int h;
    public int c = 0;
    public eyee f = eyee.b;

    static {
        eqoh eqohVar = new eqoh();
        a = eqohVar;
        eyfy.registerDefaultInstance(eqoh.class, eqohVar);
    }

    private eqoh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007᠌\u0003", new Object[]{"d", "c", "b", "e", eqog.a, "f", "g", eqop.class, eqoj.class, eqon.class, "h", dfkc.a});
        }
        if (ordinal == 3) {
            return new eqoh();
        }
        if (ordinal == 4) {
            return new eqof();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqoh.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
