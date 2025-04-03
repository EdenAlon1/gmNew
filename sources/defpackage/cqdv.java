package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqdv extends eyfy implements eyht {
    public static final cqdv a;
    private static volatile eyhz h;
    public int b;
    public boolean c;
    public eyja d;
    public eyja e;
    public eyja f;
    public boolean g;

    static {
        cqdv cqdvVar = new cqdv();
        a = cqdvVar;
        eyfy.registerDefaultInstance(cqdv.class, cqdvVar);
    }

    private cqdv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new cqdv();
        }
        if (ordinal == 4) {
            return new cqdu();
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
        synchronized (cqdv.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
