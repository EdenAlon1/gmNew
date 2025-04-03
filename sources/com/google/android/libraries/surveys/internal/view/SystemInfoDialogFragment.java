package com.google.android.libraries.surveys.internal.view;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.dn;
import defpackage.efoj;
import defpackage.efoo;
import defpackage.efsy;
import defpackage.efta;
import defpackage.iu;
import defpackage.iv;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SystemInfoDialogFragment extends dn {
    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(G(), R.style.SurveyTheme);
        View inflate = ((LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater")).inflate(R.layout.survey_system_info_dialog, (ViewGroup) null);
        inflate.getContext().setTheme(R.style.SurveyAlertDialogCustomViewTheme);
        iu a = efoj.a(contextThemeWrapper);
        a.setView(inflate);
        final iv create = a.create();
        inflate.findViewById(R.id.survey_system_info_dialog_ok_button).setOnClickListener(new View.OnClickListener() { // from class: efsx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iv.this.cancel();
            }
        });
        Bundle bundle2 = this.m;
        String string = bundle2.getString("EXTRA_ACCOUNT_NAME");
        Bundle bundle3 = bundle2.getBundle("EXTRA_PSD_BUNDLE");
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.survey_system_info_dialog_list_items);
        recyclerView.ap(new LinearLayoutManager());
        efta eftaVar = new efta();
        recyclerView.am(eftaVar);
        recyclerView.z(new efsy(this, inflate));
        eftaVar.m(efoo.b(contextThemeWrapper, string, bundle3));
        return create;
    }
}
