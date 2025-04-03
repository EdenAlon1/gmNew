package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcg extends eyfy implements eyht {
    public static final adcg a;
    private static volatile eyhz c;
    public long b;

    static {
        adcg adcgVar = new adcg();
        a = adcgVar;
        eyfy.registerDefaultInstance(adcg.class, adcgVar);
    }

    private adcg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new adcg();
        }
        if (ordinal == 4) {
            return new adcf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (adcg.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
