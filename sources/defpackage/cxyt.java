package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.fbal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxyt extends cyaj implements ekhu, fbas, ekhq, ekkk, elar {
    private cxze a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public cxyt() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cxze.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final cxze H = H();
            if (bundle != null) {
                H.j = bdgq.b(bundle.getString("conversationIdKey"));
                H.l = bundle.getInt("topPaddingKey");
            }
            if (H.i != cxyw.CONVERSATION_DETAILS) {
                viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: cxyy
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        entd entdVar = cxze.a;
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        layoutParams.height = view.getResources().getDisplayMetrics().heightPixels;
                        view.setLayoutParams(layoutParams);
                    }
                });
            }
            H.k = new FrameLayout(H.e.z());
            H.e(H.l);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            H.k.setLayoutParams(layoutParams);
            H.k.setClipChildren(false);
            H.k.setClipToPadding(false);
            if (H.b().b()) {
                H.k.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: cxyz
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        cxze.this.k.setTranslationY(windowInsets.getSystemWindowInsetTop());
                        return windowInsets;
                    }
                });
            }
            H.k.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: cxza
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (view.getHeight() == i8 - i6) {
                        return;
                    }
                    cxze cxzeVar = cxze.this;
                    int width = cxzeVar.k.getWidth();
                    ViewGroup viewGroup2 = cxzeVar.k;
                    ellj.f(new cxyc(width, viewGroup2 == null ? 0 : viewGroup2.getHeight() - cxzeVar.l), cxzeVar.e);
                }
            });
            for (Map.Entry entry : H.c.entrySet()) {
                H.a((cxyl) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
            Iterator it = H.b.keySet().iterator();
            while (it.hasNext()) {
                ((cxyl) it.next()).l();
            }
            ViewGroup viewGroup2 = H.k;
            ekyf.q();
            return viewGroup2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cxze H() {
        cxze cxzeVar = this.a;
        if (cxzeVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cxzeVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.d == null) {
            this.d = new ekkn(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.cyaj, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ai() {
        elav b = this.c.b();
        try {
            ba();
            cxze H = H();
            H.g.a = null;
            Iterator it = H.b.keySet().iterator();
            while (it.hasNext()) {
                ((cxyl) it.next()).i();
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.cyaj
    protected final /* synthetic */ fbae b() {
        return new ekku(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.cyaj, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof cxyt)) {
                        throw new IllegalStateException(a.J(eaVar, cxze.class));
                    }
                    cxyt cxytVar = (cxyt) eaVar;
                    enhk m = enhk.m(cxyw.CONVERSATION, (engw) ((akgt) aX).aZ.b(), cxyw.CONVERSATION_DETAILS, (engw) ((akgt) aX).ba.b());
                    cxzh cxzhVar = (cxzh) ((akgt) aX).c.y.b();
                    enhk m2 = enhk.m(cxyw.CONVERSATION, new cxxw(true, true), cxyw.CONVERSATION_DETAILS, new cxxw(false, false));
                    fbbf fbbfVar = ((akgt) aX).a.a.f;
                    Bundle a = ((akgt) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgt) aX).a.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    cxyx cxyxVar = (cxyx) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", cxyx.a, eyfcVar);
                    cxyxVar.getClass();
                    cxze cxzeVar = new cxze(cxytVar, m, cxzhVar, m2, fbbfVar, cxyxVar);
                    this.a = cxzeVar;
                    cxzeVar.q = this;
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new fbal.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            cxze H = H();
            H.g.a = H;
            engw engwVar = (engw) H.f.get(H.i);
            engwVar.getClass();
            int size = engwVar.size();
            for (int i = 0; i < size; i++) {
                cxyf cxyfVar = (cxyf) engwVar.get(i);
                cxyl a = cxyfVar.b().a(H, H.j, H.i);
                String str = ((cxxy) a.d()).a;
                if (bundle == null && !H.d.containsKey(str)) {
                    H.d.put(str, Boolean.valueOf(((cxxy) a.d()).b));
                } else if (bundle != null && bundle.containsKey(str)) {
                    H.d.put(str, Boolean.valueOf(bundle.getBoolean(str)));
                }
                if (bundle != null ? bundle.getBoolean(str, ((cxxy) a.d()).b) : ((cxxy) a.d()).b) {
                    a.k();
                    HashMap hashMap = H.b;
                    cxyi a2 = cxyfVar.a();
                    cxya cxyaVar = new cxya();
                    cxyaVar.b = 1;
                    cxyaVar.a = a2;
                    cxyaVar.b(false);
                    hashMap.put(a, cxyaVar.a());
                }
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ag = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bj(bundle);
            cxze H = H();
            bundle.putString("conversationIdKey", H.j.a());
            bundle.putInt("topPaddingKey", H.l);
            for (Map.Entry entry : H.d.entrySet()) {
                bundle.putBoolean((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cyaj, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
