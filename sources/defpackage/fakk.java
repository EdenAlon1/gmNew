package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fakk extends eyfy implements eyht {
    public static final fakk a;
    private static volatile eyhz d;
    public String b = "";
    public eyee c = eyee.b;

    static {
        fakk fakkVar = new fakk();
        a = fakkVar;
        eyfy.registerDefaultInstance(fakk.class, fakkVar);
    }

    private fakk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fakk();
        }
        if (ordinal == 4) {
            return new fakj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fakk.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
