package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehve extends ehvd {
    public ehve(ehvg ehvgVar, dhri dhriVar) {
        super(ehvgVar, new ehvt("OnCompleteUpdateCallback"), dhriVar);
    }

    @Override // defpackage.ehvd, com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback
    public final void onCompleteUpdate(Bundle bundle) {
        super.onCompleteUpdate(bundle);
        if (ehvg.a(bundle) != 0) {
            this.b.c(new ehvo(ehvg.a(bundle)));
        } else {
            this.b.d(null);
        }
    }
}
