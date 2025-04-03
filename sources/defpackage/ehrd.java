package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehrd implements Handler.Callback {
    final /* synthetic */ ehrf a;

    public ehrd(ehrf ehrfVar) {
        this.a = ehrfVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        ehrf ehrfVar = this.a;
        ehre ehreVar = (ehre) message.obj;
        synchronized (ehrfVar.a) {
            if (ehrfVar.c == ehreVar || ehrfVar.d == ehreVar) {
                ehrfVar.d(ehreVar, 2);
            }
        }
        return true;
    }
}
