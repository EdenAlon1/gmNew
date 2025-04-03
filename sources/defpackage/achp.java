package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsScenarioView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achp extends vk {
    private final Context a;
    private final List d;

    public achp(List list, Context context) {
        this.a = context;
        this.d = list;
    }

    @Override // defpackage.vk
    public final int a() {
        List list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        return new acho(LayoutInflater.from(this.a).inflate(R.layout.diagnostics_scenario_view, viewGroup, false));
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        csix.k(wrVar.a instanceof DiagnosticsScenarioView);
        DiagnosticsScenarioView diagnosticsScenarioView = (DiagnosticsScenarioView) wrVar.a;
        acfm acfmVar = (acfm) this.d.get(i);
        diagnosticsScenarioView.d = acfmVar;
        diagnosticsScenarioView.a.setText(acfmVar.b);
        diagnosticsScenarioView.b.setChecked(acfmVar.d);
        diagnosticsScenarioView.a();
        Activity g = ddzb.g(diagnosticsScenarioView.c);
        if (g != null) {
            acfmVar.f = new achk(diagnosticsScenarioView, g);
        }
    }
}
