package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emcg extends eyfy implements eyht {
    public static final emcg a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public long d;

    static {
        emcg emcgVar = new emcg();
        a = emcgVar;
        eyfy.registerDefaultInstance(emcg.class, emcgVar);
    }

    private emcg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"b", "c", emcf.a, "d"});
        }
        if (ordinal == 3) {
            return new emcg();
        }
        if (ordinal == 4) {
            return new emce();
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
        synchronized (emcg.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
