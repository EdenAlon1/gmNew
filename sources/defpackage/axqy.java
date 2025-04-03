package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axqy extends axra implements fgcm {
    private final String b;
    private final fgcm c;

    public axqy(String str, fgcm fgcmVar) {
        super(str);
        this.b = str;
        this.c = fgcmVar;
    }

    @Override // defpackage.fgcq, defpackage.ffxx
    public final Object a(ffxy ffxyVar, ffgu ffguVar) {
        return this.c.a(ffxyVar, ffguVar);
    }

    @Override // defpackage.fgcl
    public final fgdj b() {
        return this.c.b();
    }

    @Override // defpackage.fgcm, defpackage.fgdj
    public final Object c() {
        return this.c.c();
    }

    @Override // defpackage.fgcq
    public final List d() {
        return this.c.d();
    }

    @Override // defpackage.fgcl
    public final void e() {
        this.c.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axqy)) {
            return false;
        }
        axqy axqyVar = (axqy) obj;
        return ffkj.e(this.b, axqyVar.b) && ffkj.e(this.c, axqyVar.c);
    }

    @Override // defpackage.fgcm
    public final void f(Object obj) {
        this.c.f(obj);
    }

    @Override // defpackage.fgcl, defpackage.ffxy
    public final Object fQ(Object obj, ffgu ffguVar) {
        return this.c.fQ(obj, ffguVar);
    }

    @Override // defpackage.fgcm
    public final boolean g(Object obj, Object obj2) {
        return this.c.g(obj, obj2);
    }

    @Override // defpackage.fgcl
    public final boolean h(Object obj) {
        this.c.h(obj);
        return true;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    @Override // defpackage.axra
    public final String toString() {
        return "NamedMutableStateFlow(name=" + this.b + ", flow=" + this.c + ")";
    }
}
