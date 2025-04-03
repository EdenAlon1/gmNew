package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyvq extends eyfy implements eyht {
    public static final eyvq a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        eyvq eyvqVar = new eyvq();
        a = eyvqVar;
        eyfy.registerDefaultInstance(eyvq.class, eyvqVar);
    }

    private eyvq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"b", "c", eyvo.a, "d", "e", eyvn.a, "f", eyvp.a, "g", eyuk.a, "h", eyvk.a});
        }
        if (ordinal == 3) {
            return new eyvq();
        }
        if (ordinal == 4) {
            return new eyvm();
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
        synchronized (eyvq.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
