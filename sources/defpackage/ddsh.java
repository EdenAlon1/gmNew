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
public final class ddsh extends ddrh {
    public static final rjc h;
    public final ddpl i;
    private final lkr j;
    private final List k;
    private final ffbr l;

    static {
        rjb rjbVar = new rjb();
        rjbVar.b();
        h = rjbVar.a();
    }

    public ddsh(Context context, lkr lkrVar, ddqu ddquVar, ddtl ddtlVar, ffbr ffbrVar, ffbr ffbrVar2, ddpl ddplVar, boolean z) {
        super(context, ddquVar, ddtlVar, ffbrVar, z);
        this.j = lkrVar;
        this.k = new ArrayList();
        this.i = ddplVar;
        this.l = ffbrVar2;
    }

    @Override // defpackage.ddrh
    protected final wr F(ViewGroup viewGroup) {
        final ddsg ddsgVar = new ddsg(this.a, this.j, LayoutInflater.from(viewGroup.getContext()).inflate(true != ((auyd) this.l.b()).a() ? R.layout.zero_state_search_link_result_item_v2 : R.layout.zero_state_search_link_result_item_coolranch, viewGroup, false), new ddsa());
        ddsgVar.u.setOnClickListener(new View.OnClickListener() { // from class: ddrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddsh ddshVar = ddsh.this;
                ddshVar.d.u(new ddpq(4, ddsgVar.fr() - ddshVar.g));
                ((ddpm) ddshVar.e.b()).e(4);
                ddshVar.i.f(6, 5);
            }
        });
        return ddsgVar;
    }

    @Override // defpackage.ddrh
    protected final void G(wr wrVar, int i) {
        ((ddsg) wrVar).C((ddqq) this.k.get(i));
    }

    public final void M(List list) {
        ekzz f = eleg.f("LinksAdapter#updateResults");
        try {
            int i = ((enou) list).c;
            H(i);
            int i2 = this.g;
            int size = this.k.size();
            if (size == 0) {
                if (i != 0) {
                    size = 0;
                }
                f.close();
            }
            if (i == 0) {
                this.k.clear();
                x(i2, size);
            } else if (size == 0) {
                this.k.addAll(list);
                w(i2, this.k.size());
            } else if (size != ((enou) list).c || J()) {
                this.k.clear();
                this.k.addAll(list);
                p();
            } else {
                this.k.clear();
                this.k.addAll(list);
                u(i2, this.k.size());
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

    @Override // defpackage.vk
    public final long hb(int i) {
        return Long.parseLong(((ddqq) this.k.get(i - this.g)).k());
    }

    @Override // defpackage.ddrh
    protected final int m() {
        return this.k.size();
    }
}
