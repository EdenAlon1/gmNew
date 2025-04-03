package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esyo extends eyfy implements eyht {
    public static final esyo a;
    private static volatile eyhz h;
    public int b;
    public etau c;
    public eyja d;
    public String e;
    public String f;
    public boolean g;
    private int i;

    static {
        esyo esyoVar = new esyo();
        a = esyoVar;
        eyfy.registerDefaultInstance(esyo.class, esyoVar);
    }

    private esyo() {
        emptyIntList();
        this.e = "";
        this.f = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0000\u0000\u0001ဉ\u0001\u0006\u0004\u0007Ȉ\bȈ\u000b\u0007ϧဉ\u0000", new Object[]{"b", "d", "i", "e", "f", "g", "c"});
        }
        if (ordinal == 3) {
            return new esyo();
        }
        if (ordinal == 4) {
            return new esyn();
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
        synchronized (esyo.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
