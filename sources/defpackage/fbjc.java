package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbjc extends eyfy implements eyht {
    public static final fbjc a;
    private static volatile eyhz e;
    public boolean c;
    public String b = "";
    public String d = "";

    static {
        fbjc fbjcVar = new fbjc();
        a = fbjcVar;
        eyfy.registerDefaultInstance(fbjc.class, fbjcVar);
    }

    private fbjc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fbjc();
        }
        if (ordinal == 4) {
            return new fbjb();
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
        synchronized (fbjc.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
