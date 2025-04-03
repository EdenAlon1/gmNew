package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class embq implements Callable {
    final /* synthetic */ emby a;

    public embq(emby embyVar) {
        this.a = embyVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return embu.a(this.a.c(), emby.e);
    }
}
