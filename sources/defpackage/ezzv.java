package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezzv extends eyfy implements eyht {
    public static final ezzv a;
    private static volatile eyhz d;
    public boolean b;
    public boolean c;

    static {
        ezzv ezzvVar = new ezzv();
        a = ezzvVar;
        eyfy.registerDefaultInstance(ezzv.class, ezzvVar);
    }

    private ezzv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ezzv();
        }
        if (ordinal == 4) {
            return new ezzu();
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
        synchronized (ezzv.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
