package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exfi extends eyfy implements eyht {
    public static final exfi a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public long d;

    static {
        exfi exfiVar = new exfi();
        a = exfiVar;
        eyfy.registerDefaultInstance(exfi.class, exfiVar);
    }

    private exfi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new exfi();
        }
        if (ordinal == 4) {
            return new exfh();
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
        synchronized (exfi.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
