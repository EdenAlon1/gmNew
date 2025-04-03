package defpackage;

import java.util.Objects;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public abstract class oij extends ody {
    public oij() {
        super(2);
    }

    @Override // defpackage.ody
    public final Object a(Object obj) {
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // defpackage.ody
    public final Object b(odv odvVar, ffgu ffguVar) {
        ofz ofzVar = odvVar.a;
        if (ofzVar == ofz.a) {
            ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
            ffrhVar.B();
            f(new oii(ffrhVar));
            return ffrhVar.m();
        }
        if (odvVar.b == null) {
            return new odr(ffel.a, null, null, 0, 0);
        }
        if (ofzVar == ofz.b) {
            ffrh ffrhVar2 = new ffrh(ffhi.c(ffguVar), 1);
            ffrhVar2.B();
            e(new oih(ffrhVar2));
            return ffrhVar2.m();
        }
        if (ofzVar != ofz.c) {
            ofz ofzVar2 = odvVar.a;
            Objects.toString(ofzVar2);
            throw new IllegalArgumentException("Unsupported type ".concat(ofzVar2.toString()));
        }
        ffrh ffrhVar3 = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar3.B();
        d(new oih(ffrhVar3));
        return ffrhVar3.m();
    }

    public abstract void d(oif oifVar);

    public abstract void e(oif oifVar);

    public abstract void f(oig oigVar);
}
