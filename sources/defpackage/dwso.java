package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwso extends eyfy implements eyht {
    public static final dwso a;
    private static volatile eyhz y;
    public int b;
    public dwsk c;
    public int f;
    public eydq g;
    public eydq h;
    public eydq i;
    public int j;
    public int k;
    public long l;
    public long m;
    public dwta n;
    public boolean o;
    public int q;
    public int s;
    public long t;
    public fgsc w;
    public String d = "";
    public String e = "";
    public eygr p = emptyProtobufList();
    public eygr r = emptyProtobufList();
    public String u = "";
    public eygr v = eyfy.emptyProtobufList();
    public String x = "";

    static {
        dwso dwsoVar = new dwso();
        a = dwsoVar;
        eyfy.registerDefaultInstance(dwso.class, dwsoVar);
    }

    private dwso() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0016\u0000\u0001\u0001年皤\u0016\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003ဂ\t\u0006ဈ\u0002\nင\u0003\u000bဂ\n\f᠌\b\rဉ\u000b\u000eဇ\f\u0010င\r\u0011\u001b\u0013᠌\u000e\u0014ဉ\u0004\u0015᠌\u0007\u0017ဂ\u000f\u0019\u001a\u001aဈ\u0010\u001bဉ\u0005\u001cဉ\u0011\u001dဉ\u0006Ϩဈ\u0013年皤ဉ\u0000", new Object[]{"b", "d", "p", dwsi.class, "l", "e", "f", "m", "k", dwsl.a, "n", "o", "q", "r", dwtc.class, "s", dyca.a, "g", "j", dwqr.a, "t", "v", "u", "h", "w", "i", "x", "c"});
        }
        if (ordinal == 3) {
            return new dwso();
        }
        if (ordinal == 4) {
            return new dwsn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = y;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dwso.class) {
            eyhzVar = y;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                y = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
