package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axqz extends axra implements fgdj {
    private final String b;
    private final fgdj c;

    public axqz(String str, fgdj fgdjVar) {
        super(str);
        this.b = str;
        this.c = fgdjVar;
    }

    @Override // defpackage.fgcq, defpackage.ffxx
    public final Object a(ffxy ffxyVar, ffgu ffguVar) {
        return this.c.a(ffxyVar, ffguVar);
    }

    @Override // defpackage.fgdj
    public final Object c() {
        return this.c.c();
    }

    @Override // defpackage.fgcq
    public final List d() {
        return this.c.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axqz)) {
            return false;
        }
        axqz axqzVar = (axqz) obj;
        return ffkj.e(this.b, axqzVar.b) && ffkj.e(this.c, axqzVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    @Override // defpackage.axra
    public final String toString() {
        return "NamedStateFlow(name=" + this.b + ", flow=" + this.c + ")";
    }
}
