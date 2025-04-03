package defpackage;

import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class colz extends comu {
    private comb a;
    private Optional b;
    private eyhs c;
    private Optional d;
    private Optional e;
    private boolean f;
    private byte g;

    public colz() {
        this.b = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
    }

    @Override // defpackage.comu
    public final comv a() {
        comb combVar;
        eyhs eyhsVar;
        if (this.g == 1 && (combVar = this.a) != null && (eyhsVar = this.c) != null) {
            return new coma(combVar, this.b, eyhsVar, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" key");
        }
        if (this.c == null) {
            sb.append(" schema");
        }
        if (this.g == 0) {
            sb.append(" enableCache");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.comu
    public final void b(boolean z) {
        this.f = z;
        this.g = (byte) 1;
    }

    @Override // defpackage.comu
    public final void c(Supplier supplier) {
        this.e = Optional.of(supplier);
    }

    @Override // defpackage.comu
    public final void d(comb combVar) {
        if (combVar == null) {
            throw new NullPointerException("Null key");
        }
        this.a = combVar;
    }

    @Override // defpackage.comu
    public final void e(copg copgVar) {
        this.d = Optional.of(copgVar);
    }

    @Override // defpackage.comu
    public final void f(eyhs eyhsVar) {
        if (eyhsVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.c = eyhsVar;
    }

    @Override // defpackage.comu
    public final void g(String str) {
        this.b = Optional.of(str);
    }

    public colz(comv comvVar) {
        this.b = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        coma comaVar = (coma) comvVar;
        this.a = comaVar.a;
        this.b = comaVar.b;
        this.c = comaVar.c;
        this.d = comaVar.d;
        this.e = comaVar.e;
        this.f = comaVar.f;
        this.g = (byte) 1;
    }
}
