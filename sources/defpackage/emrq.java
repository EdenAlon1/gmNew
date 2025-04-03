package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emrq extends eyfy implements eyht {
    public static final emrq a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public eygr d = eyfy.emptyProtobufList();

    static {
        emrq emrqVar = new emrq();
        a = emrqVar;
        eyfy.registerDefaultInstance(emrq.class, emrqVar);
    }

    private emrq() {
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0002\u0000\u0002\u000b\u0003\u001b\u0004Ț", new Object[]{"b", "c", emst.class, "d"});
        }
        if (ordinal == 3) {
            return new emrq();
        }
        if (ordinal == 4) {
            return new emrp();
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
        synchronized (emrq.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
