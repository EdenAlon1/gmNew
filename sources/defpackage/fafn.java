package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fafn extends eyfy implements eyht {
    public static final fafn a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public eygr d = emptyProtobufList();
    public facw e;
    public long f;

    static {
        fafn fafnVar = new fafn();
        a = fafnVar;
        eyfy.registerDefaultInstance(fafn.class, fafnVar);
    }

    private fafn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0005\u0002", new Object[]{"b", "c", "d", facw.class, "e", "f"});
        }
        if (ordinal == 3) {
            return new fafn();
        }
        if (ordinal == 4) {
            return new fafm();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fafn.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
