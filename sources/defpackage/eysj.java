package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eysj extends eyfy implements eyht {
    public static final eysj a;
    private static volatile eyhz q;
    public int b;
    public int c;
    public int e;
    public int f;
    public eyss g;
    public int k;
    public int l;
    public int n;
    public int p;
    public int d = 1;
    public String h = "";
    public String i = "";
    public String j = "";
    public eygr m = emptyProtobufList();
    public String o = "";

    static {
        eysj eysjVar = new eysj();
        a = eysjVar;
        eyfy.registerDefaultInstance(eysj.class, eysjVar);
    }

    private eysj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tင\b\nင\t\u000b\u001b\f᠌\n\rဈ\u000b\u000e᠌\f", new Object[]{"b", "c", eysf.a, "d", eysi.a, "e", eysk.a, "f", "g", "h", "i", "j", "k", "l", "m", eysd.class, "n", eysh.a, "o", "p", eysg.a});
        }
        if (ordinal == 3) {
            return new eysj();
        }
        if (ordinal == 4) {
            return new eyse();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = q;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eysj.class) {
            eyhzVar = q;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                q = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
