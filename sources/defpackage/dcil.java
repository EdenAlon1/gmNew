package defpackage;

import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.ui.common.BugleSearchView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifBrowserActivity;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcil extends dcim implements emct, dcjb, dciq, xl {
    public final GifBrowserActivity a;
    public final errl b;
    public final ffbr c;
    public final emcu d;
    public final emcs e;
    public final ffbr f;
    public final dede g;
    public final dcip h;
    public dcin i;
    public dcio j;
    public RecyclerView k;
    public RecyclerView l;
    public ProgressBar m;
    public iv n;
    public ImageView o;
    public ImageView p;
    public BugleSearchView q;
    public String r;
    public boolean s;
    public String t;
    private final errl w;
    private final csjk x;
    public int u = 1;
    private boolean y = true;

    public dcil(GifBrowserActivity gifBrowserActivity, errl errlVar, errl errlVar2, ffbr ffbrVar, emcu emcuVar, emcs emcsVar, ffbr ffbrVar2, csjk csjkVar, dede dedeVar, dcip dcipVar) {
        this.a = gifBrowserActivity;
        this.b = errlVar;
        this.w = errlVar2;
        this.c = ffbrVar;
        this.d = emcuVar;
        this.e = emcsVar;
        this.f = ffbrVar2;
        this.x = csjkVar;
        this.g = dedeVar;
        this.h = dcipVar;
    }

    public static int c(Configuration configuration) {
        return configuration.orientation == 2 ? 3 : 2;
    }

    private final boolean o(String str) {
        g(true);
        this.t = str;
        if (!TextUtils.isEmpty(str) || !((Boolean) cful.d.e()).booleanValue()) {
            k(this.t);
            return true;
        }
        f();
        k(null);
        return false;
    }

    @Override // defpackage.xl
    public final boolean a(String str) {
        if (o(str)) {
            this.e.a(str);
        }
        this.g.i(this.a, this.q);
        return true;
    }

    @Override // defpackage.xl
    public final void b(String str) {
        BugleSearchView bugleSearchView;
        if (o(str)) {
            this.e.b(str);
        }
        ImageView imageView = this.o;
        if (imageView != null && (bugleSearchView = this.q) != null) {
            imageView.setVisibility(true != TextUtils.isEmpty(bugleSearchView.getQuery().toString()) ? 0 : 8);
        }
        if (this.u != 4 || this.y) {
            this.y = false;
            this.u = 4;
            ((altk) this.c.b()).aB(3, this.u, 1);
        }
    }

    public final void d(String str) {
        g(true);
        if (this.q != null) {
            h(true);
        }
        if (TextUtils.isEmpty(str)) {
            f();
        } else {
            this.u = 3;
            this.t = str;
            j();
            this.e.a(str);
        }
        k(str);
    }

    public final void e(eptk eptkVar) {
        this.a.O(eptkVar);
        this.a.finish();
    }

    public final void f() {
        this.u = 2;
        erqt.r(this.b.submit(new Callable() { // from class: dcic
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object apply;
                cswe csweVar = (cswe) dcil.this.f.b();
                ekzz f = eleg.f("GifDatabaseOperations#getRecentGifs");
                try {
                    csix.h();
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = bxad.a;
                    bwzy bwzyVar = new bwzy(bxad.a);
                    bwzyVar.z("getRecentGifs");
                    apply = new Function() { // from class: cswc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bxac bxacVar = (bxac) obj;
                            bxacVar.aq(new dtrx("recent_gifs.content_uri", 6));
                            return bxacVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }.apply(new bxac());
                    bwzyVar.k(new bxab((bxac) apply));
                    bwzyVar.c(new bwzv(bxad.b.g, false));
                    bwzi bwziVar = (bwzi) bwzyVar.b().o();
                    while (bwziVar.moveToNext()) {
                        try {
                            final bwyo bwyoVar = (bwyo) bwziVar.cO();
                            if (cbgi.i(bwyoVar.k(), csweVar.a).exists()) {
                                arrayList.add((bwyo) bwziVar.cO());
                            } else {
                                ekzz f2 = eleg.f("GifDatabaseOperations#deleteRecentGif");
                                try {
                                    bwzs bwzsVar = new bwzs();
                                    bwzsVar.f("deleteRecentGif");
                                    bwzsVar.a(new Function() { // from class: csvz
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            bxac bxacVar = (bxac) obj;
                                            bxacVar.b(bwyo.this.l());
                                            return bxacVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bwzsVar.d();
                                    f2.close();
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                    bwziVar.close();
                    f.close();
                    return arrayList;
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }), axou.a(new dcij(this)), this.w);
    }

    public final void g(boolean z) {
        this.m.setVisibility(true != z ? 8 : 0);
    }

    public final void h(boolean z) {
        BugleSearchView bugleSearchView = this.q;
        if (bugleSearchView == null) {
            return;
        }
        bugleSearchView.setOnQueryTextListener(true == z ? null : this);
        if (z) {
            bugleSearchView.setQuery(null, false);
        }
        bugleSearchView.setIconified(z);
    }

    public final void i() {
        d(this.j.a.b(1).b);
        ((altk) this.c.b()).aB(6, this.u, n());
    }

    public final void j() {
        if ((((Boolean) cful.d.e()).booleanValue() && this.u == 2) || ((Boolean) dcji.a.e()).booleanValue()) {
            return;
        }
        erqt.r(((csmz) this.x.a()).i(), axou.a(new dcik(this)), this.w);
    }

    public final boolean k(String str) {
        dcio dcioVar = this.j;
        Integer num = (Integer) dcioVar.a.a.get(emxe.b(str).toLowerCase(Locale.US));
        int intValue = num != null ? num.intValue() : -1;
        int i = dcioVar.d;
        if (intValue != i) {
            if (i >= 0) {
                dcioVar.q(i);
            }
            dcioVar.d = intValue;
            if (intValue >= 0) {
                dcioVar.q(intValue);
            }
        }
        boolean z = dcioVar.d >= 0;
        this.l.ak(this.j.d);
        return z;
    }

    public final int n() {
        dcio dcioVar = this.j;
        if (dcioVar == null || this.u != 3) {
            return 1;
        }
        return dcioVar.m();
    }
}
