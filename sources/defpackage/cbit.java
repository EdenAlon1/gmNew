package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbit {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2");
    public final Context b;
    public final cbil c;
    public final cbjo d;
    public final ffbr e;
    final Map f = new HashMap();
    private final cbiw g;
    private final ctax h;
    private final errl i;

    public cbit(Context context, cbil cbilVar, cbjo cbjoVar, ffbr ffbrVar, cbiw cbiwVar, ctax ctaxVar, errl errlVar) {
        this.b = context;
        this.c = cbilVar;
        this.d = cbjoVar;
        this.e = ffbrVar;
        this.g = cbiwVar;
        this.h = ctaxVar;
        this.i = errlVar;
    }

    public static boolean d(ContentType contentType) {
        return le.o(contentType.toString(), false);
    }

    public static boolean e(ContentType contentType) {
        return le.A(contentType.toString());
    }

    public final elfl a(Uri uri, long j, ContentType contentType) {
        return b(uri, j, contentType, null);
    }

    public final elfl b(Uri uri, long j, ContentType contentType, String str) {
        int i;
        ContentType contentType2;
        try {
            long a2 = this.h.a(j);
            if (contentType == null) {
                String q = csuu.q(this.b, uri);
                if (q == null) {
                    contentType2 = null;
                    i = 4;
                } else {
                    ContentType e = awuq.e(q);
                    ensk h = a.h();
                    h.Y(ente.a, "BugleResizing");
                    i = 4;
                    try {
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "resolveContentType", 205, "ResizingManagerV2.java")).D("Original content type: %s. Resolved content type: %s", q, e);
                        contentType2 = e;
                    } catch (eygu e2) {
                        e = e2;
                        ensk j2 = a.j();
                        j2.Y(ente.a, "BugleResizing");
                        ((enrr) ((enrr) ((enrr) j2).g(e)).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "resize", 118, "ResizingManagerV2.java")).t("Unable to get image compression long dimension from setting for input uri: %s", uri);
                        cbja cbjaVar = (cbja) cbjc.a.createBuilder();
                        cbjaVar.copyOnWrite();
                        ((cbjc) cbjaVar.instance).c = cbjb.a(i);
                        return elfo.e((cbjc) cbjaVar.build());
                    }
                }
            } else {
                i = 4;
                contentType2 = contentType;
            }
            if (contentType2 == null || !(d(contentType2) || e(contentType2))) {
                ensk j3 = a.j();
                j3.Y(ente.a, "BugleResizing");
                ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "resize", 134, "ResizingManagerV2.java")).t("Input uri %s is not resizable", uri);
                ((akzt) this.e.b()).c("Bugle.Media.Attachment.Resize.UnsupportedType.Count");
                cbja cbjaVar2 = (cbja) cbjc.a.createBuilder();
                cbjaVar2.copyOnWrite();
                ((cbjc) cbjaVar2.instance).c = cbjb.a(i);
                return elfo.e((cbjc) cbjaVar2.build());
            }
            cbix cbixVar = (cbix) cbiy.a.createBuilder();
            String uri2 = uri.toString();
            cbixVar.copyOnWrite();
            cbiy cbiyVar = (cbiy) cbixVar.instance;
            uri2.getClass();
            cbiyVar.b |= 1;
            cbiyVar.c = uri2;
            cbixVar.copyOnWrite();
            cbiy cbiyVar2 = (cbiy) cbixVar.instance;
            cbiyVar2.b |= 2;
            cbiyVar2.d = j;
            cbixVar.copyOnWrite();
            cbiy cbiyVar3 = (cbiy) cbixVar.instance;
            cbiyVar3.b |= 4;
            cbiyVar3.e = a2;
            if (str != null) {
                cbixVar.copyOnWrite();
                cbiy cbiyVar4 = (cbiy) cbixVar.instance;
                cbiyVar4.b |= 8;
                cbiyVar4.f = str;
            }
            cbiy cbiyVar5 = (cbiy) cbixVar.build();
            if (this.f.containsKey(cbiyVar5)) {
                ((akzt) this.e.b()).c("Bugle.Media.Attachment.ResizeV2.Retrieved.Count");
            } else {
                ((akzt) this.e.b()).c("Bugle.Media.Attachment.ResizeV2.Started.Count");
                Map map = this.f;
                cbiw cbiwVar = this.g;
                cbiu cbiuVar = (cbiu) cbiv.a.createBuilder();
                cbiuVar.copyOnWrite();
                cbiv cbivVar = (cbiv) cbiuVar.instance;
                cbiyVar5.getClass();
                cbivVar.c = cbiyVar5;
                cbivVar.b |= 1;
                awup a3 = awuq.a(contentType2);
                cbiuVar.copyOnWrite();
                cbiv cbivVar2 = (cbiv) cbiuVar.instance;
                cbivVar2.d = a3;
                cbivVar2.b |= 2;
                map.put(cbiyVar5, ((cevh) cbiwVar.a.b()).a(ceyr.g("resizing", (cbiv) cbiuVar.build())).a().h(new emwl() { // from class: cbis
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Bundle a4;
                        ceyt ceytVar = (ceyt) obj;
                        int i2 = 4;
                        if (!ceytVar.e() || (a4 = ceytVar.a()) == null) {
                            cbja cbjaVar3 = (cbja) cbjc.a.createBuilder();
                            cbjaVar3.copyOnWrite();
                            ((cbjc) cbjaVar3.instance).c = cbjb.a(4);
                            return (cbjc) cbjaVar3.build();
                        }
                        char[] charArray = a4.getCharArray("output_uri");
                        char[] charArray2 = a4.getCharArray("content_type");
                        awup b = charArray2 != null ? awuq.b(String.valueOf(charArray2)) : awuq.b("*/*");
                        ensk h2 = cbit.a.h();
                        h2.Y(ente.a, "BugleResizing");
                        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "queueAndGetResizingResultFuture", 262, "ResizingManagerV2.java")).D("Original content type: %s. Resolved content type: %s", charArray2, b);
                        cbja cbjaVar4 = (cbja) cbjc.a.createBuilder();
                        String valueOf = charArray != null ? String.valueOf(charArray) : "";
                        cbjaVar4.copyOnWrite();
                        cbjc cbjcVar = (cbjc) cbjaVar4.instance;
                        valueOf.getClass();
                        cbjcVar.d = valueOf;
                        int i3 = a4.getInt("status");
                        if (i3 == 1) {
                            i2 = 3;
                        } else if (i3 != 2) {
                            i2 = i3 != 3 ? i3 != 4 ? 2 : 6 : 5;
                        }
                        cbjaVar4.copyOnWrite();
                        ((cbjc) cbjaVar4.instance).c = cbjb.a(i2);
                        cbjaVar4.copyOnWrite();
                        cbjc cbjcVar2 = (cbjc) cbjaVar4.instance;
                        cbjcVar2.e = b;
                        cbjcVar2.b |= 1;
                        return (cbjc) cbjaVar4.build();
                    }
                }, erpp.a));
            }
            return (elfl) this.f.get(cbiyVar5);
        } catch (eygu e3) {
            e = e3;
            i = 4;
        }
    }

    public final void c(Uri uri, long j) {
        try {
            long a2 = this.h.a(j);
            cbix cbixVar = (cbix) cbiy.a.createBuilder();
            String uri2 = uri.toString();
            cbixVar.copyOnWrite();
            cbiy cbiyVar = (cbiy) cbixVar.instance;
            uri2.getClass();
            cbiyVar.b |= 1;
            cbiyVar.c = uri2;
            cbixVar.copyOnWrite();
            cbiy cbiyVar2 = (cbiy) cbixVar.instance;
            cbiyVar2.b |= 2;
            cbiyVar2.d = j;
            cbixVar.copyOnWrite();
            cbiy cbiyVar3 = (cbiy) cbixVar.instance;
            cbiyVar3.b |= 4;
            cbiyVar3.e = a2;
            cbiy cbiyVar4 = (cbiy) cbixVar.build();
            if (this.f.containsKey(cbiyVar4)) {
                ((akzt) this.e.b()).c("Bugle.Media.Attachment.ResizeV2.Cancelled.Count");
                elfl elflVar = (elfl) this.f.remove(cbiyVar4);
                if (elflVar == null || elflVar.cancel(false)) {
                    return;
                }
                elflVar.i(new eroh() { // from class: cbir
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        cbjc cbjcVar = (cbjc) obj;
                        int b = cbjb.b(cbjcVar.c);
                        if (b != 0 && b == 3) {
                            cbit cbitVar = cbit.this;
                            cbgi.j(cbitVar.b, Uri.parse(cbjcVar.d));
                        }
                        return erre.a;
                    }
                }, this.i);
            }
        } catch (eygu e) {
            ensk j2 = a.j();
            j2.Y(ente.a, "BugleResizing");
            ((enrr) ((enrr) ((enrr) j2).g(e)).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/ResizingManagerV2", "cancel", 163, "ResizingManagerV2.java")).t("Unable to get image compression long dimension from setting for input uri: %s", uri);
        }
    }
}
