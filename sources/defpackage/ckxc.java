package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxc extends eyfy implements eyht {
    public static final ckxc a;
    private static volatile eyhz e;
    public String b = "";
    public String c = "";
    public boolean d;

    static {
        ckxc ckxcVar = new ckxc();
        a = ckxcVar;
        eyfy.registerDefaultInstance(ckxc.class, ckxcVar);
    }

    private ckxc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new ckxc();
        }
        if (ordinal == 4) {
            return new ckxb();
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
        synchronized (ckxc.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
