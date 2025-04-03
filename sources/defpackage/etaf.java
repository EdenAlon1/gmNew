package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etaf extends eyfy implements eyht {
    public static final etaf a;
    private static volatile eyhz b;

    static {
        etaf etafVar = new etaf();
        a = etafVar;
        eyfy.registerDefaultInstance(etaf.class, etafVar);
    }

    private etaf() {
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
            return new etaf();
        }
        if (ordinal == 4) {
            return new etae();
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
        synchronized (etaf.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
