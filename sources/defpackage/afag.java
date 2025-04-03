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
public final class afag implements aezz {
    public final aezw a;
    private final cpdg b;

    public afag(aezw aezwVar, cpdg cpdgVar) {
        this.a = aezwVar;
        this.b = cpdgVar;
    }

    @Override // defpackage.aezz
    public final aezy a(aezx aezxVar) {
        aezf aezfVar = (aezf) aezxVar;
        if (!aezfVar.d && !aezxVar.g()) {
            ParticipantsTable.BindData bindData = aezfVar.a;
            String U = bindData.U();
            if (bdtd.m(bindData) || TextUtils.isEmpty(U) || aoqw.j(U) || !this.b.g(U)) {
                if (!bdtd.m(aezfVar.a)) {
                    return (aezy) Collection.EL.stream(aezfVar.c).filter(new Predicate() { // from class: afac
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
                            return ((ClassificationResult) obj).c() == 3;
                        }
                    }).max(Comparator.CC.comparing(new Function() { // from class: afad
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
                    })).map(new Function() { // from class: afae
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            ClassificationResult classificationResult = (ClassificationResult) obj;
                            return new aezg(afag.this.a.a(classificationResult.b()), classificationResult.a(), classificationResult.b());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElseGet(new Supplier() { // from class: afaf
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new aezg(SuperSortLabel.UPDATE, 0.0f, "");
                        }
                    });
                }
                SuperSortLabel superSortLabel = aezfVar.e;
                if (superSortLabel == SuperSortLabel.UNKNOWN) {
                    superSortLabel = SuperSortLabel.UPDATE;
                }
                return new aezg(superSortLabel, 0.0f, "");
            }
        }
        return new aezg(SuperSortLabel.PERSONAL, 0.0f, "");
    }
}
