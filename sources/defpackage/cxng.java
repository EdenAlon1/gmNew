package defpackage;

import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxng implements erqj {
    final /* synthetic */ cxnk a;

    public cxng(cxnk cxnkVar) {
        this.a = cxnkVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final cxnk cxnkVar = this.a;
        final String str = (String) obj;
        cxnkVar.s.post(new Runnable() { // from class: cxmn
            @Override // java.lang.Runnable
            public final void run() {
                cxnk cxnkVar2 = cxnk.this;
                String str2 = str;
                if (str2.equals("")) {
                    cxnkVar2.a();
                } else {
                    cxnkVar2.e();
                    ((TextView) cxnkVar2.r.b.findViewById(R.id.tooltip_content)).setText(str2);
                }
            }
        });
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        csjy.h("Bugle", th, "Failed to update media compression notification!");
    }
}
