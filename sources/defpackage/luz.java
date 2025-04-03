package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class luz {
    public Message a;

    public final void a() {
        this.a = null;
        synchronized (lva.a) {
            if (lva.a.size() < 50) {
                lva.a.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.a;
        lti.f(message);
        message.sendToTarget();
        a();
    }
}
