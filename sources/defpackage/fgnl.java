package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgnl extends eyfy implements eyht {
    public static final fgnl a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public eygl d = emptyLongList();

    static {
        fgnl fgnlVar = new fgnl();
        a = fgnlVar;
        eyfy.registerDefaultInstance(fgnl.class, fgnlVar);
    }

    private fgnl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003(", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fgnl();
        }
        if (ordinal == 4) {
            return new fgnk();
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
        synchronized (fgnl.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
