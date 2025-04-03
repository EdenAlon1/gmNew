package com.google.android.libraries.onegoogle.accountmenu.viewproviders;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import com.google.android.material.chip.Chip;
import defpackage.ebbb;
import defpackage.eboz;
import defpackage.ebvw;
import defpackage.ebwc;
import defpackage.engw;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MyAccountChip<T> extends Chip implements ebwc {
    public static final /* synthetic */ int c = 0;
    public final eboz a;
    public ebbb b;

    public MyAccountChip(Context context) {
        super(context, null);
        this.a = new eboz(this);
        l();
    }

    private final void l() {
        Resources resources = getResources();
        this.a.a(engw.t(resources.getString(R.string.og_my_account_desc_long_length), resources.getString(R.string.og_my_account_desc_meduim_length), resources.getString(R.string.og_my_account_desc_short_length)));
    }

    @Override // defpackage.ebwc
    public final void b(ebvw ebvwVar) {
        ebvwVar.c(this, 90139);
    }

    @Override // defpackage.ebwc
    public final void ho(ebvw ebvwVar) {
        ebvwVar.e(this);
    }

    public MyAccountChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new eboz(this);
        l();
    }

    public MyAccountChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new eboz(this);
        l();
    }
}
