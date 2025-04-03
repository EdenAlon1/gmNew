package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eokz extends eyfy implements eyht {
    public static final eokz a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public long d;
    public eygr e = emptyProtobufList();

    static {
        eokz eokzVar = new eokz();
        a = eokzVar;
        eyfy.registerDefaultInstance(eokz.class, eokzVar);
    }

    private eokz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"b", "c", eokx.a, "d", "e", eoxj.class});
        }
        if (ordinal == 3) {
            return new eokz();
        }
        if (ordinal == 4) {
            return new eoky();
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
        synchronized (eokz.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
