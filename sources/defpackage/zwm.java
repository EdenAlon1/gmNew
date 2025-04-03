package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwm implements zsq {
    private final Context a;
    private final asnh b;
    private final athc c;

    public zwm(Context context, asnh asnhVar, athc athcVar) {
        context.getClass();
        this.a = context;
        this.b = asnhVar;
        this.c = athcVar;
    }

    @Override // defpackage.zsq
    public final /* bridge */ /* synthetic */ dnoq a(zsu zsuVar) {
        dlwk dlvxVar;
        zwl zwlVar = (zwl) zsuVar;
        String b = zwlVar.a.b();
        b.getClass();
        zwf.a(b);
        if (le.A(b)) {
            String string = this.a.getString(R.string.message_bubble_failure_video);
            string.getClass();
            dlvxVar = new dlwg(string, null, zwlVar.c, 6);
        } else if (le.n(b)) {
            String string2 = this.a.getString(R.string.message_bubble_failure_image);
            string2.getClass();
            dlvxVar = new dlwc(string2, null, zwlVar.c, 6);
        } else {
            String string3 = this.a.getString(R.string.message_bubble_permanent_failure_media);
            string3.getClass();
            dlvxVar = new dlvx(string3, zwlVar.c);
        }
        return new dlzf(dlvxVar, new dlze(this.b.a(), this.c.a()), zwlVar.c, zwlVar.b, (ffix) null, 48);
    }
}
