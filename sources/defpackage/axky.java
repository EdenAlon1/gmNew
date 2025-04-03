package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axky extends eyfy implements eyht {
    public static final axky a;
    private static volatile eyhz o;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    static {
        axky axkyVar = new axky();
        a = axkyVar;
        eyfy.registerDefaultInstance(axky.class, axkyVar);
    }

    private axky() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0004\u0004ဂ\u0005\u0005ဋ\u0006\u0006ဋ\u0007\u0007ဋ\b\bဋ\t\tဋ\n\nဋ\u000b\u000bဋ\f\fဋ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        }
        if (ordinal == 3) {
            return new axky();
        }
        if (ordinal == 4) {
            return new axkx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = o;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (axky.class) {
            eyhzVar = o;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                o = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
