package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyk extends abyo {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public int e = 1;

    public abyk(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    public final void a(int i, int i2) {
        im k = ((DataDonationActivity) this.a.b()).k();
        if (k != null) {
            k.setHomeAsUpIndicator(R.drawable.tinted_quantum_ic_clear_24);
            k.setDisplayHomeAsUpEnabled(true);
            k.setDisplayShowCustomEnabled(true);
            k.setDisplayShowTitleEnabled(false);
            k.setCustomView(R.layout.data_donation_toolbar);
            ((TextView) k.getCustomView().findViewById(R.id.data_donation_toolbar_title)).setText(((DataDonationActivity) this.a.b()).getResources().getQuantityString(R.plurals.donation_toolbar_title, i2, Integer.valueOf(i2)));
            Button button = (Button) k.getCustomView().findViewById(R.id.data_donation_toolbar_button);
            boolean z = i > 0;
            final boolean z2 = z && i2 == 0;
            button.setEnabled(z);
            button.setText(z2 ? R.string.donation_toolbar_select : R.string.donation_toolbar_deselect);
            if (z) {
                button.setOnClickListener(new View.OnClickListener() { // from class: abyi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ea h = ((DataDonationActivity) abyk.this.a.b()).a().h("dd_fragment_tag");
                        if (h != null) {
                            ellj.f(new abyb(z2), h);
                        }
                    }
                });
            }
        }
    }
}
