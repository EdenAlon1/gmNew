package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyvy extends eyfy implements eyht {
    public static final eyvy a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public int d;

    static {
        eyvy eyvyVar = new eyvy();
        a = eyvyVar;
        eyfy.registerDefaultInstance(eyvy.class, eyvyVar);
    }

    private eyvy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", eyvx.a});
        }
        if (ordinal == 3) {
            return new eyvy();
        }
        if (ordinal == 4) {
            return new eyvw();
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
        synchronized (eyvy.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
