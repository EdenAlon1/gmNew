package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgb implements upk {
    public static final entd a = entd.c("BugleSearch");
    public static final ensn b = new ensn(GroupManagementRequest.ACTION_TAG, String.class, false, false);
    private final ejlq c;
    private final aqcc d;
    private final adsd e;
    private final ffbr f;
    private final ejlr g = new wga();
    private MenuItem h;
    private Context i;
    private final cvqc j;

    public wgb(cvqc cvqcVar, ejlq ejlqVar, aqcc aqccVar, adsd adsdVar, ffbr ffbrVar) {
        this.j = cvqcVar;
        this.c = ejlqVar;
        this.d = aqccVar;
        this.e = adsdVar;
        this.f = ffbrVar;
    }

    @Override // defpackage.upk
    public final int a() {
        return R.id.action_star_message;
    }

    @Override // defpackage.upk
    public final void b(Menu menu, vyw vywVar) {
        if (vywVar.a() != 1) {
            return;
        }
        bcse bcseVar = (bcse) vywVar.b().iterator().next();
        if (bcseVar.aY()) {
            return;
        }
        if (((Boolean) bcseVar.n.b()).booleanValue() && bcseVar.aQ()) {
            return;
        }
        Iterator it = bcseVar.g.iterator();
        while (it.hasNext()) {
            String V = ((MessagePartCoreData) it.next()).V();
            if (le.x(V) || le.A(V) || le.n(V)) {
                MenuItem add = menu.add(0, R.id.action_star_message, 0, R.string.action_star);
                this.h = add;
                add.setShowAsAction(2);
                this.h.setIcon(bcseVar.v ? this.i.getDrawable(R.drawable.quantum_gm_ic_star_vd_theme_24) : this.i.getDrawable(R.drawable.quantum_gm_ic_star_outline_vd_theme_24));
                return;
            }
        }
    }

    @Override // defpackage.upk
    public final void d(ea eaVar) {
        this.c.k(this.g);
        this.i = eaVar.A();
    }

    @Override // defpackage.upk
    public final void h(bcse bcseVar) {
        boolean z = bcseVar.v;
        BugleConversationId bugleConversationId = new BugleConversationId(bcseVar.t());
        cvqc cvqcVar = this.j;
        MessageIdType u = bcseVar.u();
        elfl d = z ? cvqcVar.a.d(bugleConversationId, u) : cvqcVar.a.c(bugleConversationId, u);
        int i = true != bcseVar.v ? 3 : 4;
        cvqa createBuilder = cvqb.a.createBuilder();
        String a2 = bcseVar.t().a();
        createBuilder.copyOnWrite();
        cvqb cvqbVar = (cvqb) createBuilder.instance;
        a2.getClass();
        cvqbVar.b = a2;
        String b2 = bcseVar.u().b();
        createBuilder.copyOnWrite();
        cvqb cvqbVar2 = (cvqb) createBuilder.instance;
        b2.getClass();
        cvqbVar2.c = b2;
        String l = Long.toString(bcseVar.n());
        createBuilder.copyOnWrite();
        cvqb cvqbVar3 = (cvqb) createBuilder.instance;
        l.getClass();
        cvqbVar3.e = l;
        createBuilder.copyOnWrite();
        ((cvqb) createBuilder.instance).d = cvpz.b(i);
        cvqb build = createBuilder.build();
        this.c.i(ejlp.b(d), ejlm.a(build), this.g);
        if (i == 3) {
            cevh cevhVar = (cevh) this.f.b();
            cvpm cvpmVar = (cvpm) cvpn.a.createBuilder();
            long parseLong = Long.parseLong(build.c);
            cvpmVar.copyOnWrite();
            ((cvpn) cvpmVar.instance).b = parseLong;
            cevhVar.g(ceyr.g("StarAnalyticsWorkerHandler", cvpmVar.build()));
        }
        this.d.b(2, build);
        if (ddnm.a()) {
            this.e.a(27);
        }
    }

    @Override // defpackage.upk
    public final void e() {
    }
}
