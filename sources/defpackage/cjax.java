package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjax extends eyfy implements eyht {
    public static final cjax a;
    private static volatile eyhz g;
    public int b;
    public boolean d;
    public boolean e;
    public eyhm c = eyhm.a;
    public boolean f = true;

    static {
        cjax cjaxVar = new cjax();
        a = cjaxVar;
        eyfy.registerDefaultInstance(cjax.class, cjaxVar);
    }

    private cjax() {
    }

    public final eyhm a() {
        eyhm eyhmVar = this.c;
        if (!eyhmVar.b) {
            this.c = eyhmVar.a();
        }
        return this.c;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u00012\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"b", "c", cjaw.a, "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cjax();
        }
        if (ordinal == 4) {
            return new cjav();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cjax.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
