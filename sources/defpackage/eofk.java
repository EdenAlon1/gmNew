package defpackage;

import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eofk extends eofl {
    private final Stream a;
    public final Function b;
    public final Function c;

    public eofk(Stream stream, Function function, Function function2) {
        stream.getClass();
        this.a = stream;
        function.getClass();
        this.b = function;
        function2.getClass();
        this.c = function2;
    }

    @Override // defpackage.eofl
    public final eofl b(Function function) {
        Function mo448andThen;
        mo448andThen = this.b.mo448andThen(function);
        return new eofk(this.a, mo448andThen, this.c);
    }

    @Override // defpackage.eofl
    public final eofl c(Function function) {
        Function mo448andThen;
        mo448andThen = this.c.mo448andThen(function);
        return new eofk(this.a, this.b, mo448andThen);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.eofl
    public final Object d(eofb eofbVar) {
        final Function function = this.b;
        Function function2 = new Function() { // from class: eofi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return apply;
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        };
        final Function function3 = this.c;
        return this.a.collect(endq.b(function2, new Function() { // from class: eofi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function32) {
                return Function$CC.$default$andThen(this, function32);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return apply;
            }

            public final /* synthetic */ Function compose(Function function32) {
                return Function$CC.$default$compose(this, function32);
            }
        }, eofbVar.a));
    }

    @Override // defpackage.eofl
    public final Stream e() {
        return this.a.map(new Function() { // from class: eofj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                Object apply2;
                eofk eofkVar = eofk.this;
                apply = eofkVar.b.apply(obj);
                apply2 = eofkVar.c.apply(obj);
                return new AbstractMap.SimpleImmutableEntry(apply, apply2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
