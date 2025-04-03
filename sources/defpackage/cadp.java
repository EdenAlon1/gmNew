package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cadp implements awmk {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener");
    private final ffbr b;
    private final ffbr c;

    public cadp(ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = ffbrVar2;
        this.b = ffbrVar;
    }

    @Override // defpackage.awmk
    public final elfl a(awui awuiVar, ConversationIdType conversationIdType, awws awwsVar) {
        if (awwsVar.b.size() + awwsVar.d.size() + awwsVar.c.size() <= 0) {
            ensk h = a.h();
            h.Y(ente.a, "BugleEtouffee");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener", "onProcessCompleteFuture", 64, "OnParticipantGroupMetadataChangeEtouffeeListener.java")).q("No group changes found. Skip updating group conversation e2ee state.");
            return elfo.e(null);
        }
        bcyk a2 = ((azwh) this.c.b()).a(conversationIdType);
        if (a2 == null) {
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleEtouffee");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener", "onProcessCompleteFuture", 70, "OnParticipantGroupMetadataChangeEtouffeeListener.java")).q("Conversation is missing. Skip updating group conversation e2ee state.");
            return elfo.e(null);
        }
        Stream map = Collection.EL.stream(awwsVar.b).filter(new Predicate() { // from class: cadn
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                awwp b = awwp.b(((awtr) obj).e);
                if (b == null) {
                    b = awwp.UNKNOWN_STATE;
                }
                return b.compareTo(awwp.JOINED) == 0;
            }
        }).map(new Function() { // from class: cado
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                awui awuiVar2 = ((awtr) obj).c;
                return awuiVar2 == null ? awui.a : awuiVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        elfl b = ((bzqk) this.b.b()).a(awuiVar, conversationIdType).b((engw) map.collect(endq.a));
        if (a2.K()) {
            ensk h3 = a.h();
            h3.Y(ente.a, "BugleEtouffee");
            ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener", "onProcessCompleteFuture", 86, "OnParticipantGroupMetadataChangeEtouffeeListener.java")).q("Participant changes found. Updating group conversation e2ee state.");
            return b;
        }
        ensk h4 = a.h();
        h4.Y(ente.a, "BugleEtouffee");
        ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/OnParticipantGroupMetadataChangeEtouffeeListener", "onProcessCompleteFuture", 81, "OnParticipantGroupMetadataChangeEtouffeeListener.java")).q("Conversation is not already encrypted. Launch async encryption update worker.");
        axnw.h(b);
        return elfo.e(null);
    }
}
