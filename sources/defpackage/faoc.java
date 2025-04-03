package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class faoc extends eyfy implements eyht {
    public static final faoc a;
    private static volatile eyhz d;
    public int b;
    public eyee c = eyee.b;

    static {
        faoc faocVar = new faoc();
        a = faocVar;
        eyfy.registerDefaultInstance(faoc.class, faocVar);
    }

    private faoc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new faoc();
        }
        if (ordinal == 4) {
            return new faob();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (faoc.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
