package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fatu extends eyfy implements eyht {
    public static final fatu a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        fatu fatuVar = new fatu();
        a = fatuVar;
        eyfy.registerDefaultInstance(fatu.class, fatuVar);
    }

    private fatu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\f", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fatu();
        }
        if (ordinal == 4) {
            return new fatt();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fatu.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
