package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxbk implements dxbd {
    public final eaez a;
    public final eafa b;
    private final Context c;
    private final efbm d;
    private final Executor e;

    public dxbk(Context context, eaez eaezVar, eafa eafaVar, efbm efbmVar, Executor executor) {
        this.c = context;
        this.a = eaezVar;
        this.b = eafaVar;
        this.d = efbmVar;
        this.e = executor;
    }

    @Override // defpackage.dxbd
    public final ListenableFuture a(dxaw dxawVar) {
        dxao dxaoVar = (dxao) dxawVar;
        final String str = dxaoVar.a;
        final emxc emxcVar = dxaoVar.b;
        return elfr.j(elfr.i(new erog() { // from class: dxbi
            @Override // defpackage.erog
            public final ListenableFuture a() {
                String str2 = str;
                dxth.c("%s: Fetch the latest ETag; url = %s", "OffroadFileDownloader", str2);
                HttpURLConnection a = dxbk.this.b.a(str2);
                a.setRequestMethod("HEAD");
                emxc emxcVar2 = emxcVar;
                if (emxcVar2.g()) {
                    a.setRequestProperty("If-None-Match", (String) emxcVar2.c());
                }
                try {
                    a.connect();
                    int responseCode = a.getResponseCode();
                    if (responseCode == 304) {
                        dxth.b("%s: Got HTTP_RESPONSE_NOT_MODIFIED, reuse cache.", "OffroadFileDownloader");
                    } else {
                        if (responseCode != 200) {
                            dwql a2 = dwqn.a();
                            a2.a = dwqm.ANDROID_DOWNLOADER_HTTP_ERROR;
                            a2.b = a.h(responseCode, "Http request failed; code = ");
                            return erqt.h(a2.a());
                        }
                        dxth.b("%s: Got HTTP_RESPONSE_OK, updating cache.", "OffroadFileDownloader");
                        emxcVar2 = emxc.i(a.getHeaderField("ETag"));
                    }
                    a.disconnect();
                    return erqt.i(emxcVar2);
                } catch (IOException e) {
                    dwql a3 = dwqn.a();
                    a3.a = dwqm.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                    a3.b = a.t(str2, "Failed while connecting to ");
                    a3.c = e;
                    return erqt.h(a3.a());
                } finally {
                    a.disconnect();
                }
            }
        }, this.e), new emwl() { // from class: dxbh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                emxc emxcVar2 = (emxc) obj;
                boolean z = true;
                if (emxcVar2.g() && emxc.this.equals(emxcVar2)) {
                    z = false;
                }
                if (emxcVar2 != null) {
                    return new dxap(z, emxcVar2);
                }
                throw new NullPointerException("Null freshETagOptional");
            }
        }, erpp.a);
    }

    @Override // defpackage.dxbd
    public final ListenableFuture b(final dxbc dxbcVar) {
        dxat dxatVar = (dxat) dxbcVar;
        final String lastPathSegment = dxatVar.a.getLastPathSegment();
        lastPathSegment.getClass();
        try {
            final File parentFile = efcd.a(((dxat) dxbcVar).a, new efbt(this.c)).getParentFile();
            parentFile.getClass();
            try {
                final efdi efdiVar = (efdi) this.d.c(((dxat) dxbcVar).a, new efdj());
                return kfg.a(new kfd() { // from class: dxbj
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        dxbf dxbfVar = new dxbf(kfbVar);
                        dxat dxatVar2 = (dxat) dxbcVar;
                        final dxbk dxbkVar = dxbk.this;
                        eaez eaezVar = dxbkVar.a;
                        String str = dxatVar2.b;
                        efdi efdiVar2 = efdiVar;
                        final File file = parentFile;
                        final String str2 = lastPathSegment;
                        eaeo eaeoVar = new eaeo(eaezVar, str, file, str2, dxbfVar, efdiVar2);
                        eaeoVar.i = null;
                        if (dxba.c == dxatVar2.c) {
                            eaeoVar.g(eaen.WIFI_OR_CELLULAR);
                        } else {
                            eaeoVar.g(eaen.WIFI_ONLY);
                        }
                        int i = dxatVar2.d;
                        if (i > 0) {
                            eaeoVar.j = i;
                        }
                        engw engwVar = dxatVar2.e;
                        for (int i2 = 0; i2 < ((enou) engwVar).c; i2++) {
                            Pair pair = (Pair) engwVar.get(i2);
                            eaeoVar.e.t((String) pair.first, (String) pair.second);
                        }
                        kfbVar.a(new Runnable() { // from class: dxbg
                            @Override // java.lang.Runnable
                            public final void run() {
                                dxbk.this.a.d(file, str2);
                            }
                        }, erpp.a);
                        boolean l = eaeoVar.d.l(eaeoVar);
                        dxth.d("%s: Data download scheduled for file: %s enqueued: %s", "OffroadFileDownloader", dxatVar2.b, Boolean.valueOf(l));
                        if (!l) {
                            dwql a = dwqn.a();
                            a.a = dwqm.DUPLICATE_REQUEST_ERROR;
                            a.b = "Duplicate request for: ".concat(dxatVar2.b);
                            kfbVar.c(a.a());
                        }
                        return "Data download scheduled for file ".concat(dxatVar2.b);
                    }
                });
            } catch (IOException e) {
                dxth.k(e, "%s: Unable to create mobstore ResponseWriter for file %s", "OffroadFileDownloader", dxatVar.a);
                dwql a = dwqn.a();
                a.a = dwqm.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                a.c = e;
                return erqt.h(a.a());
            }
        } catch (IOException e2) {
            dxth.h("%s: The file uri is malformed, uri = %s", "OffroadFileDownloader", dxatVar.a);
            dwql a2 = dwqn.a();
            a2.a = dwqm.MALFORMED_FILE_URI_ERROR;
            a2.c = e2;
            return erqt.h(a2.a());
        }
    }
}
