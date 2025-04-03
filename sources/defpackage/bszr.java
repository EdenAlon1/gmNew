package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bszr implements Supplier {
    final /* synthetic */ bszs a;

    public bszr(bszs bszsVar) {
        this.a = bszsVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bdhg bdhgVar = this.a.a;
        if (bdhgVar == null || bdhgVar.equals(bdhg.a)) {
            return null;
        }
        return bdhg.d(this.a.a);
    }
}
