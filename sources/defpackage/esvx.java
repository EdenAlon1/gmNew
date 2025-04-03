package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esvx extends eyfy implements eyht {
    public static final esvx a;
    private static volatile eyhz e;
    public String b = "";
    public int c;
    public int d;

    static {
        esvx esvxVar = new esvx();
        a = esvxVar;
        eyfy.registerDefaultInstance(esvx.class, esvxVar);
    }

    private esvx() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new esvx();
        }
        if (ordinal == 4) {
            return new esvw();
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
        synchronized (esvx.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
