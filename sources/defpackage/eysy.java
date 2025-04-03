package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eysy extends eyfy implements eyht {
    public static final eysy a;
    private static volatile eyhz h;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public int f;
    public int g;

    static {
        eysy eysyVar = new eysy();
        a = eysyVar;
        eyfy.registerDefaultInstance(eysy.class, eysyVar);
    }

    private eysy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", eysw.a, "g"});
        }
        if (ordinal == 3) {
            return new eysy();
        }
        if (ordinal == 4) {
            return new eysv();
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
        synchronized (eysy.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
