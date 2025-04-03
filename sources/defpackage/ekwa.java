package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekwa extends eyfy implements eyht {
    public static final ekwa a;
    private static volatile eyhz g;
    public int b;
    public long e;
    public long c = -1;
    public eygr d = emptyProtobufList();
    public eygi f = emptyIntList();

    static {
        ekwa ekwaVar = new ekwa();
        a = ekwaVar;
        eyfy.registerDefaultInstance(ekwa.class, ekwaVar);
    }

    private ekwa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001\u0004\u0016", new Object[]{"b", "c", "d", ekvy.class, "e", "f"});
        }
        if (ordinal == 3) {
            return new ekwa();
        }
        if (ordinal == 4) {
            return new ekvz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ekwa.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
