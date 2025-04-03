package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emii extends eyfy implements eyht {
    public static final emii a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public float d;
    private int f;

    static {
        emii emiiVar = new emii();
        a = emiiVar;
        eyfy.registerDefaultInstance(emii.class, emiiVar);
    }

    private emii() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u083f\u0000\u0002;\u0000\u0003ခ\u0000", new Object[]{"c", "b", "f", fbqs.a, "d"});
        }
        if (ordinal == 3) {
            return new emii();
        }
        if (ordinal == 4) {
            return new emih();
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
        synchronized (emii.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
