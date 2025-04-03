package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupEvent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eieh extends eifr {
    public engr a;
    public engw b;

    @Override // defpackage.eifr
    public final GroupEvent a() {
        engr engrVar = this.a;
        if (engrVar != null) {
            this.b = engrVar.g();
        } else if (this.b == null) {
            int i = engw.d;
            this.b = enou.a;
        }
        return new AutoValue_GroupEvent(this.b);
    }
}
