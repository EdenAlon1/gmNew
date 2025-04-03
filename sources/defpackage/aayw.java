package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aayw extends ffhv implements ffjm {
    final /* synthetic */ abac a;
    final /* synthetic */ SmartSuggestionData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aayw(abac abacVar, SmartSuggestionData smartSuggestionData, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = abacVar;
        this.b = smartSuggestionData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aayw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((aigz) this.a.s.b()).h(new aioq(new aayv(this.b, this.a, null), 1));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aayw(this.a, this.b, ffguVar);
    }
}
