package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoan extends ffhv implements ffjm {
    final /* synthetic */ aoaq a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoan(aoaq aoaqVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aoaqVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoan) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        SuggestionData suggestionData = (SuggestionData) fflm.b(((ctqh) this.a.b.b()).f(this.b));
        if (suggestionData == null) {
            return null;
        }
        ((ctqh) this.a.b.b()).p(suggestionData, fbrd.CLICKED);
        return suggestionData;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aoan(this.a, this.b, ffguVar);
    }
}
