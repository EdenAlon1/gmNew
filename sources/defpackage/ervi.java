package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ervi extends eyfy implements eyht {
    public static final ervi a;
    private static volatile eyhz g;
    public int c;
    public String b = "";
    public eyee d = eyee.b;
    public eyee e = eyee.b;
    public String f = "";

    static {
        ervi erviVar = new ervi();
        a = erviVar;
        eyfy.registerDefaultInstance(ervi.class, erviVar);
    }

    private ervi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\n\u0005\n\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ervi();
        }
        if (ordinal == 4) {
            return new ervh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ervi.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
