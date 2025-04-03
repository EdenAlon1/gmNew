package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum elvv {
    NEW("New"),
    REPLY("Reply"),
    REPLY_ALL("ReplyAll"),
    FORWARD("Forward");

    private final String f;

    elvv(String str) {
        this.f = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f;
    }
}
