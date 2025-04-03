package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emim extends eyfy implements eyht {
    public static final emim a;
    private static volatile eyhz i;
    public emhv b;
    public float c;
    public boolean d;
    public int e;
    public eygr f = emptyProtobufList();
    public eygr g = emptyProtobufList();
    public float h;
    private int j;

    static {
        emim emimVar = new emim();
        a = emimVar;
        eyfy.registerDefaultInstance(emim.class, emimVar);
    }

    private emim() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005\u001b\u0006\u001b\u0007ခ\u0004", new Object[]{"j", "b", "c", "d", "e", "f", emil.class, "g", emii.class, "h"});
        }
        if (ordinal == 3) {
            return new emim();
        }
        if (ordinal == 4) {
            return new emij();
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
        synchronized (emim.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
