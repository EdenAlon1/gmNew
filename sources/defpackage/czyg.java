package defpackage;

import com.google.android.apps.messaging.home.select.SelectedConversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czyg extends czyk {
    private final SelectedConversation a;
    private final eoko b;

    public czyg(SelectedConversation selectedConversation, eoko eokoVar) {
        this.a = selectedConversation;
        if (eokoVar == null) {
            throw new NullPointerException("Null origin");
        }
        this.b = eokoVar;
    }

    @Override // defpackage.czyk
    public final SelectedConversation a() {
        return this.a;
    }

    @Override // defpackage.czyk
    public final eoko b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czyk) {
            czyk czykVar = (czyk) obj;
            if (this.a.equals(czykVar.a()) && this.b.equals(czykVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eoko eokoVar = this.b;
        return "ConversationDeleteEvent{selectedConversation=" + this.a.toString() + ", origin=" + eokoVar.toString() + "}";
    }
}
