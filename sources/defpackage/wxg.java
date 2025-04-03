package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wxg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amfx b;
    final /* synthetic */ wxh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxg(amfx amfxVar, wxh wxhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amfxVar;
        this.c = wxhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wxg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eoxn eoxnVar = this.b.E().ordinal() != 1 ? eoxn.SEND_MODE_AUTO : eoxn.SEND_MODE_XMS;
            wxh wxhVar = this.c;
            ConversationId c = this.b.c();
            c.getClass();
            elfl J = wxhVar.c.J(c, eoxnVar);
            this.a = 1;
            obj = fgfz.c(J, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wxg(this.b, this.c, ffguVar);
    }
}
