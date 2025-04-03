package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faul extends eyfy implements eyht {
    public static final faul a;
    private static volatile eyhz g;
    public int b;
    public float c;
    public float d;
    public float e;
    public eyfn f;

    static {
        faul faulVar = new faul();
        a = faulVar;
        eyfy.registerDefaultInstance(faul.class, faulVar);
    }

    private faul() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new faul();
        }
        if (ordinal == 4) {
            return new fauk();
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
        synchronized (faul.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
