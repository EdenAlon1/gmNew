package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsq extends eyfy implements eyht {
    public static final rsq a;
    private static volatile eyhz e;
    public int b;
    public boolean c;
    public int d;

    static {
        rsq rsqVar = new rsq();
        a = rsqVar;
        eyfy.registerDefaultInstance(rsq.class, rsqVar);
    }

    private rsq() {
        eyee eyeeVar = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003᠌\u0001", new Object[]{"b", "c", "d", rtv.a});
        }
        if (ordinal == 3) {
            return new rsq();
        }
        if (ordinal == 4) {
            return new rsp();
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
        synchronized (rsq.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
