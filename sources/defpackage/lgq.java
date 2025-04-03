package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lgq implements lgo {
    private final String a;

    public lgq(String str) {
        this.a = str;
    }

    @Override // defpackage.lgo
    public final boolean b(CharSequence charSequence, int i, int i2, lhc lhcVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
            return true;
        }
        lhcVar.c = lhcVar.c() | 4;
        return false;
    }

    @Override // defpackage.lgo
    public final /* bridge */ /* synthetic */ Object a() {
        return this;
    }
}
