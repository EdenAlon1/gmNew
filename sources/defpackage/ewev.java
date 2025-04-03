package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewev extends eyfy implements eyht {
    public static final ewev a;
    private static volatile eyhz i;
    public int b;
    public eyee c = eyee.b;
    public eyee d;
    public eyee e;
    public ewfs f;
    public eygr g;
    public int h;

    static {
        ewev ewevVar = new ewev();
        a = ewevVar;
        eyfy.registerDefaultInstance(ewev.class, ewevVar);
    }

    private ewev() {
        eyee eyeeVar = eyee.b;
        this.d = eyeeVar;
        this.e = eyeeVar;
        this.g = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0001\u0000\u0001\n\u0002\n\u0006\n\fဉ\u0003\r\u001b\u000e\f", new Object[]{"b", "c", "d", "e", "f", "g", ewfp.class, "h"});
        }
        if (ordinal == 3) {
            return new ewev();
        }
        if (ordinal == 4) {
            return new ewet();
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
        synchronized (ewev.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
