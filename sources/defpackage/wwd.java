package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwd implements wqq {
    public final aigz a;
    public final ffxx b;
    private final Context c;
    private final Set d;

    public wwd(Context context, aigz aigzVar) {
        context.getClass();
        aigzVar.getClass();
        this.c = context;
        this.a = aigzVar;
        String string = context.getString(R.string.go_back);
        string.getClass();
        this.b = new ffyg(new dlsr(string, null, false, false, false, false, null, false, null, new ffix() { // from class: wwc
            @Override // defpackage.ffix
            public final Object invoke() {
                wwd.this.a.h(aijc.a);
                return ffcu.a;
            }
        }, 1022));
        this.d = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.b;
    }
}
