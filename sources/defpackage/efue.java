package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efue {
    public final Context a;
    public final ffbz b;

    public efue(Context context) {
        this.a = context;
        ffca.a(new ffix() { // from class: efuc
            @Override // defpackage.ffix
            public final Object invoke() {
                return Long.valueOf(fduf.a.a().a(efue.this.a));
            }
        });
        this.b = ffca.a(new ffix() { // from class: efud
            @Override // defpackage.ffix
            public final Object invoke() {
                return fduf.a.a().b(efue.this.a);
            }
        });
    }
}
