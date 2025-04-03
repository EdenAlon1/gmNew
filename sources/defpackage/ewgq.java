package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewgq extends eyfy implements eyht {
    public static final ewgq a;
    private static volatile eyhz d;
    public int b;
    public ewgk c;

    static {
        ewgq ewgqVar = new ewgq();
        a = ewgqVar;
        eyfy.registerDefaultInstance(ewgq.class, ewgqVar);
    }

    private ewgq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001LL\u0001\u0000\u0000\u0000Lဉ\u001e", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ewgq();
        }
        if (ordinal == 4) {
            return new ewgp();
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
        synchronized (ewgq.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
