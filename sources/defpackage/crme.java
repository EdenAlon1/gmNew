package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class crme {
    public static crme d(ConversationIdType conversationIdType, final cpxu cpxuVar) {
        return new crlz(conversationIdType, new fazb() { // from class: crmd
            @Override // defpackage.fazb
            public final Object b() {
                return cpxu.this;
            }
        });
    }

    public abstract ConversationIdType a();

    public abstract fazb b();

    public final cpxu c() {
        return (cpxu) b().b();
    }
}
