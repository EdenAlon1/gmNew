package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wwn implements ffix {
    final /* synthetic */ wwr a;
    final /* synthetic */ String b;
    final /* synthetic */ aigz c;

    public wwn(wwr wwrVar, String str, aigz aigzVar) {
        this.a = wwrVar;
        this.b = str;
        this.c = aigzVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ((altk) this.a.b.b()).aH(2, eorw.BIZINFO_SOURCE_CONVERSATION_OVERFLOW_MENU, this.b);
        this.c.h(new ailc((RbmConversationId) this.a.a, this.b));
        return ffcu.a;
    }
}
