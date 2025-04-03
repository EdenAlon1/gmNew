package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxyw extends eyfy implements eyht {
    public static final dxyw a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        dxyw dxywVar = new dxyw();
        a = dxywVar;
        eyfy.registerDefaultInstance(dxyw.class, dxywVar);
    }

    private dxyw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0001\u0002᠌\u0002\u0003ဈ\u0000", new Object[]{"b", "d", "e", dxyu.a, "c"});
        }
        if (ordinal == 3) {
            return new dxyw();
        }
        if (ordinal == 4) {
            return new dxyt();
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
        synchronized (dxyw.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
