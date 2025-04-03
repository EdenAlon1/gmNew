package defpackage;

import android.support.constraint.ConstraintLayout;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class wdy implements ejwd<engw<aqux>> {
    final /* synthetic */ wdz a;

    public wdy(wdz wdzVar) {
        this.a = wdzVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        ensk j = wdz.a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/conversation/simpicker/SimPickerFragmentPeer$1", "onError", (char) 293, "SimPickerFragmentPeer.java")).q("Failed to load self identities for SimPickerFragmentPeer.");
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void b(Object obj) {
        engw engwVar = (engw) obj;
        ekzz f = eleg.f("SimPickerFragmentPeer::onNewData localSelfIdentities");
        try {
            wdz wdzVar = this.a;
            wdzVar.m = wdzVar.d.b(engwVar);
            wdz wdzVar2 = this.a;
            bcxr bcxrVar = wdzVar2.m;
            weo H = wdzVar2.l.H();
            wee weeVar = H.a;
            weeVar.a = bcxrVar.b;
            weeVar.p();
            H.c.ifPresent(new Consumer() { // from class: wen
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    aktu aktuVar = (aktu) obj2;
                    crly crlyVar = aktuVar.a;
                    if (crlyVar.i()) {
                        return;
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) crlyVar.b();
                    ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.scheduled_send_send_option_button);
                    aktuVar.b.b(constraintLayout, new aktv());
                    aktuVar.b.b(imageView, new aktv());
                    constraintLayout.setVisibility(8);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            boolean z = true;
            if (bcxrVar.b.isEmpty() && bcxrVar.c == null) {
                z = false;
            }
            wdzVar2.g = z;
            if (wdzVar2.i && z) {
                wdzVar2.l.H().b(wdzVar2.k);
                wdzVar2.b(wdzVar2.j);
                wdzVar2.k = false;
                wdzVar2.i = false;
            }
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

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
