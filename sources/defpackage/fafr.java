package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fafr extends eyfy implements eyht {
    public static final fafr a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public eygr d = emptyProtobufList();
    public facw e;
    public int f;
    public long g;

    static {
        fafr fafrVar = new fafr();
        a = fafrVar;
        eyfy.registerDefaultInstance(fafr.class, fafrVar);
    }

    private fafr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\f\u0005\u0002", new Object[]{"b", "c", "d", facw.class, "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fafr();
        }
        if (ordinal == 4) {
            return new fafq();
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
        synchronized (fafr.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
