package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dexe extends eyfy implements eyht {
    public static final dexe a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public int g;

    static {
        dexe dexeVar = new dexe();
        a = dexeVar;
        eyfy.registerDefaultInstance(dexe.class, dexeVar);
    }

    private dexe() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new dexe();
        }
        if (ordinal == 4) {
            return new dexb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dexe.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
