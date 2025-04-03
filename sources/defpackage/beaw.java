package defpackage;

import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class beaw extends csld {
    final /* synthetic */ CustomUpgradeSteps a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beaw(CustomUpgradeSteps customUpgradeSteps) {
        super("Bugle.Async.markAsReadInTelephonyForUpgrade.Duration");
        this.a = customUpgradeSteps;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.markMessagesAsReadInTelephonySync();
    }
}
