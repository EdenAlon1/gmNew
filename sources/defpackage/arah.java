package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class arah extends ejte {
    private final aqhq a;

    public arah(arai araiVar, aqhq aqhqVar) {
        super(araiVar.b, "ContentObserverManager notified", araiVar.c);
        this.a = aqhqVar;
    }

    @Override // defpackage.ejte
    public final void a(boolean z, final Uri uri) {
        final aqjw aqjwVar = this.a.a;
        aqjwVar.d.c(new Supplier() { // from class: aqik
            @Override // java.util.function.Supplier
            public final Object get() {
                Uri uri2 = uri;
                if (uri2 != null) {
                    if (uri2.getPathSegments().size() == bcqc.i(aqjw.this.b).getPathSegments().size() + 1) {
                        return Optional.ofNullable(bdgq.b(uri2.getLastPathSegment())).map(new Function() { // from class: aqjl
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return new BugleConversationId((ConversationIdType) obj);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                }
                return Optional.empty();
            }
        }, "ConversationParticipantsChanged");
    }
}
