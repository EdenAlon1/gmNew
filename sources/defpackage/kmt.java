package defpackage;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmt extends knb {
    private final ArrayList a = new ArrayList();

    public kmt() {
    }

    @Override // defpackage.knb
    protected final String a() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // defpackage.knb
    public final void b(kls klsVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((kni) klsVar).b).setBigContentTitle(this.h);
        if (this.j) {
            bigContentTitle.setSummaryText(this.i);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bigContentTitle.addLine((CharSequence) arrayList.get(i));
        }
    }

    @Override // defpackage.knb
    protected final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.textLines");
    }

    @Override // defpackage.knb
    protected final void d(Bundle bundle) {
        super.d(bundle);
        this.a.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(this.a, bundle.getCharSequenceArray("android.textLines"));
        }
    }

    public final void g(CharSequence charSequence) {
        if (charSequence != null) {
            this.a.add(kml.c(charSequence));
        }
    }

    public kmt(kml kmlVar) {
        i(kmlVar);
    }
}
