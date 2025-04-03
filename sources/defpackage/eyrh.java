package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyrh extends eyfy implements eyht {
    public static final eyrh a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        eyrh eyrhVar = new eyrh();
        a = eyrhVar;
        eyfy.registerDefaultInstance(eyrh.class, eyrhVar);
    }

    private eyrh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000f᠌\u000e", new Object[]{"b", "c", ezei.a});
        }
        if (ordinal == 3) {
            return new eyrh();
        }
        if (ordinal == 4) {
            return new eyrg();
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
        synchronized (eyrh.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
