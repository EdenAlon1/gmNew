package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcla extends vk {
    private final List a = new ArrayList();
    private final dckt d;

    public dcla(dckt dcktVar) {
        this.d = dcktVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return 1;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new dckz(from.inflate(R.layout.location_attachment_picker_search_list_item_m2, viewGroup, false));
        }
        if (i == 2) {
            return new dckz(from.inflate(R.layout.location_attachment_picker_progress_bar, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new dckx(from.inflate(R.layout.location_attachment_picker_search_results_error_m2, viewGroup, false));
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        dckz dckzVar = (dckz) wrVar;
        final cazn caznVar = (cazn) this.a.get(i);
        dckzVar.s.setText(caznVar.b());
        dckzVar.t.setText(caznVar.a());
        View view = dckzVar.a;
        final dckt dcktVar = this.d;
        view.setOnClickListener(new View.OnClickListener() { // from class: dcky
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = dckz.u;
                dckt dcktVar2 = dckt.this;
                dcks dcksVar = (dcks) dcktVar2.d.get();
                if (dcksVar != null) {
                    dcksVar.D();
                }
                dcktVar2.d(caznVar);
            }
        });
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return i;
    }
}
