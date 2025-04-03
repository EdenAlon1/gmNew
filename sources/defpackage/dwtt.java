package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwtt extends eyfy implements eyht {
    public static final dwtt a;
    private static volatile eyhz h;
    public int b;
    public long d;
    public int f;
    public fasl g;
    public String c = "";
    public String e = "";

    static {
        dwtt dwttVar = new dwtt();
        a = dwttVar;
        eyfy.registerDefaultInstance(dwtt.class, dwttVar);
    }

    private dwtt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", dwsl.a, "g"});
        }
        if (ordinal == 3) {
            return new dwtt();
        }
        if (ordinal == 4) {
            return new dwts();
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
        synchronized (dwtt.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
