package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aecx implements ejwd<Integer> {
    final /* synthetic */ Bundle a;
    final /* synthetic */ aedh b;

    public aecx(aedh aedhVar, Bundle bundle) {
        this.a = bundle;
        this.b = aedhVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        if (!((aube) this.b.bv.b()).a()) {
            aeaa.a.r("Error in popup callback");
            return;
        }
        ensk j = aedh.a.j();
        j.Y(ente.a, "HomeFragmentFlogger");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$2", "onError", (char) 1312, "HomeFragmentPeer.java")).q("Error in popup callback");
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Integer num = (Integer) obj;
        if (((aube) this.b.bv.b()).a()) {
            ensk e = aedh.a.e();
            e.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/HomeFragmentPeer$2", "onNewData", 1296, "HomeFragmentPeer.java")).t("Popup callback new data: %d", num);
        } else {
            cskc cskcVar = aeaa.a;
            Objects.toString(num);
            cskcVar.m("Popup callback new data: ".concat(String.valueOf(num)));
        }
        if (num.intValue() != -1) {
            aedh aedhVar = this.b;
            adzz adzzVar = aedhVar.b;
            eg fe = adzzVar.fe();
            ViewGroup e2 = aedh.e(adzzVar);
            int intValue = num.intValue();
            boolean z = this.a != null;
            if (((Boolean) ajid.a.e()).booleanValue()) {
                return;
            }
            ajid ajidVar = aedhVar.av;
            ajhy[] ajhyVarArr = ajidVar.h;
            int length = ajhyVarArr.length;
            if (intValue >= length) {
                ajid.b.r(a.r(length, intValue, "Index out of length: ", " size: "));
                return;
            }
            ajhy ajhyVar = ajhyVarArr[intValue];
            if (!ajidVar.d()) {
                if (ajhyVar.e(fe, e2, z)) {
                    ajid.b.m(a.h(intValue, "showing popup: "));
                    ajidVar.k = ajhyVar;
                    ((ctyx) ajidVar.d.b()).k("conversation_list_last_popup_show_timestamp_ms", ajidVar.e.f().toEpochMilli());
                    return;
                }
                return;
            }
            ajid.b.m("Don't show popup as it's showing: " + ajidVar.j);
            ajih ajihVar = (ajih) ajidVar.g.b();
            int f = ajhyVar.f();
            ajidVar.k.getClass();
            ((akzt) ajihVar.a.b()).e("Bugle.HomeScreen.PopupHost.Show.Suppressed", f - 1);
            ((akzt) ajihVar.a.b()).e("Bugle.HomeScreen.PopupHost.Show.Suppressor", r0.f() - 1);
        }
    }

    @Override // defpackage.ejwd
    public final void hB() {
    }
}
