package defpackage;

import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csct {
    public final ffbr a;
    public final Duration b;

    public csct(ffbr ffbrVar) {
        this.a = ffbrVar;
        Object e = csgj.F.e();
        e.getClass();
        Duration ofDays = Duration.ofDays(((Number) e).longValue());
        ofDays.getClass();
        this.b = ofDays;
    }

    public static final engw a(final engw engwVar) {
        efbd.b();
        String[] strArr = bqth.a;
        bqta bqtaVar = new bqta();
        bqtaVar.f("CmsRestoreDependencyCacheDatabaseOperations#deleteDependencyMessages");
        bqtaVar.c(new Function() { // from class: cscr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqtg bqtgVar = (bqtg) obj;
                bqtgVar.getClass();
                bqtgVar.aq(new dtrw("cms_restore_dependency_cache_table.dependency_cms_id", 3, bqtg.at(engw.this), false));
                return bqtgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bqtf bqtfVar = (bqtf) bqtaVar.b().b;
        engw engwVar2 = (engw) bqth.b().r("cms_restore_dependency_cache_table-deleteAndReturnDeletedRows-txn", new emyl() { // from class: bqrs
            @Override // defpackage.emyl
            public final Object get() {
                bqte a = bqth.a();
                bqtf bqtfVar2 = bqtf.this;
                a.k(bqtfVar2);
                a.z("cms_restore_dependency_cache_table-deleteAndReturnDeletedRows-query");
                engw y = a.b().y();
                bqta bqtaVar2 = new bqta();
                bqtaVar2.b = bqtfVar2;
                bqtaVar2.f("cms_restore_dependency_cache_table-deleteAndReturnDeletedRows-delete");
                bqtaVar2.b().b();
                return y;
            }
        });
        engwVar2.getClass();
        return engwVar2;
    }
}
