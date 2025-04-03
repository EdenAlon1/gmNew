package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.etouffee.util.LinkTextUtil;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tic implements ejxk {
    final /* synthetic */ tid a;

    public tic(tid tidVar) {
        this.a = tidVar;
    }

    private final void c() {
        MaterialButton materialButton = (MaterialButton) this.a.a.N().findViewById(R.id.fi_settings_redirect_button);
        TextView textView = (TextView) this.a.a.N().findViewById(R.id.fi_settings_redirect_title);
        TextView textView2 = (TextView) this.a.a.N().findViewById(R.id.fi_settings_redirect_summary);
        Context z = this.a.a.z();
        if (z == null) {
            throw new IllegalStateException("Required value was null.");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z.getString(R.string.fi_settings_redirect_summary_home, crmi.a(z)));
        String a = crmi.a(z);
        a.getClass();
        LinkTextUtil.b(spannableStringBuilder, z, a, "", null);
        final tid tidVar = this.a;
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: tib
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tid tidVar2 = tid.this;
                Context z2 = tidVar2.a.z();
                if (z2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Intent d = ((ayfg) tidVar2.f.b()).d(z2);
                d.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
                knx knxVar = new knx(z2);
                knxVar.d(d);
                knxVar.b();
            }
        });
        materialButton.setText(R.string.fi_settings_redirect_button_home);
        textView.setText(R.string.fi_settings_redirect_title_home);
        textView2.setText(spannableStringBuilder);
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        this.a.g.s("Failed to load data from FiRedirectPageDataService", th);
        c();
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        tgx tgxVar = (tgx) obj;
        if (tgxVar == tgx.i || tgxVar == tgx.h) {
            c();
        }
    }
}
