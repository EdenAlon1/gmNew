package defpackage;

import android.text.Spannable;
import android.text.SpannableString;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lgn implements lgo {
    public lhg a;

    public lgn(lhg lhgVar) {
        this.a = lhgVar;
    }

    @Override // defpackage.lgo
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.lgo
    public final boolean b(CharSequence charSequence, int i, int i2, lhc lhcVar) {
        if ((lhcVar.c & 4) <= 0) {
            if (this.a == null) {
                this.a = new lhg(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.a.setSpan(new lhd(lhcVar), i, i2, 33);
        }
        return true;
    }
}
