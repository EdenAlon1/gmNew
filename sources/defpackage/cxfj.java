package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import cxfr.a;
import defpackage.fbal;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxfj extends cwwo implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    private cxfr a;
    private boolean ah;
    private Context d;
    private final lkv e = new lkv(this);
    private final ells ag = new ells();

    @Deprecated
    public cxfj() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cxfr.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ejuh cxfhVar;
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            cxfr H = H();
            int b = ehdr.b(viewGroup, R.attr.colorOnSurface);
            int b2 = ehdr.b(viewGroup, R.attr.colorPrimaryBackground);
            int b3 = ehdr.b(viewGroup, R.attr.colorOnPrimaryBrandIcon);
            int b4 = ehdr.b(viewGroup, R.attr.colorPrimaryBrandIcon);
            View inflate = layoutInflater.inflate(R.layout.sim_messages_list_v2, viewGroup, false);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(android.R.id.list);
            inflate.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            recyclerView.ap(linearLayoutManager);
            recyclerView.w(new tb(inflate.getContext(), linearLayoutManager.k));
            emwn emwnVar = new emwn(new cxfl(H, layoutInflater, b4, b3, b2, b));
            cxfm cxfmVar = new cxfm();
            emwm emwmVar = new emwm(cxfmVar, emwg.a);
            ejzg ejzgVar = new ejzg();
            emxf.m(true, "DataDiffer was provided without a StableIdFunction or Equivalence.");
            H.m = new ejzi(emwnVar, cxfmVar, emwmVar, ejzgVar, new ejzd());
            recyclerView.am(H.m);
            TextView textView = (TextView) inflate.findViewById(R.id.no_sim_message);
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.sim_messages_loading);
            progressBar.getClass();
            progressBar.setVisibility(0);
            ejwl ejwlVar = (ejwl) H.e.b();
            final cxfi cxfiVar = (cxfi) H.d.b();
            final int i = H.k;
            if (ctid.d) {
                Uri uri = cxfi.a;
                if (i != -1) {
                    uri = new Uri.Builder().scheme("content").authority("sms").appendPath("icc_subId").appendPath(String.valueOf(i)).build();
                }
                final emwl emwlVar = new emwl() { // from class: cxeu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Cursor cursor = (Cursor) obj;
                        int length = cxfi.b.length;
                        int[] iArr = new int[4];
                        for (int i2 = 0; i2 < 4; i2++) {
                            iArr[i2] = cursor.getColumnIndex(cxfi.b[i2]);
                        }
                        int i3 = i;
                        cxfi cxfiVar2 = cxfi.this;
                        cwug cwugVar = new cwug();
                        cwugVar.b = ((aolr) cxfiVar2.h.b()).u(cursor.getString(iArr[0]), i3);
                        cwugVar.a = cursor.getString(iArr[1]);
                        cwugVar.c = cxfiVar2.a(cursor.getLong(iArr[2]));
                        cwugVar.c(cursor.getInt(iArr[3]));
                        cwugVar.b(cursor.getPosition());
                        return cwugVar.a();
                    }
                };
                cxfhVar = new ejuu(new ejto(cxfiVar.d, uri, new String[0]), new emwl() { // from class: ejtl
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Cursor cursor = (Cursor) obj;
                        ArrayList arrayList = new ArrayList(cursor.getCount());
                        if (cursor.moveToFirst()) {
                            do {
                                arrayList.add(emwl.this.apply(cursor));
                            } while (cursor.moveToNext());
                        }
                        return arrayList;
                    }
                }, cxfiVar.g);
            } else {
                cxfhVar = new cxfh(cxfiVar, i);
            }
            ejwlVar.b(cxfhVar, new cxfn(H, progressBar, textView));
            if (inflate == null) {
                cxft.a(this, H());
            }
            ekyf.q();
            return inflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ae(Bundle bundle) {
        this.c.k();
        try {
            aU(bundle);
            H().c.av(true);
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

    @Override // defpackage.cwwo, defpackage.efaf, defpackage.ea
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
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            ellg.b(this).b = view;
            H();
            cxft.a(this, H());
            bm(view, bundle);
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

    @Override // defpackage.cwwo
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

    @Override // defpackage.ellr
    public final elli e(ellf ellfVar) {
        return this.ag.a(ellfVar);
    }

    @Override // defpackage.ellr
    public final void f(Class cls, ellh ellhVar) {
        this.ag.b(cls, ellhVar);
    }

    @Override // defpackage.cwwo, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof cxfj)) {
                        throw new IllegalStateException(a.J(eaVar, cxfr.class));
                    }
                    cxfj cxfjVar = (cxfj) eaVar;
                    fbbf fbbfVar = ((akgt) aX).aD;
                    fbbf fbbfVar2 = ((akgt) aX).k;
                    fbbf fbbfVar3 = ((akgt) aX).l;
                    akis akisVar = ((akgt) aX).a;
                    akko akkoVar = akisVar.b;
                    fbbf fbbfVar4 = akkoVar.oJ;
                    akkp akkpVar = akisVar.a;
                    this.a = new cxfr(cxfjVar, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, akkpVar.nk, akkpVar.Df, akkoVar.pl, ((akgt) aX).L());
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            cxfr H = H();
            H.n = -1;
            H.o = H.new a();
            ((ejlq) H.f.b()).k(H.o);
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
            this.ah = true;
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

    @Override // defpackage.ekhu
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final cxfr H() {
        cxfr cxfrVar = this.a;
        if (cxfrVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cxfrVar;
    }

    @Override // defpackage.cwwo, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
