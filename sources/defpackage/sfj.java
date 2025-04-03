package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfj implements ejxi {
    final /* synthetic */ sfk a;
    final /* synthetic */ Context b;

    public sfj(sfk sfkVar, Context context) {
        this.a = sfkVar;
        this.b = context;
    }

    @Override // defpackage.ejxi
    public final /* synthetic */ ejuj a() {
        return sfk.a;
    }

    @Override // defpackage.ejxi
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        elfl c;
        sfk sfkVar = this.a;
        c = axol.c(sfkVar.f, ffhe.a, ffsm.a, new sfi(sfkVar, this.b, null));
        return c;
    }
}
