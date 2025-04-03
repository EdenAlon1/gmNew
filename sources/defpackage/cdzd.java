package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdzd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdzf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdzd(ffgu ffguVar, cdzf cdzfVar) {
        super(2, ffguVar);
        this.b = cdzfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdzd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [comc, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cdzf cdzfVar = this.b;
        final axeu axeuVar = axeu.DISABLED;
        boolean booleanValue = ((Boolean) ((cfup) cshy.a.get()).e()).booleanValue();
        final axkm axkmVar = cdzfVar.a;
        elfl h = (booleanValue && csgj.a()) ? axkmVar.e.get().j(new emwl() { // from class: axjc
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj2).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.l = axeu.this.h;
                axezVar.b |= 256;
                return builder.build();
            }
        }).h(new emwl() { // from class: axjd
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                boolean booleanValue2 = ((Boolean) ((cfup) csgj.Y.get()).e()).booleanValue();
                axkm axkmVar2 = axkm.this;
                axeu axeuVar2 = axeuVar;
                if (booleanValue2) {
                    axkmVar2.k.set(axeuVar2);
                }
                if (axkmVar2.m.a()) {
                    axkmVar2.l.set(null);
                } else {
                    axkmVar2.n.c(axeuVar2);
                }
                axkmVar2.N();
                if (csgj.a() && ((Boolean) ((cfup) cshy.a.get()).e()).booleanValue()) {
                    axkmVar2.L();
                }
                return null;
            }
        }, axkmVar.f) : axkmVar.A(new Function() { // from class: axja
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                axep axepVar = (axep) obj2;
                cskc cskcVar = axkm.a;
                axepVar.copyOnWrite();
                axez axezVar = (axez) axepVar.instance;
                axez axezVar2 = axez.a;
                axezVar.l = axeu.this.h;
                axezVar.b |= 256;
                return axepVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new emwl() { // from class: axjb
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                boolean booleanValue2 = ((Boolean) ((cfup) csgj.Y.get()).e()).booleanValue();
                axkm axkmVar2 = axkm.this;
                axeu axeuVar2 = axeuVar;
                if (booleanValue2) {
                    axkmVar2.k.set(axeuVar2);
                }
                if (axkmVar2.m.a()) {
                    axkmVar2.l.set(null);
                } else {
                    axkmVar2.n.c(axeuVar2);
                }
                return null;
            }
        }, axkmVar.f);
        this.a = 1;
        Object c = fgfz.c(h, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdzd cdzdVar = new cdzd(ffguVar, this.b);
        cdzdVar.c = obj;
        return cdzdVar;
    }
}
