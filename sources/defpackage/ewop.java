package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewop extends eyfy implements eyht {
    public static final ewop a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public eyhm d = eyhm.a;

    static {
        ewop ewopVar = new ewop();
        a = ewopVar;
        eyfy.registerDefaultInstance(ewop.class, ewopVar);
    }

    private ewop() {
    }

    public final eyhm a() {
        eyhm eyhmVar = this.d;
        if (!eyhmVar.b) {
            this.d = eyhmVar.a();
        }
        return this.d;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"b", "c", "d", ewoo.a});
        }
        if (ordinal == 3) {
            return new ewop();
        }
        if (ordinal == 4) {
            return new ewon();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewop.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
