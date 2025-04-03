package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqpi extends eyfy implements eyht {
    public static final eqpi a;
    private static volatile eyhz i;
    public int b;
    public eyev d;
    public eyev e;
    public int g;
    public int h;
    public eyee c = eyee.b;
    public eyee f = eyee.b;

    static {
        eqpi eqpiVar = new eqpi();
        a = eqpiVar;
        eyfy.registerDefaultInstance(eqpi.class, eqpiVar);
    }

    private eqpi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ည\u0003\u0005᠌\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", eqph.a, "h"});
        }
        if (ordinal == 3) {
            return new eqpi();
        }
        if (ordinal == 4) {
            return new eqpg();
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
        synchronized (eqpi.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
