package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crbc implements crbb {
    private final ffbr a;
    private final ffbr b;

    public crbc(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    @Override // defpackage.crbb
    public final crbv a(MessageCoreData messageCoreData, engw engwVar) {
        MessagePartCoreData G = messageCoreData.G();
        if (G == null) {
            throw new IllegalArgumentException("Unable to prepare file for uploading since the message does not contain an attachment.");
        }
        Uri t = G.t();
        String e = le.e(G.V());
        if (t == null) {
            throw new IllegalArgumentException("Content uri in FileUploadInfo should be valid.");
        }
        entd entdVar = crbv.h;
        crbf crbfVar = new crbf();
        crbfVar.e(t);
        crbfVar.d(e == null ? null : ContentType.e(e));
        crbfVar.f(crba.a(G));
        if (G.bo() || G.bD()) {
            byte[] a = ((crbd) this.a.b()).a(G, ((crbe) this.b.b()).a(engwVar));
            if (a != null) {
                crbfVar.h(ContentType.e("image/jpeg"));
                crbfVar.i(eyee.x(a));
            }
        } else if (G.ba()) {
            crbfVar.c(Duration.ofMillis(G.k()));
        }
        return crbfVar.j();
    }
}
