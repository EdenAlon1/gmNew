package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnp implements dbxc {
    public View a;
    private final Context b;
    private final ffbr c;
    private final rig d = (rig) new rig().A();

    public ddnp(Context context, ffbr ffbrVar) {
        this.b = context;
        this.c = ffbrVar;
    }

    @Override // defpackage.dbxc
    public final Drawable a(Object obj) {
        boolean z = obj instanceof SearchFilterDataItem;
        String obj2 = obj.toString();
        if (z) {
            r2 = obj instanceof ContactFilterDataItem ? ((ContactFilterDataItem) obj).a : null;
            obj2 = ((SearchFilterDataItem) obj).e();
        }
        final ehdh h = ehdh.h(this.b, true != ((auyd) this.c.b()).a() ? R.xml.zero_state_chip : R.xml.zero_state_chip_coolranch);
        h.o(new ehdg() { // from class: ddnn
            @Override // defpackage.ehdg
            public final void a() {
                ehdh ehdhVar = ehdh.this;
                ehdhVar.setBounds(0, 0, ehdhVar.getIntrinsicWidth(), ehdhVar.getIntrinsicHeight());
            }
        });
        h.p(obj2);
        if (r2 != null) {
            int round = Math.round(h.e);
            qpt.c(this.b).f(r2).q(this.d).w(new ddno(this, round, round, h));
        }
        h.setBounds(0, 0, h.getIntrinsicWidth(), h.getIntrinsicHeight());
        return h;
    }

    @Override // defpackage.dbxc
    public final void b() {
        this.a = null;
    }

    @Override // defpackage.dbxc
    public final void c(View view) {
        this.a = view;
    }

    @Override // defpackage.dbxc
    public final boolean d(Object obj) {
        return (obj instanceof SearchFilterDataItem) && !(obj instanceof FreeTextFilterDataItem);
    }
}
