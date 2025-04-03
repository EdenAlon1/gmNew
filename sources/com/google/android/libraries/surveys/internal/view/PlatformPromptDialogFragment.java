package com.google.android.libraries.surveys.internal.view;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.efqu;
import defpackage.efqv;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PlatformPromptDialogFragment extends DialogFragment implements efqu {
    private final efqv a = new efqv(this);

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.k();
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.l(viewGroup);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        this.a.d();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.a.e(getView());
    }
}
