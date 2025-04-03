package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoqk extends eyfy implements eyht {
    public static final eoqk a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public int g;
    public int h;

    static {
        eoqk eoqkVar = new eoqk();
        a = eoqkVar;
        eyfy.registerDefaultInstance(eoqk.class, eoqkVar);
    }

    private eoqk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", eoqj.a, "h"});
        }
        if (ordinal == 3) {
            return new eoqk();
        }
        if (ordinal == 4) {
            return new eoqi();
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
        synchronized (eoqk.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
