package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqzb extends eyfy implements eyht {
    public static final eqzb a;
    private static volatile eyhz j;
    public int b;
    public Object d;
    public int e;
    public eqyx g;
    public int h;
    public int i;
    public int c = 0;
    public eyee f = eyee.b;

    static {
        eqzb eqzbVar = new eqzb();
        a = eqzbVar;
        eyfy.registerDefaultInstance(eqzb.class, eqzbVar);
    }

    private eqzb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007᠌\u0003\bင\u0004", new Object[]{"d", "c", "b", "e", eqyz.a, "f", "g", eqzi.class, eqzd.class, eqzg.class, "h", akda.a, "i"});
        }
        if (ordinal == 3) {
            return new eqzb();
        }
        if (ordinal == 4) {
            return new eqyy();
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
        synchronized (eqzb.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
