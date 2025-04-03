package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcrh extends Handler {
    final /* synthetic */ dcri a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcrh(dcri dcriVar, Looper looper) {
        super(looper);
        this.a = dcriVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 0) {
            return;
        }
        this.a.b();
    }
}
