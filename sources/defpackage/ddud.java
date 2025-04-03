package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.resultsview.conversation.SearchConversationResultItemView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddud extends vk {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/search/resultsview/SearchConversationListAdapter");
    public final Context d;
    public final Activity e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final List i = new ArrayList();
    public final Set j = new HashSet();
    public ddqu k;
    private final ekyo l;
    private final ffbr m;

    public ddud(ekyo ekyoVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, Activity activity, Context context) {
        this.d = context;
        this.e = activity;
        this.m = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.l = ekyoVar;
        B(true);
    }

    public final void F(ddpv ddpvVar) {
        ekzz f = eleg.f("SearchConversationListAdapter#updateResults");
        try {
            this.i.clear();
            this.j.clear();
            this.i.addAll(((ddpo) ddpvVar).b);
            this.j.addAll(((ddpo) ddpvVar).c);
            p();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vk
    public final int a() {
        return this.i.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        SearchConversationResultItemView searchConversationResultItemView = (SearchConversationResultItemView) LayoutInflater.from(this.d).inflate(R.layout.zero_state_search_conversation_result_item_view_v2, viewGroup, false);
        final dduc dducVar = new dduc(searchConversationResultItemView);
        searchConversationResultItemView.setOnClickListener(new elay((elbx) this.m.b(), "Search conversation result clicked", new View.OnClickListener() { // from class: ddub
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddqu ddquVar;
                FreeTextFilterDataItem n;
                String str;
                int fr = dducVar.fr();
                if (fr == -1) {
                    ensk h = ddud.a.h();
                    h.Y(ente.a, "BugleSearch");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/search/resultsview/SearchConversationListAdapter", "onClick", 147, "SearchConversationListAdapter.java")).q("binding adapter position is invalid while clicking on search conversation results.");
                    return;
                }
                ddud ddudVar = ddud.this;
                aely aelyVar = (aely) ddudVar.i.get(fr);
                ((ddpl) ddudVar.f.b()).a();
                ((ddpl) ddudVar.f.b()).f(6, 2);
                ((ddpm) ddudVar.g.b()).e(1);
                ((ddpm) ddudVar.g.b()).h(1);
                if (ddudVar.j.contains(aelyVar.k().w()) || (ddquVar = ddudVar.k) == null || (n = ddquVar.n()) == null) {
                    str = null;
                } else {
                    String str2 = n.a().a;
                    if (str2 != null) {
                        str2 = str2.toLowerCase(ctid.c(ddudVar.d));
                    }
                    str = str2;
                }
                ((ayfg) ddudVar.h.b()).w(ddudVar.e, (ConversationId) aelyVar.k().A().get(), aelyVar.k().x(), new bcyl(null, aelyVar.k().J(), null), str, aelyVar.k().aa());
            }
        }));
        return dducVar;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void i(wr wrVar) {
        dduc dducVar = (dduc) wrVar;
        g(dducVar, dducVar.fr());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void g(dduc dducVar, int i) {
        elav a2 = this.l.a("SearchConversationListAdapter onBindViewHolder");
        try {
            aely aelyVar = (aely) this.i.get(i);
            ddvr H = dducVar.t.H();
            engw engwVar = dduc.s;
            if (engwVar.isEmpty()) {
                H.a(aelyVar);
            } else {
                enqv it = engwVar.iterator();
                while (it.hasNext()) {
                    E next = it.next();
                    if (next instanceof aelw) {
                        aelw aelwVar = (aelw) next;
                        enqu listIterator = aelwVar.a().listIterator();
                        while (listIterator.hasNext()) {
                            aemb aembVar = (aemb) listIterator.next();
                            aema aemaVar = (aema) H.b.get(aembVar);
                            if (aemaVar == null) {
                                ddvr.a.r(String.format("Received a change payload for a nonexistent view part: %s", aembVar));
                            } else if (aelwVar.b()) {
                                aemaVar.b(aemaVar.a(aelyVar), false);
                            } else {
                                aemaVar.b(aelyVar, false);
                            }
                        }
                    } else if ((next instanceof String) && "Selection-Changed".equals(next)) {
                        H.a(aelyVar);
                    }
                }
            }
            a2.close();
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
