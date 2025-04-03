package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abrn {
    public static final entd a = entd.c("DuplicateRcsGroupId");
    public final errl b;
    public final errl c;
    public final abuy d;
    public final ConversationIdType e;
    public final String f;

    public abrn(errl errlVar, errl errlVar2, abuy abuyVar, ConversationIdType conversationIdType, String str) {
        emxf.b(!conversationIdType.b(), "conversation ID is empty");
        this.b = errlVar;
        this.c = errlVar2;
        this.d = abuyVar;
        this.e = conversationIdType;
        this.f = str;
    }
}
