package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faga extends eyfy implements eyht {
    public static final faga a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public eygr e = emptyProtobufList();
    public facw f;
    public long g;

    static {
        faga fagaVar = new faga();
        a = fagaVar;
        eyfy.registerDefaultInstance(faga.class, fagaVar);
    }

    private faga() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u0004\u0003\u001b\u0004ဉ\u0000\u0005\u0002", new Object[]{"b", "c", "d", "e", facw.class, "f", "g"});
        }
        if (ordinal == 3) {
            return new faga();
        }
        if (ordinal == 4) {
            return new fafz();
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
        synchronized (faga.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
