package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.worker.cloudstore.media.CmsTelephonyMediaRestoreWorker;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdpd {
    private static final cskc c = cskc.g("BugleCms", "CmsTelephonyMediaRestoreWorkerAdapter");
    public final cdmq a;
    public final babm b;

    public cdpd(cdmq cdmqVar, babm babmVar) {
        this.a = cdmqVar;
        this.b = babmVar;
    }

    public static void a(Context context, poj pojVar, String str, Uri uri, int i) {
        csjb c2 = c.c();
        c2.I("Enqueue media restore work");
        c2.A("Part id", str);
        c2.r();
        String valueOf = String.valueOf(i);
        pon ponVar = new pon();
        ponVar.e("part_id_key", str);
        ponVar.e("parent_message_uri_key", uri.toString());
        ponVar.g("account_id", i);
        pot a = ponVar.a();
        ppv ppvVar = new ppv(CmsTelephonyMediaRestoreWorker.class);
        ppvVar.j(a);
        ppvVar.d("MediaRestore");
        ppvVar.d(valueOf);
        ppvVar.d(ppu.a(pojVar.j));
        ppvVar.g(pojVar);
        pqr.a(context).g(a.z(i, str, "MediaRestore,", ","), ppa.REPLACE, (ppw) ppvVar.b());
    }
}
