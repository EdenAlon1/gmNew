package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.ui.search.resultsview.StarredMessagesResultItemView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddui extends vk {
    public final Context a;
    public final ffbr d;
    public final List e = new ArrayList();
    public final ffbr f;
    public final ffbr g;
    private final ekyo h;
    private final ffbr i;

    public ddui(ekyo ekyoVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, Context context) {
        this.a = context;
        this.i = ffbrVar;
        this.d = ffbrVar2;
        this.h = ekyoVar;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        B(true);
    }

    public final void F(ddpv ddpvVar) {
        ekzz f = eleg.f("StarredMessagesAdapter#updateResults");
        try {
            this.e.clear();
            this.e.addAll(((ddpo) ddpvVar).a);
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
        return this.e.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        StarredMessagesResultItemView starredMessagesResultItemView = (StarredMessagesResultItemView) LayoutInflater.from(this.a).inflate(R.layout.starred_messages_result_item_view_v3, viewGroup, false);
        final dduh dduhVar = new dduh(starredMessagesResultItemView);
        starredMessagesResultItemView.setOnClickListener(new elay((elbx) this.i.b(), "Search starred message result clicked", new View.OnClickListener() { // from class: ddug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dduh dduhVar2 = dduhVar;
                ddui dduiVar = ddui.this;
                aely aelyVar = (aely) dduiVar.e.get(dduhVar2.fr());
                ((ddpm) dduiVar.f.b()).e(7);
                ((ddpl) dduiVar.g.b()).f(6, 10);
                ((ddpl) dduiVar.g.b()).a();
                boolean aa = aelyVar.k().aa();
                ((ayfg) dduiVar.d.b()).t(dduiVar.a, (ConversationId) aelyVar.k().A().get(), aelyVar.k().x(), null, new bdja(null), new bcyl(null, aelyVar.k().J(), null), null, "", aa);
            }
        }));
        return dduhVar;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void i(wr wrVar) {
        dduh dduhVar = (dduh) wrVar;
        g(dduhVar, dduhVar.fr());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void g(dduh dduhVar, int i) {
        elav a = this.h.a("StarredMessagesAdapter onBindViewHolder");
        try {
            aely aelyVar = (aely) this.e.get(i);
            dduk H = dduhVar.t.H();
            engw engwVar = dduh.s;
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
                                dduk.a.r(String.format("Received a change payload for a nonexistent view part: %s", aembVar));
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
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
