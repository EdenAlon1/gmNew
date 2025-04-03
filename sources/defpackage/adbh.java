package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adbh extends eyfy implements eyht {
    public static final adbh a;
    private static volatile eyhz c;
    public String b = "";

    static {
        adbh adbhVar = new adbh();
        a = adbhVar;
        eyfy.registerDefaultInstance(adbh.class, adbhVar);
    }

    private adbh() {
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
            return new adbh();
        }
        if (ordinal == 4) {
            return new adbg();
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
        synchronized (adbh.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
