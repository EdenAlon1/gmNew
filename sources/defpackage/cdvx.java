package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdvx extends eyfy implements eyht {
    public static final cdvx a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        cdvx cdvxVar = new cdvx();
        a = cdvxVar;
        eyfy.registerDefaultInstance(cdvx.class, cdvxVar);
    }

    private cdvx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", csgl.a});
        }
        if (ordinal == 3) {
            return new cdvx();
        }
        if (ordinal == 4) {
            return new cdvw();
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
        synchronized (cdvx.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
