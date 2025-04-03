package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqmj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqmk b;
    final /* synthetic */ BugleConversationId c;
    final /* synthetic */ engw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqmj(aqmk aqmkVar, BugleConversationId bugleConversationId, engw engwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqmkVar;
        this.c = bugleConversationId;
        this.d = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqmj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aqmk aqmkVar = this.b;
            BugleConversationId bugleConversationId = this.c;
            engw engwVar = this.d;
            this.a = 1;
            Object a = ffra.a(aqmkVar.b, new aqmi(bugleConversationId, engwVar, aqmkVar, null), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqmj(this.b, this.c, this.d, ffguVar);
    }
}
