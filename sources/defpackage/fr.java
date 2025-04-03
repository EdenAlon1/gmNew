package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fr {
    private ArrayList A;
    private final ksp C;
    private final ksp D;
    private final ksp E;
    private final ksp F;
    private final em G;
    private adg H;
    private adg I;
    private boolean J;
    private ArrayList K;
    private ArrayList L;
    private ArrayList M;
    private final Runnable N;
    private final fa O;
    private final fc P;
    public aca e;
    final ArrayList k;
    public final er l;
    public final CopyOnWriteArrayList m;
    int n;
    public en o;
    public ek p;
    public ea q;
    ea r;
    public adg s;
    ArrayDeque t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public fw y;
    private boolean z;
    public final ArrayList a = new ArrayList();
    public final ge b = new ge();
    ArrayList c = new ArrayList();
    public final ep d = new ep(this);
    cg f = null;
    boolean g = false;
    public final abo h = new ez(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = DesugarCollections.synchronizedMap(new HashMap());
    private final Map B = DesugarCollections.synchronizedMap(new HashMap());

    public fr() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.k = new ArrayList();
        this.l = new er(this);
        this.m = new CopyOnWriteArrayList();
        this.C = new ksp() { // from class: eu
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                fr frVar = fr.this;
                Configuration configuration = (Configuration) obj;
                if (frVar.ag()) {
                    frVar.x(configuration, false);
                }
            }
        };
        this.D = new ksp() { // from class: ev
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                fr frVar = fr.this;
                Integer num = (Integer) obj;
                if (frVar.ag() && num.intValue() == 80) {
                    frVar.A(false);
                }
            }
        };
        this.E = new ksp() { // from class: ew
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                fr frVar = fr.this;
                gw gwVar = (gw) obj;
                if (frVar.ag()) {
                    frVar.B(gwVar.a, false);
                }
            }
        };
        this.F = new ksp() { // from class: ex
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                fr frVar = fr.this;
                gz gzVar = (gz) obj;
                if (frVar.ag()) {
                    frVar.G(gzVar.a, false);
                }
            }
        };
        this.O = new fa(this);
        this.n = -1;
        this.G = new fb(this);
        this.P = new fc();
        this.t = new ArrayDeque();
        this.N = new fd(this);
    }

    private final void aA(boolean z) {
        if (this.z) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.o == null) {
            if (!this.x) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.o.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            ax();
        }
        if (this.K == null) {
            this.K = new ArrayList();
            this.L = new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:342:0x063b A[Catch: all -> 0x06b0, LOOP:25: B:340:0x0635->B:342:0x063b, LOOP_END, TryCatch #0 {, blocks: (B:264:0x0518, B:265:0x0527, B:267:0x052d, B:269:0x053b, B:273:0x0544, B:277:0x0547, B:278:0x054b, B:280:0x0551, B:282:0x055b, B:284:0x0563, B:285:0x056e, B:287:0x058c, B:290:0x0592, B:294:0x0573, B:296:0x057b, B:297:0x0586, B:299:0x0598, B:301:0x05a0, B:304:0x05b2, B:306:0x05c4, B:307:0x05cb, B:309:0x05d5, B:311:0x05db, B:313:0x05e9, B:315:0x05f2, B:316:0x05f6, B:318:0x05fc, B:331:0x060c, B:332:0x0615, B:334:0x061b, B:336:0x0627, B:339:0x0630, B:340:0x0635, B:342:0x063b, B:347:0x064e, B:349:0x0658, B:351:0x0678, B:352:0x0697, B:354:0x06a2, B:359:0x0681, B:361:0x068b), top: B:263:0x0518 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0658 A[Catch: all -> 0x06b0, TryCatch #0 {, blocks: (B:264:0x0518, B:265:0x0527, B:267:0x052d, B:269:0x053b, B:273:0x0544, B:277:0x0547, B:278:0x054b, B:280:0x0551, B:282:0x055b, B:284:0x0563, B:285:0x056e, B:287:0x058c, B:290:0x0592, B:294:0x0573, B:296:0x057b, B:297:0x0586, B:299:0x0598, B:301:0x05a0, B:304:0x05b2, B:306:0x05c4, B:307:0x05cb, B:309:0x05d5, B:311:0x05db, B:313:0x05e9, B:315:0x05f2, B:316:0x05f6, B:318:0x05fc, B:331:0x060c, B:332:0x0615, B:334:0x061b, B:336:0x0627, B:339:0x0630, B:340:0x0635, B:342:0x063b, B:347:0x064e, B:349:0x0658, B:351:0x0678, B:352:0x0697, B:354:0x06a2, B:359:0x0681, B:361:0x068b), top: B:263:0x0518 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0678 A[Catch: all -> 0x06b0, TryCatch #0 {, blocks: (B:264:0x0518, B:265:0x0527, B:267:0x052d, B:269:0x053b, B:273:0x0544, B:277:0x0547, B:278:0x054b, B:280:0x0551, B:282:0x055b, B:284:0x0563, B:285:0x056e, B:287:0x058c, B:290:0x0592, B:294:0x0573, B:296:0x057b, B:297:0x0586, B:299:0x0598, B:301:0x05a0, B:304:0x05b2, B:306:0x05c4, B:307:0x05cb, B:309:0x05d5, B:311:0x05db, B:313:0x05e9, B:315:0x05f2, B:316:0x05f6, B:318:0x05fc, B:331:0x060c, B:332:0x0615, B:334:0x061b, B:336:0x0627, B:339:0x0630, B:340:0x0635, B:342:0x063b, B:347:0x064e, B:349:0x0658, B:351:0x0678, B:352:0x0697, B:354:0x06a2, B:359:0x0681, B:361:0x068b), top: B:263:0x0518 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06a2 A[Catch: all -> 0x06b0, TRY_LEAVE, TryCatch #0 {, blocks: (B:264:0x0518, B:265:0x0527, B:267:0x052d, B:269:0x053b, B:273:0x0544, B:277:0x0547, B:278:0x054b, B:280:0x0551, B:282:0x055b, B:284:0x0563, B:285:0x056e, B:287:0x058c, B:290:0x0592, B:294:0x0573, B:296:0x057b, B:297:0x0586, B:299:0x0598, B:301:0x05a0, B:304:0x05b2, B:306:0x05c4, B:307:0x05cb, B:309:0x05d5, B:311:0x05db, B:313:0x05e9, B:315:0x05f2, B:316:0x05f6, B:318:0x05fc, B:331:0x060c, B:332:0x0615, B:334:0x061b, B:336:0x0627, B:339:0x0630, B:340:0x0635, B:342:0x063b, B:347:0x064e, B:349:0x0658, B:351:0x0678, B:352:0x0697, B:354:0x06a2, B:359:0x0681, B:361:0x068b), top: B:263:0x0518 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x067f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aB(java.util.ArrayList r25, java.util.ArrayList r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr.aB(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void aC() {
        Iterator it = aw().iterator();
        while (it.hasNext()) {
            boolean z = ((hj) it.next()).f;
        }
    }

    private final void aD(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((cg) arrayList.get(i)).t) {
                if (i2 != i) {
                    aB(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((cg) arrayList.get(i2)).t) {
                        i2++;
                    }
                }
                aB(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            aB(arrayList, arrayList2, i2, size);
        }
    }

    private final void aE(ea eaVar) {
        ViewGroup av = av(eaVar);
        if (av == null || eaVar.u() + eaVar.v() + eaVar.w() + eaVar.x() <= 0) {
            return;
        }
        if (av.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            av.setTag(R.id.visible_removing_fragment_view_tag, eaVar);
        }
        ((ea) av.getTag(R.id.visible_removing_fragment_view_tag)).az(eaVar.aE());
    }

    private final void aF() {
        Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            S((gc) it.next());
        }
    }

    public static boolean af(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    static final Set ao(cg cgVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < cgVar.e.size(); i++) {
            ea eaVar = ((gf) cgVar.e.get(i)).b;
            if (eaVar != null && cgVar.k) {
                hashSet.add(eaVar);
            }
        }
        return hashSet;
    }

    public static final boolean ap(ea eaVar) {
        if (eaVar.M && eaVar.N) {
            return true;
        }
        boolean z = false;
        for (ea eaVar2 : eaVar.D.b.f()) {
            if (eaVar2 != null) {
                z = ap(eaVar2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    static final boolean aq(ea eaVar) {
        if (eaVar == null) {
            return true;
        }
        if (eaVar.N) {
            return eaVar.B == null || aq(eaVar.E);
        }
        return false;
    }

    static final void at(ea eaVar) {
        if (af(2)) {
            Objects.toString(eaVar);
            Log.v("FragmentManager", "show: ".concat(String.valueOf(eaVar)));
        }
        if (eaVar.I) {
            eaVar.I = false;
            eaVar.U = !eaVar.U;
        }
    }

    private final ViewGroup av(ea eaVar) {
        ViewGroup viewGroup = eaVar.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (eaVar.G <= 0 || !this.p.b()) {
            return null;
        }
        View a = this.p.a(eaVar.G);
        if (a instanceof ViewGroup) {
            return (ViewGroup) a;
        }
        return null;
    }

    private final Set aw() {
        HashSet hashSet = new HashSet();
        Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((gc) it.next()).a.P;
            if (viewGroup != null) {
                hashSet.add(hc.a(viewGroup, am()));
            }
        }
        return hashSet;
    }

    private final void ax() {
        if (ai()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void ay() {
        this.z = false;
        this.L.clear();
        this.K.clear();
    }

    private final void az() {
        if (this.J) {
            this.J = false;
            aF();
        }
    }

    public static ea f(View view) {
        ea i = i(view);
        if (i != null) {
            return i;
        }
        throw new IllegalStateException(a.i(view, "View ", " does not have a Fragment set"));
    }

    static ea i(View view) {
        while (view != null) {
            ea k = k(view);
            if (k != null) {
                return k;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static ea k(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof ea) {
            return (ea) tag;
        }
        return null;
    }

    public static fr m(View view) {
        eg egVar;
        ea i = i(view);
        if (i != null) {
            if (i.aF()) {
                return i.I();
            }
            throw new IllegalStateException(a.k(view, i, "The Fragment ", " that owns View ", " has already been destroyed. Nested fragments should always use the child FragmentManager."));
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                egVar = null;
                break;
            }
            if (context instanceof eg) {
                egVar = (eg) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (egVar != null) {
            return egVar.a();
        }
        throw new IllegalStateException(a.i(view, "View ", " is not within a subclass of FragmentActivity."));
    }

    final void A(boolean z) {
        if (z && (this.o instanceof koq)) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null) {
                eaVar.onLowMemory();
                if (z) {
                    eaVar.D.A(true);
                }
            }
        }
    }

    final void B(boolean z, boolean z2) {
        if (z2 && (this.o instanceof gx)) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null) {
                eaVar.al(z);
                if (z2) {
                    eaVar.D.B(z, true);
                }
            }
        }
    }

    final void C() {
        for (ea eaVar : this.b.f()) {
            if (eaVar != null) {
                eaVar.D.C();
            }
        }
    }

    public final void D(Menu menu) {
        if (this.n <= 0) {
            return;
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null && !eaVar.I) {
                eaVar.D.D(menu);
            }
        }
    }

    public final void E(ea eaVar) {
        if (eaVar == null || !eaVar.equals(e(eaVar.l))) {
            return;
        }
        boolean ah = eaVar.B.ah(eaVar);
        Boolean bool = eaVar.q;
        if (bool == null || bool.booleanValue() != ah) {
            eaVar.q = Boolean.valueOf(ah);
            fr frVar = eaVar.D;
            frVar.aa();
            frVar.E(frVar.r);
        }
    }

    final void F() {
        J(5);
    }

    final void G(boolean z, boolean z2) {
        if (z2 && (this.o instanceof gy)) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null && z2) {
                eaVar.D.G(z, true);
            }
        }
    }

    final void H() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        J(7);
    }

    final void I() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        J(5);
    }

    public final void J(int i) {
        try {
            this.z = true;
            for (gc gcVar : this.b.b.values()) {
                if (gcVar != null) {
                    gcVar.b = i;
                }
            }
            Q(i, false);
            Iterator it = aw().iterator();
            while (it.hasNext()) {
                ((hj) it.next()).g();
            }
            this.z = false;
            au(true);
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    final void K() {
        this.w = true;
        this.y.g = true;
        J(4);
    }

    public final void L(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        ge geVar = this.b;
        if (!geVar.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (gc gcVar : geVar.b.values()) {
                printWriter.print(str);
                if (gcVar != null) {
                    String valueOf = String.valueOf(str);
                    ea eaVar = gcVar.a;
                    printWriter.println(eaVar);
                    eaVar.ac(valueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = geVar.a.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                ea eaVar2 = (ea) geVar.a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(eaVar2.toString());
            }
        }
        ArrayList arrayList = this.A;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                ea eaVar3 = (ea) this.A.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(eaVar3.toString());
            }
        }
        int size3 = this.c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                String valueOf2 = String.valueOf(str);
                cg cgVar = (cg) this.c.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(cgVar.toString());
                cgVar.f(valueOf2.concat("    "), printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (fm) this.a.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    public final void M() {
        Iterator it = aw().iterator();
        while (it.hasNext()) {
            ((hj) it.next()).g();
        }
    }

    public final void N(fm fmVar, boolean z) {
        if (!z) {
            if (this.o == null) {
                if (!this.x) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            ax();
        }
        synchronized (this.a) {
            if (this.o == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.a.add(fmVar);
            synchronized (this.a) {
                if (this.a.size() == 1) {
                    this.o.d.removeCallbacks(this.N);
                    this.o.d.post(this.N);
                    aa();
                }
            }
        }
    }

    final void O(fm fmVar, boolean z) {
        if (z && (this.o == null || this.x)) {
            return;
        }
        aA(z);
        cg cgVar = this.f;
        if (cgVar != null) {
            cgVar.b = false;
            cgVar.b();
            if (af(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f + " as part of execSingleAction for action " + fmVar);
            }
            this.f.m(false, false);
            this.f.h(this.K, this.L);
            ArrayList arrayList = this.f.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ea eaVar = ((gf) arrayList.get(i)).b;
                if (eaVar != null) {
                    eaVar.t = false;
                }
            }
            this.f = null;
        }
        fmVar.h(this.K, this.L);
        this.z = true;
        try {
            aD(this.K, this.L);
            ay();
            aa();
            az();
            this.b.i();
        } catch (Throwable th) {
            ay();
            throw th;
        }
    }

    final void P(ea eaVar) {
        if (af(2)) {
            Objects.toString(eaVar);
            Log.v("FragmentManager", "hide: ".concat(String.valueOf(eaVar)));
        }
        if (eaVar.I) {
            return;
        }
        eaVar.I = true;
        eaVar.U = true ^ eaVar.U;
        aE(eaVar);
    }

    final void Q(int i, boolean z) {
        en enVar;
        if (this.o == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.n) {
            this.n = i;
            ge geVar = this.b;
            ArrayList arrayList = geVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                gc gcVar = (gc) geVar.b.get(((ea) arrayList.get(i2)).l);
                if (gcVar != null) {
                    gcVar.e();
                }
            }
            for (gc gcVar2 : geVar.b.values()) {
                if (gcVar2 != null) {
                    gcVar2.e();
                    ea eaVar = gcVar2.a;
                    if (eaVar.s && !eaVar.aH()) {
                        if (eaVar.u && !geVar.c.containsKey(eaVar.l)) {
                            geVar.a(eaVar.l, gcVar2.a());
                        }
                        geVar.k(gcVar2);
                    }
                }
            }
            aF();
            if (this.u && (enVar = this.o) != null && this.n == 7) {
                enVar.f();
                this.u = false;
            }
        }
    }

    public final void R(FragmentContainerView fragmentContainerView) {
        View view;
        for (gc gcVar : this.b.e()) {
            ea eaVar = gcVar.a;
            if (eaVar.G == fragmentContainerView.getId() && (view = eaVar.Q) != null && view.getParent() == null) {
                eaVar.P = fragmentContainerView;
                gcVar.b();
                gcVar.e();
            }
        }
    }

    final void S(gc gcVar) {
        ea eaVar = gcVar.a;
        if (eaVar.R) {
            if (this.z) {
                this.J = true;
            } else {
                eaVar.R = false;
                gcVar.e();
            }
        }
    }

    public final void T(Bundle bundle, String str, ea eaVar) {
        if (eaVar.B != this) {
            Z(new IllegalStateException(a.i(eaVar, "Fragment ", " is not currently in the FragmentManager")));
        }
        bundle.putString(str, eaVar.l);
    }

    final void U(ea eaVar) {
        if (af(2)) {
            Log.v("FragmentManager", "remove: " + eaVar + " nesting=" + eaVar.A);
        }
        boolean aH = eaVar.aH();
        if (eaVar.J && aH) {
            return;
        }
        this.b.l(eaVar);
        if (ap(eaVar)) {
            this.u = true;
        }
        eaVar.s = true;
        aE(eaVar);
    }

    final void V(Parcelable parcelable) {
        gc gcVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.o.c.getClassLoader());
                this.B.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.o.c.getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        ge geVar = this.b;
        geVar.c.clear();
        geVar.c.putAll(hashMap);
        fu fuVar = (fu) bundle3.getParcelable("state");
        if (fuVar == null) {
            return;
        }
        this.b.b.clear();
        ArrayList arrayList = fuVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle a = this.b.a((String) arrayList.get(i), null);
            if (a != null) {
                ea eaVar = (ea) this.y.b.get(((ga) a.getParcelable("state")).b);
                if (eaVar != null) {
                    if (af(2)) {
                        Objects.toString(eaVar);
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained ".concat(eaVar.toString()));
                    }
                    gcVar = new gc(this.l, this.b, eaVar, a);
                } else {
                    gcVar = new gc(this.l, this.b, this.o.c.getClassLoader(), l(), a);
                }
                ea eaVar2 = gcVar.a;
                eaVar2.h = a;
                eaVar2.B = this;
                if (af(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + eaVar2.l + "): " + eaVar2);
                }
                gcVar.f(this.o.c.getClassLoader());
                this.b.j(gcVar);
                gcVar.b = this.n;
            }
        }
        for (ea eaVar3 : new ArrayList(this.y.b.values())) {
            if (!this.b.m(eaVar3.l)) {
                if (af(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + eaVar3 + " that was not found in the set of active Fragments " + fuVar.a);
                }
                this.y.e(eaVar3);
                eaVar3.B = this;
                gc gcVar2 = new gc(this.l, this.b, eaVar3);
                gcVar2.b = 1;
                gcVar2.e();
                eaVar3.s = true;
                gcVar2.e();
            }
        }
        ge geVar2 = this.b;
        ArrayList<String> arrayList2 = fuVar.b;
        geVar2.a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                ea b = geVar2.b(str3);
                if (b == null) {
                    throw new IllegalStateException(a.a(str3, "No instantiated fragment for (", ")"));
                }
                if (af(2)) {
                    Log.v("FragmentManager", a.o(b, str3, "restoreSaveState: added (", "): "));
                }
                geVar2.h(b);
            }
        }
        ci[] ciVarArr = fuVar.c;
        if (ciVarArr != null) {
            this.c = new ArrayList(ciVarArr.length);
            int i2 = 0;
            while (true) {
                ci[] ciVarArr2 = fuVar.c;
                if (i2 >= ciVarArr2.length) {
                    break;
                }
                ci ciVar = ciVarArr2[i2];
                cg cgVar = new cg(this);
                ciVar.a(cgVar);
                cgVar.c = ciVar.g;
                for (int i3 = 0; i3 < ciVar.b.size(); i3++) {
                    String str4 = (String) ciVar.b.get(i3);
                    if (str4 != null) {
                        ((gf) cgVar.e.get(i3)).b = e(str4);
                    }
                }
                cgVar.a(1);
                if (af(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + cgVar.c + "): " + cgVar);
                    PrintWriter printWriter = new PrintWriter(new gv());
                    cgVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.c.add(cgVar);
                i2++;
            }
        } else {
            this.c = new ArrayList();
        }
        this.i.set(fuVar.d);
        String str5 = fuVar.e;
        if (str5 != null) {
            ea e = e(str5);
            this.r = e;
            E(e);
        }
        ArrayList arrayList3 = fuVar.f;
        if (arrayList3 != null) {
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                this.j.put((String) arrayList3.get(i4), (ck) fuVar.g.get(i4));
            }
        }
        this.t = new ArrayDeque(fuVar.h);
    }

    final void W(ea eaVar, boolean z) {
        ViewGroup av = av(eaVar);
        if (av == null || !(av instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) av).a = !z;
    }

    final void X(ea eaVar, lkj lkjVar) {
        if (!eaVar.equals(e(eaVar.l)) || (eaVar.C != null && eaVar.B != this)) {
            throw new IllegalArgumentException(a.j(this, eaVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        eaVar.Y = lkjVar;
    }

    final void Y(ea eaVar) {
        if (eaVar != null && (!eaVar.equals(e(eaVar.l)) || (eaVar.C != null && eaVar.B != this))) {
            throw new IllegalArgumentException(a.j(this, eaVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        ea eaVar2 = this.r;
        this.r = eaVar;
        E(eaVar2);
        E(this.r);
    }

    public final void Z(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new gv());
        en enVar = this.o;
        if (enVar == null) {
            try {
                L("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            ((ef) enVar).a.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final int a(String str, int i, boolean z) {
        if (this.c.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.c.size() - 1;
        }
        int size = this.c.size() - 1;
        while (size >= 0) {
            cg cgVar = (cg) this.c.get(size);
            if ((str != null && str.equals(cgVar.m)) || (i >= 0 && i == cgVar.c)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.c.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            int i2 = size - 1;
            cg cgVar2 = (cg) this.c.get(i2);
            if ((str == null || !str.equals(cgVar2.m)) && (i < 0 || i != cgVar2.c)) {
                break;
            }
            size = i2;
        }
        return size;
    }

    public final void aa() {
        synchronized (this.a) {
            if (!this.a.isEmpty()) {
                this.h.h(true);
                if (af(3)) {
                    Log.d("FragmentManager", a.i(this, "FragmentManager ", " enabling OnBackPressedCallback, caused by non-empty pending actions"));
                }
                return;
            }
            boolean z = b() > 0 && ah(this.q);
            if (af(3)) {
                Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
            }
            this.h.h(z);
        }
    }

    final boolean ab(MenuItem menuItem) {
        if (this.n <= 0) {
            return false;
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null && !eaVar.I && (eaVar.aL(menuItem) || eaVar.D.ab(menuItem))) {
                return true;
            }
        }
        return false;
    }

    public final boolean ac(Menu menu, MenuInflater menuInflater) {
        boolean z;
        if (this.n <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (ea eaVar : this.b.g()) {
            if (eaVar != null && aq(eaVar) && !eaVar.I) {
                if (eaVar.M && eaVar.N) {
                    eaVar.ah(menu, menuInflater);
                    z = true;
                } else {
                    z = false;
                }
                if (z | eaVar.D.ac(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(eaVar);
                    z2 = true;
                }
            }
        }
        if (this.A != null) {
            for (int i = 0; i < this.A.size(); i++) {
                ea eaVar2 = (ea) this.A.get(i);
                if (arrayList != null) {
                    arrayList.contains(eaVar2);
                }
            }
        }
        this.A = arrayList;
        return z2;
    }

    public final boolean ad(MenuItem menuItem) {
        if (this.n <= 0) {
            return false;
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null && !eaVar.I && ((eaVar.M && eaVar.N && eaVar.aM(menuItem)) || eaVar.D.ad(menuItem))) {
                return true;
            }
        }
        return false;
    }

    public final boolean ae(Menu menu) {
        boolean z;
        if (this.n <= 0) {
            return false;
        }
        boolean z2 = false;
        for (ea eaVar : this.b.g()) {
            if (eaVar != null && aq(eaVar) && !eaVar.I) {
                if (eaVar.M && eaVar.N) {
                    eaVar.an(menu);
                    z = true;
                } else {
                    z = false;
                }
                if (eaVar.D.ae(menu) | z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final boolean ag() {
        ea eaVar = this.q;
        if (eaVar == null) {
            return true;
        }
        return eaVar.aF() && eaVar.J().ag();
    }

    final boolean ah(ea eaVar) {
        if (eaVar == null) {
            return true;
        }
        fr frVar = eaVar.B;
        return eaVar.equals(frVar.r) && ah(frVar.q);
    }

    public final boolean ai() {
        return this.v || this.w;
    }

    public final boolean aj() {
        return ak(null, -1, 0);
    }

    public final boolean ak(String str, int i, int i2) {
        au(false);
        aA(true);
        ea eaVar = this.r;
        if (eaVar != null && i < 0 && str == null && eaVar.I().aj()) {
            return true;
        }
        boolean al = al(this.K, this.L, str, i, i2);
        if (al) {
            this.z = true;
            try {
                aD(this.K, this.L);
            } finally {
                ay();
            }
        }
        aa();
        az();
        this.b.i();
        return al;
    }

    final boolean al(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int a = a(str, i, 1 == i2);
        if (a < 0) {
            return false;
        }
        int size = this.c.size();
        while (true) {
            size--;
            if (size < a) {
                return true;
            }
            arrayList.add((cg) this.c.remove(size));
            arrayList2.add(true);
        }
    }

    final fc am() {
        ea eaVar = this.q;
        return eaVar != null ? eaVar.B.am() : this.P;
    }

    public final void an() {
        au(true);
        aC();
    }

    public final void ar(String str) {
        N(new fn(this, str, -1), false);
    }

    public final void as(String str) {
        ak(str, -1, 1);
    }

    final void au(boolean z) {
        cg cgVar;
        aA(z);
        if (!this.g && (cgVar = this.f) != null) {
            cgVar.b = false;
            cgVar.b();
            if (af(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f + " as part of execPendingActions for actions " + this.a);
            }
            this.f.m(false, false);
            this.a.add(0, this.f);
            ArrayList arrayList = this.f.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ea eaVar = ((gf) arrayList.get(i)).b;
                if (eaVar != null) {
                    eaVar.t = false;
                }
            }
            this.f = null;
        }
        while (true) {
            ArrayList arrayList2 = this.K;
            ArrayList arrayList3 = this.L;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    break;
                }
                try {
                    int size2 = this.a.size();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        z2 |= ((fm) this.a.get(i2)).h(arrayList2, arrayList3);
                    }
                    if (!z2) {
                        break;
                    }
                    this.z = true;
                    try {
                        aD(this.K, this.L);
                    } finally {
                        ay();
                    }
                } finally {
                    this.a.clear();
                    this.o.d.removeCallbacks(this.N);
                }
            }
        }
        aa();
        az();
        this.b.i();
    }

    public final int b() {
        return this.c.size() + (this.f != null ? 1 : 0);
    }

    final Bundle c() {
        ci[] ciVarArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        aC();
        M();
        au(true);
        this.v = true;
        this.y.g = true;
        ge geVar = this.b;
        ArrayList arrayList2 = new ArrayList(geVar.b.size());
        for (gc gcVar : geVar.b.values()) {
            if (gcVar != null) {
                ea eaVar = gcVar.a;
                geVar.a(eaVar.l, gcVar.a());
                arrayList2.add(eaVar.l);
                if (af(2)) {
                    Log.v("FragmentManager", "Saved state of " + eaVar + ": " + eaVar.h);
                }
            }
        }
        HashMap hashMap = this.b.c;
        if (!hashMap.isEmpty()) {
            ge geVar2 = this.b;
            synchronized (geVar2.a) {
                ciVarArr = null;
                if (geVar2.a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(geVar2.a.size());
                    Iterator it = geVar2.a.iterator();
                    while (it.hasNext()) {
                        ea eaVar2 = (ea) it.next();
                        arrayList.add(eaVar2.l);
                        if (af(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + eaVar2.l + "): " + eaVar2);
                        }
                    }
                }
            }
            int size = this.c.size();
            if (size > 0) {
                ciVarArr = new ci[size];
                for (int i = 0; i < size; i++) {
                    ciVarArr[i] = new ci((cg) this.c.get(i));
                    if (af(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.c.get(i));
                    }
                }
            }
            fu fuVar = new fu();
            fuVar.a = arrayList2;
            fuVar.b = arrayList;
            fuVar.c = ciVarArr;
            fuVar.d = this.i.get();
            ea eaVar3 = this.r;
            if (eaVar3 != null) {
                fuVar.e = eaVar3.l;
            }
            fuVar.f.addAll(this.j.keySet());
            fuVar.g.addAll(this.j.values());
            fuVar.h = new ArrayList(this.t);
            bundle.putParcelable("state", fuVar);
            for (String str : this.B.keySet()) {
                bundle.putBundle("result_".concat(String.valueOf(str)), (Bundle) this.B.get(str));
            }
            for (String str2 : hashMap.keySet()) {
                bundle.putBundle("fragment_".concat(String.valueOf(str2)), (Bundle) hashMap.get(str2));
            }
        } else if (af(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final dz d(ea eaVar) {
        gc d = this.b.d(eaVar.l);
        if (d == null || !d.a.equals(eaVar)) {
            Z(new IllegalStateException(a.i(eaVar, "Fragment ", " is not currently in the FragmentManager")));
        }
        if (d.a.g >= 0) {
            return new dz(d.a());
        }
        return null;
    }

    final ea e(String str) {
        return this.b.b(str);
    }

    public final ea g(int i) {
        ge geVar = this.b;
        int size = geVar.a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (gc gcVar : geVar.b.values()) {
                    if (gcVar != null) {
                        ea eaVar = gcVar.a;
                        if (eaVar.F == i) {
                            return eaVar;
                        }
                    }
                }
                return null;
            }
            ea eaVar2 = (ea) geVar.a.get(size);
            if (eaVar2 != null && eaVar2.F == i) {
                return eaVar2;
            }
        }
    }

    public final ea h(String str) {
        ge geVar = this.b;
        if (str != null) {
            int size = geVar.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ea eaVar = (ea) geVar.a.get(size);
                if (eaVar != null && str.equals(eaVar.H)) {
                    return eaVar;
                }
            }
        }
        if (str != null) {
            for (gc gcVar : geVar.b.values()) {
                if (gcVar != null) {
                    ea eaVar2 = gcVar.a;
                    if (str.equals(eaVar2.H)) {
                        return eaVar2;
                    }
                }
            }
        }
        return null;
    }

    public final ea j(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        ea e = e(string);
        if (e == null) {
            Z(new IllegalStateException(a.m(string, str, "Fragment no longer exists for key ", ": unique id ")));
        }
        return e;
    }

    public final em l() {
        ea eaVar = this.q;
        return eaVar != null ? eaVar.B.l() : this.G;
    }

    final gc n(ea eaVar) {
        String str = eaVar.X;
        if (str != null) {
            lin.a(eaVar, str);
        }
        if (af(2)) {
            Objects.toString(eaVar);
            Log.v("FragmentManager", "add: ".concat(String.valueOf(eaVar)));
        }
        gc o = o(eaVar);
        eaVar.B = this;
        this.b.j(o);
        if (!eaVar.J) {
            this.b.h(eaVar);
            eaVar.s = false;
            if (eaVar.Q == null) {
                eaVar.U = false;
            }
            if (ap(eaVar)) {
                this.u = true;
            }
        }
        return o;
    }

    public void noteStateNotSaved() {
        if (this.o == null) {
            return;
        }
        this.v = false;
        this.w = false;
        this.y.g = false;
        for (ea eaVar : this.b.g()) {
            if (eaVar != null) {
                eaVar.D.noteStateNotSaved();
            }
        }
    }

    final gc o(ea eaVar) {
        gc d = this.b.d(eaVar.l);
        if (d != null) {
            return d;
        }
        gc gcVar = new gc(this.l, this.b, eaVar);
        gcVar.f(this.o.c.getClassLoader());
        gcVar.b = this.n;
        return gcVar;
    }

    public final List p() {
        return this.b.g();
    }

    final Set q(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((cg) arrayList.get(i)).e;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ea eaVar = ((gf) arrayList2.get(i3)).b;
                if (eaVar != null && (viewGroup = eaVar.P) != null) {
                    hashSet.add(hj.d(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void r(fx fxVar) {
        this.m.add(fxVar);
    }

    public final void s(fl flVar) {
        this.k.add(flVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [en, kop] */
    /* JADX WARN: Type inference failed for: r4v8, types: [en, owz] */
    /* JADX WARN: Type inference failed for: r4v9, types: [ado, en] */
    final void t(en enVar, ek ekVar, ea eaVar) {
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = enVar;
        this.p = ekVar;
        this.q = eaVar;
        if (eaVar != null) {
            r(new fe());
        } else if (enVar instanceof fx) {
            r(enVar);
        }
        if (this.q != null) {
            aa();
        }
        if (enVar instanceof acd) {
            aca gE = enVar.gE();
            this.e = gE;
            gE.b(eaVar != null ? eaVar : enVar, this.h);
        }
        if (eaVar != null) {
            fw fwVar = eaVar.B.y;
            fw fwVar2 = (fw) fwVar.c.get(eaVar.l);
            if (fwVar2 == null) {
                fw fwVar3 = new fw(fwVar.e);
                fwVar.c.put(eaVar.l, fwVar3);
                fwVar2 = fwVar3;
            }
            this.y = fwVar2;
        } else {
            eaVar = null;
            if (enVar instanceof lmy) {
                this.y = (fw) new lmw(enVar.S(), fw.a).a(fw.class);
            } else {
                this.y = new fw(false);
            }
        }
        fw fwVar4 = this.y;
        fwVar4.g = ai();
        this.b.d = fwVar4;
        ?? r4 = this.o;
        if ((r4 instanceof owz) && eaVar == null) {
            owv U = r4.U();
            U.b("android:support:fragments", new owu() { // from class: es
                @Override // defpackage.owu
                public final Bundle a() {
                    return fr.this.c();
                }
            });
            Bundle a = U.a("android:support:fragments");
            if (a != null) {
                V(a);
            }
        }
        ?? r42 = this.o;
        if (r42 instanceof ado) {
            adn d = r42.d();
            String concat = eaVar != null ? String.valueOf(eaVar.l).concat(":") : "";
            ael aelVar = new ael();
            ff ffVar = new ff(this);
            String concat2 = "FragmentManager:".concat(concat);
            this.s = d.b(concat2.concat("StartActivityForResult"), aelVar, ffVar);
            this.H = d.b(concat2.concat("StartIntentSenderForResult"), new fh(), new fg(this));
            this.I = d.b(concat2.concat("RequestPermissions"), new aej(), new ey(this));
        }
        ?? r43 = this.o;
        if (r43 instanceof kop) {
            r43.hv(this.C);
        }
        en enVar2 = this.o;
        if (enVar2 instanceof koq) {
            ksp kspVar = this.D;
            eg egVar = ((ef) enVar2).a;
            kspVar.getClass();
            egVar.i.add(kspVar);
        }
        en enVar3 = this.o;
        if (enVar3 instanceof gx) {
            ksp kspVar2 = this.E;
            eg egVar2 = ((ef) enVar3).a;
            kspVar2.getClass();
            egVar2.k.add(kspVar2);
        }
        en enVar4 = this.o;
        if (enVar4 instanceof gy) {
            ksp kspVar3 = this.F;
            eg egVar3 = ((ef) enVar4).a;
            kspVar3.getClass();
            egVar3.l.add(kspVar3);
        }
        en enVar5 = this.o;
        if ((enVar5 instanceof ktt) && eaVar == null) {
            fa faVar = this.O;
            eg egVar4 = ((ef) enVar5).a;
            faVar.getClass();
            ktv ktvVar = egVar4.g;
            ktvVar.b.add(faVar);
            ktvVar.a.run();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ea eaVar = this.q;
        if (eaVar != null) {
            sb.append(eaVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.q)));
            sb.append("}");
        } else {
            en enVar = this.o;
            if (enVar != null) {
                sb.append(enVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.o)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    final void u(ea eaVar) {
        if (af(2)) {
            Objects.toString(eaVar);
            Log.v("FragmentManager", "attach: ".concat(String.valueOf(eaVar)));
        }
        if (eaVar.J) {
            eaVar.J = false;
            if (eaVar.r) {
                return;
            }
            this.b.h(eaVar);
            if (af(2)) {
                Objects.toString(eaVar);
                Log.v("FragmentManager", "add from attach: ".concat(String.valueOf(eaVar)));
            }
            if (ap(eaVar)) {
                this.u = true;
            }
        }
    }

    final void v(ea eaVar) {
        if (af(2)) {
            Objects.toString(eaVar);
            Log.v("FragmentManager", "detach: ".concat(String.valueOf(eaVar)));
        }
        if (eaVar.J) {
            return;
        }
        eaVar.J = true;
        if (eaVar.r) {
            if (af(2)) {
                Objects.toString(eaVar);
                Log.v("FragmentManager", "remove from detach: ".concat(String.valueOf(eaVar)));
            }
            this.b.l(eaVar);
            if (ap(eaVar)) {
                this.u = true;
            }
            aE(eaVar);
        }
    }

    final void w() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        J(4);
    }

    final void x(Configuration configuration, boolean z) {
        if (z && (this.o instanceof kop)) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (ea eaVar : this.b.g()) {
            if (eaVar != null) {
                eaVar.onConfigurationChanged(configuration);
                if (z) {
                    eaVar.D.x(configuration, true);
                }
            }
        }
    }

    final void y() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        J(1);
    }

    final void z() {
        this.x = true;
        au(true);
        M();
        en enVar = this.o;
        if (enVar instanceof lmy ? this.b.d.f : true ^ ((Activity) enVar.c).isChangingConfigurations()) {
            Iterator it = this.j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ck) it.next()).a.iterator();
                while (it2.hasNext()) {
                    this.b.d.c((String) it2.next(), false);
                }
            }
        }
        J(-1);
        en enVar2 = this.o;
        if (enVar2 instanceof koq) {
            ksp kspVar = this.D;
            eg egVar = ((ef) enVar2).a;
            kspVar.getClass();
            egVar.i.remove(kspVar);
        }
        en enVar3 = this.o;
        if (enVar3 instanceof kop) {
            ((ef) enVar3).a.g(this.C);
        }
        en enVar4 = this.o;
        if (enVar4 instanceof gx) {
            ksp kspVar2 = this.E;
            eg egVar2 = ((ef) enVar4).a;
            kspVar2.getClass();
            egVar2.k.remove(kspVar2);
        }
        en enVar5 = this.o;
        if (enVar5 instanceof gy) {
            ksp kspVar3 = this.F;
            eg egVar3 = ((ef) enVar5).a;
            kspVar3.getClass();
            egVar3.l.remove(kspVar3);
        }
        en enVar6 = this.o;
        if ((enVar6 instanceof ktt) && this.q == null) {
            fa faVar = this.O;
            eg egVar4 = ((ef) enVar6).a;
            faVar.getClass();
            ktv ktvVar = egVar4.g;
            ktvVar.b.remove(faVar);
            if (((ktu) ktvVar.c.remove(faVar)) != null) {
                throw null;
            }
            ktvVar.a.run();
        }
        this.o = null;
        this.p = null;
        this.q = null;
        if (this.e != null) {
            this.h.f();
            this.e = null;
        }
        adg adgVar = this.s;
        if (adgVar != null) {
            adgVar.b();
            this.H.b();
            this.I.b();
        }
    }
}
