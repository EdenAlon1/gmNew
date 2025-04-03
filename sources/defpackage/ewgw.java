package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewgw extends eyfy implements eyht {
    public static final ewgw a;
    private static volatile eyhz g;
    public int b;
    public Object d;
    public eyev f;
    public int c = 0;
    public String e = "";

    static {
        ewgw ewgwVar = new ewgw();
        a = ewgwVar;
        eyfy.registerDefaultInstance(ewgw.class, ewgwVar);
    }

    private ewgw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", "f", ewht.class, ewhh.class, ewhw.class, ewie.class});
        }
        if (ordinal == 3) {
            return new ewgw();
        }
        if (ordinal == 4) {
            return new ewgv();
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
        synchronized (ewgw.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
