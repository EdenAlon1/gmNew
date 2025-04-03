package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elio {
    public final Context a;
    public final ea b;
    public final ejlq c;
    public final ejwl d;
    public final eljl e;
    public final elbx f;
    public final eliz g;
    public final eljy h;
    public final ejzi i;
    public eldq j;
    public final ejwd k = new ejwd<eljw>() { // from class: elio.1
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            elio.this.b(R.string.err_fetching_trace);
            Log.e("Tracer", "Failed to fetch traces", th);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            eldq eldqVar = ((eljw) obj).c;
            if (eldqVar == null) {
                eldqVar = eldq.a;
            }
            elio.this.a(eldqVar);
        }

        @Override // defpackage.ejwd
        public final void hB() {
            elio.this.b(R.string.status_loading);
        }
    };
    public final ejlr l = new ejlr<String, Void>() { // from class: elio.2
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            String str = (String) obj;
            Snackbar.r(elio.this.b.Q, "Failed to export ".concat(String.valueOf(str)), -1).i();
            Log.e("DevTools", "Failed to export ".concat(String.valueOf(str)), th);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };

    public elio(Context context, ea eaVar, ejwl ejwlVar, ejlq ejlqVar, eljl eljlVar, elbx elbxVar, elka elkaVar, eliz elizVar) {
        eldq eldqVar;
        this.a = context;
        this.b = eaVar;
        this.d = ejwlVar;
        this.c = ejlqVar;
        this.e = eljlVar;
        this.f = elbxVar;
        eljy eljyVar = elkaVar.c;
        eljyVar = eljyVar == null ? eljy.a : eljyVar;
        this.h = eljyVar;
        if ((elkaVar.b & 2) != 0) {
            eljw eljwVar = elkaVar.d;
            eldqVar = (eljwVar == null ? eljw.a : eljwVar).c;
            if (eldqVar == null) {
                eldqVar = eldq.a;
            }
        } else {
            eldqVar = null;
        }
        this.j = eldqVar;
        this.i = new ejzi(new eljr(eaVar.K(), eljyVar.e, eljyVar.f), null);
        eaVar.av(true);
        this.g = elizVar;
    }

    public final void a(eldq eldqVar) {
        this.j = eldqVar;
        eygr<ekzx> eygrVar = eldqVar.e;
        if (eygrVar.isEmpty()) {
            b(R.string.trace_not_found);
            return;
        }
        ArrayList arrayList = new ArrayList(eygrVar.size());
        for (ekzx ekzxVar : eygrVar) {
            if (ekzxVar.e != -1) {
                arrayList.add(ekzxVar);
            }
        }
        if (arrayList.isEmpty()) {
            b(R.string.no_child_records);
        } else {
            Collections.sort(arrayList, new Comparator() { // from class: elij
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((ekzx) obj).f, ((ekzx) obj2).f);
                }
            });
            ((TextView) this.b.N().findViewById(R.id.loading)).setVisibility(8);
            this.i.m(arrayList);
            ((RecyclerView) this.b.N().findViewById(R.id.recycler)).setVisibility(0);
        }
        this.b.G().invalidateOptionsMenu();
    }

    public final void b(int i) {
        ((RecyclerView) this.b.N().findViewById(R.id.recycler)).setVisibility(8);
        this.i.m(null);
        ((TextView) this.b.N().findViewById(R.id.loading)).setVisibility(0);
        ((TextView) this.b.N().findViewById(R.id.loading)).setText(i);
    }
}
