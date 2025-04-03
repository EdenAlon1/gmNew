package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class beci extends dtrs implements ctbj {
    private final ctbl a;
    private final cqor b;
    private final dtyq c;

    public beci(ctbk ctbkVar, dtyq dtyqVar, Consumer consumer, String str) {
        super(consumer);
        this.c = dtyqVar;
        this.a = ctbkVar.a(this);
        this.b = new cqoq(str);
    }

    public final ctbx f(ctbf ctbfVar, String str, String str2, String str3) {
        return this.a.a(ctbfVar, str, str2, str3);
    }

    @Override // defpackage.ctbj
    public final void fN() {
        this.c.L(this);
    }

    @Override // defpackage.ctbj
    public final void fO() {
        this.c.P(this);
    }

    @Override // defpackage.dtrs
    public final void gb(dtyq dtyqVar) {
        ekzz a = this.b.a();
        try {
            this.a.b(null, a);
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
