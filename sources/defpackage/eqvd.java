package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqvd extends eyfy implements eyht {
    public static final eqvd a;
    private static volatile eyhz d;
    public int b;
    public int c;
    private int e;
    private int f;
    private int g;
    private int h;

    static {
        eqvd eqvdVar = new eqvd();
        a = eqvdVar;
        eyfy.registerDefaultInstance(eqvd.class, eqvdVar);
    }

    private eqvd() {
    }

    public static /* synthetic */ void a(eqvd eqvdVar) {
        eqvdVar.b |= 16;
        eqvdVar.h = 0;
    }

    public static /* synthetic */ void b(eqvd eqvdVar) {
        eqvdVar.b |= 1;
        eqvdVar.e = 0;
    }

    public static /* synthetic */ void c(eqvd eqvdVar) {
        eqvdVar.b |= 2;
        eqvdVar.f = 0;
    }

    public static /* synthetic */ void d(eqvd eqvdVar) {
        eqvdVar.b |= 8;
        eqvdVar.g = 0;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "e", "f", "c", "g", "h"});
        }
        if (ordinal == 3) {
            return new eqvd();
        }
        if (ordinal == 4) {
            return new eqvc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqvd.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
