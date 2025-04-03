package defpackage;

import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcbr extends eyfy implements eyht {
    public static final fcbr a;
    private static volatile eyhz s;
    public int b;
    public Object d;
    public fcei e;
    public fcfa i;
    public fcks l;
    public fceb m;
    public fcee o;
    public TachyonCommon$PublicPreKeySets p;
    public int c = 0;
    public String f = "";
    public eyee g = eyee.b;
    public String h = "";
    public String j = "";
    public eygi k = emptyIntList();
    public eyee n = eyee.b;
    public String q = "";
    public String r = "";

    static {
        fcbr fcbrVar = new fcbr();
        a = fcbrVar;
        eyfy.registerDefaultInstance(fcbr.class, fcbrVar);
    }

    private fcbr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0010\u0001\u0001\u0001$\u0010\u0000\u0001\u0000\u0001ဉ\u0000\u0003Ȉ\u0004\n\u0005Ȉ\u0006ဉ\u0002\u0007Ȼ\u0000\bȈ\t'\u0010ဉ\u0007\u001cဉ\n\u001eဉ\u0003\u001fဉ\u0004!Ȉ\"Ȉ#Ȼ\u0000$ည\u0005", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", "o", "p", "l", "m", "q", "r", "n"});
        }
        if (ordinal == 3) {
            return new fcbr();
        }
        if (ordinal == 4) {
            return new fcbq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = s;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcbr.class) {
            eyhzVar = s;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                s = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
