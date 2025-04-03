package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwwb implements Supplier {
    final /* synthetic */ bwwc a;

    public bwwb(bwwc bwwcVar) {
        this.a = bwwcVar;
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
