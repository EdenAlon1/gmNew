package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eukg extends eyfy implements eyht {
    public static final eukg a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public int e;
    public eygi f = emptyIntList();
    public eygr g = emptyProtobufList();

    static {
        eukg eukgVar = new eukg();
        a = eukgVar;
        eyfy.registerDefaultInstance(eukg.class, eukgVar);
    }

    private eukg() {
    }

    public final void a() {
        eygr eygrVar = this.g;
        if (eygrVar.c()) {
            return;
        }
        this.g = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0002\u0000\u0001\u0004\u0003\f\u0004\u0004\u0005\f\u0006'\u0007\u001b", new Object[]{"b", "c", "d", "e", "f", "g", eukc.class});
        }
        if (ordinal == 3) {
            return new eukg();
        }
        if (ordinal == 4) {
            return new eukf();
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
        synchronized (eukg.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
