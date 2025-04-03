package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyaj extends eyfy implements eyht {
    public static final eyaj a;
    private static volatile eyhz l;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public fauw f;
    public fauw g;
    public int h;
    public exzp i;
    public exzp j;
    public eyac k;

    static {
        eyaj eyajVar = new eyaj();
        a = eyajVar;
        eyfy.registerDefaultInstance(eyaj.class, eyajVar);
    }

    private eyaj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b<\u0000\t<\u0000", new Object[]{"d", "c", "b", "e", eyah.a, "f", "g", "h", eyad.a, "i", "j", "k", eyag.class, eyag.class});
        }
        if (ordinal == 3) {
            return new eyaj();
        }
        if (ordinal == 4) {
            return new exzq();
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
        synchronized (eyaj.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
