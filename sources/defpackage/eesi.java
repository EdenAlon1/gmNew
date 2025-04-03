package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eesi extends vk {
    static final ewnp a;
    public final boolean d;
    public final List e = new ArrayList();
    public final eere f;
    public final AccessibilityManager g;
    public final eety h;

    static {
        ewnn ewnnVar = (ewnn) ewnp.a.createBuilder();
        ewnnVar.copyOnWrite();
        ((ewnp) ewnnVar.instance).b = "sticker_play_store_link";
        a = (ewnp) ewnnVar.build();
    }

    public eesi(eere eereVar, AccessibilityManager accessibilityManager, boolean z, eety eetyVar) {
        this.f = eereVar;
        this.g = accessibilityManager;
        this.d = z;
        this.h = eetyVar;
        B(true);
    }

    @Override // defpackage.vk
    public final int a() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            int a2 = ewno.a(((ewnp) it.next()).c);
            if (a2 != 0 && a2 == 3) {
                return this.e.size();
            }
        }
        return 0;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return ((ewnp) this.e.get(i)).equals(a) ? 1 : 0;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new eesh(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.browse_sticker_packs_item_view, viewGroup, false));
        }
        if (i == 1) {
            return new eesd(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.browse_play_store_link_item_view, viewGroup, false));
        }
        throw new IllegalStateException(a.h(i, "Unknown view type: "));
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        int i2 = wrVar.f;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException(a.h(i2, "Unknown view type: "));
            }
            final eesd eesdVar = (eesd) wrVar;
            eesdVar.a.setOnClickListener(new View.OnClickListener() { // from class: eesc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    eesd eesdVar2 = eesd.this;
                    eety eetyVar = eesdVar2.s.h;
                    if (eetyVar != null) {
                        eetyVar.F();
                        eeui a2 = eesdVar2.s.f.a();
                        eumg eumgVar = eumg.BROWSE;
                        eumi eumiVar = (eumi) eumj.a.createBuilder();
                        eumiVar.copyOnWrite();
                        ((eumj) eumiVar.instance).b = eumh.a(15);
                        eumiVar.copyOnWrite();
                        ((eumj) eumiVar.instance).e = eumgVar.a();
                        ((eeuj) a2).g((eumj) eumiVar.build());
                    }
                }
            });
            eesdVar.a.setContentDescription(eesdVar.a.getContext().getString(R.string.cd_browse_play_store_item_view));
            return;
        }
        final ewnp ewnpVar = (ewnp) this.e.get(i);
        final eesh eeshVar = (eesh) wrVar;
        eeshVar.s = ewnpVar;
        Resources resources = eeshVar.t.getContext().getResources();
        qqs e = qpt.e(eeshVar.t);
        ewmw ewmwVar = ewnpVar.d;
        if (ewmwVar == null) {
            ewmwVar = ewmw.a;
        }
        e.i(ewmwVar.c).q(new rig().H(eerv.b(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), eeshVar.t, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).v(eeshVar.t);
        eeshVar.t.setContentDescription(ewnpVar.f);
        eeshVar.v.setText(ewnpVar.e);
        eeshVar.w.setText(ewnpVar.g);
        boolean m = eeshVar.A.f.m(ewnpVar.b);
        eeshVar.z = m;
        if (m) {
            eeshVar.u.setVisibility(0);
        } else {
            eeshVar.u.setVisibility(8);
        }
        eeshVar.a.setOnClickListener(new View.OnClickListener() { // from class: eese
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eety eetyVar = eesh.this.A.h;
                if (eetyVar != null) {
                    eetyVar.E(ewnpVar);
                }
            }
        });
        eeshVar.a.setContentDescription(eeshVar.a.getContext().getString(R.string.cd_browse_sticker_packs_item_view, ewnpVar.e));
        eeshVar.a.setPressed(false);
        if (eeshVar.A.g.isTouchExplorationEnabled()) {
            return;
        }
        eeshVar.a.setOnTouchListener(new View.OnTouchListener() { // from class: eesf
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return eesh.this.x.b(motionEvent);
            }
        });
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return ((ewnp) this.e.get(i)).b.hashCode();
    }
}
