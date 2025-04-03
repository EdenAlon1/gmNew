package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kna extends knb {
    public CharSequence a;
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private knr d;
    private Boolean e;

    public kna() {
    }

    @Override // defpackage.knb
    protected final String a() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // defpackage.knb
    public final void b(kls klsVar) {
        kml kmlVar = this.g;
        boolean z = false;
        if (kmlVar == null || kmlVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.e != null) {
            Boolean bool = this.e;
            if (bool != null) {
                z = bool.booleanValue();
            }
        } else if (this.a != null) {
            z = true;
        }
        h(z);
        Notification.MessagingStyle a = Build.VERSION.SDK_INT >= 28 ? kmw.a(knp.a(this.d)) : kmu.b(this.d.a);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            kmu.a(a, ((kmz) it.next()).a());
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            kmv.a(a, ((kmz) it2.next()).a());
        }
        if (this.e.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            kmu.c(a, this.a);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            kmw.b(a, this.e.booleanValue());
        }
        a.setBuilder(((kni) klsVar).b);
    }

    @Override // defpackage.knb
    protected final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    @Override // defpackage.knb
    protected final void d(Bundle bundle) {
        super.d(bundle);
        this.b.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.d = knr.b(bundle.getBundle("android.messagingStyleUser"));
        } else {
            knq knqVar = new knq();
            knqVar.a = bundle.getString("android.selfDisplayName");
            this.d = new knr(knqVar);
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.a = charSequence;
        if (charSequence == null) {
            this.a = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            this.b.addAll(kmz.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.c.addAll(kmz.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.e = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public final void g(kmz kmzVar) {
        if (kmzVar != null) {
            this.b.add(kmzVar);
            if (this.b.size() > 25) {
                this.b.remove(0);
            }
        }
    }

    public final void h(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.knb
    public final void j(Bundle bundle) {
        super.j(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.d.a);
        bundle.putBundle("android.messagingStyleUser", this.d.a());
        bundle.putCharSequence("android.hiddenConversationTitle", this.a);
        if (this.a != null && this.e.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.a);
        }
        if (!this.b.isEmpty()) {
            bundle.putParcelableArray("android.messages", kmz.c(this.b));
        }
        if (!this.c.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", kmz.c(this.c));
        }
        Boolean bool = this.e;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    public kna(knr knrVar) {
        if (!TextUtils.isEmpty(knrVar.a)) {
            this.d = knrVar;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
