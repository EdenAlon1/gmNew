package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cesy extends eyfy implements eyht {
    public static final cesy a;
    private static volatile eyhz d;
    public int b;
    public boolean c;

    static {
        cesy cesyVar = new cesy();
        a = cesyVar;
        eyfy.registerDefaultInstance(cesy.class, cesyVar);
    }

    private cesy() {
    }

    public static /* synthetic */ void a(cesy cesyVar) {
        cesyVar.b |= 1;
        cesyVar.c = true;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new cesy();
        }
        if (ordinal == 4) {
            return new cesx();
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
        synchronized (cesy.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
