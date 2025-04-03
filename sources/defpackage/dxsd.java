package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxsd implements dxsr {
    private final dxpq a;
    private final efbm b;
    private final dwsi c;
    private final String d;
    private final dxsy e;
    private final dwtm f;
    private final int g;
    private final long h;
    private final String i;
    private final dwqy j;
    private final Executor k;
    private final int l;

    public dxsd(dxpq dxpqVar, efbm efbmVar, dwsi dwsiVar, int i, dxsy dxsyVar, dwtm dwtmVar, int i2, long j, String str, dwqy dwqyVar, Executor executor) {
        this.a = dxpqVar;
        this.b = efbmVar;
        this.c = dwsiVar;
        this.l = i;
        this.d = dxvk.e(dwsiVar);
        this.e = dxsyVar;
        this.f = dwtmVar;
        this.g = i2;
        this.h = j;
        this.i = str;
        this.j = dwqyVar;
        this.k = executor;
    }

    static ListenableFuture c(dxpq dxpqVar, dwsi dwsiVar, int i, final efbm efbmVar, final Uri uri, final String str, final dxsy dxsyVar, final dwqy dwqyVar, Executor executor) {
        return dycd.e(e(dxpqVar, dxpp.a(dwsiVar, i), executor)).g(new eroh() { // from class: dxrz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                int i2 = ((dwtx) obj).h;
                efbm efbmVar2 = efbmVar;
                String str2 = str;
                Uri uri2 = uri;
                if (i2 >= dwqy.this.f()) {
                    dxsy dxsyVar2 = dxsyVar;
                    dxth.c("%s: Checksum mismatch detected but the has already reached retry limit! Skipping removal for file %s", "DownloaderCallbackImpl", str2);
                    dxsyVar2.l(1115);
                } else {
                    dxth.b("%s: Removing file and marking as corrupted due to checksum mismatch", "DownloaderCallbackImpl");
                    try {
                        efbmVar2.f(uri2);
                    } catch (IOException e) {
                        dxth.k(e, "%s: Failed to remove corrupted file %s", "DownloaderCallbackImpl", str2);
                        return erqt.h(e);
                    }
                }
                return erre.a;
            }
        }, executor);
    }

    static ListenableFuture d(final dwtk dwtkVar, dwsi dwsiVar, int i, final dxpq dxpqVar, Executor executor) {
        final dwtt a = dxpp.a(dwsiVar, i);
        return dycd.e(e(dxpqVar, a, executor)).g(new eroh() { // from class: dxrx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwtx dwtxVar = (dwtx) obj;
                dwtw dwtwVar = (dwtw) dwtxVar.toBuilder();
                dwtwVar.copyOnWrite();
                dwtx dwtxVar2 = (dwtx) dwtwVar.instance;
                dwtk dwtkVar2 = dwtk.this;
                dwtxVar2.d = dwtkVar2.h;
                dwtxVar2.b |= 2;
                if (dwtkVar2.equals(dwtk.CORRUPTED)) {
                    int i2 = dwtxVar.h + 1;
                    dwtwVar.copyOnWrite();
                    dwtx dwtxVar3 = (dwtx) dwtwVar.instance;
                    dwtxVar3.b |= 32;
                    dwtxVar3.h = i2;
                }
                return dxpqVar.h(a, (dwtx) dwtwVar.build());
            }
        }, executor).g(new eroh() { // from class: dxry
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return erre.a;
                }
                dxth.h("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", dwtt.this);
                dwql a2 = dwqn.a();
                a2.a = dwqm.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
                return erqt.h(a2.a());
            }
        }, executor);
    }

    private static ListenableFuture e(dxpq dxpqVar, final dwtt dwttVar, Executor executor) {
        return elfr.k(dxpqVar.e(dwttVar), new eroh() { // from class: dxsc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwtx dwtxVar = (dwtx) obj;
                if (dwtxVar != null) {
                    return erqt.i(dwtxVar);
                }
                dxth.h("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", dwtt.this);
                dwql a = dwqn.a();
                a.a = dwqm.SHARED_FILE_NOT_FOUND_ERROR;
                return erqt.h(a.a());
            }
        }, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0282, code lost:
    
        if (r0 != 2) goto L85;
     */
    @Override // defpackage.dxsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture a(android.net.Uri r24) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxsd.a(android.net.Uri):com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // defpackage.dxsr
    public final ListenableFuture b(dwqn dwqnVar) {
        dxth.c("%s: Failed to download file %s", "DownloaderCallbackImpl", this.d);
        if (dwqnVar.a.equals(dwqm.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
            return d(dwtk.CORRUPTED, this.c, this.l, this.a, this.k);
        }
        return d(dwtk.DOWNLOAD_FAILED, this.c, this.l, this.a, this.k);
    }
}
