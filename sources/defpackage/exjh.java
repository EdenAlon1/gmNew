package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exjh extends eyfy implements eyht {
    public static final exjh a;
    private static volatile eyhz j;
    public int b;
    public String c = "";
    public eygr d = eyfy.emptyProtobufList();
    public eygr e = eyfy.emptyProtobufList();
    public eygr f = eyfy.emptyProtobufList();
    public eygr g = eyfy.emptyProtobufList();
    public exjg h;
    public int i;

    static {
        exjh exjhVar = new exjh();
        a = exjhVar;
        eyfy.registerDefaultInstance(exjh.class, exjhVar);
    }

    private exjh() {
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
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\t\u0007\u0000\u0004\u0000\u0001Ȉ\u0003Ț\u0004Ț\u0005Ț\u0006Ț\bဉ\u0000\t\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new exjh();
        }
        if (ordinal == 4) {
            return new exjc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exjh.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
