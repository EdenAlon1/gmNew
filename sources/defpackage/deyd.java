package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deyd extends eyfy implements eyht {
    public static final deyd a;
    private static volatile eyhz f;
    public boolean b;
    public String c = "";
    public eygr d = eyfy.emptyProtobufList();
    public eygr e = eyfy.emptyProtobufList();
    private int g;

    static {
        deyd deydVar = new deyd();
        a = deydVar;
        eyfy.registerDefaultInstance(deyd.class, deydVar);
    }

    private deyd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဇ\u0000\u0002Ȉ\u0003Ț\u0004Ț", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new deyd();
        }
        if (ordinal == 4) {
            return new deyc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (deyd.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
