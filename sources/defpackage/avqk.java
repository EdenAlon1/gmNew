package defpackage;

import j$.lang.Iterable$EL;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avqk implements avrk {
    private final Supplier a;

    public avqk(Supplier supplier) {
        this.a = supplier;
    }

    private final avmz c() {
        Object obj;
        int i = avmz.b;
        avml avmlVar = new avml();
        avmlVar.c(avoi.a);
        obj = this.a.get();
        avmlVar.b((Instant) obj);
        return avmlVar.a();
    }

    @Override // defpackage.avrk
    public final elfl a(Iterable iterable) {
        final avmz c = c();
        final HashMap hashMap = new HashMap();
        Iterable$EL.forEach(iterable, new Consumer() { // from class: avqj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                hashMap.put((awui) obj, c);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elfo.e(hashMap);
    }

    @Override // defpackage.avrk
    public final elfl b(awui awuiVar) {
        return elfo.e(c());
    }
}
