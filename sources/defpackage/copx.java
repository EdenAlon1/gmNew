package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class copx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ AsyncTelephonySimStateReceiver b;
    final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copx(AsyncTelephonySimStateReceiver asyncTelephonySimStateReceiver, Intent intent, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = asyncTelephonySimStateReceiver;
        this.c = intent;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((copx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        if (defpackage.ffkj.e(r2.getAction(), "android.telephony.action.CARRIER_CONFIG_CHANGED") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007d, code lost:
    
        if (defpackage.ffkj.e(r2.getAction(), "android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        if (defpackage.ffkj.e(r2.getAction(), "android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        r2 = r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
    
        if (r2 == (-2044189691)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        if (r2 == 1034051831) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        if (r2 == 1924388665) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r7.equals("ABSENT") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        ((defpackage.enrr) com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver.a.h().h("com/google/android/apps/messaging/shared/simstatetracker/AsyncTelephonySimStateReceiver", "doWorkInternal", 94, "AsyncTelephonySimStateReceiver.kt")).t("Start sim removal verification due to %s.", r7);
        ((defpackage.coqy) r14.m().b()).a(defpackage.eraj.UPDATE_TRIGGER_SIM_STATE_ABSENT);
        r14.n(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0176, code lost:
    
        if (defpackage.ffcu.a != r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0178, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
    
        if (r7.equals("NOT_READY") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        ((defpackage.enrr) com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver.a.h().h("com/google/android/apps/messaging/shared/simstatetracker/AsyncTelephonySimStateReceiver", "doWorkInternal", 103, "AsyncTelephonySimStateReceiver.kt")).t("Start sim removal verification due to %s.", r7);
        ((defpackage.coqy) r14.m().b()).a(defpackage.eraj.UPDATE_TRIGGER_SIM_STATE_NOT_READY);
        r14.n(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0104, code lost:
    
        if (r7.equals("LOADED") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        ((defpackage.coqy) r14.m().b()).b(defpackage.eraj.UPDATE_TRIGGER_SIM_STATE_LOADED);
        r14.n(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0119, code lost:
    
        ((defpackage.enrr) com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver.a.j().h("com/google/android/apps/messaging/shared/simstatetracker/AsyncTelephonySimStateReceiver", "doWorkInternal", 112, "AsyncTelephonySimStateReceiver.kt")).t("Unexpected SIM_STATE action: %s", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012d, code lost:
    
        r1 = (defpackage.coqy) r14.m().b();
        r2 = r2.getAction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013b, code lost:
    
        if (r2 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013d, code lost:
    
        r7 = r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0144, code lost:
    
        if (r7 == (-1138588223)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        if (r7 == (-271221703)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014e, code lost:
    
        if (r7 == 1188453747) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0155, code lost:
    
        if (r2.equals("android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0157, code lost:
    
        r2 = defpackage.eraj.UPDATE_TRIGGER_DEFAULT_SUBSCRIPTION_CHANGED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016e, code lost:
    
        r1.b(r2);
        r14.n(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x015e, code lost:
    
        if (r2.equals("android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0160, code lost:
    
        r2 = defpackage.eraj.UPDATE_TRIGGER_DEFAULT_SMS_SUBSCRIPTION_CHANGED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0167, code lost:
    
        if (r2.equals("android.telephony.action.CARRIER_CONFIG_CHANGED") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0169, code lost:
    
        r2 = defpackage.eraj.UPDATE_TRIGGER_CARRIER_CONFIG_CHANGED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016c, code lost:
    
        r2 = defpackage.eraj.UPDATE_TRIGGER_UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0032, code lost:
    
        if (r14.equals("android.intent.action.SIM_STATE_CHANGED") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x003a, code lost:
    
        if (r14.equals("android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0041, code lost:
    
        if (r14.equals("android.telephony.action.CARRIER_CONFIG_CHANGED") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r14.equals("android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r14 = r13.b;
        r2 = r13.c;
        r13.a = 1;
        r7 = r2.getStringExtra("ss");
        ((defpackage.enrr) com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver.a.h().h("com/google/android/apps/messaging/shared/simstatetracker/AsyncTelephonySimStateReceiver", "doWorkInternal", 77, "AsyncTelephonySimStateReceiver.kt")).D("Received intent action: %s with extra SIM_STATE: %s", r2.getAction(), r7);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.copx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new copx(this.b, this.c, ffguVar);
    }
}
