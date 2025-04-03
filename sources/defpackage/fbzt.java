package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbzt extends eyfy implements eyht {
    public static final fbzt a;
    private static volatile eyhz n;
    public int b;
    public int d;
    public long f;
    public fcek g;
    public fcek i;
    public fcek j;
    public int k;
    public fcah l;
    public long m;
    public String c = "";
    public eyee e = eyee.b;
    public eyee h = eyee.b;

    static {
        fbzt fbztVar = new fbzt();
        a = fbztVar;
        eyfy.registerDefaultInstance(fbzt.class, fbztVar);
    }

    private fbzt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u000b\u0000\u0001\u0001\u0017\u000b\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002\u0005\f\u0007\u0002\bဉ\u0000\tဉ\u0001\nဉ\u0002\f\n\u0011\n\u0017ဉ\u0003", new Object[]{"b", "c", "d", "f", "k", "m", "g", "i", "j", "e", "h", "l"});
        }
        if (ordinal == 3) {
            return new fbzt();
        }
        if (ordinal == 4) {
            return new fbzq();
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
        synchronized (fbzt.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
