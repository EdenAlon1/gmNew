package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eruj extends eyfy implements eyht {
    public static final eruj a;
    private static volatile eyhz l;
    public int b;
    public boolean h;
    public erxo i;
    public boolean k;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public eygr g = emptyProtobufList();
    public String j = "";

    static {
        eruj erujVar = new eruj();
        a = erujVar;
        eyfy.registerDefaultInstance(eruj.class, erujVar);
    }

    private eruj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u0007\u0005ဉ\u0000\u0007Ȉ\bȈ\n\u0007\u000bȈ", new Object[]{"b", "c", "e", "g", erul.class, "h", "i", "j", "f", "k", "d"});
        }
        if (ordinal == 3) {
            return new eruj();
        }
        if (ordinal == 4) {
            return new erui();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eruj.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
