package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyom extends eyfy implements eyht {
    public static final eygj a = new eyok();
    public static final eyom b;
    private static volatile eyhz n;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public eyod g;
    public boolean h;
    public boolean i;
    public boolean j;
    public eygi k = emptyIntList();
    public boolean l;
    public boolean m;
    private int o;

    static {
        eyom eyomVar = new eyom();
        b = eyomVar;
        eyfy.registerDefaultInstance(eyom.class, eyomVar);
    }

    private eyom() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0001\u000b\u0000\u0001\u0004\u001b\u000b\u0000\u0001\u0000\u0004ဇ\u0003\nဇ\t\fဇ\u000b\rဇ\f\u0011ဉ\u0010\u0013ဇ\u0012\u0016ဇ\u0015\u0017ဇ\u0016\u0019ࠬ\u001aဇ\u0018\u001bဇ\u0019", new Object[]{"o", "c", "d", "e", "f", "g", "h", "i", "j", "k", ezia.a, "l", "m"});
        }
        if (ordinal == 3) {
            return new eyom();
        }
        if (ordinal == 4) {
            return new eyol();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyom.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
