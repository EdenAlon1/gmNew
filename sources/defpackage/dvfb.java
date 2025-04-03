package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvfb extends eyfy implements eyht {
    public static final dvfb a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        dvfb dvfbVar = new dvfb();
        a = dvfbVar;
        eyfy.registerDefaultInstance(dvfb.class, dvfbVar);
    }

    private dvfb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", dvfa.class});
        }
        if (ordinal == 3) {
            return new dvfb();
        }
        if (ordinal == 4) {
            return new dvey();
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
        synchronized (dvfb.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
