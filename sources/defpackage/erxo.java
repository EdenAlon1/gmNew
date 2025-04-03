package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erxo extends eyfy implements eyht {
    public static final erxo a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public eyee d = eyee.b;
    public int e;
    public esbq f;

    static {
        erxo erxoVar = new erxo();
        a = erxoVar;
        eyfy.registerDefaultInstance(erxo.class, erxoVar);
    }

    private erxo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002Ȉ\u0003\n\u0004\f\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new erxo();
        }
        if (ordinal == 4) {
            return new erxn();
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
        synchronized (erxo.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
