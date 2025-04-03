package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erei extends eyfy implements eyht {
    public static final erei a;
    private static volatile eyhz i;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public eygr h = emptyProtobufList();

    static {
        erei ereiVar = new erei();
        a = ereiVar;
        eyfy.registerDefaultInstance(erei.class, ereiVar);
    }

    private erei() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005\u001b\u0006ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "h", erdw.class, "g"});
        }
        if (ordinal == 3) {
            return new erei();
        }
        if (ordinal == 4) {
            return new ereh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erei.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
