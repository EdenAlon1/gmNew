package defpackage;

import android.support.constraint.Guideline;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drbn implements dsyj {
    final /* synthetic */ drcf a;
    private final dsyj b;

    public drbn(drcf drcfVar, dsyj dsyjVar) {
        this.a = drcfVar;
        this.b = dsyjVar;
    }

    @Override // defpackage.dsyj
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.dsyj
    public final View b() {
        return null;
    }

    @Override // defpackage.dsyj
    public final dsyc c() {
        return ((dsyg) this.b).a;
    }

    @Override // defpackage.dsyj
    public final void d(int i) {
        this.b.d(i);
    }

    @Override // defpackage.dsyj
    public final void f(int i) {
        Guideline guideline;
        this.b.f(i);
        View view = this.a.Q;
        if (view == null || (guideline = (Guideline) view.findViewById(R.id.header_guideline)) == null) {
            return;
        }
        drcf drcfVar = this.a;
        ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
        }
        au auVar = (au) layoutParams;
        auVar.a = i - drcfVar.a().getResources().getDimensionPixelSize(R.dimen.standard_view_padding);
        guideline.setLayoutParams(auVar);
    }

    @Override // defpackage.dsyj
    public final boolean g() {
        return this.b.g();
    }

    @Override // defpackage.dsyj
    public final boolean h() {
        return this.b.h();
    }

    @Override // defpackage.dsyj
    public final boolean i(int i) {
        return false;
    }

    @Override // defpackage.dsyj
    public final void j(int i) {
        this.b.j(i);
    }

    @Override // defpackage.dsyj
    public final void k(boolean z) {
        this.b.k(z);
    }

    @Override // defpackage.dsyj
    public final void e() {
    }
}
