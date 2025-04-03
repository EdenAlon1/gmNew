package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewlx extends eyfy implements eyht {
    public static final ewlx a;
    private static volatile eyhz f;
    public int b;
    public ewjg c;
    public String d = "";
    public ewiq e;

    static {
        ewlx ewlxVar = new ewlx();
        a = ewlxVar;
        eyfy.registerDefaultInstance(ewlx.class, ewlxVar);
    }

    private ewlx() {
        eyee eyeeVar = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ewlx();
        }
        if (ordinal == 4) {
            return new ewlw();
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
        synchronized (ewlx.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
