package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class fbem extends eyfy implements eyht {
    public static final fbem a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        fbem fbemVar = new fbem();
        a = fbemVar;
        eyfy.registerDefaultInstance(fbem.class, fbemVar);
    }

    private fbem() {
        eyfy.emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0003\u0007\u0004\u0000\u0000\u0000\u0003\f\u0005\u0004\u0006\f\u0007\f", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fbem();
        }
        if (ordinal == 4) {
            return new fbel();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbem.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
