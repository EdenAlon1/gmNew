package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class faog extends eyfy implements eyht {
    public static final faog a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public eyee d = eyee.b;
    public eygr e = emptyProtobufList();
    public String f = "";

    static {
        faog faogVar = new faog();
        a = faogVar;
        eyfy.registerDefaultInstance(faog.class, faogVar);
    }

    private faog() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002ည\u0001\u0003\u001b\u0004ဈ\u0002", new Object[]{"b", "c", "d", "e", faof.class, "f"});
        }
        if (ordinal == 3) {
            return new faog();
        }
        if (ordinal == 4) {
            return new faod();
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
        synchronized (faog.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
