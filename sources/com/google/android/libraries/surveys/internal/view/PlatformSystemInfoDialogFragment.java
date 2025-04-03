package com.google.android.libraries.surveys.internal.view;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment;
import defpackage.efoj;
import defpackage.efoo;
import defpackage.efqb;
import defpackage.efta;
import defpackage.iu;
import defpackage.iv;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PlatformSystemInfoDialogFragment extends DialogFragment {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.SurveyTheme);
        View inflate = ((LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater")).inflate(R.layout.survey_system_info_dialog, (ViewGroup) null);
        inflate.getContext().setTheme(R.style.SurveyAlertDialogCustomViewTheme);
        iu a2 = efoj.a(contextThemeWrapper);
        a2.setView(inflate);
        final iv create = a2.create();
        inflate.findViewById(R.id.survey_system_info_dialog_ok_button).setOnClickListener(new View.OnClickListener() { // from class: efqa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = PlatformSystemInfoDialogFragment.a;
                iv.this.cancel();
            }
        });
        Bundle arguments = getArguments();
        String string = arguments.getString("EXTRA_ACCOUNT_NAME");
        Bundle bundle2 = arguments.getBundle("EXTRA_PSD_BUNDLE");
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.survey_system_info_dialog_list_items);
        recyclerView.ap(new LinearLayoutManager());
        efta eftaVar = new efta();
        recyclerView.am(eftaVar);
        recyclerView.z(new efqb(this, inflate));
        eftaVar.m(efoo.b(contextThemeWrapper, string, bundle2));
        return create;
    }
}
