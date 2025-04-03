package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewjv extends eyfy implements eyht {
    public static final ewjv a;
    private static volatile eyhz f;
    public ewkp b;
    public eygr c = emptyProtobufList();
    public eygr d = emptyProtobufList();
    public eygr e = emptyProtobufList();
    private int g;

    static {
        ewjv ewjvVar = new ewjv();
        a = ewjvVar;
        eyfy.registerDefaultInstance(ewjv.class, ewjvVar);
    }

    private ewjv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"g", "b", "c", ewlv.class, "d", ewkv.class, "e", ewjn.class});
        }
        if (ordinal == 3) {
            return new ewjv();
        }
        if (ordinal == 4) {
            return new ewju();
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
        synchronized (ewjv.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
