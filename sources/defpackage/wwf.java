package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwf implements wqq {
    private final ffxx a;
    private final Set b;

    public wwf(Context context, final aigz aigzVar) {
        context.getClass();
        aigzVar.getClass();
        String string = context.getString(R.string.action_help);
        string.getClass();
        Object e = adwg.a.e();
        e.getClass();
        this.a = new ffyg(new dlsr(string, null, false, true, ((Boolean) e).booleanValue(), false, null, false, null, new ffix() { // from class: wwe
            @Override // defpackage.ffix
            public final Object invoke() {
                aigz.this.h(new aikx(null, null, 3));
                return ffcu.a;
            }
        }, 998));
        this.b = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.b;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.a;
    }
}
