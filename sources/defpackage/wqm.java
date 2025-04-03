package defpackage;

import android.app.assist.AssistContent;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqm implements vxl {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation2/Conversation2MainActivityAdapterFragmentPeer");
    private final wqk b;
    private final eisx c;
    private final fazb d;
    private final fazb e;
    private final fazb f;
    private final fazb g;
    private final ffbr h;

    public wqm(wqk wqkVar, eisx eisxVar, fazb fazbVar, fazb fazbVar2, fazb fazbVar3, fazb fazbVar4, ffbr ffbrVar) {
        eisxVar.getClass();
        fazbVar.getClass();
        fazbVar2.getClass();
        fazbVar3.getClass();
        fazbVar4.getClass();
        ffbrVar.getClass();
        this.b = wqkVar;
        this.c = eisxVar;
        this.d = fazbVar;
        this.e = fazbVar2;
        this.f = fazbVar3;
        this.g = fazbVar4;
        this.h = ffbrVar;
    }

    private final boolean j() {
        return ahpj.a(this.b.fe(), ((tam) this.f.b()).a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x033f  */
    @Override // defpackage.vxl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ea a(defpackage.gg r35, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r36, com.google.android.apps.messaging.label.data.classification.SuperSortLabel r37, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r38) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqm.a(gg, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, com.google.android.apps.messaging.label.data.classification.SuperSortLabel, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):ea");
    }

    @Override // defpackage.vxl
    public final ea b() {
        return this.b.I().h("Conversation2Fragment");
    }

    @Override // defpackage.vxl
    public final fr c() {
        fr I = this.b.I();
        I.getClass();
        return I;
    }

    @Override // defpackage.vxl
    public final tvt d() {
        ea h = this.b.I().h("start_chat_fragment_tag");
        if (h == null) {
            return null;
        }
        return new wql(h);
    }

    @Override // defpackage.vxl
    public final eisx e() {
        return this.c;
    }

    @Override // defpackage.vxl
    public final void f(final AssistContent assistContent) {
        lkr b = b();
        ekhu ekhuVar = b instanceof ekhu ? (ekhu) b : null;
        Object H = ekhuVar != null ? ekhuVar.H() : null;
        wqj wqjVar = H instanceof wqj ? (wqj) H : null;
        if (wqjVar != null) {
            Optional optional = (Optional) wqjVar.a().i.b();
            final ffji ffjiVar = new ffji() { // from class: abpo
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    xek xekVar = (xek) obj;
                    xekVar.getClass();
                    axol.k(xekVar.d, null, new xej(xekVar, assistContent, null), 3);
                    return ffcu.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: abpp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.vxl
    public final boolean g() {
        return true;
    }

    @Override // defpackage.vxl
    public final void h(gg ggVar) {
        fazb fazbVar = this.e;
        efaf a2 = uxv.a(this.c);
        ggVar.x(R.id.fragment_container, a2, "conversation_placeholder");
    }

    @Override // defpackage.vxl
    public final void i(gg ggVar, int i) {
        ggVar.x(R.id.fragment_container, ((cvqq) this.d.b()).a().a(this.c, i), "start_chat_fragment_tag");
    }
}
