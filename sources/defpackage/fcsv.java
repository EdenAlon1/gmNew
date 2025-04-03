package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcsv extends eyfy implements eyht {
    public static final fcsv a;
    private static volatile eyhz b;

    static {
        fcsv fcsvVar = new fcsv();
        a = fcsvVar;
        eyfy.registerDefaultInstance(fcsv.class, fcsvVar);
    }

    private fcsv() {
        eyfy.emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new fcsv();
        }
        if (ordinal == 4) {
            return new fcsu();
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
        synchronized (fcsv.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
