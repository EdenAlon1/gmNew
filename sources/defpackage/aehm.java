package defpackage;

import android.view.View;
import com.google.android.apps.messaging.home.select.SelectedConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aehm implements ellf {
    public final View a;
    public final SelectedConversation b;

    public aehm(View view, SelectedConversation selectedConversation) {
        this.a = view;
        this.b = selectedConversation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aehm)) {
            return false;
        }
        aehm aehmVar = (aehm) obj;
        return ffkj.e(this.a, aehmVar.a) && ffkj.e(this.b, aehmVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationAvatarClickEvent(view=" + this.a + ", selectedConversation=" + this.b + ")";
    }
}
