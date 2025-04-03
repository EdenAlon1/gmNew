package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult;
import com.google.android.apps.messaging.ui.search.resultsview.MediaGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ddsw extends vk {
    protected final qqs a;
    protected boolean d;
    public final MediaGridLayoutManager e;
    protected final rig f;
    protected final List g;
    protected final rjc h;
    private final ddta i;

    public ddsw(Context context, int i) {
        rjb rjbVar = new rjb();
        rjbVar.b();
        this.h = rjbVar.a();
        super.B(true);
        this.g = new ArrayList();
        this.d = ddsy.b(context.getResources().getConfiguration());
        this.e = new MediaGridLayoutManager(context, m());
        qqs c = qpt.c(context);
        this.a = c;
        this.i = new ddta(c);
        this.f = (rig) ((rig) new rig().Y(new qtq(new rct(), new reg(i)))).S(new ColorDrawable(ehdr.d(context, R.attr.colorSurfaceVariant, "MediaAdapter")));
    }

    public abstract int F(boolean z);

    public void G(List list) {
        ekzz f = eleg.f("MediaAdapter#updateResults");
        try {
            this.g.clear();
            this.g.addAll(list);
            p();
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
    public final int a() {
        return this.g.size();
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return this.d ? 0 : 1;
    }

    @Override // defpackage.vk
    public final void h(RecyclerView recyclerView) {
        recyclerView.ai(this.i);
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return Long.parseLong(((MediaSearchResult) this.g.get(i)).m());
    }

    @Override // defpackage.vk
    public final void hc(RecyclerView recyclerView) {
        recyclerView.z(this.i);
    }

    public final int m() {
        return F(this.d);
    }
}
