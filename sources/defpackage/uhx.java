package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhx implements uge {
    public final uco a;
    public final alcb b;
    public final dcax c;
    public final cxqh d;
    public final csuk e;
    public final uot f;
    public final uhc g;
    public AttachmentQueueState h;
    public dcae i;
    public ugl j;
    private final ea k;
    private final alct l;

    public uhx(uco ucoVar, alcb alcbVar, dcax dcaxVar, cxqh cxqhVar, csuk csukVar, ea eaVar, uot uotVar, alct alctVar, uhc uhcVar) {
        this.a = ucoVar;
        this.b = alcbVar;
        this.c = dcaxVar;
        this.d = cxqhVar;
        this.e = csukVar;
        this.k = eaVar;
        this.f = uotVar;
        this.l = alctVar;
        this.g = uhcVar;
    }

    @Override // defpackage.uge
    public final ea a() {
        return this.k;
    }

    @Override // defpackage.uge
    public final void b() {
        bcvr bcvrVar = (bcvr) g().E().a();
        epts eptsVar = epts.CAMERA_GALLERY;
        eptu eptuVar = eptu.COLLAPSED;
        bcvrVar.k();
        this.g.a().toMillis();
        this.l.b(eptsVar, eptuVar, eptk.UNKNOWN_CLOSING_SOURCE);
        h().H().c();
    }

    @Override // defpackage.uge
    public final void c(Bundle bundle) {
        this.g.d();
        bcpw E = g().E();
        if (E == null || !E.g()) {
            return;
        }
        alct alctVar = this.l;
        epts eptsVar = epts.CAMERA_GALLERY;
        eptu eptuVar = eptu.COLLAPSED;
        ((bcvr) E.a()).k();
        alctVar.d(eptsVar, eptuVar, epto.UNKNOWN_OPENING_STATE, eptm.CAMERA_GALLERY_BUTTON);
    }

    @Override // defpackage.uge
    public final void e(ugl uglVar) {
        this.j = uglVar;
    }

    @Override // defpackage.uge
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Deprecated
    final czgy g() {
        lkr lkrVar;
        csjc.j();
        ea eaVar = this.k.E;
        if (eaVar == null || (lkrVar = eaVar.E) == null) {
            throw new IllegalStateException("Cannot find ConversationInputHost in fragment hierarchy.");
        }
        return (czgy) ((ekhu) lkrVar).H();
    }

    public final Compose2oFragment h() {
        Compose2oFragment compose2oFragment = (Compose2oFragment) this.k.I().g(R.id.c2o_fragment);
        compose2oFragment.getClass();
        return compose2oFragment;
    }

    @Override // defpackage.cxra
    public final boolean q() {
        return false;
    }

    @Override // defpackage.cxrb
    public final void v() {
        throw null;
    }

    @Override // defpackage.uge
    public final /* synthetic */ void d(ugg uggVar) {
    }
}
