package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fajw extends eyfy implements eyht {
    public static final fajw a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public eygi d = emptyIntList();
    public String e = "";
    public String f = "";
    public eygr g = emptyProtobufList();

    static {
        fajw fajwVar = new fajw();
        a = fajwVar;
        eyfy.registerDefaultInstance(fajw.class, fajwVar);
    }

    private fajw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", fajt.class});
        }
        if (ordinal == 3) {
            return new fajw();
        }
        if (ordinal == 4) {
            return new faju();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fajw.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
