package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class famn extends eyfy implements eyht {
    public static final famn a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public famd d;

    static {
        famn famnVar = new famn();
        a = famnVar;
        eyfy.registerDefaultInstance(famn.class, famnVar);
    }

    private famn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"b", "c", famm.a, "d"});
        }
        if (ordinal == 3) {
            return new famn();
        }
        if (ordinal == 4) {
            return new faml();
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
        synchronized (famn.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
