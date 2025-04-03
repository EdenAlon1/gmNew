package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anvs extends ffhv implements ffjm {
    final /* synthetic */ anvw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvs(anvw anvwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = anvwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anvs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        engw y = anvw.d(this.a.c.a).y();
        bduq bduqVar = new bduq();
        bduqVar.d(y);
        List<SuggestionData> c = bduqVar.c();
        ArrayList arrayList = new ArrayList();
        for (SuggestionData suggestionData : c) {
            anvr anvrVar = null;
            if ((suggestionData instanceof SmartSuggestionItemSuggestionData) && ((SmartSuggestionItemSuggestionData) suggestionData).l() == fbri.COPY_OTP) {
                anvrVar = new anvr(suggestionData);
            }
            if (anvrVar != null) {
                arrayList.add(anvrVar);
            }
        }
        return engq.a(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anvs(this.a, ffguVar);
    }
}
