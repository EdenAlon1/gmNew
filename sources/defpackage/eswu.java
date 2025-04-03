package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswu extends eyfy implements eyht {
    public static final eswu a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public eygr d;

    static {
        eswu eswuVar = new eswu();
        a = eswuVar;
        eyfy.registerDefaultInstance(eswu.class, eswuVar);
    }

    private eswu() {
        emptyIntList();
        emptyProtobufList();
        eyfy.emptyProtobufList();
        this.d = eyfy.emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u000f\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u000fȚ", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new eswu();
        }
        if (ordinal == 4) {
            return new esws();
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
        synchronized (eswu.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
