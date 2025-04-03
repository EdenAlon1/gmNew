package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.messaging.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxak extends dxah implements dwzg {
    public dwyh a;
    public errl b;
    private dwzn c;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final dwzt dwztVar = this.c.b;
        ea eaVar = dwztVar.b;
        Executor executor = dwztVar.a;
        View inflate = layoutInflater.inflate(R.layout.mdd_debug_list_fragment, viewGroup, false);
        dwztVar.g = new dwyq(eaVar.z(), executor);
        dwztVar.g.e = new dwzp(dwztVar.c);
        dwztVar.f = (TextView) inflate.findViewById(R.id.file_group_list_status_text);
        dwztVar.e = (SwipeRefreshLayout) inflate.findViewById(R.id.pull_to_refresh);
        SwipeRefreshLayout swipeRefreshLayout = dwztVar.e;
        swipeRefreshLayout.a = dwztVar;
        swipeRefreshLayout.setEnabled(true);
        dwztVar.d = (RecyclerView) inflate.findViewById(R.id.file_group_list);
        dwztVar.d.aL();
        dwztVar.d.ap(new LinearLayoutManager());
        dwztVar.d.am(dwztVar.g);
        dwztVar.h = (EditText) inflate.findViewById(R.id.filter);
        dwztVar.h.addTextChangedListener(new dwzl((dwzm) dwztVar.c, new ffbr() { // from class: dwzq
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return Boolean.valueOf(dwzt.this.b.Z.c.a(lkj.STARTED));
            }
        }));
        return inflate;
    }

    @Override // defpackage.dwzg
    public final dwzn a() {
        return this.c;
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        dwzm dwzmVar = new dwzm(this, this.a, this.b);
        dwzt dwztVar = new dwzt(this, this.b, dwzmVar);
        dwzn dwznVar = new dwzn(dwztVar, dwzmVar);
        this.c = dwznVar;
        final dwzm dwzmVar2 = (dwzm) dwznVar.a;
        dwzmVar2.h = dwztVar;
        dwzmVar2.f = emud.b(dwzmVar2.d);
        dwzmVar2.f.d(R.id.list_fragment_action_callback, dwzmVar2.b);
        dwzmVar2.g = (dwzf) new lmw(dwzmVar2.d, new dwze(dwzmVar2.e, dwzmVar2.c)).a(dwzf.class);
        dwzf dwzfVar = dwzmVar2.g;
        AtomicReference atomicReference = dwzfVar.c;
        int i = engw.d;
        llg llgVar = new llg(enou.a);
        while (true) {
            if (atomicReference.compareAndSet(null, llgVar)) {
                dwzfVar.a();
                break;
            } else if (atomicReference.get() != null) {
                break;
            }
        }
        llg llgVar2 = (llg) dwzfVar.c.get();
        llgVar2.getClass();
        llgVar2.f(dwzmVar2.d, new llh() { // from class: dwzj
            @Override // defpackage.llh
            public final void a(Object obj) {
                engw n = engw.n((engw) obj);
                dwzh dwzhVar = dwzm.this.h;
                if (dwzhVar != null) {
                    final dwzt dwztVar2 = (dwzt) dwzhVar;
                    dwztVar2.g.c(n);
                    if (n.isEmpty()) {
                        dwztVar2.b("No Tracked File Groups\n(You may need to force refresh tracked file groups)");
                    } else {
                        dwztVar2.b.fe().runOnUiThread(new Runnable() { // from class: dwzo
                            @Override // java.lang.Runnable
                            public final void run() {
                                dwzt dwztVar3 = dwzt.this;
                                dwztVar3.d.setVisibility(0);
                                dwztVar3.f.setVisibility(8);
                            }
                        });
                    }
                }
            }
        });
    }
}
