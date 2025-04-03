package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.message.rbm.RbmSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vva implements wgi {
    public final /* synthetic */ vvn a;

    public vva(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.wgi
    public final ea a() {
        return this.a.N;
    }

    @Override // defpackage.wgi
    public final bcqs b() {
        return (bcqs) this.a.cA.a();
    }

    @Override // defpackage.wgi
    public final void c(final SuggestionData suggestionData) {
        boolean z = suggestionData instanceof SmartSuggestionData;
        vvn vvnVar = this.a;
        if (z && suggestionData.f()) {
            ensk h = vvn.a.h();
            h.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.p, vvnVar.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "sendSuggestionResponse", 6435, "ConversationFragmentPeer.java")).t("ConversationFragment: Sending p2p suggestion response for P2pSuggestion{%s}", new enrw() { // from class: vpt
                @Override // defpackage.enrw
                public final Object a() {
                    enru enruVar = vvn.a;
                    return cskt.b(SuggestionData.this.toString());
                }
            });
            vvnVar.ay(suggestionData.d(), "text/plain");
            return;
        }
        if (!(suggestionData instanceof RbmSuggestionData)) {
            throw new IllegalStateException(String.format("Cannot determine how to handle conversation suggestion %s", cskt.b(suggestionData.toString())));
        }
        ensk h2 = vvn.a.h();
        h2.Y(ente.a, "Bugle");
        enrr enrrVar2 = (enrr) h2;
        enrrVar2.Y(csux.p, vvnVar.M);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "sendSuggestionResponse", 6443, "ConversationFragmentPeer.java")).t("ConversationFragment: Sending rbm suggestion response for conversationSuggestion{%s}", new enrw() { // from class: vpu
            @Override // defpackage.enrw
            public final Object a() {
                enru enruVar = vvn.a;
                return cskt.b(SuggestionData.this.toString());
            }
        });
        String serializeToJson = ConversationSuggestionResponseSerializer.serializeToJson(((RbmSuggestionData) suggestionData).b);
        if (serializeToJson == null) {
            throw new IllegalStateException(String.format("Suggestion serialization failed %s", cskt.b(suggestionData.toString())));
        }
        vvnVar.ay(serializeToJson, RbmSuggestionResponse.CONTENT_TYPE);
    }

    @Override // defpackage.wgi
    public final void d() {
        this.a.S(new Consumer() { // from class: vuy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((uav) obj).e().H().O();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vuz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                vva.this.a.cv.H().O();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
