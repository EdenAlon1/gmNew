package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fack extends eyfy implements eyht {
    public static final fack a;
    private static volatile eyhz e;
    public String b = "";
    public String c = "";
    public String d = "";
    private int f;

    static {
        fack fackVar = new fack();
        a = fackVar;
        eyfy.registerDefaultInstance(fack.class, fackVar);
    }

    private fack() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0005ဈ\u0004", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fack();
        }
        if (ordinal == 4) {
            return new facj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fack.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
