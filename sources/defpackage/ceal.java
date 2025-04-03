package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceal extends eyfy implements eyht {
    public static final eygj a = new ceae();
    public static final ceal b;
    private static volatile eyhz j;
    public int c;
    public int d;
    public int e;
    public int f = 1;
    public eygi g = emptyIntList();
    public int h;
    public eyja i;

    static {
        ceal cealVar = new ceal();
        b = cealVar;
        eyfy.registerDefaultInstance(ceal.class, cealVar);
    }

    private ceal() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = ceai.a;
            return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ࠞ\u0005᠌\u0003\u0006ဉ\u0004", new Object[]{"c", "d", "e", eyggVar, "f", ceak.a, "g", eyggVar, "h", ceag.a, "i"});
        }
        if (ordinal == 3) {
            return new ceal();
        }
        if (ordinal == 4) {
            return new ceaf();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ceal.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
