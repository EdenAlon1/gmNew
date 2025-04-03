package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyqh extends eyfy implements eyht {
    public static final eyqh a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";

    static {
        eyqh eyqhVar = new eyqh();
        a = eyqhVar;
        eyfy.registerDefaultInstance(eyqh.class, eyqhVar);
    }

    private eyqh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0007\bဈ\u0006", new Object[]{"b", "c", eyqg.a, "d", eyqe.a, "e", "f", "g", "h", "j", "i"});
        }
        if (ordinal == 3) {
            return new eyqh();
        }
        if (ordinal == 4) {
            return new eyqd();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyqh.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
