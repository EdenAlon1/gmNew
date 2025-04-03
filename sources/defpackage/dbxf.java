package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbxf implements ljv {
    final /* synthetic */ ea a;
    final /* synthetic */ cwpg b;
    final /* synthetic */ tam c;
    final /* synthetic */ dede d;
    final /* synthetic */ dbxg e;

    public dbxf(dbxg dbxgVar, ea eaVar, cwpg cwpgVar, tam tamVar, dede dedeVar) {
        this.a = eaVar;
        this.b = cwpgVar;
        this.c = tamVar;
        this.d = dedeVar;
        this.e = dbxgVar;
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        dbxg dbxgVar;
        cwpf cwpfVar;
        ViewTreeObserver viewTreeObserver = this.e.d;
        if (viewTreeObserver != null && viewTreeObserver.isAlive() && (cwpfVar = (dbxgVar = this.e).c) != null) {
            dbxgVar.d.removeOnGlobalLayoutListener(cwpfVar);
        }
        dbxg dbxgVar2 = this.e;
        final dede dedeVar = this.d;
        Stream stream = Collection.EL.stream(dbxgVar2.a);
        dedeVar.getClass();
        stream.forEach(new Consumer() { // from class: dbxd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                dede.this.g((decy) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dbxg dbxgVar3 = this.e;
        final dede dedeVar2 = this.d;
        Stream stream2 = Collection.EL.stream(dbxgVar3.b);
        dedeVar2.getClass();
        stream2.forEach(new Consumer() { // from class: dbxe
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                dede.this.h((decz) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.e.a.clear();
        this.e.b.clear();
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        Window window;
        View decorView;
        eg G = this.a.G();
        if (G == null || (window = G.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        this.e.d = decorView.getViewTreeObserver();
        dbxg dbxgVar = this.e;
        if (dbxgVar.d != null) {
            dbxgVar.c = this.b.a(G, decorView, this.c.a);
            dbxg dbxgVar2 = this.e;
            dbxgVar2.d.addOnGlobalLayoutListener(dbxgVar2.c);
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
