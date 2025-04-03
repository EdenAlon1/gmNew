package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sec extends eyfy implements eyht {
    public static final sec a;
    private static volatile eyhz e;
    public int c;
    public String b = "";
    public eygr d = eyfy.emptyProtobufList();

    static {
        sec secVar = new sec();
        a = secVar;
        eyfy.registerDefaultInstance(sec.class, secVar);
    }

    private sec() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0001\u0000\u0001Ȉ\n\f\u000bȚ", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new sec();
        }
        if (ordinal == 4) {
            return new seb();
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
        synchronized (sec.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
