package defpackage;

import android.content.ComponentName;
import com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cosf extends ffhv implements ffjm {
    final /* synthetic */ cosg a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cosf(cosg cosgVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cosgVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cosf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        try {
            this.a.b.getPackageManager().setComponentEnabledSetting(new ComponentName(this.a.b, (Class<?>) AsyncTelephonySimStateReceiver.class), this.b, 1);
        } catch (Exception e) {
            ((enrr) ((enrr) cosg.a.i()).g(e).h("com/google/android/apps/messaging/shared/simstatetracker/TelephonySimStateReceiverProviderImpl$overrideAsyncTelephonySimStateReceiverState$1", "invokeSuspend", 33, "TelephonySimStateReceiverProviderImpl.kt")).q("Failed to override manifest entry for AsyncTelephonySimStateReceiver.");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cosf(this.a, this.b, ffguVar);
    }
}
