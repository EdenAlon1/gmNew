package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeti extends vk {
    public final eety a;
    private List d = new ArrayList();

    public eeti(eety eetyVar) {
        this.a = eetyVar;
        B(true);
    }

    @Override // defpackage.vk
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new eeth(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_result_item_view, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        final eeth eethVar = (eeth) wrVar;
        final ewnk ewnkVar = ((ewnt) this.d.get(i)).b;
        if (ewnkVar == null) {
            ewnkVar = ewnk.a;
        }
        Resources resources = eethVar.s.getContext().getResources();
        int a = ewno.a(ewnkVar.d);
        if (a == 0) {
            a = 1;
        }
        if (a - 2 != 1) {
            throw new IllegalStateException("Loaded sticker type should be Regular.");
        }
        qqs e = qpt.e(eethVar.s);
        ewmw ewmwVar = ewnkVar.f;
        if (ewmwVar == null) {
            ewmwVar = ewmw.a;
        }
        e.i(ewmwVar.c).q(new rig().H(eerv.b(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), eethVar.s, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).p(rff.b()).v(eethVar.s);
        eethVar.s.setContentDescription(ewnkVar.h);
        eethVar.a.setOnClickListener(new View.OnClickListener() { // from class: eetg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eety eetyVar = eeth.this.t.a;
                if (eetyVar != null) {
                    eetyVar.D(ewnkVar);
                }
            }
        });
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        ewnk ewnkVar = ((ewnt) this.d.get(i)).b;
        if (ewnkVar == null) {
            ewnkVar = ewnk.a;
        }
        return ewnkVar.c.hashCode();
    }

    public final void m(List list) {
        this.d = list;
        p();
    }
}
