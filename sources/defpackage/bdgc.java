package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bdgc {
    public final bdgd A() {
        if (e()) {
            if (c().isEmpty()) {
                ((ensz) ((ensz) bdgd.w.j()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/GetOrCreateConversationParameters$Builder", "build", 232, "GetOrCreateConversationParameters.java")).q("Attempting to create a RCS group conversation without RCS group ID.");
            }
            if (d().isEmpty()) {
                ((ensz) ((ensz) bdgd.w.j()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/GetOrCreateConversationParameters$Builder", "build", 237, "GetOrCreateConversationParameters.java")).q("Attempting to create a RCS group conversation without RCS group self MSISDN.");
            }
        } else {
            b().isPresent();
        }
        return a();
    }

    public abstract bdgd a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract boolean e();

    public abstract void f(byyt byytVar);

    public abstract void g(amer amerVar);

    public abstract void h(String str);

    public abstract void i(Optional optional);

    public abstract void j(azcr azcrVar);

    public abstract void k(boolean z);

    public abstract void l(boolean z);

    public abstract void m(int i);

    public abstract void n(boolean z);

    public abstract void o(boolean z);

    public abstract void p(List list);

    public abstract void q(Optional optional);

    public abstract void r(String str);

    public abstract void s(Optional optional);

    public abstract void t(Optional optional);

    public abstract void u(long j);

    public abstract void v(int i);

    public abstract void w(SelfIdentityId selfIdentityId);

    public abstract void x(boolean z);

    public abstract void y();

    public abstract void z(cpxu cpxuVar);
}
