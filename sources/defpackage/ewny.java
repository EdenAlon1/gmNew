package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewny extends eyfy implements eyht {
    public static final ewny a;
    private static volatile eyhz i;
    public int b;
    public ewmy c;
    public int f;
    public ewnm g;
    public String d = "";
    public eygr e = eyfy.emptyProtobufList();
    public eygr h = eyfy.emptyProtobufList();

    static {
        ewny ewnyVar = new ewny();
        a = ewnyVar;
        eyfy.registerDefaultInstance(ewny.class, ewnyVar);
    }

    private ewny() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ț\u0004\f\u0006ဉ\u0001\u0007Ț", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new ewny();
        }
        if (ordinal == 4) {
            return new ewnx();
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
        synchronized (ewny.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
