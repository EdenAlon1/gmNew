package defpackage;

import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwy {
    public static final cskc a = cskc.g("Bugle", "RetrieveBrandPublicKeysWorkHelper");
    public final cbxr b;

    public cbwy(cbxr cbxrVar) {
        this.b = cbxrVar;
    }

    static final engw a(final pot potVar) {
        Object obj = potVar.b.get("vsms_brand_public_keys_name_list");
        String[] strArr = null;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                por porVar = new por(obj);
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr2[i] = (String) porVar.invoke(Integer.valueOf(i));
                }
                strArr = strArr2;
            }
        }
        if (strArr == null || strArr.length == 0) {
            a.r("No vsms brand keys in output data");
            int i2 = engw.d;
            return enou.a;
        }
        Stream map = DesugarArrays.stream(strArr).filter(new Predicate() { // from class: cbwu
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
            public final boolean test(Object obj2) {
                return Objects.nonNull((String) obj2);
            }
        }).map(new Function() { // from class: cbwv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return Optional.ofNullable(pot.this.g((String) obj2));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: cbww
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
            public final boolean test(Object obj2) {
                Optional optional = (Optional) obj2;
                return optional.isPresent() && ((byte[]) optional.get()).length > 0;
            }
        }).map(new Function() { // from class: cbwx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return eyee.x((byte[]) ((Optional) obj2).get());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i3 = engw.d;
        engw engwVar = (engw) map.collect(endq.a);
        csjb c = a.c();
        c.y("number of vsms brand keys in output data", engwVar.size());
        c.r();
        return engwVar;
    }
}
