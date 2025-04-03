package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etek extends eyfy implements eyht {
    public static final etek a;
    private static volatile eyhz g;
    public int b;
    public etfd c;
    public eyee d = eyee.b;
    public String e = "";
    public eygr f = emptyProtobufList();

    static {
        etek etekVar = new etek();
        a = etekVar;
        eyfy.registerDefaultInstance(etek.class, etekVar);
    }

    private etek() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\n\u0003Ȉ\u0004\u001c", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new etek();
        }
        if (ordinal == 4) {
            return new etej();
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
        synchronized (etek.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
