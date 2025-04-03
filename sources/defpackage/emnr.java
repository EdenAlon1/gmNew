package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emnr extends emnx {
    public final Optional a;
    public final List b;
    public final List c;
    private final exnp d;
    private final Optional e;
    private final Optional f;

    public emnr(exnp exnpVar, Optional optional, Optional optional2, Optional optional3, List list, List list2) {
        this.d = exnpVar;
        this.e = optional;
        this.a = optional2;
        this.f = optional3;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.emnx
    public final exnp a() {
        return this.d;
    }

    @Override // defpackage.emnx
    public final Optional b() {
        return this.e;
    }

    @Override // defpackage.emnx
    public final Optional c() {
        return this.a;
    }

    @Override // defpackage.emnx
    public final Optional d() {
        return this.f;
    }

    @Override // defpackage.emnx
    public final List e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof emnx) {
            emnx emnxVar = (emnx) obj;
            if (this.d.equals(emnxVar.a()) && this.e.equals(emnxVar.b()) && this.a.equals(emnxVar.c()) && this.f.equals(emnxVar.d()) && enkr.h(this.b, emnxVar.e()) && enkr.h(this.c, emnxVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.emnx
    public final List f() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        List list = this.c;
        List list2 = this.b;
        Optional optional = this.f;
        Optional optional2 = this.a;
        Optional optional3 = this.e;
        return "TextClassifierOptions{baseOptions=" + this.d.toString() + ", displayNamesLocale=" + optional3.toString() + ", maxResults=" + optional2.toString() + ", scoreThreshold=" + optional.toString() + ", categoryAllowlist=" + list2.toString() + ", categoryDenylist=" + list.toString() + "}";
    }
}
