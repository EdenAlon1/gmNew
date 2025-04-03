package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emiz extends eyfy implements eyht {
    public static final emiz a;
    private static volatile eyhz f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        emiz emizVar = new emiz();
        a = emizVar;
        eyfy.registerDefaultInstance(emiz.class, emizVar);
    }

    private emiz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u00034\u0000\u0004:\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (ordinal == 3) {
            return new emiz();
        }
        if (ordinal == 4) {
            return new emiy();
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
        synchronized (emiz.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
