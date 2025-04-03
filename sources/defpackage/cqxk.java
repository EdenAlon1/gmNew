package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqxk extends eyfy implements eyht {
    public static final cqxk a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public long f;
    public int g;

    static {
        cqxk cqxkVar = new cqxk();
        a = cqxkVar;
        eyfy.registerDefaultInstance(cqxk.class, cqxkVar);
    }

    private cqxk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", eqyk.a});
        }
        if (ordinal == 3) {
            return new cqxk();
        }
        if (ordinal == 4) {
            return new cqxj();
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
        synchronized (cqxk.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
