package defpackage;

import android.content.Context;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikg extends dikp {
    public static final /* synthetic */ int b = 0;

    public dikg(djix djixVar, dkpp dkppVar, eplu epluVar, errl errlVar, dijt dijtVar) {
        super(djixVar, dkppVar, epluVar, errlVar, dijtVar);
    }

    public final void d(final Context context, final int i) {
        L(new Callable() { // from class: dikc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eyzk eyzkVar = (eyzk) eyzl.a.createBuilder();
                eyzn eyznVar = (eyzn) eyzo.a.createBuilder();
                eyznVar.copyOnWrite();
                eyzo eyzoVar = (eyzo) eyznVar.instance;
                eyzoVar.c = i - 1;
                eyzoVar.b |= 1;
                eyzkVar.copyOnWrite();
                eyzl eyzlVar = (eyzl) eyzkVar.instance;
                eyzo eyzoVar2 = (eyzo) eyznVar.build();
                eyzoVar2.getClass();
                eyzlVar.c = eyzoVar2;
                eyzlVar.b = 3;
                dikg.this.A(context, (eyzl) eyzkVar.build());
                return null;
            }
        }, new Function() { // from class: dikd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = dikg.b;
                dkty.i((Throwable) obj, "Fail to log platformBindingEvent %d", Integer.valueOf(i - 1));
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
