package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class elne {
    public static final Optional a = Optional.empty();
    protected final AtomicReference b;
    public final AtomicBoolean c;
    protected final elnh d;
    public final elnp e;

    protected elne(elnh elnhVar, elnp elnpVar) {
        new Handler(Looper.getMainLooper());
        this.b = new AtomicReference(a);
        this.c = new AtomicBoolean(false);
        this.d = elnhVar;
        this.e = elnpVar;
        elna elnaVar = (elna) elnpVar;
        elnaVar.c = new elmz();
        if (elnaVar.c == null) {
            return;
        }
        Collection.EL.stream(((dlou) elnpVar).a).map(new Function() { // from class: elmq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((elno) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: elmr
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
                int i = elna.d;
                emag emagVar = ((eloy) obj).d().e;
                if (emagVar == null) {
                    emagVar = emag.a;
                }
                return emagVar.b;
            }
        }).forEach(new Consumer() { // from class: elms
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((eloy) obj).f();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
    
        if (r7 != 2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r11, android.os.Bundle r12, java.util.function.Consumer r13) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elne.a(java.lang.String, android.os.Bundle, java.util.function.Consumer):void");
    }
}
