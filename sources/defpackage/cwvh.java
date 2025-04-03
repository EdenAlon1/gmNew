package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwvh extends cwuk {
    private final ctxt a;
    private String[] b;
    private String[] c;
    private String[] d;
    private Locale e;

    public cwvh(Context context, ctxt ctxtVar) {
        super(context);
        this.a = ctxtVar;
    }

    private static int b(String[] strArr, String str) {
        if (strArr == null) {
            return -1;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (TextUtils.equals(strArr[i], str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.cwuk
    protected final void a(int i) {
        int b;
        csix.d(i, 0, this.d.length - 1);
        String str = (i <= 0 || (b = b(this.c, this.d[i])) < 0) ? "auto" : this.b[b];
        ctxt ctxtVar = this.a;
        ctxtVar.a.l(ctxtVar.b(), str);
    }

    @Override // defpackage.cwuk
    protected final void c() {
        int i = 0;
        Locale f = kqt.a(this.i.getResources().getConfiguration()).f(0);
        if (!Objects.equals(this.e, f)) {
            this.e = f;
            String[] iSOCountries = Locale.getISOCountries();
            this.b = iSOCountries;
            this.c = new String[iSOCountries.length];
            int i2 = 0;
            while (true) {
                String[] strArr = this.b;
                if (i2 >= strArr.length) {
                    break;
                }
                this.c[i2] = new Locale("", strArr[i2]).getDisplayCountry(this.e);
                i2++;
            }
            String[] strArr2 = new String[this.c.length + 1];
            this.d = strArr2;
            strArr2[0] = this.i.getString(R.string.auto_detected_country);
            String[] strArr3 = this.c;
            System.arraycopy(strArr3, 0, this.d, 1, strArr3.length);
            String[] strArr4 = this.d;
            Arrays.sort(strArr4, 1, strArr4.length);
        }
        this.j = this.i.getString(R.string.current_country_pref_title);
        this.k = this.d;
        String a = this.a.a();
        if (!ctxu.a(a)) {
            int b = b(this.b, a);
            i = b < 0 ? -1 : b(this.d, this.c[b]);
        }
        this.l = i;
        super.c();
    }
}
