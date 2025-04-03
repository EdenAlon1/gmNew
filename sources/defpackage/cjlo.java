package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjlo extends ffhv implements ffjm {
    final /* synthetic */ cjlk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjlo(cjlk cjlkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cjlkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjlo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object apply;
        ffci.b(obj);
        String[] strArr = bwlg.a;
        bwkw bwkwVar = new bwkw();
        bwkwVar.f("PipelineWorkDatabaseOperations#delete");
        final cjlk cjlkVar = this.a;
        apply = new Function() { // from class: cjln
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bwlf bwlfVar = (bwlf) obj2;
                bwlfVar.b(cjlk.this);
                return bwlfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bwlf());
        bwkwVar.b = new bwle((bwlf) apply);
        bwkwVar.d();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjlo(this.a, ffguVar);
    }
}
