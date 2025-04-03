package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eise extends eyfy implements eyht {
    public static final eise a;
    private static volatile eyhz c;
    public eygr b;

    static {
        eise eiseVar = new eise();
        a = eiseVar;
        eyfy.registerDefaultInstance(eise.class, eiseVar);
    }

    private eise() {
        eyfy.emptyProtobufList();
        eyfy.emptyProtobufList();
        this.b = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"b", eisv.class});
        }
        if (ordinal == 3) {
            return new eise();
        }
        if (ordinal == 4) {
            return new eisd();
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
        synchronized (eise.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
