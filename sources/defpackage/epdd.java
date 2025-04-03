package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epdd extends eyfy implements eyht {
    public static final epdd a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public eygr e = eyfy.emptyProtobufList();

    static {
        epdd epddVar = new epdd();
        a = epddVar;
        eyfy.registerDefaultInstance(epdd.class, epddVar);
    }

    private epdd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001a", new Object[]{"b", "c", alak.a, "d", alaj.a, "e"});
        }
        if (ordinal == 3) {
            return new epdd();
        }
        if (ordinal == 4) {
            return new epdc();
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
        synchronized (epdd.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
