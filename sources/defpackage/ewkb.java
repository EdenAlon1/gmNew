package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewkb extends eyfy implements eyht {
    public static final ewkb a;
    private static volatile eyhz d;
    public int b;
    public ewjg c;
    private boolean e;

    static {
        ewkb ewkbVar = new ewkb();
        a = ewkbVar;
        eyfy.registerDefaultInstance(ewkb.class, ewkbVar);
    }

    private ewkb() {
    }

    public static /* synthetic */ void a(ewkb ewkbVar) {
        ewkbVar.b |= 2;
        ewkbVar.e = true;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "e"});
        }
        if (ordinal == 3) {
            return new ewkb();
        }
        if (ordinal == 4) {
            return new ewka();
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
        synchronized (ewkb.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
