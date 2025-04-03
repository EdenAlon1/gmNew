package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class felr implements Runnable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ fema b;

    public felr(fema femaVar, InputStream inputStream) {
        this.a = inputStream;
        this.b = femaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.n(this.a);
    }
}
