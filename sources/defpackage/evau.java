package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evau implements evah {
    public static final entd a = entd.c("xRPC");
    public static final AtomicInteger b = new AtomicInteger();
    public final Executor c;
    public final erog d;
    private final enip e;

    public evau(final evai evaiVar) {
        this.c = evaiVar.a;
        final ejlc ejlcVar = new ejlc(new erog() { // from class: eval
            @Override // defpackage.erog
            public final ListenableFuture a() {
                entd entdVar = evau.a;
                return erqt.i((CronetEngine) evai.this.d.b());
            }
        }, evaiVar.c);
        this.d = new erog() { // from class: evam
            @Override // defpackage.erog
            public final ListenableFuture a() {
                entd entdVar = evau.a;
                return erqt.j(ejlc.this.c());
            }
        };
        this.e = evaiVar.e.g();
    }

    @Override // defpackage.evah
    public final ListenableFuture a(final evba evbaVar) {
        ListenableFuture h;
        ekzz f = eleg.f("Http Request");
        try {
            enip enipVar = this.e;
            if (evbaVar.i.isEmpty() && enipVar.isEmpty()) {
                h = erqt.i(evbaVar);
            } else {
                int i = engw.d;
                engr engrVar = new engr();
                enqu listIterator = enipVar.listIterator();
                while (listIterator.hasNext()) {
                    engrVar.h(erqt.n(((evbd) listIterator.next()).a(), erpp.a));
                }
                enqu listIterator2 = evbaVar.i.listIterator();
                while (listIterator2.hasNext()) {
                    engrVar.h(erqt.n(((evbd) listIterator2.next()).a(), erpp.a));
                }
                h = elfo.a(engrVar.g()).h(new emwl() { // from class: evbe
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        evba evbaVar2 = evba.this;
                        enkg enkgVar = evbaVar2.c;
                        Uri parse = Uri.parse(evbaVar2.a);
                        HashSet hashSet = new HashSet(enkgVar.x());
                        HashSet hashSet2 = new HashSet(parse.getQueryParameterNames());
                        engx engxVar = new engx();
                        engxVar.c(evbaVar2.c);
                        Uri.Builder buildUpon = parse.buildUpon();
                        for (evbb evbbVar : (List) obj) {
                            for (evax evaxVar : evbbVar.a().x()) {
                                if (!hashSet.add(evaxVar)) {
                                    throw new evbc(String.format("Duplicate header key: %s", evaxVar.a()));
                                }
                            }
                            for (String str : evbbVar.b().x()) {
                                if (!hashSet2.add(str)) {
                                    throw new evbc(String.format("Duplicate url parameter key: %s", str));
                                }
                            }
                            engxVar.c(evbbVar.a());
                            enqu listIterator3 = evbbVar.b().u().listIterator();
                            while (listIterator3.hasNext()) {
                                Map.Entry entry = (Map.Entry) listIterator3.next();
                                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        evay evayVar = new evay();
                        evayVar.b(evbaVar2.c);
                        int i2 = evbaVar2.f;
                        if (i2 != 0 && i2 != 1 && i2 != 2) {
                            i2 = 3;
                        }
                        emxf.l(true);
                        evayVar.e = i2;
                        evayVar.d = evbaVar2.e;
                        evayVar.i.addAll(evbaVar2.i);
                        String str2 = evbaVar2.a;
                        if (str2 != null) {
                            evayVar.e(str2);
                        }
                        String str3 = evbaVar2.g;
                        if (str3 != null) {
                            evayVar.c(str3);
                        }
                        if (evbaVar2.b) {
                            evayVar.g = true;
                        }
                        evaz evazVar = evbaVar2.d;
                        if (evazVar != null) {
                            evayVar.d(evazVar.a, evazVar.b);
                        }
                        Long l = evbaVar2.h;
                        if (l != null) {
                            l.longValue();
                            evayVar.h = l;
                        }
                        Integer num = evbaVar2.j;
                        if (num != null) {
                            num.intValue();
                            evayVar.j = num;
                        }
                        Integer num2 = evbaVar2.k;
                        if (num2 != null) {
                            num2.intValue();
                            evayVar.k = num2;
                        }
                        evayVar.i.clear();
                        evayVar.b.q();
                        evayVar.e(buildUpon.build().toString());
                        evayVar.b(engxVar.a());
                        return evayVar.a();
                    }
                }, erpp.a);
            }
            ListenableFuture g = erny.g(h, eldl.d(new eroh() { // from class: evak
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final evba evbaVar2 = (evba) obj;
                    String scheme = Uri.parse(evbaVar2.a).getScheme();
                    if (!evbaVar2.b && !emuz.e(scheme, "https")) {
                        ((ensz) ((ensz) evau.a.i()).h("com/google/frameworks/client/data/android/HttpClientImpl", "makeRequest", 85, "HttpClientImpl.java")).q("Making plaintext http request");
                    }
                    final evau evauVar = evau.this;
                    return erny.g(erqt.n(evauVar.d, erpp.a), eldl.d(new eroh() { // from class: evaj
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            Executor executor = evau.this.c;
                            evba evbaVar3 = evbaVar2;
                            SettableFuture create = SettableFuture.create();
                            UrlRequest.Builder allowDirectExecutor = ((CronetEngine) obj2).newUrlRequestBuilder(evbaVar3.a, new evat(create, executor, evbaVar3), erpp.a).allowDirectExecutor();
                            String str = evbaVar3.g;
                            if (str != null) {
                                allowDirectExecutor.setHttpMethod(str);
                            }
                            for (Map.Entry entry : evbaVar3.c.u()) {
                                allowDirectExecutor.addHeader(((evax) entry.getKey()).a(), (String) entry.getValue());
                            }
                            evaz evazVar = evbaVar3.d;
                            if (evazVar != null) {
                                allowDirectExecutor.addHeader(fhpi.a, evazVar.a);
                                allowDirectExecutor.setUploadDataProvider(new evap(evbaVar3.d), erpp.a);
                            }
                            if (allowDirectExecutor instanceof ExperimentalUrlRequest.Builder) {
                                ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) allowDirectExecutor;
                                Integer num = evbaVar3.j;
                                if (num != null) {
                                    builder.setTrafficStatsUid(num.intValue());
                                }
                                Integer num2 = evbaVar3.k;
                                if (num2 != null) {
                                    builder.setTrafficStatsTag(num2.intValue());
                                }
                                Long l = evbaVar3.h;
                                if (l != null) {
                                    builder.bindToNetwork(l.longValue());
                                }
                            }
                            allowDirectExecutor.setPriority(evbaVar3.f);
                            int andIncrement = evau.b.getAndIncrement();
                            UrlRequest build = allowDirectExecutor.build();
                            create.b(new evan(andIncrement, create, build), erpp.a);
                            ((ensz) evau.a.n().h("com/google/frameworks/client/data/android/HttpClientImpl", "makeRequestImpl", 175, "HttpClientImpl.java")).w("[%d] Starting HTTP request to %s", andIncrement, evbaVar3.a);
                            build.start();
                            return create;
                        }
                    }), erpp.a);
                }
            }), erpp.a);
            f.b(g);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
