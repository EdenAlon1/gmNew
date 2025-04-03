package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpu implements ipn {
    final /* synthetic */ ffjm a;

    public gpu(ffjm ffjmVar) {
        this.a = ffjmVar;
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int a(iny inyVar, List list, int i) {
        return ipm.a(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int b(iny inyVar, List list, int i) {
        return ipm.b(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int c(iny inyVar, List list, int i) {
        return ipm.c(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int d(iny inyVar, List list, int i) {
        return ipm.d(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        iqk iqkVar;
        ipo ei;
        if (this.a != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ipl iplVar = (ipl) list.get(i);
                if (ffkj.e(ioe.b(iplVar), ConversationSuggestion.SUGGESTION_PROPERTY_TEXT)) {
                    iqkVar = iplVar.e(jzk.m(j, 0, 0, 0, 0, 11));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        iqkVar = null;
        int max = Math.max(iqkVar != null ? iqkVar.a : 0, 0);
        int max2 = Math.max(ipqVar.eo(gpy.a), (iqkVar != null ? iqkVar.b : 0) + ipqVar.en(gpy.c));
        if (iqkVar != null) {
            iqkVar.eh(imt.a);
        }
        if (iqkVar != null) {
            iqkVar.eh(imt.b);
        }
        ei = ipqVar.ei(max, max2, ffem.a, new gpt(iqkVar, max2));
        return ei;
    }
}
