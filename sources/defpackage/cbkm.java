package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbkm implements cbkd {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader");
    public final errl b;
    public final cbkl c;
    public final dtuu d;
    public final askf e;
    private final cbln f;
    private final errl g;
    private final errl h;
    private final cbkc i;

    public cbkm(cbkc cbkcVar, cbln cblnVar, errl errlVar, errl errlVar2, errl errlVar3, cbkl cbklVar, dtuu dtuuVar, askf askfVar) {
        this.i = cbkcVar;
        this.f = cblnVar;
        this.g = errlVar;
        this.h = errlVar2;
        this.b = errlVar3;
        this.c = cbklVar;
        this.d = dtuuVar;
        this.e = askfVar;
    }

    private final Set c(ConversationIdType conversationIdType, BugleMessageId bugleMessageId, cblo[] cbloVarArr) {
        Set<cblo> j = enpw.j();
        Collections.addAll(j, cbloVarArr);
        String valueOf = String.valueOf(bugleMessageId.b());
        for (cblo cbloVar : j) {
            if ((cbloVar instanceof cblm) && ((cblm) cbloVar).d.equals(valueOf)) {
                return j;
            }
        }
        enrr enrrVar = (enrr) a.h();
        enrrVar.Y(csux.p, conversationIdType);
        enrrVar.Y(csux.c, bugleMessageId);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "withDatabaseHandler", 294, "RichCardMediaDownloadServiceDownloader.java")).q("Adding database handler for downloaded media part.");
        cbln cblnVar = this.f;
        MessageIdType c = bugleMessageId.c();
        errl errlVar = (errl) cblnVar.a.b();
        errlVar.getClass();
        dtuu dtuuVar = (dtuu) cblnVar.c.b();
        dtuuVar.getClass();
        cblf cblfVar = (cblf) cblnVar.d.b();
        cblfVar.getClass();
        askf askfVar = (askf) cblnVar.e.b();
        askfVar.getClass();
        ((Context) cblnVar.f.b()).getClass();
        ((cbjx) cblnVar.g.b()).getClass();
        ((Map) cblnVar.h.b()).getClass();
        conversationIdType.getClass();
        c.getClass();
        valueOf.getClass();
        ((auod) cblnVar.i.b()).getClass();
        j.add(new cblm(errlVar, cblnVar.b, dtuuVar, cblfVar, askfVar, conversationIdType, c, valueOf));
        return j;
    }

    public final void a(Uri uri) {
        enrr enrrVar = (enrr) a.h();
        enrrVar.Y(new ensn(VCardConstants.PROPERTY_URL, Uri.class, false, false), uri);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "cancelDownload", 215, "RichCardMediaDownloadServiceDownloader.java")).q("Cancelling a download.");
        cbkc cbkcVar = this.i;
        String str = (String) cbkcVar.c.a.remove(uri);
        if (str != null) {
            Uri fromFile = Uri.fromFile(cbkcVar.f.a(cbkcVar.e, str));
            csjb c = cbkc.a.c();
            c.I("Cancelling download");
            c.N(VCardConstants.PROPERTY_URL, uri);
            c.N("file", fromFile);
            c.r();
            cbkcVar.b.b(fromFile.toString());
        } else {
            csjb c2 = cbkc.a.c();
            c2.I("No download to cancel");
            c2.N(VCardConstants.PROPERTY_URL, uri);
            c2.r();
        }
        csjb c3 = cbkc.a.c();
        c3.y("remainingDownloads", cbkcVar.c.a.size());
        c3.r();
        elfr.l(elfo.e(Boolean.valueOf(str != null)), new cbkj(this, uri), this.g);
    }

    public final void b(ConversationIdType conversationIdType, BugleMessageId bugleMessageId, final Uri uri, long j, cblo... cbloVarArr) {
        Uri uri2;
        String str;
        dxba dxbaVar;
        engw engwVar;
        String str2;
        eydq eydqVar;
        cbkt cbktVar = (cbkt) this.c.a.get(uri);
        if (cbktVar != null) {
            enrr enrrVar = (enrr) a.h();
            enrrVar.Y(new ensn(VCardConstants.PROPERTY_URL, Uri.class, false, false), uri);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "downloadMediaAndUpdateMessagePart", 124, "RichCardMediaDownloadServiceDownloader.java")).q("Adding callback to existing download.");
            cbktVar.b(c(conversationIdType, bugleMessageId, cbloVarArr));
            return;
        }
        cbkt cbktVar2 = new cbkt(this.h, this.g);
        cbkt cbktVar3 = (cbkt) this.c.a.putIfAbsent(uri, cbktVar2);
        if (cbktVar3 != null) {
            enrr enrrVar2 = (enrr) a.h();
            enrrVar2.Y(new ensn(VCardConstants.PROPERTY_URL, Uri.class, false, false), uri);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "downloadMediaAndUpdateMessagePart", 140, "RichCardMediaDownloadServiceDownloader.java")).q("Concurrent addition, adding callback to existing set of callbacks.");
            cbktVar3.b(c(conversationIdType, bugleMessageId, cbloVarArr));
            return;
        }
        enrr enrrVar3 = (enrr) a.h();
        enrrVar3.Y(new ensn(VCardConstants.PROPERTY_URL, Uri.class, false, false), uri);
        enrrVar3.Y(new ensn("numberOfAttachedCallbacks", Integer.class, false, false), Integer.valueOf(cbktVar2.b.size()));
        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/richcard/RichCardMediaDownloadServiceDownloader", "downloadMediaAndUpdateMessagePart", 152, "RichCardMediaDownloadServiceDownloader.java")).q("Creating a new ongoing download.");
        cbktVar2.b(c(conversationIdType, bugleMessageId, cbloVarArr));
        cbkc cbkcVar = this.i;
        int i = (int) j;
        String concat = cbkcVar.f.b.concat(String.valueOf(String.valueOf(UUID.randomUUID())));
        String str3 = (String) cbkcVar.c.a.putIfAbsent(uri, concat);
        if (str3 != null) {
            concat = str3;
        }
        Uri.Builder builder = new Uri.Builder();
        cbjx cbjxVar = cbkcVar.f;
        final Uri build = builder.authority(cbjxVar.a).scheme("content").appendPath(concat).build();
        File a2 = cbjxVar.a(cbkcVar.e, concat);
        csjb c = cbkc.a.c();
        c.I("Starting MDD download for");
        c.N(VCardConstants.PROPERTY_URL, uri);
        c.N("destinationFile", a2);
        c.A("destinationUri", build);
        c.y("expectedSize", i);
        c.y("remainingDownloads", cbkcVar.c.a.size());
        c.r();
        csjb c2 = cbkc.a.c();
        c2.I("Starting download...");
        c2.N(VCardConstants.PROPERTY_URL, uri);
        c2.r();
        try {
            for (final cblo cbloVar : cbktVar2.b) {
                cbktVar2.c(new Runnable() { // from class: cbkq
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            cblo.this.d(uri.toString());
                        } catch (RuntimeException e) {
                            cbkt.a.s("Error while calling #onStart", e);
                        }
                    }
                });
            }
        } catch (RuntimeException e) {
            csjb b = cbkc.a.b();
            b.I("Callback error: #onStart");
            b.s(e);
        }
        cbka cbkaVar = new cbka(cbkcVar, cbktVar2, uri, build, i);
        dxvy dxvyVar = new dxvy();
        dxvyVar.e = -1;
        dxvyVar.m = (byte) (dxvyVar.m | 1);
        int i2 = engw.d;
        engw engwVar2 = enou.a;
        if (engwVar2 == null) {
            throw new NullPointerException("Null extraHttpHeaders");
        }
        dxvyVar.f = engwVar2;
        dxvyVar.a(0);
        dxvyVar.b(true);
        eydq eydqVar2 = eydq.a;
        if (eydqVar2 == null) {
            throw new NullPointerException("Null customDownloaderMetadata");
        }
        dxvyVar.l = eydqVar2;
        Uri fromFile = Uri.fromFile(a2);
        if (fromFile == null) {
            throw new NullPointerException("Null destinationFileUri");
        }
        dxvyVar.a = fromFile;
        String uri3 = uri.toString();
        if (uri3 == null) {
            throw new NullPointerException("Null urlToDownload");
        }
        dxvyVar.b = uri3;
        dxvyVar.a(i);
        dxba dxbaVar2 = dxba.c;
        if (dxbaVar2 == null) {
            throw new NullPointerException("Null downloadConstraints");
        }
        dxvyVar.c = dxbaVar2;
        dxvyVar.b(false);
        dxvyVar.d = emxc.j(cbkaVar);
        String str4 = dxvyVar.h;
        if (!(str4 == null ? emux.a : emxc.j(str4)).g()) {
            String str5 = dxvyVar.b;
            if (str5 == null) {
                throw new IllegalStateException("Property \"urlToDownload\" has not been set");
            }
            dxvyVar.h = str5;
        }
        if (dxvyVar.m == 7 && (uri2 = dxvyVar.a) != null && (str = dxvyVar.b) != null && (dxbaVar = dxvyVar.c) != null && (engwVar = dxvyVar.f) != null && (str2 = dxvyVar.h) != null && (eydqVar = dxvyVar.l) != null) {
            elfr.l(elfl.g(cbkcVar.b.a(new dxvz(uri2, str, dxbaVar, dxvyVar.d, dxvyVar.e, engwVar, dxvyVar.g, str2, dxvyVar.i, dxvyVar.j, dxvyVar.k, eydqVar))).i(new eroh() { // from class: cbjz
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return elfo.e(build);
                }
            }, cbkcVar.d).f(Exception.class, new eroh() { // from class: cbkh
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    cbkm.this.c.a.remove(uri);
                    return elfo.d((Exception) obj);
                }
            }, this.g).h(new emwl() { // from class: cbki
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Uri uri4 = (Uri) obj;
                    cbkm.this.c.a.remove(uri);
                    return uri4;
                }
            }, this.g), new cbkk(uri), this.g);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (dxvyVar.a == null) {
            sb.append(" destinationFileUri");
        }
        if (dxvyVar.b == null) {
            sb.append(" urlToDownload");
        }
        if (dxvyVar.c == null) {
            sb.append(" downloadConstraints");
        }
        if ((dxvyVar.m & 1) == 0) {
            sb.append(" trafficTag");
        }
        if (dxvyVar.f == null) {
            sb.append(" extraHttpHeaders");
        }
        if ((dxvyVar.m & 2) == 0) {
            sb.append(" fileSizeBytes");
        }
        if (dxvyVar.h == null) {
            sb.append(" notificationContentTitle");
        }
        if ((dxvyVar.m & 4) == 0) {
            sb.append(" showDownloadedNotification");
        }
        if (dxvyVar.l == null) {
            sb.append(" customDownloaderMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
