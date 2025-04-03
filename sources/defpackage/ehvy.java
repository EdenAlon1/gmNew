package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehvy extends ResultReceiver {
    final /* synthetic */ dhri a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehvy(Handler handler, dhri dhriVar) {
        super(handler);
        this.a = dhriVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.a.d(null);
    }
}
