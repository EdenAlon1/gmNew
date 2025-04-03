package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.util.p2p.ClassificationResult;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aezq implements aezz {
    public static final /* synthetic */ int b = 0;
    public final aezw a;

    static {
        entd.c("BugleSuperSort");
    }

    public aezq(aezw aezwVar) {
        this.a = aezwVar;
    }

    @Override // defpackage.aezz
    public final aezy a(aezx aezxVar) {
        aezf aezfVar = (aezf) aezxVar;
        ParticipantsTable.BindData bindData = aezfVar.a;
        if ((!TextUtils.isEmpty(bindData.T()) && !bdtd.m(bindData)) || aezfVar.d || (aezxVar.g() && aezxVar.f())) {
            return new aezg(SuperSortLabel.PERSONAL, 0.0f, "");
        }
        if (!bdtd.m(aezfVar.a)) {
            ParticipantsTable.BindData bindData2 = aezfVar.a;
            final SuperSortLabel superSortLabel = aoqw.j(bindData2.U()) ? SuperSortLabel.BUSINESS_UPDATE : bdqv.d(bindData2) ? SuperSortLabel.BUSINESS_UPDATE : bindData2.D().a() ? SuperSortLabel.BUSINESS_UPDATE : SuperSortLabel.UPDATE;
            return (aezy) Collection.EL.stream(aezfVar.c).filter(new Predicate() { // from class: aezm
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i = aezq.b;
                    return ((ClassificationResult) obj).c() == 3;
                }
            }).max(Comparator.CC.comparing(new Function() { // from class: aezn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Float.valueOf(((ClassificationResult) obj).a());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })).map(new Function() { // from class: aezo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ClassificationResult classificationResult = (ClassificationResult) obj;
                    return new aezg(aezq.this.a.a(classificationResult.b()), classificationResult.a(), classificationResult.b());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElseGet(new Supplier() { // from class: aezp
                @Override // java.util.function.Supplier
                public final Object get() {
                    int i = aezq.b;
                    return new aezg(SuperSortLabel.this, 0.0f, "");
                }
            });
        }
        SuperSortLabel superSortLabel2 = aezfVar.e;
        if (superSortLabel2 == SuperSortLabel.UNKNOWN) {
            superSortLabel2 = SuperSortLabel.UPDATE;
        }
        return new aezg(superSortLabel2, 0.0f, "");
    }
}
