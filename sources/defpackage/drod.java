package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drod extends eyfy implements eyht {
    public static final drod a;
    private static volatile eyhz b;

    static {
        drod drodVar = new drod();
        a = drodVar;
        eyfy.registerDefaultInstance(drod.class, drodVar);
    }

    private drod() {
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
            return new drod();
        }
        if (ordinal == 4) {
            return new droc();
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
        synchronized (drod.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
