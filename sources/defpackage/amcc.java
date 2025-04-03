package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amcc extends eyfy implements eyht {
    public static final amcc a;
    private static volatile eyhz d;
    public eygr b = eyfy.emptyProtobufList();
    public boolean c;

    static {
        amcc amccVar = new amcc();
        a = amccVar;
        eyfy.registerDefaultInstance(amcc.class, amccVar);
    }

    private amcc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\u0007", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new amcc();
        }
        if (ordinal == 4) {
            return new amcb();
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
        synchronized (amcc.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
