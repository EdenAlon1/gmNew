package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_BasicTextMessage;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eidx extends eiey {
    private String a;

    @Override // defpackage.eiey
    public final BasicTextMessage a() {
        String str = this.a;
        if (str != null) {
            return new AutoValue_BasicTextMessage(str);
        }
        throw new IllegalStateException("Missing required properties: content");
    }

    @Override // defpackage.eiey
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null content");
        }
        this.a = str;
    }
}
