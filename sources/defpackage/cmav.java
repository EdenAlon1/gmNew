package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmav extends eyfy implements eyht {
    public static final cmav a;
    private static volatile eyhz f;
    public int b;
    public eyja c;
    public eyja d;
    public int e;

    static {
        cmav cmavVar = new cmav();
        a = cmavVar;
        eyfy.registerDefaultInstance(cmav.class, cmavVar);
    }

    private cmav() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0002\u0003ဉ\u0001", new Object[]{"b", "c", "e", "d"});
        }
        if (ordinal == 3) {
            return new cmav();
        }
        if (ordinal == 4) {
            return new cmat();
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
        synchronized (cmav.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
