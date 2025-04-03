package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elib implements ejwd<engw<eljy>> {
    public final /* synthetic */ elic a;

    public elib(elic elicVar) {
        this.a = elicVar;
    }

    private final void d(int i) {
        ((RecyclerView) this.a.a.N().findViewById(R.id.recycler)).setVisibility(8);
        this.a.e.m(null);
        ((TextView) this.a.a.N().findViewById(R.id.loading)).setVisibility(0);
        ((TextView) this.a.a.N().findViewById(R.id.loading)).setText(i);
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        d(R.string.err_fetching_traces);
        Log.e("Tracer", "Failed to fetch traces", th);
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        engw engwVar = (engw) obj;
        if (engwVar.isEmpty()) {
            d(R.string.no_traces);
            return;
        }
        ((TextView) this.a.a.N().findViewById(R.id.loading)).setVisibility(8);
        this.a.e.m(engwVar);
        ((RecyclerView) this.a.a.N().findViewById(R.id.recycler)).setVisibility(0);
    }

    @Override // defpackage.ejwd
    public final void hB() {
        d(R.string.status_loading);
    }
}
