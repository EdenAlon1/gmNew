package defpackage;

import android.app.Activity;
import android.content.Intent;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unl {
    public final /* synthetic */ uns a;

    public unl(final Activity activity, unt untVar, final Optional optional, ffix ffixVar, final Supplier supplier) {
        this.a = untVar.a(epts.LOCATION, new ael(), new ffix() { // from class: uni
            @Override // defpackage.ffix
            public final Object invoke() {
                Object obj;
                Intent intent = new Intent(activity, (Class<?>) optional.get());
                obj = supplier.get();
                intent.putExtra("message_type", ((Number) ((ugx) obj).a.invoke(true)).intValue());
                return intent;
            }
        }, new unk(activity, ffixVar));
    }
}
