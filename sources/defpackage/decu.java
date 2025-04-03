package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class decu implements erqj {
    final /* synthetic */ dgts a;

    public decu(dgts dgtsVar) {
        this.a = dgtsVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ListIterator listIterator = (ListIterator) obj;
        if (!listIterator.hasNext()) {
            this.a.b(null, null);
            return;
        }
        cfys cfysVar = (cfys) listIterator.next();
        long j = cfysVar.a;
        SmartSuggestionData smartSuggestionData = cfysVar.b;
        cfva cfvaVar = decv.a;
        fivn fivnVar = (fivn) fivp.a.createBuilder();
        fivnVar.a("timestamp", debm.a(j));
        String a = deco.a(smartSuggestionData);
        if (!TextUtils.isEmpty(a)) {
            fivnVar.a("suggestion_text", debm.c(a));
        }
        fivnVar.a("suggestion_status", debm.a(smartSuggestionData.j().a()));
        fivnVar.a("suggestion_type", debm.a(((SmartSuggestionItemSuggestionData) smartSuggestionData).l().a()));
        fivi fiviVar = (fivi) fivj.a.createBuilder();
        fivp fivpVar = (fivp) fivnVar.build();
        fiviVar.copyOnWrite();
        fivj fivjVar = (fivj) fiviVar.instance;
        fivpVar.getClass();
        fivjVar.c = fivpVar;
        fivjVar.b |= 1;
        this.a.b(((fivj) fiviVar.build()).toByteArray(), null);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.a(13, null);
    }
}
