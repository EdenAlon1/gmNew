package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebpw extends ktb {
    final /* synthetic */ ebpx a;

    public ebpw(ebpx ebpxVar) {
        this.a = ebpxVar;
    }

    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        super.c(view, kxuVar);
        kxuVar.h(1048576);
        kxuVar.w(true);
    }

    @Override // defpackage.ktb
    public final boolean i(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.i(view, i, bundle);
        }
        this.a.aT();
        return true;
    }
}
