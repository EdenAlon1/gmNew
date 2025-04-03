package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epic extends eyfy implements eyht {
    public static final epic a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public eyee e = eyee.b;

    static {
        epic epicVar = new epic();
        a = epicVar;
        eyfy.registerDefaultInstance(epic.class, epicVar);
    }

    private epic() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ည\u0002", new Object[]{"b", "c", epib.a, "d", epid.a, "e"});
        }
        if (ordinal == 3) {
            return new epic();
        }
        if (ordinal == 4) {
            return new epia();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epic.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
