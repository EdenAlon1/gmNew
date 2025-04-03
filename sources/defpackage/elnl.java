package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elnl extends elmp {
    private volatile transient String b;

    public elnl(eloy eloyVar) {
        super(eloyVar);
    }

    @Override // defpackage.elno
    public final String b() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = (String) this.a.c().orElseGet(new Supplier() { // from class: elnn
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return String.valueOf(((elmp) elno.this).a.d().hashCode());
                        }
                    });
                    if (this.b == null) {
                        throw new NullPointerException("getIdentifier() cannot return null");
                    }
                }
            }
        }
        return this.b;
    }
}
