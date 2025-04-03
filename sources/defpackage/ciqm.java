package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ciqm extends cims {
    private final ciql a;

    public ciqm(cine cineVar, ciql ciqlVar, cinj cinjVar, String str, cipf cipfVar) {
        super(cineVar.b(cinjVar, str, cipfVar));
        this.a = new ciqk(ciqlVar);
    }

    @Override // defpackage.cims, defpackage.cink
    public final Notification b() {
        return this.a.a(o());
    }
}
