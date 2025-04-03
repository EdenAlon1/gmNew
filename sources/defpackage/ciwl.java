package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciwl extends eyfy implements eyht {
    public static final ciwl a;
    private static volatile eyhz g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;

    static {
        ciwl ciwlVar = new ciwl();
        a = ciwlVar;
        eyfy.registerDefaultInstance(ciwl.class, ciwlVar);
    }

    private ciwl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", cixe.a, "f", cjax.class, cjcv.class, cjda.class});
        }
        if (ordinal == 3) {
            return new ciwl();
        }
        if (ordinal == 4) {
            return new ciwk();
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
        synchronized (ciwl.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
