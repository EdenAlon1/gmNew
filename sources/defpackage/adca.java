package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adca extends eyfy implements eyht {
    public static final adca a;
    private static volatile eyhz b;

    static {
        adca adcaVar = new adca();
        a = adcaVar;
        eyfy.registerDefaultInstance(adca.class, adcaVar);
    }

    private adca() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new adca();
        }
        if (ordinal == 4) {
            return new adbz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (adca.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
