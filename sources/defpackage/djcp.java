package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djcp extends dkji {
    private static final dktn a = new dktn("MessageReceivedListener");
    private static final enip b = enip.r("application/conference-info+xml", GroupManagementContentType.CONTENT_TYPE);
    private final dkkj c;
    private final errl d;
    private final djct e;

    public djcp(errl errlVar, djct djctVar, dkkj dkkjVar) {
        this.d = errlVar;
        this.c = dkkjVar;
        this.e = djctVar;
    }

    private static final boolean d(dkjt dkjtVar) {
        String str = dkjtVar.h;
        if ("message/cpim".equals(str)) {
            try {
                Optional f = ((eidf) eidw.a(dkjtVar.f)).c.f();
                Optional of = f.isPresent() ? Optional.of(ContentType.e((String) f.get())) : Optional.empty();
                if (of.isPresent()) {
                    str = ((ContentType) of.get()).toString();
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("CPIM message could not be parsed.", e);
            }
        }
        return b.contains(str);
    }

    @Override // defpackage.dkji, defpackage.dkjz
    public final void c(dkjt dkjtVar) {
        if (d(dkjtVar)) {
            return;
        }
        if (djac.d() && d(dkjtVar)) {
            return;
        }
        djbf djbfVar = new djbf();
        djbfVar.b(dkjtVar);
        djbfVar.c(this.c);
        ListenableFuture a2 = this.e.a(djbfVar.a());
        dkty.l(a.b("handleReceiveMessagebbugle"), "handle received message %s", dkjtVar.k);
        erqt.r(a2, new djco(), this.d);
    }
}
