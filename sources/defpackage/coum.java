package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coum extends IllegalArgumentException {
    public coum(String str) {
        super(String.format("Missing MessagingIdentity on direction: %s during %s", str, "sendChatMessageResponse"));
    }
}
