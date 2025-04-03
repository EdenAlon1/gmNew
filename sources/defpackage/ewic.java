package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewic extends eyfy implements eyht {
    public static final ewic a;
    private static volatile eyhz b;
    private int c;
    private ewia d;
    private ewia e;
    private ewia f;
    private ewhn g;

    static {
        ewic ewicVar = new ewic();
        a = ewicVar;
        eyfy.registerDefaultInstance(ewic.class, ewicVar);
    }

    private ewic() {
    }

    public static /* synthetic */ void a(ewic ewicVar, ewia ewiaVar) {
        ewiaVar.getClass();
        ewicVar.f = ewiaVar;
        ewicVar.c |= 4;
    }

    public static /* synthetic */ void b(ewic ewicVar, ewia ewiaVar) {
        ewiaVar.getClass();
        ewicVar.e = ewiaVar;
        ewicVar.c |= 2;
    }

    public static /* synthetic */ void c(ewic ewicVar, ewhn ewhnVar) {
        ewhnVar.getClass();
        ewicVar.g = ewhnVar;
        ewicVar.c |= 8;
    }

    public static /* synthetic */ void d(ewic ewicVar, ewia ewiaVar) {
        ewiaVar.getClass();
        ewicVar.d = ewiaVar;
        ewicVar.c |= 1;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new ewic();
        }
        if (ordinal == 4) {
            return new ewib();
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
        synchronized (ewic.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
