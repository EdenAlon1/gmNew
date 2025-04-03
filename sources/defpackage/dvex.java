package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvex extends eyfy implements eyht {
    public static final dvex a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        dvex dvexVar = new dvex();
        a = dvexVar;
        eyfy.registerDefaultInstance(dvex.class, dvexVar);
    }

    private dvex() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", evtj.class});
        }
        if (ordinal == 3) {
            return new dvex();
        }
        if (ordinal == 4) {
            return new dvew();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dvex.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
