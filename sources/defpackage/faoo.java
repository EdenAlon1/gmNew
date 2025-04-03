package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class faoo extends eyfy implements eyht {
    public static final faoo a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int e;
    public eyee d = eyee.b;
    public eyee f = eyee.b;

    static {
        faoo faooVar = new faoo();
        a = faooVar;
        eyfy.registerDefaultInstance(faoo.class, faooVar);
    }

    private faoo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003᠌\u0002\u0004ည\u0003", new Object[]{"b", "c", "d", "e", faoh.a, "f"});
        }
        if (ordinal == 3) {
            return new faoo();
        }
        if (ordinal == 4) {
            return new faon();
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
        synchronized (faoo.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
