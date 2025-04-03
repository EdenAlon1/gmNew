package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eouc extends eyfy implements eyht {
    public static final eouc a;
    private static volatile eyhz f;
    public int b;
    public int c = -1;
    public eojh d;
    public int e;

    static {
        eouc eoucVar = new eouc();
        a = eoucVar;
        eyfy.registerDefaultInstance(eouc.class, eoucVar);
    }

    private eouc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", eoua.a});
        }
        if (ordinal == 3) {
            return new eouc();
        }
        if (ordinal == 4) {
            return new eotz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eouc.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
