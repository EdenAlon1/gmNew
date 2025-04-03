package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewkt extends eyfy implements eyht {
    public static final ewkt a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;
    private int f;

    static {
        ewkt ewktVar = new ewkt();
        a = ewktVar;
        eyfy.registerDefaultInstance(ewkt.class, ewktVar);
    }

    private ewkt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new ewkt();
        }
        if (ordinal == 4) {
            return new ewks();
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
        synchronized (ewkt.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
