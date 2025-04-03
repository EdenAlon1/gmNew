package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exne extends eyfy implements eyht {
    public static final exne a;
    private static volatile eyhz h;
    public int b;
    public float e;
    public String c = "en";
    public int d = -1;
    public eygr f = eyfy.emptyProtobufList();
    public eygr g = eyfy.emptyProtobufList();

    static {
        exne exneVar = new exne();
        a = exneVar;
        eyfy.registerDefaultInstance(exne.class, exneVar);
    }

    private exne() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ခ\u0002\u0004\u001a\u0005\u001a", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new exne();
        }
        if (ordinal == 4) {
            return new exnd();
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
        synchronized (exne.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
