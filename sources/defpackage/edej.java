package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edej extends eyfy implements eyht {
    public static final edej a;
    private static volatile eyhz d;
    public int b;
    public eygr c = emptyProtobufList();
    private int e;

    static {
        edej edejVar = new edej();
        a = edejVar;
        eyfy.registerDefaultInstance(edej.class, edejVar);
    }

    private edej() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"e", "b", "c", edez.class});
        }
        if (ordinal == 3) {
            return new edej();
        }
        if (ordinal == 4) {
            return new edeg();
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
        synchronized (edej.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
