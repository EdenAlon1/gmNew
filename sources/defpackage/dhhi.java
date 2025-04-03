package defpackage;

import com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhhi extends AbstractContactsSyncServiceCallbacks {
    final /* synthetic */ dftp a;

    public dhhi(dftp dftpVar) {
        this.a = dftpVar;
    }

    @Override // com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks, com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public final void onDeviceContactsSyncSettingChanged() {
        this.a.b(new dhhh());
    }
}
