package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejch implements rao {
    public final Context a;

    public ejch(Context context) {
        this.a = context;
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        return new ran((ejfu) obj, new ejcg(this));
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ((ejfu) obj).b().k.equals("google");
    }
}
