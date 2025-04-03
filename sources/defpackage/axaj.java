package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axaj extends eyfy implements eyht {
    public static final axaj a;
    private static volatile eyhz f;
    public int b;
    public awwf c;
    public eyee d = eyee.b;
    public awui e;

    static {
        axaj axajVar = new axaj();
        a = axajVar;
        eyfy.registerDefaultInstance(axaj.class, axajVar);
    }

    private axaj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new axaj();
        }
        if (ordinal == 4) {
            return new axai();
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
        synchronized (axaj.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
