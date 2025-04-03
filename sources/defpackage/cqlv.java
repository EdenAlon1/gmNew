package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqlv extends ceut {
    private final errl a;

    public cqlv(errl errlVar) {
        this.a = errlVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(5);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DeleteConversationPartsWorkItemHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cptj.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cptj cptjVar = (cptj) eyhsVar;
        return elfo.g(new Callable() { // from class: cqlu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eygr<cpti> eygrVar = cptj.this.b;
                final engr engrVar = new engr();
                for (cpti cptiVar : eygrVar) {
                    File file = new File(cptiVar.c);
                    if (file.exists() && cqlk.d(file)) {
                        engrVar.h(cptiVar.b);
                    }
                }
                String[] strArr = PartsTable.a;
                bwdi bwdiVar = new bwdi();
                bwdiVar.ap("deletePartsCache");
                bwdiVar.o();
                bwdiVar.s();
                bwdiVar.D(new Function() { // from class: cqlh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwdm bwdmVar = (bwdm) obj;
                        cskc cskcVar = cqlk.a;
                        bwdmVar.k(engr.this.g());
                        return bwdmVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bwdiVar.b().e();
                return ceyt.i();
            }
        }, this.a);
    }
}
