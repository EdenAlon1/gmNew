package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mqr extends Handler {
    final /* synthetic */ mqt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqr(mqt mqtVar, Looper looper) {
        super(looper);
        this.a = mqtVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        mqs mqsVar;
        mqt mqtVar = this.a;
        int i = message.what;
        if (i == 1) {
            mqsVar = (mqs) message.obj;
            int i2 = mqsVar.a;
            int i3 = mqsVar.b;
            try {
                mqtVar.c.queueInputBuffer(i2, 0, mqsVar.c, mqsVar.e, mqsVar.f);
            } catch (RuntimeException e) {
                mqq.a(mqtVar.f, e);
            }
        } else if (i != 2) {
            mqsVar = null;
            if (i == 3) {
                mqtVar.g.d();
            } else if (i != 4) {
                mqq.a(mqtVar.f, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    mqtVar.c.setParameters((Bundle) message.obj);
                } catch (RuntimeException e2) {
                    mqq.a(mqtVar.f, e2);
                }
            }
        } else {
            mqsVar = (mqs) message.obj;
            int i4 = mqsVar.a;
            int i5 = mqsVar.b;
            MediaCodec.CryptoInfo cryptoInfo = mqsVar.d;
            long j = mqsVar.e;
            int i6 = mqsVar.f;
            try {
                synchronized (mqt.b) {
                    mqtVar.c.queueSecureInputBuffer(i4, 0, cryptoInfo, j, i6);
                }
            } catch (RuntimeException e3) {
                mqq.a(mqtVar.f, e3);
            }
        }
        if (mqsVar != null) {
            synchronized (mqt.a) {
                mqt.a.add(mqsVar);
            }
        }
    }
}
