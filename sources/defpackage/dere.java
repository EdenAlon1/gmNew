package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dere extends eyfy implements eyht {
    public static final dere a;
    private static volatile eyhz d;
    public String b = "";
    public String c = "";
    private int e;

    static {
        dere dereVar = new dere();
        a = dereVar;
        eyfy.registerDefaultInstance(dere.class, dereVar);
    }

    private dere() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new dere();
        }
        if (ordinal == 4) {
            return new derd();
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
        synchronized (dere.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
