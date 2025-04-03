package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edez extends eyfy implements eyht {
    public static final edez a;
    private static volatile eyhz d;
    public edew b;
    public int c;
    private int e;

    static {
        edez edezVar = new edez();
        a = edezVar;
        eyfy.registerDefaultInstance(edez.class, edezVar);
    }

    private edez() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new edez();
        }
        if (ordinal == 4) {
            return new edey();
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
        synchronized (edez.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
