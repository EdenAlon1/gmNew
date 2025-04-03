package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dr extends ek {
    final /* synthetic */ ea a;

    public dr(ea eaVar) {
        this.a = eaVar;
    }

    @Override // defpackage.ek
    public final View a(int i) {
        View view = this.a.Q;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this.a + " does not have a view");
    }

    @Override // defpackage.ek
    public final boolean b() {
        return this.a.Q != null;
    }
}
