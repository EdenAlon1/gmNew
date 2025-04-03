package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbgj {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/actionhelpers/DownloadedMmsRecipientsHelper");
    public final coxk b;
    public final ffbr c;

    public bbgj(coxk coxkVar, ffbr ffbrVar) {
        coxkVar.getClass();
        ffbrVar.getClass();
        this.b = coxkVar;
        this.c = ffbrVar;
    }

    public final enip a(Uri uri) {
        uri.getClass();
        enip e = this.b.v(uri).e();
        e.getClass();
        if (!e.isEmpty()) {
            return e;
        }
        ensk j = a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) j.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/DownloadedMmsRecipientsHelper", "getMessageRecipientsNotIncludingSelf", 63, "DownloadedMmsRecipientsHelper.kt")).q("Received MMS without any recipients, using unknown.");
        return new enpx("ʼUNKNOWN_SENDER!ʼ");
    }

    public final enip b(Uri uri) {
        uri.getClass();
        enip e = this.b.v(uri).e();
        e.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(e, 10));
        Iterator<E> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(((aolr) this.c.b()).n((String) it.next()));
        }
        enip f = engq.f(arrayList);
        if (!f.isEmpty()) {
            return f;
        }
        ensk j = a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) j.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/DownloadedMmsRecipientsHelper", "getMessageRecipientsNotIncludingSelfMi", 85, "DownloadedMmsRecipientsHelper.kt")).q("Received MMS without any recipients, using unknown.");
        return new enpx(((aolr) this.c.b()).f());
    }
}
