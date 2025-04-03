package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.messaging.R;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elhs implements oyy {
    public final Context a;
    public final elhg b;
    public final ejzi c;
    public List d;
    private final ea e;
    private final ekwg f;

    public elhs(Context context, ea eaVar, ekwg ekwgVar, elhg elhgVar) {
        this.e = eaVar;
        this.a = context;
        this.f = ekwgVar;
        this.b = elhgVar;
        LayoutInflater K = eaVar.K();
        DateFormat dateFormat = eljo.a;
        this.c = new ejzi(new eljn(K), null);
    }

    @Override // defpackage.oyy
    public final void a() {
        b();
        ((SwipeRefreshLayout) this.e.N().findViewById(R.id.pull_to_refresh)).d(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        String str = null;
        this.d = null;
        Runtime.getRuntime().gc();
        Runtime.getRuntime().runFinalization();
        List a = this.f.a();
        enou enouVar = (enou) a;
        ArrayList arrayList = new ArrayList(enouVar.c);
        ArrayList arrayList2 = new ArrayList(enouVar.c + 1);
        this.d = arrayList2;
        arrayList2.add(null);
        long currentTimeMillis = System.currentTimeMillis();
        enqv it = ((engw) a).iterator();
        int i = 0;
        while (it.hasNext()) {
            eldq c = ((eldu) it.next()).c();
            long j = c.f;
            String str2 = str;
            for (ekzx ekzxVar : c.e) {
                if (ekzxVar.e == -1) {
                    str2 = ekzxVar.c;
                }
            }
            if (str2 != null && !eljg.b(str2)) {
                List list = this.d;
                eljv createBuilder = eljw.a.createBuilder();
                createBuilder.copyOnWrite();
                eljw eljwVar = (eljw) createBuilder.instance;
                eljwVar.c = c;
                eljwVar.b |= 1;
                list.add(createBuilder.build());
                eljx createBuilder2 = eljy.a.createBuilder();
                i++;
                createBuilder2.copyOnWrite();
                eljy eljyVar = (eljy) createBuilder2.instance;
                eljyVar.b |= 1;
                eljyVar.c = i;
                createBuilder2.copyOnWrite();
                eljy eljyVar2 = (eljy) createBuilder2.instance;
                eljyVar2.b |= 2;
                eljyVar2.d = str2;
                createBuilder2.copyOnWrite();
                eljy eljyVar3 = (eljy) createBuilder2.instance;
                eljyVar3.b |= 4;
                eljyVar3.e = j;
                createBuilder2.copyOnWrite();
                eljy eljyVar4 = (eljy) createBuilder2.instance;
                eljyVar4.b = 8 | eljyVar4.b;
                eljyVar4.f = currentTimeMillis;
                arrayList.add(createBuilder2.build());
            }
            str = null;
        }
        Collections.sort(arrayList, new Comparator() { // from class: elhr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((eljy) obj2).e, ((eljy) obj).e);
            }
        });
        if (!arrayList.isEmpty()) {
            ((RecyclerView) this.e.N().findViewById(R.id.recycler)).setVisibility(0);
            ((TextView) this.e.N().findViewById(R.id.loading)).setVisibility(8);
            this.c.m(arrayList);
        } else {
            ((RecyclerView) this.e.N().findViewById(R.id.recycler)).setVisibility(8);
            ((TextView) this.e.N().findViewById(R.id.loading)).setVisibility(0);
            ((TextView) this.e.N().findViewById(R.id.loading)).setText(R.string.no_active_traces);
            this.c.m(null);
        }
    }
}
