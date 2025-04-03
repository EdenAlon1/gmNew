package defpackage;

import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsViewModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyok extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ConversationDetailsViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyok(ConversationDetailsViewModel conversationDetailsViewModel, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = conversationDetailsViewModel;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyok) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx b = fgaj.b(new cyoj(this.b.a), 1);
            cyog cyogVar = new cyog(this.b);
            this.a = 1;
            if (b.a(cyogVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyok(this.b, ffguVar);
    }
}
