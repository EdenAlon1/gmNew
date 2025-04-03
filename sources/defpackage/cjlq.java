package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjlq extends ffhv implements ffjm {
    final /* synthetic */ cjlk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjlq(cjlk cjlkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cjlkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjlq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object apply;
        ffci.b(obj);
        String[] strArr = bwlg.a;
        bwld bwldVar = new bwld();
        bwldVar.ap("PipelineWorkDatabaseOperations#incrementAttemptCount");
        final cjlk cjlkVar = this.a;
        apply = new Function() { // from class: cjlp
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
        bwldVar.af(new bwle((bwlf) apply));
        bwldVar.ag("execution_attempt_count", dtzk.a(bwlg.b.e));
        final bwlc b = bwldVar.b();
        engw engwVar = (engw) bwlg.a().r("updateAndReturnUpdatedRowsAfterUpdate-txn-pipeline_work", new emyl() { // from class: bwlb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emyl
            public final Object get() {
                String[] strArr2 = bwlg.a;
                bwla bwlaVar = new bwla(bwlg.a);
                bwlaVar.z("updateAndReturnUpdatedRowsAfterUpdate-pre-pipeline_work");
                bwlaVar.u();
                bwlaVar.n(new dtzq("ROWID", new Object[0]), "_rowid");
                bwlc bwlcVar = bwlc.this;
                engw engwVar2 = bwlcVar.e;
                int i = ((enou) engwVar2).c;
                for (int i2 = 0; i2 < i; i2++) {
                    bwlaVar.k((bwle) ((duap) engwVar2.get(i2)));
                }
                if (((dtrm) bwlcVar.d).b) {
                    bwlf bwlfVar = new bwlf();
                    bwlfVar.as(bwlcVar.h());
                    bwlaVar.c(bwlfVar);
                }
                engr engrVar = new engr();
                bwkl bwklVar = (bwkl) bwlaVar.b().o();
                while (bwklVar.moveToNext()) {
                    try {
                        engrVar.h(bwklVar.dd("_rowid"));
                    } catch (Throwable th) {
                        try {
                            bwklVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bwklVar.close();
                String str = (String) Collection.EL.stream(engrVar.g()).collect(Collectors.joining(","));
                bwlcVar.e();
                bwla bwlaVar2 = new bwla(bwlg.a);
                bwlaVar2.z("updateAndReturnUpdatedRowsAfterUpdate-post-pipeline_work");
                bwlf bwlfVar2 = new bwlf();
                bwlfVar2.as(new dtzq("ROWID IN ($R)", new Object[]{str}));
                bwlaVar2.c(bwlfVar2);
                return ((bwkl) bwlaVar2.b().o()).cW();
            }
        });
        engwVar.getClass();
        bwjn bwjnVar = (bwjn) ffdx.M(engwVar);
        if (bwjnVar != null) {
            return cjlm.a(bwjnVar);
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjlq(this.a, ffguVar);
    }
}
