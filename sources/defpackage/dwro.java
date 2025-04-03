package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwro extends eyfy implements eyht {
    public static final dwro a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public long h;

    static {
        dwro dwroVar = new dwro();
        a = dwroVar;
        eyfy.registerDefaultInstance(dwro.class, dwroVar);
    }

    private dwro() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0000\u0000\u0001ဈ\u0005\u0004ဈ\u0007\b᠌\u0000\tဈ\u0001\rဈ\u0006\u000eဂ\f", new Object[]{"b", "e", "g", "c", dwrn.a, "d", "f", "h"});
        }
        if (ordinal == 3) {
            return new dwro();
        }
        if (ordinal == 4) {
            return new dwrm();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dwro.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
