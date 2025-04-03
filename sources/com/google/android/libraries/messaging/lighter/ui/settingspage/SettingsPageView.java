package com.google.android.libraries.messaging.lighter.ui.settingspage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.settingspage.SettingsPageView;
import defpackage.dzyd;
import defpackage.eadk;
import defpackage.eadl;
import defpackage.eadn;
import defpackage.ehdr;
import defpackage.fdql;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SettingsPageView extends LinearLayout implements eadl {
    public final Switch a;
    private final TextView b;
    private final Toolbar c;

    public SettingsPageView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final eadn eadnVar = (eadn) obj;
        this.a.setOnClickListener(new View.OnClickListener() { // from class: eado
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eadnVar.a(SettingsPageView.this.a.isChecked());
            }
        });
        this.c.t(new View.OnClickListener() { // from class: eadp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    public SettingsPageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SettingsPageView(Context context, AttributeSet attributeSet, int i) {
        super(dzyd.a(context, fdql.i()), attributeSet, i);
        inflate(getContext(), R.layout.settings_page_layout, this);
        Switch r5 = (Switch) findViewById(R.id.read_receipt_switch_button);
        this.a = r5;
        TextView textView = (TextView) findViewById(R.id.read_receipt_description);
        this.b = textView;
        this.c = (Toolbar) findViewById(R.id.toolbar);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eadk.a, i, R.style.LighterSettingsPageView);
        setBackgroundResource(obtainStyledAttributes.getResourceId(0, 0));
        setBackgroundColor(ehdr.b(this, R.attr.colorSurface));
        r5.setTextColor(obtainStyledAttributes.getColor(2, ehdr.b(this, R.attr.colorOnSurface)));
        textView.setTextColor(obtainStyledAttributes.getColor(1, ehdr.b(this, R.attr.colorOnSurfaceVariant)));
        obtainStyledAttributes.recycle();
    }
}
