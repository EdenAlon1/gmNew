package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyrx extends eyfy implements eyht {
    public static final eyrx a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eyrx eyrxVar = new eyrx();
        a = eyrxVar;
        eyfy.registerDefaultInstance(eyrx.class, eyrxVar);
    }

    private eyrx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u083f\u0000", new Object[]{"c", "b", eyrw.a});
        }
        if (ordinal == 3) {
            return new eyrx();
        }
        if (ordinal == 4) {
            return new eyrv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyrx.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
