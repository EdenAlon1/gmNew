package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dvka implements emwl {
    @Override // defpackage.emwl
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final evzd apply(eybb eybbVar) {
        evyv evyvVar = (evyv) evzd.a.createBuilder();
        d(eybbVar, evyvVar);
        if ((eybbVar.b & 1) != 0) {
            boolean z = eybbVar.e;
            evyvVar.copyOnWrite();
            evzd evzdVar = (evzd) evyvVar.instance;
            evzdVar.b |= 4;
            evzdVar.f = z;
        }
        f(eybbVar, evyvVar);
        g(eybbVar, evyvVar);
        h(eybbVar, evyvVar);
        e(eybbVar, evyvVar);
        c(eybbVar, evyvVar);
        if ((eybbVar.b & 2) != 0) {
            emwl emwlVar = dvlw.a;
            eyba b = eyba.b(eybbVar.f);
            if (b == null) {
                b = eyba.UI_THEME_UNSPECIFIED;
            }
            Object apply = emwlVar.apply(b);
            evyvVar.copyOnWrite();
            evzd evzdVar2 = (evzd) evyvVar.instance;
            evzdVar2.g = ((evza) apply).c;
            evzdVar2.b |= 8;
        }
        b(eybbVar, evyvVar);
        return (evzd) evyvVar.build();
    }

    public abstract void b(eybb eybbVar, evyv evyvVar);

    public abstract void c(eybb eybbVar, evyv evyvVar);

    public abstract void d(eybb eybbVar, evyv evyvVar);

    public abstract void e(eybb eybbVar, evyv evyvVar);

    public abstract void f(eybb eybbVar, evyv evyvVar);

    public abstract void g(eybb eybbVar, evyv evyvVar);

    public abstract void h(eybb eybbVar, evyv evyvVar);
}
