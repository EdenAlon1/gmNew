package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czuy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ czva b;
    final /* synthetic */ SmartSuggestionData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czuy(czva czvaVar, SmartSuggestionData smartSuggestionData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = czvaVar;
        this.c = smartSuggestionData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czuy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ctjh ctjhVar = (ctjh) this.b.a.b();
            SmartSuggestionData smartSuggestionData = this.c;
            czva czvaVar = this.b;
            eoqz eoqzVar = eoqz.P2P_SUGGESTION_CLICK;
            fbqp fbqpVar = fbqp.CONVERSATION_VIEW;
            boolean z = ((dede) czvaVar.c.b()).b;
            this.a = 1;
            if (ctjf.a(ctjhVar, smartSuggestionData, eoqzVar, fbqpVar, z, 0.0f, this, 112) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new czuy(this.b, this.c, ffguVar);
    }
}
