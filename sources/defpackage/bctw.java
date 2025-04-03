package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bctw implements Iterable<ParticipantsTable.BindData> {
    public final fazb a;
    public final fazb b;
    public final fazb c;
    public final engw d;
    public final int e;
    private final enhk f;
    private final enhk g;

    public bctw(fazb fazbVar, fazb fazbVar2, fazb fazbVar3, engw engwVar, engw engwVar2) {
        this.a = fazbVar;
        this.b = fazbVar2;
        this.c = fazbVar3;
        this.d = engwVar;
        this.e = (int) Collection.EL.stream(engwVar).filter(new Predicate() { // from class: bctp
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
                return !bdtd.m((ParticipantsTable.BindData) obj);
            }
        }).count();
        this.f = (enhk) Collection.EL.stream(engwVar).collect(endq.b(new Function() { // from class: bctr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ParticipantsTable.BindData) obj).S();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bcts
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (ParticipantsTable.BindData) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BinaryOperator() { // from class: bctt
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (ParticipantsTable.BindData) obj;
            }
        }));
        this.g = (enhk) Collection.EL.stream(engwVar).filter(new Predicate() { // from class: bctu
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
                return ((ParticipantsTable.BindData) obj).U() != null;
            }
        }).collect(endq.b(new Function() { // from class: bctv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String U = ((ParticipantsTable.BindData) obj).U();
                U.getClass();
                return U;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bcti
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (ParticipantsTable.BindData) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BinaryOperator() { // from class: bctj
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (ParticipantsTable.BindData) obj;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ParticipantsTable.BindData a() {
        if (this.e != 1) {
            return null;
        }
        engw engwVar = this.d;
        int size = engwVar.size();
        int i = 0;
        while (i < size) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) engwVar.get(i);
            i++;
            if (!bdtd.m(bindData)) {
                return bindData;
            }
        }
        csix.c("Couldn't find other participant");
        return null;
    }

    public final ParticipantsTable.BindData b(String str) {
        return (ParticipantsTable.BindData) this.f.get(str);
    }

    public final ParticipantsTable.BindData c(String str, awui awuiVar) {
        if (awuiVar != null) {
            str = awuiVar.d;
        }
        return (ParticipantsTable.BindData) this.g.get(str);
    }

    public final Optional d() {
        ParticipantsTable.BindData a = a();
        return (a == null || !((cpdg) this.b.b()).k(a.W())) ? Optional.empty() : Optional.of(((aolr) this.c.b()).t(a));
    }

    public final Stream e() {
        return Collection.EL.stream(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return enkr.h(this.d, ((bctw) obj).d);
    }

    public final ArrayList f() {
        return (ArrayList) Collection.EL.stream(this.d).filter(new Predicate() { // from class: bctn
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
                return !bdtd.m((ParticipantsTable.BindData) obj);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bcto
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
    }

    public final boolean g() {
        return bdqv.b(this.d);
    }

    public final boolean h() {
        return Collection.EL.stream(this.d).anyMatch(new Predicate() { // from class: bctm
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
                return ((ParticipantsTable.BindData) obj).D().a();
            }
        });
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        if (this.e == 1) {
            engw engwVar = this.d;
            int size = engwVar.size();
            int i = 0;
            while (i < size) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) engwVar.get(i);
                i++;
                if (!bdtd.m(bindData)) {
                    return bdqu.n(bindData);
                }
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<ParticipantsTable.BindData> iterator() {
        return this.d.iterator();
    }
}
