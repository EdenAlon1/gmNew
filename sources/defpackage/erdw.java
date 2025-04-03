package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdw extends eyfy implements eyht {
    public static final erdw a;
    private static volatile eyhz l;
    public int b;
    public int c;
    public erdz d;
    public int e;
    public float f;
    public int g;
    public int i;
    public int j;
    public eygi h = emptyIntList();
    public String k = "";

    static {
        erdw erdwVar = new erdw();
        a = erdwVar;
        eyfy.registerDefaultInstance(erdw.class, erdwVar);
    }

    private erdw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0002\u0003ခ\u0003\u0004ဌ\u0004\u0005,\u0006ဉ\u0001\u0007ဌ\u0005\bဌ\u0006\tለ\u0007", new Object[]{"b", "c", "e", "f", "g", "h", "d", "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new erdw();
        }
        if (ordinal == 4) {
            return new erdv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erdw.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
