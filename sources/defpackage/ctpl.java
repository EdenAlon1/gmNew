package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctpl {
    private final ffbr a;

    public ctpl(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public static RbmSuggestionData a(bryo bryoVar) {
        return new RbmSuggestionData(ConversationSuggestion.createRbmConversationSuggestion(bryoVar.k(), bryoVar.r(), bryoVar.o(), bryoVar.q(), bryoVar.m().b, bryoVar.n().b), bryoVar.l());
    }

    public final void b(final List list, final MessageIdType messageIdType, final boolean z, final long j) {
        ekzz f = eleg.f("ConversationSuggestionDatabaseOperations#addConversationSuggestions");
        try {
            csix.h();
            if (list != null && !dkta.a(list)) {
                ((dtuu) this.a.b()).d("ConversationSuggestionDatabaseOperations#addConversationSuggestions", new Runnable() { // from class: ctpb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object apply;
                        List<ConversationSuggestion> list2 = list;
                        final bdhg a = bdhg.a(((ConversationSuggestion) list2.get(0)).getTargetRcsMessageId());
                        if (bdhg.l(a)) {
                            String[] strArr = bsam.a;
                            bsac bsacVar = new bsac();
                            bsacVar.f("deleteConversationSuggestionsByRcsMessage");
                            apply = new Function() { // from class: ctph
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bsal bsalVar = (bsal) obj;
                                    int intValue = bsam.c().intValue();
                                    if (intValue < 12000) {
                                        dtub.w("target_rcs_message_id", intValue);
                                    }
                                    bsalVar.aq(new dtrt("conversation_suggestions.target_rcs_message_id", 1, bdhg.d(bdhg.this)));
                                    return bsalVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }.apply(new bsal());
                            bsacVar.b = new bsak((bsal) apply);
                            bsacVar.d();
                        }
                        for (ConversationSuggestion conversationSuggestion : list2) {
                            boolean z2 = z;
                            long j2 = j;
                            MessageIdType messageIdType2 = messageIdType;
                            String[] strArr2 = bsam.a;
                            bryr bryrVar = new bryr();
                            bryrVar.i(messageIdType2);
                            bryrVar.b(conversationSuggestion.getSuggestionType());
                            bryrVar.e(conversationSuggestion.serializeProperties());
                            bryrVar.c(conversationSuggestion.getPostBackData());
                            bryrVar.d(conversationSuggestion.getPostBackEncoding());
                            bryrVar.f(bdhg.a(conversationSuggestion.getRcsMessageId()));
                            bryrVar.j(bdhg.a(conversationSuggestion.getTargetRcsMessageId()));
                            bryrVar.h(j2);
                            bryrVar.g(z2);
                            final bryo a2 = bryrVar.a();
                            final dtve b = bsam.b();
                            dtub.b(bsam.b(), "conversation_suggestions", a2, new Function() { // from class: bryl
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(dtve.this.R("conversation_suggestions", (ContentValues) obj));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Consumer() { // from class: brym
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    Long l = (Long) obj;
                                    if (l.longValue() >= 0) {
                                        bryo bryoVar = bryo.this;
                                        bryoVar.a = new bryk(l).a.longValue();
                                        bryoVar.fY(0);
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                    }
                });
            }
            f.close();
        } finally {
        }
    }
}
