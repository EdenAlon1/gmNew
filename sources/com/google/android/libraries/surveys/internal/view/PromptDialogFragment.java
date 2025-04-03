package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.dn;
import defpackage.efqu;
import defpackage.efqv;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PromptDialogFragment extends dn implements efqu {
    private final efqv ag = new efqv(this);

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.ag.l(viewGroup);
    }

    @Override // defpackage.ea
    public final void ai() {
        this.ag.d();
        super.ai();
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        this.ag.e(this.Q);
    }

    @Override // defpackage.efqu
    public final /* bridge */ /* synthetic */ Activity getActivity() {
        return super.G();
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.ag.k();
    }
}
