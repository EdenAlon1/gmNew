package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aedd implements ejwd<axez> {
    final /* synthetic */ aedh a;

    public aedd(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        if (((aube) this.a.bv.b()).a()) {
            ensk i = aedh.a.i();
            i.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) ((enrr) i).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$6", "onError", (char) 1524, "HomeFragmentPeer.java")).q("SubscriptionMixin for getCmsSettingsDataSource failed");
        } else {
            csjb b = aeaa.a.b();
            b.I("SubscriptionMixin for getCmsSettingsDataSource failed");
            b.s(th);
        }
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Snackbar e;
        axez axezVar = (axez) obj;
        aeep aeepVar = (aeep) this.a.bb.b();
        aedh aedhVar = this.a;
        adzz adzzVar = aedhVar.b;
        View view = adzzVar.Q;
        ViewGroup f = aedh.f(adzzVar);
        View g = aedhVar.ac.g();
        axezVar.getClass();
        f.getClass();
        axmm axmmVar = aeepVar.c;
        boolean m = axmm.m(axezVar);
        if (!aeepVar.a.a() && axezVar.e && !((aeix) aeepVar.b.b()).g().booleanValue() && axezVar.k && m) {
            ((aeix) aeepVar.b.b()).q(true);
            if (view == null) {
                throw new IllegalStateException("Required value was null.");
            }
            view.getViewTreeObserver().addOnPreDrawListener(new aeen(f, g, aeepVar, view));
            return;
        }
        if (aeepVar.a.a() && axezVar.e && !((aeix) aeepVar.b.b()).i().booleanValue() && m) {
            ((aeix) aeepVar.b.b()).s(true);
            if (view == null) {
                throw new IllegalStateException("Required value was null.");
            }
            view.getViewTreeObserver().addOnPreDrawListener(new aeeo(f, g, aeepVar, view));
            return;
        }
        if (!aeepVar.a.a() && ((aeix) aeepVar.b.b()).g().booleanValue() && (!m || !axezVar.e)) {
            Snackbar e2 = ((aeix) aeepVar.b.b()).e();
            if (e2 != null) {
                e2.e();
                ((aeix) aeepVar.b.b()).q(false);
                return;
            }
            return;
        }
        if (aeepVar.a.a() && ((aeix) aeepVar.b.b()).i().booleanValue()) {
            if ((m && axezVar.e) || (e = ((aeix) aeepVar.b.b()).e()) == null) {
                return;
            }
            e.e();
            ((aeix) aeepVar.b.b()).s(false);
        }
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
