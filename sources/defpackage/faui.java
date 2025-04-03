package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faui extends eyfy implements eyht {
    public static final faui a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        faui fauiVar = new faui();
        a = fauiVar;
        eyfy.registerDefaultInstance(faui.class, fauiVar);
    }

    private faui() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new faui();
        }
        if (ordinal == 4) {
            return new fauh();
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
        synchronized (faui.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
