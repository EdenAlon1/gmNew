package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtcq extends vk {
    public final Integer a;
    public final ffji d;
    private final ffbz f = ffca.a(new ffix() { // from class: dtcm
        @Override // defpackage.ffix
        public final Object invoke() {
            if (dtcq.this.a == null) {
                return null;
            }
            return new ehow().d(r0.intValue());
        }
    });
    public List e = ffel.a;

    public dtcq(Integer num, ffji ffjiVar) {
        this.a = num;
        this.d = ffjiVar;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        Chip chip = new Chip(viewGroup.getContext());
        ehow ehowVar = (ehow) this.f.a();
        if (ehowVar != null) {
            chip.fy(ehowVar);
        }
        return new dtcp(this, chip);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        dtcp dtcpVar = (dtcp) wrVar;
        dtcpVar.getClass();
        final dtcn dtcnVar = (dtcn) this.e.get(i);
        dtcnVar.getClass();
        Chip chip = dtcpVar.s;
        chip.setText(dtcnVar.a);
        final dtcq dtcqVar = dtcpVar.t;
        chip.setOnClickListener(new View.OnClickListener() { // from class: dtco
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = dtcp.u;
                dtcq.this.d.invoke(dtcnVar);
            }
        });
    }
}
