package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class citr {
    public static citq l() {
        ciso cisoVar = new ciso();
        cisoVar.g(Optional.empty());
        cisoVar.e = Optional.empty();
        cisoVar.d = Optional.empty();
        cisoVar.f = Optional.empty();
        return cisoVar;
    }

    public abstract int a();

    public abstract IconCompat b();

    public abstract ConversationId c();

    public abstract ConversationIdType d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract String i();

    public abstract String j();

    public abstract boolean k();
}
