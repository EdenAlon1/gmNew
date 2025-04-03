package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.Arrays;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dutv extends duuf {
    static final int a = 3095251;
    public static final /* synthetic */ int g = 0;
    final int b;
    final int c;
    final String d;
    final engw e;
    final boolean f;

    public dutv(int i, int i2, String str, engw engwVar, boolean z) {
        super(c(a, i, i2));
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = engwVar;
        this.f = z;
    }

    @Override // defpackage.duuf
    public final int a() {
        return a;
    }

    public final boolean b(final CharSequence charSequence) {
        if (charSequence != null) {
            return this.d.contentEquals(charSequence) || Collection.EL.stream(this.e).anyMatch(new Predicate() { // from class: dutu
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i = dutv.g;
                    return ((String) obj).contentEquals(charSequence);
                }
            });
        }
        return false;
    }

    @Override // defpackage.duuf
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dutv)) {
            return false;
        }
        dutv dutvVar = (dutv) obj;
        return super.equals(obj) && this.b == dutvVar.b && this.c == dutvVar.c && this.d.equals(dutvVar.d) && enkr.h(this.e, dutvVar.e) && this.f == dutvVar.f;
    }

    @Override // defpackage.duuf
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e.hashCode()), Boolean.valueOf(this.f)});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.g("id", this.h);
        b.f("categoryIndex", this.b);
        b.f("idInCategory", this.c);
        b.b("primary", this.d);
        b.b("secondaries", this.e);
        b.h("useStickyVariant", this.f);
        return b.toString();
    }
}
