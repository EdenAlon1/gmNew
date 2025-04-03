package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajsm extends eyfy implements eyht {
    public static final ajsm a;
    private static volatile eyhz d;
    public String b = "";
    public String c = "";

    static {
        ajsm ajsmVar = new ajsm();
        a = ajsmVar;
        eyfy.registerDefaultInstance(ajsm.class, ajsmVar);
    }

    private ajsm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ajsm();
        }
        if (ordinal == 4) {
            return new ajsl();
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
        synchronized (ajsm.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
