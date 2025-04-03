package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clrd extends eyfy implements eyht {
    public static final clrd a;
    private static volatile eyhz f;
    public int b;
    public eydq c;
    public clns d;
    public eygr e = emptyProtobufList();

    static {
        clrd clrdVar = new clrd();
        a = clrdVar;
        eyfy.registerDefaultInstance(clrd.class, clrdVar);
    }

    private clrd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", clqv.class});
        }
        if (ordinal == 3) {
            return new clrd();
        }
        if (ordinal == 4) {
            return new clrc();
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
        synchronized (clrd.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
