package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctyw {
    private final ctyu a;
    private final ctwb b;
    private final Optional c;
    private final cpo d = new cpo();
    private final Object e = new Object();

    public ctyw(ctyu ctyuVar, ctwb ctwbVar, Optional optional) {
        this.a = ctyuVar;
        this.b = ctwbVar;
        this.c = optional;
    }

    public final ctyx a(int i) {
        int a = this.b.h(i).a();
        ctyt ctytVar = (ctyt) cpp.a(this.d, a);
        if (ctytVar != null) {
            return ctytVar;
        }
        synchronized (this.e) {
            try {
                try {
                    ctyt ctytVar2 = (ctyt) cpp.a(this.d, a);
                    if (ctytVar2 == null) {
                        ctyu ctyuVar = this.a;
                        Context context = (Context) ctyuVar.a.b();
                        context.getClass();
                        ctyr ctyrVar = (ctyr) ctyuVar.b.b();
                        ctyrVar.getClass();
                        ctwb ctwbVar = (ctwb) ctyuVar.c.b();
                        ctwbVar.getClass();
                        cpbs cpbsVar = (cpbs) ctyuVar.d.b();
                        cpbsVar.getClass();
                        final ctyt ctytVar3 = new ctyt(context, ctyrVar, ctwbVar, cpbsVar, a, this);
                        this.d.f(a, ctytVar3);
                        this.c.ifPresent(new Consumer() { // from class: ctyv
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                son sonVar = ((ctyq) obj).a;
                                sonVar.a(ctyt.this.a(), snz.b(sonVar.a));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        ctytVar2 = ctytVar3;
                    }
                    return ctytVar2;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
