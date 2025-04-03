package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dchn implements ljv {
    final /* synthetic */ ejtr a;
    final /* synthetic */ ejte b;

    public dchn(ejtr ejtrVar, ejte ejteVar) {
        this.a = ejtrVar;
        this.b = ejteVar;
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        this.a.e(this.b);
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        Uri[] uriArr = dchr.a;
        int length = uriArr.length;
        for (int i = 0; i < 2; i++) {
            this.a.d(uriArr[i], true, this.b);
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
