package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
@ffbs
/* loaded from: classes2.dex */
public final class wdc {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation/simpicker/ActiveSimChecker");
    public final ejwl b;
    public final wez c;
    public final wds d;
    public final ffbr e;
    public final ffbr f;
    public final ffjm g;
    public boolean h;
    public boolean i;
    public final AnonymousClass1 j = new txv<wey>() { // from class: wdc.1
        {
            super("multisim dialog data");
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            wey weyVar = (wey) obj;
            weyVar.getClass();
            wdc wdcVar = wdc.this;
            wdcVar.h = true;
            if (wdcVar.i) {
                if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                    ensk h = wdc.a.h();
                    h.Y(ente.a, "BugleConversation");
                    ((enrr) h.h("com/google/android/apps/messaging/conversation/simpicker/ActiveSimChecker$subscriptionCallback$1", "onNewData", 73, "ActiveSimChecker.kt")).q("Skipping multi sim dialog data result after activity recreation");
                }
                wdc.this.i = false;
                return;
            }
            if (weyVar instanceof wev) {
                if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                    ensk h2 = wdc.a.h();
                    h2.Y(ente.a, "BugleConversation");
                    wev wevVar = (wev) weyVar;
                    ((enrr) h2.h("com/google/android/apps/messaging/conversation/simpicker/ActiveSimChecker$subscriptionCallback$1", "onNewData", 83, "ActiveSimChecker.kt")).B("Automatically switching SIM to selfParticipant: %s, subscription: %s", wevVar.a, wevVar.b);
                }
                ((akzt) wdc.this.e.b()).c("Bugle.Sim.ActiveSimChecker.AutoSwitched");
                ((ddwn) wdc.this.f.b()).a(R.string.active_sim_switched_toast, true);
                wdc wdcVar2 = wdc.this;
                wev wevVar2 = (wev) weyVar;
                wdcVar2.g.a(wevVar2.a, Integer.valueOf(wevVar2.b));
                return;
            }
            if (!(weyVar instanceof wew)) {
                if (!ffkj.e(weyVar, wex.a)) {
                    throw new ffcd();
                }
                return;
            }
            if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                ensk h3 = wdc.a.h();
                h3.Y(ente.a, "BugleConversation");
                ((enrr) h3.h("com/google/android/apps/messaging/conversation/simpicker/ActiveSimChecker$subscriptionCallback$1", "onNewData", 97, "ActiveSimChecker.kt")).r("Displaying SIM picker dialog with %d subscriptions", ((wew) weyVar).a.size());
            }
            ((akzt) wdc.this.e.b()).c("Bugle.Sim.ActiveSimChecker.Dialog.Shown");
            final wdc wdcVar3 = wdc.this;
            List list = ((wew) weyVar).a;
            ffji ffjiVar = new ffji() { // from class: wdb
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    aztg aztgVar = (aztg) obj2;
                    wdc.this.g.a(aztgVar.g(), Integer.valueOf(aztgVar.e()));
                    return ffcu.a;
                }
            };
            wds wdsVar = wdcVar3.d;
            wdr wdrVar = (wdr) wdsVar.a.b();
            wdrVar.getClass();
            Context context = (Context) wdsVar.b.b();
            elbx elbxVar = (elbx) wdsVar.c.b();
            elbxVar.getClass();
            elet eletVar = (elet) wdsVar.d.b();
            eletVar.getClass();
            final wdp wdpVar = new wdp(wdrVar, context, elbxVar, eletVar, list, ffjiVar);
            elet eletVar2 = wdpVar.c;
            wdq wdqVar = wdpVar.f;
            final eles elesVar = new eles(eletVar2, wdqVar.getContext(), wdqVar);
            ehft ehftVar = new ehft(wdpVar.a);
            ehftVar.y(wdpVar.a.getString(R.string.sim_dialog_picker_title));
            ehftVar.v(elesVar, wdpVar.f.a, new elbb(wdpVar.b, "SimPickerDialog: Selected Sim", new DialogInterface.OnClickListener() { // from class: wdn
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    wdp.this.f.a = i;
                    elesVar.notifyDataSetChanged();
                }
            }));
            ehftVar.j(false);
            ehftVar.u(wdpVar.a.getString(R.string.sim_dialog_positive_button), new elbb(wdpVar.b, "SimPickerDialog: Switched To Selected Sim", new DialogInterface.OnClickListener() { // from class: wdo
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    wdp wdpVar2 = wdp.this;
                    wdpVar2.e.invoke(wdpVar2.d.get(wdpVar2.f.a));
                }
            }));
            ehftVar.a();
        }
    };

    /* JADX WARN: Type inference failed for: r1v1, types: [wdc$1] */
    public wdc(ejwl ejwlVar, wez wezVar, wds wdsVar, ffbr ffbrVar, ffbr ffbrVar2, ffjm ffjmVar) {
        this.b = ejwlVar;
        this.c = wezVar;
        this.d = wdsVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffjmVar;
    }
}
