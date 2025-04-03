package com.google.android.libraries.onegoogle.account.particle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.eaxx;
import defpackage.eaxy;
import defpackage.ebvw;
import defpackage.ebwc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AccountParticle<AccountT> extends ConstraintLayout implements eaxy, ebwc {
    public eaxx i;
    public final AccountParticleDisc j;
    public final TextView k;
    public final TextView l;
    public boolean m;
    private final TextView n;

    public AccountParticle(Context context) {
        this(context, null);
    }

    @Override // defpackage.ebwc
    public final void b(ebvw ebvwVar) {
        if (this.m) {
            ebvwVar.c(this, 90144);
            this.j.g(ebvwVar);
        }
    }

    @Override // defpackage.eaxy
    public final TextView f() {
        return this.n;
    }

    @Override // defpackage.eaxy
    public final TextView g() {
        return this.k;
    }

    @Override // defpackage.eaxy
    public final TextView h() {
        return this.l;
    }

    @Override // defpackage.ebwc
    public final void ho(ebvw ebvwVar) {
        if (this.m) {
            AccountParticleDisc accountParticleDisc = this.j;
            if (accountParticleDisc.h) {
                accountParticleDisc.b.ho(ebvwVar);
            }
            if (accountParticleDisc.i) {
                accountParticleDisc.c.ho(ebvwVar);
            }
            ebvwVar.e(this);
        }
    }

    @Override // defpackage.eaxy
    public final AccountParticleDisc i() {
        return this.j;
    }

    public AccountParticle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleStyle);
    }

    public AccountParticle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.account_particle, (ViewGroup) this, true);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.account_avatar);
        accountParticleDisc.getClass();
        this.j = accountParticleDisc;
        TextView textView = (TextView) findViewById(R.id.og_primary_account_information);
        textView.getClass();
        this.k = textView;
        TextView textView2 = (TextView) findViewById(R.id.og_secondary_account_information);
        textView2.getClass();
        this.l = textView2;
        this.n = (TextView) findViewById(R.id.counter);
    }
}
