package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwow extends eyfy implements eyht {
    public static final dwow a;
    private static volatile eyhz f;
    public int b;
    public boolean c = true;
    public boolean d = true;
    public boolean e;

    static {
        dwow dwowVar = new dwow();
        a = dwowVar;
        eyfy.registerDefaultInstance(dwow.class, dwowVar);
    }

    private dwow() {
    }

    static /* synthetic */ void a(dwow dwowVar) {
        dwowVar.b |= 4;
        dwowVar.e = false;
    }

    static /* synthetic */ void b(dwow dwowVar) {
        dwowVar.b |= 2;
        dwowVar.d = true;
    }

    static /* synthetic */ void c(dwow dwowVar) {
        dwowVar.b |= 1;
        dwowVar.c = true;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new dwow();
        }
        if (ordinal == 4) {
            return new dwov();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dwow.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
