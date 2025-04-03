package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czvp extends ffhv implements ffjm {
    final /* synthetic */ czvw a;
    final /* synthetic */ SuggestionData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czvp(czvw czvwVar, SuggestionData suggestionData, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = czvwVar;
        this.b = suggestionData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czvp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((ctqh) this.a.b.b()).p(this.b, fbrd.SHOWN);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new czvp(this.a, this.b, ffguVar);
    }
}
