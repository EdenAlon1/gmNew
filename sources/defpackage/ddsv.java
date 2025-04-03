package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsv extends ddrh {
    public final ddpl h;
    List i;
    private final lkk j;
    private final ffbr k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddsv(Context context, ddqu ddquVar, ffbr ffbrVar, ddpl ddplVar, ffbr ffbrVar2, lkr lkrVar, ddtl ddtlVar, boolean z) {
        super(context, ddquVar, ddtlVar, ffbrVar, z);
        lkk P = lkrVar.P();
        this.i = new ArrayList();
        this.j = P;
        this.h = ddplVar;
        this.k = ffbrVar2;
    }

    @Override // defpackage.ddrh
    protected final wr F(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(true != ((auyd) this.k.b()).a() ? R.layout.zero_state_search_location_result_item_v2 : R.layout.zero_state_search_location_result_item_coolranch, viewGroup, false);
        final ddsu ddsuVar = new ddsu(this.a, inflate, this.j);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: ddss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddsv ddsvVar = ddsv.this;
                ddsvVar.d.u(new ddpq(5, ddsuVar.fr() - ddsvVar.g));
                ((ddpm) ddsvVar.e.b()).e(5);
                ddsvVar.h.f(6, 6);
            }
        });
        return ddsuVar;
    }

    @Override // defpackage.ddrh
    protected final void G(wr wrVar, int i) {
        ddsu ddsuVar = (ddsu) wrVar;
        ddsuVar.C();
        ddqs ddqsVar = (ddqs) this.i.get(i);
        ddsuVar.C();
        ddqsVar.n();
        ddsuVar.t = ddqsVar;
        ddsuVar.s.b(ddqsVar);
    }

    public final void M(List list) {
        ekzz f = eleg.f("LocationsAdapter#updateResults");
        try {
            H(((enou) list).c);
            int i = this.g;
            if (!list.isEmpty() || !this.i.isEmpty()) {
                if (list.isEmpty()) {
                    int size = this.i.size();
                    this.i = list;
                    x(i, size);
                } else if (this.i.isEmpty()) {
                    this.i = list;
                    w(i, ((enou) list).c);
                } else {
                    int size2 = this.i.size();
                    int i2 = ((enou) list).c;
                    if (size2 != i2 || J()) {
                        this.i = list;
                        p();
                    } else {
                        this.i = list;
                        u(i, i2);
                    }
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ddrh, defpackage.vk
    public final void k(wr wrVar) {
        super.k(wrVar);
        if (wrVar instanceof ddsu) {
            ((ddsu) wrVar).C();
        }
    }

    @Override // defpackage.ddrh
    protected final int m() {
        return this.i.size();
    }
}
