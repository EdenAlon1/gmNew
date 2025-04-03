package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyh extends eyfy implements eyht {
    public static final eqyh a;
    private static volatile eyhz j;
    public int b;
    public int c;
    public eqyg d;
    public eqyb e;
    public eqyb f;
    public eqyd g;
    public eqyd h;
    public eqyb i;

    static {
        eqyh eqyhVar = new eqyh();
        a = eqyhVar;
        eyfy.registerDefaultInstance(eqyh.class, eqyhVar);
    }

    private eqyh() {
        emptyProtobufList();
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
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0013\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0005ဉ\u0002\u000bဉ\b\u0010ဉ\r\u0011ဉ\u000e\u0012ဉ\u000f\u0013ဉ\u0010", new Object[]{"b", "c", eqxy.a, "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new eqyh();
        }
        if (ordinal == 4) {
            return new eqxx();
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
        synchronized (eqyh.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
