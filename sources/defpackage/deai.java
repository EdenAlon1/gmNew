package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deai extends IllegalStateException {
    public deai() {
        super("Requesting a ConversationViewModelProvider inside a hierarchy not containinga ConversationViewModelOwner.");
    }
}
