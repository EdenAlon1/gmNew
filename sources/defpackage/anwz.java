package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anwz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ anxd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anwz(anxd anxdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = anxdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anwz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ctrg ctrgVar = (ctrg) this.b.c.b();
            anxd anxdVar = this.b;
            fbri fbriVar = fbri.SCREEN_EFFECTS;
            fbre fbreVar = fbre.UNCONSUMED;
            this.a = 1;
            obj = ctrgVar.a(anxdVar.d.a, fbriVar, fbreVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        engw<SuggestionData> engwVar = (engw) obj;
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        for (SuggestionData suggestionData : engwVar) {
            suggestionData.getClass();
            arrayList.add(suggestionData);
        }
        return engq.a(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anwz(this.b, ffguVar);
    }
}
