package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.setupdesign.items.ExpandableSwitchItem;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqb extends ktb {
    final /* synthetic */ ExpandableSwitchItem a;

    public eiqb(ExpandableSwitchItem expandableSwitchItem) {
        this.a = expandableSwitchItem;
    }

    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        super.c(view, kxuVar);
        kxuVar.i(this.a.b ? kxr.g : kxr.f);
    }

    @Override // defpackage.ktb
    public final boolean i(View view, int i, Bundle bundle) {
        if (i != 262144 && i != 524288) {
            return super.i(view, i, bundle);
        }
        this.a.g(!r2.b);
        return true;
    }
}
