package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksc {
    private boolean a;
    private int b;
    private ksg c;

    public ksc() {
        Locale locale = Locale.getDefault();
        int i = kse.d;
        b(TextUtils.getLayoutDirectionFromLocale(locale) == 1);
    }

    private final void b(boolean z) {
        this.a = z;
        this.c = kse.a;
        this.b = 2;
    }

    public final kse a() {
        return (this.b == 2 && this.c == kse.a) ? this.a ? kse.c : kse.b : new kse(this.a, this.b, this.c);
    }

    public ksc(byte[] bArr) {
        b(true);
    }
}
