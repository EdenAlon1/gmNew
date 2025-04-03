package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewbg extends eyfy implements eyht {
    public static final ewbg a;
    private static volatile eyhz i;
    public int b;
    public eweb c;
    public eydq d;
    public int e;
    public ewbb f;
    public ewee g;
    public eyhm h = eyhm.a;

    static {
        ewbg ewbgVar = new ewbg();
        a = ewbgVar;
        eyfy.registerDefaultInstance(ewbg.class, ewbgVar);
    }

    private ewbg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0004\u0004ဉ\u0002\u0005ဉ\u0003\u00062", new Object[]{"b", "c", "d", "e", "f", "g", "h", ewbf.a});
        }
        if (ordinal == 3) {
            return new ewbg();
        }
        if (ordinal == 4) {
            return new ewbe();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewbg.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
