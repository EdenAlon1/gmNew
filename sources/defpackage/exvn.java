package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exvn extends eyfy implements eyht {
    public static final exvn a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public exvm f;
    public eydq g;

    static {
        exvn exvnVar = new exvn();
        a = exvnVar;
        eyfy.registerDefaultInstance(exvn.class, exvnVar);
    }

    private exvn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u001e\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0005\u0004ဈ\u0003\u0005ဈ\u0002\u001eဉ\u0006", new Object[]{"b", "c", "f", "e", "d", "g"});
        }
        if (ordinal == 3) {
            return new exvn();
        }
        if (ordinal == 4) {
            return new exux();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exvn.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
