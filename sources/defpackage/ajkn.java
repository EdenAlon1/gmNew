package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajkn extends eyfy<ajkn, ajkm> implements eyht {
    public static final ajkn a;
    private static volatile eyhz f;
    public int b;
    public awui c;
    public String d = "";
    public ajld e;

    static {
        ajkn ajknVar = new ajkn();
        a = ajknVar;
        eyfy.registerDefaultInstance(ajkn.class, ajknVar);
    }

    private ajkn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ajkn();
        }
        if (ordinal == 4) {
            return new ajkm();
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
        synchronized (ajkn.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
