package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozv implements pak {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;

    public ozv(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.pak
    public final void b(par parVar) {
        parVar.I(this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.b.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.pak
    public final void e(par parVar) {
        parVar.I(this);
        parVar.F(this);
    }

    @Override // defpackage.pak
    public final /* synthetic */ void f(par parVar) {
        paj.a(this, parVar);
    }

    @Override // defpackage.pak
    public final /* synthetic */ void g(par parVar) {
        paj.b(this, parVar);
    }

    @Override // defpackage.pak
    public final void c() {
    }

    @Override // defpackage.pak
    public final void d() {
    }

    @Override // defpackage.pak
    public final void a(par parVar) {
    }
}
