package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rrv extends eyfy implements eyht {
    public static final rrv a;
    private static volatile eyhz c;
    public eygh b = emptyFloatList();

    static {
        rrv rrvVar = new rrv();
        a = rrvVar;
        eyfy.registerDefaultInstance(rrv.class, rrvVar);
    }

    private rrv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0013", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new rrv();
        }
        if (ordinal == 4) {
            return new rru();
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
        synchronized (rrv.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
