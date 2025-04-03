package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cisg extends eyfy implements eyht {
    public static final cisg a;
    private static volatile eyhz e;
    public int b;
    public int c = 1;
    public boolean d;

    static {
        cisg cisgVar = new cisg();
        a = cisgVar;
        eyfy.registerDefaultInstance(cisg.class, cisgVar);
    }

    private cisg() {
    }

    public static /* synthetic */ void a(cisg cisgVar) {
        cisgVar.b |= 2;
        cisgVar.d = true;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"b", "c", cise.a, "d"});
        }
        if (ordinal == 3) {
            return new cisg();
        }
        if (ordinal == 4) {
            return new cisd();
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
        synchronized (cisg.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
