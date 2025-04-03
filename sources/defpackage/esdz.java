package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esdz extends eyfy implements eyht {
    public static final esdz a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public boolean d;

    static {
        esdz esdzVar = new esdz();
        a = esdzVar;
        eyfy.registerDefaultInstance(esdz.class, esdzVar);
    }

    private esdz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0007\u0003<\u0000", new Object[]{"c", "b", "d", escl.class});
        }
        if (ordinal == 3) {
            return new esdz();
        }
        if (ordinal == 4) {
            return new esdy();
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
        synchronized (esdz.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
