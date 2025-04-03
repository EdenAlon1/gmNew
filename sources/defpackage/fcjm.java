package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcjm extends eyfy implements eyht {
    public static final fcjm a;
    private static volatile eyhz k;
    public int b;
    public Object d;
    public fcek f;
    public fcek g;
    public eyja h;
    public int i;
    public int j;
    public int c = 0;
    public String e = "";

    static {
        fcjm fcjmVar = new fcjm();
        a = fcjmVar;
        eyfy.registerDefaultInstance(fcjm.class, fcjmVar);
    }

    private fcjm() {
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
            return newMessageInfo(a, "\u0000\f\u0001\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0006ဉ\u0003\u0007\f\bȻ\u0000\tȻ\u0000\n<\u0000\u000b<\u0000\f<\u0000\r\f\u000e<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", fciu.class, fciq.class, fcis.class, "j", fciw.class});
        }
        if (ordinal == 3) {
            return new fcjm();
        }
        if (ordinal == 4) {
            return new fcjl();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcjm.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
