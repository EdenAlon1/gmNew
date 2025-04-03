package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eown extends eyfy implements eyht {
    private static volatile eyhz O;
    public static final eown a;
    public epdb A;
    public epdb B;
    public epdb C;
    public epdb D;
    public epdb E;
    public epdb F;
    public epkc G;
    public eoif H;
    public eoif I;
    public eoif J;
    public eoif K;
    public eoif L;
    public eoif M;
    public eoif N;
    public int b;
    public int c;
    public eoif d;
    public eoif e;
    public eoif f;
    public eoif g;
    public eoif h;
    public epdb i;
    public epdb j;
    public epdb k;
    public eoif l;
    public eoif m;
    public eoif n;
    public epdb o;
    public epkc p;
    public epkc q;
    public epkc r;
    public epkc s;
    public eoif t;
    public epdb u;
    public epdb v;
    public eoif w;
    public eoif x;
    public eoif y;
    public eoif z;

    static {
        eown eownVar = new eown();
        a = eownVar;
        eyfy.registerDefaultInstance(eown.class, eownVar);
    }

    private eown() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001%\u0000\u0002\u0001&%\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015\u0017ဉ\u0016\u0018ဉ\u0017\u0019ဉ\u0018\u001aဉ\u0019\u001bဉ\u001a\u001cဉ\u001b\u001dဉ\u001c\u001eဉ\u001d\u001fဉ\u001e ဉ\u001f!ဉ \"ဉ!#ဉ\"$ဉ#%ဉ$&ဉ%", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", VCardConstants.PARAM_ENCODING_B, "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", VCardConstants.PROPERTY_N});
        }
        if (ordinal == 3) {
            return new eown();
        }
        if (ordinal == 4) {
            return new eowm();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = O;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eown.class) {
            eyhzVar = O;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                O = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
