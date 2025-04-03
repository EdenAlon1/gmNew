package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecgg extends ecgj {
    public final emyl a;
    private final emyl b;

    public ecgg(final long j) {
        if (j <= -100 || j >= 100) {
            this.a = emys.a(new emyl() { // from class: ecge
                @Override // defpackage.emyl
                public final Object get() {
                    return String.format(Locale.US, "%.1e", Double.valueOf(j));
                }
            });
            this.b = emys.a(new emyl() { // from class: ecgf
                @Override // defpackage.emyl
                public final Object get() {
                    return Long.valueOf(Double.valueOf((String) ecgg.this.a.get()).longValue());
                }
            });
        } else {
            this.b = emys.a(new emyl() { // from class: ecgc
                @Override // defpackage.emyl
                public final Object get() {
                    return Long.valueOf(j);
                }
            });
            this.a = emys.a(new emyl() { // from class: ecgd
                @Override // defpackage.emyl
                public final Object get() {
                    return String.valueOf(j);
                }
            });
        }
    }

    @Override // defpackage.ecgj
    public final /* bridge */ /* synthetic */ Object a() {
        return (Long) this.b.get();
    }

    @Override // defpackage.ecgj
    public final String b() {
        return (String) this.a.get();
    }
}
