package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmb implements nkj {
    private final luv a = new luv();
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final float f;
    private final int g;

    public nmb(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = true == "Serif".equals(lvf.I(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = lvf.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    private static void d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & PrivateKeyType.INVALID) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 == 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                }
                z = false;
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    @Override // defpackage.nkj
    public final /* synthetic */ njw a(byte[] bArr, int i, int i2) {
        return nkf.a(this, bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nkj
    public final void b(byte[] bArr, int i, int i2, nki nkiVar, lts ltsVar) {
        String z;
        int i3;
        this.a.I(bArr, i + i2);
        this.a.K(i);
        luv luvVar = this.a;
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        lti.a(luvVar.b() >= 2);
        int n = luvVar.n();
        if (n == 0) {
            z = "";
        } else {
            int i7 = luvVar.b;
            Charset A = luvVar.A();
            int i8 = luvVar.b - i7;
            if (A == null) {
                A = StandardCharsets.UTF_8;
            }
            z = luvVar.z(n - i8, A);
        }
        if (z.isEmpty()) {
            int i9 = engw.d;
            ltsVar.a(new njp(enou.a, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z);
        e(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        d(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f;
        while (true) {
            luv luvVar2 = this.a;
            if (luvVar2.b() < 8) {
                lsy lsyVar = new lsy();
                lsyVar.a = spannableStringBuilder;
                lsyVar.c(f, 0);
                lsyVar.e = 0;
                ltsVar.a(new njp(engw.r(lsyVar.a()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int i10 = luvVar2.b;
            int e = luvVar2.e();
            int e2 = this.a.e();
            if (e2 == 1937013100) {
                lti.a(this.a.b() >= i6 ? i4 : i5);
                int n2 = this.a.n();
                int i11 = i5;
                while (i11 < n2) {
                    luv luvVar3 = this.a;
                    lti.a(luvVar3.b() >= 12 ? i4 : i5);
                    int n3 = luvVar3.n();
                    int n4 = luvVar3.n();
                    luvVar3.L(i6);
                    int j = luvVar3.j();
                    luvVar3.L(i4);
                    int e3 = luvVar3.e();
                    if (n4 > spannableStringBuilder.length()) {
                        luj.f("Tx3gParser", "Truncating styl end (" + n4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        n4 = spannableStringBuilder.length();
                    }
                    if (n3 >= n4) {
                        luj.f("Tx3gParser", a.x(n4, n3, "Ignoring styl with start (", ") >= end (", ")."));
                    } else {
                        int i12 = n4;
                        e(spannableStringBuilder, j, this.c, n3, i12, 0);
                        d(spannableStringBuilder, e3, this.d, n3, i12, 0);
                    }
                    i11++;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (e2 == 1952608120 && this.b) {
                i3 = 2;
                lti.a(this.a.b() >= 2);
                f = lvf.a(this.a.n() / this.g, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            this.a.K(i10 + e);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
    }

    @Override // defpackage.nkj
    public final /* synthetic */ void c() {
    }
}
