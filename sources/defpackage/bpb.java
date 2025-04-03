package defpackage;

import android.util.Rational;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpb implements Comparator {
    private final Rational a;

    public bpb(Rational rational) {
        this.a = rational;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(bpc.a((Rational) obj2, this.a), bpc.a((Rational) obj, this.a));
    }
}
