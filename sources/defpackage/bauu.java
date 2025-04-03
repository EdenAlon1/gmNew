package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveP2pSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.ims.util.common.RcsIntents;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bauu {
    public static final cskc a = cskc.g("Bugle", "requestSmartSuggestionsActionHelper");
    public final ctiz b;
    public final ctiw c;
    public final errl d;
    public final errl e;
    private final ffbr f;
    private final ffbr g;
    private final barq h;
    private final bafi i;

    public bauu(ffbr ffbrVar, ctiz ctizVar, ctiw ctiwVar, ffbr ffbrVar2, barq barqVar, errl errlVar, errl errlVar2, bafi bafiVar) {
        this.f = ffbrVar;
        this.b = ctizVar;
        this.c = ctiwVar;
        this.g = ffbrVar2;
        this.h = barqVar;
        this.d = errlVar;
        this.e = errlVar2;
        this.i = bafiVar;
    }

    private static MessageCoreData e(List list) {
        return (MessageCoreData) list.get(0);
    }

    public final elfl a(final List list) {
        final MessageCoreData e = e(list);
        return elfl.g(((GenericWorkerQueueAction) this.i.b()).n((int) e.B().a)).e(Throwable.class, new emwl() { // from class: bauo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb e2 = bauu.a.e();
                e2.I("Couldn't ensure annotations are generated");
                MessageCoreData messageCoreData = e;
                e2.I(messageCoreData.B());
                e2.s((Throwable) obj);
                ctin ctinVar = new ctin();
                ctinVar.b(fbqx.EXCEPTION_THROWN);
                ctje a2 = ctinVar.a();
                bauu.this.c(messageCoreData, epjp.UNKNOWN_REPLY_MODE, 1, a2);
                return null;
            }
        }, this.d).i(new eroh() { // from class: baup
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return bauu.this.c.a(list);
            }
        }, this.e).h(new emwl() { // from class: bauq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bauu bauuVar = bauu.this;
                ctiz ctizVar = bauuVar.b;
                MessageCoreData messageCoreData = e;
                ctje ctjeVar = (ctje) obj;
                bauuVar.c(messageCoreData, ctizVar.a(messageCoreData), 0, ctjeVar);
                return ctjeVar;
            }
        }, this.e);
    }

    public final List b(ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        if (conversationIdType.b()) {
            csjb e = a.e();
            e.I("Conversation Id is empty or null:");
            e.c(conversationIdType);
            e.r();
            throw new IllegalArgumentException("Empty conversationId");
        }
        if (i <= 0) {
            csjb e2 = a.e();
            e2.I("Context message count is");
            e2.G(i);
            e2.r();
            throw new IllegalArgumentException("Non-positive message count.");
        }
        List M = ((bdmq) this.f.b()).M(conversationIdType, i);
        if (Collection.EL.stream(M).anyMatch(new Predicate() { // from class: bauk
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
                return ((MessageCoreData) obj).N().a();
            }
        })) {
            throw new IllegalStateException("Conversation has verified sms messages, don't generate smart replies.");
        }
        if (!this.b.d(M, 1, "RequestSmartSuggestionsAction: %s. Do not generate smart replies.")) {
            throw new IllegalStateException("Message ineligible for SmartReplies.");
        }
        if (e(M).B().equals(messageIdType)) {
            return M;
        }
        throw new IllegalStateException("Target message is not latest message in conversation.");
    }

    public final void c(MessageCoreData messageCoreData, epjp epjpVar, int i, ctje ctjeVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ctjeVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(new SmartSuggestionItemSuggestionData((fbxa) it.next()));
        }
        ((ctkr) this.g.b()).c(epjpVar, arrayList.size(), i, arrayList, ctjeVar.c, ctjeVar.e, ctjeVar.f, messageCoreData);
    }

    public final void d(ctje ctjeVar, MessageIdType messageIdType) {
        if (ctjeVar == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("target_message_id", messageIdType.b());
        ArrayList<? extends Parcelable> arrayList = (ArrayList) Collection.EL.stream(ctjeVar.a).map(new Function() { // from class: baul
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new ProtoParsers.InternalDontUse(null, (fbxa) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: baum
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        ArrayList<? extends Parcelable> arrayList2 = (ArrayList) Collection.EL.stream(ctjeVar.c).map(new Function() { // from class: baun
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new ProtoParsers.InternalDontUse(null, (fbwv) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: baum
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        bundle.putParcelableArrayList(RcsIntents.EXTRA_CONVERSATION_SUGGESTIONS, arrayList);
        bundle.putParcelableArrayList("rcs.intent.extra.conversationClassifications", new ArrayList<>(ctjeVar.b));
        bundle.putParcelableArrayList("rcs.intent.extra.messageClassifications", arrayList2);
        if (((Boolean) ((cfup) stl.k.get()).e()).booleanValue() || ((Boolean) ((cfup) ctjd.bD.get()).e()).booleanValue()) {
            bundle.putParcelableArrayList("rcs.intent.extra.conversationTags", (ArrayList) Collection.EL.stream(ctjeVar.d).map(new Function() { // from class: baun
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new ProtoParsers.InternalDontUse(null, (fbwv) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: baum
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            })));
        }
        barw barwVar = (barw) this.h.a.b();
        barwVar.getClass();
        new ReceiveP2pSuggestionsAction(barwVar, bundle).t();
    }
}
