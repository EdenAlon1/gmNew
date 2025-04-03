package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epkc extends eyfy implements eyht {
    public static final epkc a;
    private static volatile eyhz l;
    public int b;
    public int d;
    public String c = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";

    static {
        epkc epkcVar = new epkc();
        a = epkcVar;
        eyfy.registerDefaultInstance(epkc.class, epkcVar);
    }

    private epkc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"b", "c", "d", eowo.a, "e", "f", "g", "h", "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new epkc();
        }
        if (ordinal == 4) {
            return new epkb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epkc.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
