package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eovu extends eyfy implements eyht {
    public static final eovu a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    private boolean l;

    static {
        eovu eovuVar = new eovu();
        a = eovuVar;
        eyfy.registerDefaultInstance(eovu.class, eovuVar);
    }

    private eovu() {
    }

    public static /* synthetic */ void a(eovu eovuVar) {
        eovuVar.b |= 2;
        eovuVar.l = true;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b", new Object[]{"b", "c", eolc.a, "l", "d", "e", "f", "g", "h", "i", eovt.a, "j"});
        }
        if (ordinal == 3) {
            return new eovu();
        }
        if (ordinal == 4) {
            return new eovs();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eovu.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
