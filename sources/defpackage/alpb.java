package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alpb extends eyfy implements eyht {
    public static final alpb a;
    private static volatile eyhz e;
    public int b;
    public int d;
    private eyhm f = eyhm.a;
    public eyhm c = eyhm.a;

    static {
        alpb alpbVar = new alpb();
        a = alpbVar;
        eyfy.registerDefaultInstance(alpb.class, alpbVar);
    }

    private alpb() {
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
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u00012\u00022\u0003င\u0000", new Object[]{"b", "f", alpa.a, "c", aloz.a, "d"});
        }
        if (ordinal == 3) {
            return new alpb();
        }
        if (ordinal == 4) {
            return new aloy();
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
        synchronized (alpb.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
