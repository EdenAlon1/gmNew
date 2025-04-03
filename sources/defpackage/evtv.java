package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evtv extends eyfy implements eyht {
    public static final evtv a;
    private static volatile eyhz d;
    public eygr b = emptyProtobufList();
    public eygr c;

    static {
        evtv evtvVar = new evtv();
        a = evtvVar;
        eyfy.registerDefaultInstance(evtv.class, evtvVar);
    }

    private evtv() {
        emptyProtobufList();
        this.c = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0005\u0002\u0000\u0002\u0000\u0001\u001b\u0005\u001b", new Object[]{"b", evts.class, "c", evtu.class});
        }
        if (ordinal == 3) {
            return new evtv();
        }
        if (ordinal == 4) {
            return new evtq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evtv.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
