package com.google.android.apps.messaging.diagnostics.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.diagnostics.DiagnosticsService;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsFragment;
import defpackage.aced;
import defpackage.acee;
import defpackage.achp;
import defpackage.achs;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsFragment extends achs implements aced {
    public acee a;
    public Button b;
    public Button c;
    private achp d;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.diagnostics_fragment, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.diagnostics_start_button);
        this.c = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: achh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiagnosticsFragment diagnosticsFragment = DiagnosticsFragment.this;
                acee aceeVar = diagnosticsFragment.a;
                if (aceeVar.g) {
                    acee.a.q("Diagnostic scenarios are still running");
                    return;
                }
                List<acfm> list = aceeVar.c;
                if (list != null) {
                    for (acfm acfmVar : list) {
                        acfmVar.b(1);
                        int i = engw.d;
                        acfmVar.c = enou.a;
                    }
                }
                if (aceeVar.b.bindService(new Intent(aceeVar.b, (Class<?>) DiagnosticsService.class), aceeVar.f, 1)) {
                    aceeVar.g = true;
                }
                aceeVar.h = diagnosticsFragment;
            }
        });
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.diagnostics_recycler_view);
        recyclerView.aL();
        z();
        recyclerView.ap(new LinearLayoutManager());
        recyclerView.am(this.d);
        Button button2 = (Button) inflate.findViewById(R.id.diagnostics_share_log_button);
        this.b = button2;
        button2.setVisibility(true != this.a.e.d() ? 8 : 0);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: achi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiagnosticsFragment diagnosticsFragment = DiagnosticsFragment.this;
                Uri a = diagnosticsFragment.a.e.a();
                if (a != null) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.STREAM", a);
                    intent.putExtra("android.intent.extra.SUBJECT", "AM Diagnostics Report");
                    intent.putExtra("extra_subject_mandatory", true);
                    diagnosticsFragment.aQ(Intent.createChooser(intent, "Share ".concat(String.valueOf(a.getLastPathSegment()))));
                }
            }
        });
        return inflate;
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.d = new achp(this.a.a(), z());
    }
}
