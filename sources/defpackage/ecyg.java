package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecyg extends eyfy implements eyht {
    public static final ecyg a;
    private static volatile eyhz e;
    public int b;
    public eygr c = eyfy.emptyProtobufList();
    public String d = "";

    static {
        ecyg ecygVar = new ecyg();
        a = ecygVar;
        eyfy.registerDefaultInstance(ecyg.class, ecygVar);
    }

    private ecyg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new ecyg();
        }
        if (ordinal == 4) {
            return new ecyf();
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
        synchronized (ecyg.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
