package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eson extends eyfy implements eyht {
    public static final eson a;
    private static volatile eyhz f;
    public boolean b;
    public eyee c = eyee.b;
    public String d = "";
    public String e = "";

    static {
        eson esonVar = new eson();
        a = esonVar;
        eyfy.registerDefaultInstance(eson.class, esonVar);
    }

    private eson() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\n\u0003Ȉ\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new eson();
        }
        if (ordinal == 4) {
            return new esom();
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
        synchronized (eson.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
