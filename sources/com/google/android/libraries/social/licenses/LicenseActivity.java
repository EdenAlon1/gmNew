package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.social.licenses.LicenseActivity;
import defpackage.eeqs;
import defpackage.eeqx;
import defpackage.iy;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LicenseActivity extends iy {
    @Override // defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        eeqs eeqsVar = (eeqs) getIntent().getParcelableExtra("license");
        if (k() != null) {
            k().setTitle(eeqsVar.a);
            k().setDisplayShowHomeEnabled(true);
            k().setDisplayHomeAsUpEnabled(true);
            k().setLogo(null);
        }
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        String a = eeqx.a(this, "third_party_licenses", eeqsVar.b, eeqsVar.c);
        if (a == null) {
            finish();
        } else {
            textView.setText(a);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        final ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        final int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new Runnable() { // from class: eeqt
                @Override // java.lang.Runnable
                public final void run() {
                    Layout layout = ((TextView) LicenseActivity.this.findViewById(R.id.license_activity_textview)).getLayout();
                    if (layout != null) {
                        scrollView.scrollTo(0, layout.getLineTop(layout.getLineForOffset(i)));
                    }
                }
            });
        }
    }

    @Override // defpackage.abe, defpackage.hl, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
