package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeog implements aeoe {
    private final elbx a;
    private final aeoa b;

    public aeog(Context context, elbx elbxVar, aeot aeotVar) {
        this.a = elbxVar;
        this.b = new aeoa(context, aeotVar, R.attr.colorError, R.attr.colorOnError);
    }

    @Override // defpackage.aeoe
    public final aeoj a() {
        return this.b;
    }

    @Override // defpackage.aeoe
    public final void b(wr wrVar, SelectedConversation selectedConversation) {
        ekzm b = this.a.b("SwipeDeleteHandler");
        try {
            ellj.g(new czyg(selectedConversation, eoko.CONVERSATION_FROM_LIST_SWIPE), wrVar.a);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
