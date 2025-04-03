package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeuq {
    public final eeuu a;
    public final Object b = new Object();
    public final String c;
    public final Locale d;
    public final String e;
    public final ewnm f;
    public ListenableFuture g;

    public eeuq(eeuu eeuuVar, String str, Locale locale, ewnm ewnmVar) {
        this.a = eeuuVar;
        this.c = str;
        this.d = locale;
        this.f = ewnmVar;
        this.e = eeuv.b(str, locale, ewnmVar);
    }

    public final ListenableFuture a() {
        Log.d("MetadataFetcher", "load() started for cache key ".concat(String.valueOf(this.e)));
        synchronized (this.b) {
            if (this.g == null) {
                ListenableFuture f = erny.f(ernq.g(((eert) this.a).b.submit(new Callable() { // from class: eeum
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eeuq eeuqVar = eeuq.this;
                        File b = eeuqVar.b();
                        if (!b.exists()) {
                            ewnx r = ((eert) eeuqVar.a).r(eeuqVar.c, eeuqVar.d, eeuqVar.f);
                            r.copyOnWrite();
                            ewny ewnyVar = (ewny) r.instance;
                            ewny ewnyVar2 = ewny.a;
                            ewnyVar.h = eyfy.emptyProtobufList();
                            r.copyOnWrite();
                            ((ewny) r.instance).e = eyfy.emptyProtobufList();
                            File file = new File(eeuqVar.a.s(), eeuv.a(Long.toString(Arrays.hashCode(((ewny) r.build()).toByteArray()))));
                            if (file.exists() && !b.exists()) {
                                try {
                                    if (file.renameTo(b)) {
                                        Log.d("MetadataFetcher", "Successfully renamed the old cache file.");
                                        file = b;
                                    } else {
                                        Log.w("MetadataFetcher", "Failed to renamed the old cache file.");
                                    }
                                } catch (Exception e) {
                                    Log.w("MetadataFetcher", "Failed to renamed the old cache file.", e);
                                }
                            }
                            if (file.exists()) {
                                b = file;
                            }
                        }
                        try {
                            ewnb ewnbVar = (ewnb) ewnc.a.createBuilder();
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(b), 32768);
                            try {
                                ewnbVar.mergeFrom((InputStream) gZIPInputStream);
                                gZIPInputStream.close();
                                return (ewnc) ewnbVar.build();
                            } catch (Throwable th) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException e2) {
                            Log.d("MetadataFetcher", "Cached file " + b.getName() + " doesn't exist.");
                            throw e2;
                        } catch (IOException e3) {
                            Log.w("MetadataFetcher", "Unexpected error reading cached file ".concat(String.valueOf(b.getName())), e3);
                            throw e3;
                        }
                    }
                }), Throwable.class, new eroh() { // from class: eeun
                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        eeuq eeuqVar;
                        final eert eertVar;
                        ListenableFuture n;
                        eert eertVar2;
                        ListenableFuture h;
                        eeuq eeuqVar2 = eeuq.this;
                        eeuu eeuuVar = eeuqVar2.a;
                        eert eertVar3 = (eert) eeuuVar;
                        String str = eeuqVar2.c;
                        ewny ewnyVar = (ewny) eertVar3.r(str, eeuqVar2.d, eeuqVar2.f).build();
                        ewmz ewmzVar = (ewmz) ewna.a.createBuilder();
                        ewmzVar.copyOnWrite();
                        ewna ewnaVar = (ewna) ewmzVar.instance;
                        ewnyVar.getClass();
                        ewnaVar.c = ewnyVar;
                        ewnaVar.b |= 1;
                        final ewna ewnaVar2 = (ewna) ewmzVar.build();
                        if (eertVar3.d.g() && eertVar3.e.g()) {
                            try {
                                Uri.Builder buildUpon = ((Uri) ((eert) eeuuVar).e.c()).buildUpon();
                                JSONObject jSONObject = new JSONObject();
                                ewny ewnyVar2 = ewnaVar2.c;
                                if (ewnyVar2 == null) {
                                    ewnyVar2 = ewny.a;
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                ewmy ewmyVar = ewnyVar2.c;
                                if (ewmyVar == null) {
                                    ewmyVar = ewmy.a;
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                eumd eumdVar = ewmyVar.c;
                                if (eumdVar == null) {
                                    eumdVar = eumd.a;
                                }
                                JSONObject jSONObject4 = new JSONObject();
                                eeuqVar = eeuqVar2;
                                eertVar2 = eertVar3;
                                try {
                                    eeuz.b(jSONObject4, "client_id", Integer.valueOf(eumdVar.b));
                                    eeuz.a(jSONObject4, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, eumdVar.c);
                                    eeuz.d(jSONObject3, "client", jSONObject4);
                                    eeuz.a(jSONObject3, "locale", ewmyVar.d);
                                    eeuz.a(jSONObject3, "country", ewmyVar.e);
                                    eeuz.c(jSONObject3, "experiment_ids", ewmyVar.f);
                                    eeuz.d(jSONObject2, "common_context", jSONObject3);
                                    eeuz.a(jSONObject2, "metadata_version", ewnyVar2.d);
                                    eeuz.c(jSONObject2, "device_favorite_packs", ewnyVar2.e);
                                    eeuz.b(jSONObject2, "resolution", Integer.valueOf(ewnyVar2.f));
                                    ewnm ewnmVar = ewnyVar2.g;
                                    if (ewnmVar == null) {
                                        ewnmVar = ewnm.a;
                                    }
                                    JSONObject jSONObject5 = new JSONObject();
                                    eeuz.c(jSONObject5, "default_packs", ewnmVar.b);
                                    eeuz.c(jSONObject5, "hidden_packs", ewnmVar.c);
                                    eeuz.c(jSONObject5, "pack_order", ewnmVar.d);
                                    eeuz.c(jSONObject5, "default_stickers", ewnmVar.e);
                                    eeuz.d(jSONObject2, "market_config", jSONObject5);
                                    eeuz.d(jSONObject, "user_context", jSONObject2);
                                    ewne ewneVar = ewnaVar2.d;
                                    if (ewneVar == null) {
                                        ewneVar = ewne.a;
                                    }
                                    JSONObject jSONObject6 = new JSONObject();
                                    eeuz.a(jSONObject6, "raw_query", ewneVar.b);
                                    if (ewneVar.c) {
                                        jSONObject6.putOpt("favorite_only", true);
                                    }
                                    eeuz.d(jSONObject, "search_criteria", jSONObject6);
                                    h = ernq.f(((eeuw) ((eert) eeuuVar).d.c()).a(buildUpon.appendQueryParameter("$req", jSONObject.toString()).build().toString()), Throwable.class, new emwl() { // from class: eerl
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            Log.w("ExpressiveStickerClient", "Fetch failed.", (Throwable) obj2);
                                            return null;
                                        }
                                    }, ((eert) eeuuVar).b);
                                    eeuj eeujVar = ((eert) eeuuVar).f;
                                    eeujVar.a = str;
                                    eeujVar.i(3);
                                } catch (JSONException e) {
                                    e = e;
                                    h = erqt.h(e);
                                    eertVar = eertVar2;
                                    n = erny.f(h, new emwl() { // from class: eerq
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            byte[] bArr = (byte[]) obj2;
                                            if (bArr == null) {
                                                throw new IllegalArgumentException("Response content data cannot be empty.");
                                            }
                                            try {
                                                return (ewnc) ((ewnb) ((ewnb) ewnc.a.createBuilder()).mergeFrom(bArr)).build();
                                            } catch (eygu e2) {
                                                throw new IllegalArgumentException("Response has protocol buffer issue.", e2);
                                            }
                                        }
                                    }, eertVar.b);
                                    erqt.r(n, new eers(eertVar, str), eertVar.b);
                                    final eeuq eeuqVar3 = eeuqVar;
                                    return erny.f(n, new emwl() { // from class: eeul
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            eeuq eeuqVar4 = eeuq.this;
                                            ewnc ewncVar = (ewnc) obj2;
                                            File b = eeuqVar4.b();
                                            try {
                                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(b), 32768);
                                                try {
                                                    ewncVar.writeTo(gZIPOutputStream);
                                                    gZIPOutputStream.close();
                                                    ((eert) eeuqVar4.a).a.getSharedPreferences("expressive_sticker_client_prefs", 0).edit().putString("last_cached_metadata_version", eeuqVar4.c).apply();
                                                    Log.d("MetadataFetcher", "Save last cached metadata version: " + eeuqVar4.c);
                                                    return ewncVar;
                                                } finally {
                                                }
                                            } catch (IOException e2) {
                                                Log.w("MetadataFetcher", "Failed to cache ".concat(String.valueOf(b.getName())), e2);
                                                ((eert) eeuqVar4.a).f.i(46);
                                                return ewncVar;
                                            }
                                        }
                                    }, ((eert) eeuqVar3.a).b);
                                }
                            } catch (JSONException e2) {
                                e = e2;
                                eeuqVar = eeuqVar2;
                                eertVar2 = eertVar3;
                            }
                            eertVar = eertVar2;
                            n = erny.f(h, new emwl() { // from class: eerq
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    byte[] bArr = (byte[]) obj2;
                                    if (bArr == null) {
                                        throw new IllegalArgumentException("Response content data cannot be empty.");
                                    }
                                    try {
                                        return (ewnc) ((ewnb) ((ewnb) ewnc.a.createBuilder()).mergeFrom(bArr)).build();
                                    } catch (eygu e22) {
                                        throw new IllegalArgumentException("Response has protocol buffer issue.", e22);
                                    }
                                }
                            }, eertVar.b);
                        } else {
                            eeuqVar = eeuqVar2;
                            eertVar = eertVar3;
                            n = erqt.n(new erog() { // from class: eerm
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    eert eertVar4 = eert.this;
                                    eertVar4.t();
                                    eertVar4.f.i(3);
                                    ewnv ewnvVar = (ewnv) eertVar4.c.get();
                                    fdxk fdxkVar = ewnvVar.a;
                                    febs febsVar = ewnw.a;
                                    if (febsVar == null) {
                                        synchronized (ewnw.class) {
                                            febsVar = ewnw.a;
                                            if (febsVar == null) {
                                                febp a = febs.a();
                                                a.c = febr.UNARY;
                                                a.d = febs.c("google.internal.expression.sticker.v1.StickerService", "ListStickerPacks");
                                                a.b();
                                                ewna ewnaVar3 = ewna.a;
                                                eyfc eyfcVar = ffag.a;
                                                a.a = new ffae(ewnaVar3);
                                                a.b = new ffae(ewnc.a);
                                                febsVar = a.a();
                                                ewnw.a = febsVar;
                                            }
                                        }
                                    }
                                    return ffat.a(fdxkVar.a(febsVar, ewnvVar.b), ewnaVar2);
                                }
                            }, eertVar.b);
                        }
                        erqt.r(n, new eers(eertVar, str), eertVar.b);
                        final eeuq eeuqVar32 = eeuqVar;
                        return erny.f(n, new emwl() { // from class: eeul
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                eeuq eeuqVar4 = eeuq.this;
                                ewnc ewncVar = (ewnc) obj2;
                                File b = eeuqVar4.b();
                                try {
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(b), 32768);
                                    try {
                                        ewncVar.writeTo(gZIPOutputStream);
                                        gZIPOutputStream.close();
                                        ((eert) eeuqVar4.a).a.getSharedPreferences("expressive_sticker_client_prefs", 0).edit().putString("last_cached_metadata_version", eeuqVar4.c).apply();
                                        Log.d("MetadataFetcher", "Save last cached metadata version: " + eeuqVar4.c);
                                        return ewncVar;
                                    } finally {
                                    }
                                } catch (IOException e22) {
                                    Log.w("MetadataFetcher", "Failed to cache ".concat(String.valueOf(b.getName())), e22);
                                    ((eert) eeuqVar4.a).f.i(46);
                                    return ewncVar;
                                }
                            }
                        }, ((eert) eeuqVar32.a).b);
                    }
                }, ((eert) this.a).b), new emwl() { // from class: eeuo
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ewnc ewncVar = (ewnc) obj;
                        LinkedHashMap j = ennc.j(ewncVar.b.size());
                        Iterator<E> it = ewncVar.b.iterator();
                        while (it.hasNext()) {
                            ewnp ewnpVar = ((ewnr) it.next()).b;
                            if (ewnpVar == null) {
                                ewnpVar = ewnp.a;
                            }
                            int a = ewno.a(ewnpVar.c);
                            if (a == 0 || a != 4) {
                                j.put(ewnpVar.b, ewnpVar);
                            }
                        }
                        return j;
                    }
                }, ((eert) this.a).b);
                this.g = f;
                erqt.r(f, new eeup(this), ((eert) this.a).b);
                return f;
            }
            Log.d("MetadataFetcher", "load() returned cached future for cache key " + this.e);
            return this.g;
        }
    }

    public final File b() {
        eeuu eeuuVar = this.a;
        return new File(eeuuVar.s(), eeuv.a(this.e));
    }

    public final void c() {
        synchronized (this.b) {
            ListenableFuture listenableFuture = this.g;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
                this.g = null;
                Log.d("MetadataFetcher", "Cancel metadata fetch future of " + this.e);
            }
        }
    }
}
