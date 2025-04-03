package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbm extends ffkk implements ffji {
    final /* synthetic */ Context a;
    final /* synthetic */ jbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbm(Context context, jbn jbnVar) {
        super(1);
        this.a = context;
        this.b = jbnVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.getApplicationContext().registerComponentCallbacks(this.b);
        return new jbl(this.a, this.b);
    }
}
