package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvas extends eyfy implements eyht {
    public static final cvas a;
    private static volatile eyhz l;
    public int b;
    public eyhm c = eyhm.a;
    public eyhm d;
    public eyhm e;
    public long f;
    public long g;
    public boolean h;
    public eyja i;
    public cvah j;
    public long k;

    static {
        cvas cvasVar = new cvas();
        a = cvasVar;
        eyfy.registerDefaultInstance(cvas.class, cvasVar);
    }

    private cvas() {
        eyhm eyhmVar = eyhm.a;
        this.d = eyhmVar;
        this.e = eyhmVar;
    }

    public final boolean a(String str) {
        return this.d.containsKey(str);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\n\t\u0003\u0000\u0000\u00012\u00022\u00032\u0004\u0002\u0006\u0002\u0007\u0007\bဉ\u0000\tဉ\u0001\n\u0002", new Object[]{"b", "c", cvaq.a, "d", cvap.a, "e", cvar.a, "f", "g", "h", "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new cvas();
        }
        if (ordinal == 4) {
            return new cvao();
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
        synchronized (cvas.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
