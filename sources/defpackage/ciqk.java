package defpackage;

import android.app.Notification;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ciqk implements ciql {
    final /* synthetic */ ciql a;
    private Supplier b;

    public ciqk(ciql ciqlVar) {
        this.a = ciqlVar;
    }

    @Override // defpackage.ciql
    public final Notification a(String str) {
        if (this.b == null) {
            this.b = new ciqj(this.a.a(str));
        }
        return ((ciqj) this.b).a;
    }
}
