package defpackage;

import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ ConversationViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abpv(ffxx ffxxVar, ConversationViewModel conversationViewModel, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = conversationViewModel;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abpv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx b = fgaj.b(new abpu(this.b), 1);
            abpr abprVar = new abpr(this.c);
            this.a = 1;
            if (b.a(abprVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abpv(this.b, this.c, ffguVar);
    }
}
