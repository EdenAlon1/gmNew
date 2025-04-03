package com.google.android.apps.messaging.ui.appsettings;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.FederatedLearningSettingsActivity;
import defpackage.adtc;
import defpackage.cg;
import defpackage.ctjd;
import defpackage.cwvm;
import defpackage.cwvv;
import defpackage.ddyi;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FederatedLearningSettingsActivity extends cwvv {
    public adtc K;
    public ffbr L;

    @Override // defpackage.aktz
    protected final int C() {
        return R.layout.federated_learning_settings_activity_gm3;
    }

    @Override // defpackage.aktz
    protected final Integer G() {
        return Integer.valueOf(R.id.federated_learning_settings_container);
    }

    @Override // defpackage.aktz, defpackage.cwqd, defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(0);
        TextView textView = (TextView) findViewById(R.id.federated_learning_preference_fragment_container_text_view);
        final String str = (String) ctjd.F.e();
        if (!TextUtils.isEmpty(str)) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: cwvi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FederatedLearningSettingsActivity federatedLearningSettingsActivity = FederatedLearningSettingsActivity.this;
                    ((alef) federatedLearningSettingsActivity.L.b()).c(3, 3);
                    federatedLearningSettingsActivity.K.e(federatedLearningSettingsActivity, str);
                }
            });
        }
        SpannableStringBuilder d = ddyi.d(this, R.string.federated_learning_preference_info_text);
        textView.setText(d);
        textView.setContentDescription(d.toString());
        cg cgVar = new cg(a());
        cgVar.E(R.id.federated_learning_preference_fragment_container, new cwvm());
        cgVar.j();
    }
}
