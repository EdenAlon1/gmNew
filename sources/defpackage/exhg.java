package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exhg extends eyfy implements eyht {
    public static final exhg a;
    private static volatile eyhz e;
    public int b;
    public fauy c;
    public eyja d;
    private int f;

    static {
        exhg exhgVar = new exhg();
        a = exhgVar;
        eyfy.registerDefaultInstance(exhg.class, exhgVar);
    }

    private exhg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new exhg();
        }
        if (ordinal == 4) {
            return new exhe();
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
        synchronized (exhg.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
