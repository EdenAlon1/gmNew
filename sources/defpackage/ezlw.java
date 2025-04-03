package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezlw extends eyfy implements eyht {
    public static final ezlw a;
    private static volatile eyhz i;
    public Object c;
    public int d;
    public int e;
    public int h;
    public int b = 0;
    public String f = "";
    public String g = "";

    static {
        ezlw ezlwVar = new ezlw();
        a = ezlwVar;
        eyfy.registerDefaultInstance(ezlw.class, ezlwVar);
    }

    private ezlw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b\f", new Object[]{"c", "b", "d", "e", "f", "g", ezli.class, ezlm.class, ezlp.class, ezlv.class, ezlt.class, ezlr.class, "h"});
        }
        if (ordinal == 3) {
            return new ezlw();
        }
        if (ordinal == 4) {
            return new ezlg();
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
        synchronized (ezlw.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
