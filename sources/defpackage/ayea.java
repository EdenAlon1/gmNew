package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayea extends eyfy implements eyht {
    public static final ayea a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public String d = "";

    static {
        ayea ayeaVar = new ayea();
        a = ayeaVar;
        eyfy.registerDefaultInstance(ayea.class, ayeaVar);
    }

    private ayea() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ለ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new ayea();
        }
        if (ordinal == 4) {
            return new aydz();
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
        synchronized (ayea.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
