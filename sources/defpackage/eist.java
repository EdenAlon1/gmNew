package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eist extends eyfy implements eyht {
    public static final eygj a = new eisr();
    public static final eist b;
    private static volatile eyhz e;
    public String c = "";
    public eygi d = emptyIntList();
    private int f;

    static {
        eist eistVar = new eist();
        b = eistVar;
        eyfy.registerDefaultInstance(eist.class, eistVar);
    }

    private eist() {
        emptyIntList();
        emptyIntList();
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"f", "c", "d", eism.a});
        }
        if (ordinal == 3) {
            return new eist();
        }
        if (ordinal == 4) {
            return new eiss();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eist.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
