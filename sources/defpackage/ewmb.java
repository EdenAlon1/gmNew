package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewmb extends eyfy implements eyht {
    public static final ewmb a;
    private static volatile eyhz e;
    public int b;
    public ewkt c;
    public String d = "";
    private int f;

    static {
        ewmb ewmbVar = new ewmb();
        a = ewmbVar;
        eyfy.registerDefaultInstance(ewmb.class, ewmbVar);
    }

    private ewmb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0004ဈ\u0003", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new ewmb();
        }
        if (ordinal == 4) {
            return new ewma();
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
        synchronized (ewmb.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
