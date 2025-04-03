package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faym extends eyfy implements eyht {
    public static final faym a;
    private static volatile eyhz f;
    public int b;
    public eyee c = eyee.b;
    public String d = "";
    public boolean e;

    static {
        faym faymVar = new faym();
        a = faymVar;
        eyfy.registerDefaultInstance(faym.class, faymVar);
    }

    private faym() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new faym();
        }
        if (ordinal == 4) {
            return new fayl();
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
        synchronized (faym.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
