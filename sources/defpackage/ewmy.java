package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewmy extends eyfy implements eyht {
    public static final ewmy a;
    private static volatile eyhz g;
    public int b;
    public eumd c;
    public String d = "";
    public String e = "";
    public eygl f = emptyLongList();

    static {
        ewmy ewmyVar = new ewmy();
        a = ewmyVar;
        eyfy.registerDefaultInstance(ewmy.class, ewmyVar);
    }

    private ewmy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004%", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ewmy();
        }
        if (ordinal == 4) {
            return new ewmx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewmy.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
