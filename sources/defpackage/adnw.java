package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adnw extends eyfy implements eyht {
    public static final adnw a;
    private static volatile eyhz d;
    public int b;
    public boolean c;

    static {
        adnw adnwVar = new adnw();
        a = adnwVar;
        eyfy.registerDefaultInstance(adnw.class, adnwVar);
    }

    private adnw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new adnw();
        }
        if (ordinal == 4) {
            return new adnv();
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
        synchronized (adnw.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
