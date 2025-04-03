package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhh extends eyfy implements eyht {
    public static final cvhh a;
    private static volatile eyhz g;
    public int b;
    public bcyt e;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        cvhh cvhhVar = new cvhh();
        a = cvhhVar;
        eyfy.registerDefaultInstance(cvhh.class, cvhhVar);
    }

    private cvhh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ဉ\u0001\u0004Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cvhh();
        }
        if (ordinal == 4) {
            return new cvhg();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cvhh.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
