package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emko extends eyfy implements eyht {
    public static final emko a;
    private static volatile eyhz g;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public eygr f = eyfy.emptyProtobufList();

    static {
        emko emkoVar = new emko();
        a = emkoVar;
        eyfy.registerDefaultInstance(emko.class, emkoVar);
    }

    private emko() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001င\u0000\u0002<\u0000\u0003<\u0000\u0005\u001a", new Object[]{"d", "c", "b", "e", emhv.class, emjc.class, "f"});
        }
        if (ordinal == 3) {
            return new emko();
        }
        if (ordinal == 4) {
            return new emkm();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (emko.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
