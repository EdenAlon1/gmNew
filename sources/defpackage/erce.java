package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erce extends eyfy implements eyht {
    public static final erce a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";

    static {
        erce erceVar = new erce();
        a = erceVar;
        eyfy.registerDefaultInstance(erce.class, erceVar);
    }

    private erce() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", ercc.a, "f"});
        }
        if (ordinal == 3) {
            return new erce();
        }
        if (ordinal == 4) {
            return new ercd();
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
        synchronized (erce.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
