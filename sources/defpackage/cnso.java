package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnso extends eyfy implements eyht {
    public static final cnso a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        cnso cnsoVar = new cnso();
        a = cnsoVar;
        eyfy.registerDefaultInstance(cnso.class, cnsoVar);
    }

    private cnso() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new cnso();
        }
        if (ordinal == 4) {
            return new cnsn();
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
        synchronized (cnso.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
