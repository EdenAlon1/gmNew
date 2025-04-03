package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaum extends eyfy implements eyht {
    public static final eaum a;
    private static volatile eyhz c;
    public String b = "";

    static {
        eaum eaumVar = new eaum();
        a = eaumVar;
        eyfy.registerDefaultInstance(eaum.class, eaumVar);
    }

    private eaum() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new eaum();
        }
        if (ordinal == 4) {
            return new eaul();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eaum.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
