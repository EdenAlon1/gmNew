package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.ApplicationSettingsActivity;
import defpackage.ekkz;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwup extends cxiq implements ekhu, fbas, ekhq, ekkk, elar {
    private cwuu a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public cwup() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cwuu.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final cwuu H = H();
            layoutInflater.getClass();
            final View inflate = layoutInflater.inflate(R.layout.sim_settings_fragment, viewGroup, false);
            ejxn ejxnVar = (ejxn) H.c.b();
            cwum cwumVar = new cwum((cwuo) H.d.b());
            final ffji ffjiVar = new ffji() { // from class: cwuq
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    List list = (List) obj;
                    ensk e = cwuu.a.e();
                    e.Y(ente.a, "Bugle");
                    enrr enrrVar = (enrr) e;
                    enrrVar.Y(csux.O, "ChatIdentitySettingsSelectionFragmentPeer");
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/ui/appsettings/ChatIdentitySettingsSelectionFragmentPeer", "onCreateView$lambda$0", 77, "ChatIdentitySettingsSelectionFragmentPeer.kt")).r("Fetched chat identity data for %s identities", list.size());
                    cwuu cwuuVar = cwuu.this;
                    Intent intent = new Intent(cwuuVar.b.z(), (Class<?>) ApplicationSettingsActivity.class);
                    View view = inflate;
                    if (view == null) {
                        ensk j = cwuu.a.j();
                        j.Y(ente.a, "Bugle");
                        enrr enrrVar2 = (enrr) j;
                        enrrVar2.Y(csux.O, "ChatIdentitySettingsSelectionFragmentPeer");
                        ((enrr) enrrVar2.h("com/google/android/apps/messaging/ui/appsettings/ChatIdentitySettingsSelectionFragmentPeer", "onCreateView$lambda$0", 84, "ChatIdentitySettingsSelectionFragmentPeer.kt")).q("Can not setup compose view because fragment view is null");
                    } else {
                        list.getClass();
                        ComposeView composeView = (ComposeView) view.findViewById(R.id.sim_settings_compose_view);
                        composeView.j();
                        Context z = cwuuVar.b.z();
                        if (z == null) {
                            ensk j2 = cwuu.a.j();
                            j2.Y(ente.a, "Bugle");
                            enrr enrrVar3 = (enrr) j2;
                            enrrVar3.Y(csux.O, "ChatIdentitySettingsSelectionFragmentPeer");
                            ((enrr) enrrVar3.h("com/google/android/apps/messaging/ui/appsettings/ChatIdentitySettingsSelectionFragmentPeer", "setupComposeView", 50, "ChatIdentitySettingsSelectionFragmentPeer.kt")).q("Can not setup compose view because context is null");
                        } else {
                            composeView.a(new hpw(-1953891386, true, new cwut(list, z, intent)));
                        }
                    }
                    return ffcu.a;
                }
            };
            ejxnVar.g(R.id.get_sim_selection_settings_data_source, cwumVar, new ejxk() { // from class: cwur
                @Override // defpackage.ejxk
                public final /* synthetic */ void a(Throwable th) {
                    ejxj.a(th);
                }

                @Override // defpackage.ejxk
                public final void b(Object obj) {
                    ffji.this.invoke(obj);
                }
            });
            ekyf.q();
            return inflate;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cwuu H() {
        cwuu cwuuVar = this.a;
        if (cwuuVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cwuuVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.d == null) {
            this.d = new ekkn(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.cxiq, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.cxiq
    protected final /* bridge */ /* synthetic */ ekky b() {
        return new ekkt(this, true);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.cxiq, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    this.a = new cwuu((ea) ((fbbb) ((akgo) aX).e).a, ((akgo) aX).eG, ((akgo) aX).eH);
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new ekkz.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ag = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cxiq, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
