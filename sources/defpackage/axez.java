package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axez extends eyfy<axez, axep> implements eyht {
    private static volatile eyhz T;
    public static final axez a;
    public boolean A;
    public boolean B;
    public axky C;
    public boolean D;
    public int E;
    public axkv G;
    public eyja H;
    public eyja I;
    public eyja M;
    public eyja N;
    public eyev P;
    public eyev R;
    public eyja S;
    public int b;
    public int c;
    public boolean e;
    public int f;
    public eyja i;
    public boolean k;
    public int l;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public axkq s;
    public axeo t;
    public axei u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public axey z;
    public eyhm F = eyhm.a;
    public boolean d = true;
    public String g = "";
    public String h = "";
    public String j = "";
    public String m = "";
    public String J = "";
    public String K = "";
    public eygr L = eyfy.emptyProtobufList();
    public String O = "";
    public String Q = "";

    static {
        axez axezVar = new axez();
        a = axezVar;
        eyfy.registerDefaultInstance(axez.class, axezVar);
    }

    private axez() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = axet.a;
            return newMessageInfo(a, "\u0001*\u0000\u0002\u00015*\u0001\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဇ\u0007\t᠌\b\nဈ\t\u000bင\n\f᠌\u000b\rင\f\u000eဇ\r\u000f᠌\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015\u001a᠌\u0018\u001eဉ\u001b\u001fဇ\u001c ဇ\u001d!ဉ\u001e\"ဇ\u001f#င $2&ဉ\"'ဉ#(ဉ$*ဈ%,ဈ&-\u001a.ဉ'/ဉ(0ဈ)1ဉ*3ဈ,4ဉ-5ဉ.", new Object[]{"b", "c", "d", "e", "f", axmh.a, "g", "h", "i", "j", "k", "l", eyggVar, "m", "n", "o", axev.a, "p", "q", "r", eyggVar, "s", "t", "u", "v", "w", "x", "y", axer.a, "z", "A", VCardConstants.PARAM_ENCODING_B, "C", "D", "E", "F", axeq.a, "G", "H", "I", "J", "K", "L", "M", VCardConstants.PROPERTY_N, "O", "P", "Q", "R", "S"});
        }
        if (ordinal == 3) {
            return new axez();
        }
        if (ordinal == 4) {
            return new axep();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = T;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (axez.class) {
            eyhzVar = T;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                T = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
