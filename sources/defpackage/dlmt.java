package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.PatternMatcher;
import android.util.Log;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlmt extends dllp {
    public dlmt() {
        super(dexf.SHARED_PREFERENCES_DELETION, 10L);
    }

    @Override // defpackage.dllp
    public final dllv a(dllv dllvVar, emxc emxcVar) {
        long j;
        if (!emxcVar.g() || ((deyi) emxcVar.c()).b != 6) {
            throw new IllegalArgumentException();
        }
        Context context = dllvVar.b;
        deyi deyiVar = (deyi) emxcVar.c();
        deyd deydVar = deyiVar.b == 6 ? (deyd) deyiVar.c : deyd.a;
        if (deydVar.b) {
            context = context.createDeviceProtectedStorageContext();
        }
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(deydVar.c, 0);
        eygr<String> eygrVar = deydVar.d;
        eygr eygrVar2 = deydVar.e;
        final SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : eygrVar) {
            if (sharedPreferences.contains(str)) {
                edit.remove(str);
                z = true;
            }
        }
        if (eygrVar2.isEmpty()) {
            j = 0;
        } else {
            Stream map = Collection.EL.stream(eygrVar2).map(new Function() { // from class: dlmp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new PatternMatcher((String) obj, 2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            final engw engwVar = (engw) map.collect(endq.a);
            Stream filter = Collection.EL.stream(sharedPreferences.getAll().keySet()).filter(new Predicate() { // from class: dlmq
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
                    final String str2 = (String) obj;
                    return Collection.EL.stream(engw.this).anyMatch(new Predicate() { // from class: dlms
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
                            return ((PatternMatcher) obj2).match(str2);
                        }
                    });
                }
            });
            edit.getClass();
            j = filter.map(new Function() { // from class: dlmr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return edit.remove((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).count();
        }
        if ((z || j > 0) && edit.commit()) {
            Log.i("SPDeletionFix", "Preferences were deleted.");
            return dllvVar;
        }
        Log.i("SPDeletionFix", "No preferences were deleted.");
        return dllvVar;
    }

    @Override // defpackage.dllp
    public final String b() {
        return "SHARED_PREFERENCES_DELETION";
    }
}
