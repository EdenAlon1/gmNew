package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ubw implements ejwd<Optional<ucz>> {
    final /* synthetic */ ucd a;

    public ubw(ucd ucdVar) {
        this.a = ucdVar;
    }

    private final void d(ucz uczVar, bcpw bcpwVar) {
        String b = bcpwVar.b();
        MessageCoreData c = uczVar.c();
        bcyk b2 = uczVar.b();
        Context z = this.a.l.z();
        z.getClass();
        this.a.I.M(b, c, b2, z);
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        ((ensz) ((ensz) ((ensz) ucd.a.j()).g(th)).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer$5", "onError", (char) 1052, "DraftEditorFragmentPeer.java")).q("Failed to read draft from storage.");
        ucd ucdVar = this.a;
        ucdVar.z.H().s().b();
        ucdVar.I.ak();
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ucd ucdVar = this.a;
        final Optional optional = (Optional) obj;
        ucdVar.f.b(ucdVar.b, ucdVar.l.G());
        ucd ucdVar2 = this.a;
        boolean z = (ucdVar2.F || ucdVar2.G) ? false : true;
        ucdVar2.H = true;
        if (optional.isPresent()) {
            ucz uczVar = (ucz) optional.get();
            int d = uczVar.d() - 1;
            if (d == 1 || d == 3) {
                ucd ucdVar3 = this.a;
                ucdVar3.G = true;
                d(uczVar, ucdVar3.z.H().s());
            } else if (z) {
                d(uczVar, this.a.z.H().s());
            }
            if (uczVar.a() != null) {
                cxtc H = this.a.z.H();
                RepliedToDataAdapter a = uczVar.a();
                a.getClass();
                H.P(a);
            }
            if (((Boolean) uky.g.e()).booleanValue()) {
                this.a.L.T(new Consumer() { // from class: ubv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        ((ugg) obj2).i(((ucz) Optional.this.get()).c().ab());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, null);
            }
        } else if (z) {
            this.a.I.G();
        }
        this.a.H = false;
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
