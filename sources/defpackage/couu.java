package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class couu extends cout {
    public final int a;
    public final String b;
    public final long c;
    public final MessageIdType d;
    public final ConversationIdType e;
    public final String f;
    public final String g;
    public final Optional h;

    public couu(MessageIdType messageIdType, int i, String str, long j, ConversationIdType conversationIdType, String str2, String str3, Optional optional) {
        this.d = messageIdType;
        this.a = i;
        this.b = str;
        this.c = j;
        this.e = conversationIdType;
        this.f = str2;
        this.g = str3;
        this.h = optional;
    }

    @Override // defpackage.cout
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cout
    public final int b() {
        throw null;
    }

    @Override // defpackage.cout
    public final long c() {
        return this.c;
    }

    @Override // defpackage.cout
    public final String d() {
        return this.b;
    }
}
