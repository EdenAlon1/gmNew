package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uuk implements ActionMode.Callback {
    final /* synthetic */ uuy a;

    public uuk(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ekzm b = this.a.P.b("MessageListFragmentPeer onActionItemClicked");
        try {
            boolean E = this.a.E(menuItem.getItemId());
            b.close();
            return E;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, final Menu menu) {
        Drawable icon;
        ((uxi) this.a.U.b()).b(this.a.v.b(), eonx.OPTIONS_MENU_OPENED);
        if (this.a.v.f() || this.a.e.G() == null) {
            uuw uuwVar = this.a.ay;
            if (uuwVar == null) {
                return false;
            }
            uuwVar.l();
            return false;
        }
        final uuy uuyVar = this.a;
        uuyVar.aY = menu;
        eg fe = uuyVar.e.fe();
        MenuInflater menuInflater = fe.getMenuInflater();
        if ((fe instanceof cwpv) && ((cwpv) fe).K()) {
            menuInflater.inflate(R.menu.conversation_fragment_select_menu_action_mode_v2, menu);
        } else {
            menuInflater.inflate(R.menu.conversation_fragment_select_menu, menu);
        }
        menu.findItem(R.id.action_download).setVisible(uuyVar.v.h(6, fe));
        menu.findItem(R.id.action_send).setVisible(uuyVar.v.h(5, fe));
        menu.findItem(R.id.share_message_menu).setVisible(uuyVar.v.h(7, fe));
        menu.findItem(R.id.save_attachment).setVisible(uuyVar.v.h(1, fe));
        menu.findItem(R.id.forward_message_menu).setVisible(uuyVar.v.h(3, fe));
        menu.findItem(R.id.details_menu).setVisible(uuyVar.v.h(4, fe)).getIcon();
        menu.findItem(R.id.copy_text).setVisible(uuyVar.v.h(2, fe));
        uuyVar.u.ifPresent(new Consumer() { // from class: urv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Stream stream = Collection.EL.stream(((upl) obj).a);
                final uuy uuyVar2 = uuy.this;
                final Menu menu2 = menu;
                stream.forEach(new Consumer() { // from class: ust
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        ((upk) obj2).b(menu2, uuy.this.v);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ArrayList<MenuItem> h = uuyVar.h(menu);
        Context z = uuyVar.e.z();
        z.getClass();
        int d = ehdr.d(z, R.attr.colorPrimaryBrandNonIcon, "MessageListFragmentPeer");
        for (MenuItem menuItem : h) {
            if (menuItem != null && (icon = menuItem.getIcon()) != null) {
                icon.setTint(d);
            }
        }
        uuyVar.aD.l(uuyVar.h(menu));
        if (ddnm.a()) {
            ((adsd) this.a.J.b()).a(28);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.k();
        vvn vvnVar = (vvn) this.a.ay;
        AppBarLayout appBarLayout = (AppBarLayout) vvnVar.p().findViewById(R.id.appBarLayout);
        if (appBarLayout != null && vvnVar.c) {
            appBarLayout.e = true;
            appBarLayout.r(false);
        }
        this.a.ay.l();
        this.a.aD.l(null);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }
}
