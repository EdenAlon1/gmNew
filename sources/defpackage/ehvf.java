package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.io.File;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehvf extends ehvd {
    final /* synthetic */ ehvg d;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehvf(ehvg ehvgVar, dhri dhriVar, String str) {
        super(ehvgVar, new ehvt("OnRequestInstallCallback"), dhriVar);
        this.d = ehvgVar;
        this.e = str;
    }

    @Override // defpackage.ehvd, com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback
    public final void onRequestInfo(Bundle bundle) {
        super.onRequestInfo(bundle);
        if (ehvg.a(bundle) != 0) {
            this.b.c(new ehvo(ehvg.a(bundle)));
            return;
        }
        dhri dhriVar = this.b;
        ehvg ehvgVar = this.d;
        String str = this.e;
        int i = bundle.getInt("version.code", -1);
        int i2 = bundle.getInt("update.availability");
        int i3 = bundle.getInt("install.status", 0);
        Integer valueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        bundle.getLong("additional.size.required");
        ehvi.a(new File(ehvgVar.e.a.getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        HashMap hashMap = new HashMap();
        hashMap.put("blocking.destructive.intent", ehvg.d(bundle.getIntegerArrayList(ehvp.a("blocking.destructive.intent"))));
        hashMap.put("nonblocking.destructive.intent", ehvg.d(bundle.getIntegerArrayList(ehvp.a("nonblocking.destructive.intent"))));
        hashMap.put("blocking.intent", ehvg.d(bundle.getIntegerArrayList(ehvp.a("blocking.intent"))));
        hashMap.put("nonblocking.intent", ehvg.d(bundle.getIntegerArrayList(ehvp.a("nonblocking.intent"))));
        dhriVar.d(new ehun(str, i, i2, i3, valueOf, pendingIntent, pendingIntent2));
    }
}
