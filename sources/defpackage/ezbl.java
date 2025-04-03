package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezbl extends eyfy implements eyht {
    public static final ezbl a;
    private static volatile eyhz s;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;
    public int o;
    public int p;
    public int q;
    public String h = "";
    public String n = "";
    public String r = "";

    static {
        ezbl ezblVar = new ezbl();
        a = ezblVar;
        eyfy.registerDefaultInstance(ezbl.class, ezblVar);
    }

    private ezbl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = ezbc.a;
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0000\u0000\u0001᠌\u0001\u0002᠌\u0002\u0003᠌\u0003\u0004ဈ\u0005\u0005င\u0006\u0006ဂ\t\bဈ\f\nင\u000e\u000bင\u000f\fင\u0010\r᠌\b\u000e᠌\u0004\u000f᠌\u0000\u0010᠌\u000b\u0011ဈ\u0011\u0012᠌\u0007", new Object[]{"b", "d", ezbb.a, "e", ezbd.a, "f", ezbg.a, "h", "i", "l", "n", "o", "p", "q", "k", eyggVar, "g", ezbf.a, "c", ezbk.a, "m", ezbi.a, "r", "j", eyggVar});
        }
        if (ordinal == 3) {
            return new ezbl();
        }
        if (ordinal == 4) {
            return new ezba();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = s;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezbl.class) {
            eyhzVar = s;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                s = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
