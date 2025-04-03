package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwtx extends eyfy implements eyht {
    public static final dwtx a;
    private static volatile eyhz i;
    public int b;
    public int d;
    public boolean e;
    public long f;
    public int h;
    public String c = "";
    public String g = "";

    static {
        dwtx dwtxVar = new dwtx();
        a = dwtxVar;
        eyfy.registerDefaultInstance(dwtx.class, dwtxVar);
    }

    private dwtx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0000\u0004ဈ\u0000\u0005᠌\u0001\bဇ\u0002\tဂ\u0003\nဈ\u0004\u000bင\u0005", new Object[]{"b", "c", "d", dwtj.a, "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new dwtx();
        }
        if (ordinal == 4) {
            return new dwtw();
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
        synchronized (dwtx.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
