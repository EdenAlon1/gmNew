package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwnu extends eyfy implements eyht {
    public static final dwnu a;
    public static final eyfw b;
    private static volatile eyhz f;
    public int c;
    public long d;
    public long e;

    static {
        dwnu dwnuVar = new dwnu();
        a = dwnuVar;
        eyfy.registerDefaultInstance(dwnu.class, dwnuVar);
        b = eyfy.newSingularGeneratedExtension(dwno.a, dwnuVar, dwnuVar, null, 1000, eyjr.MESSAGE, dwnu.class);
    }

    private dwnu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"c", "d", "e"});
        }
        if (ordinal == 3) {
            return new dwnu();
        }
        if (ordinal == 4) {
            return new dwnt();
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
        synchronized (dwnu.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
