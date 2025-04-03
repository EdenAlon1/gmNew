package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faft extends eyfy implements eyht {
    public static final faft a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public eygr d = emptyProtobufList();
    public facw e;
    public int f;
    public long g;

    static {
        faft faftVar = new faft();
        a = faftVar;
        eyfy.registerDefaultInstance(faft.class, faftVar);
    }

    private faft() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0005\f\u0006\u0002", new Object[]{"b", "c", "d", facw.class, "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new faft();
        }
        if (ordinal == 4) {
            return new fafs();
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
        synchronized (faft.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
