package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfig extends eyfy implements eyht {
    public static final dfig a;
    private static volatile eyhz d;
    public int b;
    public String c = "";
    private int e;

    static {
        dfig dfigVar = new dfig();
        a = dfigVar;
        eyfy.registerDefaultInstance(dfig.class, dfigVar);
    }

    private dfig() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"e", "b", dfie.a, "c"});
        }
        if (ordinal == 3) {
            return new dfig();
        }
        if (ordinal == 4) {
            return new dfid();
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
        synchronized (dfig.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
