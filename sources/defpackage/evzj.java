package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evzj extends eyfy implements eyht {
    public static final evzj a;
    private static volatile eyhz b;

    static {
        evzj evzjVar = new evzj();
        a = evzjVar;
        eyfy.registerDefaultInstance(evzj.class, evzjVar);
    }

    private evzj() {
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
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (ordinal == 3) {
            return new evzj();
        }
        if (ordinal == 4) {
            return new evzi();
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
        synchronized (evzj.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
