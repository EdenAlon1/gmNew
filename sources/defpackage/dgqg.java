package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgqg extends eyfy implements eyht {
    public static final dgqg a;
    private static volatile eyhz c;
    public eyhm b = eyhm.a;
    private eyhm d = eyhm.a;

    static {
        dgqg dgqgVar = new dgqg();
        a = dgqgVar;
        eyfy.registerDefaultInstance(dgqg.class, dgqgVar);
    }

    private dgqg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0002\u0000\u0000\u00012\u00032", new Object[]{"b", dgqe.a, "d", dgqd.a});
        }
        if (ordinal == 3) {
            return new dgqg();
        }
        if (ordinal == 4) {
            return new dgqf();
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
        synchronized (dgqg.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
