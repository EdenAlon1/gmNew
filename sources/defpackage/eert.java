package defpackage;

import android.content.Context;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eert implements eere, eeuu {
    public final Context a;
    public final errl b;
    public final emyl c;
    public final emxc d;
    public final emxc e;
    public final eeuj f;
    public final eeut g;
    public final eesb h;
    private final eumd i;
    private final emyl j;
    private final emyl k;

    public eert(Context context, errl errlVar, eumd eumdVar, final emyl emylVar, String str, eesb eesbVar, eeuj eeujVar, eeuw eeuwVar, Uri uri, emyl emylVar2) {
        this.a = context;
        this.b = errlVar;
        this.i = eumdVar;
        this.k = emylVar2;
        final ArrayList arrayList = new ArrayList();
        febo feboVar = new febo();
        febf febfVar = febo.c;
        int i = febj.d;
        feboVar.g(new febe("X-Goog-Api-Key", febfVar), str);
        arrayList.add(new ffaw(feboVar));
        this.j = emylVar;
        this.c = emys.a(new emyl() { // from class: eern
            @Override // defpackage.emyl
            public final Object get() {
                return (ewnv) ewnv.h(new ewnu(), fdxr.a((fdxk) emyl.this.get(), arrayList));
            }
        });
        this.h = eesbVar;
        this.f = eeujVar;
        this.g = new eeut(this);
        this.d = emxc.i(eeuwVar);
        this.e = uri != null ? emxc.j(uri.buildUpon().appendQueryParameter("key", str).appendQueryParameter("alt", "proto").build()) : emux.a;
    }

    private final ListenableFuture u() {
        ListenableFuture a;
        eeut eeutVar = this.g;
        synchronized (eeutVar.b) {
            if (eeutVar.d == null) {
                eeut.b();
            }
            a = eeutVar.d.a();
        }
        return a;
    }

    @Override // defpackage.eere
    public final eeui a() {
        return this.f;
    }

    @Override // defpackage.eere
    public final ListenableFuture b() {
        return erny.f(u(), new emwl() { // from class: eeri
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                ArrayList arrayList = new ArrayList();
                for (String str : eert.this.h.a()) {
                    if (linkedHashMap.containsKey(str)) {
                        arrayList.add((ewnp) linkedHashMap.get(str));
                    }
                }
                return arrayList;
            }
        }, this.b);
    }

    @Override // defpackage.eere
    public final ListenableFuture c(final String str) {
        return erny.f(u(), new emwl() { // from class: eerk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                String str2 = str;
                if (linkedHashMap.containsKey(str2)) {
                    return (ewnp) linkedHashMap.get(str2);
                }
                throw new NoSuchElementException(a.a(str2, "Sticker pack ", " not found."));
            }
        }, erpp.a);
    }

    @Override // defpackage.eere
    public final ListenableFuture d() {
        return erny.f(u(), new emwl() { // from class: eerg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new ArrayList(((LinkedHashMap) obj).values());
            }
        }, erpp.a);
    }

    @Override // defpackage.eere
    public final ListenableFuture e(final String str) {
        return erny.f(c(eerv.c(str)), new emwl() { // from class: eerp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str2;
                ewnk ewnkVar;
                Iterator<E> it = ((ewnp) obj).h.iterator();
                do {
                    str2 = str;
                    if (!it.hasNext()) {
                        throw new NoSuchElementException(a.a(str2, "Sticker ", " not found."));
                    }
                    ewnkVar = (ewnk) it.next();
                } while (!str2.equals(ewnkVar.c));
                return ewnkVar;
            }
        }, erpp.a);
    }

    @Override // defpackage.eere
    public final ListenableFuture f(final String str) {
        eeut eeutVar = this.g;
        synchronized (eeutVar.b) {
            if (eeutVar.d == null) {
                eeut.b();
            }
        }
        String a = this.g.a();
        ListenableFuture n = erqt.n(new erog() { // from class: eerj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ewnm ewnmVar;
                Locale locale;
                ewnf ewnfVar = (ewnf) ewng.a.createBuilder();
                ewnd ewndVar = (ewnd) ewne.a.createBuilder();
                ewndVar.copyOnWrite();
                ewne ewneVar = (ewne) ewndVar.instance;
                String str2 = str;
                str2.getClass();
                ewneVar.b = str2;
                ewnfVar.copyOnWrite();
                ewng ewngVar = (ewng) ewnfVar.instance;
                ewne ewneVar2 = (ewne) ewndVar.build();
                ewneVar2.getClass();
                ewngVar.d = ewneVar2;
                ewngVar.b |= 2;
                eert eertVar = eert.this;
                eeut eeutVar2 = eertVar.g;
                String a2 = eeutVar2.a();
                synchronized (eeutVar2.b) {
                    eeuq eeuqVar = eeutVar2.d;
                    ewnmVar = null;
                    locale = eeuqVar == null ? null : eeuqVar.d;
                }
                eeut eeutVar3 = eertVar.g;
                synchronized (eeutVar3.b) {
                    eeuq eeuqVar2 = eeutVar3.d;
                    if (eeuqVar2 != null) {
                        ewnmVar = eeuqVar2.f;
                    }
                }
                ewny ewnyVar = (ewny) eertVar.r(a2, locale, ewnmVar).build();
                ewnfVar.copyOnWrite();
                ewng ewngVar2 = (ewng) ewnfVar.instance;
                ewnyVar.getClass();
                ewngVar2.c = ewnyVar;
                ewngVar2.b |= 1;
                ewng ewngVar3 = (ewng) ewnfVar.build();
                eertVar.t();
                ewnv ewnvVar = (ewnv) eertVar.c.get();
                fdxk fdxkVar = ewnvVar.a;
                febs febsVar = ewnw.b;
                if (febsVar == null) {
                    synchronized (ewnw.class) {
                        febsVar = ewnw.b;
                        if (febsVar == null) {
                            febp a3 = febs.a();
                            a3.c = febr.UNARY;
                            a3.d = febs.c("google.internal.expression.sticker.v1.StickerService", "SearchStickers");
                            a3.b();
                            ewng ewngVar4 = ewng.a;
                            eyfc eyfcVar = ffag.a;
                            a3.a = new ffae(ewngVar4);
                            a3.b = new ffae(ewni.a);
                            febsVar = a3.a();
                            ewnw.b = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, ewnvVar.b), ewngVar3);
            }
        }, this.b);
        erqt.r(n, new eerr(this, a), this.b);
        return n;
    }

    @Override // defpackage.eere
    public final ListenableFuture g(final String str, final boolean z) {
        return this.b.submit(new Callable() { // from class: eero
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eert.this.h.b(str, z);
                return null;
            }
        });
    }

    @Override // defpackage.eere
    public final errl h() {
        return this.b;
    }

    @Override // defpackage.eere
    public final eumd i() {
        return this.i;
    }

    @Override // defpackage.eere
    public final void j(eerx eerxVar) {
        this.h.a.add(eerxVar);
    }

    @Override // defpackage.eere
    public final void k() {
        eeut eeutVar = this.g;
        synchronized (eeutVar.c) {
            eeuq eeuqVar = eeutVar.e;
        }
        synchronized (eeutVar.b) {
            eeuq eeuqVar2 = eeutVar.d;
            if (eeuqVar2 != null) {
                eeuqVar2.c();
            }
        }
    }

    @Override // defpackage.eere
    public final void l(eerx eerxVar) {
        this.h.a.remove(eerxVar);
    }

    @Override // defpackage.eere
    public final boolean m(String str) {
        return this.h.a().contains(str);
    }

    @Override // defpackage.eere
    public final boolean n() {
        return ((Boolean) ((emyr) this.k).a).booleanValue();
    }

    @Override // defpackage.eere
    public final eesb o() {
        return this.h;
    }

    @Override // defpackage.eere
    public final void p(final List list) {
        this.b.submit(new Callable() { // from class: eerh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator it = list.iterator();
                while (true) {
                    eert eertVar = eert.this;
                    if (!it.hasNext()) {
                        eertVar.h.c(true);
                        return null;
                    }
                    eertVar.h.b((String) it.next(), true);
                }
            }
        });
    }

    @Override // defpackage.eere
    public final /* synthetic */ void q(String str, Locale locale, ewnm ewnmVar) {
        eeut eeutVar = this.g;
        String b = eeuv.b(str, locale, ewnmVar);
        synchronized (eeutVar.b) {
            eeuq eeuqVar = eeutVar.d;
            if (eeuqVar != null && b.equals(eeuqVar.e)) {
                erny.f(eeutVar.d.a(), new emwl() { // from class: eeur
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return null;
                    }
                }, erpp.a);
                return;
            }
            eeuq eeuqVar2 = eeutVar.d;
            if (eeuqVar2 != null) {
                eeuqVar2.c();
            }
            eeutVar.d = new eeuq(eeutVar.a, str, locale, ewnmVar);
            ((eert) eeutVar.a).f.a = str;
            erny.f(eeutVar.d.a(), new emwl() { // from class: eeus
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return null;
                }
            }, erpp.a);
        }
    }

    public final ewnx r(String str, Locale locale, ewnm ewnmVar) {
        String upperCase;
        int i;
        ewnx ewnxVar = (ewnx) ewny.a.createBuilder();
        ewmx ewmxVar = (ewmx) ewmy.a.createBuilder();
        ewmxVar.copyOnWrite();
        ewmy ewmyVar = (ewmy) ewmxVar.instance;
        ewmyVar.c = this.i;
        ewmyVar.b |= 1;
        String locale2 = locale.toString();
        ewmxVar.copyOnWrite();
        ewmy ewmyVar2 = (ewmy) ewmxVar.instance;
        locale2.getClass();
        ewmyVar2.d = locale2;
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        if (telephonyManager == null) {
            upperCase = locale.getCountry();
        } else {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (TextUtils.isEmpty(simCountryIso)) {
                simCountryIso = telephonyManager.getNetworkCountryIso();
                if (TextUtils.isEmpty(simCountryIso)) {
                    simCountryIso = locale.getCountry();
                }
            }
            upperCase = simCountryIso.toUpperCase();
        }
        ewmxVar.copyOnWrite();
        ewmy ewmyVar3 = (ewmy) ewmxVar.instance;
        upperCase.getClass();
        ewmyVar3.e = upperCase;
        ewmy ewmyVar4 = (ewmy) ewmxVar.build();
        ewnxVar.copyOnWrite();
        ewny ewnyVar = (ewny) ewnxVar.instance;
        ewmyVar4.getClass();
        ewnyVar.c = ewmyVar4;
        ewnyVar.b |= 1;
        ewnxVar.copyOnWrite();
        ewny ewnyVar2 = (ewny) ewnxVar.instance;
        str.getClass();
        ewnyVar2.d = str;
        ewnxVar.copyOnWrite();
        ewny ewnyVar3 = (ewny) ewnxVar.instance;
        ewnmVar.getClass();
        ewnyVar3.g = ewnmVar;
        ewnyVar3.b |= 2;
        List a = this.h.a();
        ewnxVar.copyOnWrite();
        ewny ewnyVar4 = (ewny) ewnxVar.instance;
        eygr eygrVar = ewnyVar4.e;
        if (!eygrVar.c()) {
            ewnyVar4.e = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(a, ewnyVar4.e);
        int i2 = this.i.b;
        int b = eulz.b(i2);
        if (b != 0 && b == 12) {
            i = 7;
        } else {
            int b2 = eulz.b(i2);
            i = (b2 != 0 && b2 == 5) ? 6 : 5;
        }
        ewnxVar.copyOnWrite();
        ((ewny) ewnxVar.instance).f = i - 2;
        return ewnxVar;
    }

    @Override // defpackage.eeuu
    public final File s() {
        return this.a.getCacheDir();
    }

    public final void t() {
        feau feauVar = (feau) this.j.get();
        if (feauVar.g().equals(fdyc.TRANSIENT_FAILURE)) {
            Log.d("ExpressiveStickerClient", "RPCChannel was in TRANSIENT_FAILURE state.");
            feauVar.e();
        }
    }
}
