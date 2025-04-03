package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exvm extends eyfy implements eyht {
    public static final exvm a;
    private static volatile eyhz t;
    public int b;
    public float c;
    public int d;
    public int j;
    public int o;
    public exxq q;
    public exyg r;
    public int s;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String k = "";
    public String l = "";
    public eygr m = emptyProtobufList();
    public eygr n = emptyProtobufList();
    public String p = "";

    static {
        exvm exvmVar = new exvm();
        a = exvmVar;
        eyfy.registerDefaultInstance(exvm.class, exvmVar);
    }

    private exvm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0011\u0000\u0001\u0002\u0012\u0011\u0000\u0002\u0000\u0002ခ\u0000\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007င\u0007\bဈ\b\t᠌\u0001\nဈ\u0002\u000bဈ\t\f\u001b\r\u001b\u000e᠌\n\u000fဈ\u000b\u0010ဉ\f\u0011ဉ\r\u0012᠌\u000e", new Object[]{"b", "c", "f", "g", "h", "i", "j", "k", "d", exvl.a, "e", "l", "m", exvg.class, "n", exvk.class, "o", exva.a, "p", "q", "r", "s", exuy.a});
        }
        if (ordinal == 3) {
            return new exvm();
        }
        if (ordinal == 4) {
            return new exvc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = t;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exvm.class) {
            eyhzVar = t;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                t = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
