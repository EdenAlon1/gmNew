package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.view.accessibility.AccessibilityManager;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dccj implements dcak {
    public final ffbr a;
    public final ContentResolver b;
    public final ffbr c;
    public List d = Collections.EMPTY_LIST;
    public final Map e = new ConcurrentHashMap();
    public dcci f;
    public elfl g;
    public elfl h;
    public dccd i;
    private final Context j;
    private final errl k;
    private final errl l;

    public dccj(Context context, ffbr ffbrVar, ContentResolver contentResolver, errl errlVar, errl errlVar2, ffbr ffbrVar2) {
        this.j = context;
        this.a = ffbrVar;
        this.b = contentResolver;
        this.k = errlVar;
        this.l = errlVar2;
        this.c = ffbrVar2;
    }

    @Override // defpackage.dcak
    public final int a() {
        return this.d.size();
    }

    final bwwz b(int i) {
        return (bwwz) this.d.get(i);
    }

    final void c() {
        if (this.f == null) {
            Uri n = bcqc.n(this.j);
            dcci dcciVar = new dcci(this);
            this.f = dcciVar;
            this.b.registerContentObserver(n, false, dcciVar);
        }
        elfl elflVar = this.g;
        if (elflVar != null && !elflVar.isDone()) {
            elflVar.cancel(true);
        }
        elfl g = elfo.g(new Callable() { // from class: dcce
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return caqz.c();
            }
        }, this.k);
        this.g = g;
        g.k(axou.a(new dccg(this)), this.l);
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.j.getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        elfl i = g.i(new eroh() { // from class: dccf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dccj dccjVar = dccj.this;
                List<bwwz> list = (List) obj;
                eere eereVar = (eere) dccjVar.c.b();
                ArrayList arrayList = new ArrayList(list.size());
                for (bwwz bwwzVar : list) {
                    if (!dccjVar.e.containsKey(bwwzVar.o())) {
                        arrayList.add(elfl.g(eereVar.e(bwwzVar.o())));
                    }
                }
                return erqt.o(arrayList);
            }
        }, this.k);
        this.h = i;
        i.k(axou.a(new dcch(this)), this.l);
    }

    public final void d() {
        dccd dccdVar = this.i;
        if (dccdVar != null) {
            dccdVar.p();
        }
    }
}
