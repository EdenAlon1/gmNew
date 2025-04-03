package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rfv implements Handler.Callback {
    final /* synthetic */ rfw a;

    public rfv(rfw rfwVar) {
        this.a = rfwVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.a.c((rft) message.obj);
            return true;
        }
        if (message.what != 2) {
            return false;
        }
        this.a.c.l((rft) message.obj);
        return false;
    }
}
