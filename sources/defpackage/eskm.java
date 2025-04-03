package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eskm extends eyfy implements eyht {
    public static final eskm a;
    private static volatile eyhz e;
    public int b;
    public eskg c;
    public boolean d;

    static {
        eskm eskmVar = new eskm();
        a = eskmVar;
        eyfy.registerDefaultInstance(eskm.class, eskmVar);
    }

    private eskm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new eskm();
        }
        if (ordinal == 4) {
            return new eskl();
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
        synchronized (eskm.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
