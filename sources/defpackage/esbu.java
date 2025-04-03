package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esbu extends eyfy implements eyht {
    public static final esbu a;
    private static volatile eyhz i;
    public int b;
    public erzn d;
    public escu e;
    public boolean g;
    public esbk h;
    public String c = "";
    public String f = "";

    static {
        esbu esbuVar = new esbu();
        a = esbuVar;
        eyfy.registerDefaultInstance(esbu.class, esbuVar);
    }

    private esbu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0000\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u0006\u0007\bဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new esbu();
        }
        if (ordinal == 4) {
            return new esbt();
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
        synchronized (esbu.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
