package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctli extends eyfy implements eyht {
    public static final eygj a = new ctlg();
    public static final ctli b;
    private static volatile eyhz d;
    public eygi c = emptyIntList();

    static {
        ctli ctliVar = new ctli();
        b = ctliVar;
        eyfy.registerDefaultInstance(ctli.class, ctliVar);
    }

    private ctli() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"c", fbrh.a});
        }
        if (ordinal == 3) {
            return new ctli();
        }
        if (ordinal == 4) {
            return new ctlh();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ctli.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
