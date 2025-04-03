package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erfx extends eyfy implements eyht {
    public static final erfx a;
    private static volatile eyhz c;
    public eygr b = eyfy.emptyProtobufList();

    static {
        erfx erfxVar = new erfx();
        a = erfxVar;
        eyfy.registerDefaultInstance(erfx.class, erfxVar);
    }

    private erfx() {
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
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new erfx();
        }
        if (ordinal == 4) {
            return new erfw();
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
        synchronized (erfx.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
