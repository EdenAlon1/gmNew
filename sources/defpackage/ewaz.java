package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewaz extends eyfy implements eyht {
    public static final ewaz a;
    private static volatile eyhz d;
    public String b = "";
    public eygr c = eyfy.emptyProtobufList();
    private int e;

    static {
        ewaz ewazVar = new ewaz();
        a = ewazVar;
        eyfy.registerDefaultInstance(ewaz.class, ewazVar);
    }

    private ewaz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001a", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new ewaz();
        }
        if (ordinal == 4) {
            return new eway();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewaz.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
