package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewjx extends eyfy implements eyht {
    public static final ewjx a;
    private static volatile eyhz g;
    public int b;
    public ewjg c;
    public int d;
    public int e;
    public ewiq f;

    static {
        ewjx ewjxVar = new ewjx();
        a = ewjxVar;
        eyfy.registerDefaultInstance(ewjx.class, ewjxVar);
    }

    private ewjx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ewjx();
        }
        if (ordinal == 4) {
            return new ewjw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewjx.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
