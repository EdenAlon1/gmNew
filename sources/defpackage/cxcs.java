package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxcs extends ktb {
    final /* synthetic */ kxr a;
    final /* synthetic */ cxct b;

    public cxcs(cxct cxctVar, kxr kxrVar) {
        this.a = kxrVar;
        this.b = cxctVar;
    }

    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        super.c(view, kxuVar);
        kxuVar.i(this.a);
        kxuVar.w(true);
    }

    @Override // defpackage.ktb
    public final boolean i(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.i(view, i, bundle);
        }
        this.b.h.a();
        return true;
    }
}
