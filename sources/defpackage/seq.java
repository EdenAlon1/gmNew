package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class seq extends eyfy implements eyht {
    public static final seq a;
    private static volatile eyhz e;
    public float b;
    public sem c;
    public sec d;
    private int f;

    static {
        seq seqVar = new seq();
        a = seqVar;
        eyfy.registerDefaultInstance(seq.class, seqVar);
    }

    private seq() {
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
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new seq();
        }
        if (ordinal == 4) {
            return new sep();
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
        synchronized (seq.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
