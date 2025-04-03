package defpackage;

import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsScenarioView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class acfm {
    public final acfj a;
    public final String b;
    public engw c;
    public boolean d;
    public int e = 1;
    public achk f;

    public acfm(acfk acfkVar, String str) {
        this.a = new acfj(acfkVar, str);
        this.b = str;
        int i = engw.d;
        this.c = enou.a;
        this.d = true;
    }

    public abstract acfn a();

    public final void b(int i) {
        int i2 = engw.d;
        c(i, enou.a);
    }

    public final void c(int i, engw engwVar) {
        this.e = i;
        this.c = engwVar;
        achk achkVar = this.f;
        if (achkVar != null) {
            final DiagnosticsScenarioView diagnosticsScenarioView = achkVar.a;
            achkVar.b.runOnUiThread(new Runnable() { // from class: achn
                @Override // java.lang.Runnable
                public final void run() {
                    DiagnosticsScenarioView.this.a();
                }
            });
        }
    }
}
