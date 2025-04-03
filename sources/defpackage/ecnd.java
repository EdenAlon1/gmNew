package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecnd extends eyfy implements eyht {
    public static final ecnd a;
    private static volatile eyhz e;
    public String b = "";
    public eygr c = emptyProtobufList();
    public boolean d;
    private int f;

    static {
        ecnd ecndVar = new ecnd();
        a = ecndVar;
        eyfy.registerDefaultInstance(ecnd.class, ecndVar);
    }

    private ecnd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"f", "b", "c", ecna.class, "d"});
        }
        if (ordinal == 3) {
            return new ecnd();
        }
        if (ordinal == 4) {
            return new ecmy();
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
        synchronized (ecnd.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
