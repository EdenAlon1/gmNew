package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctpm {
    public static final engw a(List list, cqoh cqohVar) {
        cqohVar.getClass();
        if (((Boolean) ctms.a.e()).booleanValue() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SuggestionData suggestionData = (SuggestionData) it.next();
                suggestionData.getClass();
                SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) suggestionData;
                fbxa fbxaVar = smartSuggestionItemSuggestionData.c;
                if ((fbxaVar.b & 1) != 0) {
                    fbwy fbwyVar = fbxaVar.e;
                    if (fbwyVar == null) {
                        fbwyVar = fbwy.b;
                    }
                    if (fbwyVar.p == 0) {
                        continue;
                    } else {
                        fbwy fbwyVar2 = smartSuggestionItemSuggestionData.c.e;
                        if (fbwyVar2 == null) {
                            fbwyVar2 = fbwy.b;
                        }
                        long j = fbwyVar2.p;
                        if (j > 0 && cqohVar.f().toEpochMilli() >= j) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                String b = ((SuggestionData) it2.next()).b();
                                if (b != null) {
                                    arrayList.add(b);
                                }
                            }
                            return engq.a(arrayList);
                        }
                    }
                }
            }
        }
        engw engwVar = enou.a;
        engwVar.getClass();
        return engwVar;
    }
}
