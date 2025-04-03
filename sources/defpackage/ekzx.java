package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekzx extends eyfy implements eyht {
    public static final ekzx a;
    private static volatile eyhz n;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public long f;
    public int g;
    public long h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;

    static {
        ekzx ekzxVar = new ekzx();
        a = ekzxVar;
        eyfy.registerDefaultInstance(ekzx.class, ekzxVar);
    }

    private ekzx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0005\u0006ဇ\b\u0007င\u0007\b᠌\t\tဇ\n\nင\u0004\u000bင\u0006", new Object[]{"b", "c", "d", "e", "f", "h", "k", "j", "l", ekzv.a, "m", "g", "i"});
        }
        if (ordinal == 3) {
            return new ekzx();
        }
        if (ordinal == 4) {
            return new ekzu();
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
        synchronized (ekzx.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
