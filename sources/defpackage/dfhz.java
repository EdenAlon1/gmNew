package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfhz extends eyfy implements eyht {
    public static final dfhz a;
    private static volatile eyhz n;
    public int b;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String l = "";
    public String m = "";

    static {
        dfhz dfhzVar = new dfhz();
        a = dfhzVar;
        eyfy.registerDefaultInstance(dfhz.class, dfhzVar);
    }

    private dfhz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဈ\t\fဈ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", dfhx.a, "l", "m"});
        }
        if (ordinal == 3) {
            return new dfhz();
        }
        if (ordinal == 4) {
            return new dfhw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dfhz.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
