package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoqv extends eyfy implements eyht {
    public static final eoqv a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public int d;

    static {
        eoqv eoqvVar = new eoqv();
        a = eoqvVar;
        eyfy.registerDefaultInstance(eoqv.class, eoqvVar);
    }

    private eoqv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000", new Object[]{"b", "c", eoqs.class, "d", eoqu.a});
        }
        if (ordinal == 3) {
            return new eoqv();
        }
        if (ordinal == 4) {
            return new eoqt();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eoqv.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
