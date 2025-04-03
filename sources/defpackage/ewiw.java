package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewiw extends eyfy implements eyht {
    public static final ewiw a;
    private static volatile eyhz f;
    public int b;
    public ewlp d;
    public String c = "";
    public String e = "";

    static {
        ewiw ewiwVar = new ewiw();
        a = ewiwVar;
        eyfy.registerDefaultInstance(ewiw.class, ewiwVar);
    }

    private ewiw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ewiw();
        }
        if (ordinal == 4) {
            return new ewiv();
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
        synchronized (ewiw.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
