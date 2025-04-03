package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eesu extends vk {
    public final eere a;
    public final eety d;
    public final aai e = new aai(new eeso(this));
    public final Set f = new HashSet();
    public final List g = new ArrayList();
    public final Map h = new HashMap();
    public final Map i = new HashMap();

    public eesu(eere eereVar, eety eetyVar) {
        this.a = eereVar;
        this.d = eetyVar;
        B(true);
    }

    @Override // defpackage.vk
    public final int a() {
        return this.g.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new eest(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.favorite_sticker_packs_item_view, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        final eest eestVar = (eest) wrVar;
        final ewnp ewnpVar = (ewnp) this.g.get(i);
        eestVar.x = eestVar.y.a.m(ewnpVar.b);
        eestVar.C();
        Resources resources = eestVar.s.getContext().getResources();
        int a = ewno.a(ewnpVar.c);
        if (a == 0) {
            a = 1;
        }
        if (a - 2 != 1) {
            throw new IllegalStateException("Loaded pack type should be Regular.");
        }
        qqs e = qpt.e(eestVar.s);
        ewmw ewmwVar = ewnpVar.d;
        if (ewmwVar == null) {
            ewmwVar = ewmw.a;
        }
        e.i(ewmwVar.c).q(new rig().H(eerv.b(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), eestVar.s, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).p(rff.b()).v(eestVar.s);
        eestVar.t.setText(ewnpVar.e);
        eestVar.u.setText(ewnpVar.g);
        eestVar.a.setOnClickListener(new View.OnClickListener() { // from class: eesp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eety eetyVar = eest.this.y.d;
                if (eetyVar != null) {
                    eetyVar.E(ewnpVar);
                }
            }
        });
        eestVar.a.setContentDescription(eestVar.a.getContext().getResources().getString(R.string.cd_browse_sticker_packs_item_view, ewnpVar.e));
        eestVar.w.setOnTouchListener(new View.OnTouchListener() { // from class: eesq
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                eest eestVar2 = eest.this;
                eestVar2.y.e.n(eestVar2);
                return true;
            }
        });
        eestVar.v.setOnClickListener(new View.OnClickListener() { // from class: eesr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eest eestVar2 = eest.this;
                eestVar2.v.setClickable(false);
                boolean z = eestVar2.x;
                eestVar2.x = !z;
                String str = ewnpVar.b;
                if (z) {
                    eestVar2.y.f.add(str);
                }
                ListenableFuture g = eestVar2.y.a.g(str, eestVar2.x);
                if (eestVar2.y.i.containsKey(str)) {
                    ((ListenableFuture) eestVar2.y.i.get(str)).cancel(true);
                }
                eestVar2.y.i.put(str, g);
                erqt.r(g, new eess(eestVar2, str, view), eerw.a);
                eestVar2.y.a.a().b(str, eumg.FAVORITES, eestVar2.x);
            }
        });
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return ((ewnp) this.g.get(i)).b.hashCode();
    }

    @Override // defpackage.vk
    public final void hc(RecyclerView recyclerView) {
        this.e.f(recyclerView);
    }

    public final void m(String str) {
        for (int i = 0; i < this.g.size(); i++) {
            if (((ewnp) this.g.get(i)).b.equals(str)) {
                this.g.remove(i);
                y(i);
                return;
            }
        }
    }
}
