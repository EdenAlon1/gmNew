package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erop implements eroh {
    final /* synthetic */ erow a;
    final /* synthetic */ erph b;

    public erop(erph erphVar, erow erowVar) {
        this.a = erowVar;
        this.b = erphVar;
    }

    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        return this.b.b.a(this.a, obj);
    }

    public final String toString() {
        return this.a.toString();
    }
}
