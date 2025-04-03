package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cvwy extends ffkh implements ffjm {
    public cvwy(Object obj) {
        super(2, obj, cvxj.class, "onClick", "onClick(Lcom/google/android/apps/messaging/shared/api/messaging/identity/MessagingIdentity;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)V", 0);
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        aoku aokuVar = (aoku) obj;
        cwir cwirVar = (cwir) obj2;
        aokuVar.getClass();
        cwirVar.getClass();
        cvxj cvxjVar = (cvxj) this.g;
        cvxjVar.c.c(new ChipData(aokuVar, ttz.a(aokuVar), null, null, false, 28, null));
        if (cwirVar.d == cwjb.a) {
            axol.k(cvxjVar.d, null, new cvxe(cvxjVar, aokuVar, null), 3);
        }
        return ffcu.a;
    }
}
