package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eslh extends eyfy implements eyht {
    public static final eslh a;
    private static volatile eyhz i;
    public int b;
    public String c = "";
    public esls d;
    public long e;
    public faom f;
    public int g;
    public int h;

    static {
        eslh eslhVar = new eslh();
        a = eslhVar;
        eyfy.registerDefaultInstance(eslh.class, eslhVar);
    }

    private eslh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0002\u0004ဉ\u0001\u0005\u000b\u0006\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new eslh();
        }
        if (ordinal == 4) {
            return new eslg();
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
        synchronized (eslh.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
