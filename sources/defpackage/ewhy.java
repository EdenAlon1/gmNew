package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewhy extends eyfy implements eyht {
    public static final ewhy a;
    private static volatile eyhz b;
    private int c;
    private ewik d;
    private boolean e;
    private faun f;

    static {
        ewhy ewhyVar = new ewhy();
        a = ewhyVar;
        eyfy.registerDefaultInstance(ewhy.class, ewhyVar);
    }

    private ewhy() {
    }

    public static /* synthetic */ void a(ewhy ewhyVar, faun faunVar) {
        faunVar.getClass();
        ewhyVar.f = faunVar;
        ewhyVar.c |= 2;
    }

    public static /* synthetic */ void b(ewhy ewhyVar, ewik ewikVar) {
        ewikVar.getClass();
        ewhyVar.d = ewikVar;
        ewhyVar.c |= 1;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003ဉ\u0001", new Object[]{"c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ewhy();
        }
        if (ordinal == 4) {
            return new ewhx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewhy.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
