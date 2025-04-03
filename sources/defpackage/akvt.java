package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akvt extends eyfy implements eyht {
    public static final akvt a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        akvt akvtVar = new akvt();
        a = akvtVar;
        eyfy.registerDefaultInstance(akvt.class, akvtVar);
    }

    private akvt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new akvt();
        }
        if (ordinal == 4) {
            return new akvs();
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
        synchronized (akvt.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
