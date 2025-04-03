package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjr extends eyfy implements eyht {
    public static final vjr a;
    private static volatile eyhz e;
    public int c;
    public String b = "";
    public eyee d = eyee.b;

    static {
        vjr vjrVar = new vjr();
        a = vjrVar;
        eyfy.registerDefaultInstance(vjr.class, vjrVar);
    }

    private vjr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new vjr();
        }
        if (ordinal == 4) {
            return new vjq();
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
        synchronized (vjr.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
