package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.packdetails.PackDetailsActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeve extends vk {
    public final boolean a;
    public final eevl d;
    private final ewnp e;

    public eeve(ewnp ewnpVar, boolean z, eevl eevlVar) {
        this.e = ewnpVar;
        this.a = z;
        this.d = eevlVar;
        B(true);
    }

    @Override // defpackage.vk
    public final int a() {
        return this.e.h.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new eevd(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pack_details_item_view, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        final eevd eevdVar = (eevd) wrVar;
        final ewnk ewnkVar = (ewnk) this.e.h.get(i);
        Resources resources = eevdVar.s.getContext().getResources();
        qqs e = qpt.e(eevdVar.s);
        ewmw ewmwVar = ewnkVar.f;
        if (ewmwVar == null) {
            ewmwVar = ewmw.a;
        }
        e.i(ewmwVar.c).q(new rig().H(eerv.b(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), eevdVar.s, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).p(rff.b()).v(eevdVar.s);
        eevdVar.s.setContentDescription(ewnkVar.h);
        if (eevdVar.t.a) {
            eevdVar.a.setOnClickListener(new View.OnClickListener() { // from class: eevc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    eevl eevlVar = eevd.this.t.d;
                    if (eevlVar != null) {
                        PackDetailsActivity packDetailsActivity = (PackDetailsActivity) eevlVar;
                        if (packDetailsActivity.getCallingActivity() == null) {
                            return;
                        }
                        packDetailsActivity.setResult(-1, new Intent().putExtra("sticker", ewnkVar.toByteArray()).putExtra("interaction_source", 9));
                        packDetailsActivity.finish();
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final long hb(int i) {
        return ((ewnk) this.e.h.get(i)).c.hashCode();
    }
}
