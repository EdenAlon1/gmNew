package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exzy extends eyfy implements eyht {
    public static final exzy a;
    private static volatile eyhz l;
    public int b;
    public int c = 0;
    public Object d;
    public fauw e;
    public boolean f;
    public int g;
    public exzp h;
    public exzp i;
    public int j;
    public int k;

    static {
        exzy exzyVar = new exzy();
        a = exzyVar;
        eyfy.registerDefaultInstance(exzy.class, exzyVar);
    }

    private exzy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0001\u0001\u0001\u000e\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003<\u0000\u0004;\u0000\u0006᠌\u0002\u0007ဉ\u0003\bဉ\u0004\t᠌\u0005\n᠌\u0006\u000e<\u0000", new Object[]{"d", "c", "b", "e", "f", eybq.class, "g", exzu.a, "h", "i", "j", exzm.a, "k", exzw.a, eyby.class});
        }
        if (ordinal == 3) {
            return new exzy();
        }
        if (ordinal == 4) {
            return new exzt();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exzy.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
