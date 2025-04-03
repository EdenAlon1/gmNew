package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyp implements fbba {
    public static DataDonationActivity a(Activity activity) {
        if (!(activity instanceof DataDonationActivity)) {
            throw new IllegalStateException(a.I(activity, abyk.class, "Attempt to inject a Activity wrapper of type "));
        }
        DataDonationActivity dataDonationActivity = (DataDonationActivity) activity;
        dataDonationActivity.getClass();
        return dataDonationActivity;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
