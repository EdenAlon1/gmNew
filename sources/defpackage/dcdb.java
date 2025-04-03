package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcdb extends cslh {
    final /* synthetic */ Uri a;
    final /* synthetic */ cxqz b;
    final /* synthetic */ dcdc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcdb(dcdc dcdcVar, Uri uri, cxqz cxqzVar) {
        super("Bugle.Async.Compose.PersistMediaToFileTask.Duration");
        this.a = uri;
        this.b = cxqzVar;
        this.c = dcdcVar;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        long j;
        String type = this.b.c.getType();
        dcdc dcdcVar = this.c;
        Context context = dcdcVar.c;
        bcvn bcvnVar = dcdcVar.m;
        Uri uri = this.a;
        String m = csuu.m(context, uri);
        long a = csuu.a(context, uri);
        long a2 = dcdcVar.n.a(bcvnVar.a(), dcdcVar.y());
        bcpw bcpwVar = dcdcVar.o;
        if (bcpwVar != null) {
            bcpwVar.a();
            j = Math.max(0L, a2 - ((bcvr) dcdcVar.o.a()).s());
        } else {
            j = a2;
        }
        boolean z = j == a2;
        String q = csuu.q(dcdcVar.c, uri);
        if (q != null) {
            type = q;
        }
        String b = le.b(type);
        FileContentItem fileContentItem = new FileContentItem(uri, b, m, a);
        if (TextUtils.isEmpty(b)) {
            dcdcVar.p.x(a2, dcdcVar.y());
            dcdcVar.d.f(dcll.a(fileContentItem, dcdc.a), dcdcVar.k());
            dcdcVar.b.r("Cannot discern contentType of file. Unable to attach.");
            return null;
        }
        if (a <= j) {
            return fileContentItem;
        }
        dcdcVar.p.x(a2, dcdcVar.y());
        final bdvi bdviVar = dcdcVar.q;
        final Context context2 = dcdcVar.c;
        final Boolean valueOf = Boolean.valueOf(z);
        final String formatFileSize = Formatter.formatFileSize(dcdcVar.c, a2);
        axos.a(new Runnable() { // from class: bdvf
            @Override // java.lang.Runnable
            public final void run() {
                bdvi.this.b(context2, valueOf, formatFileSize);
            }
        }, dcdcVar.r);
        dcdcVar.d.f(dcll.a(fileContentItem, dcdc.a), dcdcVar.k());
        return null;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        FileContentItem fileContentItem = (FileContentItem) obj;
        if (fileContentItem == null) {
            this.c.z();
            return;
        }
        this.c.z();
        if (!((Boolean) cful.o.e()).booleanValue()) {
            this.c.i.b(fileContentItem, dcdc.a, false);
            return;
        }
        String str = fileContentItem.c;
        ufh m = ufi.m();
        m.b(str);
        m.e(fileContentItem.b);
        m.c(fileContentItem.a);
        m.d(fileContentItem.e);
        this.c.i.a(m.a(), dcdc.a, false);
    }
}
