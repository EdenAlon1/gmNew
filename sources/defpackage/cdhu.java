package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdhu extends ffhv implements ffjm {
    final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdhu(boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdhu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object apply;
        ffci.b(obj);
        String[] strArr = bqon.a;
        bqoi bqoiVar = new bqoi(bqon.a);
        bqoiVar.z("queryNextIncrementalItems");
        bqoiVar.C((String) DesugarArrays.stream(new bqof[]{new bqof(bqon.b.a)}).map(new Function() { // from class: bqoh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((bqof) obj2).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        Object e = cdhw.b.e();
        e.getClass();
        bqoiVar.x(((Number) e).intValue());
        if (!this.a) {
            apply = new Function() { // from class: cdht
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    Object apply2;
                    bqom bqomVar = (bqom) obj2;
                    Function[] functionArr = {new Function() { // from class: cdhr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            bqom bqomVar2 = (bqom) obj3;
                            bqomVar2.aq(new dtwe("cms_incremental_events.table_type", 2, 5L));
                            return bqomVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: cdhs
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            bqom bqomVar2 = (bqom) obj3;
                            bqomVar2.b(ccrk.a(17));
                            bqomVar2.b(ccrk.a(33));
                            return bqomVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }};
                    bqom[] bqomVarArr = new bqom[2];
                    for (int i = 0; i < 2; i++) {
                        Function function = functionArr[i];
                        String[] strArr2 = bqon.a;
                        apply2 = function.apply(new bqom());
                        bqomVarArr[i] = (bqom) apply2;
                    }
                    bqomVar.ar(bqomVarArr);
                    return bqomVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new bqom());
            bqoiVar.k(new bqol((bqom) apply));
        }
        return bqoiVar.b().y();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdhu(this.a, ffguVar);
    }
}
