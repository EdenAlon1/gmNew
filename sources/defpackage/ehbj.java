package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehbj extends ktb {
    final /* synthetic */ ehbn a;

    public ehbj(ehbn ehbnVar) {
        this.a = ehbnVar;
    }

    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        super.c(view, kxuVar);
        if (!this.a.e) {
            kxuVar.w(false);
        } else {
            kxuVar.h(1048576);
            kxuVar.w(true);
        }
    }

    @Override // defpackage.ktb
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            ehbn ehbnVar = this.a;
            if (ehbnVar.e) {
                ehbnVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.i(view, i, bundle);
    }
}
