package com.google.android.apps.messaging.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import defpackage.albq;
import defpackage.bcqq;
import defpackage.bcqr;
import defpackage.csix;
import defpackage.cxrh;
import defpackage.ddpl;
import defpackage.ddpm;
import defpackage.ddri;
import defpackage.ddrm;
import defpackage.ellj;
import defpackage.ellq;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ContactListItemView extends cxrh implements View.OnClickListener {
    public bcqq a;
    public TextView b;
    public TextView c;
    public TextView d;
    public ContactIconView e;
    public ImageView f;
    public ProgressBar g;
    public ImageView h;
    public albq i;
    public bcqr j;
    public ellq k;
    public ffbr l;
    public ddri m;

    /* compiled from: PG */
    public static class ContactItemViewRow extends ContactListItemView {
        public ContactItemViewRow(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.apps.messaging.ui.contact.ContactListItemView
        protected final boolean a() {
            return true;
        }

        @Override // com.google.android.apps.messaging.ui.contact.ContactListItemView
        public final boolean b() {
            return true;
        }
    }

    /* compiled from: PG */
    public static class ContactItemViewTop extends ContactListItemView {
        public ContactItemViewTop(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.apps.messaging.ui.contact.ContactListItemView
        protected final boolean a() {
            return false;
        }

        @Override // com.google.android.apps.messaging.ui.contact.ContactListItemView
        public final boolean b() {
            return false;
        }
    }

    public ContactListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected abstract boolean a();

    public abstract boolean b();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        csix.k(view == this);
        csix.k(this.m != null);
        ddri ddriVar = this.m;
        ffbr ffbrVar = ddriVar.a;
        bcqq bcqqVar = this.a;
        ((ddpm) ffbrVar.b()).e(6);
        ((ddpl) ddriVar.b.b()).f(6, 7);
        ellj.g(new ddrm(bcqqVar), this);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = this.j.a();
        this.b = (TextView) findViewById(R.id.contact_name);
        this.c = (TextView) findViewById(R.id.contact_details);
        this.d = (TextView) findViewById(R.id.contact_detail_type);
        this.e = (ContactIconView) findViewById(R.id.contact_icon);
        this.f = (ImageView) findViewById(R.id.contact_checkmark);
        this.g = (ProgressBar) findViewById(R.id.contact_pending);
        this.e.h(a());
        this.h = (ImageView) findViewById(R.id.work_profile_icon);
    }
}
