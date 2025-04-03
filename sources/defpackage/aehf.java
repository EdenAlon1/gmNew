package defpackage;

import android.view.View;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aehf extends aehn {
    private final boolean a;
    private final SelectedConversation b;
    private final View c;
    private final MessageIdType d;
    private final bcyl e;

    public aehf(boolean z, SelectedConversation selectedConversation, View view, MessageIdType messageIdType, bcyl bcylVar) {
        this.a = z;
        this.b = selectedConversation;
        this.c = view;
        this.d = messageIdType;
        this.e = bcylVar;
    }

    @Override // defpackage.aehn
    public final View a() {
        return this.c;
    }

    @Override // defpackage.aehn
    public final SelectedConversation b() {
        return this.b;
    }

    @Override // defpackage.aehn
    public final bcyl c() {
        return this.e;
    }

    @Override // defpackage.aehn
    public final MessageIdType d() {
        return this.d;
    }

    @Override // defpackage.aehn
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aehn) {
            aehn aehnVar = (aehn) obj;
            if (this.a == aehnVar.e() && this.b.equals(aehnVar.b()) && this.c.equals(aehnVar.a()) && this.d.equals(aehnVar.d()) && this.e.equals(aehnVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        bcyl bcylVar = this.e;
        MessageIdType messageIdType = this.d;
        View view = this.c;
        return "ConversationClickEvent{isLongClick=" + this.a + ", selectedConversation=" + this.b.toString() + ", view=" + view.toString() + ", messageId=" + messageIdType.toString() + ", renderData=" + bcylVar.toString() + "}";
    }
}
