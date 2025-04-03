package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbzv extends eyfy implements eyht {
    public static final fbzv a;
    private static volatile eyhz h;
    public int b;
    public fcek c;
    public eygr d = emptyProtobufList();
    public fbzt e;
    public fcfo f;
    public long g;

    static {
        fbzv fbzvVar = new fbzv();
        a = fbzvVar;
        eyfy.registerDefaultInstance(fbzv.class, fbzvVar);
    }

    private fbzv() {
        eyee eyeeVar = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\t\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005\u0002\t\u001c", new Object[]{"b", "c", "e", "f", "g", "d"});
        }
        if (ordinal == 3) {
            return new fbzv();
        }
        if (ordinal == 4) {
            return new fbzu();
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
        synchronized (fbzv.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
