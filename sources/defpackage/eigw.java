package defpackage;

import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eigw {
    public abstract eigx a();

    public abstract MessageReceipt b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract void e(eyee eyeeVar);

    public abstract void f(Optional optional);

    public abstract void g(String str);

    public abstract void h(String str);

    public abstract void i(Instant instant);

    public abstract void j(eigx eigxVar);

    public final MessageReceipt k() {
        if (d().isPresent()) {
            eigx a = a();
            if (!a.g.contains(d().get())) {
                j(eigx.UNKNOWN);
                h(a().f);
            }
        } else {
            h(a().f);
        }
        if (c().isPresent() && ((eyee) c().get()).H()) {
            f(Optional.empty());
        }
        return b();
    }
}
