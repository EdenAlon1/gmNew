package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsp implements adso {
    private final adtc a;
    private final ddzb b;

    public adsp(adtc adtcVar, ddzb ddzbVar) {
        this.a = adtcVar;
        this.b = ddzbVar;
    }

    @Override // defpackage.adso
    public final void a(Activity activity) {
        this.b.k(R.string.conversation_list_dismiss_toast);
    }

    @Override // defpackage.adso
    public final void b(Activity activity) {
        this.a.e(activity, "deregister_imessage");
    }
}
