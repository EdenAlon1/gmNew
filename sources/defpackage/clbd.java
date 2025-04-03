package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clbd {
    public static final entd a = entd.c("BugleGroupManagement");
    public final coxk b;
    public final clbc c;
    public final akzt d;

    public clbd(coxk coxkVar, clbc clbcVar, akzt akztVar) {
        this.b = coxkVar;
        this.c = clbcVar;
        this.d = akztVar;
    }

    public final clba a(cpxu cpxuVar) {
        String I = this.b.I(cpxuVar);
        if (emxe.c(I)) {
            ensz enszVar = (ensz) a.j();
            enszVar.Y(csux.r, cpxuVar);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientsManager", "getRcsGroupTelephonyData", 68, "RcsGroupTelephonyRecipientsManager.java")).q("Cannot find recipient IDs for provided thread ID.");
            clau clauVar = new clau();
            clauVar.d(claz.NO_RECIPIENT_IDS_FOR_THREAD_ID);
            return clauVar.e();
        }
        I.getClass();
        if (TextUtils.split(I, " ").length != 1) {
            ensz enszVar2 = (ensz) a.j();
            enszVar2.Y(csux.r, cpxuVar);
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientsManager", "getRcsGroupTelephonyData", 79, "RcsGroupTelephonyRecipientsManager.java")).q("RCS group thread should only have a single recipient ID.");
            clau clauVar2 = new clau();
            clauVar2.d(claz.MULTIPLE_RECIPIENT_IDS_RETURNED);
            return clauVar2.e();
        }
        List K = this.b.K(I);
        if (K.size() != 1) {
            ensz enszVar3 = (ensz) a.j();
            enszVar3.Y(csux.r, cpxuVar);
            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientsManager", "getRcsGroupTelephonyData", 91, "RcsGroupTelephonyRecipientsManager.java")).q("RCS group thread should only have a single recipient.");
            clau clauVar3 = new clau();
            clauVar3.d(claz.MULTIPLE_RECIPIENTS_PARSED);
            return clauVar3.e();
        }
        aoku aokuVar = (aoku) K.get(0);
        cfva cfvaVar = aoqm.a;
        clax a2 = this.c.a(emxe.b(aokuVar.i(((Boolean) new aoqj().get()).booleanValue())));
        if (a2 == null) {
            clau clauVar4 = new clau();
            clauVar4.d(claz.INVALID_RECIPIENT_ADDRESS_FORMAT);
            return clauVar4.e();
        }
        clau clauVar5 = new clau();
        clauVar5.a = Optional.of(a2);
        return clauVar5.e();
    }
}
