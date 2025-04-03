package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enja extends enin {
    private final Comparator e;

    public enja(Comparator comparator) {
        comparator.getClass();
        this.e = comparator;
    }

    @Override // defpackage.enin, defpackage.engg, defpackage.engh
    public final /* synthetic */ void c(Object obj) {
        super.c(obj);
    }

    @Override // defpackage.enin
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final enjc g() {
        enjc x = enjc.x(this.e, this.b, this.a);
        this.b = x.size();
        this.c = true;
        return x;
    }

    public final void m(Object obj) {
        super.c(obj);
    }

    public final void n(Object... objArr) {
        super.i(objArr);
    }

    public final void o(Iterable iterable) {
        super.j(iterable);
    }
}
