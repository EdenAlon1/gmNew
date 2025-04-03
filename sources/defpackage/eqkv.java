package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqkv extends eyfy implements eyht {
    public static final eqkv a;
    public static final eyfw b;
    private static volatile eyhz h;
    public int c;
    public eqkx d;
    public eqld e;
    public epyj f;
    public eqkz g;

    static {
        eqkv eqkvVar = new eqkv();
        a = eqkvVar;
        eyfy.registerDefaultInstance(eqkv.class, eqkvVar);
        b = eyfy.newSingularGeneratedExtension(epmc.a, eqkvVar, eqkvVar, null, 216, eyjr.MESSAGE, eqkv.class);
    }

    private eqkv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eqkv();
        }
        if (ordinal == 4) {
            return new eqku();
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
        synchronized (eqkv.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
