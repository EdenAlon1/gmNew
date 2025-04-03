package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baim {
    private final Context a;
    private final ffbr b;
    private final ffbr c;
    private final Optional d;

    public baim(Context context, ffbr ffbrVar, ffbr ffbrVar2, Optional optional) {
        this.a = context;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = optional;
    }

    final void a(final Uri uri, MessageIdType messageIdType, ConversationIdType conversationIdType, final int i, int i2, boolean z, boolean z2) {
        if (z) {
            if (i != 105) {
                if (i == 103) {
                    i = 103;
                }
            }
            uri.getClass();
            ((coxk) this.c.b()).N(this.a, uri);
        }
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("MessageStatusUpdater#updateMessageStatus");
        buxrVar.U(i);
        buxrVar.B(i2);
        if (z2) {
            buxrVar.v(false);
            buxrVar.F(false);
        }
        ((bdmq) this.b.b()).U(conversationIdType, messageIdType, buxrVar);
        if (uri != null) {
            this.d.ifPresent(new Consumer() { // from class: bail
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((akni) obj).a(uri, i);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
