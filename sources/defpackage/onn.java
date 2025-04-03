package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class onn extends Handler {
    final /* synthetic */ ont a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onn(ont ontVar, Looper looper) {
        super(looper);
        this.a = ontVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.gj();
    }
}
