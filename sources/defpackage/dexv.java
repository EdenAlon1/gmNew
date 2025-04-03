package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dexv extends eyfy implements eyht {
    public static final dexv a;
    private static volatile eyhz n;
    public Object c;
    public int e;
    public int b = 0;
    public String d = "";
    public eygr f = eyfy.emptyProtobufList();
    public eygi g = emptyIntList();
    public eygi h = emptyIntList();
    public eygi i = emptyIntList();
    public eygl j = emptyLongList();
    public eygh k = emptyFloatList();
    public eygd l = emptyDoubleList();
    public eygc m = emptyBooleanList();

    static {
        dexv dexvVar = new dexv();
        a = dexvVar;
        eyfy.registerDefaultInstance(dexv.class, dexvVar);
    }

    private dexv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0012\u0001\u0000\u0001\u0012\u0012\u0000\b\u0000\u0001Ȉ\u0002\f\u0003Ȼ\u0000\u00047\u0000\u00057\u0000\u00067\u0000\u00075\u0000\b4\u0000\t3\u0000\n:\u0000\u000bȚ\f'\r'\u000e'\u000f%\u0010$\u0011#\u0012*", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (ordinal == 3) {
            return new dexv();
        }
        if (ordinal == 4) {
            return new dext();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dexv.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
