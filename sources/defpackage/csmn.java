package defpackage;

import android.content.Context;
import android.content.Intent;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csmn extends csob {
    public final csow a;
    public elbx b;
    private final errl c;

    public csmn(errl errlVar, csow csowVar) {
        this.c = errlVar;
        this.a = csowVar;
    }

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.b.b("ConnectivityBroadcastReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            axnw.h(elfo.f(new Runnable() { // from class: csmm
                @Override // java.lang.Runnable
                public final void run() {
                    final csow csowVar = csmn.this.a;
                    synchronized (csowVar.j) {
                        Collection.EL.stream(csowVar.i.values()).flatMap(new Function() { // from class: csor
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Collection.EL.stream((List) obj);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).forEach(new Consumer() { // from class: csos
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                csmx csmxVar = (csmx) obj;
                                csmxVar.getClass();
                                axnw.h(elfo.f(new csou(csmxVar), csow.this.b));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                }
            }, this.c));
        }
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }
}
