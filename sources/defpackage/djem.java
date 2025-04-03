package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djem extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;

    public djem(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4) {
        super(fbbfVar2, new fbcd(djem.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
    }

    @Override // defpackage.fbbs
    public final /* synthetic */ ListenableFuture b(Object obj) {
        long length;
        List list = (List) obj;
        eicl eiclVar = (eicl) list.get(0);
        djfv djfvVar = (djfv) list.get(1);
        djgy djgyVar = (djgy) list.get(2);
        djcn djcnVar = (djcn) list.get(3);
        eifn a = eiclVar.a();
        Conversation b = eiclVar.b();
        dkty.d(djel.a, "Sending SLM file message [%s] in new SLM session [%s]", a.f(), b);
        String f = djhf.f(a.b());
        String f2 = a.d().isPresent() ? djhf.f((RcsDestinationId) a.d().get()) : "sip:anonymous@anonymous.invalid";
        String str = (String) djfv.f.get("urn:ietf:params:imdn");
        str.getClass();
        eidn f3 = eido.f();
        f3.g(str, "urn:ietf:params:imdn");
        f3.e("From", new edzj(f).toString());
        f3.e("To", new edzj(f2).toString());
        f3.e("DateTime", djfvVar.h.f().toString());
        f3.f("urn:ietf:params:imdn", "Message-ID", a.f());
        edzf edzfVar = djfvVar.j;
        Uri a2 = a.a().a();
        String scheme = a2.getScheme();
        emxf.b(scheme == null ? false : TextUtils.equals(scheme.trim().toLowerCase(Locale.US), "content"), "expected uri to be a Content Uri");
        Context context = edzfVar.b;
        AssetFileDescriptor a3 = eepn.a(context, a2, "r", edzg.e(a2));
        if (a3 == null) {
            dkty.r(edzf.a, "Failed to open AFD for length of contentUri: %s", dktx.URI.c(a2.toString()));
            length = 0;
        } else {
            length = a3.getLength();
            a3.close();
        }
        edzd edzdVar = new edzd(context, a2, length);
        eidq d = eidr.d();
        d.d(edzdVar);
        d.f(fhpi.a, a.a().b().toString());
        d.f(fhpi.c, "attachment");
        d.f("Content-Length", String.valueOf(edzdVar.a));
        ((eide) f3).a = d.e();
        eido a4 = f3.a();
        String f4 = djhf.f((RcsDestinationId) (a.d().isPresent() ? a.d().get() : b.a()));
        String f5 = djhf.f(a.b());
        dkjt dkjtVar = new dkjt(dkjs.CPIM_MESSAGE, 2);
        dkjtVar.f(djfv.e.toString(), a4);
        dkjtVar.b = f4;
        dkjtVar.c = f5;
        dkjtVar.k = a.f();
        dkjtVar.j = djfvVar.h.f().toEpochMilli();
        dkjtVar.r = false;
        return djcnVar.a(b, dkjtVar, djgyVar.createOutgoingSlmSession(djhf.f(b.a()))).d(dkjtVar);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.e;
        fbbm fbbmVar2 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
