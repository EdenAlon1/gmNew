package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxc extends eyfy implements eyht {
    public static final awxc a;
    private static volatile eyhz n;
    public int b;
    public String c = "";
    public awvj d;
    public awws e;
    public awvf f;
    public awxa g;
    public awwc h;
    public awww i;
    public awvp j;
    public awwh k;
    public awui l;
    public awvv m;

    static {
        awxc awxcVar = new awxc();
        a = awxcVar;
        eyfy.registerDefaultInstance(awxc.class, awxcVar);
    }

    private awxc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\b\tဉ\t\nဉ\u0005\u000bဉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "h", "m"});
        }
        if (ordinal == 3) {
            return new awxc();
        }
        if (ordinal == 4) {
            return new awxb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (awxc.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
