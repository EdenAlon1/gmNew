package defpackage;

import android.app.assist.AssistContent;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxn implements vxl {
    private final vxk a;
    private final fazb b;
    private final eisx c;
    private final ffbr d;

    public vxn(eisx eisxVar, vxk vxkVar, fazb fazbVar, ffbr ffbrVar) {
        this.c = eisxVar;
        this.a = vxkVar;
        this.b = fazbVar;
        this.d = ffbrVar;
    }

    @Override // defpackage.vxl
    public final ea a(gg ggVar, ConversationId conversationId, SuperSortLabel superSortLabel, MessageCoreData messageCoreData) {
        vjq vjqVar = (vjq) vjr.a.createBuilder();
        String b = conversationId.b();
        vjqVar.copyOnWrite();
        vjr vjrVar = (vjr) vjqVar.instance;
        b.getClass();
        vjrVar.b = b;
        eyee x = eyee.x(conversationId.c());
        vjqVar.copyOnWrite();
        ((vjr) vjqVar.instance).d = x;
        int i = superSortLabel == null ? SuperSortLabel.UNKNOWN.i : superSortLabel.i;
        vjqVar.copyOnWrite();
        ((vjr) vjqVar.instance).c = i;
        vjr vjrVar2 = (vjr) vjqVar.build();
        eisx eisxVar = this.c;
        enru enruVar = vvn.a;
        vjs vjsVar = new vjs();
        fbae.e(vjsVar);
        ekky.b(vjsVar, eisxVar);
        ekku.a(vjsVar, vjrVar2);
        Bundle bundle = vjsVar.m;
        if (bundle != null) {
            bundle.putString("conversation_id", vjrVar2.b);
        }
        ggVar.t(R.id.conversation_fragment_container, vjsVar, "conversation");
        return vjsVar;
    }

    @Override // defpackage.vxl
    public final ea b() {
        ea h = this.a.I().h("conversation");
        if (h instanceof vjs) {
            return (vjs) h;
        }
        return null;
    }

    @Override // defpackage.vxl
    public final fr c() {
        return this.a.I();
    }

    @Override // defpackage.vxl
    public final tvt d() {
        ea h = this.a.I().h("contactpicker");
        if (h != null) {
            return new vxm(h);
        }
        return null;
    }

    @Override // defpackage.vxl
    public final eisx e() {
        return this.c;
    }

    @Override // defpackage.vxl
    public final boolean g() {
        return false;
    }

    @Override // defpackage.vxl
    public final void h(gg ggVar) {
        fazb fazbVar = this.b;
        efaf a = uxv.a(this.c);
        ggVar.t(R.id.conversation_placeholder_container, a, "conversation_placeholder");
    }

    @Override // defpackage.vxl
    public final void i(gg ggVar, int i) {
        ggVar.t(R.id.contact_picker_fragment_container, ((cvqq) this.d.b()).a().a(this.c, i), "contactpicker");
    }

    @Override // defpackage.vxl
    public final /* synthetic */ void f(AssistContent assistContent) {
    }
}
