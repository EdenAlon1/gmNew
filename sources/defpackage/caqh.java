package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqh extends eyfy implements eyht {
    public static final caqh a;
    private static volatile eyhz c;
    public String b = "";

    static {
        caqh caqhVar = new caqh();
        a = caqhVar;
        eyfy.registerDefaultInstance(caqh.class, caqhVar);
    }

    private caqh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new caqh();
        }
        if (ordinal == 4) {
            return new caqg();
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
        synchronized (caqh.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
