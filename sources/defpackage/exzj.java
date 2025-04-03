package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exzj extends eyfy implements eyht {
    public static final exzj a;
    private static volatile eyhz e;
    public int b;
    public eygi c = emptyIntList();
    public int d;

    static {
        exzj exzjVar = new exzj();
        a = exzjVar;
        eyfy.registerDefaultInstance(exzj.class, exzjVar);
    }

    private exzj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002᠌\u0000", new Object[]{"b", "c", "d", exzg.a});
        }
        if (ordinal == 3) {
            return new exzj();
        }
        if (ordinal == 4) {
            return new exzi();
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
        synchronized (exzj.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
