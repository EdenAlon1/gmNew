package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnld {
    private static final cskc a = cskc.g("Bugle", "ReminderDatabaseOperations");

    public static String a(ConversationIdType conversationIdType, MessageIdType messageIdType, long j) {
        if (messageIdType.c()) {
            return null;
        }
        String[] strArr = bxct.a;
        bxbl bxblVar = new bxbl();
        bxblVar.c(messageIdType);
        bxblVar.b(conversationIdType);
        bxblVar.d(j);
        final bxbi a2 = bxblVar.a();
        final dtve d = bxct.d();
        long b = dtub.b(bxct.d(), "reminders", a2, new Function() { // from class: bxbd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.R("reminders", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bxbe
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bxbi bxbiVar = bxbi.this;
                    bxbiVar.a = (String) new dtuj() { // from class: bxbf
                        @Override // defpackage.dtuj
                        public final Object a() {
                            return String.valueOf(l);
                        }
                    }.a();
                    bxbiVar.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Long.valueOf(b).getClass();
        if (b != -1) {
            return String.valueOf(b);
        }
        csjb e = a.e();
        e.I("failed to insert reminder for message");
        e.d(messageIdType);
        e.r();
        return null;
    }
}
