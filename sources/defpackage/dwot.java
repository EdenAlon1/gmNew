package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwot extends eyfy implements eyht {
    public static final dwot a;
    private static volatile eyhz c;
    public eyhm b = eyhm.a;

    static {
        dwot dwotVar = new dwot();
        a = dwotVar;
        eyfy.registerDefaultInstance(dwot.class, dwotVar);
    }

    private dwot() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", dwos.a});
        }
        if (ordinal == 3) {
            return new dwot();
        }
        if (ordinal == 4) {
            return new dwor();
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
        synchronized (dwot.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
