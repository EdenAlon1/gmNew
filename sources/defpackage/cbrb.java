package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbrb implements aptb {
    private final apue a;

    public cbrb(final dtuu dtuuVar, apuc apucVar) {
        String[] strArr = bumm.a;
        bumh bumhVar = new bumh(bumm.a);
        bumhVar.z("MessageStarChangeObserver");
        bumhVar.d(new Function() { // from class: cbqy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bulv bulvVar = (bulv) obj;
                return new bulw[]{bulvVar.a, bulvVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.a = apucVar.a("MessageStarChangeObserver", bumhVar.b(), new apud() { // from class: cbqz
            @Override // defpackage.apud
            public final Object a(final Consumer consumer) {
                return new cbrl(dtuu.this, new Consumer() { // from class: cbra
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        Consumer.this.o((engw) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
            }
        });
    }

    @Override // defpackage.aptb
    public final apta a() {
        return this.a.a();
    }

    @Override // defpackage.aptb
    public final ctbx b(alyd alydVar) {
        return this.a.b(alydVar);
    }
}
