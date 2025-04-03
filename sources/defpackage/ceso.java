package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceso extends eyfy implements eyht {
    public static final ceso a;
    private static volatile eyhz d;
    public eygr b = eyfy.emptyProtobufList();
    public boolean c;

    static {
        ceso cesoVar = new ceso();
        a = cesoVar;
        eyfy.registerDefaultInstance(ceso.class, cesoVar);
    }

    private ceso() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\u0007", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ceso();
        }
        if (ordinal == 4) {
            return new cesn();
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
        synchronized (ceso.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
