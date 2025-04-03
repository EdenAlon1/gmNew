package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebij extends eayd {
    public enhk a = enoz.a;
    private final eave h;

    public ebij(eave eaveVar) {
        this.h = eaveVar;
    }

    @Override // defpackage.eayd
    public final dgqp b(Object obj) {
        return (dgqp) emxc.i(q(obj)).b(new emwl() { // from class: ebih
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                return ((eayf) obj2).a();
            }
        }).f();
    }

    @Override // defpackage.eayd
    public final boolean c(engw engwVar) {
        return enjk.q(engwVar, new emxg() { // from class: ebig
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ebij.this.b(obj) != null;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eayd
    public final void p(Context context, final Object obj, ViewGroup viewGroup, final ebny ebnyVar, View view, final ebvw ebvwVar, boolean z, eavl eavlVar) {
        final boolean z2;
        ebip ebipVar;
        emxf.m(viewGroup.getChildCount() <= 1, "Critical alert container can contain one child at most.");
        View childAt = viewGroup.getChildAt(0);
        emxf.m(childAt == null || (childAt instanceof ebip), "Critical alert container can only contain children of type CriticalAlertView.");
        dgqp b = b(obj);
        if (b == null) {
            if (childAt != null) {
                ((ebip) childAt).ho(ebvwVar);
                viewGroup.removeAllViews();
            }
            viewGroup.setVisibility(8);
            viewGroup.removeAllViews();
            view.setContentDescription(null);
            view.setFocusable(false);
            view.setOnClickListener(null);
            view.setClickable(false);
            return;
        }
        if (childAt == null) {
            z2 = z;
            ebipVar = new ebip(context, z2);
            viewGroup.addView(ebipVar);
            ebipVar.b(ebvwVar);
        } else {
            z2 = z;
            ebipVar = (ebip) childAt;
        }
        final ebip ebipVar2 = ebipVar;
        eave eaveVar = this.h;
        ebipVar2.a.setText(b.c);
        ebipVar2.b.setText(b.d);
        ebipVar2.c.a(engw.s(b.e, b.f));
        ebipVar2.setContentDescription(ebipVar2.getContext().getString(R.string.og_account_critical_alert_view_label_a11y, b.c, eavn.b(obj, eaveVar)) + "\n" + b.d + "\n" + b.e);
        String b2 = ebkp.b(this.h, obj);
        engw r = r(obj);
        int size = r.size();
        for (int i = 0; i < size; i++) {
            dgqp a = ((eayf) r.get(i)).a();
            if (!a.h) {
                s(b2, a);
            }
        }
        ebipVar2.setOnClickListener(new View.OnClickListener() { // from class: ebie
            @Override // android.view.View.OnClickListener
            public final void onClick(final View view2) {
                ebvwVar.f(new dvxf(5), view2);
                final boolean z3 = z2;
                final ebij ebijVar = ebij.this;
                final Object obj2 = obj;
                ebnx.a(ebnyVar, new Runnable() { // from class: ebid
                    @Override // java.lang.Runnable
                    public final void run() {
                        ebij ebijVar2 = ebij.this;
                        ebijVar2.t(ebijVar2.q(obj2), view2, z3);
                    }
                });
            }
        });
        viewGroup.setVisibility(0);
        view.setContentDescription(ebipVar2.getContentDescription());
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() { // from class: ebif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ebip.this.performClick();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eayf q(Object obj) {
        engw r = r(obj);
        if (r.isEmpty()) {
            return null;
        }
        return (eayf) r.get(0);
    }

    public final engw r(Object obj) {
        engw engwVar = (engw) ebkp.a(this.h, obj, this.a, null);
        if (engwVar != null) {
            return engwVar;
        }
        int i = engw.d;
        return enou.a;
    }

    protected abstract void s(String str, dgqp dgqpVar);

    protected abstract void t(eayf eayfVar, View view, boolean z);
}
