package defpackage;

import com.android.vcard.VCardBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffpr extends ffpo {
    public static final String A(String str, CharSequence charSequence) {
        if (!ffpc.W(str, charSequence)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        substring.getClass();
        return substring;
    }

    public static final String B(String str, CharSequence charSequence) {
        if (!ffpc.N(str, charSequence)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        substring.getClass();
        return substring;
    }

    public static final String C(CharSequence charSequence, ffmj ffmjVar) {
        ffmjVar.getClass();
        return charSequence.subSequence(ffmjVar.d().intValue(), ffmjVar.c().intValue() + 1).toString();
    }

    public static final String D(String str, char c, String str2) {
        int P = ffpc.P(str, c, 0, 6);
        if (P == -1) {
            return str2;
        }
        String substring = str.substring(P + 1, str.length());
        substring.getClass();
        return substring;
    }

    public static final String E(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int Q = ffpc.Q(str, str2, 0, false, 6);
        if (Q == -1) {
            return str3;
        }
        String substring = str.substring(Q + str2.length(), str.length());
        substring.getClass();
        return substring;
    }

    public static final String F(String str, char c, String str2) {
        str.getClass();
        str2.getClass();
        int R = ffpc.R(str, c, 0, 6);
        if (R == -1) {
            return str2;
        }
        String substring = str.substring(R + 1, str.length());
        substring.getClass();
        return substring;
    }

    public static final List G(CharSequence charSequence) {
        return ffno.g(ffpc.H(charSequence));
    }

    public static final ffnl H(CharSequence charSequence) {
        return ffno.i(T(charSequence, new String[]{VCardBuilder.VCARD_END_OF_LINE, "\n", "\r"}, 0), new ffpq(charSequence));
    }

    public static final boolean I(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (ffpc.Q(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (O(charSequence, charSequence2, 0, charSequence.length(), z) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean J(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ffol.a(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean K(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ffol.e(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean L(CharSequence charSequence, char c) {
        charSequence.getClass();
        return ffpc.P(charSequence, c, 0, 2) >= 0;
    }

    public static /* synthetic */ boolean N(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence instanceof String ? ffpc.n((String) charSequence, (String) charSequence2) : ffpc.K(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    static /* synthetic */ int O(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        ffmj ffmjVar = new ffmj(ffmk.f(i, 0), ffmk.g(i2, charSequence.length()));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = ffmjVar.a;
            int i4 = ffmjVar.b;
            int i5 = ffmjVar.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                return -1;
            }
            int i6 = i3;
            while (!ffpc.K(charSequence2, 0, charSequence, i6, charSequence2.length(), z)) {
                if (i6 == i4) {
                    return -1;
                }
                i6 += i5;
            }
            return i6;
        }
        int i7 = ffmjVar.a;
        int i8 = ffmjVar.b;
        int i9 = ffmjVar.c;
        if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
            return -1;
        }
        int i10 = i7;
        while (true) {
            String str = (String) charSequence2;
            if (ffpc.k(str, 0, (String) charSequence, i10, str.length(), z)) {
                return i10;
            }
            if (i10 == i8) {
                return -1;
            }
            i10 += i9;
        }
    }

    public static /* synthetic */ int P(CharSequence charSequence, char c, int i, int i2) {
        charSequence.getClass();
        boolean z = charSequence instanceof String;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if (z) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        int f = ffmk.f(i, 0);
        int u = ffpc.u(charSequence);
        if (f > u) {
            return -1;
        }
        while (!ffol.e(cArr[0], charSequence.charAt(f), false)) {
            if (f == u) {
                return -1;
            }
            f++;
        }
        return f;
    }

    public static /* synthetic */ int Q(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ffpc.v(charSequence, str, i, z & ((i2 & 4) == 0));
    }

    public static /* synthetic */ int R(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = ffpc.u(charSequence);
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static final String S(String str, int i) {
        CharSequence charSequence;
        str.getClass();
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            if (length > 0) {
                int i2 = 1;
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    static /* synthetic */ ffnl T(CharSequence charSequence, String[] strArr, int i) {
        return new ffoq(charSequence, i, new ffpp(ffdo.c(strArr)));
    }

    public static /* synthetic */ List U(CharSequence charSequence, char[] cArr) {
        charSequence.getClass();
        return Z(charSequence, String.valueOf(cArr[0]), 0);
    }

    public static /* synthetic */ List V(CharSequence charSequence, String[] strArr, int i, int i2) {
        charSequence.getClass();
        String str = strArr[0];
        int length = str.length();
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (length != 0) {
            return Z(charSequence, str, i);
        }
        ffny ffnyVar = new ffny(T(charSequence, strArr, i));
        ArrayList arrayList = new ArrayList(ffdx.n(ffnyVar, 10));
        Iterator it = ffnyVar.iterator();
        while (it.hasNext()) {
            arrayList.add(ffpc.C(charSequence, (ffmj) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ boolean W(CharSequence charSequence, CharSequence charSequence2) {
        if (!(charSequence2 instanceof String)) {
            return ffpc.K(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
        }
        return ffpc.t((String) charSequence, (String) charSequence2);
    }

    public static /* synthetic */ String X(String str) {
        int Y = ffpc.Y(str, "(");
        if (Y == -1) {
            return str;
        }
        String substring = str.substring(0, Y);
        substring.getClass();
        return substring;
    }

    public static /* synthetic */ int Y(CharSequence charSequence, String str) {
        int u = ffpc.u(charSequence);
        charSequence.getClass();
        return ((String) charSequence).lastIndexOf(str, u);
    }

    private static final List Z(CharSequence charSequence, String str, int i) {
        int v = ffpc.v(charSequence, str, 0, false);
        if (v != -1) {
            if (i != 1) {
                boolean z = i > 0;
                ArrayList arrayList = new ArrayList(z ? ffmk.g(i, 10) : 10);
                int i2 = 0;
                do {
                    arrayList.add(charSequence.subSequence(i2, v).toString());
                    i2 = str.length() + v;
                    if (z && arrayList.size() == i - 1) {
                        break;
                    }
                    v = ffpc.v(charSequence, str, i2, false);
                } while (v != -1);
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                return arrayList;
            }
        }
        return ffdx.g(charSequence.toString());
    }

    public static final int u(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static final int v(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? O(charSequence, str, i, charSequence.length(), z) : ((String) charSequence).indexOf(str, i);
    }

    public static final CharSequence w(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            throw new IndexOutOfBoundsException(a.x(i, i2, "End index (", ") is less than start index (", ")."));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final CharSequence x(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a = ffol.a(charSequence.charAt(true != z ? i : length));
            if (z) {
                if (!a) {
                    break;
                }
                length--;
            } else if (a) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final CharSequence y(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!ffol.a(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static final CharSequence z(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!ffol.a(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }
}
