package defpackage;

import android.support.v7.widget.ShareActionProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xt implements qb {
    final /* synthetic */ ShareActionProvider a;

    public xt(ShareActionProvider shareActionProvider) {
        this.a = shareActionProvider;
    }

    @Override // defpackage.qb
    public final void a() {
        xs xsVar = this.a.mOnShareTargetSelectedListener;
        if (xsVar != null) {
            xsVar.a();
        }
    }
}
