package defpackage;

import android.widget.Button;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abym implements ellh {
    final /* synthetic */ abyk a;

    public abym(abyk abykVar) {
        this.a = abykVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        acad acadVar = (acad) ellfVar;
        im k = ((DataDonationActivity) this.a.a.b()).k();
        if (k != null) {
            ((Button) k.getCustomView().findViewById(R.id.data_donation_toolbar_button)).setEnabled(!acadVar.a());
        }
        return elli.a;
    }
}
