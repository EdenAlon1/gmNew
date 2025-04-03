package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmgn extends eyfy implements eyht {
    public static final cmgn a;
    private static volatile eyhz e;
    public eyhm b = eyhm.a;
    public eyhm c;
    public eyhm d;

    static {
        cmgn cmgnVar = new cmgn();
        a = cmgnVar;
        eyfy.registerDefaultInstance(cmgn.class, cmgnVar);
    }

    private cmgn() {
        eyhm eyhmVar = eyhm.a;
        this.c = eyhmVar;
        this.d = eyhmVar;
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
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"b", cmgl.a, "c", cmgm.a, "d", cmgk.a});
        }
        if (ordinal == 3) {
            return new cmgn();
        }
        if (ordinal == 4) {
            return new cmgj();
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
        synchronized (cmgn.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
