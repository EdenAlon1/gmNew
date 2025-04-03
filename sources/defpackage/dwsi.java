package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwsi extends eyfy implements eyht {
    public static final dwsi a;
    private static volatile eyhz r;
    public int b;
    public long e;
    public int f;
    public fasl h;
    public long j;
    public fasl k;
    public int m;
    public int n;
    public eydq q;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";
    public eygr l = emptyProtobufList();
    public String o = "";
    public String p = "";

    static {
        dwsi dwsiVar = new dwsi();
        a = dwsiVar;
        eyfy.registerDefaultInstance(dwsi.class, dwsiVar);
    }

    private dwsi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000f᠌\u0003\u0010ဂ\u0007\u0011᠌\t\u0012᠌\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r", new Object[]{"b", "d", "e", "g", "c", "h", "k", "l", dwss.class, "i", "f", dwsg.a, "j", "m", dwsd.a, "n", dwsb.a, "o", "p", "q"});
        }
        if (ordinal == 3) {
            return new dwsi();
        }
        if (ordinal == 4) {
            return new dwsf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = r;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dwsi.class) {
            eyhzVar = r;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                r = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
