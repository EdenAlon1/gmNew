package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dijo implements erqj {
    final /* synthetic */ Function a;

    public dijo(Function function) {
        this.a = function;
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.apply(th);
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
    }
}
