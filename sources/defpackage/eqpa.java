package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqpa extends eyfy implements eyht {
    public static final eqpa a;
    private static volatile eyhz h;
    public int b;
    public eyev c;
    public eqoy d;
    public eqoy e;
    public eyee f = eyee.b;
    public int g;

    static {
        eqpa eqpaVar = new eqpa();
        a = eqpaVar;
        eyfy.registerDefaultInstance(eqpa.class, eqpaVar);
    }

    private eqpa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ည\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", eqoz.a});
        }
        if (ordinal == 3) {
            return new eqpa();
        }
        if (ordinal == 4) {
            return new eqow();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqpa.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
