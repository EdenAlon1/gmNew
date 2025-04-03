package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewux extends eyfy implements eyht {
    public static final ewux a;
    private static volatile eyhz n;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";

    static {
        ewux ewuxVar = new ewux();
        a = ewuxVar;
        eyfy.registerDefaultInstance(ewux.class, ewuxVar);
    }

    private ewux() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဈ\t\bဈ\n\tဈ\u0001\nဈ\u0007\u000bဈ\b", new Object[]{"b", "c", "e", "f", "g", "h", "i", "l", "m", "d", "j", "k"});
        }
        if (ordinal == 3) {
            return new ewux();
        }
        if (ordinal == 4) {
            return new ewuw();
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
        synchronized (ewux.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
