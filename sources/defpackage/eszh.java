package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eszh extends eyfy implements eyht {
    public static final eszh a;
    private static volatile eyhz h;
    public int b;
    public eyja c;
    public int d;
    public int e;
    public eszs f;
    public eygr g = emptyProtobufList();

    static {
        eszh eszhVar = new eszh();
        a = eszhVar;
        eyfy.registerDefaultInstance(eszh.class, eszhVar);
    }

    private eszh() {
        emptyProtobufList();
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
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\f\u0003\f\u0004ဉ\u0001\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", eszs.class});
        }
        if (ordinal == 3) {
            return new eszh();
        }
        if (ordinal == 4) {
            return new eszg();
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
        synchronized (eszh.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
