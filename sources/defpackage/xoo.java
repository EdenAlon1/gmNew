package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xoo implements dtbg {
    final /* synthetic */ fflb a;
    final /* synthetic */ fgcm b;
    final /* synthetic */ xop c;

    public xoo(fflb fflbVar, fgcm fgcmVar, xop xopVar) {
        this.a = fflbVar;
        this.b = fgcmVar;
        this.c = xopVar;
    }

    @Override // defpackage.dtbg
    public final Object m(dtbf dtbfVar) {
        if (ffkj.e(dtbfVar, dtaw.a)) {
            if (!ffkj.e(dtbfVar, this.a.a)) {
                ((enrr) xop.a.e().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 87, "DirectSendInputsUiAdapter.kt")).q("Compose Row input state is now closed");
            }
            this.b.f(dtbi.a);
        } else {
            if (dtbfVar instanceof dtax) {
                dtax dtaxVar = (dtax) dtbfVar;
                dmne a = xop.a(dtaxVar.a);
                Object obj = this.a.a;
                dtax dtaxVar2 = obj instanceof dtax ? (dtax) obj : null;
                if (!ffkj.e(dtaxVar2 != null ? xop.a(dtaxVar2.a) : null, a)) {
                    ((enrr) xop.a.e().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 99, "DirectSendInputsUiAdapter.kt")).t("Compose Row now showing input %s without keyboard", a);
                }
                this.b.f(dtaxVar.a);
            } else if (dtbfVar instanceof dtay) {
                dtay dtayVar = (dtay) dtbfVar;
                dmne a2 = xop.a(dtayVar.a);
                Object obj2 = this.a.a;
                dtay dtayVar2 = obj2 instanceof dtay ? (dtay) obj2 : null;
                if (!ffkj.e(dtayVar2 != null ? xop.a(dtayVar2.a) : null, a2)) {
                    ((enrr) xop.a.e().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 110, "DirectSendInputsUiAdapter.kt")).t("Compose Row now showing input %s over keyboard", a2);
                }
                this.b.f(dtayVar.a);
            } else {
                if (!(dtbfVar instanceof dtbe)) {
                    throw new ffcd();
                }
                Object obj3 = this.a.a;
                dtbe dtbeVar = obj3 instanceof dtbe ? (dtbe) obj3 : null;
                Object obj4 = dtbeVar != null ? dtbeVar.a : null;
                if (((dtbe) dtbfVar).a instanceof dsop) {
                    if (obj4 == null || !(obj4 instanceof dsop)) {
                        ((enrr) xop.a.e().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 121, "DirectSendInputsUiAdapter.kt")).q("Compose Row keyboard is closing");
                    }
                    this.b.f(dtbi.a);
                } else {
                    if (obj4 == null || (obj4 instanceof dsop)) {
                        ((enrr) xop.a.e().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 127, "DirectSendInputsUiAdapter.kt")).q("Compose Row now showing keyboard without input");
                    }
                    this.b.f(new dtbp(dqmo.a(this.c.c.a)));
                }
            }
        }
        return ffcu.a;
    }
}
