package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dchy extends dchw {
    public dchy(Context context, ctud ctudVar, ContentResolver contentResolver, errl errlVar, bdjd bdjdVar, dchi dchiVar) {
        super(context, ctudVar, contentResolver, errlVar, bdjdVar, dchiVar);
    }

    @Override // defpackage.dchw, defpackage.dchz
    public final int b(int i) {
        if (i == 0 && this.f) {
            return 12;
        }
        return !this.b.s() ? 2 : 1;
    }

    @Override // defpackage.dchw, defpackage.dchz
    public final int c() {
        return (this.f ? 1 : 0) + (!this.b.s() ? 1 : 0);
    }

    @Override // defpackage.dchz
    public final epts e() {
        return epts.GALLERY;
    }

    @Override // defpackage.dchz
    public final eptu f() {
        return eptu.COLLAPSED;
    }

    @Override // defpackage.dchw
    public final int k() {
        return 12;
    }
}
