package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubr {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final errl d;
    private final ffbr e;

    public cubr(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, errl errlVar) {
        this.a = ffbrVar;
        this.e = ffbrVar2;
        this.b = ffbrVar3;
        this.c = ffbrVar4;
        this.d = errlVar;
    }

    public final boolean a(ConversationIdType conversationIdType) {
        return ((bczy) this.e.b()).s(conversationIdType) == byyt.SPAM_FOLDER;
    }
}
