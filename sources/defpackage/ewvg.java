package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvg extends eyfy implements eyht {
    public static final ewvg a;
    private static volatile eyhz h;
    public int b;
    public eygr c = emptyProtobufList();
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        ewvg ewvgVar = new ewvg();
        a = ewvgVar;
        eyfy.registerDefaultInstance(ewvg.class, ewvgVar);
    }

    private ewvg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u001b\u0003ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဈ\u0003", new Object[]{"b", "c", ewvf.class, "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new ewvg();
        }
        if (ordinal == 4) {
            return new ewvd();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewvg.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
