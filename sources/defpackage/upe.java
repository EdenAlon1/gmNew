package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upe implements upc {
    private final Context a;
    private final upa b;

    public upe(Context context, upa upaVar) {
        this.a = context;
        this.b = upaVar;
    }

    @Override // defpackage.upc
    public final Optional a() {
        return Optional.of(this.b);
    }

    @Override // defpackage.upc
    public final String b() {
        return this.a.getString(R.string.snackbar_text_label_rcs_group_self_only_v2);
    }
}
