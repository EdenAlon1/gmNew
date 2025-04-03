package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fasb extends eyfy implements eyht {
    public static final fasb a;
    private static volatile eyhz d;
    public String b = "";
    public eygr c = emptyProtobufList();
    private int e;

    static {
        fasb fasbVar = new fasb();
        a = fasbVar;
        eyfy.registerDefaultInstance(fasb.class, fasbVar);
    }

    private fasb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"e", "b", "c", fasa.class});
        }
        if (ordinal == 3) {
            return new fasb();
        }
        if (ordinal == 4) {
            return new fary();
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
        synchronized (fasb.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
