package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abrb {
    public static final entd a = entd.c("ConvsCreatedReporter");
    public final errl b;
    public final errl c;
    public final abuy d;
    public final ConversationIdType e;
    public final Optional f;

    public abrb(errl errlVar, errl errlVar2, abuy abuyVar, ConversationIdType conversationIdType, Optional optional) {
        emxf.b(!conversationIdType.b(), "conversation ID is empty");
        this.b = errlVar;
        this.c = errlVar2;
        this.d = abuyVar;
        this.e = conversationIdType;
        this.f = optional;
    }
}
