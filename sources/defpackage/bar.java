package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bar implements bam, auf, baw {
    public azl b;
    public bag c;
    public final List d;
    final avb f;
    public final Deque a = new ArrayDeque();
    public boolean e = false;

    public bar(avb avbVar) {
        biw.b();
        this.f = avbVar;
        this.d = new ArrayList();
    }

    @Override // defpackage.bam
    public final void a() {
        biw.b();
        avl avlVar = new avl("Camera is closed.", null);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bax) it.next()).m(avlVar);
        }
        this.a.clear();
        ArrayList arrayList = new ArrayList(this.d);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bag bagVar = (bag) arrayList.get(i);
            biw.b();
            if (!bagVar.c.isDone()) {
                bagVar.b(avlVar);
                bagVar.f(avlVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v26 */
    public final void b() {
        bbt bbtVar;
        bdy bdyVar;
        biw.b();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (d()) {
            Log.d("TakePictureManagerImpl", "There is already a request in-flight.");
            return;
        }
        if (this.e) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        azl azlVar = this.b;
        biw.b();
        if (azlVar.d.a() == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        bax baxVar = (bax) this.a.poll();
        if (baxVar == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
            return;
        }
        final bag bagVar = new bag(baxVar, this);
        ?? r8 = 1;
        ksw.c(!d());
        this.c = bagVar;
        bagVar.a().b(new Runnable() { // from class: bao
            @Override // java.lang.Runnable
            public final void run() {
                bar barVar = bar.this;
                barVar.c = null;
                barVar.b();
            }
        }, bjb.a());
        this.d.add(bagVar);
        biw.b();
        bagVar.c.b(new Runnable() { // from class: bap
            @Override // java.lang.Runnable
            public final void run() {
                bar.this.d.remove(bagVar);
            }
        }, bjb.a());
        azl azlVar2 = this.b;
        ListenableFuture a = bagVar.a();
        biw.b();
        boolean z = false;
        bdh bdhVar = (bdh) bfy.c(azlVar2.b, beo.c, new atx(Arrays.asList(new bdl())));
        bdhVar.getClass();
        int i = azl.a;
        azl.a = i + 1;
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(bdhVar.hashCode());
        List<bdl> a2 = bdhVar.a();
        a2.getClass();
        for (bdl bdlVar : a2) {
            bdi bdiVar = new bdi();
            bdk bdkVar = azlVar2.c;
            boolean z2 = z;
            bdiVar.b = bdkVar.f;
            bdiVar.f(bdkVar.e);
            bdiVar.c(baxVar.h());
            bdiVar.g(azlVar2.e.i());
            if (((ayd) azlVar2.e).c.size() > r8 && (bdyVar = azlVar2.e.l) != null) {
                bdiVar.g(bdyVar);
            }
            azd azdVar = azlVar2.e;
            bdiVar.c = azdVar.m != null ? r8 : z2 ? 1 : 0;
            int i2 = ((ayd) azdVar).b;
            if (bly.d(i2) || bly.e(i2)) {
                if (blr.a()) {
                    bdiVar.e(bdk.a, Integer.valueOf(baxVar.c()));
                }
                bdiVar.e(bdk.b, Integer.valueOf(bix.m(baxVar.e(), ((ayd) azlVar2.e).a) ? baxVar.a() == 0 ? 100 : 95 : baxVar.b()));
            }
            bdiVar.f(bdlVar.a.e);
            bdiVar.h(valueOf, Integer.valueOf(z2 ? 1 : 0));
            bdiVar.e.b("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i));
            bdiVar.d(azlVar2.e.i);
            if (((ayd) azlVar2.e).c.size() > 1 && (bbtVar = azlVar2.e.j) != null) {
                bdiVar.d(bbtVar);
            }
            arrayList.add(bdiVar.b());
            r8 = 1;
            z = z2 ? 1 : 0;
        }
        boolean z3 = z;
        boolean z4 = r8;
        ksr ksrVar = new ksr(new ayq(arrayList, bagVar), new bad(bdhVar, baxVar, bagVar, a, i));
        ayq ayqVar = (ayq) ksrVar.a;
        ayqVar.getClass();
        bad badVar = (bad) ksrVar.b;
        badVar.getClass();
        azl azlVar3 = this.b;
        biw.b();
        ((ayd) azlVar3.e).g.accept(badVar);
        biw.b();
        avk avkVar = this.f.a;
        synchronized (avkVar.b) {
            if (avkVar.b.get() == null) {
                avkVar.b.set(Integer.valueOf(avkVar.b()));
            }
        }
        avb avbVar = this.f;
        List list = ayqVar.a;
        avk avkVar2 = avbVar.a;
        biw.b();
        ListenableFuture f = bkj.f(avkVar2.E().m(list, avkVar2.a, avkVar2.c), new afd() { // from class: ava
            @Override // defpackage.afd
            public final Object a(Object obj) {
                int i3 = avk.i;
                return null;
            }
        }, bjb.a());
        bkj.i(f, new baq(this, ayqVar), bjm.a());
        biw.b();
        ksw.d(bagVar.h == null ? z4 : z3, "CaptureRequestFuture can only be set once.");
        bagVar.h = f;
    }

    @Override // defpackage.baw
    public final void c(bax baxVar) {
        biw.b();
        avw.a("TakePictureManagerImpl", "Add a new request for retrying.");
        this.a.addFirst(baxVar);
        b();
    }

    public final boolean d() {
        return this.c != null;
    }

    @Override // defpackage.auf
    public final void k(avr avrVar) {
        bjm.a().execute(new Runnable() { // from class: ban
            @Override // java.lang.Runnable
            public final void run() {
                bar.this.b();
            }
        });
    }
}
