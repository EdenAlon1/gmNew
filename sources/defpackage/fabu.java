package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fabu extends eyfy implements eyht {
    public static final fabu a;
    private static volatile eyhz f;
    public String b = "";
    public String c = "";
    public float d;
    public float e;
    private int g;

    static {
        fabu fabuVar = new fabu();
        a = fabuVar;
        eyfy.registerDefaultInstance(fabu.class, fabuVar);
    }

    private fabu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fabu();
        }
        if (ordinal == 4) {
            return new fabt();
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
        synchronized (fabu.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
