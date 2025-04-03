package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fafy extends eyfy implements eyht {
    public static final fafy a;
    private static volatile eyhz b;

    static {
        fafy fafyVar = new fafy();
        a = fafyVar;
        eyfy.registerDefaultInstance(fafy.class, fafyVar);
    }

    private fafy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (ordinal == 3) {
            return new fafy();
        }
        if (ordinal == 4) {
            return new fafx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fafy.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
