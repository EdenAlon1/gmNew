package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebok implements erqj {
    final /* synthetic */ View a;
    final /* synthetic */ ebol b;

    public ebok(ebol ebolVar, View view) {
        this.a = view;
        this.b = ebolVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ebol ebolVar = this.b;
            ebolVar.b.a.onClick(this.a);
        }
        this.b.a();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.b.a();
    }
}
