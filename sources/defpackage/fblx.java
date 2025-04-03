package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fblx extends eyfy implements eyht {
    public static final fblx a;
    private static volatile eyhz e;
    public int c;
    public String b = "";
    public eygr d = emptyProtobufList();

    static {
        fblx fblxVar = new fblx();
        a = fblxVar;
        eyfy.registerDefaultInstance(fblx.class, fblxVar);
    }

    private fblx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"b", "c", "d", fbmp.class});
        }
        if (ordinal == 3) {
            return new fblx();
        }
        if (ordinal == 4) {
            return new fblw();
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
        synchronized (fblx.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
