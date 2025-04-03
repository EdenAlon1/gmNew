package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewgs extends eyfy implements eyht {
    public static final ewgs a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public ewgq d;

    static {
        ewgs ewgsVar = new ewgs();
        a = ewgsVar;
        eyfy.registerDefaultInstance(ewgs.class, ewgsVar);
    }

    private ewgs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            evuj evujVar = evuj.sm;
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0003ဉ\u0003", new Object[]{"b", "c", evue.a, "d"});
        }
        if (ordinal == 3) {
            return new ewgs();
        }
        if (ordinal == 4) {
            return new ewgr();
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
        synchronized (ewgs.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
