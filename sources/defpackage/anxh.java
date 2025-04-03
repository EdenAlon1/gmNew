package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anxh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ anxm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anxh(anxm anxmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = anxmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anxh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ctrg ctrgVar = (ctrg) this.b.c.b();
            anxm anxmVar = this.b;
            fbri fbriVar = fbri.SCREEN_EFFECTS;
            fbre fbreVar = fbre.UNCONSUMED;
            this.a = 1;
            obj = ctrgVar.a(anxmVar.d.a, fbriVar, fbreVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (SuggestionData suggestionData : (Iterable) obj) {
            suggestionData.getClass();
            anxl anxlVar = !(suggestionData instanceof SmartSuggestionItemSuggestionData) ? null : new anxl(suggestionData);
            if (anxlVar != null) {
                arrayList.add(anxlVar);
            }
        }
        return engq.a(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anxh(this.b, ffguVar);
    }
}
