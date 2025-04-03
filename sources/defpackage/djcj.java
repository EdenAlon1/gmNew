package defpackage;

import com.google.android.rcs.client.messaging.data.Message;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djcj implements erqj {
    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional != null) {
            dkty.k("Message received: %s", optional.isPresent() ? ((Message) optional.get()).h() : "empty message");
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dkty.i(th, "Error while receiving message: %s", th.getMessage());
    }
}
