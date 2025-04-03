package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebkh extends ebiq {
    public final ebkn a;

    public ebkh(ebkn ebknVar) {
        this.a = ebknVar;
    }

    @Override // defpackage.ebiq
    public final enip a() {
        return ((ebkb) this.a).d;
    }

    @Override // defpackage.ebiq
    public final boolean b() {
        return ((Boolean) ((ebkb) this.a).b.get()).booleanValue();
    }

    @Override // defpackage.ebiq
    public final boolean c(fr frVar, ecba ecbaVar, final Runnable runnable) {
        SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) ecbaVar;
        selectedAccountDisc.c.getContext();
        Context context = selectedAccountDisc.c.getContext();
        ecbi ecbiVar = (ecbi) frVar.h("com.google.android.libraries.onegoogle.tooltip.TooltipFragment");
        if (ecbiVar == null) {
            ecbiVar = new ecbi();
        }
        adjl adjlVar = ((ebkb) this.a).f.a;
        String str = adjlVar.a;
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        ebko ebkoVar = new ebko(new ContextThemeWrapper(new ContextThemeWrapper(context, R.style.OneGoogle_Tooltip_White_GoogleMaterial_DayNight), R.style.OneGoogle_Attrs_GoogleMaterial), str, adjlVar.b);
        ecbc ecbcVar = new ecbc(emxc.j(Integer.valueOf(dtqo.a(ebkoVar.getContext(), R.attr.colorSurface))), (((ebkb) this.a).c || ebow.a(context)) ? emxc.j(Integer.valueOf(dtqo.a(ebkoVar.getContext(), R.attr.slimCardScrimColor))) : emux.a, ebkoVar, new PopupWindow.OnDismissListener() { // from class: ebkf
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                runnable.run();
            }
        }, new ebkg(this, ebkoVar, ecbaVar, ecbiVar));
        boolean z = false;
        if (!ecaz.a(ecbaVar)) {
            return false;
        }
        ecbiVar.d = new ecbb(ecbcVar, ecbaVar);
        ecbiVar.c.b();
        Activity activity = (Activity) selectedAccountDisc.i.get();
        if (activity != null && activity.isFinishing()) {
            z = true;
        }
        if (ecbiVar.aF() || ecbiVar.e || z) {
            return true;
        }
        cg cgVar = new cg(frVar);
        cgVar.u(ecbiVar, "com.google.android.libraries.onegoogle.tooltip.TooltipFragment");
        cgVar.k();
        return true;
    }

    @Override // defpackage.ebiq
    public final int d() {
        return ((ebkb) this.a).g;
    }

    public final void e(View view, int i) {
        int d = d();
        eyfw eyfwVar = ebvr.a;
        ebvu ebvuVar = (ebvu) ebvv.a.createBuilder();
        epnp epnpVar = (epnp) epnq.a.createBuilder();
        epnf epnfVar = (epnf) epng.a.createBuilder();
        epnfVar.copyOnWrite();
        epng epngVar = (epng) epnfVar.instance;
        epngVar.c = d - 1;
        epngVar.b |= 2;
        epnpVar.copyOnWrite();
        epnq epnqVar = (epnq) epnpVar.instance;
        epng epngVar2 = (epng) epnfVar.build();
        epngVar2.getClass();
        epnqVar.e = epngVar2;
        epnqVar.c |= 4;
        ebvuVar.copyOnWrite();
        ebvv ebvvVar = (ebvv) ebvuVar.instance;
        epnq epnqVar2 = (epnq) epnpVar.build();
        epnqVar2.getClass();
        ebvvVar.c = epnqVar2;
        ebvvVar.b = 1 | ebvvVar.b;
        dvxb[] dvxbVarArr = {new dvxb(eyfwVar, (ebvv) ebvuVar.build())};
        ebvg ebvgVar = (ebvg) ((ebkb) this.a).a;
        Object a = ebvgVar.c.a();
        efbd.c();
        dwch dwchVar = ebvgVar.a;
        dvwz a2 = dwchVar.c().a(i);
        a2.g(dwca.a("onegoogle-android"));
        a2.g(ebve.d(ebvgVar.b, a).a());
        a2.f(dvxbVarArr[0]);
        dwchVar.b().b(view, a2);
    }

    public final void f(View view) {
        ebwb.a(((ebvg) ((ebkb) this.a).a).a.a(), new dvxf(5), view);
    }
}
