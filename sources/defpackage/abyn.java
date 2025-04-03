package defpackage;

import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyn implements ellh {
    final /* synthetic */ abyk a;

    public abyn(abyk abykVar) {
        this.a = abykVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        int a = ((abzp) ellfVar).a();
        abyk abykVar = this.a;
        abykVar.e = a;
        ((DataDonationActivity) abykVar.a.b()).finish();
        return elli.a;
    }
}
