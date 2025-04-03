package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.ui.conversation.details.CdpOpeningArguments;
import defpackage.ekkz;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cynv extends cyon implements ekhu, fbas, ekhq, ekkk, elar {
    private cyof a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public cynv() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cyof.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            cyof H = H();
            layoutInflater.getClass();
            if (!((atiy) H.e.b()).a()) {
                Window window = ((cynv) H.b.b()).fe().getWindow();
                kwg.a(window, false);
                window.setNavigationBarColor(0);
                window.setStatusBarColor(0);
                window.setFlags(512, 512);
            }
            ComposeView composeView = new ComposeView(((cynv) H.b.b()).A(), null, 0, 6, null);
            if (!((atiy) H.e.b()).a()) {
                composeView.setFitsSystemWindows(true);
                composeView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: cynw
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        view.getClass();
                        windowInsets.getClass();
                        return windowInsets;
                    }
                });
            }
            composeView.a(new hpw(-930641910, true, new cynz(H)));
            ekyf.q();
            return composeView;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cyof H() {
        cyof cyofVar = this.a;
        if (cyofVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cyofVar;
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

    @Override // defpackage.cyon, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ai() {
        elav b = this.c.b();
        try {
            ba();
            cyof H = H();
            if (!((atiy) H.e.b()).a()) {
                Window window = ((cynv) H.b.b()).fe().getWindow();
                kwg.a(window, true);
                window.clearFlags(512);
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
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

    @Override // defpackage.cyon
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

    @Override // defpackage.cyon, defpackage.ekkd, defpackage.ea
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
                    this.a = new cyof(((akgo) aX).d.N, ((akgo) aX).eN, ((akgo) aX).az, ((akgo) aX).cz, ((akgo) aX).a.b.kU);
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } finally {
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        this.c.k();
        try {
            aY(bundle);
            cyof H = H();
            aiha aihaVar = (aiha) H.a.b();
            aihaVar.a();
            aihaVar.b(aijc.a, true);
            Intent intent = ((cynv) H.b.b()).fe().getIntent();
            intent.getClass();
            if (Build.VERSION.SDK_INT > 33) {
                parcelableExtra2 = intent.getParcelableExtra("mapi_conversation_id", ConversationId.class);
                parcelableExtra = (Parcelable) parcelableExtra2;
            } else {
                parcelableExtra = intent.getParcelableExtra("mapi_conversation_id");
            }
            parcelableExtra.getClass();
            ConversationId conversationId = (ConversationId) parcelableExtra;
            int intExtra = intent.getIntExtra("conversation_settings_launch_source", 0);
            Bundle bundle2 = ((cynv) H.b.b()).m;
            if (bundle2 != null) {
                bundle2.putParcelable("open_conversation2_arguments", new OpenConversation2Arguments(conversationId, null, null, true, false, false, null, 118, null));
                bundle2.putParcelable("cdp_opening_arguments", new CdpOpeningArguments(intExtra));
                bundle2.putParcelable("mapi_conversation_id", conversationId);
                xin.b(bundle2, xim.a);
            }
            ekyf.q();
        } finally {
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

    @Override // defpackage.cyon, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
