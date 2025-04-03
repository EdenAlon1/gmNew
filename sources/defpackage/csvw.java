package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csvw implements erqj {
    private final emwl a;
    private final emwl b;

    public csvw(final Consumer consumer) {
        this.a = eldl.a(new emwl() { // from class: csvv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Consumer.this.accept(obj);
                return null;
            }
        });
        this.b = null;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        emwl emwlVar = this.b;
        if (emwlVar != null) {
        }
    }

    public csvw(final Consumer consumer, final Consumer consumer2) {
        this.a = eldl.a(new emwl() { // from class: csvt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Consumer.this.accept(obj);
                return null;
            }
        });
        this.b = eldl.a(new emwl() { // from class: csvu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Consumer.this.accept((Throwable) obj);
                return null;
            }
        });
    }
}
