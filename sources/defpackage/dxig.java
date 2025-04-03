package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxig {
    public final Context a;
    public final dxsy b;
    public final dwxf c;
    public final dxih d;
    public final dxpn e;
    public final efbm f;
    public final emxc g;
    public final Executor h;
    public final emxc i;
    public final emxc j;
    public final dwqy k;
    public final dycc l = new dycc();
    public final dxbv m;
    private final Executor n;

    public dxig(Context context, dxsy dxsyVar, dwxf dwxfVar, dxih dxihVar, dxpn dxpnVar, dxbv dxbvVar, emxc emxcVar, Executor executor, emxc emxcVar2, efbm efbmVar, emxc emxcVar3, dwqy dwqyVar, Executor executor2) {
        this.a = context;
        this.b = dxsyVar;
        this.c = dwxfVar;
        this.d = dxihVar;
        this.e = dxpnVar;
        this.m = dxbvVar;
        this.g = emxcVar;
        this.h = executor;
        this.n = executor2;
        this.i = emxcVar2;
        this.f = efbmVar;
        this.j = emxcVar3;
        this.k = dwqyVar;
    }

    public static void C(int i, dxsy dxsyVar, dwso dwsoVar) {
        dxsyVar.m(i, dwsoVar.d, dwsoVar.f, dwsoVar.t, dwsoVar.u);
    }

    public static void D(dxsy dxsyVar, dwso dwsoVar, dwsi dwsiVar, int i) {
        erij erijVar = (erij) erik.a.createBuilder();
        erijVar.copyOnWrite();
        erik erikVar = (erik) erijVar.instance;
        erikVar.c = erjz.a(i);
        erikVar.b |= 1;
        String str = dwsoVar.d;
        erijVar.copyOnWrite();
        erik erikVar2 = (erik) erijVar.instance;
        str.getClass();
        erikVar2.b |= 2;
        erikVar2.d = str;
        int i2 = dwsoVar.f;
        erijVar.copyOnWrite();
        erik erikVar3 = (erik) erijVar.instance;
        erikVar3.b |= 4;
        erikVar3.e = i2;
        long j = dwsoVar.t;
        erijVar.copyOnWrite();
        erik erikVar4 = (erik) erijVar.instance;
        erikVar4.b |= 128;
        erikVar4.i = j;
        String str2 = dwsoVar.u;
        erijVar.copyOnWrite();
        erik erikVar5 = (erik) erijVar.instance;
        str2.getClass();
        erikVar5.b |= 256;
        erikVar5.j = str2;
        String str3 = dwsiVar.c;
        erijVar.copyOnWrite();
        erik erikVar6 = (erik) erijVar.instance;
        str3.getClass();
        erikVar6.b |= 8;
        erikVar6.f = str3;
        dxsyVar.e((erik) erijVar.build());
    }

    public static emxc a(dwso dwsoVar, dwso dwsoVar2) {
        if (dwsoVar2.t != dwsoVar.t) {
            return emxc.j(erkm.NEW_BUILD_ID);
        }
        if (!dwsoVar2.u.equals(dwsoVar.u)) {
            return emxc.j(erkm.NEW_VARIANT_ID);
        }
        if (dwsoVar2.f != dwsoVar.f) {
            return emxc.j(erkm.NEW_VERSION_NUMBER);
        }
        if (!u(dwsoVar, dwsoVar2)) {
            return emxc.j(erkm.DIFFERENT_FILES);
        }
        eydq eydqVar = dwsoVar2.h;
        if (eydqVar == null) {
            eydqVar = eydq.a;
        }
        eydq eydqVar2 = dwsoVar.h;
        if (eydqVar2 == null) {
            eydqVar2 = eydq.a;
        }
        if (!eydqVar.equals(eydqVar2)) {
            return emxc.j(erkm.DIFFERENT_CUSTOM_METADATA);
        }
        if (dwsoVar2.l != dwsoVar.l) {
            return emxc.j(erkm.DIFFERENT_STALE_LIFETIME);
        }
        if (dwsoVar2.m != dwsoVar.m) {
            return emxc.j(erkm.DIFFERENT_EXPIRATION_DATE);
        }
        dwta dwtaVar = dwsoVar2.n;
        if (dwtaVar == null) {
            dwtaVar = dwta.a;
        }
        dwta dwtaVar2 = dwsoVar.n;
        if (dwtaVar2 == null) {
            dwtaVar2 = dwta.a;
        }
        if (!dwtaVar.equals(dwtaVar2)) {
            return emxc.j(erkm.DIFFERENT_DOWNLOAD_CONDITIONS);
        }
        int a = dwsm.a(dwsoVar2.k);
        if (a == 0) {
            a = 1;
        }
        int a2 = dwsm.a(dwsoVar.k);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a != a2) {
            return emxc.j(erkm.DIFFERENT_ALLOWED_READERS);
        }
        int a3 = dycb.a(dwsoVar2.s);
        if (a3 == 0) {
            a3 = 1;
        }
        int a4 = dycb.a(dwsoVar.s);
        if (a3 != (a4 != 0 ? a4 : 1)) {
            return emxc.j(erkm.DIFFERENT_DOWNLOAD_POLICY);
        }
        fgsc fgscVar = dwsoVar2.w;
        if (fgscVar == null) {
            fgscVar = fgsc.a;
        }
        fgsc fgscVar2 = dwsoVar.w;
        if (fgscVar2 == null) {
            fgscVar2 = fgsc.a;
        }
        return !fgscVar.equals(fgscVar2) ? emxc.j(erkm.DIFFERENT_EXPERIMENT_INFO) : emux.a;
    }

    public static boolean u(dwso dwsoVar, dwso dwsoVar2) {
        return dwsoVar.p.equals(dwsoVar2.p);
    }

    public static boolean w(dwtx dwtxVar, long j) {
        return j > dwtxVar.f;
    }

    public static final erie x(dwso dwsoVar) {
        erid eridVar = (erid) erie.a.createBuilder();
        String str = dwsoVar.d;
        eridVar.copyOnWrite();
        erie erieVar = (erie) eridVar.instance;
        str.getClass();
        erieVar.b |= 1;
        erieVar.c = str;
        String str2 = dwsoVar.e;
        eridVar.copyOnWrite();
        erie erieVar2 = (erie) eridVar.instance;
        str2.getClass();
        erieVar2.b |= 4;
        erieVar2.e = str2;
        int i = dwsoVar.f;
        eridVar.copyOnWrite();
        erie erieVar3 = (erie) eridVar.instance;
        erieVar3.b |= 2;
        erieVar3.d = i;
        long j = dwsoVar.t;
        eridVar.copyOnWrite();
        erie erieVar4 = (erie) eridVar.instance;
        erieVar4.b |= 64;
        erieVar4.i = j;
        String str3 = dwsoVar.u;
        eridVar.copyOnWrite();
        erie erieVar5 = (erie) eridVar.instance;
        str3.getClass();
        erieVar5.b |= 128;
        erieVar5.j = str3;
        return (erie) eridVar.build();
    }

    public static final void y(List list, dwtm dwtmVar) {
        dxth.i("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", dwtmVar.c, dwtmVar.d);
        dwoa.d(list, "Failed to download file group %s", dwtmVar.c);
        dxth.g("%s: An unknown error has occurred during download", "FileGroupManager");
        dwql a = dwqn.a();
        a.a = dwqm.UNKNOWN_ERROR;
        throw a.a();
    }

    public final ListenableFuture A(final dwso dwsoVar, final dwsi dwsiVar, final dwtt dwttVar, final dwtx dwtxVar, final int i) {
        final String str = dwsiVar.o;
        final long j = dwsoVar.m;
        int a = dwsm.a(dwttVar.f);
        if (a == 0) {
            a = 1;
        }
        final Uri e = dxvb.e(this.a, a, dwtxVar.c, dwsiVar.g, this.c, this.i, false);
        if (e == null) {
            dxth.g("%s: Failed to get file uri!", "FileGroupManager");
            throw new dxva(28, "Failed to get local file uri");
        }
        final Context context = this.a;
        final efbm efbmVar = this.f;
        return dycd.e(elfr.i(new erog() { // from class: dxuy
            @Override // defpackage.erog
            public final ListenableFuture a() {
                String str2;
                str2 = "";
                Context context2 = context;
                efbm efbmVar2 = efbmVar;
                String str3 = str;
                Uri uri = e;
                dwsi dwsiVar2 = dwsiVar;
                dwso dwsoVar2 = dwsoVar;
                int i2 = 0;
                try {
                    Uri c = dxvb.c(context2, str3);
                    InputStream inputStream = (InputStream) efbmVar2.c(uri, new efdy());
                    try {
                        OutputStream outputStream = (OutputStream) efbmVar2.c(c, new efed());
                        try {
                            eoej.a(inputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (efcp unused) {
                    dxth.i("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", dwsiVar2.c, dwsoVar2.d);
                    str2 = String.format("System limit exceeded for file %s, group %s", dwsiVar2.c, dwsoVar2.d);
                    i2 = 25;
                } catch (efcv unused2) {
                    dxth.i("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", dwsiVar2.c, dwsoVar2.d);
                    str2 = String.format("Malformed blob Uri for file %s, group %s", dwsiVar2.c, dwsoVar2.d);
                    i2 = 17;
                } catch (efcy e2) {
                    str2 = TextUtils.isEmpty(e2.getMessage()) ? "" : e2.getMessage();
                    dxth.m("%s: Failed to share after download for file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\"", "AndroidSharingUtil", dwsiVar2.c, dwsoVar2.d, str2);
                    str2 = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(str2));
                    i2 = 24;
                } catch (IOException unused3) {
                    dxth.i("%s: Failed to copy to the blobstore after download for file %s, file group %s", "AndroidSharingUtil", dwsiVar2.c, dwsoVar2.d);
                    str2 = String.format("Error while copying file %s, group %s, to the shared blob storage", dwsiVar2.c, dwsoVar2.d);
                    i2 = 22;
                }
                if (i2 == 0) {
                    return erre.a;
                }
                throw new dxva(i2, str2);
            }
        }, this.n)).g(new eroh() { // from class: dxfm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxig dxigVar = dxig.this;
                final int i2 = i;
                final dwso dwsoVar2 = dwsoVar;
                final dwsi dwsiVar2 = dwsiVar;
                dwtx dwtxVar2 = dwtxVar;
                final dwtt dwttVar2 = dwttVar;
                String str2 = str;
                final long j2 = j;
                return dxigVar.r(dxigVar.B(dwsoVar2, dwsiVar2, dwtxVar2, dwttVar2, str2, j2, i2), new eroh() { // from class: dxes
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        if (((Boolean) obj2).booleanValue() || i2 == 6) {
                            return erre.a;
                        }
                        long j3 = j2;
                        dwtt dwttVar3 = dwttVar2;
                        dwsi dwsiVar3 = dwsiVar2;
                        return dxig.this.s(dwsoVar2, dwsiVar3, dwttVar3, j3);
                    }
                });
            }
        }, this.h);
    }

    final ListenableFuture B(final dwso dwsoVar, final dwsi dwsiVar, dwtx dwtxVar, final dwtt dwttVar, final String str, long j, final int i) {
        if (dwtxVar.e && !w(dwtxVar, j)) {
            D(this.b, dwsoVar, dwsiVar, i);
            return erqt.i(true);
        }
        final long max = Math.max(j, dwtxVar.f);
        final Context context = this.a;
        final efbm efbmVar = this.f;
        return r(elfr.i(new erog() { // from class: dxux
            @Override // defpackage.erog
            public final ListenableFuture a() {
                String str2;
                str2 = "";
                Context context2 = context;
                String str3 = str;
                long j2 = max;
                efbm efbmVar2 = efbmVar;
                dwsi dwsiVar2 = dwsiVar;
                dwso dwsoVar2 = dwsoVar;
                int i2 = 0;
                try {
                    int i3 = efby.a;
                    OutputStream outputStream = (OutputStream) efbmVar2.c(efbx.a(String.valueOf(str3).concat(".lease"), context2.getPackageName(), j2), new efed());
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (efcp unused) {
                    dxth.i("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", dwsiVar2.c, dwsoVar2.d);
                    str2 = String.format("System limit exceeded for file %s, group %s", dwsiVar2.c, dwsoVar2.d);
                    i2 = 25;
                } catch (efcv unused2) {
                    dxth.i("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", dwsiVar2.c, dwsoVar2.d);
                    str2 = String.format("Malformed lease Uri for file %s, group %s", dwsiVar2.c, dwsoVar2.d);
                    i2 = 18;
                } catch (efcy e) {
                    str2 = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
                    dxth.m("%s: Failed to share file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\"", "AndroidSharingUtil", dwsiVar2.c, dwsoVar2.d, str2);
                    str2 = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(str2));
                    i2 = 24;
                } catch (IOException unused3) {
                    dxth.i("%s: Failed to acquire lease for file %s, file group %s", "AndroidSharingUtil", dwsiVar2.c, dwsoVar2.d);
                    str2 = String.format("Error while acquiring lease for file %s, group %s", dwsiVar2.c, dwsoVar2.d);
                    i2 = 20;
                }
                if (i2 == 0) {
                    return erre.a;
                }
                throw new dxva(i2, str2);
            }
        }, this.n), new eroh() { // from class: dxdm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwtw dwtwVar = (dwtw) dwtx.a.createBuilder();
                dwtk dwtkVar = dwtk.DOWNLOAD_COMPLETE;
                dwtwVar.copyOnWrite();
                dwtx dwtxVar2 = (dwtx) dwtwVar.instance;
                dwtxVar2.d = dwtkVar.h;
                dwtxVar2.b |= 2;
                dwtwVar.copyOnWrite();
                dwtx dwtxVar3 = (dwtx) dwtwVar.instance;
                dwtxVar3.b |= 1;
                String str2 = str;
                dwtxVar3.c = "android_shared_".concat(String.valueOf(str2));
                dwtwVar.copyOnWrite();
                dwtx dwtxVar4 = (dwtx) dwtwVar.instance;
                dwtxVar4.b |= 4;
                dwtxVar4.e = true;
                dwtwVar.copyOnWrite();
                dwtx dwtxVar5 = (dwtx) dwtwVar.instance;
                dwtxVar5.b |= 8;
                final long j2 = max;
                dwtxVar5.f = j2;
                dwtwVar.copyOnWrite();
                dwtx dwtxVar6 = (dwtx) dwtwVar.instance;
                str2.getClass();
                dwtxVar6.b |= 16;
                dwtxVar6.g = str2;
                dwtx dwtxVar7 = (dwtx) dwtwVar.build();
                final dxig dxigVar = dxig.this;
                ListenableFuture h = dxigVar.e.c.h(dwttVar, dwtxVar7);
                final dwsi dwsiVar2 = dwsiVar;
                final dwso dwsoVar2 = dwsoVar;
                final int i2 = i;
                return dxigVar.r(h, new eroh() { // from class: dxgb
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        dxig dxigVar2 = dxig.this;
                        dwso dwsoVar3 = dwsoVar2;
                        dwsi dwsiVar3 = dwsiVar2;
                        if (!booleanValue) {
                            dxth.i("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", dwsiVar3.c, dwsoVar3.d);
                            dxig.D(dxigVar2.b, dwsoVar3, dwsiVar3, 15);
                            return erqt.i(false);
                        }
                        long j3 = j2;
                        int i3 = i2;
                        dxsy dxsyVar = dxigVar2.b;
                        erij erijVar = (erij) erik.a.createBuilder();
                        erijVar.copyOnWrite();
                        erik erikVar = (erik) erijVar.instance;
                        erikVar.c = erjz.a(i3);
                        erikVar.b |= 1;
                        String str3 = dwsoVar3.d;
                        erijVar.copyOnWrite();
                        erik erikVar2 = (erik) erijVar.instance;
                        str3.getClass();
                        erikVar2.b = 2 | erikVar2.b;
                        erikVar2.d = str3;
                        int i4 = dwsoVar3.f;
                        erijVar.copyOnWrite();
                        erik erikVar3 = (erik) erijVar.instance;
                        erikVar3.b |= 4;
                        erikVar3.e = i4;
                        long j4 = dwsoVar3.t;
                        erijVar.copyOnWrite();
                        erik erikVar4 = (erik) erijVar.instance;
                        erikVar4.b |= 128;
                        erikVar4.i = j4;
                        String str4 = dwsoVar3.u;
                        erijVar.copyOnWrite();
                        erik erikVar5 = (erik) erijVar.instance;
                        str4.getClass();
                        erikVar5.b |= 256;
                        erikVar5.j = str4;
                        String str5 = dwsiVar3.c;
                        erijVar.copyOnWrite();
                        erik erikVar6 = (erik) erijVar.instance;
                        str5.getClass();
                        erikVar6.b |= 8;
                        erikVar6.f = str5;
                        erijVar.copyOnWrite();
                        erik erikVar7 = (erik) erijVar.instance;
                        erikVar7.b |= 16;
                        erikVar7.g = true;
                        erijVar.copyOnWrite();
                        erik erikVar8 = (erik) erijVar.instance;
                        erikVar8.b |= 32;
                        erikVar8.h = j3;
                        dxsyVar.e((erik) erijVar.build());
                        return erqt.i(true);
                    }
                });
            }
        });
    }

    public final enhk b(dwso dwsoVar) {
        enhd enhdVar = new enhd();
        Uri c = dxvk.c(this.a, this.i, dwsoVar);
        for (dwsi dwsiVar : dwsoVar.p) {
            enhdVar.k(dwsiVar, dxvk.b(c, dwsiVar));
        }
        return enhdVar.b();
    }

    final enhk c(enhk enhkVar, enhk enhkVar2) {
        enhd enhdVar = new enhd();
        enqu listIterator = enhkVar2.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            if (entry.getValue() != null && enhkVar.containsKey(entry.getKey())) {
                Uri uri = (Uri) enhkVar.get(entry.getKey());
                Uri uri2 = (Uri) entry.getValue();
                try {
                    if (this.f.h(uri)) {
                        try {
                            if (dxvx.a(this.a, uri).toString().equals(uri2.toString())) {
                                enhdVar.k((dwsi) entry.getKey(), uri);
                            } else {
                                dxth.i("%s verifyIsolatedFileUris isolated file uri does match expected on-device uri! %s %s", "FileGroupManager", uri, uri2);
                            }
                        } catch (IOException unused) {
                            dxth.i("%s verifyIsolatedFileUris unable to read symlink using isolated file uri! %s %s", "FileGroupManager", uri, uri2);
                        }
                    } else {
                        dxth.i("%s verifyIsolatedFileUris isolated uri does not exist -- unable to verify it matches the expected target! %s %s", "FileGroupManager", uri, uri2);
                    }
                } catch (IOException unused2) {
                    dxth.i("%s verifyIsolatedFileUris unable to check if isolated uri exists! %s %s", "FileGroupManager", uri, uri2);
                }
            }
        }
        return enhdVar.b();
    }

    public final ListenableFuture d(dwso dwsoVar) {
        if (!dwsoVar.o) {
            return erre.a;
        }
        try {
            dxvk.f(this.a, this.i, dwsoVar, this.f);
            final eygr eygrVar = dwsoVar.p;
            if (enjk.c(eygrVar, new emxg() { // from class: dxdy
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    int a = dwse.a(((dwsi) obj).m);
                    return a != 0 && a == 2;
                }
            }).g()) {
                return erqt.h(new UnsupportedOperationException("Preserve File Paths is invalid with Android Blob Sharing"));
            }
            final enhk b = b(dwsoVar);
            ListenableFuture k = elfr.k(k(dwsoVar), new eroh() { // from class: dxea
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    dxig dxigVar = dxig.this;
                    enhk enhkVar = b;
                    enhk enhkVar2 = (enhk) obj;
                    for (dwsi dwsiVar : eygrVar) {
                        try {
                            Uri uri = (Uri) enhkVar.get(dwsiVar);
                            uri.getClass();
                            Uri uri2 = (Uri) enhkVar2.get(dwsiVar);
                            uri2.getClass();
                            Uri parse = Uri.parse(uri.toString().substring(0, uri.toString().lastIndexOf("/")));
                            if (!dxigVar.f.h(parse)) {
                                dxigVar.f.d(parse);
                            }
                            dxvx.b(dxigVar.a, uri, uri2);
                        } catch (IOException | NullPointerException e) {
                            dwql a = dwqn.a();
                            a.a = dwqm.UNABLE_TO_CREATE_SYMLINK_STRUCTURE;
                            a.b = "Unable to create symlink";
                            a.c = e;
                            return erqt.h(a.a());
                        }
                    }
                    return erre.a;
                }
            }, this.h);
            elfr.l(k, new dxid(this, dwsoVar), this.h);
            return k;
        } catch (IOException e) {
            dwql a = dwqn.a();
            a.a = dwqm.UNABLE_TO_REMOVE_SYMLINK_STRUCTURE;
            a.b = "Unable to cleanup symlink structure";
            a.c = e;
            return erqt.h(a.a());
        }
    }

    public final ListenableFuture e(final dwtm dwtmVar, final dwta dwtaVar, final eroh erohVar) {
        final AtomicReference atomicReference = new AtomicReference();
        return elfr.f(r(g(dwtmVar, false), new eroh() { // from class: dxdu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxig dxigVar = dxig.this;
                final dwtm dwtmVar2 = dwtmVar;
                final AtomicReference atomicReference2 = atomicReference;
                dwso dwsoVar = (dwso) obj;
                if (dwsoVar == null) {
                    return dxigVar.r(dxigVar.g(dwtmVar2, true), new eroh() { // from class: dxfi
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            dwso dwsoVar2 = (dwso) obj2;
                            if (dwsoVar2 != null) {
                                atomicReference2.set(dwsoVar2);
                                return erqt.i(dwsoVar2);
                            }
                            dwtm dwtmVar3 = dwtm.this;
                            dwql a = dwqn.a();
                            a.a = dwqm.GROUP_NOT_FOUND_ERROR;
                            a.b = "Nothing to download for file group: ".concat(String.valueOf(dwtmVar3.c));
                            return erqt.h(a.a());
                        }
                    });
                }
                atomicReference2.set(dwsoVar);
                dwsk dwskVar = dwsoVar.c;
                if (dwskVar == null) {
                    dwskVar = dwsk.a;
                }
                int i = dwskVar.g + 1;
                dwsn dwsnVar = (dwsn) dwsoVar.toBuilder();
                dwsj dwsjVar = (dwsj) dwskVar.toBuilder();
                dwsjVar.copyOnWrite();
                dwsk dwskVar2 = (dwsk) dwsjVar.instance;
                dwskVar2.b |= 16;
                dwskVar2.g = i;
                dwsnVar.copyOnWrite();
                dwso dwsoVar2 = (dwso) dwsnVar.instance;
                dwsk dwskVar3 = (dwsk) dwsjVar.build();
                dwskVar3.getClass();
                dwsoVar2.c = dwskVar3;
                dwsoVar2.b |= 1;
                final dwso dwsoVar3 = (dwso) dwsnVar.build();
                boolean z = (dwskVar.b & 8) != 0;
                final boolean z2 = !z;
                if (!z) {
                    long a = dxigVar.m.a();
                    dwsk dwskVar4 = dwsoVar3.c;
                    if (dwskVar4 == null) {
                        dwskVar4 = dwsk.a;
                    }
                    dwsj dwsjVar2 = (dwsj) dwskVar4.toBuilder();
                    dwsjVar2.copyOnWrite();
                    dwsk dwskVar5 = (dwsk) dwsjVar2.instance;
                    dwskVar5.b |= 8;
                    dwskVar5.f = a;
                    dwsk dwskVar6 = (dwsk) dwsjVar2.build();
                    dwsn dwsnVar2 = (dwsn) dwsoVar3.toBuilder();
                    dwsnVar2.copyOnWrite();
                    dwso dwsoVar4 = (dwso) dwsnVar2.instance;
                    dwskVar6.getClass();
                    dwsoVar4.c = dwskVar6;
                    dwsoVar4.b = 1 | dwsoVar4.b;
                    dwsoVar3 = (dwso) dwsnVar2.build();
                }
                final ListenableFuture i2 = erqt.i(dwsoVar3);
                if (!z) {
                    final ArrayList arrayList = new ArrayList();
                    Iterator<E> it = dwsoVar3.p.iterator();
                    while (it.hasNext()) {
                        arrayList.add(dxigVar.j((dwsi) it.next(), dwsoVar3));
                    }
                    i2 = dycd.e(dycg.c(arrayList).a(new Callable() { // from class: dxex
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                dwtk dwtkVar = (dwtk) erqt.q((ListenableFuture) it2.next());
                                if (dwtkVar != dwtk.NONE && dwtkVar != dwtk.SUBSCRIBED) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }, dxigVar.h)).f(new emwl() { // from class: dxfu
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            boolean booleanValue = ((Boolean) obj2).booleanValue();
                            dwso dwsoVar5 = dwso.this;
                            dwsk dwskVar7 = dwsoVar5.c;
                            if (dwskVar7 == null) {
                                dwskVar7 = dwsk.a;
                            }
                            dwsj dwsjVar3 = (dwsj) dwskVar7.toBuilder();
                            dwsjVar3.copyOnWrite();
                            dwsk dwskVar8 = (dwsk) dwsjVar3.instance;
                            dwskVar8.b |= 64;
                            dwskVar8.i = booleanValue;
                            dwsk dwskVar9 = (dwsk) dwsjVar3.build();
                            dwsn dwsnVar3 = (dwsn) dwsoVar5.toBuilder();
                            dwsnVar3.copyOnWrite();
                            dwso dwsoVar6 = (dwso) dwsnVar3.instance;
                            dwskVar9.getClass();
                            dwsoVar6.c = dwskVar9;
                            dwsoVar6.b |= 1;
                            return (dwso) dwsnVar3.build();
                        }
                    }, dxigVar.h);
                }
                final eroh erohVar2 = erohVar;
                final dwta dwtaVar2 = dwtaVar;
                return dycd.e(dycd.e(i2).g(new eroh() { // from class: dxeb
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        dwtl dwtlVar = (dwtl) dwtmVar2.toBuilder();
                        dwtlVar.copyOnWrite();
                        dwtm dwtmVar3 = (dwtm) dwtlVar.instance;
                        dwtmVar3.b |= 8;
                        dwtmVar3.f = false;
                        return dxig.this.d.l((dwtm) dwtlVar.build(), (dwso) obj2);
                    }
                }, dxigVar.h).g(new eroh() { // from class: dxec
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        dxig dxigVar2 = dxig.this;
                        if (!booleanValue) {
                            dxigVar2.b.l(1036);
                            return erqt.h(new IOException("Unable to update file group metadata"));
                        }
                        ListenableFuture listenableFuture = i2;
                        if (z2) {
                            new dxsw(dxigVar2.b, 1).b((dwso) erqt.q(listenableFuture));
                        }
                        return erqt.i((dwso) erqt.q(listenableFuture));
                    }
                }, dxigVar.h)).d(IOException.class, new eroh() { // from class: dxfk
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        dwql a2 = dwqn.a();
                        a2.a = dwqm.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
                        a2.c = (IOException) obj2;
                        return erqt.h(a2.a());
                    }
                }, dxigVar.h).g(new eroh() { // from class: dxfl
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        ArrayList arrayList2;
                        ListenableFuture h;
                        dwta dwtaVar3 = dwtaVar2;
                        final dwso dwsoVar5 = (dwso) obj2;
                        if (dwtaVar3 == null && (dwtaVar3 = dwsoVar5.n) == null) {
                            dwtaVar3 = dwta.a;
                        }
                        final dwta dwtaVar4 = dwtaVar3;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<E> it2 = dwsoVar5.p.iterator();
                        while (true) {
                            final dwtm dwtmVar3 = dwtmVar2;
                            final dxig dxigVar2 = dxig.this;
                            if (!it2.hasNext()) {
                                final ArrayList arrayList4 = arrayList3;
                                final eroh erohVar3 = erohVar2;
                                return dycg.a(arrayList4).b(new erog() { // from class: dxdx
                                    @Override // defpackage.erog
                                    public final ListenableFuture a() {
                                        final dxig dxigVar3 = dxig.this;
                                        final dwtm dwtmVar4 = dwtmVar3;
                                        final eroh erohVar4 = erohVar3;
                                        final List list = arrayList4;
                                        return dxigVar3.l.b(new erog() { // from class: dxek
                                            @Override // defpackage.erog
                                            public final ListenableFuture a() {
                                                final dxig dxigVar4 = dxig.this;
                                                final dwtm dwtmVar5 = dwtmVar4;
                                                ListenableFuture i3 = elfr.i(new erog() { // from class: dxde
                                                    @Override // defpackage.erog
                                                    public final ListenableFuture a() {
                                                        dxig dxigVar5 = dxig.this;
                                                        dwtm dwtmVar6 = dwtmVar5;
                                                        final ListenableFuture g = dxigVar5.g(dwtmVar6, false);
                                                        final ListenableFuture g2 = dxigVar5.g(dwtmVar6, true);
                                                        return dycg.d(g, g2).b(new erog() { // from class: dxfx
                                                            @Override // defpackage.erog
                                                            public final ListenableFuture a() {
                                                                return erqt.i(new dxqa((dwso) erqt.q(ListenableFuture.this), (dwso) erqt.q(g2)));
                                                            }
                                                        }, dxigVar5.h);
                                                    }
                                                }, dxigVar4.h);
                                                final eroh erohVar5 = erohVar4;
                                                final List list2 = list;
                                                return dxigVar4.r(i3, new eroh() { // from class: dxhq
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj3) {
                                                        dxqc dxqcVar = (dxqc) obj3;
                                                        final dwso b = dxqcVar.b() != null ? dxqcVar.b() : dxqcVar.a();
                                                        final List list3 = list2;
                                                        final dwtm dwtmVar6 = dwtmVar5;
                                                        if (b == null) {
                                                            dxig.y(list3, dwtmVar6);
                                                            return erqt.h(new AssertionError("impossible error"));
                                                        }
                                                        eroh erohVar6 = erohVar5;
                                                        final dxig dxigVar5 = dxig.this;
                                                        return dxigVar5.r(dxigVar5.t(dwtmVar6, b, true, erohVar6, new dxsw(dxigVar5.b, 1)), new eroh() { // from class: dxhe
                                                            @Override // defpackage.eroh
                                                            public final ListenableFuture a(Object obj4) {
                                                                dwtm dwtmVar7 = dwtmVar6;
                                                                if (((dxif) obj4) != dxif.DOWNLOADED) {
                                                                    dxig.y(list3, dwtmVar7);
                                                                }
                                                                dwso dwsoVar6 = b;
                                                                dxig dxigVar6 = dxig.this;
                                                                erid eridVar = (erid) erie.a.createBuilder();
                                                                String str = dwtmVar7.c;
                                                                eridVar.copyOnWrite();
                                                                erie erieVar = (erie) eridVar.instance;
                                                                str.getClass();
                                                                erieVar.b |= 1;
                                                                erieVar.c = str;
                                                                String str2 = dwtmVar7.d;
                                                                eridVar.copyOnWrite();
                                                                erie erieVar2 = (erie) eridVar.instance;
                                                                str2.getClass();
                                                                erieVar2.b |= 4;
                                                                erieVar2.e = str2;
                                                                int i4 = dwsoVar6.f;
                                                                eridVar.copyOnWrite();
                                                                erie erieVar3 = (erie) eridVar.instance;
                                                                erieVar3.b |= 2;
                                                                erieVar3.d = i4;
                                                                long j = dwsoVar6.t;
                                                                eridVar.copyOnWrite();
                                                                erie erieVar4 = (erie) eridVar.instance;
                                                                erieVar4.b |= 64;
                                                                erieVar4.i = j;
                                                                String str3 = dwsoVar6.u;
                                                                eridVar.copyOnWrite();
                                                                erie erieVar5 = (erie) eridVar.instance;
                                                                str3.getClass();
                                                                erieVar5.b |= 128;
                                                                erieVar5.j = str3;
                                                                dxigVar6.b.q(3, (erie) eridVar.build(), 2);
                                                                return erqt.i(dwsoVar6);
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        }, dxigVar3.h);
                                    }
                                }, dxigVar2.h);
                            }
                            final dwsi dwsiVar = (dwsi) it2.next();
                            if (!dxvk.k(dwsiVar)) {
                                int a2 = dwsm.a(dwsoVar5.k);
                                if (a2 == 0) {
                                    a2 = 1;
                                }
                                final dwtt a3 = dxpp.a(dwsiVar, a2);
                                if (Build.VERSION.SDK_INT >= 30) {
                                    final ListenableFuture l = dxigVar2.l(dwsoVar5, dwsiVar, a3);
                                    h = dxigVar2.r(dycd.e(l).g(new eroh() { // from class: dxem
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj3) {
                                            return dxig.this.f((dwtx) obj3, dwsiVar, dwsoVar5);
                                        }
                                    }, dxigVar2.h).g(new eroh() { // from class: dxen
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj3) {
                                            int a4;
                                            dxie dxieVar = (dxie) obj3;
                                            String name = dxieVar.name();
                                            dwsi dwsiVar2 = dwsiVar;
                                            String str = dwsiVar2.c;
                                            dwso dwsoVar6 = dwsoVar5;
                                            dxth.d("%s: Android sharing CASE: %s for file %s, filegroup %s", "FileGroupManager", name, str, dwsoVar6.d);
                                            dwtx dwtxVar = (dwtx) erqt.q(l);
                                            int ordinal = dxieVar.ordinal();
                                            dxig dxigVar3 = dxig.this;
                                            dwtt dwttVar = a3;
                                            if (ordinal == 1) {
                                                return dxigVar3.r(dxigVar3.B(dwsoVar6, dwsiVar2, dwtxVar, dwttVar, dwtxVar.g, dwsoVar6.m, 3), new eroh() { // from class: dxfo
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj4) {
                                                        return erre.a;
                                                    }
                                                });
                                            }
                                            if (ordinal == 3) {
                                                return dxigVar3.z(dwsoVar6, dwsiVar2, dwttVar, dwtxVar, 4);
                                            }
                                            if (ordinal == 4) {
                                                dwtk b = dwtk.b(dwtxVar.d);
                                                if (b == null) {
                                                    b = dwtk.NONE;
                                                }
                                                if (b == dwtk.DOWNLOAD_COMPLETE && (a4 = dwse.a(dwsiVar2.m)) != 0 && a4 == 2) {
                                                    return dxigVar3.A(dwsoVar6, dwsiVar2, dwttVar, dwtxVar, 6);
                                                }
                                            }
                                            dxth.d("%s: File couldn't be shared before download %s, filegroup %s", "FileGroupManager", dwsiVar2.c, dwsoVar6.d);
                                            return erre.a;
                                        }
                                    }, dxigVar2.h).d(dxva.class, new eroh() { // from class: dxeo
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj3) {
                                            dwsi dwsiVar2 = dwsiVar;
                                            String str = dwsiVar2.c;
                                            dwso dwsoVar6 = dwsoVar5;
                                            dxth.d("%s: File couldn't be shared before download %s, filegroup %s", "FileGroupManager", str, dwsoVar6.d);
                                            dxig.D(dxig.this.b, dwsoVar6, dwsiVar2, ((dxva) obj3).a);
                                            return erre.a;
                                        }
                                    }, dxigVar2.h), new eroh() { // from class: dxdn
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj3) {
                                            final dxig dxigVar3 = dxig.this;
                                            final dwso dwsoVar6 = dwsoVar5;
                                            final dwsi dwsiVar2 = dwsiVar;
                                            final dwtt dwttVar = a3;
                                            dwtm dwtmVar4 = dwtmVar3;
                                            dwta dwtaVar5 = dwtaVar4;
                                            try {
                                                dxpn dxpnVar = dxigVar3.e;
                                                int i3 = dwsoVar6.f;
                                                long j = dwsoVar6.t;
                                                String str = dwsoVar6.u;
                                                int i4 = dwsoVar6.q;
                                                eygr eygrVar = dwsoVar6.r;
                                                eydq eydqVar = dwsoVar6.i;
                                                if (eydqVar == null) {
                                                    eydqVar = eydq.a;
                                                }
                                                return dxigVar3.r(dxpnVar.h(dwtmVar4, i3, j, str, dwsiVar2, dwttVar, dwtaVar5, i4, eygrVar, eydqVar), new eroh() { // from class: dxdo
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj4) {
                                                        final dxig dxigVar4 = dxig.this;
                                                        final dwso dwsoVar7 = dwsoVar6;
                                                        final dwsi dwsiVar3 = dwsiVar2;
                                                        final dwtt dwttVar2 = dwttVar;
                                                        return dycd.e(dxigVar4.l(dwsoVar7, dwsiVar3, dwttVar2)).g(new eroh() { // from class: dxhg
                                                            @Override // defpackage.eroh
                                                            public final ListenableFuture a(Object obj5) {
                                                                final dwtx dwtxVar = (dwtx) obj5;
                                                                dwtk b = dwtk.b(dwtxVar.d);
                                                                if (b == null) {
                                                                    b = dwtk.NONE;
                                                                }
                                                                if (b != dwtk.DOWNLOAD_COMPLETE) {
                                                                    return erre.a;
                                                                }
                                                                final dwtt dwttVar3 = dwttVar2;
                                                                final dwsi dwsiVar4 = dwsiVar3;
                                                                final dwso dwsoVar8 = dwsoVar7;
                                                                final dxig dxigVar5 = dxig.this;
                                                                return dycd.e(dxigVar5.f(dwtxVar, dwsiVar4, dwsoVar8)).g(new eroh() { // from class: dxej
                                                                    @Override // defpackage.eroh
                                                                    public final ListenableFuture a(Object obj6) {
                                                                        int a4;
                                                                        dxie dxieVar = (dxie) obj6;
                                                                        String name = dxieVar.name();
                                                                        final dwsi dwsiVar5 = dwsiVar4;
                                                                        String str2 = dwsiVar5.c;
                                                                        final dwso dwsoVar9 = dwsoVar8;
                                                                        dxth.d("%s: Android sharing CASE: %s for file %s, filegroup %s", "FileGroupManager", name, str2, dwsoVar9.d);
                                                                        int ordinal = dxieVar.ordinal();
                                                                        final dxig dxigVar6 = dxig.this;
                                                                        final dwtt dwttVar4 = dwttVar3;
                                                                        dwtx dwtxVar2 = dwtxVar;
                                                                        if (ordinal == 1) {
                                                                            final long j2 = dwsoVar9.m;
                                                                            if (!dxig.w(dwtxVar2, j2)) {
                                                                                return erre.a;
                                                                            }
                                                                            dxth.d("%s: File already shared after downloaded but lease has to be updated for file %s, filegroup %s", "FileGroupManager", dwsiVar5.c, dwsoVar9.d);
                                                                            return dxigVar6.r(dxigVar6.B(dwsoVar9, dwsiVar5, dwtxVar2, dwttVar4, dwtxVar2.g, j2, 27), new eroh() { // from class: dxfp
                                                                                @Override // defpackage.eroh
                                                                                public final ListenableFuture a(Object obj7) {
                                                                                    if (((Boolean) obj7).booleanValue()) {
                                                                                        return erre.a;
                                                                                    }
                                                                                    long j3 = j2;
                                                                                    dwtt dwttVar5 = dwttVar4;
                                                                                    dwsi dwsiVar6 = dwsiVar5;
                                                                                    return dxig.this.s(dwsoVar9, dwsiVar6, dwttVar5, j3);
                                                                                }
                                                                            });
                                                                        }
                                                                        if (ordinal == 3) {
                                                                            return dxigVar6.z(dwsoVar9, dwsiVar5, dwttVar4, dwtxVar2, 5);
                                                                        }
                                                                        if (ordinal == 4 && (a4 = dwse.a(dwsiVar5.m)) != 0 && a4 == 2) {
                                                                            return dxigVar6.A(dwsoVar9, dwsiVar5, dwttVar4, dwtxVar2, 7);
                                                                        }
                                                                        int a5 = dwse.a(dwsiVar5.m);
                                                                        if (a5 != 0 && a5 == 2) {
                                                                            dxig.D(dxigVar6.b, dwsoVar9, dwsiVar5, 16);
                                                                        }
                                                                        dxth.d("%s: File couldn't be shared after download %s, filegroup %s", "FileGroupManager", dwsiVar5.c, dwsoVar9.d);
                                                                        return dxigVar6.s(dwsoVar9, dwsiVar5, dwttVar4, dwsoVar9.m);
                                                                    }
                                                                }, dxigVar5.h).d(dxva.class, new eroh() { // from class: dxer
                                                                    @Override // defpackage.eroh
                                                                    public final ListenableFuture a(Object obj6) {
                                                                        int i5 = ((dxva) obj6).a;
                                                                        dxig dxigVar6 = dxig.this;
                                                                        dxsy dxsyVar = dxigVar6.b;
                                                                        dwso dwsoVar9 = dwsoVar8;
                                                                        dwsi dwsiVar5 = dwsiVar4;
                                                                        dxig.D(dxsyVar, dwsoVar9, dwsiVar5, i5);
                                                                        dxth.d("%s: File couldn't be shared after download %s, filegroup %s", "FileGroupManager", dwsiVar5.c, dwsoVar9.d);
                                                                        return dxigVar6.s(dwsoVar9, dwsiVar5, dwttVar3, dwsoVar9.m);
                                                                    }
                                                                }, dxigVar5.h);
                                                            }
                                                        }, erpp.a);
                                                    }
                                                });
                                            } catch (RuntimeException e) {
                                                dwql a4 = dwqn.a();
                                                a4.a = dwqm.UNKNOWN_ERROR;
                                                a4.c = e;
                                                return erqt.h(a4.a());
                                            }
                                        }
                                    });
                                    arrayList2 = arrayList3;
                                } else {
                                    try {
                                        dxpn dxpnVar = dxigVar2.e;
                                        int i3 = dwsoVar5.f;
                                        arrayList2 = arrayList3;
                                        try {
                                            long j = dwsoVar5.t;
                                            String str = dwsoVar5.u;
                                            int i4 = dwsoVar5.q;
                                            eygr eygrVar = dwsoVar5.r;
                                            eydq eydqVar = dwsoVar5.i;
                                            if (eydqVar == null) {
                                                eydqVar = eydq.a;
                                            }
                                            h = dxpnVar.h(dwtmVar3, i3, j, str, dwsiVar, a3, dwtaVar4, i4, eygrVar, eydqVar);
                                        } catch (RuntimeException e) {
                                            e = e;
                                            dwql a4 = dwqn.a();
                                            a4.a = dwqm.UNKNOWN_ERROR;
                                            a4.c = e;
                                            h = erqt.h(a4.a());
                                            arrayList2.add(h);
                                            arrayList3 = arrayList2;
                                        }
                                    } catch (RuntimeException e2) {
                                        e = e2;
                                        arrayList2 = arrayList3;
                                    }
                                }
                                arrayList2.add(h);
                                arrayList3 = arrayList2;
                            }
                        }
                    }
                }, dxigVar.h);
            }
        }), Exception.class, new eroh() { // from class: dxdv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                final dwso dwsoVar = (dwso) atomicReference.get();
                if (dwsoVar == null) {
                    dwsoVar = dwso.a;
                }
                final dwtm dwtmVar2 = dwtmVar;
                final dxig dxigVar = dxig.this;
                boolean z = exc instanceof dwqn;
                ListenableFuture listenableFuture = erre.a;
                if (z) {
                    final dwqn dwqnVar = (dwqn) exc;
                    dxth.c("%s: Logging DownloadException, resultCode = %s", "FileGroupManager", dwqnVar.a);
                    listenableFuture = dxigVar.r(listenableFuture, new eroh() { // from class: dxff
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            dxig dxigVar2 = dxig.this;
                            dwtm dwtmVar3 = dwtmVar2;
                            dwqn dwqnVar2 = dwqnVar;
                            dwso dwsoVar2 = dwsoVar;
                            return dxigVar2.n(dwtmVar3, dwqnVar2, dwsoVar2.t, dwsoVar2.u);
                        }
                    });
                } else if (exc instanceof dwoa) {
                    dxth.b("%s: Logging AggregateException", "FileGroupManager");
                    engw engwVar = ((dwoa) exc).a;
                    int i = ((enou) engwVar).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        Throwable th = (Throwable) engwVar.get(i2);
                        if (th instanceof dwqn) {
                            final dwqn dwqnVar2 = (dwqn) th;
                            listenableFuture = dxigVar.r(listenableFuture, new eroh() { // from class: dxfg
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    dxig dxigVar2 = dxig.this;
                                    dwtm dwtmVar3 = dwtmVar2;
                                    dwqn dwqnVar3 = dwqnVar2;
                                    dwso dwsoVar2 = dwsoVar;
                                    return dxigVar2.n(dwtmVar3, dwqnVar3, dwsoVar2.t, dwsoVar2.u);
                                }
                            });
                        } else {
                            dxth.g("%s: Expecting DownloadException's in AggregateException", "FileGroupManager");
                        }
                    }
                }
                return dxigVar.r(listenableFuture, new eroh() { // from class: dxfh
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        throw exc;
                    }
                });
            }
        }, this.h);
    }

    public final ListenableFuture f(dwtx dwtxVar, final dwsi dwsiVar, final dwso dwsoVar) {
        if (dwtxVar.e) {
            return erqt.i(dxie.FILE_ALREADY_SHARED);
        }
        if (dwsiVar.o.isEmpty()) {
            return erqt.i(dxie.FILE_SHARING_CHECKSUM_NOT_PROVIDED);
        }
        final Context context = this.a;
        final String str = dwsiVar.o;
        final efbm efbmVar = this.f;
        return q(elfr.i(new erog() { // from class: dxuz
            /* JADX WARN: Removed duplicated region for block: B:5:0x009a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x00a3  */
            @Override // defpackage.erog
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a() {
                /*
                    r12 = this;
                    java.lang.String r0 = ""
                    java.lang.String r1 = "AndroidSharingUtil"
                    android.content.Context r2 = r1
                    java.lang.String r3 = r2
                    efbm r4 = r3
                    dwsi r5 = r4
                    dwso r6 = r5
                    r7 = 3
                    r8 = 2
                    r9 = 1
                    r10 = 0
                    android.net.Uri r2 = defpackage.dxvb.c(r2, r3)     // Catch: java.io.IOException -> L1c defpackage.efcv -> L40 defpackage.efcy -> L67
                    boolean r1 = r4.h(r2)     // Catch: java.io.IOException -> L1c defpackage.efcv -> L40 defpackage.efcy -> L67
                    goto L98
                L1c:
                    java.lang.String r0 = r5.c
                    java.lang.String r2 = r6.d
                    java.lang.Object[] r3 = new java.lang.Object[r7]
                    r3[r10] = r1
                    r3[r9] = r0
                    r3[r8] = r2
                    java.lang.String r0 = "%s: Failed to check existence in the shared storage for file %s, file group %s"
                    defpackage.dxth.i(r0, r3)
                    java.lang.String r0 = r5.c
                    java.lang.String r1 = r6.d
                    java.lang.Object[] r2 = new java.lang.Object[r8]
                    r2[r10] = r0
                    r2[r9] = r1
                    java.lang.String r0 = "Error while checking if file %s, group %s, exists in the shared blob storage."
                    java.lang.String r0 = java.lang.String.format(r0, r2)
                    r1 = 19
                    goto L63
                L40:
                    java.lang.String r0 = r5.c
                    java.lang.String r2 = r6.d
                    java.lang.Object[] r3 = new java.lang.Object[r7]
                    r3[r10] = r1
                    r3[r9] = r0
                    r3[r8] = r2
                    java.lang.String r0 = "%s: Malformed lease uri file %s, file group %s"
                    defpackage.dxth.i(r0, r3)
                    java.lang.String r0 = r5.c
                    java.lang.String r1 = r6.d
                    java.lang.Object[] r2 = new java.lang.Object[r8]
                    r2[r10] = r0
                    r2[r9] = r1
                    java.lang.String r0 = "Malformed blob Uri for file %s, group %s"
                    java.lang.String r0 = java.lang.String.format(r0, r2)
                    r1 = 17
                L63:
                    r11 = r10
                    r10 = r1
                    r1 = r11
                    goto L98
                L67:
                    r2 = move-exception
                    java.lang.String r3 = r2.getMessage()
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L73
                    goto L77
                L73:
                    java.lang.String r0 = r2.getMessage()
                L77:
                    java.lang.String r2 = r5.c
                    java.lang.String r3 = r6.d
                    r4 = 4
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    r4[r10] = r1
                    r4[r9] = r2
                    r4[r8] = r3
                    r4[r7] = r0
                    java.lang.String r1 = "%s: Failed to share for file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\""
                    defpackage.dxth.m(r1, r4)
                    java.lang.String r1 = "UnsupportedFileStorageOperation was thrown: "
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    java.lang.String r0 = r1.concat(r0)
                    r1 = 24
                    goto L63
                L98:
                    if (r10 != 0) goto La3
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    com.google.common.util.concurrent.ListenableFuture r0 = defpackage.erqt.i(r0)
                    return r0
                La3:
                    dxva r1 = new dxva
                    r1.<init>(r10, r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dxuz.a():com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.n), new emwl() { // from class: dxhj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((Boolean) obj).booleanValue() ? dxie.FILE_ALREADY_EXISTS_IN_ANDROID_SHARED_STORAGE : dxie.FILE_NOT_SHARED_IN_ANDROID_SHARED_STORAGE;
            }
        });
    }

    public final ListenableFuture g(dwtm dwtmVar, boolean z) {
        dwtl dwtlVar = (dwtl) dwtmVar.toBuilder();
        dwtlVar.copyOnWrite();
        dwtm dwtmVar2 = (dwtm) dwtlVar.instance;
        dwtmVar2.b |= 8;
        dwtmVar2.f = z;
        return this.d.g((dwtm) dwtlVar.build());
    }

    public final ListenableFuture h(dwso dwsoVar) {
        return i(dwsoVar, false, false, 0, dwsoVar.p.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ListenableFuture i(final dwso dwsoVar, final boolean z, final boolean z2, final int i, final int i2) {
        if (i >= i2) {
            return z ? erqt.i(dxif.FAILED) : z2 ? erqt.i(dxif.PENDING) : erqt.i(dxif.DOWNLOADED);
        }
        final dwsi dwsiVar = (dwsi) dwsoVar.p.get(i);
        return dxvk.k(dwsiVar) ? i(dwsoVar, z, z2, i + 1, i2) : dycd.e(j(dwsiVar, dwsoVar)).g(new eroh() { // from class: dxht
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dxig dxigVar = dxig.this;
                dwso dwsoVar2 = dwsoVar;
                boolean z3 = z;
                boolean z4 = z2;
                int i3 = i + 1;
                dwsi dwsiVar2 = dwsiVar;
                int i4 = i2;
                dwtk dwtkVar = (dwtk) obj;
                if (dwtkVar == dwtk.DOWNLOAD_COMPLETE) {
                    dxth.d("%s: File %s downloaded for group: %s", "FileGroupManager", dwsiVar2.c, dwsoVar2.d);
                    return dxigVar.i(dwsoVar2, z3, z4, i3, i4);
                }
                if (dwtkVar == dwtk.SUBSCRIBED || dwtkVar == dwtk.DOWNLOAD_IN_PROGRESS) {
                    dxth.d("%s: File %s not downloaded for group: %s", "FileGroupManager", dwsiVar2.c, dwsoVar2.d);
                    return dxigVar.i(dwsoVar2, z3, true, i3, i4);
                }
                dxth.d("%s: File %s not downloaded for group: %s", "FileGroupManager", dwsiVar2.c, dwsoVar2.d);
                return dxigVar.i(dwsoVar2, true, z4, i3, i4);
            }
        }, this.h);
    }

    public final ListenableFuture j(dwsi dwsiVar, final dwso dwsoVar) {
        int a = dwsm.a(dwsoVar.k);
        if (a == 0) {
            a = 1;
        }
        return dycd.e(this.e.d(dxpp.a(dwsiVar, a))).d(dxpo.class, new eroh() { // from class: dxdq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dxth.h("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", dwsoVar.d);
                dxig.this.c.a();
                return erqt.i(dwtk.NONE);
            }
        }, this.h);
    }

    final ListenableFuture k(dwso dwsoVar) {
        final enhd enhdVar = new enhd();
        enhd enhdVar2 = new enhd();
        for (dwsi dwsiVar : dwsoVar.p) {
            if (dxvk.k(dwsiVar)) {
                enhdVar.k(dwsiVar, Uri.parse(dwsiVar.d));
            } else {
                int a = dwsm.a(dwsoVar.k);
                if (a == 0) {
                    a = 1;
                }
                enhdVar2.k(dwsiVar, dxpp.a(dwsiVar, a));
            }
        }
        final enhk b = enhdVar2.b();
        return dycd.e(this.e.f(enip.o(b.values()))).f(new emwl() { // from class: dxhl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enhk enhkVar = (enhk) obj;
                enqu listIterator = enhk.this.entrySet().listIterator();
                while (true) {
                    enhd enhdVar3 = enhdVar;
                    if (!listIterator.hasNext()) {
                        return enhdVar3.b();
                    }
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    dwtt dwttVar = (dwtt) entry.getValue();
                    if (dwttVar != null && enhkVar.containsKey(dwttVar)) {
                        enhdVar3.k((dwsi) entry.getKey(), (Uri) enhkVar.get(dwttVar));
                    }
                }
            }
        }, this.h);
    }

    public final ListenableFuture l(final dwso dwsoVar, final dwsi dwsiVar, final dwtt dwttVar) {
        return elfr.f(this.e.g(dwttVar), dxpo.class, new eroh() { // from class: dxgz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dxth.h("%s: Shared file not found, newFileKey = %s", "FileGroupManager", dwttVar);
                dxig dxigVar = dxig.this;
                dxigVar.c.a();
                dxig.D(dxigVar.b, dwsoVar, dwsiVar, 26);
                return erqt.h((dxpo) obj);
            }
        }, this.h);
    }

    public final ListenableFuture m(final eroh erohVar) {
        final ArrayList arrayList = new ArrayList();
        return r(this.d.d(), new eroh() { // from class: dxhf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Iterator it = ((List) obj).iterator();
                while (true) {
                    List list = arrayList;
                    dxig dxigVar = dxig.this;
                    if (!it.hasNext()) {
                        return dycg.a(list).a(new Callable() { // from class: dxhd
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }, dxigVar.h);
                    }
                    final eroh erohVar2 = erohVar;
                    final dwtm dwtmVar = (dwtm) it.next();
                    list.add(dxigVar.r(dxigVar.d.g(dwtmVar), new eroh() { // from class: dxhc
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            dwso dwsoVar = (dwso) obj2;
                            if (dwsoVar == null) {
                                return erre.a;
                            }
                            return eroh.this.a(new dxpz(dwtmVar, dwsoVar));
                        }
                    }));
                }
            }
        });
    }

    public final ListenableFuture n(dwtm dwtmVar, final dwqn dwqnVar, long j, String str) {
        final erid eridVar = (erid) erie.a.createBuilder();
        String str2 = dwtmVar.c;
        eridVar.copyOnWrite();
        erie erieVar = (erie) eridVar.instance;
        str2.getClass();
        erieVar.b |= 1;
        erieVar.c = str2;
        String str3 = dwtmVar.d;
        eridVar.copyOnWrite();
        erie erieVar2 = (erie) eridVar.instance;
        str3.getClass();
        erieVar2.b |= 4;
        erieVar2.e = str3;
        eridVar.copyOnWrite();
        erie erieVar3 = (erie) eridVar.instance;
        erieVar3.b |= 64;
        erieVar3.i = j;
        eridVar.copyOnWrite();
        erie erieVar4 = (erie) eridVar.instance;
        str.getClass();
        erieVar4.b |= 128;
        erieVar4.j = str;
        dwtl dwtlVar = (dwtl) dwtmVar.toBuilder();
        dwtlVar.copyOnWrite();
        dwtm dwtmVar2 = (dwtm) dwtlVar.instance;
        dwtmVar2.b |= 8;
        dwtmVar2.f = false;
        return r(this.d.g((dwtm) dwtlVar.build()), new eroh() { // from class: dxfj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                erid eridVar2 = eridVar;
                dwso dwsoVar = (dwso) obj;
                if (dwsoVar != null) {
                    int i = dwsoVar.f;
                    eridVar2.copyOnWrite();
                    erie erieVar5 = (erie) eridVar2.instance;
                    erie erieVar6 = erie.a;
                    erieVar5.b |= 2;
                    erieVar5.d = i;
                }
                dwqn dwqnVar2 = dwqnVar;
                dxig.this.b.q(erkd.b(dwqnVar2.a.aF), (erie) eridVar2.build(), erkb.a(dwqnVar2.b - 1));
                return erre.a;
            }
        });
    }

    public final ListenableFuture o(dwso dwsoVar) {
        return p(dwsoVar, 0, dwsoVar.p.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ListenableFuture p(final dwso dwsoVar, final int i, final int i2) {
        if (i >= i2) {
            return erqt.i(true);
        }
        dwsi dwsiVar = (dwsi) dwsoVar.p.get(i);
        if (dxvk.k(dwsiVar)) {
            return p(dwsoVar, i + 1, i2);
        }
        int a = dwsm.a(dwsoVar.k);
        final dwtt a2 = dxpp.a(dwsiVar, a != 0 ? a : 1);
        final dxpn dxpnVar = this.e;
        return r(elfr.k(dxpnVar.c.e(a2), new eroh() { // from class: dxoh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (((dwtx) obj) != null) {
                    return erqt.i(true);
                }
                final dwtt dwttVar = a2;
                dxpn dxpnVar2 = dxpn.this;
                SharedPreferences a3 = dxvw.a(dxpnVar2.a, "gms_icing_mdd_shared_file_manager_metadata", dxpnVar2.k);
                long j = a3.getLong("next_file_name_v2", System.currentTimeMillis());
                if (!a3.edit().putLong("next_file_name_v2", 1 + j).commit()) {
                    dxth.h("%s: Unable to update file name %s", "SharedFileManager", dwttVar);
                    return erqt.i(false);
                }
                String s = a.s(j, "datadownloadfile_");
                dwtw dwtwVar = (dwtw) dwtx.a.createBuilder();
                dwtk dwtkVar = dwtk.SUBSCRIBED;
                dwtwVar.copyOnWrite();
                dwtx dwtxVar = (dwtx) dwtwVar.instance;
                dwtxVar.d = dwtkVar.h;
                dwtxVar.b |= 2;
                dwtwVar.copyOnWrite();
                dwtx dwtxVar2 = (dwtx) dwtwVar.instance;
                dwtxVar2.b = 1 | dwtxVar2.b;
                dwtxVar2.c = s;
                return elfr.k(dxpnVar2.c.h(dwttVar, (dwtx) dwtwVar.build()), new eroh() { // from class: dxpj
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return erqt.i(true);
                        }
                        dxth.h("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", dwtt.this);
                        return erqt.i(false);
                    }
                }, dxpnVar2.l);
            }
        }, dxpnVar.l), new eroh() { // from class: dxee
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                dwso dwsoVar2 = dwsoVar;
                if (!booleanValue) {
                    dxth.h("%s: Subscribing to file failed for group: %s", "FileGroupManager", dwsoVar2.d);
                    return erqt.i(false);
                }
                return dxig.this.p(dwsoVar2, i + 1, i2);
            }
        });
    }

    public final ListenableFuture q(ListenableFuture listenableFuture, emwl emwlVar) {
        return elfr.j(listenableFuture, emwlVar, this.h);
    }

    public final ListenableFuture r(ListenableFuture listenableFuture, eroh erohVar) {
        return elfr.k(listenableFuture, erohVar, this.h);
    }

    public final ListenableFuture s(final dwso dwsoVar, final dwsi dwsiVar, final dwtt dwttVar, final long j) {
        final dxpn dxpnVar = this.e;
        return r(elfr.k(dxpnVar.g(dwttVar), new eroh() { // from class: dxol
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwtx dwtxVar = (dwtx) obj;
                long j2 = dwtxVar.f;
                long j3 = j;
                if (j3 <= j2) {
                    return erqt.i(true);
                }
                dwtt dwttVar2 = dwttVar;
                dxpn dxpnVar2 = dxpn.this;
                dwtw dwtwVar = (dwtw) dwtxVar.toBuilder();
                dwtwVar.copyOnWrite();
                dwtx dwtxVar2 = (dwtx) dwtwVar.instance;
                dwtxVar2.b |= 8;
                dwtxVar2.f = j3;
                return dxpnVar2.c.h(dwttVar2, (dwtx) dwtwVar.build());
            }
        }, dxpnVar.l), new eroh() { // from class: dxdf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    dwso dwsoVar2 = dwsoVar;
                    dwsi dwsiVar2 = dwsiVar;
                    dxig dxigVar = dxig.this;
                    dxth.i("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", dwsiVar2.c, dwsoVar2.d);
                    dxig.D(dxigVar.b, dwsoVar2, dwsiVar2, 14);
                }
                return erre.a;
            }
        });
    }

    final ListenableFuture t(dwtm dwtmVar, final dwso dwsoVar, final boolean z, final eroh erohVar, final dxsw dxswVar) {
        dxth.d("%s: Verify group: %s, remove pending version: %s", "FileGroupManager", dwsoVar.d, Boolean.valueOf(z));
        dwtl dwtlVar = (dwtl) dwtmVar.toBuilder();
        dwtlVar.copyOnWrite();
        dwtm dwtmVar2 = (dwtm) dwtlVar.instance;
        dwtmVar2.b |= 8;
        dwtmVar2.f = true;
        final dwtm dwtmVar3 = (dwtm) dwtlVar.build();
        dwtl dwtlVar2 = (dwtl) dwtmVar.toBuilder();
        dwtlVar2.copyOnWrite();
        dwtm dwtmVar4 = (dwtm) dwtlVar2.instance;
        dwtmVar4.b |= 8;
        dwtmVar4.f = false;
        final dwtm dwtmVar5 = (dwtm) dwtlVar2.build();
        dwsk dwskVar = dwsoVar.c;
        if (dwskVar == null) {
            dwskVar = dwsk.a;
        }
        final boolean z2 = (dwskVar.b & 4) != 0;
        long a = this.m.a();
        dwsk dwskVar2 = dwsoVar.c;
        if (dwskVar2 == null) {
            dwskVar2 = dwsk.a;
        }
        dwsj dwsjVar = (dwsj) dwskVar2.toBuilder();
        dwsjVar.copyOnWrite();
        dwsk dwskVar3 = (dwsk) dwsjVar.instance;
        dwskVar3.b |= 4;
        dwskVar3.e = a;
        dwsk dwskVar4 = (dwsk) dwsjVar.build();
        dwsn dwsnVar = (dwsn) dwsoVar.toBuilder();
        dwsnVar.copyOnWrite();
        dwso dwsoVar2 = (dwso) dwsnVar.instance;
        dwskVar4.getClass();
        dwsoVar2.c = dwskVar4;
        dwsoVar2.b |= 1;
        final dwso dwsoVar3 = (dwso) dwsnVar.build();
        return dycd.e(h(dwsoVar)).g(new eroh() { // from class: dxgl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxsw dxswVar2 = dxswVar;
                final dwso dwsoVar4 = dwsoVar;
                dxif dxifVar = (dxif) obj;
                if (dxifVar == dxif.FAILED) {
                    dxswVar2.a(dwsoVar4);
                    return erqt.i(dxif.FAILED);
                }
                if (dxifVar == dxif.PENDING) {
                    if (dxswVar2.b - 1 != 0) {
                        dxswVar2.c(1112, dwsoVar4);
                    } else {
                        dxswVar2.c(1007, dwsoVar4);
                    }
                    return erqt.i(dxif.PENDING);
                }
                final boolean z3 = z2;
                final dwso dwsoVar5 = dwsoVar3;
                final dwtm dwtmVar6 = dwtmVar3;
                eroh erohVar2 = erohVar;
                final boolean z4 = z;
                final dwtm dwtmVar7 = dwtmVar5;
                final dxig dxigVar = dxig.this;
                emxf.a(dxifVar == dxif.DOWNLOADED);
                return dycd.e(erohVar2.a(new dxpz(dwtmVar7, dwsoVar4))).g(new eroh() { // from class: dxfn
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        dwox dwoxVar = (dwox) obj2;
                        if (dwoxVar == dwox.SUCCESS) {
                            return erre.a;
                        }
                        final dwtm dwtmVar8 = dwtmVar7;
                        boolean z5 = z4;
                        dwso dwsoVar6 = dwsoVar4;
                        dxsw dxswVar3 = dxswVar2;
                        final dxig dxigVar2 = dxig.this;
                        dxswVar3.a(dwsoVar6);
                        ListenableFuture i = erqt.i(true);
                        if (z5 && dwoxVar != dwox.FAILURE_KEEP_PENDING) {
                            i = dxigVar2.d.i(dwtmVar8);
                        }
                        return dxigVar2.r(i, new eroh() { // from class: dxfz
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                if (((Boolean) obj3).booleanValue()) {
                                    dwql a2 = dwqn.a();
                                    dwqm dwqmVar = dwqm.CUSTOM_FILEGROUP_VALIDATION_FAILED;
                                    a2.a = dwqmVar;
                                    a2.b = dwqmVar.name();
                                    return erqt.h(a2.a());
                                }
                                dwtm dwtmVar9 = dwtmVar8;
                                dxig dxigVar3 = dxig.this;
                                dxth.i("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", dwtmVar9.c, dwtmVar9.e);
                                dxigVar3.b.l(1036);
                                return erqt.h(new IOException("Failed to remove pending group: ".concat(String.valueOf(dwtmVar9.c))));
                            }
                        });
                    }
                }, dxigVar.h).g(new eroh() { // from class: dxfq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        dwso dwsoVar6 = dwsoVar4;
                        return dxvk.j(dwsoVar6) ? dxig.this.d(dwsoVar6) : erre.a;
                    }
                }, dxigVar.h).g(new eroh() { // from class: dxfr
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final dxig dxigVar2 = dxig.this;
                        dxih dxihVar = dxigVar2.d;
                        final dwtm dwtmVar8 = dwtmVar6;
                        final dycd f = dycd.e(dxihVar.g(dwtmVar8)).f(new emwl() { // from class: dxia
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return emxc.i((dwso) obj3);
                            }
                        }, dxigVar2.h);
                        final dwso dwsoVar6 = dwsoVar5;
                        return f.g(new eroh() { // from class: dxib
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                return dxig.this.d.l(dwtmVar8, dwsoVar6);
                            }
                        }, dxigVar2.h).g(new eroh() { // from class: dxcx
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                if (((Boolean) obj3).booleanValue()) {
                                    return f;
                                }
                                dwtm dwtmVar9 = dwtmVar8;
                                dxig.this.b.l(1036);
                                return erqt.h(new IOException("Failed to write updated group: ".concat(String.valueOf(dwtmVar9.c))));
                            }
                        }, dxigVar2.h);
                    }
                }, dxigVar.h).g(new eroh() { // from class: dxfs
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final emxc emxcVar = (emxc) obj2;
                        if (!z4) {
                            return erqt.i(emxcVar);
                        }
                        dwtm dwtmVar8 = dwtmVar7;
                        final dxig dxigVar2 = dxig.this;
                        return dxigVar2.q(dxigVar2.d.i(dwtmVar8), new emwl() { // from class: dxfw
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                if (!((Boolean) obj3).booleanValue()) {
                                    dxig.this.b.l(1036);
                                }
                                return emxcVar;
                            }
                        });
                    }
                }, dxigVar.h).g(new eroh() { // from class: dxft
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        emxc emxcVar = (emxc) obj2;
                        if (!emxcVar.g()) {
                            return erre.a;
                        }
                        final dxig dxigVar2 = dxig.this;
                        return dxigVar2.r(dxigVar2.d.a((dwso) emxcVar.c()), new eroh() { // from class: dxhb
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                if (!((Boolean) obj3).booleanValue()) {
                                    dxig.this.b.l(1036);
                                }
                                return erre.a;
                            }
                        });
                    }
                }, dxigVar.h).f(new emwl() { // from class: dxfv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        dxsw dxswVar3 = dxswVar2;
                        if (!z3 || dxswVar3.b == 2) {
                            dwso dwsoVar6 = dwsoVar5;
                            if (dxswVar3.b - 1 != 0) {
                                dxswVar3.c(1114, dwsoVar6);
                            } else {
                                dxswVar3.c(1009, dwsoVar6);
                                if (dxswVar3.b == 1) {
                                    erid eridVar = (erid) erie.a.createBuilder();
                                    String str = dwsoVar6.e;
                                    eridVar.copyOnWrite();
                                    erie erieVar = (erie) eridVar.instance;
                                    str.getClass();
                                    erieVar.b |= 4;
                                    erieVar.e = str;
                                    String str2 = dwsoVar6.d;
                                    eridVar.copyOnWrite();
                                    erie erieVar2 = (erie) eridVar.instance;
                                    str2.getClass();
                                    erieVar2.b |= 1;
                                    erieVar2.c = str2;
                                    int i = dwsoVar6.f;
                                    eridVar.copyOnWrite();
                                    erie erieVar3 = (erie) eridVar.instance;
                                    erieVar3.b |= 2;
                                    erieVar3.d = i;
                                    int size = dwsoVar6.p.size();
                                    eridVar.copyOnWrite();
                                    erie erieVar4 = (erie) eridVar.instance;
                                    erieVar4.b |= 8;
                                    erieVar4.f = size;
                                    long j = dwsoVar6.t;
                                    eridVar.copyOnWrite();
                                    erie erieVar5 = (erie) eridVar.instance;
                                    erieVar5.b |= 64;
                                    erieVar5.i = j;
                                    String str3 = dwsoVar6.u;
                                    eridVar.copyOnWrite();
                                    erie erieVar6 = (erie) eridVar.instance;
                                    str3.getClass();
                                    erieVar6.b |= 128;
                                    erieVar6.j = str3;
                                    erie erieVar7 = (erie) eridVar.build();
                                    dwsk dwskVar5 = dwsoVar6.c;
                                    if (dwskVar5 == null) {
                                        dwskVar5 = dwsk.a;
                                    }
                                    long j2 = dwskVar5.d;
                                    long j3 = dwskVar5.f;
                                    long j4 = dwskVar5.e;
                                    erin erinVar = (erin) erio.a.createBuilder();
                                    int i2 = dwskVar5.g;
                                    erinVar.copyOnWrite();
                                    erio erioVar = (erio) erinVar.instance;
                                    erioVar.b = 1 | erioVar.b;
                                    erioVar.c = i2;
                                    long j5 = j4 - j3;
                                    erinVar.copyOnWrite();
                                    erio erioVar2 = (erio) erinVar.instance;
                                    erioVar2.b = 2 | erioVar2.b;
                                    erioVar2.d = j5;
                                    erinVar.copyOnWrite();
                                    erio erioVar3 = (erio) erinVar.instance;
                                    erioVar3.b |= 4;
                                    erioVar3.e = j4 - j2;
                                    dwsk dwskVar6 = dwsoVar6.c;
                                    if (dwskVar6 == null) {
                                        dwskVar6 = dwsk.a;
                                    }
                                    boolean z5 = dwskVar6.i;
                                    erinVar.copyOnWrite();
                                    erio erioVar4 = (erio) erinVar.instance;
                                    erioVar4.b |= 8;
                                    erioVar4.f = z5;
                                    dxswVar3.a.f(erieVar7, (erio) erinVar.build());
                                }
                            }
                        }
                        return dxif.DOWNLOADED;
                    }
                }, dxigVar.h);
            }
        }, this.h).g(new eroh() { // from class: dxgm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dxif dxifVar = (dxif) obj;
                String str = dwsoVar.d;
                return dxig.this.q(erre.a, new emwl() { // from class: dxds
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return dxif.this;
                    }
                });
            }
        }, this.h);
    }

    public final boolean v(String str) {
        try {
            this.a.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final ListenableFuture z(final dwso dwsoVar, final dwsi dwsiVar, final dwtt dwttVar, dwtx dwtxVar, final int i) {
        return r(B(dwsoVar, dwsiVar, dwtxVar, dwttVar, dwsiVar.o, dwsoVar.m, i), new eroh() { // from class: dxgg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue() || i == 4) {
                    return erre.a;
                }
                dwtt dwttVar2 = dwttVar;
                dwsi dwsiVar2 = dwsiVar;
                dwso dwsoVar2 = dwsoVar;
                return dxig.this.s(dwsoVar2, dwsiVar2, dwttVar2, dwsoVar2.m);
            }
        });
    }
}
