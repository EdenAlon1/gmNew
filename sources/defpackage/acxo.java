package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxo {
    private static final cskc a = cskc.g("Bugle", "SwitcherDialog");
    private final Context b;

    public acxo(Context context) {
        this.b = context;
    }

    public final void a(acmd acmdVar) {
        b(acmdVar, false);
    }

    public final void b(acmd acmdVar, boolean z) {
        cskc cskcVar = a;
        cskcVar.p("Using SwitcherDialogFragment");
        eg egVar = (eg) ddzb.e(this.b);
        if (egVar == null || egVar.isFinishing()) {
            cskcVar.r("Activity is null or is finishing, can not show a dialog now");
            return;
        }
        fr a2 = egVar.a();
        if (a2.ai()) {
            cskcVar.r("Fragment manager has state saved, can not show a dialog now");
            return;
        }
        ea h = a2.h("conversation_list_root_fragment_tag");
        ea eaVar = null;
        if (h != null && h.I() != null) {
            eaVar = h.I().h("home_fragment_tag");
        }
        if (eaVar == null) {
            eaVar = a2.h("ditto_web_fragment_tag");
        }
        if (eaVar == null) {
            cskcVar.r("Cannot find home fragment or ditto web fragment");
            return;
        }
        acxs acxsVar = (acxs) acxt.a.createBuilder();
        acxsVar.copyOnWrite();
        ((acxt) acxsVar.instance).b = acmdVar.a();
        acxsVar.copyOnWrite();
        ((acxt) acxsVar.instance).c = z;
        acxt acxtVar = (acxt) acxsVar.build();
        acxr acxrVar = new acxr();
        fbae.e(acxrVar);
        ekku.a(acxrVar, acxtVar);
        acxrVar.t(eaVar.I(), "switcher_dialog_fragment");
    }
}
