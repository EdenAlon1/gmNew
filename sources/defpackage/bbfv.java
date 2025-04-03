package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbfv {
    public boolean a;
    public ConversationIdType b = bdgq.a;
    final /* synthetic */ bbfw c;
    private boolean d;
    private boolean e;

    public bbfv(bbfw bbfwVar) {
        this.c = bbfwVar;
    }

    public final ThrottledAction a() {
        return this.c.d(this.d, this.e, this.a, this.b);
    }

    public final void b() {
        this.e = true;
    }

    public final void c() {
        this.d = true;
    }
}
