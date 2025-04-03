package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amxg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amxk b;
    final /* synthetic */ Optional c;
    final /* synthetic */ engw d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amxg(amxk amxkVar, Optional optional, engw engwVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amxkVar;
        this.c = optional;
        this.d = engwVar;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amxg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl m = ((amhs) this.b.b.b()).m(this.c, this.d, this.e);
            m.getClass();
            this.a = 1;
            obj = fgfz.c(m, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return this.b.a.a((BugleConversation) ((Conversation) obj));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amxg(this.b, this.c, this.d, this.e, ffguVar);
    }
}
