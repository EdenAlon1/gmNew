package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ea implements ComponentCallbacks, View.OnCreateContextMenuListener, lkr, lmy, lkd, owz {
    static final Object f = new Object();
    int A;
    public fr B;
    public en C;
    fr D;
    public ea E;
    public int F;
    public int G;
    public String H;
    boolean I;
    public boolean J;
    public boolean K;
    boolean L;
    boolean M;
    boolean N;
    public boolean O;
    ViewGroup P;
    public View Q;
    boolean R;
    public boolean S;
    dv T;
    boolean U;
    LayoutInflater V;
    boolean W;
    public String X;
    lkj Y;
    public lkv Z;
    gq aa;
    public llg ab;
    lms ac;
    owy ad;
    public final AtomicInteger ae;
    public final ArrayList af;
    int g;
    Bundle h;
    SparseArray i;
    Bundle j;
    Boolean k;
    String l;
    public Bundle m;
    ea n;
    String o;
    public int p;
    public Boolean q;
    boolean r;
    public boolean s;
    private int sD;
    private final dx sE;
    boolean t;
    boolean u;
    boolean v;
    public boolean w;
    boolean x;
    boolean y;
    boolean z;

    public ea() {
        this.g = -1;
        this.l = UUID.randomUUID().toString();
        this.o = null;
        this.q = null;
        this.D = new fs();
        this.N = true;
        this.S = true;
        this.Y = lkj.RESUMED;
        this.ab = new llg();
        this.ae = new AtomicInteger();
        this.af = new ArrayList();
        this.sE = new dq(this);
        e();
    }

    private final void e() {
        this.Z = new lkv(this);
        this.ad = owx.a(this);
        this.ac = null;
        if (this.af.contains(this.sE)) {
            return;
        }
        f(this.sE);
    }

    private final int eU() {
        lkj lkjVar = this.Y;
        return (lkjVar == lkj.INITIALIZED || this.E == null) ? lkjVar.ordinal() : Math.min(lkjVar.ordinal(), this.E.eU());
    }

    private final void f(dx dxVar) {
        if (this.g >= 0) {
            dxVar.a();
        } else {
            this.af.add(dxVar);
        }
    }

    @Deprecated
    public static ea fd(Context context, String str, Bundle bundle) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            int i = em.a;
            try {
                ea eaVar = (ea) em.a(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
                if (bundle != null) {
                    bundle.setClassLoader(eaVar.getClass().getClassLoader());
                    eaVar.at(bundle);
                }
                return eaVar;
            } catch (ClassCastException e) {
                throw new dw("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
            } catch (ClassNotFoundException e2) {
                throw new dw("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
            }
        } catch (IllegalAccessException e3) {
            throw new dw(a.a(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new dw(a.a(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new dw(a.a(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new dw(a.a(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e6);
        }
    }

    private final ea hd(boolean z) {
        String str;
        if (z) {
            int i = lin.a;
            lir lirVar = new lir(this);
            lin.d(lirVar);
            lim b = lin.b(this);
            if (b.b.contains(lil.DETECT_TARGET_FRAGMENT_USAGE) && lin.e(b, getClass(), lirVar.getClass())) {
                lin.c(b, lirVar);
            }
        }
        ea eaVar = this.n;
        if (eaVar != null) {
            return eaVar;
        }
        fr frVar = this.B;
        if (frVar == null || (str = this.o) == null) {
            return null;
        }
        return frVar.e(str);
    }

    public final Context A() {
        Context z = z();
        if (z != null) {
            return z;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " not attached to a context."));
    }

    public final Resources B() {
        return A().getResources();
    }

    public final Bundle C() {
        Bundle bundle = this.m;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " does not have any arguments."));
    }

    public final dv D() {
        if (this.T == null) {
            this.T = new dv();
        }
        return this.T;
    }

    @Deprecated
    public final ea E() {
        return hd(true);
    }

    public final eg G() {
        en enVar = this.C;
        if (enVar == null) {
            return null;
        }
        return (eg) enVar.b;
    }

    public final fr I() {
        if (this.C != null) {
            return this.D;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " has not been attached yet."));
    }

    public final fr J() {
        fr frVar = this.B;
        if (frVar != null) {
            return frVar;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " not associated with a fragment manager."));
    }

    public final LayoutInflater K() {
        LayoutInflater layoutInflater = this.V;
        return layoutInflater == null ? L(null) : layoutInflater;
    }

    final LayoutInflater L(Bundle bundle) {
        LayoutInflater gI = gI(bundle);
        this.V = gI;
        return gI;
    }

    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.sD;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public final View N() {
        View view = this.Q;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final adg O(adu aduVar, adf adfVar) {
        dt dtVar = new dt(this);
        if (this.g > 1) {
            throw new IllegalStateException(a.i(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        f(new du(this, dtVar, atomicReference, aduVar, adfVar));
        return new dp(atomicReference);
    }

    public lkk P() {
        return this.Z;
    }

    public final lkr Q() {
        gq gqVar = this.aa;
        if (gqVar != null) {
            return gqVar;
        }
        throw new IllegalStateException(a.i(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public lms R() {
        Application application;
        if (this.B == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.ac == null) {
            Context applicationContext = A().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && fr.af(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + A().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.ac = new lmg(application, this, this.m);
        }
        return this.ac;
    }

    @Override // defpackage.lmy
    public final lmx S() {
        if (this.B == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (eU() == lkj.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        fw fwVar = this.B.y;
        lmx lmxVar = (lmx) fwVar.d.get(this.l);
        if (lmxVar != null) {
            return lmxVar;
        }
        lmx lmxVar2 = new lmx();
        fwVar.d.put(this.l, lmxVar2);
        return lmxVar2;
    }

    public lnx T() {
        Application application;
        Context applicationContext = A().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && fr.af(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + A().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        loa loaVar = new loa();
        if (application != null) {
            loaVar.b(lmp.b, application);
        }
        loaVar.b(lmc.a, this);
        loaVar.b(lmc.b, this);
        Bundle bundle = this.m;
        if (bundle != null) {
            loaVar.b(lmc.c, bundle);
        }
        return loaVar;
    }

    @Override // defpackage.owz
    public final owv U() {
        return this.ad.a;
    }

    public final Object V() {
        dv dvVar = this.T;
        if (dvVar == null) {
            return null;
        }
        return dvVar.i;
    }

    public final Object W() {
        dv dvVar = this.T;
        if (dvVar == null) {
            return null;
        }
        return dvVar.k;
    }

    public final Object X() {
        en enVar = this.C;
        if (enVar == null) {
            return null;
        }
        return ((ef) enVar).a;
    }

    public final String Y(int i) {
        return B().getString(i);
    }

    public final String Z(int i, Object... objArr) {
        return B().getString(i, objArr);
    }

    @Deprecated
    public void aA(boolean z) {
        int i = lin.a;
        lit litVar = new lit(this);
        lin.d(litVar);
        lim b = lin.b(this);
        if (b.b.contains(lil.DETECT_RETAIN_INSTANCE_USAGE) && lin.e(b, getClass(), litVar.getClass())) {
            lin.c(b, litVar);
        }
        this.K = z;
        fr frVar = this.B;
        if (frVar == null) {
            this.L = true;
        } else if (z) {
            frVar.y.a(this);
        } else {
            frVar.y.e(this);
        }
    }

    final void aB(ArrayList arrayList, ArrayList arrayList2) {
        D();
        dv dvVar = this.T;
        dvVar.g = arrayList;
        dvVar.h = arrayList2;
    }

    @Deprecated
    public void aC(boolean z) {
        fr frVar;
        int i = lin.a;
        liv livVar = new liv(this, z);
        lin.d(livVar);
        lim b = lin.b(this);
        if (b.b.contains(lil.DETECT_SET_USER_VISIBLE_HINT) && lin.e(b, getClass(), livVar.getClass())) {
            lin.c(b, livVar);
        }
        if (!this.S && z && this.g < 5 && (frVar = this.B) != null && aF() && this.W) {
            frVar.S(frVar.o(this));
        }
        this.S = z;
        boolean z2 = false;
        if (this.g < 5 && !z) {
            z2 = true;
        }
        this.R = z2;
        if (this.h != null) {
            this.k = Boolean.valueOf(z);
        }
    }

    public void aD(Intent intent) {
        aQ(intent);
    }

    final boolean aE() {
        dv dvVar = this.T;
        if (dvVar == null) {
            return false;
        }
        return dvVar.a;
    }

    public final boolean aF() {
        return this.C != null && this.r;
    }

    public final boolean aG() {
        ea eaVar;
        if (this.I) {
            return true;
        }
        return (this.B == null || (eaVar = this.E) == null || !eaVar.aG()) ? false : true;
    }

    final boolean aH() {
        return this.A > 0;
    }

    public final boolean aI() {
        return this.g >= 7;
    }

    public final boolean aJ() {
        fr frVar = this.B;
        if (frVar == null) {
            return false;
        }
        return frVar.ai();
    }

    public final boolean aK() {
        View view;
        return (!aF() || aG() || (view = this.Q) == null || view.getWindowToken() == null || this.Q.getVisibility() != 0) ? false : true;
    }

    public boolean aL(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public boolean aM(MenuItem menuItem) {
        return false;
    }

    public final boolean aN(String str) {
        en enVar = this.C;
        if (enVar != null) {
            return klg.b(((ef) enVar).a, str);
        }
        return false;
    }

    @Deprecated
    public final LayoutInflater aO() {
        en enVar = this.C;
        if (enVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        eg egVar = ((ef) enVar).a;
        LayoutInflater cloneInContext = egVar.getLayoutInflater().cloneInContext(egVar);
        cloneInContext.setFactory2(this.D.d);
        return cloneInContext;
    }

    @Deprecated
    public final void aP(ea eaVar) {
        int i = lin.a;
        liu liuVar = new liu(this, eaVar);
        lin.d(liuVar);
        lim b = lin.b(this);
        if (b.b.contains(lil.DETECT_TARGET_FRAGMENT_USAGE) && lin.e(b, getClass(), liuVar.getClass())) {
            lin.c(b, liuVar);
        }
        fr frVar = this.B;
        fr frVar2 = eaVar.B;
        if (frVar != null && frVar2 != null && frVar != frVar2) {
            throw new IllegalArgumentException(a.i(eaVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (ea eaVar2 = eaVar; eaVar2 != null; eaVar2 = eaVar2.hd(false)) {
            if (eaVar2.equals(this)) {
                throw new IllegalArgumentException(a.k(this, eaVar, "Setting ", " as the target of ", " would create a target cycle"));
            }
        }
        if (this.B == null || eaVar.B == null) {
            this.o = null;
            this.n = eaVar;
        } else {
            this.o = eaVar.l;
            this.n = null;
        }
        this.p = 0;
    }

    public void aQ(Intent intent) {
        en enVar = this.C;
        if (enVar == null) {
            throw new IllegalStateException(a.i(this, "Fragment ", " not attached to Activity"));
        }
        enVar.i(intent, -1);
    }

    final ArrayList aa() {
        ArrayList arrayList;
        dv dvVar = this.T;
        return (dvVar == null || (arrayList = dvVar.g) == null) ? new ArrayList() : arrayList;
    }

    final ArrayList ab() {
        ArrayList arrayList;
        dv dvVar = this.T;
        return (dvVar == null || (arrayList = dvVar.h) == null) ? new ArrayList() : arrayList;
    }

    public void ac(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.G));
        printWriter.print(" mTag=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.g);
        printWriter.print(" mWho=");
        printWriter.print(this.l);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.r);
        printWriter.print(" mRemoving=");
        printWriter.print(this.s);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.v);
        printWriter.print(" mInLayout=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.I);
        printWriter.print(" mDetached=");
        printWriter.print(this.J);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.N);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.M);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.K);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.S);
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.B);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.C);
        }
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.E);
        }
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.m);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.h);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.i);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.j);
        }
        ea hd = hd(false);
        if (hd != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(hd);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(aE());
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(u());
        }
        if (v() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(v());
        }
        if (w() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(w());
        }
        if (x() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(x());
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.P);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.Q);
        }
        if (z() != null) {
            loo.a(this).d(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.D + ":");
        this.D.L(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    final void ad() {
        e();
        this.X = this.l;
        this.l = UUID.randomUUID().toString();
        this.r = false;
        this.s = false;
        this.v = false;
        this.w = false;
        this.y = false;
        this.A = 0;
        this.B = null;
        this.D = new fs();
        this.C = null;
        this.F = 0;
        this.G = 0;
        this.H = null;
        this.I = false;
        this.J = false;
    }

    @Deprecated
    public void ae(Bundle bundle) {
        this.O = true;
    }

    @Deprecated
    public void af(int i, int i2, Intent intent) {
        if (fr.af(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @Deprecated
    public void ag(Activity activity) {
        this.O = true;
    }

    public void ai() {
        this.O = true;
    }

    @Deprecated
    public void aj(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.O = true;
    }

    public void ak(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.O = true;
        en enVar = this.C;
        Activity activity = enVar == null ? null : enVar.b;
        if (activity != null) {
            this.O = false;
            aj(activity, attributeSet, bundle);
        }
    }

    public void am() {
        this.O = true;
    }

    public void ao() {
        this.O = true;
    }

    final void aq() {
        Bundle bundle = this.h;
        ap(this.Q, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.D.J(2);
    }

    final void ar() {
        Bundle bundle;
        Bundle bundle2 = this.h;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.D.V(bundle);
        this.D.y();
    }

    final void as(int i, int i2, int i3, int i4) {
        if (this.T == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        D().b = i;
        D().c = i2;
        D().d = i3;
        D().e = i4;
    }

    public void at(Bundle bundle) {
        if (this.B != null && aJ()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.m = bundle;
    }

    final void au(View view) {
        D().o = view;
    }

    @Deprecated
    public final void av(boolean z) {
        if (this.M != z) {
            this.M = z;
            if (!aF() || aG()) {
                return;
            }
            this.C.f();
        }
    }

    public final void aw(dz dzVar) {
        Bundle bundle;
        if (this.B != null) {
            throw new IllegalStateException("Fragment already added");
        }
        Bundle bundle2 = null;
        if (dzVar != null && (bundle = dzVar.a) != null) {
            bundle2 = bundle;
        }
        this.h = bundle2;
    }

    public final void ax(boolean z) {
        if (this.N != z) {
            this.N = z;
            if (this.M && aF() && !aG()) {
                this.C.f();
            }
        }
    }

    final void ay(int i) {
        if (this.T == null && i == 0) {
            return;
        }
        D();
        this.T.f = i;
    }

    final void az(boolean z) {
        if (this.T == null) {
            return;
        }
        D().a = z;
    }

    public final eg fe() {
        eg G = G();
        if (G != null) {
            return G;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " not attached to an activity."));
    }

    public void g(Context context) {
        this.O = true;
        en enVar = this.C;
        Activity activity = enVar == null ? null : enVar.b;
        if (activity != null) {
            this.O = false;
            ag(activity);
        }
    }

    public LayoutInflater gI(Bundle bundle) {
        return aO();
    }

    public final Bundle getArguments() {
        return this.m;
    }

    public ek gn() {
        return new dr(this);
    }

    public void h(Bundle bundle) {
        this.O = true;
        ar();
        fr frVar = this.D;
        if (frVar.n > 0) {
            return;
        }
        frVar.y();
    }

    public void i() {
        this.O = true;
    }

    public void j() {
        this.O = true;
    }

    public void l() {
        this.O = true;
    }

    public void m() {
        this.O = true;
    }

    public void n(Bundle bundle) {
        this.O = true;
    }

    public void o(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.D.noteStateNotSaved();
        this.z = true;
        this.aa = new gq(this, S(), new Runnable() { // from class: do
            @Override // java.lang.Runnable
            public final void run() {
                ea eaVar = ea.this;
                gq gqVar = eaVar.aa;
                gqVar.b.b(eaVar.j);
                eaVar.j = null;
            }
        });
        View M = M(layoutInflater, viewGroup, bundle);
        this.Q = M;
        if (M == null) {
            if (this.aa.a != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.aa = null;
            return;
        }
        this.aa.b();
        if (fr.af(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.Q + " for Fragment " + this);
        }
        lmz.b(this.Q, this.aa);
        lna.b(this.Q, this.aa);
        oxa.b(this.Q, this.aa);
        this.ab.m(this.aa);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.O = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        fe().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.O = true;
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i) {
        if (this.C == null) {
            throw new IllegalStateException(a.i(this, "Fragment ", " not attached to Activity"));
        }
        fr J = J();
        if (J.s == null) {
            J.o.i(intent, i);
            return;
        }
        J.t.addLast(new fk(this.l, i));
        J.s.c(intent);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.l);
        if (this.F != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.F));
        }
        if (this.H != null) {
            sb.append(" tag=");
            sb.append(this.H);
        }
        sb.append(")");
        return sb.toString();
    }

    final int u() {
        dv dvVar = this.T;
        if (dvVar == null) {
            return 0;
        }
        return dvVar.b;
    }

    final int v() {
        dv dvVar = this.T;
        if (dvVar == null) {
            return 0;
        }
        return dvVar.c;
    }

    final int w() {
        dv dvVar = this.T;
        if (dvVar == null) {
            return 0;
        }
        return dvVar.d;
    }

    final int x() {
        dv dvVar = this.T;
        if (dvVar == null) {
            return 0;
        }
        return dvVar.e;
    }

    public Animator y(int i, boolean z, int i2) {
        return null;
    }

    public Context z() {
        en enVar = this.C;
        if (enVar == null) {
            return null;
        }
        return enVar.c;
    }

    public ea(int i) {
        this();
        this.sD = i;
    }

    @Deprecated
    public void aS() {
    }

    public void al(boolean z) {
    }

    @Deprecated
    public void an(Menu menu) {
    }

    public void k(Bundle bundle) {
    }

    public void aR(int i, int i2) {
    }

    @Deprecated
    public void ah(Menu menu, MenuInflater menuInflater) {
    }

    public void ap(View view, Bundle bundle) {
    }
}
