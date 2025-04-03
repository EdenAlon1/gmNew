package defpackage;

import android.os.Looper;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jby extends ffkk implements ffix {
    public static final jby a = new jby();

    public jby() {
        super(0);
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Choreographer choreographer;
        if (jcd.a()) {
            choreographer = Choreographer.getInstance();
        } else {
            ffsd ffsdVar = fftc.a;
            choreographer = (Choreographer) ffqz.a(fghh.a, new jbx(null));
        }
        jcc jccVar = new jcc(choreographer, kqv.a(Looper.getMainLooper()));
        return jccVar.plus(jccVar.j);
    }
}
