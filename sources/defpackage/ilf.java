package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ilf extends ffkk implements ffji {
    final /* synthetic */ ilh a;
    final /* synthetic */ ili b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilf(ilh ilhVar, ili iliVar) {
        super(1);
        this.a = ilhVar;
        this.b = iliVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MotionEvent motionEvent = (MotionEvent) obj;
        if (motionEvent.getActionMasked() == 0) {
            this.a.c = true != ((Boolean) this.b.d().invoke(motionEvent)).booleanValue() ? 3 : 2;
        } else {
            this.b.d().invoke(motionEvent);
        }
        return ffcu.a;
    }
}
