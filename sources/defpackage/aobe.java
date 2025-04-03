package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aobe implements cpfu {
    private final cpfi a;
    private final ezgw b;

    public aobe(cpfi cpfiVar, ezgw ezgwVar) {
        cpfiVar.getClass();
        this.a = cpfiVar;
        this.b = ezgwVar;
    }

    @Override // defpackage.cpfu
    public final /* synthetic */ engw a(List list, cpff cpffVar, int i) {
        return cpfs.a(this, list, cpffVar, i);
    }

    @Override // defpackage.cpfu
    public final Object b(List list, cpff cpffVar, int i, ffgu ffguVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.b.b.contains(((SuggestionData) obj).e())) {
                arrayList.add(obj);
            }
        }
        return this.a.b(arrayList, cpffVar, i, ffguVar);
    }
}
