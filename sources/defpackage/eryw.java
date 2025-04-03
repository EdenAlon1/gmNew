package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eryw extends eyfy implements eyht {
    public static final eryw a;
    private static volatile eyhz g;
    public int b;
    public eygr c = emptyProtobufList();
    public String d = "";
    public int e;
    public erys f;

    static {
        eryw erywVar = new eryw();
        a = erywVar;
        eyfy.registerDefaultInstance(eryw.class, erywVar);
    }

    private eryw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002\u001b\u0003Ȉ\u0004\u0004\u0005ဉ\u0000", new Object[]{"b", "c", erzn.class, "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new eryw();
        }
        if (ordinal == 4) {
            return new eryv();
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
        synchronized (eryw.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
