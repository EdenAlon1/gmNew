package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewkv extends eyfy implements eyht {
    public static final ewkv a;
    private static volatile eyhz h;
    public boolean d;
    public ewkt f;
    private int i;
    public String b = "";
    public String c = "";
    public String e = "";
    public eygr g = emptyProtobufList();

    static {
        ewkv ewkvVar = new ewkv();
        a = ewkvVar;
        eyfy.registerDefaultInstance(ewkv.class, ewkvVar);
    }

    private ewkv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006\u001b", new Object[]{"i", "b", "c", "d", "e", "f", "g", ewmb.class});
        }
        if (ordinal == 3) {
            return new ewkv();
        }
        if (ordinal == 4) {
            return new ewku();
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
        synchronized (ewkv.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
