package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apue implements aptb {
    public final String a;
    public final ctbl b;
    private final dtrs c;

    public apue(ctbk ctbkVar, String str, dtyq dtyqVar, apud apudVar) {
        this.a = str;
        dtrs dtrsVar = (dtrs) apudVar.a(new Consumer() { // from class: apua
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                engw engwVar = (engw) obj;
                int size = engwVar.size();
                for (int i = 0; i < size; i++) {
                    apue apueVar = apue.this;
                    final alyc alycVar = (alyc) engwVar.get(i);
                    apueVar.b.c(new Supplier() { // from class: aptz
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return alyc.this;
                        }
                    }, apueVar.a);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.c = dtrsVar;
        this.b = ctbkVar.a(new apub(dtyqVar, dtrsVar));
    }

    @Override // defpackage.aptb
    public final apta a() {
        return new apta(this.a);
    }

    @Override // defpackage.aptb
    public final ctbx b(final alyd alydVar) {
        ctbf ctbfVar = new ctbf() { // from class: apty
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return alyd.this.a((alyc) obj);
            }
        };
        String str = this.a;
        return this.b.a(ctbfVar, str, str, str);
    }
}
