package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class faab extends eyfy implements eyht {
    public static final faab a;
    private static volatile eyhz j;
    public Object c;
    public int d;
    public int h;
    public boolean i;
    public int b = 0;
    public String e = "";
    public String f = "";
    public eygr g = emptyProtobufList();

    static {
        faab faabVar = new faab();
        a = faabVar;
        eyfy.registerDefaultInstance(faab.class, faabVar);
    }

    private faab() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0001\u0000\u0001\n\n\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b", new Object[]{"c", "b", "d", "e", "h", faat.class, ezzp.class, faad.class, ezzr.class, "i", "f", "g", fabf.class});
        }
        if (ordinal == 3) {
            return new faab();
        }
        if (ordinal == 4) {
            return new faaa();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (faab.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
