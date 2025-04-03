package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upd implements upc {
    private final Context a;
    private final ckds b;

    public upd(Context context, ckds ckdsVar) {
        this.a = context;
        this.b = ckdsVar;
    }

    @Override // defpackage.upc
    public final Optional a() {
        return Optional.empty();
    }

    @Override // defpackage.upc
    public final String b() {
        return qmn.b(this.a, R.string.snackbar_text_label_rcs_group_created_too_large, "max_group_size_including_self", Integer.valueOf(this.b.f(Optional.empty())));
    }
}
