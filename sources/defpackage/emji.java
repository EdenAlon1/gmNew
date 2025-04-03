package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emji extends eyfy implements eyht {
    public static final emji a;
    private static volatile eyhz f;
    public int b;
    public emhv c;
    public int d;
    public boolean e = true;

    static {
        emji emjiVar = new emji();
        a = emjiVar;
        eyfy.registerDefaultInstance(emji.class, emjiVar);
    }

    private emji() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003င\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new emji();
        }
        if (ordinal == 4) {
            return new emjh();
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
        synchronized (emji.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
