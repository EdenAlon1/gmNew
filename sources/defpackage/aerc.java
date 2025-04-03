package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aerc implements aeqo {
    static final /* synthetic */ ffmx[] a;
    public final aerd b;
    public final ea c;
    public final adif d;
    public final ffbr e;
    public final dedg f;
    public View g;
    public final aese i;
    private final ffls j = new aeqr(this);
    public final ffls h = new aeqs(this);

    static {
        ffko ffkoVar = new ffko(aerc.class, "anchor", "getAnchor()Landroid/view/ViewGroup;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar, new ffko(aerc.class, "state", "getState()Lcom/google/android/apps/messaging/hqmediasharing/onboarding/OnboardingState;", 0)};
    }

    public aerc(aerd aerdVar, ea eaVar, adif adifVar, ffbr ffbrVar, dedg dedgVar, aese aeseVar) {
        this.b = aerdVar;
        this.c = eaVar;
        this.d = adifVar;
        this.e = ffbrVar;
        this.f = dedgVar;
        this.i = aeseVar;
    }

    @Override // defpackage.aeqo
    public final void a(ViewGroup viewGroup) {
        this.j.d(a[0], viewGroup);
    }

    @Override // defpackage.aeqo
    public final void b(View view) {
        this.g = view;
    }

    public final ViewGroup c() {
        return (ViewGroup) this.j.c(a[0]);
    }

    public final void d() {
        axol.k(lks.a(this.c), null, new aeqq(this, null), 3);
        f(null);
        View view = this.g;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void e(aeqk aeqkVar) {
        aeqkVar.d(aerr.a);
        d();
    }

    public final void f(aeqk aeqkVar) {
        this.h.d(a[1], aeqkVar);
    }
}
