package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyfe extends eyfy implements eyht {
    public static final dyfe a;
    private static volatile eyhz h;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    private int i;

    static {
        dyfe dyfeVar = new dyfe();
        a = dyfeVar;
        eyfy.registerDefaultInstance(dyfe.class, dyfeVar);
    }

    private dyfe() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new dyfe();
        }
        if (ordinal == 4) {
            return new dyfd();
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
        synchronized (dyfe.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
