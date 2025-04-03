package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clny extends eyfy implements eyht {
    public static final clny a;
    private static volatile eyhz g;
    public int b;
    public eydq c;
    public clqs d;
    public String e = "";
    public eygr f = emptyProtobufList();

    static {
        clny clnyVar = new clny();
        a = clnyVar;
        eyfy.registerDefaultInstance(clny.class, clnyVar);
    }

    private clny() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဈ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", clqv.class});
        }
        if (ordinal == 3) {
            return new clny();
        }
        if (ordinal == 4) {
            return new clnx();
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
        synchronized (clny.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
