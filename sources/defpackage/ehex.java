package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehex implements kud {
    final /* synthetic */ int a;
    final /* synthetic */ View b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    public ehex(int i, View view, int i2, int i3, int i4) {
        this.a = i;
        this.b = view;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.kud
    public final kxh ey(View view, kxh kxhVar) {
        int i = this.a;
        kpt f = kxhVar.f(519);
        if (i >= 0) {
            View view2 = this.b;
            view2.getLayoutParams().height = i + f.c;
            View view3 = this.b;
            view3.setLayoutParams(view3.getLayoutParams());
        }
        View view4 = this.b;
        view4.setPadding(this.c + f.b, this.d + f.c, this.e + f.d, view4.getPaddingBottom());
        return kxhVar;
    }
}
