package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class bbfw implements bbck<Void> {
    public abstract ThrottledAction b(Parcel parcel);

    @Override // defpackage.bbck
    public /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        throw null;
    }

    public abstract ThrottledAction d(boolean z, boolean z2, boolean z3, ConversationIdType conversationIdType);

    public final void e(boolean z, ConversationIdType conversationIdType) {
        bbfv bbfvVar = new bbfv(this);
        bbfvVar.c();
        bbfvVar.b = conversationIdType;
        bbfvVar.a = z;
        bbfvVar.a().K();
    }

    public final void f() {
        bbfv bbfvVar = new bbfv(this);
        bbfvVar.b();
        bbfvVar.a().K();
    }

    public final void g() {
        h(bdgq.a);
    }

    public final void h(ConversationIdType conversationIdType) {
        bbfv bbfvVar = new bbfv(this);
        bbfvVar.b();
        bbfvVar.c();
        bbfvVar.b = conversationIdType;
        bbfvVar.a().K();
    }
}
