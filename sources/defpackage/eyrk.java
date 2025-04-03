package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyrk extends eyfy implements eyht {
    public static final eyrk a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public int d;

    static {
        eyrk eyrkVar = new eyrk();
        a = eyrkVar;
        eyfy.registerDefaultInstance(eyrk.class, eyrkVar);
    }

    private eyrk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0005᠌\u0005", new Object[]{"b", "c", "d", eyrj.a});
        }
        if (ordinal == 3) {
            return new eyrk();
        }
        if (ordinal == 4) {
            return new eyri();
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
        synchronized (eyrk.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
