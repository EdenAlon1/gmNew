package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyrc extends eyfy implements eyht {
    public static final eyrc a;
    private static volatile eyhz h;
    public int b;
    public int e;
    public boolean g;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        eyrc eyrcVar = new eyrc();
        a = eyrcVar;
        eyfy.registerDefaultInstance(eyrc.class, eyrcVar);
    }

    private eyrc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eyrc();
        }
        if (ordinal == 4) {
            return new eyrb();
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
        synchronized (eyrc.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
