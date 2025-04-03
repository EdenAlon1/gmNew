package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.delta.vcdiff.VcDiffFileDecoder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxrw implements dxsr {
    public final Context a;
    public final dxpq b;
    public final efbm c;
    public final dwxf d;
    public final dwsi e;
    public final dwss f;
    public final dxsy g;
    public final dwtm h;
    public final int i;
    public final long j;
    public final String k;
    public final emxc l;
    public final Executor m;
    public final dxam n;
    public final int o;
    private final dwqy p;

    public dxrw(Context context, dxpq dxpqVar, efbm efbmVar, dwxf dwxfVar, dwsi dwsiVar, int i, dxam dxamVar, dwss dwssVar, dxsy dxsyVar, dwtm dwtmVar, int i2, long j, String str, emxc emxcVar, dwqy dwqyVar, Executor executor) {
        this.a = context;
        this.b = dxpqVar;
        this.c = efbmVar;
        this.d = dwxfVar;
        this.e = dwsiVar;
        this.o = i;
        this.n = dxamVar;
        this.f = dwssVar;
        this.g = dxsyVar;
        this.h = dwtmVar;
        this.i = i2;
        this.j = j;
        this.k = str;
        this.l = emxcVar;
        this.p = dwqyVar;
        this.m = executor;
    }

    @Override // defpackage.dxsr
    public final ListenableFuture a(final Uri uri) {
        dxth.c("%s: Successfully downloaded delta file %s", "DeltaFileDownloaderCallbackImpl", uri);
        if (!dxsf.d(this.c, uri, this.f.e)) {
            dxth.i("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri, this.f.e);
            dwql a = dwqn.a();
            a.a = dwqm.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            final dwqn a2 = a.a();
            return dycd.e(dxsd.c(this.b, this.e, this.o, this.c, uri, this.f.e, this.g, this.p, this.m)).d(IOException.class, new eroh() { // from class: dxrt
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    dwqn.this.addSuppressed((IOException) obj);
                    return erre.a;
                }
            }, this.m).g(new eroh() { // from class: dxru
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return erqt.h(dwqn.this);
                }
            }, this.m);
        }
        final Uri a3 = dxse.a(uri);
        dwts dwtsVar = (dwts) dwtt.a.createBuilder();
        dwsa dwsaVar = this.f.g;
        if (dwsaVar == null) {
            dwsaVar = dwsa.a;
        }
        String str = dwsaVar.c;
        dwtsVar.copyOnWrite();
        dwtt dwttVar = (dwtt) dwtsVar.instance;
        str.getClass();
        dwttVar.b |= 4;
        dwttVar.e = str;
        int i = this.o;
        dwtsVar.copyOnWrite();
        dwtt dwttVar2 = (dwtt) dwtsVar.instance;
        dwttVar2.f = i - 1;
        dwttVar2.b |= 8;
        final dwtt dwttVar3 = (dwtt) dwtsVar.build();
        return elfr.k(elfr.k(this.b.e(dwttVar3), new eroh() { // from class: dxrs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                int i2;
                dxrw dxrwVar = dxrw.this;
                Uri uri2 = a3;
                Uri uri3 = uri;
                dwtx dwtxVar = (dwtx) obj;
                Uri uri4 = null;
                if (dwtxVar != null) {
                    dwtk b = dwtk.b(dwtxVar.d);
                    if (b == null) {
                        b = dwtk.NONE;
                    }
                    if (b == dwtk.DOWNLOAD_COMPLETE) {
                        uri4 = dxvb.e(dxrwVar.a, dxrwVar.o, dwtxVar.c, dwttVar3.e, dxrwVar.d, dxrwVar.l, false);
                    }
                }
                if (uri4 == null) {
                    dwql a4 = dwqn.a();
                    a4.a = dwqm.DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR;
                    return erqt.h(a4.a());
                }
                try {
                    if (dxrwVar.c.h(uri2)) {
                        dxrwVar.c.f(uri2);
                    }
                    dxam dxamVar = dxrwVar.n;
                    if (!VcDiffFileDecoder.a) {
                        throw new dxal("VcDiff decoding library is not initialized!");
                    }
                    try {
                        if (!VcDiffFileDecoder.a(dxamVar.a(uri4), dxamVar.a(uri3), dxamVar.a(uri2))) {
                            throw new dxal("Failed to decode.");
                        }
                        dxrwVar.c.f(uri3);
                        erid eridVar = (erid) erie.a.createBuilder();
                        String str2 = dxrwVar.h.c;
                        eridVar.copyOnWrite();
                        erie erieVar = (erie) eridVar.instance;
                        str2.getClass();
                        erieVar.b = 1 | erieVar.b;
                        erieVar.c = str2;
                        int i3 = dxrwVar.i;
                        eridVar.copyOnWrite();
                        erie erieVar2 = (erie) eridVar.instance;
                        erieVar2.b = 2 | erieVar2.b;
                        erieVar2.d = i3;
                        String str3 = dxrwVar.h.d;
                        eridVar.copyOnWrite();
                        erie erieVar3 = (erie) eridVar.instance;
                        str3.getClass();
                        erieVar3.b |= 4;
                        erieVar3.e = str3;
                        long j = dxrwVar.j;
                        eridVar.copyOnWrite();
                        erie erieVar4 = (erie) eridVar.instance;
                        erieVar4.b |= 64;
                        erieVar4.i = j;
                        String str4 = dxrwVar.k;
                        eridVar.copyOnWrite();
                        erie erieVar5 = (erie) eridVar.instance;
                        str4.getClass();
                        erieVar5.b |= 128;
                        erieVar5.j = str4;
                        erie erieVar6 = (erie) eridVar.build();
                        dxsy dxsyVar = dxrwVar.g;
                        dwsi dwsiVar = dxrwVar.e;
                        dwss dwssVar = dxrwVar.f;
                        long j2 = dwsiVar.e;
                        long j3 = dwssVar.d;
                        String str5 = dwsiVar.c;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= dxrwVar.e.l.size()) {
                                i2 = 0;
                                break;
                            }
                            int i5 = i4 + 1;
                            if (emuz.e(((dwss) dxrwVar.e.l.get(i4)).e, dxrwVar.f.e)) {
                                i2 = i5;
                                break;
                            }
                            i4 = i5;
                        }
                        dxsyVar.o(erieVar6, 4, j2, j3, str5, i2);
                        return erre.a;
                    } catch (efcv e) {
                        throw new dxal(e);
                    }
                } catch (IOException e2) {
                    dxth.k(e2, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", "DeltaFileDownloaderCallbackImpl", dxrwVar.f.c, dxrwVar.e.g);
                    dxrwVar.d.a();
                    dwql a5 = dwqn.a();
                    a5.a = dwqm.DELTA_DOWNLOAD_DECODE_IO_ERROR;
                    a5.c = e2;
                    return erqt.h(a5.a());
                }
            }
        }, this.m), new eroh() { // from class: dxrv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dxrw dxrwVar = dxrw.this;
                efbm efbmVar = dxrwVar.c;
                Uri uri2 = a3;
                if (!dxsf.d(efbmVar, uri2, dxrwVar.e.g)) {
                    dxth.h("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", uri2);
                    dwql a4 = dwqn.a();
                    a4.a = dwqm.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                    return erqt.h(a4.a());
                }
                return dxsd.d(dwtk.DOWNLOAD_COMPLETE, dxrwVar.e, dxrwVar.o, dxrwVar.b, dxrwVar.m);
            }
        }, this.m);
    }

    @Override // defpackage.dxsr
    public final ListenableFuture b(dwqn dwqnVar) {
        dxth.c("%s: Failed to download file(delta) %s", "DeltaFileDownloaderCallbackImpl", this.e.g);
        if (dwqnVar.a.equals(dwqm.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
            return dxsd.d(dwtk.CORRUPTED, this.e, this.o, this.b, this.m);
        }
        return dxsd.d(dwtk.DOWNLOAD_FAILED, this.e, this.o, this.b, this.m);
    }
}
