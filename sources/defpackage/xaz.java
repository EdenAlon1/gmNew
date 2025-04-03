package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xaz implements wqq {
    public final ffbr a;
    public final ffbr b;
    public final ffxx c;
    private final Set d;

    public xaz(Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        context.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        String string = context.getString(R.string.rbm_verification_icon_content_description);
        string.getClass();
        this.c = new ffyg(new dlsr(string, dmzz.ej, false, false, true, false, null, false, null, new ffix() { // from class: xay
            @Override // defpackage.ffix
            public final Object invoke() {
                xaz xazVar = xaz.this;
                if (((Optional) xazVar.a.b()).isPresent()) {
                    ((aigz) xazVar.b.b()).h(new aile(((cjdk) ((Optional) xazVar.a.b()).get()).b()));
                }
                return ffcu.a;
            }
        }, 996));
        this.d = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.c;
    }
}
