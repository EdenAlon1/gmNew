package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.messaging.ui.ClassZeroActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwox extends Handler {
    final /* synthetic */ ClassZeroActivity a;

    public cwox(ClassZeroActivity classZeroActivity) {
        this.a = classZeroActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            ClassZeroActivity classZeroActivity = this.a;
            classZeroActivity.q = false;
            classZeroActivity.r.dismiss();
            this.a.G();
            this.a.F();
        }
    }
}
