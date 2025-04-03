package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhs implements uge {
    public final uco a;
    public final alcb b;
    public final tam c;
    public final dcax d;
    public final dcba e;
    public final cxqh f;
    public final csuk g;
    public final uhf h;
    public final uot i;
    public final ddzb j;
    public final uhc k;
    public AttachmentQueueState l;
    public dcaw m;
    public dbxt n;
    public ugg o;
    public ugl p;
    public ContentGridView q;
    private final alct r;

    public uhs(uco ucoVar, alcb alcbVar, dcax dcaxVar, dcba dcbaVar, alct alctVar, cxqh cxqhVar, csuk csukVar, uhf uhfVar, tam tamVar, uot uotVar, ddzb ddzbVar, uhc uhcVar) {
        this.a = ucoVar;
        this.b = alcbVar;
        this.d = dcaxVar;
        this.e = dcbaVar;
        this.r = alctVar;
        this.f = cxqhVar;
        this.g = csukVar;
        this.h = uhfVar;
        this.c = tamVar;
        this.i = uotVar;
        this.j = ddzbVar;
        this.k = uhcVar;
    }

    @Override // defpackage.uge
    public final ea a() {
        return this.h;
    }

    @Override // defpackage.uge
    public final void b() {
        bcvr bcvrVar = (bcvr) g().E().a();
        epts eptsVar = epts.ALL;
        eptu eptuVar = eptu.COLLAPSED;
        bcvrVar.k();
        this.k.a().toMillis();
        this.r.b(eptsVar, eptuVar, eptk.UNKNOWN_CLOSING_SOURCE);
        h().H().c();
    }

    @Override // defpackage.uge
    public final void c(Bundle bundle) {
        if (bundle.getBoolean("open_location_chooser")) {
            h().H().m(eptm.EXPAND, ((bcvr) g().E().a()).n());
        }
        this.k.d();
        bcpw E = g().E();
        if (E == null || !E.g()) {
            return;
        }
        alct alctVar = this.r;
        epts eptsVar = epts.ALL;
        eptu eptuVar = eptu.COLLAPSED;
        ((bcvr) E.a()).k();
        alctVar.d(eptsVar, eptuVar, epto.UNKNOWN_OPENING_STATE, eptm.PLUS_BUTTON);
    }

    @Override // defpackage.uge
    public final void d(ugg uggVar) {
        this.o = uggVar;
    }

    @Override // defpackage.uge
    public final void e(ugl uglVar) {
        this.p = uglVar;
    }

    @Override // defpackage.uge
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Deprecated
    public final czgy g() {
        lkr lkrVar;
        ea eaVar = this.h.E;
        if (eaVar == null || (lkrVar = eaVar.E) == null) {
            throw new IllegalStateException("Cannot find ConversationInputHost in fragment hierarchy!");
        }
        return (czgy) ((ekhu) lkrVar).H();
    }

    public final Compose2oFragment h() {
        Compose2oFragment compose2oFragment = (Compose2oFragment) this.h.I().g(R.id.c2o_fragment);
        compose2oFragment.getClass();
        return compose2oFragment;
    }

    public final void i(Consumer consumer) {
        if (this.n != null) {
            for (int i = 0; i < this.n.a(); i++) {
                consumer.o(this.n.b(i));
            }
        }
    }

    public final void j(BiConsumer biConsumer, Object obj) {
        if (this.n != null) {
            for (int i = 0; i < this.n.a(); i++) {
                biConsumer.accept(this.n.b(i), obj);
            }
        }
    }

    public final void k(MediaContentItem mediaContentItem, dcle dcleVar, int i, int i2) {
        this.b.c(dcll.a(mediaContentItem, dcleVar), i, i2);
    }

    public final boolean l() {
        return g().bi();
    }

    @Override // defpackage.cxra
    public final boolean q() {
        dbxt dbxtVar = this.n;
        if (dbxtVar == null) {
            return false;
        }
        for (dcae dcaeVar : dbxtVar.a) {
        }
        return false;
    }

    @Override // defpackage.cxrb
    public final void v() {
        throw null;
    }
}
