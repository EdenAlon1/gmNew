package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwxa implements dwub {
    public final Context a;
    public final dxsy b;
    public final emxc c;
    public final dxmi d;
    public final efbm e;
    public final dwqy f;
    public final dxvi g;
    public final dxvi h;
    public final Executor i;
    public final emxc j;
    public final emxc k;
    public final dxbv m;
    private final List n;
    private final dxwg o;
    private final dycc p = new dycc();
    public final eroh l = new eroh() { // from class: dwwl
        @Override // defpackage.eroh
        public final ListenableFuture a(Object obj) {
            return erqt.i(dwox.SUCCESS);
        }
    };

    public dwxa(Context context, dxsy dxsyVar, dxmi dxmiVar, Executor executor, List list, emxc emxcVar, efbm efbmVar, emxc emxcVar2, emxc emxcVar3, dwqy dwqyVar, dxwg dxwgVar, dxbv dxbvVar) {
        this.a = context;
        this.b = dxsyVar;
        this.n = list;
        this.c = emxcVar;
        this.i = executor;
        this.d = dxmiVar;
        this.e = efbmVar;
        this.j = emxcVar2;
        this.k = emxcVar3;
        this.f = dwqyVar;
        this.o = dxwgVar;
        this.h = dxvi.a(executor);
        this.g = new dxvi(executor, new dwwx(emxcVar3, context));
        this.m = dxbvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dwno n(String str, long j, long j2, String str2, eydq eydqVar, boolean z, String str3) {
        dwnn dwnnVar = (dwnn) dwno.a.createBuilder();
        dwnnVar.copyOnWrite();
        dwno dwnoVar = (dwno) dwnnVar.instance;
        str.getClass();
        dwnoVar.b |= 1;
        dwnoVar.c = str;
        dwnnVar.copyOnWrite();
        dwno dwnoVar2 = (dwno) dwnnVar.instance;
        dwnoVar2.b |= 4;
        dwnoVar2.e = (int) j;
        dwnnVar.copyOnWrite();
        dwno dwnoVar3 = (dwno) dwnnVar.instance;
        dwnoVar3.b |= 32;
        dwnoVar3.h = z;
        dwnnVar.copyOnWrite();
        dwno dwnoVar4 = (dwno) dwnnVar.instance;
        str3.getClass();
        dwnoVar4.b |= 64;
        dwnoVar4.i = str3;
        if (j2 > 0) {
            dwnnVar.copyOnWrite();
            dwno dwnoVar5 = (dwno) dwnnVar.instance;
            dwnoVar5.b |= 8;
            dwnoVar5.f = (int) j2;
        }
        if (j > 2147483647L || j2 > 2147483647L) {
            eyfw eyfwVar = dwnu.b;
            dwnt dwntVar = (dwnt) dwnu.a.createBuilder();
            dwntVar.copyOnWrite();
            dwnu dwnuVar = (dwnu) dwntVar.instance;
            dwnuVar.c |= 1;
            dwnuVar.d = j;
            dwntVar.copyOnWrite();
            dwnu dwnuVar2 = (dwnu) dwntVar.instance;
            dwnuVar2.c |= 2;
            dwnuVar2.e = j2;
            dwnnVar.e(eyfwVar, (dwnu) dwntVar.build());
        }
        if (str2 != null) {
            dwnnVar.copyOnWrite();
            dwno dwnoVar6 = (dwno) dwnnVar.instance;
            dwnoVar6.b |= 2;
            dwnoVar6.d = str2;
        }
        if (eydqVar != null) {
            dwnnVar.copyOnWrite();
            dwno dwnoVar7 = (dwno) dwnnVar.instance;
            dwnoVar7.g = eydqVar;
            dwnoVar7.b |= 16;
        }
        return (dwno) dwnnVar.build();
    }

    public static emxc o(dwtm dwtmVar, dwso dwsoVar, dwqy dwqyVar) {
        return dwqyVar.J() ? (dwtmVar.b & 16) != 0 ? emxc.j(dwtmVar.g) : emux.a : dwsoVar != null ? emxc.j(dwsoVar.u) : emux.a;
    }

    public static erie p(dwns dwnsVar) {
        erid eridVar = (erid) erie.a.createBuilder();
        String str = dwnsVar.c;
        eridVar.copyOnWrite();
        erie erieVar = (erie) eridVar.instance;
        str.getClass();
        erieVar.b |= 1;
        erieVar.c = str;
        String str2 = dwnsVar.d;
        eridVar.copyOnWrite();
        erie erieVar2 = (erie) eridVar.instance;
        str2.getClass();
        erieVar2.b |= 4;
        erieVar2.e = str2;
        int i = dwnsVar.f;
        eridVar.copyOnWrite();
        erie erieVar3 = (erie) eridVar.instance;
        erieVar3.b |= 2;
        erieVar3.d = i;
        int size = dwnsVar.h.size();
        eridVar.copyOnWrite();
        erie erieVar4 = (erie) eridVar.instance;
        erieVar4.b |= 8;
        erieVar4.f = size;
        String str3 = dwnsVar.j;
        eridVar.copyOnWrite();
        erie erieVar5 = (erie) eridVar.instance;
        str3.getClass();
        erieVar5.b |= 128;
        erieVar5.j = str3;
        long j = dwnsVar.i;
        eridVar.copyOnWrite();
        erie erieVar6 = (erie) eridVar.instance;
        erieVar6.b |= 64;
        erieVar6.i = j;
        return (erie) eridVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List s(efbm efbmVar, Uri uri, String str) {
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : efbmVar.b(uri)) {
            if (efbmVar.i(uri2)) {
                arrayList.addAll(s(efbmVar, uri2, str));
            } else {
                String path = uri2.getPath();
                if (path != null) {
                    long a = efbmVar.a(uri2);
                    dwnn dwnnVar = (dwnn) dwno.a.createBuilder();
                    String replaceFirst = path.replaceFirst(str, "");
                    dwnnVar.copyOnWrite();
                    dwno dwnoVar = (dwno) dwnnVar.instance;
                    replaceFirst.getClass();
                    dwnoVar.b |= 1;
                    dwnoVar.c = replaceFirst;
                    dwnnVar.copyOnWrite();
                    dwno dwnoVar2 = (dwno) dwnnVar.instance;
                    dwnoVar2.b |= 4;
                    dwnoVar2.e = (int) a;
                    String uri3 = uri2.toString();
                    dwnnVar.copyOnWrite();
                    dwno dwnoVar3 = (dwno) dwnnVar.instance;
                    uri3.getClass();
                    dwnoVar3.b |= 2;
                    dwnoVar3.d = uri3;
                    if (a > 2147483647L) {
                        eyfw eyfwVar = dwnu.b;
                        dwnt dwntVar = (dwnt) dwnu.a.createBuilder();
                        dwntVar.copyOnWrite();
                        dwnu dwnuVar = (dwnu) dwntVar.instance;
                        dwnuVar.c |= 1;
                        dwnuVar.d = a;
                        dwnnVar.e(eyfwVar, (dwnu) dwntVar.build());
                    }
                    arrayList.add((dwno) dwnnVar.build());
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    public static final emxc t(emxc emxcVar, Map map, String str) {
        emxn emxnVar = (emxn) emxcVar;
        return emxnVar.a.containsKey(str) ? emxc.i((dwxi) emxnVar.a.get(str)) : emxc.i((dwxi) map.get(str));
    }

    public static ListenableFuture u(final dwso dwsoVar, emxc emxcVar, String str, dwnr dwnrVar, final boolean z, final dxmi dxmiVar, Executor executor, final efbm efbmVar) {
        dycd g;
        if (dwsoVar == null) {
            return erqt.i(null);
        }
        final dwnp dwnpVar = (dwnp) dwns.a.createBuilder();
        String str2 = dwsoVar.d;
        dwnpVar.copyOnWrite();
        dwns dwnsVar = (dwns) dwnpVar.instance;
        str2.getClass();
        dwnsVar.b |= 1;
        dwnsVar.c = str2;
        String str3 = dwsoVar.e;
        dwnpVar.copyOnWrite();
        dwns dwnsVar2 = (dwns) dwnpVar.instance;
        str3.getClass();
        dwnsVar2.b |= 2;
        dwnsVar2.d = str3;
        int i = dwsoVar.f;
        dwnpVar.copyOnWrite();
        dwns dwnsVar3 = (dwns) dwnpVar.instance;
        dwnsVar3.b |= 8;
        dwnsVar3.f = i;
        eydq eydqVar = dwsoVar.g;
        if (eydqVar == null) {
            eydqVar = eydq.a;
        }
        dwnpVar.copyOnWrite();
        dwns dwnsVar4 = (dwns) dwnpVar.instance;
        eydqVar.getClass();
        dwnsVar4.l = eydqVar;
        dwnsVar4.b |= 128;
        long j = dwsoVar.t;
        dwnpVar.copyOnWrite();
        dwns dwnsVar5 = (dwns) dwnpVar.instance;
        dwnsVar5.b |= 32;
        dwnsVar5.i = j;
        dwnpVar.copyOnWrite();
        dwns dwnsVar6 = (dwns) dwnpVar.instance;
        dwnsVar6.g = dwnrVar.e;
        dwnsVar6.b |= 16;
        eygr eygrVar = dwsoVar.v;
        dwnpVar.copyOnWrite();
        dwns dwnsVar7 = (dwns) dwnpVar.instance;
        eygr eygrVar2 = dwnsVar7.k;
        if (!eygrVar2.c()) {
            dwnsVar7.k = eyfy.mutableCopy(eygrVar2);
        }
        eydl.addAll(eygrVar, dwnsVar7.k);
        if (emxcVar.g()) {
            Object c = emxcVar.c();
            dwnpVar.copyOnWrite();
            dwns dwnsVar8 = (dwns) dwnpVar.instance;
            dwnsVar8.b |= 64;
            dwnsVar8.j = (String) c;
        }
        if (str != null) {
            dwnpVar.copyOnWrite();
            dwns dwnsVar9 = (dwns) dwnpVar.instance;
            dwnsVar9.b |= 4;
            dwnsVar9.e = str;
        }
        if ((dwsoVar.b & 32) != 0) {
            eydq eydqVar2 = dwsoVar.h;
            if (eydqVar2 == null) {
                eydqVar2 = eydq.a;
            }
            dwnpVar.copyOnWrite();
            dwns dwnsVar10 = (dwns) dwnpVar.instance;
            eydqVar2.getClass();
            dwnsVar10.m = eydqVar2;
            dwnsVar10.b |= 256;
        }
        final eygr eygrVar3 = dwsoVar.p;
        ListenableFuture listenableFuture = erre.a;
        if (dwnrVar == dwnr.DOWNLOADED || dwnrVar == dwnr.PENDING_CUSTOM_VALIDATION) {
            if (dwsoVar.o) {
                emxf.a(true);
                String uri = dxvk.c(dxmiVar.b, dxmiVar.m, dwsoVar).toString();
                dwnpVar.copyOnWrite();
                dwns dwnsVar11 = (dwns) dwnpVar.instance;
                uri.getClass();
                dwnsVar11.b |= 1024;
                dwnsVar11.n = uri;
            }
            dwnr dwnrVar2 = dwnr.PENDING_CUSTOM_VALIDATION;
            dxth.c("%s: getDataFileUris %s", "MDDManager", dwsoVar.d);
            final boolean z2 = dwnrVar != dwnrVar2 && dxvk.j(dwsoVar);
            enhd enhdVar = new enhd();
            if (z2) {
                enhdVar.g(dxmiVar.d.b(dwsoVar));
            }
            final enhk b = enhdVar.b();
            g = dycd.e(dycd.e(dxmiVar.h()).g(new eroh() { // from class: dxmh
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    if (z2 && !z) {
                        return erqt.i(enoz.a);
                    }
                    return dxmi.this.d.k(dwsoVar);
                }
            }, dxmiVar.n).f(new emwl() { // from class: dxkm
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    enhk enhkVar = (enhk) obj;
                    if (!z2) {
                        return enhkVar;
                    }
                    enhk enhkVar2 = b;
                    return !z ? enhkVar2 : dxmi.this.d.c(enhkVar2, enhkVar);
                }
            }, dxmiVar.n).f(new emwl() { // from class: dxkn
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    enhd enhdVar2 = new enhd();
                    enqu listIterator = ((enhk) obj).entrySet().listIterator();
                    while (listIterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) listIterator.next();
                        dwsi dwsiVar = (dwsi) entry.getKey();
                        if (entry.getValue() != null) {
                            if ((dwsiVar.b & 256) != 0) {
                                Uri uri2 = (Uri) entry.getValue();
                                fasl faslVar = dwsiVar.k;
                                if (faslVar == null) {
                                    faslVar = fasl.a;
                                }
                                if (dxmi.this.p.C() && faslVar.b.size() != 0) {
                                    uri2 = uri2.buildUpon().encodedFragment(efep.a(faslVar)).build();
                                }
                                enhdVar2.k(dwsiVar, uri2);
                            } else {
                                enhdVar2.i(entry);
                            }
                        }
                    }
                    return enhdVar2.b();
                }
            }, dxmiVar.n)).g(new eroh() { // from class: dwwg
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    eydq eydqVar3;
                    efbm efbmVar2 = efbmVar;
                    enhk enhkVar = (enhk) obj;
                    for (dwsi dwsiVar : eygrVar3) {
                        if (!enhkVar.containsKey(dwsiVar)) {
                            dwql a = dwqn.a();
                            a.a = dwqm.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                            a.b = "getDataFileUris() resolved to null";
                            return erqt.h(a.a());
                        }
                        Uri uri2 = (Uri) enhkVar.get(dwsiVar);
                        try {
                            boolean g2 = dxvk.g(dwsiVar);
                            dwnp dwnpVar2 = dwnpVar;
                            if (g2 && efbmVar2.i(uri2)) {
                                String path = uri2.getPath();
                                if (path != null) {
                                    List s = dwxa.s(efbmVar2, uri2, path);
                                    dwnpVar2.copyOnWrite();
                                    dwns dwnsVar12 = (dwns) dwnpVar2.instance;
                                    dwns dwnsVar13 = dwns.a;
                                    dwnsVar12.a();
                                    eydl.addAll(s, dwnsVar12.h);
                                }
                            } else {
                                String str4 = dwsiVar.c;
                                long j2 = dwsiVar.e;
                                long j3 = dwsiVar.j;
                                String uri3 = uri2.toString();
                                if ((dwsiVar.b & 8192) != 0) {
                                    eydqVar3 = dwsiVar.q;
                                    if (eydqVar3 == null) {
                                        eydqVar3 = eydq.a;
                                    }
                                } else {
                                    eydqVar3 = null;
                                }
                                dwnpVar2.a(dwxa.n(str4, j2, j3, uri3, eydqVar3, true, dwsiVar.g));
                            }
                        } catch (IOException e) {
                            dxth.j(e, "Failed to list files under directory:".concat(String.valueOf(String.valueOf(uri2))));
                        }
                    }
                    return erre.a;
                }
            }, executor);
        } else {
            final dxig dxigVar = dxmiVar.d;
            final dycd f = dycd.e(erqt.i(dwsoVar.p)).f(new emwl() { // from class: dxgn
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Stream stream = Collection.EL.stream((List) obj);
                    Function function = new Function() { // from class: dxcy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return (dwsi) obj2;
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    };
                    final dwso dwsoVar2 = dwso.this;
                    return (enhk) stream.collect(endq.a(function, new Function() { // from class: dxcz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            dwsi dwsiVar = (dwsi) obj2;
                            int a = dwsm.a(dwso.this.k);
                            if (a == 0) {
                                a = 1;
                            }
                            return dxpp.a(dwsiVar, a);
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    }));
                }
            }, dxigVar.h);
            g = dycd.e(f.g(new eroh() { // from class: dxgp
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return dxig.this.e.c.f(enip.o(((enhk) obj).values()));
                }
            }, dxigVar.h).g(new eroh() { // from class: dxgq
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    enhk enhkVar = (enhk) obj;
                    enhk enhkVar2 = (enhk) erqt.q(dycd.this);
                    HashMap hashMap = new HashMap();
                    enqu listIterator = enhkVar2.entrySet().listIterator();
                    while (listIterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) listIterator.next();
                        if (enhkVar.containsKey(entry.getValue())) {
                            dwsi dwsiVar = (dwsi) entry.getKey();
                            dwtk b2 = dwtk.b(((dwtx) enhkVar.get(entry.getValue())).d);
                            if (b2 == null) {
                                b2 = dwtk.NONE;
                            }
                            hashMap.put(dwsiVar, b2);
                        }
                    }
                    return erqt.i(enhk.j(hashMap));
                }
            }, dxigVar.h)).g(new eroh() { // from class: dwwh
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    eydq eydqVar3;
                    enhk enhkVar = (enhk) obj;
                    for (dwsi dwsiVar : eygrVar3) {
                        String str4 = dwsiVar.c;
                        long j2 = dwsiVar.e;
                        long j3 = dwsiVar.j;
                        if ((dwsiVar.b & 8192) != 0) {
                            eydqVar3 = dwsiVar.q;
                            if (eydqVar3 == null) {
                                eydqVar3 = eydq.a;
                            }
                        } else {
                            eydqVar3 = null;
                        }
                        eydq eydqVar4 = eydqVar3;
                        boolean z3 = false;
                        if (enhkVar.containsKey(dwsiVar) && enhkVar.get(dwsiVar) == dwtk.DOWNLOAD_COMPLETE) {
                            z3 = true;
                        }
                        dwnpVar.a(dwxa.n(str4, j2, j3, null, eydqVar4, z3, dwsiVar.g));
                    }
                    return erre.a;
                }
            }, executor);
        }
        return dycd.e(g).f(new emwl() { // from class: dwwi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (dwns) dwnp.this.build();
            }
        }, executor).c(dwqn.class, new emwl() { // from class: dwwj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, executor);
    }

    private final ListenableFuture w(final boolean z) {
        return dycd.e(r()).g(new eroh() { // from class: dwuj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwxa dwxaVar = dwxa.this;
                return dwxaVar.d.d(z, dwxaVar.l);
            }
        }, this.i).g(new eroh() { // from class: dwuk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return dwxa.this.r();
            }
        }, this.i).g(new eroh() { // from class: dwul
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwxa dwxaVar = dwxa.this;
                return dwxaVar.d.d(z, dwxaVar.l);
            }
        }, this.i);
    }

    private final void x(final int i, final ListenableFuture listenableFuture, final long j, final erie erieVar, final dwwz dwwzVar, final dwwy dwwyVar) {
        listenableFuture.b(eldl.l(new Runnable() { // from class: dwui
            @Override // java.lang.Runnable
            public final void run() {
                final dwxa dwxaVar = dwxa.this;
                final long b = dwxaVar.m.b() - j;
                final erie erieVar2 = erieVar;
                final ListenableFuture listenableFuture2 = listenableFuture;
                final dwwy dwwyVar2 = dwwyVar;
                final dwwz dwwzVar2 = dwwzVar;
                final int i2 = i;
                elfr.g(new Runnable() { // from class: dwvd
                    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            r8 = this;
                            com.google.common.util.concurrent.ListenableFuture r0 = r3
                            dwwy r1 = r4
                            r2 = 4
                            java.lang.Object r0 = defpackage.erqt.q(r0)     // Catch: java.lang.Throwable -> L10
                            int r1 = r1.a(r0)     // Catch: java.lang.Throwable -> Le
                            goto L49
                        Le:
                            r1 = move-exception
                            goto L12
                        L10:
                            r1 = move-exception
                            r0 = 0
                        L12:
                            boolean r3 = r1 instanceof java.util.concurrent.ExecutionException
                            if (r3 == 0) goto L1a
                            java.lang.Throwable r1 = r1.getCause()
                        L1a:
                            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
                            if (r3 == 0) goto L20
                            r1 = 5
                            goto L49
                        L20:
                            boolean r3 = r1 instanceof java.lang.InterruptedException
                            if (r3 == 0) goto L26
                            r1 = 6
                            goto L49
                        L26:
                            boolean r3 = r1 instanceof java.io.IOException
                            if (r3 == 0) goto L2c
                            r1 = 7
                            goto L49
                        L2c:
                            boolean r3 = r1 instanceof java.lang.IllegalStateException
                            if (r3 == 0) goto L33
                            r1 = 8
                            goto L49
                        L33:
                            boolean r3 = r1 instanceof java.lang.IllegalArgumentException
                            if (r3 == 0) goto L3a
                            r1 = 9
                            goto L49
                        L3a:
                            boolean r3 = r1 instanceof java.lang.UnsupportedOperationException
                            if (r3 == 0) goto L41
                            r1 = 10
                            goto L49
                        L41:
                            boolean r1 = r1 instanceof defpackage.dwqn
                            if (r1 == 0) goto L48
                            r1 = 11
                            goto L49
                        L48:
                            r1 = r2
                        L49:
                            erie r3 = r2
                            if (r0 == 0) goto L63
                            dwwz r4 = r5
                            eyfq r3 = r3.toBuilder()
                            erid r3 = (defpackage.erid) r3
                            erie r0 = r4.a(r0)
                            r3.mergeFrom(r0)
                            eyfy r0 = r3.build()
                            r3 = r0
                            erie r3 = (defpackage.erie) r3
                        L63:
                            long r4 = r7
                            int r0 = r6
                            eriy r6 = defpackage.eriy.a
                            eyfq r6 = r6.createBuilder()
                            erix r6 = (defpackage.erix) r6
                            r6.copyOnWrite()
                            MessageType extends eyfy<MessageType, BuilderType> r7 = r6.instance
                            eriy r7 = (defpackage.eriy) r7
                            int r0 = r0 + (-2)
                            r7.c = r0
                            int r0 = r7.b
                            r0 = r0 | 1
                            r7.b = r0
                            r6.copyOnWrite()
                            MessageType extends eyfy<MessageType, BuilderType> r0 = r6.instance
                            eriy r0 = (defpackage.eriy) r0
                            int r1 = r1 + (-2)
                            r0.d = r1
                            int r1 = r0.b
                            r1 = r1 | 2
                            r0.b = r1
                            r6.copyOnWrite()
                            MessageType extends eyfy<MessageType, BuilderType> r0 = r6.instance
                            eriy r0 = (defpackage.eriy) r0
                            int r1 = r0.b
                            r1 = r1 | r2
                            r0.b = r1
                            r0.f = r4
                            r6.copyOnWrite()
                            MessageType extends eyfy<MessageType, BuilderType> r0 = r6.instance
                            eriy r0 = (defpackage.eriy) r0
                            r3.getClass()
                            eygr r1 = r0.e
                            boolean r2 = r1.c()
                            if (r2 != 0) goto Lb7
                            eygr r1 = defpackage.eyfy.mutableCopy(r1)
                            r0.e = r1
                        Lb7:
                            dwxa r1 = defpackage.dwxa.this
                            eygr r0 = r0.e
                            r0.add(r3)
                            eyfy r0 = r6.build()
                            eriy r0 = (defpackage.eriy) r0
                            dxsy r1 = r1.b
                            r1.g(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwvd.run():void");
                    }
                }, dwxaVar.i);
            }
        }), erpp.a);
    }

    @Override // defpackage.dwub
    public final ListenableFuture a(final dwnz dwnzVar) {
        long b = this.m.b();
        ListenableFuture b2 = this.p.b(new erog() { // from class: dwwd
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dwoc dwocVar = (dwoc) dwnzVar;
                dwpj dwpjVar = dwocVar.a;
                dxth.d("%s: Adding for download group = '%s', variant = '%s', buildId = '%d' and associating it with account = '%s', variant = '%s'", "MobileDataDownload", dwpjVar.c, dwpjVar.i, Long.valueOf(dwpjVar.h), String.valueOf(dwocVar.b.f()), String.valueOf(dwocVar.c.f()));
                dwxa dwxaVar = dwxa.this;
                boolean J = dwxaVar.f.J();
                dwpj dwpjVar2 = dwocVar.a;
                if (J && dwocVar.c.g() && !dwpjVar2.i.equals(dwocVar.c.c())) {
                    dxth.i("%s: Added group = '%s' with wrong variant id: '%s' v.s. '%s' ", "MobileDataDownload", dwpjVar2.c, dwocVar.c.c(), dwpjVar2.i);
                    return erqt.i(false);
                }
                if ((dwpjVar2.b & 2) == 0) {
                    dwpi dwpiVar = (dwpi) dwpjVar2.toBuilder();
                    String packageName = dwxaVar.a.getPackageName();
                    dwpiVar.copyOnWrite();
                    dwpj dwpjVar3 = (dwpj) dwpiVar.instance;
                    packageName.getClass();
                    dwpjVar3.b |= 2;
                    dwpjVar3.d = packageName;
                    dwpjVar2 = (dwpj) dwpiVar.build();
                } else if (!dwxaVar.a.getPackageName().equals(dwpjVar2.d)) {
                    dxth.i("%s: Added group = '%s' with wrong owner package: '%s' v.s. '%s' ", "MobileDataDownload", dwpjVar2.c, dwxaVar.a.getPackageName(), dwpjVar2.d);
                    return erqt.i(false);
                }
                dwtl dwtlVar = (dwtl) dwtm.a.createBuilder();
                String str = dwpjVar2.c;
                dwtlVar.copyOnWrite();
                dwtm dwtmVar = (dwtm) dwtlVar.instance;
                str.getClass();
                dwtmVar.b |= 1;
                dwtmVar.c = str;
                String str2 = dwpjVar2.d;
                dwtlVar.copyOnWrite();
                dwtm dwtmVar2 = (dwtm) dwtlVar.instance;
                str2.getClass();
                dwtmVar2.b = 2 | dwtmVar2.b;
                dwtmVar2.d = str2;
                if (dwocVar.b.g()) {
                    String a = dwxn.a((Account) dwocVar.b.c());
                    dwtlVar.copyOnWrite();
                    dwtm dwtmVar3 = (dwtm) dwtlVar.instance;
                    dwtmVar3.b = 4 | dwtmVar3.b;
                    dwtmVar3.e = a;
                }
                if (dwocVar.c.g()) {
                    Object c = dwocVar.c.c();
                    dwtlVar.copyOnWrite();
                    dwtm dwtmVar4 = (dwtm) dwtlVar.instance;
                    dwtmVar4.b |= 16;
                    dwtmVar4.g = (String) c;
                }
                try {
                    byte[] byteArray = dwpjVar2.toByteArray();
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    final dwso dwsoVar = (dwso) eyfy.parseFrom(dwso.a, byteArray, eyfc.a);
                    Stream map = Collection.EL.stream(dwpjVar2.g).map(new Function() { // from class: dxvn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            eyfw checkIsLite;
                            eyfw checkIsLite2;
                            dwph dwphVar = (dwph) obj;
                            for (dwsi dwsiVar : dwso.this.p) {
                                if (dwsiVar.c.equals(dwphVar.c)) {
                                    checkIsLite = eyfy.checkIsLite(dwqj.b);
                                    dwphVar.b(checkIsLite);
                                    if (!dwphVar.r.o(checkIsLite.d)) {
                                        return dwsiVar;
                                    }
                                    checkIsLite2 = eyfy.checkIsLite(dwqj.b);
                                    dwphVar.b(checkIsLite2);
                                    Object l = dwphVar.r.l(checkIsLite2.d);
                                    dwqj dwqjVar = (dwqj) (l == null ? checkIsLite2.b : checkIsLite2.c(l));
                                    dwsf dwsfVar = (dwsf) dwsiVar.toBuilder();
                                    long j = dwqjVar.d;
                                    dwsfVar.copyOnWrite();
                                    dwsi dwsiVar2 = (dwsi) dwsfVar.instance;
                                    dwsiVar2.b |= 4;
                                    dwsiVar2.e = j;
                                    long j2 = dwqjVar.e;
                                    dwsfVar.copyOnWrite();
                                    dwsi dwsiVar3 = (dwsi) dwsfVar.instance;
                                    dwsiVar3.b |= 128;
                                    dwsiVar3.j = j2;
                                    return (dwsi) dwsfVar.build();
                                }
                            }
                            throw new IllegalArgumentException("DataFileGroupInternal does not contain DataFile with fileId: ".concat(String.valueOf(dwphVar.c)));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = engw.d;
                    engw engwVar = (engw) map.collect(endq.a);
                    dwsn dwsnVar = (dwsn) dwsoVar.toBuilder();
                    dwsnVar.copyOnWrite();
                    ((dwso) dwsnVar.instance).p = dwso.emptyProtobufList();
                    dwsnVar.a(engwVar);
                    final dwso dwsoVar2 = (dwso) dwsnVar.build();
                    final dxmi dxmiVar = dwxaVar.d;
                    final dwtm dwtmVar5 = (dwtm) dwtlVar.build();
                    final eroh erohVar = dwxaVar.l;
                    dxth.c("%s addGroupForDownload %s", "MDDManager", dwtmVar5.c);
                    return elfr.f(elfr.k(dxmiVar.h(), new eroh() { // from class: dxmb
                        /* JADX WARN: Code restructure failed: missing block: B:176:0x0259, code lost:
                        
                            r20 = r8;
                            r24 = 3;
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.eroh
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r24) {
                            /*
                                Method dump skipped, instructions count: 1048
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.dxmb.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                        }
                    }, dxmiVar.n), IOException.class, new eroh() { // from class: dwvc
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            dxth.k((IOException) obj, "%s: IOException while adding group for download", "MobileDataDownload");
                            return erqt.i(false);
                        }
                    }, dwxaVar.i);
                } catch (eygu e) {
                    dxth.k(e, "%s: Unable to convert from DataFileGroup to DataFileGroupInternal.", "MobileDataDownload");
                    return erqt.i(false);
                }
            }
        }, this.i);
        erid eridVar = (erid) erie.a.createBuilder();
        dwoc dwocVar = (dwoc) dwnzVar;
        String str = dwocVar.a.c;
        eridVar.copyOnWrite();
        erie erieVar = (erie) eridVar.instance;
        str.getClass();
        erieVar.b |= 1;
        erieVar.c = str;
        long j = dwocVar.a.h;
        eridVar.copyOnWrite();
        erie erieVar2 = (erie) eridVar.instance;
        erieVar2.b |= 64;
        erieVar2.i = j;
        String str2 = dwocVar.a.i;
        eridVar.copyOnWrite();
        erie erieVar3 = (erie) eridVar.instance;
        str2.getClass();
        erieVar3.b |= 128;
        erieVar3.j = str2;
        boolean g = dwocVar.b.g();
        eridVar.copyOnWrite();
        erie erieVar4 = (erie) eridVar.instance;
        erieVar4.b |= 32;
        erieVar4.h = g;
        boolean g2 = dwocVar.c.g();
        eridVar.copyOnWrite();
        erie erieVar5 = (erie) eridVar.instance;
        erieVar5.b |= 256;
        erieVar5.k = g2;
        int i = dwocVar.a.e;
        eridVar.copyOnWrite();
        erie erieVar6 = (erie) eridVar.instance;
        erieVar6.b |= 2;
        erieVar6.d = i;
        String str3 = dwocVar.a.d;
        eridVar.copyOnWrite();
        erie erieVar7 = (erie) eridVar.instance;
        str3.getClass();
        erieVar7.b |= 4;
        erieVar7.e = str3;
        int size = dwocVar.a.g.size();
        eridVar.copyOnWrite();
        erie erieVar8 = (erie) eridVar.instance;
        erieVar8.b |= 8;
        erieVar8.f = size;
        final erie erieVar9 = (erie) eridVar.build();
        x(3, b2, b, erieVar9, new dwwz() { // from class: dwwe
            @Override // defpackage.dwwz
            public final erie a(Object obj) {
                return erie.this;
            }
        }, new dwwy() { // from class: dwwf
            @Override // defpackage.dwwy
            public final int a(Object obj) {
                return ((Boolean) obj).booleanValue() ? 3 : 4;
            }
        });
        return b2;
    }

    @Override // defpackage.dwub
    public final ListenableFuture b() {
        final dxmi dxmiVar = this.d;
        return this.p.b(new erog() { // from class: dwuw
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dxth.b("%s Clearing MDD internal storage", "MDDManager");
                dycd e = dycd.e(erre.a);
                final dxmi dxmiVar2 = dxmi.this;
                return e.g(new eroh() { // from class: dxku
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return dxmi.this.b();
                    }
                }, dxmiVar2.n).g(new eroh() { // from class: dxkw
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        dxmi dxmiVar3 = dxmi.this;
                        dxkk.b(dxmiVar3.b);
                        dxvw.a(dxmiVar3.b, "gms_icing_mdd_manager_metadata", dxmiVar3.m).edit().clear().commit();
                        dxmi.a = false;
                        return erre.a;
                    }
                }, dxmiVar2.n).g(new eroh() { // from class: dxkx
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return dxmi.this.q.a();
                    }
                }, dxmiVar2.n);
            }
        }, this.i);
    }

    @Override // defpackage.dwub
    public final ListenableFuture c(final dwqp dwqpVar) {
        return elfr.i(new erog() { // from class: dwug
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final dwxa dwxaVar = dwxa.this;
                final dwqp dwqpVar2 = dwqpVar;
                return elfr.k(dwxaVar.q(dwqpVar2), new eroh() { // from class: dwuq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        dxcc dxccVar = (dxcc) obj;
                        int b = dxccVar.b() - 1;
                        if (b == 1) {
                            return dxccVar.c();
                        }
                        if (b == 2) {
                            return erqt.i(dxccVar.a());
                        }
                        final dwqp dwqpVar3 = dwqpVar2;
                        final dwxa dwxaVar2 = dwxa.this;
                        dwtl dwtlVar = (dwtl) dwtm.a.createBuilder();
                        dwtlVar.copyOnWrite();
                        dwtm dwtmVar = (dwtm) dwtlVar.instance;
                        dwtmVar.b = 1 | dwtmVar.b;
                        dwoe dwoeVar = (dwoe) dwqpVar3;
                        dwtmVar.c = dwoeVar.a;
                        String packageName = dwxaVar2.a.getPackageName();
                        dwtlVar.copyOnWrite();
                        dwtm dwtmVar2 = (dwtm) dwtlVar.instance;
                        packageName.getClass();
                        dwtmVar2.b = 2 | dwtmVar2.b;
                        dwtmVar2.d = packageName;
                        if (dwoeVar.b.g()) {
                            String a = dwxn.a((Account) dwoeVar.b.c());
                            dwtlVar.copyOnWrite();
                            dwtm dwtmVar3 = (dwtm) dwtlVar.instance;
                            dwtmVar3.b |= 4;
                            dwtmVar3.e = a;
                        }
                        final dwtm dwtmVar4 = (dwtm) dwtlVar.build();
                        try {
                            final emxc j = ((dwoe) dwqpVar3).d.g() ? emxc.j(dxvo.a((dwpr) ((dwoe) dwqpVar3).d.c())) : emux.a;
                            final dxbq c = dxbq.c(dwoeVar.a, dwoeVar.b);
                            final errj errjVar = new errj(new Callable() { // from class: dwvn
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return null;
                                }
                            });
                            final dycd f = dycd.e(errjVar).g(new eroh() { // from class: dwvt
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    dwxa dwxaVar3 = dwxa.this;
                                    return dwxaVar3.d.e(dwtmVar4, j, dwxaVar3.l);
                                }
                            }, dwxaVar2.i).g(new eroh() { // from class: dwwc
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    dwtm dwtmVar5 = dwtmVar4;
                                    dwso dwsoVar = (dwso) obj2;
                                    dwxa dwxaVar3 = dwxa.this;
                                    emxc o = dwxa.o(dwtmVar5, dwsoVar, dwxaVar3.f);
                                    dwoe dwoeVar2 = (dwoe) dwqpVar3;
                                    return dwxa.u(dwsoVar, o, dwoeVar2.b.g() ? dwxn.a((Account) dwoeVar2.b.c()) : null, dwnr.DOWNLOADED, dwoeVar2.f, dwxaVar3.d, dwxaVar3.i, dwxaVar3.e);
                                }
                            }, dwxaVar2.i).f(new dwwm(), dwxaVar2.i);
                            final dycd g = dycd.e(dwxaVar2.h.b(((dxbp) c).a, f)).g(new eroh() { // from class: dwwn
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    errj.this.run();
                                    return f;
                                }
                            }, dwxaVar2.i);
                            dycd g2 = g.g(new eroh() { // from class: dwwo
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    return dwxa.this.h.e(((dxbp) c).a);
                                }
                            }, dwxaVar2.i).g(new eroh() { // from class: dwuh
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    return erqt.i((dwns) erqt.q(dycd.this));
                                }
                            }, dwxaVar2.i);
                            elfr.l(g2, new dwwp(dwxaVar2, c), dwxaVar2.i);
                            return g2;
                        } catch (eygu e) {
                            return erqt.h(e);
                        }
                    }
                }, dwxaVar.i);
            }
        }, this.i);
    }

    @Override // defpackage.dwub
    public final ListenableFuture d(final dwqp dwqpVar) {
        dxth.d("%s: downloadFileGroupWithForegroundService start for group %s package %s", "MobileDataDownload", ((dwoe) dwqpVar).a, this.a.getPackageName());
        if (!this.k.g()) {
            return erqt.h(new IllegalArgumentException("downloadFileGroupWithForegroundService: ForegroundDownloadService is not provided!"));
        }
        if (this.j.g()) {
            return elfr.i(new erog() { // from class: dwwk
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    final dwxa dwxaVar = dwxa.this;
                    final dwqp dwqpVar2 = dwqpVar;
                    return elfr.k(dwxaVar.q(dwqpVar2), new eroh() { // from class: dwwa
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            PendingIntent foregroundService;
                            dxcc dxccVar = (dxcc) obj;
                            int b = dxccVar.b() - 1;
                            if (b == 1) {
                                return dxccVar.c();
                            }
                            if (b == 2) {
                                return erqt.i(dxccVar.a());
                            }
                            final dwqp dwqpVar3 = dwqpVar2;
                            final dwxa dwxaVar2 = dwxa.this;
                            dwso d = dxccVar.d();
                            dxbr.c(dwxaVar2.a);
                            dwtl dwtlVar = (dwtl) dwtm.a.createBuilder();
                            dwtlVar.copyOnWrite();
                            dwtm dwtmVar = (dwtm) dwtlVar.instance;
                            dwtmVar.b |= 1;
                            dwoe dwoeVar = (dwoe) dwqpVar3;
                            String str = dwoeVar.a;
                            dwtmVar.c = str;
                            String packageName = dwxaVar2.a.getPackageName();
                            dwtlVar.copyOnWrite();
                            dwtm dwtmVar2 = (dwtm) dwtlVar.instance;
                            packageName.getClass();
                            dwtmVar2.b |= 2;
                            dwtmVar2.d = packageName;
                            if (dwoeVar.b.g()) {
                                String a = dwxn.a((Account) dwoeVar.b.c());
                                dwtlVar.copyOnWrite();
                                dwtm dwtmVar3 = (dwtm) dwtlVar.instance;
                                dwtmVar3.b |= 4;
                                dwtmVar3.e = a;
                            }
                            final dwtm dwtmVar4 = (dwtm) dwtlVar.build();
                            dxbq c = dxbq.c(str, dwoeVar.b);
                            dwta dwtaVar = d.n;
                            if (dwtaVar == null) {
                                dwtaVar = dwta.a;
                            }
                            int a2 = dwsx.a(dwtaVar.d);
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            if (dwoeVar.d.g()) {
                                try {
                                    a2 = dwsx.a(dxvo.a((dwpr) ((dwoe) dwqpVar3).d.c()).d);
                                    if (a2 == 0) {
                                        a2 = 1;
                                    }
                                } catch (eygu unused) {
                                }
                            }
                            int i = a2 - 1;
                            String string = (i == 0 || i == 2) ? dwxaVar2.a.getResources().getString(R.string.mdd_notification_download_paused_wifi) : dwxaVar2.a.getResources().getString(R.string.mdd_notification_download_paused);
                            kno knoVar = new kno(dwxaVar2.a);
                            String str2 = dwoeVar.a;
                            emxc emxcVar = dwoeVar.b;
                            Context context = dwxaVar2.a;
                            dxbq c2 = dxbq.c(str2, emxcVar);
                            kml b2 = dxbr.b(context);
                            b2.i(str2);
                            b2.h(str2);
                            b2.g = null;
                            b2.r(android.R.drawable.stat_sys_download);
                            b2.o(true);
                            b2.q(0, 0, false);
                            String str3 = dwoeVar.a;
                            int i2 = dwoeVar.g;
                            int hashCode = str3.hashCode();
                            if (i2 == 2) {
                                Context context2 = dwxaVar2.a;
                                emxc emxcVar2 = dwxaVar2.k;
                                String str4 = ((dxbp) c2).a;
                                Intent intent = new Intent(context2, (Class<?>) emxcVar2.c());
                                intent.setPackage(context2.getPackageName());
                                intent.putExtra("cancel-action", hashCode);
                                intent.putExtra("key", str4);
                                foregroundService = PendingIntent.getForegroundService(context2, hashCode, eepf.f(intent, 1140850688, 0), 1140850688);
                                String string2 = context2.getResources().getString(R.string.mdd_notification_action_cancel);
                                foregroundService.getClass();
                                b2.e(new klz(android.R.drawable.stat_sys_warning, string2, foregroundService).a());
                                knoVar.f(hashCode, b2.a());
                            }
                            dwww dwwwVar = new dwww(dwxaVar2, c2, dwqpVar3, b2, knoVar, hashCode, string);
                            emxc emxcVar3 = dwxaVar2.j;
                            String str5 = dwoeVar.a;
                            Object c3 = emxcVar3.c();
                            synchronized (dxxc.class) {
                                if (!((dxxc) c3).c.containsKey(str5)) {
                                    HashMap hashMap = ((dxxc) c3).c;
                                    dxxb dxxbVar = new dxxb((dxxc) c3, str5, dwwwVar);
                                    final dxbv dxbvVar = ((dxxc) c3).d;
                                    hashMap.put(str5, new efdm(dxxbVar, new efdk() { // from class: dxwz
                                        @Override // defpackage.efdk
                                        public final long a() {
                                            return dxbv.this.a();
                                        }
                                    }, 1000L, TimeUnit.MILLISECONDS));
                                }
                            }
                            try {
                                final emxc j = ((dwoe) dwqpVar3).d.g() ? emxc.j(dxvo.a((dwpr) ((dwoe) dwqpVar3).d.c())) : emux.a;
                                final errj errjVar = new errj(new Callable() { // from class: dwvk
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return null;
                                    }
                                });
                                final dycd f = dycd.e(errjVar).g(new eroh() { // from class: dwvl
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        dwxa dwxaVar3 = dwxa.this;
                                        return dwxaVar3.d.e(dwtmVar4, j, dwxaVar3.l);
                                    }
                                }, dwxaVar2.i).g(new eroh() { // from class: dwvm
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        dwtm dwtmVar5 = dwtmVar4;
                                        dwso dwsoVar = (dwso) obj2;
                                        dwxa dwxaVar3 = dwxa.this;
                                        emxc o = dwxa.o(dwtmVar5, dwsoVar, dwxaVar3.f);
                                        dwoe dwoeVar2 = (dwoe) dwqpVar3;
                                        return dwxa.u(dwsoVar, o, dwoeVar2.b.g() ? dwxn.a((Account) dwoeVar2.b.c()) : null, dwnr.DOWNLOADED, dwoeVar2.f, dwxaVar3.d, dwxaVar3.i, dwxaVar3.e);
                                    }
                                }, dwxaVar2.i).f(new dwwm(), dwxaVar2.i);
                                ListenableFuture k = elfr.k(dwxaVar2.g.b(((dxbp) c).a, f), new eroh() { // from class: dwvo
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        errj.this.run();
                                        return f;
                                    }
                                }, dwxaVar2.i);
                                elfr.l(k, new dwwq(dwwwVar), dwxaVar2.i);
                                return k;
                            } catch (eygu e) {
                                return erqt.h(e);
                            }
                        }
                    }, dwxaVar.i);
                }
            }, this.i);
        }
        dwql a = dwqn.a();
        a.a = dwqm.DOWNLOAD_MONITOR_NOT_PROVIDED_ERROR;
        a.b = "downloadFileGroupWithForegroundService: Download Monitor is not provided!";
        return erqt.h(a.a());
    }

    @Override // defpackage.dwub
    public final ListenableFuture e(final dwrq dwrqVar) {
        long b = this.m.b();
        ListenableFuture b2 = this.p.b(new erog() { // from class: dwur
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dwtl dwtlVar = (dwtl) dwtm.a.createBuilder();
                dwtlVar.copyOnWrite();
                dwtm dwtmVar = (dwtm) dwtlVar.instance;
                dwtmVar.b |= 1;
                final dwrq dwrqVar2 = dwrqVar;
                dwtmVar.c = ((dwog) dwrqVar2).a;
                final dwxa dwxaVar = dwxa.this;
                String packageName = dwxaVar.a.getPackageName();
                dwtlVar.copyOnWrite();
                dwtm dwtmVar2 = (dwtm) dwtlVar.instance;
                packageName.getClass();
                dwtmVar2.b |= 2;
                dwtmVar2.d = packageName;
                final dwtm dwtmVar3 = (dwtm) dwtlVar.build();
                return elfr.k(dwxaVar.d.g(dwtmVar3, true), new eroh() { // from class: dwvz
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        dwrq dwrqVar3 = dwrqVar2;
                        dwso dwsoVar = (dwso) obj;
                        if (dwsoVar == null) {
                            dxth.c("%s: File group with name %s not found", "MobileDataDownload", ((dwog) dwrqVar3).a);
                        } else {
                            dxth.c("%s: File group with name %s found", "MobileDataDownload", ((dwog) dwrqVar3).a);
                        }
                        return dwxa.this.v(dwtmVar3, dwsoVar, true, ((dwog) dwrqVar3).b);
                    }
                }, dwxaVar.i);
            }
        }, this.i);
        erid eridVar = (erid) erie.a.createBuilder();
        eridVar.copyOnWrite();
        erie erieVar = (erie) eridVar.instance;
        erieVar.b |= 1;
        erieVar.c = ((dwog) dwrqVar).a;
        eridVar.copyOnWrite();
        erie erieVar2 = (erie) eridVar.instance;
        erieVar2.b |= 32;
        erieVar2.h = false;
        eridVar.copyOnWrite();
        erie erieVar3 = (erie) eridVar.instance;
        erieVar3.b |= 2;
        erieVar3.d = -1;
        eridVar.copyOnWrite();
        erie erieVar4 = (erie) eridVar.instance;
        erieVar4.b |= 64;
        erieVar4.i = -1L;
        x(4, b2, b, (erie) eridVar.build(), new dwwz() { // from class: dwus
            @Override // defpackage.dwwz
            public final erie a(Object obj) {
                return dwxa.p((dwns) obj);
            }
        }, new dwwy() { // from class: dwut
            @Override // defpackage.dwwy
            public final int a(Object obj) {
                return 3;
            }
        });
        return b2;
    }

    @Override // defpackage.dwub
    public final ListenableFuture f(final dwrs dwrsVar) {
        return this.p.b(new erog() { // from class: dwuo
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final dwxa dwxaVar = dwxa.this;
                ListenableFuture f = dwxaVar.d.f();
                final dwrs dwrsVar2 = dwrsVar;
                return elfr.k(elfr.j(f, new emwl() { // from class: dwuu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        List<dxqb> list = (List) obj;
                        int i = engw.d;
                        engr engrVar = new engr();
                        if (((dwoi) dwrs.this).a) {
                            engrVar.j(list);
                            return engrVar.g();
                        }
                        for (dxqb dxqbVar : list) {
                            dxqbVar.b();
                            dxqbVar.a();
                            engrVar.h(dxqbVar);
                        }
                        return engrVar.g();
                    }
                }, dwxaVar.i), new eroh() { // from class: dwuv
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        engw engwVar = (engw) obj;
                        int i = engw.d;
                        ListenableFuture i2 = erqt.i(new engr());
                        int size = engwVar.size();
                        int i3 = 0;
                        while (true) {
                            final dwxa dwxaVar2 = dwxa.this;
                            if (i3 >= size) {
                                return elfr.j(i2, new emwl() { // from class: dwvi
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        return ((engr) obj2).g();
                                    }
                                }, dwxaVar2.i);
                            }
                            final dwrs dwrsVar3 = dwrsVar2;
                            final dxqb dxqbVar = (dxqb) engwVar.get(i3);
                            i2 = elfr.k(i2, new eroh() { // from class: dwvh
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    final engr engrVar = (engr) obj2;
                                    dxqb dxqbVar2 = dxqbVar;
                                    dwtm b = dxqbVar2.b();
                                    dwso a = dxqbVar2.a();
                                    boolean z = b.f;
                                    boolean z2 = ((dwoi) dwrsVar3).b;
                                    dwxa dwxaVar3 = dwxa.this;
                                    return elfr.j(dwxaVar3.v(b, a, z, z2), new emwl() { // from class: dwwb
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            engr engrVar2 = engr.this;
                                            dwns dwnsVar = (dwns) obj3;
                                            if (dwnsVar != null) {
                                                engrVar2.h(dwnsVar);
                                            }
                                            return engrVar2;
                                        }
                                    }, dwxaVar3.i);
                                }
                            }, dwxaVar2.i);
                            i3++;
                        }
                    }
                }, dwxaVar.i);
            }
        }, this.i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dwub
    public final ListenableFuture g(String str) {
        char c;
        switch (str.hashCode()) {
            case -2105562759:
                if (str.equals("MDD.MAINTENANCE.PERIODIC.GCM.TASK")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1202768674:
                if (str.equals("MDD.CELLULAR.CHARGING.PERIODIC.TASK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -69128772:
                if (str.equals("MDD.CHARGING.PERIODIC.TASK")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 437964371:
                if (str.equals("MDD.WIFI.CHARGING.PERIODIC.TASK")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            dycc dyccVar = this.p;
            final dxmi dxmiVar = this.d;
            return dyccVar.b(new erog() { // from class: dwum
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    dxth.b("%s Running maintenance", "MDDManager");
                    final dxmi dxmiVar2 = dxmi.this;
                    return dycd.e(dxmiVar2.h()).g(new eroh() { // from class: dxlt
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            dxmi dxmiVar3 = dxmi.this;
                            return !dxmiVar3.p.D() ? erqt.i(-1) : dycd.e(dxmiVar3.q.c()).c(IOException.class, new emwl() { // from class: dxlh
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    boolean z = dxmi.a;
                                    dxth.e((IOException) obj2, "Failed to update days since last maintenance", new Object[0]);
                                    return emxc.j(-1);
                                }
                            }, erpp.a).f(new emwl() { // from class: dxli
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    emxc emxcVar = (emxc) obj2;
                                    boolean z = dxmi.a;
                                    if (!emxcVar.g()) {
                                        return -1;
                                    }
                                    Integer num = (Integer) emxcVar.c();
                                    if (num.intValue() < 0) {
                                        return -1;
                                    }
                                    return num;
                                }
                            }, erpp.a);
                        }
                    }, erpp.a).g(new eroh() { // from class: dxlu
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            ListenableFuture c2;
                            ListenableFuture h;
                            Integer num = (Integer) obj;
                            ArrayList arrayList = new ArrayList();
                            dxth.b("%s checkResetTrigger", "MDDManager");
                            final dxmi dxmiVar3 = dxmi.this;
                            arrayList.add(elfr.k(dxmiVar3.h(), new eroh() { // from class: dxmd
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    dxmi dxmiVar4 = dxmi.this;
                                    SharedPreferences a = dxvw.a(dxmiVar4.b, "gms_icing_mdd_manager_metadata", dxmiVar4.m);
                                    if (!a.contains("gms_icing_mdd_reset_trigger")) {
                                        a.edit().putInt("gms_icing_mdd_reset_trigger", dxmiVar4.p.l()).commit();
                                    }
                                    int i = a.getInt("gms_icing_mdd_reset_trigger", 0);
                                    int l = dxmiVar4.p.l();
                                    if (i >= l) {
                                        return erre.a;
                                    }
                                    a.edit().putInt("gms_icing_mdd_reset_trigger", l).commit();
                                    dxth.b("%s Received reset trigger. Clearing all Mdd data.", "MDDManager");
                                    dxmiVar4.c.l(1045);
                                    return dxmiVar4.b();
                                }
                            }, dxmiVar3.n));
                            if (dxmiVar3.p.O()) {
                                final dxig dxigVar = dxmiVar3.d;
                                arrayList.add(dxigVar.m(new eroh() { // from class: dxhv
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        final dxqb dxqbVar = (dxqb) obj2;
                                        final dwso a = dxqbVar.a();
                                        for (final dwsi dwsiVar : a.p) {
                                            int a2 = dwsm.a(a.k);
                                            if (a2 == 0) {
                                                a2 = 1;
                                            }
                                            final dxig dxigVar2 = dxig.this;
                                            final dwtt a3 = dxpp.a(dwsiVar, a2);
                                            final dxpn dxpnVar = dxigVar2.e;
                                            elfr.f(dycd.e(dxpnVar.g(a3)).g(new eroh() { // from class: dxoe
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj3) {
                                                    final dwtx dwtxVar = (dwtx) obj3;
                                                    dwtk b = dwtk.b(dwtxVar.d);
                                                    if (b == null) {
                                                        b = dwtk.NONE;
                                                    }
                                                    if (b != dwtk.DOWNLOAD_COMPLETE) {
                                                        return erre.a;
                                                    }
                                                    final dwsi dwsiVar2 = dwsiVar;
                                                    final dwtt dwttVar = a3;
                                                    final dxpn dxpnVar2 = dxpn.this;
                                                    return dycd.e(dxpnVar2.e(dwttVar)).g(new eroh() { // from class: dxos
                                                        @Override // defpackage.eroh
                                                        public final ListenableFuture a(Object obj4) {
                                                            Uri uri = (Uri) obj4;
                                                            if (uri == null) {
                                                                dwql a4 = dwqn.a();
                                                                a4.a = dwqm.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                                                                throw a4.a();
                                                            }
                                                            dwtx dwtxVar2 = dwtxVar;
                                                            dxpn dxpnVar3 = dxpn.this;
                                                            if (!dwtxVar2.e) {
                                                                dwsi dwsiVar3 = dwsiVar2;
                                                                dxsf.c(dxpnVar3.e, dwsiVar3, uri, dwsiVar3.g);
                                                            } else if (!dxpnVar3.e.h(uri)) {
                                                                dwql a5 = dwqn.a();
                                                                a5.a = dwqm.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                                                                throw a5.a();
                                                            }
                                                            return erre.a;
                                                        }
                                                    }, dxpnVar2.l).d(dwqn.class, new eroh() { // from class: dxot
                                                        @Override // defpackage.eroh
                                                        public final ListenableFuture a(Object obj4) {
                                                            dxth.h("%s: reVerifyFile lost or corrupted code %s", "SharedFileManager", ((dwqn) obj4).a);
                                                            dwtw dwtwVar = (dwtw) dwtxVar.toBuilder();
                                                            dwtk dwtkVar = dwtk.CORRUPTED;
                                                            dwtwVar.copyOnWrite();
                                                            dwtx dwtxVar2 = (dwtx) dwtwVar.instance;
                                                            dwtxVar2.d = dwtkVar.h;
                                                            dwtxVar2.b |= 2;
                                                            dwtx dwtxVar3 = (dwtx) dwtwVar.build();
                                                            dxpn dxpnVar3 = dxpn.this;
                                                            return dycd.e(dxpnVar3.c.h(dwttVar, dwtxVar3)).g(new eroh() { // from class: dxpi
                                                                @Override // defpackage.eroh
                                                                public final ListenableFuture a(Object obj5) {
                                                                    dxpo dxpoVar = new dxpo();
                                                                    if (((Boolean) obj5).booleanValue()) {
                                                                        throw dxpoVar;
                                                                    }
                                                                    throw new IOException("failed to save sharedFilesMetadata", dxpoVar);
                                                                }
                                                            }, dxpnVar3.l);
                                                        }
                                                    }, dxpnVar2.l);
                                                }
                                            }, dxpnVar.l), dxpo.class, new eroh() { // from class: dxhw
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj3) {
                                                    dxth.g("%s: Missing file. Logging and deleting file group.", "FileGroupManager");
                                                    dxig dxigVar3 = dxig.this;
                                                    dxig.C(1062, dxigVar3.b, a);
                                                    if (!dxigVar3.k.z()) {
                                                        return erre.a;
                                                    }
                                                    return dxigVar3.r(dxigVar3.d.i(dxqbVar.b()), new eroh() { // from class: dxdd
                                                        @Override // defpackage.eroh
                                                        public final ListenableFuture a(Object obj4) {
                                                            return erre.a;
                                                        }
                                                    });
                                                }
                                            }, dxigVar2.h);
                                        }
                                        return erre.a;
                                    }
                                }));
                            }
                            if (dxmiVar3.p.R()) {
                                final dxig dxigVar2 = dxmiVar3.d;
                                arrayList.add(dxigVar2.r(dxigVar2.d.d(), new eroh() { // from class: dxga
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it = ((List) obj2).iterator();
                                        while (true) {
                                            final dxig dxigVar3 = dxig.this;
                                            if (!it.hasNext()) {
                                                return dycg.a(arrayList2).a(new Callable() { // from class: dxei
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() {
                                                        return null;
                                                    }
                                                }, dxigVar3.h);
                                            }
                                            final dwtm dwtmVar = (dwtm) it.next();
                                            if (!dxigVar3.v(dwtmVar.d)) {
                                                arrayList2.add(dxigVar3.r(dxigVar3.d.g(dwtmVar), new eroh() { // from class: dxeh
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj3) {
                                                        if (((dwso) obj3) == null) {
                                                            return erre.a;
                                                        }
                                                        dwtm dwtmVar2 = dwtmVar;
                                                        final dxig dxigVar4 = dxig.this;
                                                        dxth.d("%s: Deleting file group %s for uninstalled app %s", "FileGroupManager", dwtmVar2.c, dwtmVar2.d);
                                                        dxigVar4.b.l(1049);
                                                        return dxigVar4.r(dxigVar4.d.i(dwtmVar2), new eroh() { // from class: dxdr
                                                            @Override // defpackage.eroh
                                                            public final ListenableFuture a(Object obj4) {
                                                                if (!((Boolean) obj4).booleanValue()) {
                                                                    dxig.this.b.l(1036);
                                                                }
                                                                return erre.a;
                                                            }
                                                        });
                                                    }
                                                }));
                                            }
                                        }
                                    }
                                }));
                            }
                            if (dxmiVar3.p.Q()) {
                                final dxig dxigVar3 = dxmiVar3.d;
                                if (dxigVar3.g.g()) {
                                    try {
                                        dwxm dwxmVar = (dwxm) dxigVar3.g.c();
                                        engw p = engw.p(dwxmVar.b.getAccountsByTypeForPackage("com.google", dwxmVar.a));
                                        enin eninVar = new enin();
                                        int i = ((enou) p).c;
                                        for (int i2 = 0; i2 < i; i2++) {
                                            Account account = (Account) p.get(i2);
                                            if (account.name != null && account.type != null) {
                                                eninVar.c(dwxn.a(account));
                                            }
                                        }
                                        final enip g = eninVar.g();
                                        h = dxigVar3.r(dxigVar3.d.d(), new eroh() { // from class: dxdh
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj2) {
                                                ArrayList arrayList2 = new ArrayList();
                                                Iterator it = ((List) obj2).iterator();
                                                while (true) {
                                                    final dxig dxigVar4 = dxig.this;
                                                    if (!it.hasNext()) {
                                                        return dycg.a(arrayList2).a(new Callable() { // from class: dxfa
                                                            @Override // java.util.concurrent.Callable
                                                            public final Object call() {
                                                                return null;
                                                            }
                                                        }, dxigVar4.h);
                                                    }
                                                    final dwtm dwtmVar = (dwtm) it.next();
                                                    if (!dwtmVar.e.isEmpty() && !g.contains(dwtmVar.e)) {
                                                        arrayList2.add(dxigVar4.r(dxigVar4.d.g(dwtmVar), new eroh() { // from class: dxez
                                                            @Override // defpackage.eroh
                                                            public final ListenableFuture a(Object obj3) {
                                                                final dwso dwsoVar = (dwso) obj3;
                                                                if (dwsoVar == null) {
                                                                    return erre.a;
                                                                }
                                                                dwtm dwtmVar2 = dwtmVar;
                                                                final dxig dxigVar5 = dxig.this;
                                                                dxth.d("%s: Deleting file group %s for removed account %s", "FileGroupManager", dwtmVar2.c, dwtmVar2.d);
                                                                dxig.C(1050, dxigVar5.b, dwsoVar);
                                                                return dxigVar5.r(dxigVar5.d.i(dwtmVar2), new eroh() { // from class: dxhr
                                                                    @Override // defpackage.eroh
                                                                    public final ListenableFuture a(Object obj4) {
                                                                        if (!((Boolean) obj4).booleanValue()) {
                                                                            dxig.C(1036, dxig.this.b, dwsoVar);
                                                                        }
                                                                        return erre.a;
                                                                    }
                                                                });
                                                            }
                                                        }));
                                                    }
                                                }
                                            }
                                        });
                                    } catch (RuntimeException e) {
                                        h = erqt.h(e);
                                    }
                                } else {
                                    h = erre.a;
                                }
                                arrayList.add(h);
                            }
                            if (dxmiVar3.p.I()) {
                                final dxig dxigVar4 = dxmiVar3.d;
                                arrayList.add(dxigVar4.m(new eroh() { // from class: dxho
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        dxqb dxqbVar = (dxqb) obj2;
                                        dwtm b = dxqbVar.b();
                                        final dwso a = dxqbVar.a();
                                        boolean z = b.f;
                                        final dxig dxigVar5 = dxig.this;
                                        if (z && dxvk.j(a)) {
                                            return dxigVar5.r((dxigVar5.k.I() && dxvk.j(a)) ? dycd.e(dxigVar5.k(a)).f(new emwl() { // from class: dxed
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj3) {
                                                    dxig dxigVar6 = dxig.this;
                                                    dwso dwsoVar = a;
                                                    enhk c3 = dxigVar6.c(dxigVar6.b(dwsoVar), (enhk) obj3);
                                                    for (dwsi dwsiVar : dwsoVar.p) {
                                                        if (!c3.containsKey(dwsiVar)) {
                                                            dxth.p("%s: Detected corruption of isolated structure for group %s %s", "FileGroupManager", dwsoVar.d, dwsiVar.c);
                                                            return false;
                                                        }
                                                    }
                                                    return true;
                                                }
                                            }, dxigVar5.h) : erqt.i(true), new eroh() { // from class: dxhu
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj3) {
                                                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                                                    final dxig dxigVar6 = dxig.this;
                                                    final dwso dwsoVar = a;
                                                    if (!booleanValue) {
                                                        return dycd.e(dxigVar6.d(dwsoVar)).d(dwqn.class, new eroh() { // from class: dxef
                                                            @Override // defpackage.eroh
                                                            public final ListenableFuture a(Object obj4) {
                                                                dwso dwsoVar2 = dwsoVar;
                                                                dxth.q((dwqn) obj4, "%s: Unable to correct isolated structure, returning null instead of group %s", "FileGroupManager", dwsoVar2.d);
                                                                dxig.this.b.p(dxig.x(dwsoVar2), 5);
                                                                return erre.a;
                                                            }
                                                        }, erpp.a).g(new eroh() { // from class: dxeg
                                                            @Override // defpackage.eroh
                                                            public final ListenableFuture a(Object obj4) {
                                                                dxig.this.b.p(dxig.x(dwsoVar), 4);
                                                                return erre.a;
                                                            }
                                                        }, erpp.a);
                                                    }
                                                    dxigVar6.b.p(dxig.x(dwsoVar), 3);
                                                    return erre.a;
                                                }
                                            });
                                        }
                                        dxigVar5.b.p(dxig.x(a), 2);
                                        return erre.a;
                                    }
                                }));
                            }
                            if (dxmiVar3.p.T()) {
                                final dxcu dxcuVar = dxmiVar3.h;
                                arrayList.add(elfr.k(elfr.k(dxcuVar.b.e(), new eroh() { // from class: dxci
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        final ArrayList arrayList2 = new ArrayList();
                                        Iterator it = ((List) obj2).iterator();
                                        while (true) {
                                            final dxcu dxcuVar2 = dxcu.this;
                                            if (!it.hasNext()) {
                                                return elfr.k(dxcuVar2.b.k(), new eroh() { // from class: dxcj
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj3) {
                                                        final dxcu dxcuVar3 = dxcu.this;
                                                        return elfr.k(dxcuVar3.b.m(arrayList2), new eroh() { // from class: dxcl
                                                            @Override // defpackage.eroh
                                                            public final ListenableFuture a(Object obj4) {
                                                                if (!((Boolean) obj4).booleanValue()) {
                                                                    dxcu.this.e.l(1036);
                                                                    dxth.g("%s: Failed to write back stale groups!", "ExpirationHandler");
                                                                }
                                                                return erre.a;
                                                            }
                                                        }, dxcuVar3.i);
                                                    }
                                                }, dxcuVar2.i);
                                            }
                                            dwso dwsoVar = (dwso) it.next();
                                            TimeUnit timeUnit = TimeUnit.SECONDS;
                                            dwsk dwskVar = dwsoVar.c;
                                            if (dwskVar == null) {
                                                dwskVar = dwsk.a;
                                            }
                                            if (dxvk.l(Math.min(timeUnit.toMillis(dwskVar.c), dxvk.a(dwsoVar)), dxcuVar2.k)) {
                                                dxcuVar2.e.m(1052, dwsoVar.d, dwsoVar.f, dwsoVar.t, dwsoVar.u);
                                                if (dxvk.j(dwsoVar)) {
                                                    dxvk.f(dxcuVar2.a, dxcuVar2.g, dwsoVar, dxcuVar2.f);
                                                }
                                            } else {
                                                arrayList2.add(dwsoVar);
                                            }
                                        }
                                    }
                                }, dxcuVar.i), new eroh() { // from class: dxcg
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        final dxcu dxcuVar2 = dxcu.this;
                                        return elfr.k(elfr.k(dxcuVar2.b.c(), new eroh() { // from class: dxce
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj3) {
                                                ArrayList arrayList2 = new ArrayList();
                                                Iterator it = ((List) obj3).iterator();
                                                while (true) {
                                                    final dxcu dxcuVar3 = dxcu.this;
                                                    if (!it.hasNext()) {
                                                        return elfr.j(dxcuVar3.b.j(arrayList2), new emwl() { // from class: dxcm
                                                            @Override // defpackage.emwl
                                                            public final Object apply(Object obj4) {
                                                                if (((Boolean) obj4).booleanValue()) {
                                                                    return null;
                                                                }
                                                                dxcu.this.e.l(1036);
                                                                dxth.g("%s: Failed to remove expired groups!", "ExpirationHandler");
                                                                return null;
                                                            }
                                                        }, dxcuVar3.i);
                                                    }
                                                    dxqb dxqbVar = (dxqb) it.next();
                                                    dwtm b = dxqbVar.b();
                                                    dwso a = dxqbVar.a();
                                                    long a2 = dxvk.a(a);
                                                    Long valueOf = Long.valueOf(a2);
                                                    dxth.d("%s: Checking group %s with expiration date %s", "ExpirationHandler", a.d, valueOf);
                                                    valueOf.getClass();
                                                    if (dxvk.l(a2, dxcuVar3.k)) {
                                                        dxcuVar3.e.m(1051, a.d, a.f, a.t, a.u);
                                                        dxth.d("%s: Expired group %s with expiration date %s", "ExpirationHandler", a.d, valueOf);
                                                        arrayList2.add(b);
                                                        if (dxvk.j(a)) {
                                                            dxvk.f(dxcuVar3.a, dxcuVar3.g, a, dxcuVar3.f);
                                                        }
                                                    }
                                                }
                                            }
                                        }, dxcuVar2.i), new eroh() { // from class: dxck
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj3) {
                                                final dxcu dxcuVar3 = dxcu.this;
                                                return elfr.k(elfr.k(dxcuVar3.b.c(), new eroh() { // from class: dxcd
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj4) {
                                                        final HashSet hashSet = new HashSet();
                                                        final ArrayList arrayList2 = new ArrayList();
                                                        Iterator it = ((List) obj4).iterator();
                                                        while (it.hasNext()) {
                                                            arrayList2.add(((dxqb) it.next()).a());
                                                        }
                                                        final dxcu dxcuVar4 = dxcu.this;
                                                        return elfr.j(dxcuVar4.b.e(), new emwl() { // from class: dxco
                                                            @Override // defpackage.emwl
                                                            public final Object apply(Object obj5) {
                                                                List list = arrayList2;
                                                                list.addAll((List) obj5);
                                                                Iterator it2 = list.iterator();
                                                                while (true) {
                                                                    Set set = hashSet;
                                                                    if (!it2.hasNext()) {
                                                                        return set;
                                                                    }
                                                                    dwso dwsoVar = (dwso) it2.next();
                                                                    for (dwsi dwsiVar : dwsoVar.p) {
                                                                        dxcu dxcuVar5 = dxcu.this;
                                                                        int a = dwsm.a(dwsoVar.k);
                                                                        if (a == 0) {
                                                                            a = 1;
                                                                        }
                                                                        Context context = dxcuVar5.a;
                                                                        dwxf dwxfVar = dxcuVar5.h;
                                                                        dwts dwtsVar = (dwts) dwtt.a.createBuilder();
                                                                        String e2 = dxvk.e(dwsiVar);
                                                                        int ordinal = dxkk.a(context, dwxfVar).ordinal();
                                                                        if (ordinal == 0) {
                                                                            String str2 = dwsiVar.d;
                                                                            dwtsVar.copyOnWrite();
                                                                            dwtt dwttVar = (dwtt) dwtsVar.instance;
                                                                            str2.getClass();
                                                                            dwttVar.b = 1 | dwttVar.b;
                                                                            dwttVar.c = str2;
                                                                            long j = dwsiVar.e;
                                                                            dwtsVar.copyOnWrite();
                                                                            dwtt dwttVar2 = (dwtt) dwtsVar.instance;
                                                                            dwttVar2.b = 2 | dwttVar2.b;
                                                                            dwttVar2.d = j;
                                                                            dwtsVar.copyOnWrite();
                                                                            dwtt dwttVar3 = (dwtt) dwtsVar.instance;
                                                                            e2.getClass();
                                                                            dwttVar3.b |= 4;
                                                                            dwttVar3.e = e2;
                                                                            dwtsVar.copyOnWrite();
                                                                            dwtt dwttVar4 = (dwtt) dwtsVar.instance;
                                                                            dwttVar4.f = a - 1;
                                                                            dwttVar4.b |= 8;
                                                                        } else if (ordinal == 1) {
                                                                            String str3 = dwsiVar.d;
                                                                            dwtsVar.copyOnWrite();
                                                                            dwtt dwttVar5 = (dwtt) dwtsVar.instance;
                                                                            str3.getClass();
                                                                            dwttVar5.b = 1 | dwttVar5.b;
                                                                            dwttVar5.c = str3;
                                                                            long j2 = dwsiVar.e;
                                                                            dwtsVar.copyOnWrite();
                                                                            dwtt dwttVar6 = (dwtt) dwtsVar.instance;
                                                                            dwttVar6.b |= 2;
                                                                            dwttVar6.d = j2;
                                                                            dwtsVar.copyOnWrite();
                                                                            dwtt dwttVar7 = (dwtt) dwtsVar.instance;
                                                                            e2.getClass();
                                                                            dwttVar7.b |= 4;
                                                                            dwttVar7.e = e2;
                                                                            dwtsVar.copyOnWrite();
                                                                            dwtt dwttVar8 = (dwtt) dwtsVar.instance;
                                                                            dwttVar8.f = a - 1;
                                                                            dwttVar8.b |= 8;
                                                                            if ((dwsiVar.b & 32) != 0) {
                                                                                fasl faslVar = dwsiVar.h;
                                                                                if (faslVar == null) {
                                                                                    faslVar = fasl.a;
                                                                                }
                                                                                dwtsVar.copyOnWrite();
                                                                                dwtt dwttVar9 = (dwtt) dwtsVar.instance;
                                                                                faslVar.getClass();
                                                                                dwttVar9.g = faslVar;
                                                                                dwttVar9.b |= 16;
                                                                            }
                                                                        } else if (ordinal == 2) {
                                                                            dwtsVar.copyOnWrite();
                                                                            dwtt dwttVar10 = (dwtt) dwtsVar.instance;
                                                                            e2.getClass();
                                                                            dwttVar10.b |= 4;
                                                                            dwttVar10.e = e2;
                                                                            dwtsVar.copyOnWrite();
                                                                            dwtt dwttVar11 = (dwtt) dwtsVar.instance;
                                                                            dwttVar11.f = a - 1;
                                                                            dwttVar11.b |= 8;
                                                                        }
                                                                        set.add((dwtt) dwtsVar.build());
                                                                    }
                                                                }
                                                            }
                                                        }, dxcuVar4.i);
                                                    }
                                                }, dxcuVar3.i), new eroh() { // from class: dxch
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj4) {
                                                        final dxcu dxcuVar4 = dxcu.this;
                                                        final Set set = (Set) obj4;
                                                        return elfr.k(dxcuVar4.d.c(), new eroh() { // from class: dxcf
                                                            @Override // defpackage.eroh
                                                            public final ListenableFuture a(Object obj5) {
                                                                final dxcu dxcuVar5;
                                                                final ArrayList arrayList2 = new ArrayList();
                                                                final ArrayList arrayList3 = new ArrayList();
                                                                final AtomicInteger atomicInteger = new AtomicInteger(0);
                                                                ArrayList arrayList4 = new ArrayList();
                                                                Iterator it = ((List) obj5).iterator();
                                                                while (true) {
                                                                    dxcuVar5 = dxcu.this;
                                                                    if (!it.hasNext()) {
                                                                        break;
                                                                    }
                                                                    Set set2 = set;
                                                                    final dwtt dwttVar = (dwtt) it.next();
                                                                    if (set2.contains(dwttVar)) {
                                                                        arrayList4.add(elfr.j(dxcuVar5.c.e(dwttVar), new emwl() { // from class: dxcr
                                                                            @Override // defpackage.emwl
                                                                            public final Object apply(Object obj6) {
                                                                                Uri uri = (Uri) obj6;
                                                                                if (uri == null) {
                                                                                    return null;
                                                                                }
                                                                                arrayList2.add(uri);
                                                                                return null;
                                                                            }
                                                                        }, dxcuVar5.i));
                                                                    } else {
                                                                        arrayList4.add(elfr.k(dxcuVar5.d.e(dwttVar), new eroh() { // from class: dxcq
                                                                            @Override // defpackage.eroh
                                                                            public final ListenableFuture a(Object obj6) {
                                                                                final dxcu dxcuVar6 = dxcu.this;
                                                                                dwtx dwtxVar = (dwtx) obj6;
                                                                                if (dwtxVar != null && dwtxVar.e) {
                                                                                    arrayList3.add(dxvb.c(dxcuVar6.a, dwtxVar.g));
                                                                                }
                                                                                final AtomicInteger atomicInteger2 = atomicInteger;
                                                                                final dwtt dwttVar2 = dwttVar;
                                                                                final dxpn dxpnVar = dxcuVar6.c;
                                                                                return elfr.j(elfr.k(dxpnVar.c.e(dwttVar2), new eroh() { // from class: dxom
                                                                                    @Override // defpackage.eroh
                                                                                    public final ListenableFuture a(Object obj7) {
                                                                                        final dwtt dwttVar3 = dwttVar2;
                                                                                        dwtx dwtxVar2 = (dwtx) obj7;
                                                                                        if (dwtxVar2 == null) {
                                                                                            dxth.h("%s: No file entry with key %s", "SharedFileManager", dwttVar3);
                                                                                            return erqt.i(false);
                                                                                        }
                                                                                        dxpn dxpnVar2 = dxpn.this;
                                                                                        int a = dwsm.a(dwttVar3.f);
                                                                                        if (a == 0) {
                                                                                            a = 1;
                                                                                        }
                                                                                        Uri e2 = dxvb.e(dxpnVar2.a, a, dwtxVar2.c, dwttVar3.e, dxpnVar2.b, dxpnVar2.k, false);
                                                                                        if (e2 != null) {
                                                                                            dxpnVar2.d.f(dwttVar3.e, e2);
                                                                                        }
                                                                                        return elfr.k(dxpnVar2.c.g(dwttVar3), new eroh() { // from class: dxou
                                                                                            @Override // defpackage.eroh
                                                                                            public final ListenableFuture a(Object obj8) {
                                                                                                if (((Boolean) obj8).booleanValue()) {
                                                                                                    return erqt.i(true);
                                                                                                }
                                                                                                dxth.h("%s: Unable to modify file subscription for key %s", "SharedFileManager", dwtt.this);
                                                                                                return erqt.i(false);
                                                                                            }
                                                                                        }, dxpnVar2.l);
                                                                                    }
                                                                                }, dxpnVar.l), new emwl() { // from class: dxcp
                                                                                    @Override // defpackage.emwl
                                                                                    public final Object apply(Object obj7) {
                                                                                        if (((Boolean) obj7).booleanValue()) {
                                                                                            atomicInteger2.getAndIncrement();
                                                                                            return null;
                                                                                        }
                                                                                        dwtt dwttVar3 = dwttVar2;
                                                                                        dxcu.this.e.l(1036);
                                                                                        dxth.h("%s: Unsubscribe from file %s failed!", "ExpirationHandler", dwttVar3);
                                                                                        return null;
                                                                                    }
                                                                                }, dxcuVar6.i);
                                                                            }
                                                                        }, dxcuVar5.i));
                                                                    }
                                                                }
                                                                if (dxcuVar5.j.I()) {
                                                                    final ArrayList arrayList5 = new ArrayList();
                                                                    arrayList4.add(elfr.j(elfr.j(dxcuVar5.b.c(), new emwl() { // from class: dxcn
                                                                        @Override // defpackage.emwl
                                                                        public final Object apply(Object obj6) {
                                                                            Iterator it2 = ((List) obj6).iterator();
                                                                            while (true) {
                                                                                List list = arrayList5;
                                                                                if (!it2.hasNext()) {
                                                                                    return list;
                                                                                }
                                                                                dwso a = ((dxqb) it2.next()).a();
                                                                                if (dxvk.j(a)) {
                                                                                    Iterator<E> it3 = a.p.iterator();
                                                                                    while (it3.hasNext()) {
                                                                                        dxcu dxcuVar6 = dxcu.this;
                                                                                        list.add(dxvk.b(dxvk.c(dxcuVar6.a, dxcuVar6.g, a), (dwsi) it3.next()));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }, dxcuVar5.i), new emwl() { // from class: dxcs
                                                                        @Override // defpackage.emwl
                                                                        public final Object apply(Object obj6) {
                                                                            arrayList2.addAll((List) obj6);
                                                                            return null;
                                                                        }
                                                                    }, dxcuVar5.i));
                                                                } else {
                                                                    arrayList2.add(dxvb.b(dxcuVar5.a, dxcuVar5.g));
                                                                }
                                                                return dycg.a(arrayList4).a(new Callable() { // from class: dxct
                                                                    @Override // java.util.concurrent.Callable
                                                                    public final Object call() {
                                                                        dxcu dxcuVar6 = dxcu.this;
                                                                        AtomicInteger atomicInteger2 = atomicInteger;
                                                                        if (atomicInteger2.get() > 0) {
                                                                            dxcuVar6.e.n(4, atomicInteger2.get());
                                                                        }
                                                                        List list = arrayList3;
                                                                        Uri a = dxvb.a(dxcuVar6.a, dxcuVar6.g);
                                                                        Iterator it2 = list.iterator();
                                                                        int i3 = 0;
                                                                        while (it2.hasNext()) {
                                                                            try {
                                                                                dxcuVar6.f.f((Uri) it2.next());
                                                                                i3++;
                                                                                dxcuVar6.e.l(1086);
                                                                            } catch (IOException e2) {
                                                                                dxcuVar6.e.l(1076);
                                                                                dxth.k(e2, "%s: Failed to release unaccounted file!", "ExpirationHandler");
                                                                            }
                                                                        }
                                                                        List list2 = arrayList2;
                                                                        dxth.c("%s: Total %d unaccounted file released. ", "ExpirationHandler", Integer.valueOf(i3));
                                                                        int a2 = dxcuVar6.a(a, list2);
                                                                        dxth.c("%s: Total %d unaccounted file deleted. ", "ExpirationHandler", Integer.valueOf(a2));
                                                                        if (a2 > 0) {
                                                                            dxcuVar6.e.n(5, a2);
                                                                        }
                                                                        if (i3 <= 0) {
                                                                            return null;
                                                                        }
                                                                        dxcuVar6.e.n(8, i3);
                                                                        return null;
                                                                    }
                                                                }, dxcuVar5.i);
                                                            }
                                                        }, dxcuVar4.i);
                                                    }
                                                }, dxcuVar3.i);
                                            }
                                        }, dxcuVar2.i);
                                    }
                                }, dxcuVar.i));
                                dxmiVar3.c.l(1053);
                            }
                            final dxtd dxtdVar = dxmiVar3.k;
                            final int intValue = num.intValue();
                            arrayList.add(dxtdVar.c.a(new erog() { // from class: dxtc
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    final dxtd dxtdVar2 = dxtd.this;
                                    final int i3 = intValue;
                                    return elfr.k(dxtdVar2.b.c(), new eroh() { // from class: dxsz
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj2) {
                                            ListenableFuture j;
                                            ArrayList arrayList2 = new ArrayList();
                                            for (dxqb dxqbVar : (List) obj2) {
                                                dwtm b = dxqbVar.b();
                                                dwso a = dxqbVar.a();
                                                erid eridVar = (erid) erie.a.createBuilder();
                                                String str2 = b.c;
                                                eridVar.copyOnWrite();
                                                erie erieVar = (erie) eridVar.instance;
                                                str2.getClass();
                                                erieVar.b |= 1;
                                                erieVar.c = str2;
                                                String str3 = b.d;
                                                eridVar.copyOnWrite();
                                                erie erieVar2 = (erie) eridVar.instance;
                                                str3.getClass();
                                                erieVar2.b |= 4;
                                                erieVar2.e = str3;
                                                int i4 = a.f;
                                                eridVar.copyOnWrite();
                                                erie erieVar3 = (erie) eridVar.instance;
                                                erieVar3.b |= 2;
                                                erieVar3.d = i4;
                                                int size = a.p.size();
                                                eridVar.copyOnWrite();
                                                erie erieVar4 = (erie) eridVar.instance;
                                                erieVar4.b |= 8;
                                                erieVar4.f = size;
                                                Iterator<E> it = a.p.iterator();
                                                int i5 = 0;
                                                while (it.hasNext()) {
                                                    if (dxvk.i((dwsi) it.next())) {
                                                        i5++;
                                                    }
                                                }
                                                int i6 = i3;
                                                eridVar.copyOnWrite();
                                                erie erieVar5 = (erie) eridVar.instance;
                                                erieVar5.b |= 16;
                                                erieVar5.g = i5;
                                                boolean z = !b.e.isEmpty();
                                                eridVar.copyOnWrite();
                                                erie erieVar6 = (erie) eridVar.instance;
                                                erieVar6.b |= 32;
                                                erieVar6.h = z;
                                                long j2 = a.t;
                                                eridVar.copyOnWrite();
                                                erie erieVar7 = (erie) eridVar.instance;
                                                erieVar7.b |= 64;
                                                erieVar7.i = j2;
                                                String str4 = a.u;
                                                eridVar.copyOnWrite();
                                                erie erieVar8 = (erie) eridVar.instance;
                                                str4.getClass();
                                                erieVar8.b |= 128;
                                                erieVar8.j = str4;
                                                final erie erieVar9 = (erie) eridVar.build();
                                                final erit eritVar = (erit) eriu.a.createBuilder();
                                                eritVar.copyOnWrite();
                                                eriu eriuVar = (eriu) eritVar.instance;
                                                eriuVar.b |= 8;
                                                eriuVar.f = i6;
                                                dwsk dwskVar = a.c;
                                                if (dwskVar == null) {
                                                    dwskVar = dwsk.a;
                                                }
                                                if ((dwskVar.b & 2) != 0) {
                                                    dwsk dwskVar2 = a.c;
                                                    if (dwskVar2 == null) {
                                                        dwskVar2 = dwsk.a;
                                                    }
                                                    long j3 = dwskVar2.d / 1000;
                                                    eritVar.copyOnWrite();
                                                    eriu eriuVar2 = (eriu) eritVar.instance;
                                                    eriuVar2.b |= 2;
                                                    eriuVar2.d = j3;
                                                } else {
                                                    eritVar.copyOnWrite();
                                                    eriu eriuVar3 = (eriu) eritVar.instance;
                                                    eriuVar3.b |= 2;
                                                    eriuVar3.d = -1L;
                                                }
                                                dxtd dxtdVar3 = dxtd.this;
                                                if (b.f) {
                                                    eritVar.copyOnWrite();
                                                    eriu eriuVar4 = (eriu) eritVar.instance;
                                                    eriuVar4.c = erkh.a(3);
                                                    eriuVar4.b |= 1;
                                                    dwsk dwskVar3 = a.c;
                                                    if (((dwskVar3 == null ? dwsk.a : dwskVar3).b & 4) != 0) {
                                                        if (dwskVar3 == null) {
                                                            dwskVar3 = dwsk.a;
                                                        }
                                                        long j4 = dwskVar3.e / 1000;
                                                        eritVar.copyOnWrite();
                                                        eriu eriuVar5 = (eriu) eritVar.instance;
                                                        eriuVar5.b |= 4;
                                                        eriuVar5.e = j4;
                                                    } else {
                                                        eritVar.copyOnWrite();
                                                        eriu eriuVar6 = (eriu) eritVar.instance;
                                                        eriuVar6.b |= 4;
                                                        eriuVar6.e = -1L;
                                                    }
                                                    j = erqt.i((eriu) eritVar.build());
                                                } else {
                                                    eritVar.copyOnWrite();
                                                    eriu eriuVar7 = (eriu) eritVar.instance;
                                                    eriuVar7.b |= 4;
                                                    eriuVar7.e = -1L;
                                                    j = elfr.j(dxtdVar3.a.h(a), new emwl() { // from class: dxtb
                                                        @Override // defpackage.emwl
                                                        public final Object apply(Object obj3) {
                                                            erit eritVar2 = erit.this;
                                                            dxif dxifVar = (dxif) obj3;
                                                            if (dxifVar == dxif.DOWNLOADED || dxifVar == dxif.PENDING) {
                                                                eritVar2.copyOnWrite();
                                                                eriu eriuVar8 = (eriu) eritVar2.instance;
                                                                eriu eriuVar9 = eriu.a;
                                                                eriuVar8.c = erkh.a(4);
                                                                eriuVar8.b |= 1;
                                                            } else {
                                                                eritVar2.copyOnWrite();
                                                                eriu eriuVar10 = (eriu) eritVar2.instance;
                                                                eriu eriuVar11 = eriu.a;
                                                                eriuVar10.c = erkh.a(5);
                                                                eriuVar10.b |= 1;
                                                            }
                                                            return (eriu) eritVar2.build();
                                                        }
                                                    }, dxtdVar3.d);
                                                }
                                                arrayList2.add(elfr.j(j, new emwl() { // from class: dxta
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj3) {
                                                        return new dxsv((eriu) obj3, erie.this);
                                                    }
                                                }, dxtdVar3.d));
                                            }
                                            return erqt.e(arrayList2);
                                        }
                                    }, dxtdVar2.d);
                                }
                            }));
                            final dxuw dxuwVar = dxmiVar3.j;
                            final int intValue2 = num.intValue();
                            arrayList.add(dxuwVar.d.d(new erog() { // from class: dxuo
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    final dxuw dxuwVar2 = dxuw.this;
                                    dycd e2 = dycd.e(dxuwVar2.a.c());
                                    final int i3 = intValue2;
                                    return e2.g(new eroh() { // from class: dxuu
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj2) {
                                            final dxuw dxuwVar3 = dxuw.this;
                                            final List list = (List) obj2;
                                            final int i4 = i3;
                                            return elfr.k(dxuwVar3.a.e(), new eroh() { // from class: dxup
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj3) {
                                                    Set set;
                                                    List<dwso> list2 = (List) obj3;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    Iterator it = list.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList2.add((dxqb) it.next());
                                                    }
                                                    for (dwso dwsoVar : list2) {
                                                        dwtl dwtlVar = (dwtl) dwtm.a.createBuilder();
                                                        String str2 = dwsoVar.d;
                                                        dwtlVar.copyOnWrite();
                                                        dwtm dwtmVar = (dwtm) dwtlVar.instance;
                                                        str2.getClass();
                                                        dwtmVar.b = 1 | dwtmVar.b;
                                                        dwtmVar.c = str2;
                                                        if (dwsoVar.e.isEmpty()) {
                                                            dwtlVar.copyOnWrite();
                                                            dwtm dwtmVar2 = (dwtm) dwtlVar.instance;
                                                            dwtmVar2.b |= 2;
                                                            dwtmVar2.d = "com.google.android.gms";
                                                        } else {
                                                            String str3 = dwsoVar.e;
                                                            dwtlVar.copyOnWrite();
                                                            dwtm dwtmVar3 = (dwtm) dwtlVar.instance;
                                                            str3.getClass();
                                                            dwtmVar3.b |= 2;
                                                            dwtmVar3.d = str3;
                                                        }
                                                        arrayList2.add(new dxpz((dwtm) dwtlVar.build(), dwsoVar));
                                                    }
                                                    final HashMap hashMap = new HashMap();
                                                    HashMap hashMap2 = new HashMap();
                                                    HashMap hashMap3 = new HashMap();
                                                    final HashMap hashMap4 = new HashMap();
                                                    final HashSet hashSet = new HashSet();
                                                    final AtomicLong atomicLong = new AtomicLong(0L);
                                                    ArrayList arrayList3 = new ArrayList();
                                                    int size = arrayList2.size();
                                                    int i5 = 0;
                                                    while (true) {
                                                        final dxuw dxuwVar4 = dxuw.this;
                                                        if (i5 >= size) {
                                                            final int i6 = i4;
                                                            return dycg.a(arrayList3).a(new Callable() { // from class: dxur
                                                                @Override // java.util.concurrent.Callable
                                                                public final Object call() {
                                                                    erjl erjlVar = (erjl) erjm.a.createBuilder();
                                                                    Map map = hashMap;
                                                                    dxuw dxuwVar5 = dxuw.this;
                                                                    for (String str4 : map.keySet()) {
                                                                        Map map2 = hashMap4;
                                                                        dxuv dxuvVar = (dxuv) map.get(str4);
                                                                        List i7 = emye.d("|").i(str4);
                                                                        erid eridVar = (erid) erie.a.createBuilder();
                                                                        String str5 = (String) i7.get(0);
                                                                        eridVar.copyOnWrite();
                                                                        erie erieVar = (erie) eridVar.instance;
                                                                        str5.getClass();
                                                                        erieVar.b |= 1;
                                                                        erieVar.c = str5;
                                                                        String str6 = (String) i7.get(1);
                                                                        eridVar.copyOnWrite();
                                                                        erie erieVar2 = (erie) eridVar.instance;
                                                                        str6.getClass();
                                                                        erieVar2.b |= 4;
                                                                        erieVar2.e = str6;
                                                                        int i8 = dxuvVar.e;
                                                                        eridVar.copyOnWrite();
                                                                        erie erieVar3 = (erie) eridVar.instance;
                                                                        erieVar3.b |= 8;
                                                                        erieVar3.f = i8;
                                                                        int i9 = dxuvVar.f;
                                                                        eridVar.copyOnWrite();
                                                                        erie erieVar4 = (erie) eridVar.instance;
                                                                        erieVar4.b |= 16;
                                                                        erieVar4.g = i9;
                                                                        dwso dwsoVar2 = (dwso) map2.get(str4);
                                                                        if (dwsoVar2 == null) {
                                                                            eridVar.copyOnWrite();
                                                                            erie erieVar5 = (erie) eridVar.instance;
                                                                            erieVar5.b |= 2;
                                                                            erieVar5.d = -1;
                                                                        } else {
                                                                            int i10 = dwsoVar2.f;
                                                                            eridVar.copyOnWrite();
                                                                            erie erieVar6 = (erie) eridVar.instance;
                                                                            erieVar6.b |= 2;
                                                                            erieVar6.d = i10;
                                                                            long j = dwsoVar2.t;
                                                                            eridVar.copyOnWrite();
                                                                            erie erieVar7 = (erie) eridVar.instance;
                                                                            erieVar7.b |= 64;
                                                                            erieVar7.i = j;
                                                                            String str7 = dwsoVar2.u;
                                                                            eridVar.copyOnWrite();
                                                                            erie erieVar8 = (erie) eridVar.instance;
                                                                            str7.getClass();
                                                                            erieVar8.b |= 128;
                                                                            erieVar8.j = str7;
                                                                        }
                                                                        erie erieVar9 = (erie) eridVar.build();
                                                                        erjlVar.copyOnWrite();
                                                                        erjm erjmVar = (erjm) erjlVar.instance;
                                                                        erieVar9.getClass();
                                                                        eygr eygrVar = erjmVar.c;
                                                                        if (!eygrVar.c()) {
                                                                            erjmVar.c = eyfy.mutableCopy(eygrVar);
                                                                        }
                                                                        erjmVar.c.add(erieVar9);
                                                                        long j2 = dxuvVar.a;
                                                                        erjlVar.copyOnWrite();
                                                                        erjm erjmVar2 = (erjm) erjlVar.instance;
                                                                        eygl eyglVar = erjmVar2.d;
                                                                        if (!eyglVar.c()) {
                                                                            erjmVar2.d = eyfy.mutableCopy(eyglVar);
                                                                        }
                                                                        erjmVar2.d.g(j2);
                                                                        long j3 = dxuvVar.b;
                                                                        erjlVar.copyOnWrite();
                                                                        erjm erjmVar3 = (erjm) erjlVar.instance;
                                                                        eygl eyglVar2 = erjmVar3.e;
                                                                        if (!eyglVar2.c()) {
                                                                            erjmVar3.e = eyfy.mutableCopy(eyglVar2);
                                                                        }
                                                                        erjmVar3.e.g(j3);
                                                                        long j4 = dxuvVar.c;
                                                                        erjlVar.copyOnWrite();
                                                                        erjm erjmVar4 = (erjm) erjlVar.instance;
                                                                        eygl eyglVar3 = erjmVar4.f;
                                                                        if (!eyglVar3.c()) {
                                                                            erjmVar4.f = eyfy.mutableCopy(eyglVar3);
                                                                        }
                                                                        erjmVar4.f.g(j4);
                                                                        long j5 = dxuvVar.d;
                                                                        erjlVar.copyOnWrite();
                                                                        erjm erjmVar5 = (erjm) erjlVar.instance;
                                                                        eygl eyglVar4 = erjmVar5.g;
                                                                        if (!eyglVar4.c()) {
                                                                            erjmVar5.g = eyfy.mutableCopy(eyglVar4);
                                                                        }
                                                                        erjmVar5.g.g(j5);
                                                                    }
                                                                    long j6 = atomicLong.get();
                                                                    erjlVar.copyOnWrite();
                                                                    erjm erjmVar6 = (erjm) erjlVar.instance;
                                                                    erjmVar6.b |= 1;
                                                                    erjmVar6.h = j6;
                                                                    long j7 = 0;
                                                                    try {
                                                                        Uri a = dxvb.a(dxuwVar5.e, dxuwVar5.g);
                                                                        if (dxuwVar5.c.h(a)) {
                                                                            j7 = ((Long) dxuwVar5.c.c(a, new efea())).longValue();
                                                                        }
                                                                    } catch (IOException e3) {
                                                                        dxth.k(e3, "%s: Failed to call Mobstore to compute MDD Directory bytes used!", "StorageLogger");
                                                                        dxuwVar5.f.a();
                                                                    }
                                                                    int i11 = i6;
                                                                    erjlVar.copyOnWrite();
                                                                    erjm erjmVar7 = (erjm) erjlVar.instance;
                                                                    erjmVar7.b |= 2;
                                                                    erjmVar7.i = j7;
                                                                    erjlVar.copyOnWrite();
                                                                    erjm erjmVar8 = (erjm) erjlVar.instance;
                                                                    erjmVar8.b |= 4;
                                                                    erjmVar8.j = i11;
                                                                    return (erjm) erjlVar.build();
                                                                }
                                                            }, dxuwVar4.h);
                                                        }
                                                        final dxqb dxqbVar = (dxqb) arrayList2.get(i5);
                                                        final Set b = dxuw.b(hashMap2, dxuw.a(dxqbVar.b()));
                                                        String a = dxuw.a(dxqbVar.b());
                                                        dxuv dxuvVar = (dxuv) hashMap.get(a);
                                                        if (dxuvVar == null) {
                                                            hashMap.put(a, new dxuv());
                                                            dxuvVar = (dxuv) hashMap.get(a);
                                                        }
                                                        final dxuv dxuvVar2 = dxuvVar;
                                                        if (dxqbVar.b().f) {
                                                            set = dxuw.b(hashMap3, dxuw.a(dxqbVar.b()));
                                                            hashMap4.put(dxuw.a(dxqbVar.b()), dxqbVar.a());
                                                        } else {
                                                            set = null;
                                                        }
                                                        final Set set2 = set;
                                                        int size2 = dxqbVar.a().p.size();
                                                        for (dwsi dwsiVar : dxqbVar.a().p) {
                                                            final boolean i7 = dxvk.i(dwsiVar);
                                                            HashMap hashMap5 = hashMap2;
                                                            int a2 = dwsm.a(dxqbVar.a().k);
                                                            if (a2 == 0) {
                                                                a2 = 1;
                                                            }
                                                            final dwtt a3 = dxpp.a(dwsiVar, a2);
                                                            ArrayList arrayList4 = arrayList2;
                                                            final AtomicLong atomicLong2 = atomicLong;
                                                            dxuw dxuwVar5 = dxuwVar4;
                                                            arrayList3.add(elfr.j(dycd.e(dxuwVar4.b.e(a3)).d(dxpo.class, new eroh() { // from class: dxus
                                                                @Override // defpackage.eroh
                                                                public final ListenableFuture a(Object obj4) {
                                                                    return erqt.i(null);
                                                                }
                                                            }, dxuwVar4.h).f(new emwl() { // from class: dxut
                                                                @Override // defpackage.emwl
                                                                public final Object apply(Object obj4) {
                                                                    dxuw dxuwVar6 = dxuw.this;
                                                                    Uri uri = (Uri) obj4;
                                                                    if (uri != null) {
                                                                        try {
                                                                            return Long.valueOf(dxuwVar6.c.a(uri));
                                                                        } catch (IOException e3) {
                                                                            dxth.k(e3, "%s: Failed to call mobstore fileSize on uri %s!", "StorageLogger", uri);
                                                                        }
                                                                    }
                                                                    return 0L;
                                                                }
                                                            }, dxuwVar4.h), new emwl() { // from class: dxuq
                                                                @Override // defpackage.emwl
                                                                public final Object apply(Object obj4) {
                                                                    Set set3 = hashSet;
                                                                    dwtt dwttVar = a3;
                                                                    Long l = (Long) obj4;
                                                                    if (!set3.contains(dwttVar)) {
                                                                        atomicLong2.getAndAdd(l.longValue());
                                                                        set3.add(dwttVar);
                                                                    }
                                                                    dxuv dxuvVar3 = dxuvVar2;
                                                                    boolean z = i7;
                                                                    Set set4 = b;
                                                                    if (!set4.contains(dwttVar)) {
                                                                        if (z) {
                                                                            dxuvVar3.b += l.longValue();
                                                                        }
                                                                        dxuvVar3.a += l.longValue();
                                                                        set4.add(dwttVar);
                                                                    }
                                                                    if (!dxqbVar.b().f) {
                                                                        return null;
                                                                    }
                                                                    Set set5 = set2;
                                                                    set5.getClass();
                                                                    if (set5.contains(dwttVar)) {
                                                                        return null;
                                                                    }
                                                                    if (z) {
                                                                        dxuvVar3.d += l.longValue();
                                                                        dxuvVar3.f++;
                                                                    }
                                                                    dxuvVar3.c += l.longValue();
                                                                    set5.add(dwttVar);
                                                                    return null;
                                                                }
                                                            }, dxuwVar5.h));
                                                            dxuwVar4 = dxuwVar5;
                                                            atomicLong = atomicLong2;
                                                            hashMap2 = hashMap5;
                                                            arrayList2 = arrayList4;
                                                            hashMap3 = hashMap3;
                                                        }
                                                        dxuvVar2.e = size2;
                                                        i5++;
                                                    }
                                                }
                                            }, dxuwVar3.h);
                                        }
                                    }, dxuwVar2.h);
                                }
                            }));
                            dxtx dxtxVar = dxmiVar3.l;
                            if (dxtxVar.b.P()) {
                                dxti dxtiVar = dxtxVar.c;
                                dxsy dxsyVar = dxtxVar.a;
                                final ListenableFuture b = dxtiVar.b();
                                c2 = dxsyVar.c(new erog() { // from class: dxtv
                                    @Override // defpackage.erog
                                    public final ListenableFuture a() {
                                        return elfr.j(ListenableFuture.this, new emwl() { // from class: dxtw
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj2) {
                                                erjd erjdVar = (erjd) erjg.a.createBuilder();
                                                long j = 0;
                                                long j2 = 0;
                                                for (dwte dwteVar : (List) obj2) {
                                                    erje erjeVar = (erje) erjf.a.createBuilder();
                                                    erid eridVar = (erid) erie.a.createBuilder();
                                                    dwtm dwtmVar = dwteVar.c;
                                                    if (dwtmVar == null) {
                                                        dwtmVar = dwtm.a;
                                                    }
                                                    String str2 = dwtmVar.d;
                                                    eridVar.copyOnWrite();
                                                    erie erieVar = (erie) eridVar.instance;
                                                    str2.getClass();
                                                    erieVar.b |= 4;
                                                    erieVar.e = str2;
                                                    dwtm dwtmVar2 = dwteVar.c;
                                                    if (dwtmVar2 == null) {
                                                        dwtmVar2 = dwtm.a;
                                                    }
                                                    String str3 = dwtmVar2.c;
                                                    eridVar.copyOnWrite();
                                                    erie erieVar2 = (erie) eridVar.instance;
                                                    str3.getClass();
                                                    erieVar2.b |= 1;
                                                    erieVar2.c = str3;
                                                    int i3 = dwteVar.f;
                                                    eridVar.copyOnWrite();
                                                    erie erieVar3 = (erie) eridVar.instance;
                                                    erieVar3.b |= 2;
                                                    erieVar3.d = i3;
                                                    long j3 = dwteVar.d;
                                                    eridVar.copyOnWrite();
                                                    erie erieVar4 = (erie) eridVar.instance;
                                                    erieVar4.b |= 64;
                                                    erieVar4.i = j3;
                                                    String str4 = dwteVar.e;
                                                    eridVar.copyOnWrite();
                                                    erie erieVar5 = (erie) eridVar.instance;
                                                    str4.getClass();
                                                    erieVar5.b |= 128;
                                                    erieVar5.j = str4;
                                                    erie erieVar6 = (erie) eridVar.build();
                                                    erjeVar.copyOnWrite();
                                                    erjf erjfVar = (erjf) erjeVar.instance;
                                                    erieVar6.getClass();
                                                    erjfVar.c = erieVar6;
                                                    erjfVar.b |= 1;
                                                    long j4 = dwteVar.h;
                                                    erjeVar.copyOnWrite();
                                                    erjf erjfVar2 = (erjf) erjeVar.instance;
                                                    erjfVar2.b |= 2;
                                                    erjfVar2.d = j4;
                                                    long j5 = dwteVar.g;
                                                    erjeVar.copyOnWrite();
                                                    erjf erjfVar3 = (erjf) erjeVar.instance;
                                                    erjfVar3.b |= 4;
                                                    erjfVar3.e = j5;
                                                    erjdVar.copyOnWrite();
                                                    erjg erjgVar = (erjg) erjdVar.instance;
                                                    erjf erjfVar4 = (erjf) erjeVar.build();
                                                    erjfVar4.getClass();
                                                    eygr eygrVar = erjgVar.c;
                                                    if (!eygrVar.c()) {
                                                        erjgVar.c = eyfy.mutableCopy(eygrVar);
                                                    }
                                                    erjgVar.c.add(erjfVar4);
                                                    j += dwteVar.h;
                                                    j2 += dwteVar.g;
                                                }
                                                erjdVar.copyOnWrite();
                                                erjg erjgVar2 = (erjg) erjdVar.instance;
                                                erjgVar2.b |= 1;
                                                erjgVar2.d = j;
                                                erjdVar.copyOnWrite();
                                                erjg erjgVar3 = (erjg) erjdVar.instance;
                                                erjgVar3.b |= 2;
                                                erjgVar3.e = j2;
                                                return (erjg) erjdVar.build();
                                            }
                                        }, erpp.a);
                                    }
                                });
                            } else {
                                c2 = erre.a;
                            }
                            arrayList.add(c2);
                            if (dxmiVar3.o.g()) {
                                final dxig dxigVar5 = dxmiVar3.d;
                                arrayList.add(dxigVar5.r(dxigVar5.d.d(), new eroh() { // from class: dxhk
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it = ((List) obj2).iterator();
                                        while (true) {
                                            final dxig dxigVar6 = dxig.this;
                                            if (!it.hasNext()) {
                                                return dycg.a(arrayList2).a(new Callable() { // from class: dxic
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() {
                                                        return null;
                                                    }
                                                }, dxigVar6.h);
                                            }
                                            dwtm dwtmVar = (dwtm) it.next();
                                            if (!dwtmVar.f) {
                                                arrayList2.add(dxigVar6.r(dxigVar6.d.g(dwtmVar), new eroh() { // from class: dxhs
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj3) {
                                                        int a;
                                                        dwso dwsoVar = (dwso) obj3;
                                                        return (dwsoVar == null || (a = dycb.a(dwsoVar.s)) == 0 || a == 1) ? erqt.i(true) : ((dycw) ((emyl) dxig.this.j.c()).get()).b();
                                                    }
                                                }));
                                            }
                                        }
                                    }
                                }));
                            }
                            dxvw.a(dxmiVar3.b, "gms_icing_mdd_manager_metadata", dxmiVar3.m).edit().remove("gms_icing_mdd_manager_ph_config_version").remove("gms_icing_mdd_manager_ph_config_version_timestamp").commit();
                            if (!dxmiVar3.p.A()) {
                                arrayList.add(dycg.b(dycd.e(dxmiVar3.e.c()).f(new emwl() { // from class: dxlj
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        boolean z = dxmi.a;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (dxqb dxqbVar : (List) obj2) {
                                            dwsk dwskVar = dxqbVar.a().c;
                                            if (dwskVar == null) {
                                                dwskVar = dwsk.a;
                                            }
                                            if (!dwskVar.h) {
                                                arrayList2.add(dxqbVar);
                                            }
                                        }
                                        return arrayList2;
                                    }
                                }, dxmiVar3.n).g(new eroh() { // from class: dxlk
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (final dxqb dxqbVar : (List) obj2) {
                                            final dxmi dxmiVar4 = dxmi.this;
                                            dxqbVar.b();
                                            arrayList2.add(dycd.e(erre.a).g(new eroh() { // from class: dxlv
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj3) {
                                                    return dxmi.i(dxqbVar.a());
                                                }
                                            }, dxmiVar4.n).g(new eroh() { // from class: dxlw
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj3) {
                                                    dxqb dxqbVar2 = dxqbVar;
                                                    dwso a = dxqbVar2.a();
                                                    dwsk dwskVar = a.c;
                                                    if (dwskVar == null) {
                                                        dwskVar = dwsk.a;
                                                    }
                                                    dxmi dxmiVar5 = dxmi.this;
                                                    dwsj dwsjVar = (dwsj) dwskVar.toBuilder();
                                                    dwsjVar.copyOnWrite();
                                                    dwsk dwskVar2 = (dwsk) dwsjVar.instance;
                                                    dwskVar2.b |= 32;
                                                    dwskVar2.h = true;
                                                    dwsk dwskVar3 = (dwsk) dwsjVar.build();
                                                    dwsn dwsnVar = (dwsn) a.toBuilder();
                                                    dwsnVar.copyOnWrite();
                                                    dwso dwsoVar = (dwso) dwsnVar.instance;
                                                    dwskVar3.getClass();
                                                    dwsoVar.c = dwskVar3;
                                                    dwsoVar.b |= 1;
                                                    return elfr.j(dxmiVar5.e.l(dxqbVar2.b(), (dwso) dwsnVar.build()), new emwl() { // from class: dxkp
                                                        @Override // defpackage.emwl
                                                        public final Object apply(Object obj4) {
                                                            boolean z = dxmi.a;
                                                            return null;
                                                        }
                                                    }, dxmiVar5.n);
                                                }
                                            }, dxmiVar4.n));
                                        }
                                        return dycg.a(arrayList2).a(new Callable() { // from class: dxlx
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                boolean z = dxmi.a;
                                                return null;
                                            }
                                        }, erpp.a);
                                    }
                                }, dxmiVar3.n), dycd.e(dxmiVar3.e.e()).f(new emwl() { // from class: dxll
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        final dxmi dxmiVar4 = dxmi.this;
                                        return enkr.g((List) obj2, new emwl() { // from class: dxko
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj3) {
                                                return dxmi.i((dwso) obj3);
                                            }
                                        });
                                    }
                                }, dxmiVar3.n).g(new eroh() { // from class: dxlm
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        boolean z = dxmi.a;
                                        return dycg.a((List) obj2).a(new Callable() { // from class: dxlz
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                boolean z2 = dxmi.a;
                                                return null;
                                            }
                                        }, erpp.a);
                                    }
                                }, dxmiVar3.n)).a(new Callable() { // from class: dxln
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        boolean z = dxmi.a;
                                        return null;
                                    }
                                }, erpp.a));
                            }
                            return dycg.a(arrayList).a(new Callable() { // from class: dxlg
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    boolean z = dxmi.a;
                                    return null;
                                }
                            }, dxmiVar3.n);
                        }
                    }, dxmiVar2.n);
                }
            }, this.i);
        }
        if (c == 1) {
            return elfr.k(r(), eldl.d(new eroh() { // from class: dwun
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    dxth.b("%s verifyAllPendingGroups", "MDDManager");
                    dwxa dwxaVar = dwxa.this;
                    final dxmi dxmiVar2 = dwxaVar.d;
                    final eroh erohVar = dwxaVar.l;
                    return elfr.k(dxmiVar2.h(), new eroh() { // from class: dxkq
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            dxmi dxmiVar3 = dxmi.this;
                            if (!dxmiVar3.p.U()) {
                                return erre.a;
                            }
                            final eroh erohVar2 = erohVar;
                            dxmiVar3.c.l(1032);
                            final dxig dxigVar = dxmiVar3.d;
                            return dxigVar.r(dxigVar.d.d(), eldl.d(new eroh() { // from class: dxhn
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = ((List) obj3).iterator();
                                    while (true) {
                                        final dxig dxigVar2 = dxig.this;
                                        if (!it.hasNext()) {
                                            return dycg.a(arrayList).a(new Callable() { // from class: dxhz
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    return null;
                                                }
                                            }, dxigVar2.h);
                                        }
                                        final dwtm dwtmVar = (dwtm) it.next();
                                        if (!dwtmVar.f) {
                                            final eroh erohVar3 = erohVar2;
                                            arrayList.add(dxigVar2.r(dxigVar2.g(dwtmVar, false), new eroh() { // from class: dxhy
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    dwso dwsoVar = (dwso) obj4;
                                                    if (dwsoVar == null) {
                                                        return erqt.i(dxif.PENDING);
                                                    }
                                                    eroh erohVar4 = erohVar3;
                                                    dwtm dwtmVar2 = dwtmVar;
                                                    dxig dxigVar3 = dxig.this;
                                                    return dxigVar3.t(dwtmVar2, dwsoVar, true, erohVar4, new dxsw(dxigVar3.b, 1));
                                                }
                                            }));
                                        }
                                    }
                                }
                            }));
                        }
                    }, dxmiVar2.n);
                }
            }), this.i);
        }
        if (c == 2) {
            return w(false);
        }
        if (c == 3) {
            return w(true);
        }
        dxth.b("%s: gcm task doesn't belong to MDD", "MobileDataDownload");
        return erqt.h(new IllegalArgumentException("Unknown task tag sent to MDD.handleTask() ".concat(str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dwub
    public final ListenableFuture h(final dwru dwruVar) {
        dwtl dwtlVar = (dwtl) dwtm.a.createBuilder();
        dwtlVar.copyOnWrite();
        dwtm dwtmVar = (dwtm) dwtlVar.instance;
        int i = 1;
        dwtmVar.b |= 1;
        dwok dwokVar = (dwok) dwruVar;
        dwtmVar.c = dwokVar.a;
        String packageName = this.a.getPackageName();
        dwtlVar.copyOnWrite();
        dwtm dwtmVar2 = (dwtm) dwtlVar.instance;
        packageName.getClass();
        dwtmVar2.b |= 2;
        dwtmVar2.d = packageName;
        if (dwokVar.g.g()) {
            String a = dwxn.a((Account) dwokVar.g.c());
            dwtlVar.copyOnWrite();
            dwtm dwtmVar3 = (dwtm) dwtlVar.instance;
            dwtmVar3.b |= 4;
            dwtmVar3.e = a;
        }
        final dwtm dwtmVar4 = (dwtm) dwtlVar.build();
        engw engwVar = dwokVar.e;
        enou enouVar = (enou) engwVar;
        final engr d = engw.d(enouVar.c);
        int i2 = 0;
        while (i2 < enouVar.c) {
            dwph dwphVar = (dwph) engwVar.get(i2);
            dwsf dwsfVar = (dwsf) dwsi.a.createBuilder();
            String str = dwphVar.c;
            dwsfVar.copyOnWrite();
            dwsi dwsiVar = (dwsi) dwsfVar.instance;
            str.getClass();
            dwsiVar.b |= i;
            dwsiVar.c = str;
            String str2 = dwphVar.d;
            dwsfVar.copyOnWrite();
            dwsi dwsiVar2 = (dwsi) dwsfVar.instance;
            str2.getClass();
            dwsiVar2.b |= 2;
            dwsiVar2.d = str2;
            long j = dwphVar.e;
            dwsfVar.copyOnWrite();
            dwsi dwsiVar3 = (dwsi) dwsfVar.instance;
            dwsiVar3.b |= 4;
            dwsiVar3.e = j;
            dwpg b = dwpg.b(dwphVar.f);
            if (b == null) {
                b = dwpg.DEFAULT;
            }
            int a2 = dwsh.a(b.d);
            dwsfVar.copyOnWrite();
            dwsi dwsiVar4 = (dwsi) dwsfVar.instance;
            if (a2 == 0) {
                throw null;
            }
            dwsiVar4.f = a2 - 1;
            dwsiVar4.b |= 8;
            String str3 = dwphVar.g;
            dwsfVar.copyOnWrite();
            dwsi dwsiVar5 = (dwsi) dwsfVar.instance;
            str3.getClass();
            dwsiVar5.b |= 16;
            dwsiVar5.g = str3;
            String str4 = dwphVar.i;
            dwsfVar.copyOnWrite();
            dwsi dwsiVar6 = (dwsi) dwsfVar.instance;
            str4.getClass();
            dwsiVar6.b |= 64;
            dwsiVar6.i = str4;
            long j2 = dwphVar.j;
            dwsfVar.copyOnWrite();
            dwsi dwsiVar7 = (dwsi) dwsfVar.instance;
            dwsiVar7.b |= 128;
            dwsiVar7.j = j2;
            int a3 = dwpd.a(dwphVar.m);
            if (a3 == 0) {
                a3 = i;
            }
            dwsfVar.copyOnWrite();
            dwsi dwsiVar8 = (dwsi) dwsfVar.instance;
            int a4 = dwse.a(a3 - 1);
            int i3 = a4 - 1;
            if (a4 == 0) {
                throw null;
            }
            dwsiVar8.m = i3;
            dwsiVar8.b |= 512;
            int a5 = dwpb.a(dwphVar.n);
            if (a5 == 0) {
                a5 = i;
            }
            dwsfVar.copyOnWrite();
            dwsi dwsiVar9 = (dwsi) dwsfVar.instance;
            int a6 = dwsc.a(a5 - 1);
            int i4 = a6 - 1;
            if (a6 == 0) {
                throw null;
            }
            dwsiVar9.n = i4;
            dwsiVar9.b |= 1024;
            String str5 = dwphVar.o;
            dwsfVar.copyOnWrite();
            dwsi dwsiVar10 = (dwsi) dwsfVar.instance;
            str5.getClass();
            dwsiVar10.b |= 2048;
            dwsiVar10.o = str5;
            String str6 = dwphVar.p;
            dwsfVar.copyOnWrite();
            dwsi dwsiVar11 = (dwsi) dwsfVar.instance;
            str6.getClass();
            dwsiVar11.b |= 4096;
            dwsiVar11.p = str6;
            if ((dwphVar.b & 8192) != 0) {
                eydq eydqVar = dwphVar.q;
                if (eydqVar == null) {
                    eydqVar = eydq.a;
                }
                dwsfVar.copyOnWrite();
                dwsi dwsiVar12 = (dwsi) dwsfVar.instance;
                eydqVar.getClass();
                dwsiVar12.q = eydqVar;
                dwsiVar12.b |= 8192;
            }
            if ((dwphVar.b & 32) != 0) {
                fasl faslVar = dwphVar.h;
                if (faslVar == null) {
                    faslVar = fasl.a;
                }
                dwsfVar.copyOnWrite();
                dwsi dwsiVar13 = (dwsi) dwsfVar.instance;
                faslVar.getClass();
                dwsiVar13.h = faslVar;
                dwsiVar13.b |= 32;
            }
            if ((dwphVar.b & 256) != 0) {
                fasl faslVar2 = dwphVar.k;
                if (faslVar2 == null) {
                    faslVar2 = fasl.a;
                }
                dwsfVar.copyOnWrite();
                dwsi dwsiVar14 = (dwsi) dwsfVar.instance;
                faslVar2.getClass();
                dwsiVar14.k = faslVar2;
                dwsiVar14.b |= 256;
            }
            for (dwpn dwpnVar : dwphVar.l) {
                dwsp dwspVar = (dwsp) dwss.a.createBuilder();
                String str7 = dwpnVar.c;
                dwspVar.copyOnWrite();
                dwss dwssVar = (dwss) dwspVar.instance;
                str7.getClass();
                dwssVar.b |= i;
                dwssVar.c = str7;
                long j3 = dwpnVar.d;
                dwspVar.copyOnWrite();
                dwss dwssVar2 = (dwss) dwspVar.instance;
                int i5 = i;
                dwssVar2.b |= 2;
                dwssVar2.d = j3;
                String str8 = dwpnVar.e;
                dwspVar.copyOnWrite();
                dwss dwssVar3 = (dwss) dwspVar.instance;
                str8.getClass();
                dwssVar3.b |= 4;
                dwssVar3.e = str8;
                int a7 = dwpm.a(dwpnVar.f);
                if (a7 == 0) {
                    a7 = i5;
                }
                dwspVar.copyOnWrite();
                dwss dwssVar4 = (dwss) dwspVar.instance;
                int a8 = dwsr.a(a7 - 1);
                int i6 = a8 - 1;
                if (a8 == 0) {
                    throw null;
                }
                dwssVar4.f = i6;
                dwssVar4.b |= 8;
                dwrz dwrzVar = (dwrz) dwsa.a.createBuilder();
                dwoz dwozVar = dwpnVar.g;
                if (dwozVar == null) {
                    dwozVar = dwoz.a;
                }
                String str9 = dwozVar.b;
                dwrzVar.copyOnWrite();
                dwsa dwsaVar = (dwsa) dwrzVar.instance;
                str9.getClass();
                dwsaVar.b |= 1;
                dwsaVar.c = str9;
                dwsa dwsaVar2 = (dwsa) dwrzVar.build();
                dwspVar.copyOnWrite();
                dwss dwssVar5 = (dwss) dwspVar.instance;
                dwsaVar2.getClass();
                dwssVar5.g = dwsaVar2;
                dwssVar5.b |= 16;
                dwss dwssVar6 = (dwss) dwspVar.build();
                dwsfVar.copyOnWrite();
                dwsi dwsiVar15 = (dwsi) dwsfVar.instance;
                dwssVar6.getClass();
                eygr eygrVar = dwsiVar15.l;
                if (!eygrVar.c()) {
                    dwsiVar15.l = eyfy.mutableCopy(eygrVar);
                }
                dwsiVar15.l.add(dwssVar6);
                i = i5;
            }
            d.h((dwsi) dwsfVar.build());
            i2++;
            i = i;
        }
        return this.p.b(new erog() { // from class: dwvy
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final engw g = d.g();
                final dwtm dwtmVar5 = dwtmVar4;
                dxth.d("%s: importFiles %s %s", "MDDManager", dwtmVar5.c, dwtmVar5.d);
                dwok dwokVar2 = (dwok) dwruVar;
                final long j4 = dwokVar2.b;
                final String str10 = dwokVar2.c;
                final enhk enhkVar = dwokVar2.f;
                final emxc emxcVar = dwokVar2.d;
                dwxa dwxaVar = dwxa.this;
                final dxmi dxmiVar = dwxaVar.d;
                ListenableFuture h = dxmiVar.h();
                final eroh erohVar = dwxaVar.l;
                return elfr.k(h, new eroh() { // from class: dxmg
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final dxig dxigVar = dxmi.this.d;
                        final engw a9 = dxmi.a(g);
                        final dxsw dxswVar = new dxsw(dxigVar.b, 2);
                        ListenableFuture c = dxigVar.d.c();
                        final dwtm dwtmVar6 = dwtmVar5;
                        final long j5 = j4;
                        final String str11 = str10;
                        final emxc emxcVar2 = emxcVar;
                        final ListenableFuture r = dxigVar.r(dxigVar.q(c, new emwl() { // from class: dxhp
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                emxc emxcVar3;
                                for (dxqb dxqbVar : (List) obj2) {
                                    String str12 = str11;
                                    long j6 = j5;
                                    dwtm dwtmVar7 = dwtm.this;
                                    String str13 = dwtmVar7.e;
                                    dwso a10 = dxqbVar.a();
                                    if (dxqbVar.b().e.equals(str13)) {
                                        long j7 = a10.t;
                                        if (j7 != j6) {
                                            dxth.m("%s: verifyGroupPairMatchesIdentifiers failed for group %s due to mismatched buildId: existing = %d, expected = %d", "FileGroupManager", a10.d, Long.valueOf(j7), Long.valueOf(j6));
                                        } else if (str12.equals(a10.u)) {
                                            if ((a10.b & 16) != 0) {
                                                eydq eydqVar2 = a10.g;
                                                if (eydqVar2 == null) {
                                                    eydqVar2 = eydq.a;
                                                }
                                                emxcVar3 = emxc.j(eydqVar2);
                                            } else {
                                                emxcVar3 = emux.a;
                                            }
                                            emxc emxcVar4 = emxcVar2;
                                            if (!emxcVar3.equals(emxcVar4)) {
                                                dxth.m("%s: verifyGroupPairMatchesIdentifiers failed for group %s due to mismatched custom property optional: existing = %s, expected = %s", "FileGroupManager", a10.d, emxcVar3, emxcVar4);
                                            } else {
                                                if (dwtmVar7.c.equals(dxqbVar.b().c)) {
                                                    return dxqbVar;
                                                }
                                                dxth.d("%s: getGroupPairById: Group %s matches the given buildId = %d and variantId = %s, but does not match the given group name %s", "FileGroupManager", dxqbVar.b().c, Long.valueOf(j6), str12, dwtmVar7.c);
                                            }
                                        } else {
                                            dxth.m("%s: verifyGroupPairMatchesIdentifiers failed for group %s due to mismatched variantId: existing = %s, expected = %s", "FileGroupManager", a10.d, a10.u, str12);
                                        }
                                    } else {
                                        dxth.l("%s: verifyGroupPairMatchesIdentifiers failed for group %s due to mismatched account", "FileGroupManager", a10.d);
                                    }
                                }
                                return null;
                            }
                        }), new eroh() { // from class: dxgu
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                dxqb dxqbVar = (dxqb) obj2;
                                if (dxqbVar != null) {
                                    return erqt.i(dxqbVar);
                                }
                                String str12 = str11;
                                long j6 = j5;
                                dwtm dwtmVar7 = dwtm.this;
                                dxth.i("%s: importFiles for group name: %s, buildId: %d, variantId: %s, but no group was found", "FileGroupManager", dwtmVar7.c, Long.valueOf(j6), str12);
                                dwql a10 = dwqn.a();
                                a10.a = dwqm.GROUP_NOT_FOUND_ERROR;
                                a10.b = "file group: " + dwtmVar7.c + " not found! Make sure addFileGroup has been called.";
                                return erqt.h(a10.a());
                            }
                        });
                        dycd g2 = dycd.e(r).g(new eroh() { // from class: dxgv
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                dwso a10 = ((dxqb) obj2).a();
                                dwsn dwsnVar = (dwsn) a10.toBuilder();
                                dwsnVar.copyOnWrite();
                                ((dwso) dwsnVar.instance).p = dwso.emptyProtobufList();
                                HashMap hashMap = new HashMap();
                                for (dwsi dwsiVar16 : a10.p) {
                                    hashMap.put(dwsiVar16.c, dwsiVar16);
                                }
                                engw engwVar2 = a9;
                                int size = engwVar2.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    dwsi dwsiVar17 = (dwsi) engwVar2.get(i7);
                                    hashMap.put(dwsiVar17.c, dwsiVar17);
                                }
                                dxsw dxswVar2 = dxswVar;
                                dxig dxigVar2 = dxig.this;
                                dwsnVar.a(hashMap.values());
                                final dwso dwsoVar = (dwso) dwsnVar.build();
                                dxswVar2.b(dwsoVar);
                                return dxigVar2.r(dxigVar2.o(dwsoVar), new eroh() { // from class: dxdb
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                                        dwso dwsoVar2 = dwso.this;
                                        if (booleanValue) {
                                            return erqt.i(dwsoVar2);
                                        }
                                        dwql a11 = dwqn.a();
                                        a11.a = dwqm.UNABLE_TO_RESERVE_FILE_ENTRY;
                                        a11.b = "Failed to reserve new file entries for group: ".concat(String.valueOf(dwsoVar2.d));
                                        return erqt.h(a11.a());
                                    }
                                });
                            }
                        }, dxigVar.h);
                        final enhk enhkVar2 = enhkVar;
                        final eroh erohVar2 = erohVar;
                        return g2.g(new eroh() { // from class: dxgw
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                final dwso dwsoVar = (dwso) obj2;
                                final boolean z = ((dxqb) erqt.q(r)).b().f;
                                final boolean z2 = !z;
                                final ArrayList arrayList = new ArrayList();
                                Iterator<E> it = dwsoVar.p.iterator();
                                while (true) {
                                    final dwtm dwtmVar7 = dwtmVar6;
                                    final dxig dxigVar2 = dxig.this;
                                    if (!it.hasNext()) {
                                        final dxsw dxswVar2 = dxswVar;
                                        final eroh erohVar3 = erohVar2;
                                        final dwso dwsoVar2 = dwsoVar;
                                        return dxigVar2.r(dycg.a(arrayList).b(new erog() { // from class: dxcw
                                            @Override // defpackage.erog
                                            public final ListenableFuture a() {
                                                final dxig dxigVar3 = dxig.this;
                                                final dwtm dwtmVar8 = dwtmVar7;
                                                final dwso dwsoVar3 = dwsoVar;
                                                final boolean z3 = z2;
                                                final eroh erohVar4 = erohVar3;
                                                final dxsw dxswVar3 = dxswVar2;
                                                return dxigVar3.l.b(new erog() { // from class: dxdc
                                                    @Override // defpackage.erog
                                                    public final ListenableFuture a() {
                                                        return dxig.this.t(dwtmVar8, dwsoVar3, z3, erohVar4, dxswVar3);
                                                    }
                                                }, dxigVar3.h);
                                            }
                                        }, dxigVar2.h), new eroh() { // from class: dxey
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj3) {
                                                dxif dxifVar = (dxif) obj3;
                                                List list = arrayList;
                                                dwoa.d(list, "Failed to import files, %d attempted", Integer.valueOf(list.size()));
                                                final dxig dxigVar3 = dxig.this;
                                                dwtm dwtmVar8 = dwtmVar7;
                                                dwso dwsoVar3 = dwsoVar2;
                                                if (dxifVar != dxif.DOWNLOADED) {
                                                    boolean z3 = z;
                                                    dxih dxihVar = dxigVar3.d;
                                                    dwtl dwtlVar2 = (dwtl) dwtmVar8.toBuilder();
                                                    dwtlVar2.copyOnWrite();
                                                    dwtm dwtmVar9 = (dwtm) dwtlVar2.instance;
                                                    dwtmVar9.b |= 8;
                                                    dwtmVar9.f = z3;
                                                    return dxigVar3.r(dxihVar.l((dwtm) dwtlVar2.build(), dwsoVar3), new eroh() { // from class: dxgy
                                                        @Override // defpackage.eroh
                                                        public final ListenableFuture a(Object obj4) {
                                                            if (((Boolean) obj4).booleanValue()) {
                                                                return erre.a;
                                                            }
                                                            dxig.this.b.l(1036);
                                                            dwql a10 = dwqn.a();
                                                            a10.b = "File Import(s) succeeded, but failed to save MDD state.";
                                                            a10.a = dwqm.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
                                                            return erqt.h(a10.a());
                                                        }
                                                    });
                                                }
                                                dxsy dxsyVar = dxigVar3.b;
                                                erid eridVar = (erid) erie.a.createBuilder();
                                                String str12 = dwtmVar8.c;
                                                eridVar.copyOnWrite();
                                                erie erieVar = (erie) eridVar.instance;
                                                str12.getClass();
                                                erieVar.b = 1 | erieVar.b;
                                                erieVar.c = str12;
                                                String str13 = dwtmVar8.d;
                                                eridVar.copyOnWrite();
                                                erie erieVar2 = (erie) eridVar.instance;
                                                str13.getClass();
                                                erieVar2.b |= 4;
                                                erieVar2.e = str13;
                                                int i7 = dwsoVar3.f;
                                                eridVar.copyOnWrite();
                                                erie erieVar3 = (erie) eridVar.instance;
                                                erieVar3.b |= 2;
                                                erieVar3.d = i7;
                                                long j6 = dwsoVar3.t;
                                                eridVar.copyOnWrite();
                                                erie erieVar4 = (erie) eridVar.instance;
                                                erieVar4.b |= 64;
                                                erieVar4.i = j6;
                                                String str14 = dwsoVar3.u;
                                                eridVar.copyOnWrite();
                                                erie erieVar5 = (erie) eridVar.instance;
                                                str14.getClass();
                                                erieVar5.b |= 128;
                                                erieVar5.j = str14;
                                                dxsyVar.q(3, (erie) eridVar.build(), 2);
                                                return erre.a;
                                            }
                                        });
                                    }
                                    final dwsi dwsiVar16 = (dwsi) it.next();
                                    if (dwsiVar16.d.startsWith("inlinefile")) {
                                        int a10 = dwsm.a(dwsoVar.k);
                                        if (a10 == 0) {
                                            a10 = 1;
                                        }
                                        final enhk enhkVar3 = enhkVar2;
                                        final dwtt a11 = dxpp.a(dwsiVar16, a10);
                                        final dwso dwsoVar3 = dwsoVar;
                                        arrayList.add(dxigVar2.r(dxigVar2.e.d(a11), new eroh() { // from class: dxhx
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj3) {
                                                if (((dwtk) obj3).equals(dwtk.DOWNLOAD_COMPLETE)) {
                                                    return erre.a;
                                                }
                                                final dwsi dwsiVar17 = dwsiVar16;
                                                Map map = enhkVar3;
                                                if (!map.containsKey(dwsiVar17.c)) {
                                                    dxth.h("%s:Attempt to import file without inline file source. Id = %s", "FileGroupManager", dwsiVar17.c);
                                                    dwql a12 = dwqn.a();
                                                    a12.a = dwqm.MISSING_INLINE_FILE_SOURCE;
                                                    return erqt.h(a12.a());
                                                }
                                                dwso dwsoVar4 = dwsoVar3;
                                                dxig dxigVar3 = dxig.this;
                                                dwta dwtaVar = dwsoVar4.n;
                                                if (dwtaVar == null) {
                                                    dwtaVar = dwta.a;
                                                }
                                                final dwta dwtaVar2 = dwtaVar;
                                                final dwqw dwqwVar = (dwqw) map.get(dwsiVar17.c);
                                                dwqwVar.getClass();
                                                if (dwsiVar17.d.startsWith("inlinefile")) {
                                                    final dxpn dxpnVar = dxigVar3.e;
                                                    final dwtt dwttVar = a11;
                                                    final dwtm dwtmVar8 = dwtmVar7;
                                                    return elfr.k(dxpnVar.c.e(dwttVar), new eroh() { // from class: dxox
                                                        @Override // defpackage.eroh
                                                        public final ListenableFuture a(Object obj4) {
                                                            final dwsi dwsiVar18 = dwsiVar17;
                                                            dwtx dwtxVar = (dwtx) obj4;
                                                            if (dwtxVar == null) {
                                                                dxth.h("%s: Start import called on file that doesn't exist. Id = %s", "SharedFileManager", dwsiVar18.c);
                                                                dxpo dxpoVar = new dxpo();
                                                                dwql a13 = dwqn.a();
                                                                a13.a = dwqm.SHARED_FILE_NOT_FOUND_ERROR;
                                                                a13.c = dxpoVar;
                                                                return erqt.h(a13.a());
                                                            }
                                                            dwtk b2 = dwtk.b(dwtxVar.d);
                                                            if (b2 == null) {
                                                                b2 = dwtk.NONE;
                                                            }
                                                            if (b2 == dwtk.DOWNLOAD_COMPLETE) {
                                                                return erre.a;
                                                            }
                                                            final dwtw dwtwVar = (dwtw) dwtxVar.toBuilder();
                                                            final String b3 = (dwsiVar18.b & 32) != 0 ? dxse.b(dwtxVar.c, dwsiVar18.i) : dwtxVar.c;
                                                            final dwqw dwqwVar2 = dwqwVar;
                                                            final dwta dwtaVar3 = dwtaVar2;
                                                            final dwtt dwttVar2 = dwttVar;
                                                            final dwtm dwtmVar9 = dwtmVar8;
                                                            final dxpn dxpnVar2 = dxpn.this;
                                                            return elfr.k(elfr.k(dxpnVar2.j.g(dwtmVar9), new eroh() { // from class: dxon
                                                                @Override // defpackage.eroh
                                                                public final ListenableFuture a(Object obj5) {
                                                                    dwso dwsoVar5 = (dwso) obj5;
                                                                    if (dwsoVar5 == null) {
                                                                        dwsoVar5 = dwso.a;
                                                                    }
                                                                    return erqt.i(dwsoVar5);
                                                                }
                                                            }, dxpnVar2.l), new eroh() { // from class: dxpk
                                                                @Override // defpackage.eroh
                                                                public final ListenableFuture a(Object obj5) {
                                                                    dwso dwsoVar5 = (dwso) obj5;
                                                                    final int i7 = dwsoVar5.f;
                                                                    final long j6 = dwsoVar5.t;
                                                                    final String str12 = dwsoVar5.u;
                                                                    final dwtt dwttVar3 = dwttVar2;
                                                                    int a14 = dwsm.a(dwttVar3.f);
                                                                    if (a14 == 0) {
                                                                        a14 = 1;
                                                                    }
                                                                    final dwqw dwqwVar3 = dwqwVar2;
                                                                    final dwta dwtaVar4 = dwtaVar3;
                                                                    final dwsi dwsiVar19 = dwsiVar18;
                                                                    final dwtm dwtmVar10 = dwtmVar9;
                                                                    String str13 = b3;
                                                                    final dwtw dwtwVar2 = dwtwVar;
                                                                    final dxpn dxpnVar3 = dxpn.this;
                                                                    final ListenableFuture k = dxpnVar3.k(a14, str13, dwsiVar19.g);
                                                                    return dycd.e(k).g(new eroh() { // from class: dxop
                                                                        @Override // defpackage.eroh
                                                                        public final ListenableFuture a(Object obj6) {
                                                                            dwtw dwtwVar3 = dwtwVar2;
                                                                            dwtk dwtkVar = dwtk.DOWNLOAD_IN_PROGRESS;
                                                                            dwtwVar3.copyOnWrite();
                                                                            dwtx dwtxVar2 = (dwtx) dwtwVar3.instance;
                                                                            dwtx dwtxVar3 = dwtx.a;
                                                                            dwtxVar2.d = dwtkVar.h;
                                                                            dwtxVar2.b |= 2;
                                                                            return dxpn.this.c.h(dwttVar3, (dwtx) dwtwVar3.build());
                                                                        }
                                                                    }, dxpnVar3.l).g(new eroh() { // from class: dxpa
                                                                        @Override // defpackage.eroh
                                                                        public final ListenableFuture a(Object obj6) {
                                                                            final Uri uri = (Uri) erqt.q(k);
                                                                            dwtt dwttVar4 = dwttVar3;
                                                                            int a15 = dwsm.a(dwttVar4.f);
                                                                            if (a15 == 0) {
                                                                                a15 = 1;
                                                                            }
                                                                            int i8 = a15;
                                                                            dxpn dxpnVar4 = dxpn.this;
                                                                            final dwqw dwqwVar4 = dwqwVar3;
                                                                            final dwta dwtaVar5 = dwtaVar4;
                                                                            String str14 = str12;
                                                                            long j7 = j6;
                                                                            int i9 = i7;
                                                                            dwtm dwtmVar11 = dwtmVar10;
                                                                            dwsi dwsiVar20 = dwsiVar19;
                                                                            final dxsd dxsdVar = new dxsd(dxpnVar4.c, dxpnVar4.e, dwsiVar20, i8, dxpnVar4.h, dwtmVar11, i9, j7, str14, dxpnVar4.i, dxpnVar4.l);
                                                                            final String str15 = dwttVar4.e;
                                                                            final dxss dxssVar = dxpnVar4.d;
                                                                            final String str16 = dwsiVar20.d;
                                                                            final long j8 = dwsiVar20.e;
                                                                            return elfr.k(dxssVar.b(str15, uri), new eroh() { // from class: dxsj
                                                                                @Override // defpackage.eroh
                                                                                public final ListenableFuture a(Object obj7) {
                                                                                    emxc emxcVar3 = (emxc) obj7;
                                                                                    if (emxcVar3.g()) {
                                                                                        return (ListenableFuture) emxcVar3.c();
                                                                                    }
                                                                                    final dwqw dwqwVar5 = dwqwVar4;
                                                                                    final dwta dwtaVar6 = dwtaVar5;
                                                                                    final long j9 = j8;
                                                                                    final String str17 = str16;
                                                                                    dxsr dxsrVar = dxsdVar;
                                                                                    final Uri uri2 = uri;
                                                                                    String str18 = str15;
                                                                                    final dxss dxssVar2 = dxss.this;
                                                                                    return dxssVar2.a(str18, uri2, dxsrVar, new eroh() { // from class: dxsp
                                                                                        @Override // defpackage.eroh
                                                                                        public final ListenableFuture a(Object obj8) {
                                                                                            long j10;
                                                                                            dwqw dwqwVar6 = dwqwVar5;
                                                                                            int d2 = dwqwVar6.a().d();
                                                                                            long j11 = d2;
                                                                                            long j12 = j9;
                                                                                            dxss dxssVar3 = dxss.this;
                                                                                            String str19 = str17;
                                                                                            dwta dwtaVar7 = dwtaVar6;
                                                                                            if (j11 != j12) {
                                                                                                dxth.p("%s: expected file size (%d) does not match source file size (%d) -- using source file size for storage check; file: %s", "MddFileDownloader", Long.valueOf(j12), Integer.valueOf(d2), str19);
                                                                                                j10 = j11;
                                                                                            } else {
                                                                                                j10 = j12;
                                                                                            }
                                                                                            try {
                                                                                                dxss.e(dxssVar3.a, str19, j10, dwtaVar7, dxssVar3.h);
                                                                                                Uri uri3 = uri2;
                                                                                                dxbb h2 = dxbc.h();
                                                                                                h2.i(str19);
                                                                                                h2.g(uri3);
                                                                                                ((dxas) h2).a = emxc.j(new dxau(dwqwVar6));
                                                                                                return ((dxbd) dxssVar3.b.get()).b(h2.j());
                                                                                            } catch (dwqn e) {
                                                                                                dxth.h("%s: Not enough space to download file %s", "MddFileDownloader", str19);
                                                                                                return erqt.h(e);
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                }
                                                                            }, dxssVar.g);
                                                                        }
                                                                    }, dxpnVar3.l);
                                                                }
                                                            }, dxpnVar2.l);
                                                        }
                                                    }, dxpnVar.l);
                                                }
                                                dwql a13 = dwqn.a();
                                                a13.a = dwqm.INVALID_INLINE_FILE_URL_SCHEME;
                                                a13.b = "Importing an inline file requires inlinefile scheme";
                                                return erqt.h(a13.a());
                                            }
                                        }));
                                        dwsoVar = dwsoVar3;
                                    }
                                }
                            }
                        }, dxigVar.h).d(Exception.class, new eroh() { // from class: dxgx
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                final Exception exc = (Exception) obj2;
                                boolean z = exc instanceof dwqn;
                                final dxig dxigVar2 = dxig.this;
                                ListenableFuture listenableFuture = erre.a;
                                final long j6 = j5;
                                final String str12 = str11;
                                final dwtm dwtmVar7 = dwtmVar6;
                                if (z) {
                                    final dwqn dwqnVar = (dwqn) exc;
                                    dxth.c("%s: Logging DownloadException, resultCode = %s", "FileGroupManager", dwqnVar.a);
                                    listenableFuture = dxigVar2.r(listenableFuture, new eroh() { // from class: dxgi
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj3) {
                                            return dxig.this.n(dwtmVar7, dwqnVar, j6, str12);
                                        }
                                    });
                                } else if (exc instanceof dwoa) {
                                    dxth.b("%s: Logging AggregateException", "FileGroupManager");
                                    engw engwVar2 = ((dwoa) exc).a;
                                    int i7 = ((enou) engwVar2).c;
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        Throwable th = (Throwable) engwVar2.get(i8);
                                        if (th instanceof dwqn) {
                                            final dwqn dwqnVar2 = (dwqn) th;
                                            listenableFuture = dxigVar2.r(listenableFuture, new eroh() { // from class: dxgj
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj3) {
                                                    return dxig.this.n(dwtmVar7, dwqnVar2, j6, str12);
                                                }
                                            });
                                        } else {
                                            dxth.n("%s: Expecting DownloadExceptions in AggregateException", "FileGroupManager");
                                            dxth.e(th, "%s: Received non-DownloadException for a download", "FileGroupManager");
                                        }
                                    }
                                }
                                return dxigVar2.r(listenableFuture, new eroh() { // from class: dxgk
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        return erqt.h(exc);
                                    }
                                });
                            }
                        }, dxigVar.h);
                    }
                }, dxmiVar.n);
            }
        }, this.i);
    }

    @Override // defpackage.dwub
    public final ListenableFuture i(final dwxc dwxcVar) {
        return this.p.b(new erog() { // from class: dwvg
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final dwxa dwxaVar = dwxa.this;
                dycd e = dycd.e(dwxaVar.d.f());
                final dwxc dwxcVar2 = dwxcVar;
                return e.g(new eroh() { // from class: dwvq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        enin eninVar = new enin();
                        for (dxqb dxqbVar : (List) obj) {
                            dwxc dwxcVar3 = dwxcVar2;
                            dwol dwolVar = (dwol) dwxcVar3;
                            if (dwxn.a((Account) ((emxn) dwolVar.b).a).equals(dxqbVar.b().e)) {
                                emxc emxcVar = dwolVar.a;
                                dwqs b = dwqs.b(dxqbVar.a().j);
                                if (b == null) {
                                    b = dwqs.GDD_UNKNOWN;
                                }
                                if (((dwqs) ((emxn) emxcVar).a).equals(b)) {
                                    dwtl dwtlVar = (dwtl) dxqbVar.b().toBuilder();
                                    dwtlVar.copyOnWrite();
                                    dwtm dwtmVar = (dwtm) dwtlVar.instance;
                                    dwtmVar.b &= -9;
                                    dwtmVar.f = false;
                                    eninVar.c((dwtm) dwtlVar.build());
                                }
                            }
                        }
                        final enip g = eninVar.g();
                        if (g.isEmpty()) {
                            dwom dwomVar = new dwom();
                            dwomVar.b(0);
                            return erqt.i(dwomVar.a());
                        }
                        dwxa dwxaVar2 = dwxa.this;
                        final engw g2 = g.g();
                        dxth.c("%s removeFileGroups for %d groups", "MDDManager", Integer.valueOf(g2.size()));
                        final dxmi dxmiVar = dwxaVar2.d;
                        return elfr.j(elfr.k(dxmiVar.h(), new eroh() { // from class: dxly
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                final List list = g2;
                                final HashMap h = ennc.h(list.size());
                                final HashMap h2 = ennc.h(list.size());
                                final HashSet hashSet = new HashSet();
                                final ArrayList arrayList = new ArrayList(list.size());
                                final dxig dxigVar = dxmi.this.d;
                                return dycd.e(elfr.i(new erog() { // from class: dxet
                                    @Override // defpackage.erog
                                    public final ListenableFuture a() {
                                        final List list2 = list;
                                        final ArrayList arrayList2 = new ArrayList(list2.size());
                                        Iterator it = list2.iterator();
                                        while (true) {
                                            final Map map = h;
                                            final dxig dxigVar2 = dxig.this;
                                            if (!it.hasNext()) {
                                                return dycg.a(arrayList2).b(new erog() { // from class: dxdk
                                                    @Override // defpackage.erog
                                                    public final ListenableFuture a() {
                                                        dwoa.d(arrayList2, "Unable to clear SPE Sync Reasons", new Object[0]);
                                                        final Map map2 = map;
                                                        engw n = engw.n(map2.keySet());
                                                        final dxig dxigVar3 = dxig.this;
                                                        ListenableFuture j = dxigVar3.d.j(n);
                                                        final List list3 = list2;
                                                        return dxigVar3.r(j, new eroh() { // from class: dxdt
                                                            @Override // defpackage.eroh
                                                            public final ListenableFuture a(Object obj3) {
                                                                boolean booleanValue = ((Boolean) obj3).booleanValue();
                                                                Map map3 = map2;
                                                                if (booleanValue) {
                                                                    map3.values();
                                                                    return erre.a;
                                                                }
                                                                dxig dxigVar4 = dxig.this;
                                                                List list4 = list3;
                                                                dxth.i("%s: Failed to remove %d pending versions of %d requested groups", "FileGroupManager", Integer.valueOf(map3.size()), Integer.valueOf(list4.size()));
                                                                dxigVar4.b.l(1036);
                                                                return erqt.h(new IOException("Failed to remove pending group keys, count = " + list4.size()));
                                                            }
                                                        });
                                                    }
                                                }, dxigVar2.h);
                                            }
                                            final Set set = hashSet;
                                            dwtl dwtlVar2 = (dwtl) ((dwtm) it.next()).toBuilder();
                                            dwtlVar2.copyOnWrite();
                                            dwtm dwtmVar2 = (dwtm) dwtlVar2.instance;
                                            dwtmVar2.b |= 8;
                                            dwtmVar2.f = false;
                                            final dwtm dwtmVar3 = (dwtm) dwtlVar2.build();
                                            arrayList2.add(dycd.e(dxigVar2.d.g(dwtmVar3)).g(new eroh() { // from class: dxdj
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj3) {
                                                    int a;
                                                    dwso dwsoVar = (dwso) obj3;
                                                    if (dwsoVar == null) {
                                                        return erre.a;
                                                    }
                                                    map.put(dwtmVar3, dwsoVar);
                                                    Iterator<E> it2 = dwsoVar.p.iterator();
                                                    while (true) {
                                                        int i = 1;
                                                        if (!it2.hasNext()) {
                                                            break;
                                                        }
                                                        dwsi dwsiVar = (dwsi) it2.next();
                                                        int a2 = dwsm.a(dwsoVar.k);
                                                        if (a2 != 0) {
                                                            i = a2;
                                                        }
                                                        set.add(dxpp.a(dwsiVar, i));
                                                    }
                                                    dxig dxigVar3 = dxig.this;
                                                    return (!dxigVar3.j.g() || (a = dycb.a(dwsoVar.s)) == 0 || a == 1) ? erre.a : ((dycw) ((emyl) dxigVar3.j.c()).get()).a();
                                                }
                                            }, dxigVar2.h));
                                        }
                                    }
                                }, dxigVar.h)).g(new eroh() { // from class: dxeu
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        final List list2 = list;
                                        final ArrayList arrayList2 = new ArrayList(list2.size());
                                        Iterator it = list2.iterator();
                                        while (true) {
                                            final Map map = h2;
                                            final dxig dxigVar2 = dxig.this;
                                            if (!it.hasNext()) {
                                                return dycg.a(arrayList2).b(new erog() { // from class: dxdp
                                                    @Override // defpackage.erog
                                                    public final ListenableFuture a() {
                                                        dwoa.d(arrayList2, "Unable to read downloaded file groups to remove", new Object[0]);
                                                        final Map map2 = map;
                                                        engw n = engw.n(map2.keySet());
                                                        final dxig dxigVar3 = dxig.this;
                                                        ListenableFuture j = dxigVar3.d.j(n);
                                                        final List list3 = list2;
                                                        return dxigVar3.r(j, new eroh() { // from class: dxdz
                                                            @Override // defpackage.eroh
                                                            public final ListenableFuture a(Object obj4) {
                                                                boolean booleanValue = ((Boolean) obj4).booleanValue();
                                                                Map map3 = map2;
                                                                if (booleanValue) {
                                                                    map3.values();
                                                                    return erre.a;
                                                                }
                                                                dxig dxigVar4 = dxig.this;
                                                                dxth.i("%s: Failed to remove %d downloaded versions of %d requested groups", "FileGroupManager", Integer.valueOf(map3.size()), Integer.valueOf(list3.size()));
                                                                dxigVar4.b.l(1036);
                                                                return erqt.h(new IOException("Failed to remove downloaded groups, count = " + map3.size()));
                                                            }
                                                        });
                                                    }
                                                }, dxigVar2.h);
                                            }
                                            final List list3 = arrayList;
                                            dwtl dwtlVar2 = (dwtl) ((dwtm) it.next()).toBuilder();
                                            dwtlVar2.copyOnWrite();
                                            dwtm dwtmVar2 = (dwtm) dwtlVar2.instance;
                                            dwtmVar2.b |= 8;
                                            dwtmVar2.f = true;
                                            final dwtm dwtmVar3 = (dwtm) dwtlVar2.build();
                                            arrayList2.add(dxigVar2.r(dxigVar2.d.g(dwtmVar3), new eroh() { // from class: dxdg
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    dwso dwsoVar = (dwso) obj4;
                                                    if (dwsoVar != null) {
                                                        List list4 = list3;
                                                        map.put(dwtmVar3, dwsoVar);
                                                        list4.add(dwsoVar);
                                                    }
                                                    return erre.a;
                                                }
                                            }));
                                        }
                                    }
                                }, dxigVar.h).g(new eroh() { // from class: dxev
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        if (h2.isEmpty()) {
                                            return erre.a;
                                        }
                                        List list2 = arrayList;
                                        final ArrayList arrayList2 = new ArrayList();
                                        Iterator it = list2.iterator();
                                        while (true) {
                                            final dxig dxigVar2 = dxig.this;
                                            if (!it.hasNext()) {
                                                return dycg.a(arrayList2).a(new Callable() { // from class: dxgt
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() {
                                                        dwoa.d(arrayList2, "Unable to add removed downloaded groups as stale", new Object[0]);
                                                        return null;
                                                    }
                                                }, dxigVar2.h);
                                            }
                                            final dwso dwsoVar = (dwso) it.next();
                                            arrayList2.add(dxigVar2.r(dxigVar2.d.a(dwsoVar), new eroh() { // from class: dxgs
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    if (((Boolean) obj4).booleanValue()) {
                                                        return erre.a;
                                                    }
                                                    dwso dwsoVar2 = dwsoVar;
                                                    dxig dxigVar3 = dxig.this;
                                                    dxth.h("%s: Failed to add to stale for group: '%s';", "FileGroupManager", dwsoVar2.d);
                                                    dxigVar3.b.l(1036);
                                                    return erqt.h(new IOException("Failed to add downloaded group to stale: ".concat(String.valueOf(dwsoVar2.d))));
                                                }
                                            }));
                                        }
                                    }
                                }, dxigVar.h).g(new eroh() { // from class: dxew
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        if (h.isEmpty()) {
                                            return erre.a;
                                        }
                                        final Set set = hashSet;
                                        final dxig dxigVar2 = dxig.this;
                                        final enin eninVar2 = new enin();
                                        return dxigVar2.r(dxigVar2.q(dxigVar2.d.c(), new emwl() { // from class: dxgh
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj4) {
                                                Iterator it = ((List) obj4).iterator();
                                                while (true) {
                                                    enin eninVar3 = enin.this;
                                                    if (!it.hasNext()) {
                                                        return eninVar3.g();
                                                    }
                                                    dwso a = ((dxqb) it.next()).a();
                                                    for (dwsi dwsiVar : a.p) {
                                                        int a2 = dwsm.a(a.k);
                                                        if (a2 == 0) {
                                                            a2 = 1;
                                                        }
                                                        eninVar3.c(dxpp.a(dwsiVar, a2));
                                                    }
                                                }
                                            }
                                        }), new eroh() { // from class: dxdl
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj4) {
                                                enip enipVar = (enip) obj4;
                                                final ArrayList arrayList2 = new ArrayList();
                                                Iterator it = set.iterator();
                                                while (true) {
                                                    dxig dxigVar3 = dxig.this;
                                                    if (!it.hasNext()) {
                                                        return dycg.a(arrayList2).a(new Callable() { // from class: dxeq
                                                            @Override // java.util.concurrent.Callable
                                                            public final Object call() {
                                                                dwoa.d(arrayList2, "Unable to cancel downloads for removed groups", new Object[0]);
                                                                return null;
                                                            }
                                                        }, dxigVar3.h);
                                                    }
                                                    dwtt dwttVar = (dwtt) it.next();
                                                    if (!enipVar.contains(dwttVar)) {
                                                        arrayList2.add(dxigVar3.e.a(dwttVar));
                                                    }
                                                }
                                            }
                                        });
                                    }
                                }, dxigVar.h);
                            }
                        }, dxmiVar.n), new emwl() { // from class: dwuy
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                dwom dwomVar2 = new dwom();
                                dwomVar2.b(enip.this.size());
                                return dwomVar2.a();
                            }
                        }, dwxaVar2.i);
                    }
                }, dwxaVar.i);
            }
        }, this.i);
    }

    @Override // defpackage.dwub
    public final ListenableFuture j(final emxc emxcVar) {
        return this.p.a(new Callable() { // from class: dwup
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dwxa dwxaVar = dwxa.this;
                if (!dwxaVar.c.g()) {
                    dxth.g("%s: Called schedulePeriodicTasksInternal when taskScheduler is not provided.", "MobileDataDownload");
                    return null;
                }
                emxc emxcVar2 = emxcVar;
                dwxk dwxkVar = (dwxk) dwxaVar.c.c();
                enhd enhdVar = new enhd();
                enhdVar.k("MDD.CHARGING.PERIODIC.TASK", dwxl.a(dwxaVar.f.w()));
                enhdVar.k("MDD.MAINTENANCE.PERIODIC.GCM.TASK", dwxl.a(dwxaVar.f.v()));
                enhdVar.k("MDD.CELLULAR.CHARGING.PERIODIC.TASK", dwxl.a(dwxaVar.f.u()));
                enhdVar.k("MDD.WIFI.CHARGING.PERIODIC.TASK", dwxl.a(dwxaVar.f.x()));
                enhk c = enhdVar.c();
                dwxkVar.a("MDD.CHARGING.PERIODIC.TASK", dwxaVar.f.q(), 3, dwxa.t(emxcVar2, c, "MDD.CHARGING.PERIODIC.TASK"));
                dwxkVar.a("MDD.MAINTENANCE.PERIODIC.GCM.TASK", dwxaVar.f.r(), 3, dwxa.t(emxcVar2, c, "MDD.MAINTENANCE.PERIODIC.GCM.TASK"));
                dwxkVar.a("MDD.CELLULAR.CHARGING.PERIODIC.TASK", dwxaVar.f.p(), 1, dwxa.t(emxcVar2, c, "MDD.CELLULAR.CHARGING.PERIODIC.TASK"));
                dwxkVar.a("MDD.WIFI.CHARGING.PERIODIC.TASK", dwxaVar.f.s(), 2, dwxa.t(emxcVar2, c, "MDD.WIFI.CHARGING.PERIODIC.TASK"));
                return null;
            }
        }, this.i);
    }

    @Override // defpackage.dwub
    public final String k() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        try {
            final dxmi dxmiVar = this.d;
            elfr.k(dxmiVar.h(), new eroh() { // from class: dxld
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final PrintWriter printWriter2 = printWriter;
                    printWriter2.println("==== MDD_FILE_GROUP_MANAGER ====");
                    printWriter2.println("MDD_FRESH_FILE_GROUPS:");
                    final dxmi dxmiVar2 = dxmi.this;
                    final dxig dxigVar = dxmiVar2.d;
                    return elfr.k(dxigVar.r(dxigVar.r(dxigVar.d.c(), new eroh() { // from class: dxge
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            ArrayList arrayList = new ArrayList((List) obj2);
                            Collections.sort(arrayList, new Comparator() { // from class: dxgr
                                @Override // java.util.Comparator
                                public final int compare(Object obj3, Object obj4) {
                                    dxqb dxqbVar = (dxqb) obj3;
                                    dxqb dxqbVar2 = (dxqb) obj4;
                                    return enem.b.c(dxqbVar.b().c, dxqbVar2.b().c).c(dxqbVar.b().e, dxqbVar2.b().e).a();
                                }
                            });
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                PrintWriter printWriter3 = printWriter2;
                                dxqb dxqbVar = (dxqb) arrayList.get(i);
                                printWriter3.format("GroupName: %s\nAccount: %s\nDataFileGroup:\n %s\n\n", dxqbVar.b().c, dxqbVar.b().e, dxqbVar.a().toString());
                            }
                            return erre.a;
                        }
                    }), new eroh() { // from class: dxgo
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final PrintWriter printWriter3 = printWriter2;
                            printWriter3.println("MDD_STALE_FILE_GROUPS:");
                            dxig dxigVar2 = dxig.this;
                            return dxigVar2.r(dxigVar2.d.e(), new eroh() { // from class: dxdw
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    for (dwso dwsoVar : (List) obj3) {
                                        PrintWriter printWriter4 = printWriter3;
                                        printWriter4.format("GroupName: %s\nDataFileGroup:\n%s\n", dwsoVar.d, dwsoVar.toString());
                                    }
                                    return erre.a;
                                }
                            });
                        }
                    }), new eroh() { // from class: dxkt
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final PrintWriter printWriter3 = printWriter2;
                            printWriter3.println("==== MDD_SHARED_FILES ====");
                            final dxpn dxpnVar = dxmi.this.f;
                            return elfr.k(dxpnVar.c.c(), new eroh() { // from class: dxpl
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    ListenableFuture listenableFuture = erre.a;
                                    for (final dwtt dwttVar : (List) obj3) {
                                        final PrintWriter printWriter4 = printWriter3;
                                        final dxpn dxpnVar2 = dxpn.this;
                                        listenableFuture = elfr.k(listenableFuture, new eroh() { // from class: dxok
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj4) {
                                                final dxpn dxpnVar3 = dxpn.this;
                                                final PrintWriter printWriter5 = printWriter4;
                                                dxpq dxpqVar = dxpnVar3.c;
                                                final dwtt dwttVar2 = dwttVar;
                                                return elfr.k(dxpqVar.e(dwttVar2), new eroh() { // from class: dxor
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj5) {
                                                        dwtx dwtxVar = (dwtx) obj5;
                                                        if (dwtxVar == null) {
                                                            dxth.g("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                                                            return erre.a;
                                                        }
                                                        dwtt dwttVar3 = dwttVar2;
                                                        PrintWriter printWriter6 = printWriter5;
                                                        printWriter6.format("FileKey: %s\nFileName: %s\nSharedFile: %s\n", dwttVar3, dwtxVar.c, dwtxVar.toString());
                                                        if (dwtxVar.e) {
                                                            printWriter6.format("Checksum Android-shared file: %s\n", dwtxVar.g);
                                                        } else {
                                                            dxpn dxpnVar4 = dxpn.this;
                                                            int a = dwsm.a(dwttVar3.f);
                                                            Uri e = dxvb.e(dxpnVar4.a, a == 0 ? 1 : a, dwtxVar.c, dwttVar3.e, dxpnVar4.b, dxpnVar4.k, false);
                                                            if (e != null) {
                                                                printWriter6.format("Checksum downloaded file: %s\n", dxsf.b(dxpnVar4.e, e));
                                                            }
                                                        }
                                                        return erre.a;
                                                    }
                                                }, dxpnVar3.l);
                                            }
                                        }, dxpnVar2.l);
                                    }
                                    return listenableFuture;
                                }
                            }, dxpnVar.l);
                        }
                    }, dxmiVar2.n);
                }
            }, dxmiVar.n).get(3L, TimeUnit.SECONDS);
            printWriter.println("==== MOBSTORE_DEBUG_INFO ====");
            final efbm efbmVar = this.e;
            printWriter.print(String.format("Registered Mobstore Plugins:\n\nBackends:\n%1$s\n\nTransforms:\n%2$s\n\nMonitors:\n%3$s", TextUtils.join(",\n", enpw.k(enjk.f(efbmVar.a.keySet(), new emwl() { // from class: efbj
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    return String.format("protocol: %1$s, class: %2$s", str, ((efef) efbm.this.a.get(str)).getClass().getSimpleName());
                }
            }))), TextUtils.join(",\n", enpw.k(enjk.f(efbmVar.b.values(), new emwl() { // from class: efbk
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ((efel) obj).getClass().getSimpleName();
                }
            }))), TextUtils.join(",\n", enpw.k(enjk.f(efbmVar.c, new emwl() { // from class: efbl
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ((efej) obj).getClass().getSimpleName();
                }
            })))));
            printWriter.flush();
            return byteArrayOutputStream.toString();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            String format = String.format("%s: Couldn't get debug info: %s", "MobileDataDownload", e);
            dxth.f(format);
            return format;
        } catch (ExecutionException e2) {
            e = e2;
            String format2 = String.format("%s: Couldn't get debug info: %s", "MobileDataDownload", e);
            dxth.f(format2);
            return format2;
        } catch (TimeoutException e3) {
            e = e3;
            String format22 = String.format("%s: Couldn't get debug info: %s", "MobileDataDownload", e);
            dxth.f(format22);
            return format22;
        }
    }

    @Override // defpackage.dwub
    public final void l(final String str) {
        dxth.c("%s: CancelForegroundDownload for key = %s", "MobileDataDownload", str);
        elfr.k(this.g.d(str), new eroh() { // from class: dwvs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                emxc emxcVar = (emxc) obj;
                if (emxcVar.g()) {
                    dxth.l("%s: CancelForegroundDownload future found for key = %s, cancelling...", "MobileDataDownload", str);
                    ((ListenableFuture) emxcVar.c()).cancel(false);
                }
                return erre.a;
            }
        }, this.i);
        this.o.b(str);
    }

    @Override // defpackage.dwub
    public final ListenableFuture m(final String str, emxc emxcVar) {
        ListenableFuture g = g(str);
        final emxc b = emxcVar.b(new emwl() { // from class: dwvu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwxg dwxgVar = (dwxg) obj;
                erjp erjpVar = (erjp) erjs.a.createBuilder();
                long a = dwxgVar.a();
                erjpVar.copyOnWrite();
                erjs erjsVar = (erjs) erjpVar.instance;
                erjsVar.b |= 1;
                erjsVar.c = a;
                int e = dwxgVar.e() - 1;
                int i = e != 0 ? e != 2 ? 3 : 4 : 2;
                erjpVar.copyOnWrite();
                erjs erjsVar2 = (erjs) erjpVar.instance;
                erjsVar2.d = i - 1;
                erjsVar2.b |= 2;
                boolean b2 = dwxgVar.b();
                erjpVar.copyOnWrite();
                erjs erjsVar3 = (erjs) erjpVar.instance;
                erjsVar3.b = 4 | erjsVar3.b;
                erjsVar3.e = b2;
                boolean c = dwxgVar.c();
                erjpVar.copyOnWrite();
                erjs erjsVar4 = (erjs) erjpVar.instance;
                erjsVar4.b |= 8;
                erjsVar4.f = c;
                boolean d = dwxgVar.d();
                erjpVar.copyOnWrite();
                erjs erjsVar5 = (erjs) erjpVar.instance;
                erjsVar5.b |= 16;
                erjsVar5.g = d;
                dwxgVar.f();
                erjpVar.copyOnWrite();
                erjs erjsVar6 = (erjs) erjpVar.instance;
                erjsVar6.h = 1;
                erjsVar6.b |= 32;
                return (erjs) erjpVar.build();
            }
        });
        return dycd.e(g).g(new eroh() { // from class: dwvv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return dwxa.this.b.b(str, emux.a, b);
            }
        }, this.i).d(Exception.class, new eroh() { // from class: dwvw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Throwable th = (Exception) obj;
                if (th instanceof ExecutionException) {
                    ExecutionException executionException = (ExecutionException) th;
                    if (executionException.getCause() != null) {
                        th = executionException.getCause();
                    }
                }
                emxc emxcVar2 = b;
                String str2 = str;
                dwxa dwxaVar = dwxa.this;
                th.getClass();
                return dycd.e(dwxaVar.b.b(str2, emxc.j(th), emxcVar2)).g(new eroh() { // from class: dwvp
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return erqt.h(th);
                    }
                }, dwxaVar.i);
            }
        }, this.i);
    }

    public final ListenableFuture q(final dwqp dwqpVar) {
        dwoe dwoeVar = (dwoe) dwqpVar;
        final dxbq c = dxbq.c(dwoeVar.a, dwoeVar.b);
        dwtl dwtlVar = (dwtl) dwtm.a.createBuilder();
        dwtlVar.copyOnWrite();
        dwtm dwtmVar = (dwtm) dwtlVar.instance;
        dwtmVar.b |= 1;
        final String str = dwoeVar.a;
        dwtmVar.c = str;
        String packageName = this.a.getPackageName();
        dwtlVar.copyOnWrite();
        dwtm dwtmVar2 = (dwtm) dwtlVar.instance;
        packageName.getClass();
        dwtmVar2.b |= 2;
        dwtmVar2.d = packageName;
        if (dwoeVar.b.g()) {
            String a = dwxn.a((Account) dwoeVar.b.c());
            dwtlVar.copyOnWrite();
            dwtm dwtmVar3 = (dwtm) dwtlVar.instance;
            dwtmVar3.b |= 4;
            dwtmVar3.e = a;
        }
        final dwtm dwtmVar4 = (dwtm) dwtlVar.build();
        return this.p.b(new erog() { // from class: dwux
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dxbp dxbpVar = (dxbp) c;
                final dwxa dwxaVar = dwxa.this;
                dxvi dxviVar = dwxaVar.h;
                String str2 = dxbpVar.a;
                final ListenableFuture d = dwxaVar.g.d(str2);
                final ListenableFuture d2 = dxviVar.d(str2);
                dycf d3 = dycg.d(d, d2);
                final dwtm dwtmVar5 = dwtmVar4;
                final dwqp dwqpVar2 = dwqpVar;
                final String str3 = str;
                return d3.b(new erog() { // from class: dwuz
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        ListenableFuture listenableFuture = d;
                        if (((emxc) erqt.q(listenableFuture)).g()) {
                            return erqt.i(new dxby((ListenableFuture) ((emxc) erqt.q(listenableFuture)).c()));
                        }
                        ListenableFuture listenableFuture2 = d2;
                        if (((emxc) erqt.q(listenableFuture2)).g()) {
                            return erqt.i(new dxby((ListenableFuture) ((emxc) erqt.q(listenableFuture2)).c()));
                        }
                        final String str4 = str3;
                        final dwqp dwqpVar3 = dwqpVar2;
                        final dwtm dwtmVar6 = dwtmVar5;
                        final dwxa dwxaVar2 = dwxa.this;
                        return elfr.k(elfr.k(dwxaVar2.d.g(dwtmVar6, false), new eroh() { // from class: dwve
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                dwxa dwxaVar3 = dwxa.this;
                                final dwso dwsoVar = (dwso) obj;
                                return elfr.j(dwxaVar3.d.g(dwtmVar6, true), new emwl() { // from class: dwvr
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        return new dxqa(dwso.this, (dwso) obj2);
                                    }
                                }, dwxaVar3.i);
                            }
                        }, dwxaVar2.i), new eroh() { // from class: dwvf
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                dxqc dxqcVar = (dxqc) obj;
                                if (dxqcVar.b() != null) {
                                    dwso b = dxqcVar.b();
                                    b.getClass();
                                    return erqt.i(new dxbz(b));
                                }
                                dwtm dwtmVar7 = dwtmVar6;
                                if (dxqcVar.a() == null) {
                                    dwql a2 = dwqn.a();
                                    a2.a = dwqm.GROUP_NOT_FOUND_ERROR;
                                    a2.b = "Nothing to download for file group: ".concat(String.valueOf(dwtmVar7.c));
                                    return erqt.h(a2.a());
                                }
                                dwqp dwqpVar4 = dwqpVar3;
                                dwxa dwxaVar3 = dwxa.this;
                                dwso a3 = dxqcVar.a();
                                a3.getClass();
                                emxc o = dwxa.o(dwtmVar7, a3, dwxaVar3.f);
                                dwoe dwoeVar2 = (dwoe) dwqpVar4;
                                String a4 = dwoeVar2.b.g() ? dwxn.a((Account) dwoeVar2.b.c()) : null;
                                String str5 = str4;
                                dycd f = dycd.e(dwxa.u(a3, o, a4, dwnr.DOWNLOADED, dwoeVar2.f, dwxaVar3.d, dwxaVar3.i, dwxaVar3.e)).f(new dwwm(), dwxaVar3.i).f(new emwl(false, dwqpVar4, str5) { // from class: dwva
                                    public final /* synthetic */ boolean b = false;
                                    public final /* synthetic */ dwqp c;
                                    public final /* synthetic */ String d;

                                    {
                                        this.c = dwqpVar4;
                                        this.d = str5;
                                    }

                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        return (dwns) obj2;
                                    }
                                }, dwxaVar3.i);
                                elfr.l(f.b, new dwwr(dwxaVar3, false, str5), dwxaVar3.i);
                                return f.f(new emwl() { // from class: dwvb
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        return new dxbx((dwns) obj2);
                                    }
                                }, erpp.a);
                            }
                        }, dwxaVar2.i);
                    }
                }, dwxaVar.i);
            }
        }, this.i);
    }

    public final ListenableFuture r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            arrayList.add(((dwqt) it.next()).a(this));
        }
        return dycg.a(arrayList).a(new Callable() { // from class: dwvx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, this.i);
    }

    public final ListenableFuture v(dwtm dwtmVar, dwso dwsoVar, boolean z, boolean z2) {
        return elfr.j(u(dwsoVar, o(dwtmVar, dwsoVar, this.f), (dwtmVar.b & 4) != 0 ? dwtmVar.e : null, z ? dwnr.DOWNLOADED : dwnr.PENDING, z2, this.d, this.i, this.e), new emwl() { // from class: dwvj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dwns dwnsVar = (dwns) obj;
                if (dwnsVar != null) {
                    dwxa dwxaVar = dwxa.this;
                    dwxaVar.b.h(dwxa.p(dwnsVar));
                }
                return dwnsVar;
            }
        }, this.i);
    }
}
