package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpn {
    public final Context a;
    public final dwxf b;
    public final dxpq c;
    public final dxss d;
    public final efbm e;
    public final emxc f;
    public final emxc g;
    public final dxsy h;
    public final dwqy i;
    public final dxih j;
    public final emxc k;
    public final Executor l;

    public dxpn(Context context, dwxf dwxfVar, dxpq dxpqVar, efbm efbmVar, dxss dxssVar, emxc emxcVar, emxc emxcVar2, dxsy dxsyVar, dwqy dwqyVar, dxih dxihVar, emxc emxcVar3, Executor executor) {
        this.a = context;
        this.b = dwxfVar;
        this.c = dxpqVar;
        this.e = efbmVar;
        this.d = dxssVar;
        this.f = emxcVar;
        this.g = emxcVar2;
        this.h = dxsyVar;
        this.i = dwqyVar;
        this.j = dxihVar;
        this.k = emxcVar3;
        this.l = executor;
    }

    public final ListenableFuture a(final dwtt dwttVar) {
        return elfr.k(this.c.e(dwttVar), new eroh() { // from class: dxog
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwtx dwtxVar = (dwtx) obj;
                if (dwtxVar == null) {
                    dxth.g("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                    return erqt.h(new dxpo());
                }
                dwtk b = dwtk.b(dwtxVar.d);
                if (b == null) {
                    b = dwtk.NONE;
                }
                if (b != dwtk.DOWNLOAD_COMPLETE) {
                    dwtt dwttVar2 = dwttVar;
                    dxpn dxpnVar = dxpn.this;
                    int a = dwsm.a(dwttVar2.f);
                    if (a == 0) {
                        a = 1;
                    }
                    Uri e = dxvb.e(dxpnVar.a, a, dwtxVar.c, dwttVar2.e, dxpnVar.b, dxpnVar.k, false);
                    if (e != null) {
                        dxpnVar.d.f(dwttVar2.e, e);
                    }
                    dwtk b2 = dwtk.b(dwtxVar.d);
                    if (b2 == null) {
                        b2 = dwtk.NONE;
                    }
                    if (b2 == dwtk.DOWNLOAD_IN_PROGRESS) {
                        dxpq dxpqVar = dxpnVar.c;
                        dwtw dwtwVar = (dwtw) dwtxVar.toBuilder();
                        dwtk dwtkVar = dwtk.SUBSCRIBED;
                        dwtwVar.copyOnWrite();
                        dwtx dwtxVar2 = (dwtx) dwtwVar.instance;
                        dwtxVar2.d = dwtkVar.h;
                        dwtxVar2.b |= 2;
                        return elfr.k(dxpqVar.h(dwttVar2, (dwtx) dwtwVar.build()), new eroh() { // from class: dxpg
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return erre.a;
                            }
                        }, dxpnVar.l);
                    }
                }
                return erre.a;
            }
        }, this.l);
    }

    public final ListenableFuture b() {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                Context context = this.a;
                int i = efby.a;
                this.e.f(efbx.a("*.lease", context.getPackageName(), 0L));
                this.h.l(1077);
            } catch (efcy unused) {
                int i2 = dxth.a;
                ((enrr) ((enrr) dxtg.a.f()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "v", 35, "LogUtil.java")).t("%s: Failed to release the leases in the android shared storage. UnsupportedFileStorageOperation was thrown", "SharedFileManager");
                ((enrr) dxtg.a.f()).R();
            } catch (IOException e) {
                dxth.k(e, "%s: Failed to release the leases in the android shared storage", "SharedFileManager");
                this.h.l(1078);
            }
        }
        try {
            this.e.j(dxvb.a(this.a, this.k));
        } catch (IOException unused2) {
            this.b.a();
        }
        return erre.a;
    }

    public final ListenableFuture c(final dwtt dwttVar, final String str, final int i, final long j, final String str2, final dwtm dwtmVar, final dwsi dwsiVar, final dwss dwssVar, final dwta dwtaVar, final int i2, final List list, final eydq eydqVar) {
        return elfr.k(g(dwttVar), new eroh() { // from class: dxof
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwtx dwtxVar = (dwtx) obj;
                dwtk b = dwtk.b(dwtxVar.d);
                if (b == null) {
                    b = dwtk.NONE;
                }
                if (b == dwtk.DOWNLOAD_COMPLETE) {
                    return erre.a;
                }
                final dwtt dwttVar2 = dwttVar;
                final dwtw dwtwVar = (dwtw) dwtxVar.toBuilder();
                int a = dwsm.a(dwttVar2.f);
                if (a == 0) {
                    a = 1;
                }
                final eydq eydqVar2 = eydqVar;
                final List list2 = list;
                final int i3 = i2;
                final dwta dwtaVar2 = dwtaVar;
                final String str3 = str2;
                final long j2 = j;
                final int i4 = i;
                final dwtm dwtmVar2 = dwtmVar;
                final dwss dwssVar2 = dwssVar;
                final dwsi dwsiVar2 = dwsiVar;
                String str4 = str;
                final dxpn dxpnVar = dxpn.this;
                final ListenableFuture k = dxpnVar.k(a, str4, dwsiVar2.g);
                return dycd.e(k).g(new eroh() { // from class: dxov
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        dwtw dwtwVar2 = dwtwVar;
                        dwtk dwtkVar = dwtk.DOWNLOAD_IN_PROGRESS;
                        dwtwVar2.copyOnWrite();
                        dwtx dwtxVar2 = (dwtx) dwtwVar2.instance;
                        dwtx dwtxVar3 = dwtx.a;
                        dwtxVar2.d = dwtkVar.h;
                        dwtxVar2.b |= 2;
                        return dxpn.this.c.h(dwttVar2, (dwtx) dwtwVar2.build());
                    }
                }, dxpnVar.l).g(new eroh() { // from class: dxow
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        dwss dwssVar3;
                        Uri uri = (Uri) erqt.q(k);
                        dxpn dxpnVar2 = dxpn.this;
                        dwtm dwtmVar3 = dwtmVar2;
                        int i5 = i4;
                        int i6 = i3;
                        long j3 = j2;
                        List list3 = list2;
                        dwsi dwsiVar3 = dwsiVar2;
                        dwtt dwttVar3 = dwttVar2;
                        String str5 = str3;
                        dwta dwtaVar3 = dwtaVar2;
                        eydq eydqVar3 = eydqVar2;
                        if (dxpnVar2.f.g() && (dwssVar3 = dwssVar2) != null) {
                            Context context = dxpnVar2.a;
                            dxpq dxpqVar = dxpnVar2.c;
                            efbm efbmVar = dxpnVar2.e;
                            dwxf dwxfVar = dxpnVar2.b;
                            int a2 = dwsm.a(dwttVar3.f);
                            dxrw dxrwVar = new dxrw(context, dxpqVar, efbmVar, dwxfVar, dwsiVar3, a2 == 0 ? 1 : a2, (dxam) dxpnVar2.f.c(), dwssVar3, dxpnVar2.h, dwtmVar3, i5, j3, str5, dxpnVar2.k, dxpnVar2.i, dxpnVar2.l);
                            dxpnVar2.i(dwtmVar3, uri);
                            return dxpnVar2.d.d(dwttVar3.e, dwtmVar3, i5, j3, str5, uri, dwssVar3.c, dwssVar3.d, dwtaVar3, dxrwVar, i6, list3, eydqVar3);
                        }
                        int i7 = 1;
                        dxpq dxpqVar2 = dxpnVar2.c;
                        efbm efbmVar2 = dxpnVar2.e;
                        int a3 = dwsm.a(dwttVar3.f);
                        if (a3 != 0) {
                            i7 = a3;
                        }
                        dxsd dxsdVar = new dxsd(dxpqVar2, efbmVar2, dwsiVar3, i7, dxpnVar2.h, dwtmVar3, i5, j3, str5, dxpnVar2.i, dxpnVar2.l);
                        dxpnVar2.i(dwtmVar3, uri);
                        return dxpnVar2.d.d(dwttVar3.e, dwtmVar3, i5, j3, str5, uri, dwsiVar3.d, dwsiVar3.e, dwtaVar3, dxsdVar, i6, list3, eydqVar3);
                    }
                }, dxpnVar.l);
            }
        }, this.l);
    }

    final ListenableFuture d(dwtt dwttVar) {
        return elfr.k(g(dwttVar), new eroh() { // from class: dxph
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwtk b = dwtk.b(((dwtx) obj).d);
                if (b == null) {
                    b = dwtk.NONE;
                }
                return erqt.i(b);
            }
        }, this.l);
    }

    public final ListenableFuture e(final dwtt dwttVar) {
        return elfr.j(f(new enpx(dwttVar)), new emwl() { // from class: dxoy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (Uri) ((enhk) obj).get(dwtt.this);
            }
        }, erpp.a);
    }

    final ListenableFuture f(final enip enipVar) {
        return dycd.e(this.c.f(enipVar)).g(new eroh() { // from class: dxoo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                enhk enhkVar = (enhk) obj;
                enhd enhdVar = new enhd();
                enqu listIterator = enipVar.listIterator();
                while (listIterator.hasNext()) {
                    dwtt dwttVar = (dwtt) listIterator.next();
                    if (!enhkVar.containsKey(dwttVar)) {
                        dxth.h("%s: getOnDeviceUris called on file that doesn't exist. Key = %s!", "SharedFileManager", dwttVar);
                        return erqt.h(new dxpo());
                    }
                    dxpn dxpnVar = dxpn.this;
                    dwtx dwtxVar = (dwtx) enhkVar.get(dwttVar);
                    int a = dwsm.a(dwttVar.f);
                    if (a == 0) {
                        a = 1;
                    }
                    Uri e = dxvb.e(dxpnVar.a, a, dwtxVar.c, dwtxVar.g, dxpnVar.b, dxpnVar.k, dwtxVar.e);
                    if (e != null) {
                        enhdVar.k(dwttVar, e);
                    }
                }
                return erqt.i(enhdVar.b());
            }
        }, this.l);
    }

    final ListenableFuture g(final dwtt dwttVar) {
        return elfr.k(this.c.e(dwttVar), new eroh() { // from class: dxoi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwtx dwtxVar = (dwtx) obj;
                if (dwtxVar != null) {
                    return erqt.i(dwtxVar);
                }
                dxth.h("%s: getSharedFile called on file that doesn't exist! Key = %s", "SharedFileManager", dwtt.this);
                return erqt.h(new dxpo());
            }
        }, this.l);
    }

    final ListenableFuture h(final dwtm dwtmVar, final int i, final long j, final String str, final dwsi dwsiVar, final dwtt dwttVar, final dwta dwtaVar, final int i2, final List list, final eydq eydqVar) {
        final ListenableFuture i3;
        dxth.c("%s: startDownload called for %s", "SharedFileManager", dwsiVar.d);
        if (dwsiVar.d.startsWith("inlinefile")) {
            dwql a = dwqn.a();
            a.a = dwqm.INVALID_INLINE_FILE_URL_SCHEME;
            a.b = "downloading a file with an inlinefile scheme is not supported, use importFiles instead.";
            return erqt.h(a.a());
        }
        final ListenableFuture g = g(dwttVar);
        int a2 = dwsm.a(dwttVar.f);
        if (a2 == 0) {
            a2 = 1;
        }
        if (dxkk.a(this.a, this.b).d < dxkj.USE_CHECKSUM_ONLY.d || !this.f.g()) {
            i3 = erqt.i(null);
        } else {
            i3 = j(dwsiVar.l, 0, a2);
        }
        final ListenableFuture a3 = dycg.d(g, i3).a(new Callable() { // from class: dxoz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = ((dwtx) erqt.q(ListenableFuture.this)).c;
                dwss dwssVar = (dwss) erqt.q(i3);
                if (dwssVar != null) {
                    return dxse.b(str2, dwssVar.e);
                }
                dwsi dwsiVar2 = dwsiVar;
                return (dwsiVar2.b & 32) != 0 ? dxse.b(str2, dwsiVar2.i) : str2;
            }
        }, erpp.a);
        final ListenableFuture k = elfr.k(a3, new eroh() { // from class: dxpb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str2 = (String) obj;
                int a4 = dwsm.a(dwttVar.f);
                if (a4 == 0) {
                    a4 = 1;
                }
                return dxpn.this.k(a4, str2, dwsiVar.g);
            }
        }, this.l);
        final ListenableFuture listenableFuture = i3;
        return dycd.e(dycg.d(g, i3, a3, k).b(new erog() { // from class: dxpc
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return erre.a;
            }
        }, erpp.a)).g(new eroh() { // from class: dxpd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwtx dwtxVar = (dwtx) erqt.q(g);
                final dwss dwssVar = (dwss) erqt.q(listenableFuture);
                final String str2 = (String) erqt.q(a3);
                final Uri uri = (Uri) erqt.q(k);
                dwtk b = dwtk.b(dwtxVar.d);
                if (b == null) {
                    b = dwtk.NONE;
                }
                final dwsi dwsiVar2 = dwsiVar;
                dxth.d("%s: startDownload status %s for %s", "SharedFileManager", b, dwsiVar2.d);
                int i4 = dwtxVar.d;
                dwtk b2 = dwtk.b(i4);
                if (b2 == null) {
                    b2 = dwtk.NONE;
                }
                final dwtm dwtmVar2 = dwtmVar;
                final dxpn dxpnVar = dxpn.this;
                if (b2 == dwtk.DOWNLOAD_COMPLETE) {
                    if (dxpnVar.g.g()) {
                        dxxc dxxcVar = (dxxc) dxpnVar.g.c();
                        String str3 = dwtmVar2.c;
                        long j2 = dwsiVar2.j;
                        if (j2 <= 0) {
                            j2 = dwsiVar2.e;
                        }
                        dxxcVar.i(str3, j2);
                    }
                    return erre.a;
                }
                dwtk b3 = dwtk.b(i4);
                if (b3 == null) {
                    b3 = dwtk.NONE;
                }
                final eydq eydqVar2 = eydqVar;
                final List list2 = list;
                final int i5 = i2;
                final dwta dwtaVar2 = dwtaVar;
                final String str4 = str;
                final long j3 = j;
                final int i6 = i;
                final dwtt dwttVar2 = dwttVar;
                return b3 == dwtk.DOWNLOAD_IN_PROGRESS ? elfr.k(dxpnVar.d.b(dwttVar2.e, uri), new eroh() { // from class: dxpm
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        emxc emxcVar = (emxc) obj2;
                        boolean g2 = emxcVar.g();
                        dxpn dxpnVar2 = dxpn.this;
                        dwtm dwtmVar3 = dwtmVar2;
                        if (g2) {
                            dxpnVar2.i(dwtmVar3, uri);
                            return (ListenableFuture) emxcVar.c();
                        }
                        eydq eydqVar3 = eydqVar2;
                        List list3 = list2;
                        int i7 = i5;
                        dwta dwtaVar3 = dwtaVar2;
                        dwss dwssVar2 = dwssVar;
                        dwsi dwsiVar3 = dwsiVar2;
                        String str5 = str4;
                        long j4 = j3;
                        int i8 = i6;
                        return dxpnVar2.c(dwttVar2, str2, i8, j4, str5, dwtmVar3, dwsiVar3, dwssVar2, dwtaVar3, i7, list3, eydqVar3);
                    }
                }, dxpnVar.l) : dxpnVar.c(dwttVar2, str2, i6, j3, str4, dwtmVar2, dwsiVar2, dwssVar, dwtaVar2, i5, list2, eydqVar2);
            }
        }, this.l).d(dxpo.class, new eroh() { // from class: dxpe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dxth.h("%s: Start download called on file that doesn't exist. Key = %s!", "SharedFileManager", dwttVar);
                dxpn.this.b.a();
                dwql a4 = dwqn.a();
                a4.a = dwqm.SHARED_FILE_NOT_FOUND_ERROR;
                a4.c = (dxpo) obj;
                return erqt.h(a4.a());
            }
        }, this.l);
    }

    public final void i(dwtm dwtmVar, Uri uri) {
        if (this.g.g()) {
            try {
                long a = this.e.a(uri);
                if (a > 0) {
                    ((dxxc) this.g.c()).i(dwtmVar.c, a);
                }
            } catch (IOException unused) {
            }
        }
    }

    public final ListenableFuture j(final List list, final int i, final int i2) {
        if (i == list.size()) {
            return erqt.i(null);
        }
        final dwss dwssVar = (dwss) list.get(i);
        int a = dwsr.a(dwssVar.f);
        if (a == 0) {
            a = 1;
        }
        if (a != 2) {
            return j(list, i + 1, i2);
        }
        dwts dwtsVar = (dwts) dwtt.a.createBuilder();
        dwsa dwsaVar = dwssVar.g;
        if (dwsaVar == null) {
            dwsaVar = dwsa.a;
        }
        String str = dwsaVar.c;
        dwtsVar.copyOnWrite();
        dwtt dwttVar = (dwtt) dwtsVar.instance;
        str.getClass();
        dwttVar.b |= 4;
        dwttVar.e = str;
        dwtsVar.copyOnWrite();
        dwtt dwttVar2 = (dwtt) dwtsVar.instance;
        dwttVar2.f = i2 - 1;
        dwttVar2.b |= 8;
        final dwtt dwttVar3 = (dwtt) dwtsVar.build();
        return elfr.k(this.c.e(dwttVar3), new eroh() { // from class: dxpf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dxpn dxpnVar = dxpn.this;
                dwtx dwtxVar = (dwtx) obj;
                if (dwtxVar != null) {
                    dwtk b = dwtk.b(dwtxVar.d);
                    if (b == null) {
                        b = dwtk.NONE;
                    }
                    if (b == dwtk.DOWNLOAD_COMPLETE) {
                        dwtt dwttVar4 = dwttVar3;
                        Context context = dxpnVar.a;
                        int a2 = dwsm.a(dwttVar4.f);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        if (dxvb.e(context, a2, dwtxVar.c, dwttVar4.e, dxpnVar.b, dxpnVar.k, false) != null) {
                            return erqt.i(dwssVar);
                        }
                    }
                }
                return dxpnVar.j(list, i + 1, i2);
            }
        }, this.l);
    }

    public final ListenableFuture k(int i, String str, String str2) {
        Uri e = dxvb.e(this.a, i, str, str2, this.b, this.k, false);
        if (e != null) {
            return erqt.i(e);
        }
        dxth.g("%s: Failed to get file uri!", "SharedFileManager");
        dwql a = dwqn.a();
        a.a = dwqm.UNABLE_TO_CREATE_FILE_URI_ERROR;
        return erqt.h(a.a());
    }
}
