package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cejm extends eyfy implements eyht {
    public static final cejm a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public eyja f;
    public eyja g;

    static {
        cejm cejmVar = new cejm();
        a = cejmVar;
        eyfy.registerDefaultInstance(cejm.class, cejmVar);
    }

    private cejm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဉ\u0003\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new cejm();
        }
        if (ordinal == 4) {
            return new cejl();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cejm.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
