package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbmm extends cbpa {
    private cbnb a;
    private engw b;
    private engw c;
    private engw d;
    private engw e;
    private engw f;
    private engw g;
    private cbnb h;

    @Override // defpackage.cbpa
    public final cbpb a() {
        engw engwVar;
        engw engwVar2;
        engw engwVar3;
        engw engwVar4;
        engw engwVar5;
        engw engwVar6;
        cbnb cbnbVar;
        cbnb cbnbVar2 = this.a;
        if (cbnbVar2 != null && (engwVar = this.b) != null && (engwVar2 = this.c) != null && (engwVar3 = this.d) != null && (engwVar4 = this.e) != null && (engwVar5 = this.f) != null && (engwVar6 = this.g) != null && (cbnbVar = this.h) != null) {
            return new cbmn(cbnbVar2, engwVar, engwVar2, engwVar3, engwVar4, engwVar5, engwVar6, cbnbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" conversations");
        }
        if (this.b == null) {
            sb.append(" messageIds");
        }
        if (this.c == null) {
            sb.append(" images");
        }
        if (this.d == null) {
            sb.append(" videos");
        }
        if (this.e == null) {
            sb.append(" links");
        }
        if (this.f == null) {
            sb.append(" locations");
        }
        if (this.g == null) {
            sb.append(" contacts");
        }
        if (this.h == null) {
            sb.append(" starredTexts");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cbpa
    public final void b(List list) {
        this.g = engw.n(list);
    }

    @Override // defpackage.cbpa
    public final void c(cbnb cbnbVar) {
        if (cbnbVar == null) {
            throw new NullPointerException("Null conversations");
        }
        this.a = cbnbVar;
    }

    @Override // defpackage.cbpa
    public final void d(List list) {
        this.c = engw.n(list);
    }

    @Override // defpackage.cbpa
    public final void e(List list) {
        this.e = engw.n(list);
    }

    @Override // defpackage.cbpa
    public final void f(List list) {
        this.f = engw.n(list);
    }

    @Override // defpackage.cbpa
    public final void g(Collection collection) {
        this.b = engw.n(collection);
    }

    @Override // defpackage.cbpa
    public final void h(cbnb cbnbVar) {
        if (cbnbVar == null) {
            throw new NullPointerException("Null starredTexts");
        }
        this.h = cbnbVar;
    }

    @Override // defpackage.cbpa
    public final void i(List list) {
        this.d = engw.n(list);
    }
}
