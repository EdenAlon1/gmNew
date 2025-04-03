package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exxk extends eyfy implements eyht {
    public static final exxk a;
    private static volatile eyhz l;
    public int b;
    public Object d;
    public long f;
    public long g;
    public long h;
    public exzf i;
    public eyee j;
    public eygi k;
    public int c = 0;
    public String e = "";

    static {
        exxk exxkVar = new exxk();
        a = exxkVar;
        eyfy.registerDefaultInstance(exxk.class, exxkVar);
    }

    private exxk() {
        emptyProtobufList();
        this.j = eyee.b;
        emptyProtobufList();
        this.k = emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0001\u0001\b \f\u0000\u0001\u0000\bဂ\t\nဈ\u0001\f<\u0000\r<\u0000\u0011<\u0000\u0012<\u0000\u0014ဂ\u000e\u0017ဂ\u0005\u0019<\u0000\u001aဉ\u0012\u001dည\u0013 '", new Object[]{"d", "c", "b", "g", "e", exwr.class, exxu.class, exzl.class, exxo.class, "h", "f", exxm.class, "i", "j", "k"});
        }
        if (ordinal == 3) {
            return new exxk();
        }
        if (ordinal == 4) {
            return new exxj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exxk.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
