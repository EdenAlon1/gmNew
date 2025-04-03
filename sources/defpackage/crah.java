package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crah extends eyfy implements eyht {
    public static final crah a;
    private static volatile eyhz e;
    public eyee b = eyee.b;
    public String c = "";
    public String d = "";

    static {
        crah crahVar = new crah();
        a = crahVar;
        eyfy.registerDefaultInstance(crah.class, crahVar);
    }

    private crah() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\n\u0003Ȉ\u0004Ȉ", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new crah();
        }
        if (ordinal == 4) {
            return new crag();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (crah.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
