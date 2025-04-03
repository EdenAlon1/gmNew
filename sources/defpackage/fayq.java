package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fayq extends eyfy implements eyht {
    public static final fayq a;
    private static volatile eyhz f;
    public int b;
    public int d;
    public String c = "";
    public eyee e = eyee.b;

    static {
        fayq fayqVar = new fayq();
        a = fayqVar;
        eyfy.registerDefaultInstance(fayq.class, fayqVar);
    }

    private fayq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ည\u0002", new Object[]{"b", "c", "d", fayo.a, "e"});
        }
        if (ordinal == 3) {
            return new fayq();
        }
        if (ordinal == 4) {
            return new fayn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fayq.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
