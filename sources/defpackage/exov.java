package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exov extends expc {
    public final boolean a;
    public final Optional b;
    public final Optional c;
    private final exnp d;
    private final String e;

    public exov(exnp exnpVar, String str, boolean z, Optional optional, Optional optional2) {
        this.d = exnpVar;
        this.e = str;
        this.a = z;
        this.b = optional;
        this.c = optional2;
    }

    @Override // defpackage.expc
    public final exnp a() {
        return this.d;
    }

    @Override // defpackage.expc
    public final Optional b() {
        return this.c;
    }

    @Override // defpackage.expc
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.expc
    public final String d() {
        return this.e;
    }

    @Override // defpackage.expc
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof expc) {
            expc expcVar = (expc) obj;
            if (this.d.equals(expcVar.a())) {
                expcVar.i();
                if (this.e.equals(expcVar.d()) && this.a == expcVar.e()) {
                    expcVar.f();
                    if (this.b.equals(expcVar.c()) && this.c.equals(expcVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ 1) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ImageSegmenterOptions{baseOptions=" + this.d.toString() + ", runningMode=IMAGE, displayNamesLocale=" + this.e + ", outputConfidenceMasks=" + this.a + ", outputCategoryMask=false, resultListener=" + this.b.toString() + ", errorListener=" + this.c.toString() + "}";
    }

    @Override // defpackage.expc
    public final void f() {
    }

    @Override // defpackage.expc
    public final void i() {
    }
}
