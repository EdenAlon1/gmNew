package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebda extends ebdv {
    private ViewGroup A;

    public ebda(ViewGroup viewGroup, Context context, ebvw ebvwVar) {
        super(viewGroup, context, ebvwVar);
    }

    private static final void H(ebcz ebczVar) {
        throw null;
    }

    @Override // defpackage.ebdm
    /* renamed from: C */
    protected final /* bridge */ /* synthetic */ void H(lkr lkrVar, ebdf ebdfVar) {
        ebcz ebczVar = (ebcz) ebdfVar;
        ViewGroup viewGroup = this.A;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            H(ebczVar);
        }
        super.G(lkrVar, ebczVar);
    }

    @Override // defpackage.ebdv
    protected final void D(ViewGroup viewGroup) {
        this.A = viewGroup;
        ebdf ebdfVar = this.x;
        if (ebdfVar == null) {
            return;
        }
        H((ebcz) ebdfVar);
    }
}
