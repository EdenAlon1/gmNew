package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erhb extends eyfy implements eyht {
    public static final erhb a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public boolean d;
    public eygi e = emptyIntList();
    public boolean f;
    public ergv g;
    public boolean h;

    static {
        erhb erhbVar = new erhb();
        a = erhbVar;
        eyfy.registerDefaultInstance(erhb.class, erhbVar);
    }

    private erhb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0003ဇ\u0002\u0006'\u0007ဇ\u0005\bဉ\u0006\u000bဇ\t", new Object[]{"b", "c", erha.a, "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new erhb();
        }
        if (ordinal == 4) {
            return new ergz();
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
        synchronized (erhb.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
