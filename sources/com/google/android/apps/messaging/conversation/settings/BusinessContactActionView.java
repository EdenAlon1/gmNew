package com.google.android.apps.messaging.conversation.settings;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.BusinessContactActionView;
import defpackage.altk;
import defpackage.crjo;
import defpackage.csix;
import defpackage.ddzb;
import defpackage.vzb;
import defpackage.waa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BusinessContactActionView extends waa {
    public altk a;
    public ddzb b;

    public BusinessContactActionView(Context context) {
        super(context);
    }

    public final void a(final crjo crjoVar, String str, String str2, boolean z) {
        vzb vzbVar = (vzb) getTag();
        if (vzbVar == null) {
            setVisibility(8);
            csix.c("Cant't render business contact action: null view holder.");
            return;
        }
        TextView textView = vzbVar.a;
        TextView textView2 = vzbVar.b;
        ImageView imageView = vzbVar.c;
        View view = vzbVar.d;
        View view2 = vzbVar.e;
        textView.setText(str);
        if (crjoVar == null) {
            imageView.setVisibility(4);
        } else {
            imageView.setImageDrawable(crjoVar.f(getContext().getColor(R.color.info_and_options_contact_action_icon_tint_m2)));
            imageView.setVisibility(0);
            if (TextUtils.isEmpty(str2)) {
                str2 = crjoVar.a.getResources().getString(crjoVar.a());
            }
            view2.setContentDescription(crjoVar.g(str2));
        }
        textView2.setText(str2);
        view2.setOnClickListener(new View.OnClickListener() { // from class: vza
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BusinessContactActionView businessContactActionView = BusinessContactActionView.this;
                crjo crjoVar2 = crjoVar;
                if (crjoVar2 == null) {
                    businessContactActionView.a.aF(1, 3, null);
                    businessContactActionView.b.k(R.string.business_action_failed_to_launch);
                } else {
                    if (!crjoVar2.i()) {
                        businessContactActionView.b.k(R.string.business_action_failed_to_launch);
                    }
                    businessContactActionView.a.aF(crjoVar2.j(), 3, crjoVar2.h());
                }
            }
        });
        view.setVisibility(true == z ? 0 : 8);
    }

    public BusinessContactActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
