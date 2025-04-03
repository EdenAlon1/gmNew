package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adco extends eyfy implements eyht {
    public static final adco a;
    private static volatile eyhz e;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        adco adcoVar = new adco();
        a = adcoVar;
        eyfy.registerDefaultInstance(adco.class, adcoVar);
    }

    private adco() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new adco();
        }
        if (ordinal == 4) {
            return new adcn();
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
        synchronized (adco.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
