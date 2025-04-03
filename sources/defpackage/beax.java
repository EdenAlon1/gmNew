package defpackage;

import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class beax extends csld {
    final /* synthetic */ boolean a;
    final /* synthetic */ CustomUpgradeSteps b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beax(CustomUpgradeSteps customUpgradeSteps, boolean z) {
        super("Bugle.Async.setThreadArchiveStatusInTelephonyForUpgrade.Duration");
        this.a = z;
        this.b = customUpgradeSteps;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.setThreadArchiveStatusInTelephonySync(this.a);
    }
}
