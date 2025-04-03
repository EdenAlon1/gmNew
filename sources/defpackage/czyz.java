package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czyz implements ActionMode.Callback {
    public static final /* synthetic */ int d = 0;
    private static final engw e = engw.w(Integer.valueOf(R.id.action_archive), Integer.valueOf(R.id.action_unarchive), Integer.valueOf(R.id.action_add_contact), Integer.valueOf(R.id.action_block), Integer.valueOf(R.id.action_report_spam), Integer.valueOf(R.id.action_delete));
    public final cmh a = new cmh();
    public HashSet b;
    int c;
    private final Context f;
    private final cuye g;
    private final cpbs h;
    private final crqw i;
    private final Optional j;
    private final czyy k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private boolean o;
    private Menu p;
    private MenuItem q;
    private MenuItem r;
    private MenuItem s;
    private MenuItem t;
    private MenuItem u;
    private Toast v;

    public czyz(Context context, cuye cuyeVar, cpbs cpbsVar, crqw crqwVar, Optional optional, czyy czyyVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.f = context;
        this.g = cuyeVar;
        this.h = cpbsVar;
        this.i = crqwVar;
        this.j = optional;
        this.k = czyyVar;
        this.l = ffbrVar;
        this.m = ffbrVar2;
        this.n = ffbrVar3;
    }

    private final void f() {
        Toast makeText;
        Toast toast;
        String str;
        if (this.o) {
            cmh cmhVar = this.a;
            if (cmhVar.d == 1) {
                SelectedConversation selectedConversation = (SelectedConversation) cmhVar.g(0);
                this.s.setVisible((selectedConversation.g != 0 || !TextUtils.isEmpty(selectedConversation.m) || selectedConversation.h || (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && ((aolr) this.m.b()).u(selectedConversation.k, selectedConversation.p).A()) || (selectedConversation.n && this.g.c()) || selectedConversation.f.f()) ? false : true);
                this.t.setVisible((!this.i.c() || (str = selectedConversation.k) == null || this.b.contains(str) || this.h.d(selectedConversation.k)) ? false : true);
                this.u.setVisible((selectedConversation.g == 0 || selectedConversation.f.g()) ? false : true);
                this.s.setShowAsAction(1);
                this.t.setShowAsAction(true != TextUtils.isEmpty(selectedConversation.m) ? 2 : 1);
            } else {
                this.s.setVisible(false);
                this.t.setVisible(false);
                this.u.setVisible(false);
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (SelectedConversation selectedConversation2 : this.a.values()) {
                boolean z6 = selectedConversation2.i;
                z |= !z6;
                z2 |= z6;
                if (!selectedConversation2.f.d()) {
                    z5 = true;
                } else if (selectedConversation2.f.h()) {
                    z3 = true;
                    z4 = true;
                } else {
                    z3 = true;
                }
                if (z && z2 && z3 && z4 && z5) {
                    break;
                }
            }
            this.q.setVisible(z5);
            this.r.setVisible(z3 && !z4);
            this.j.ifPresent(new Consumer() { // from class: czyt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    engw engwVar = ((aemk) obj).a;
                    int size = engwVar.size();
                    for (int i = 0; i < size; i++) {
                        ((aemi) engwVar.get(i)).f(czyz.this.a.values());
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (crnx.j(this.f)) {
                Context context = this.f;
                engw b = b(this.p);
                StringBuilder sb = new StringBuilder();
                int i = ((enou) b).c;
                for (int i2 = 0; i2 < i; i2++) {
                    MenuItem menuItem = (MenuItem) b.get(i2);
                    if (menuItem.isVisible()) {
                        sb.append(menuItem.getTitle());
                        sb.append(" ");
                    }
                }
                String string = context.getResources().getString(R.string.contextual_action_bar_description_prefix, sb.toString());
                if (crnx.i(context)) {
                    makeText = Toast.makeText(context, string, 0);
                    makeText.show();
                } else {
                    makeText = null;
                }
                if (makeText != null && (toast = this.v) != null) {
                    toast.cancel();
                }
                this.v = makeText;
            }
        }
    }

    public final int a() {
        return this.a.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final engw b(final Menu menu) {
        int i = engw.d;
        final engr engrVar = new engr();
        engw engwVar = e;
        int i2 = ((enou) engwVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            MenuItem findItem = menu.findItem(((Integer) engwVar.get(i3)).intValue());
            if (findItem != null) {
                engrVar.h(findItem);
            }
        }
        this.j.ifPresent(new Consumer() { // from class: czyv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                engw engwVar2 = ((aemk) obj).a;
                int i4 = czyz.d;
                Stream stream = Collection.EL.stream(engwVar2);
                final Menu menu2 = menu;
                final engr engrVar2 = engrVar;
                stream.forEach(new Consumer() { // from class: czyu
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        int i5 = czyz.d;
                        MenuItem findItem2 = menu2.findItem(((aemi) obj2).a());
                        if (findItem2 != null) {
                            engrVar2.h(findItem2);
                        }
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
        return engrVar.g();
    }

    public final void c(boolean z, View view) {
        Resources resources = this.f.getResources();
        crnx.k(view, z ? resources.getString(R.string.action_selected) : resources.getString(R.string.action_unselected));
    }

    public final void d() {
        if (this.a.isEmpty()) {
            ((aedh) this.k).o();
        } else {
            f();
        }
    }

    public final boolean e(ConversationIdType conversationIdType) {
        return this.a.containsKey(conversationIdType);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        elfl g;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_delete) {
            czyy czyyVar = this.k;
            java.util.Collection values = this.a.values();
            aedh aedhVar = (aedh) czyyVar;
            if (!ctid.i(aedhVar.b.A())) {
                ((ddzb) aedhVar.L.b()).h(R.string.sms_disallowed_message);
            } else if (aedhVar.j.G()) {
                if (aedhVar.b.Q != null) {
                    ((acdy) aedhVar.K.b()).a(aedh.f(aedhVar.b), values, eoko.CONVERSATION_FROM_LIST, new aean(aedhVar));
                } else if (((aube) aedhVar.bv.b()).a()) {
                    ensk j = aedh.a.j();
                    j.Y(ente.a, "HomeFragmentFlogger");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onActionBarDelete", 2671, "HomeFragmentPeer.java")).q("Can't show the dialog since the fragment doesn't have a view");
                } else {
                    aeaa.a.r("Can't show the dialog since the fragment doesn't have a view");
                }
            } else if (((aube) aedhVar.bv.b()).a()) {
                ensk j2 = aedh.a.j();
                j2.Y(ente.a, "HomeFragmentFlogger");
                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onActionBarDelete", 2662, "HomeFragmentPeer.java")).q("Can't delete messages when it's not default sms app");
            } else {
                aeaa.a.r("Can't delete messages when it's not default sms app");
            }
            return true;
        }
        if (itemId == R.id.action_archive) {
            this.k.r(this.a.values(), true);
            return true;
        }
        if (itemId == R.id.action_unarchive) {
            this.k.r(this.a.values(), false);
            return true;
        }
        aemi aemiVar = null;
        if (itemId == R.id.action_add_contact) {
            int i = this.a.d;
            emxf.m(i == 1, String.format("Attempted to execute add contact action when the number of selected messages is %d.", Integer.valueOf(i)));
            czyy czyyVar2 = this.k;
            SelectedConversation selectedConversation = (SelectedConversation) this.a.g(0);
            String str = selectedConversation.j;
            if (str != null) {
                Uri.parse(str);
            }
            String str2 = selectedConversation.k;
            aedh aedhVar2 = (aedh) czyyVar2;
            ((axul) aedhVar2.I.b()).h(aedhVar2.b.N(), -1L, null, -1L, str2 != null ? ((aolr) aedhVar2.ag.b()).u(str2, selectedConversation.p) : null, 3);
            aedhVar2.o();
            return true;
        }
        if (itemId == R.id.action_block) {
            int i2 = this.a.d;
            emxf.m(i2 == 1, String.format("Attempted to execute block action when the number of selected messages is %d.", Integer.valueOf(i2)));
            czyy czyyVar3 = this.k;
            SelectedConversation selectedConversation2 = (SelectedConversation) this.a.g(0);
            final String str3 = selectedConversation2.k;
            if (str3 == null) {
                g = elfo.e(null);
            } else {
                final aegg aeggVar = (aegg) ((aedh) czyyVar3).C;
                g = elfo.g(new Callable() { // from class: aefy
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ((bdrr) aegg.this.d.b()).d(str3);
                    }
                }, aeggVar.a);
            }
            aedh aedhVar3 = (aedh) czyyVar3;
            aedhVar3.B.i(new ejlp(g), new ejlm(selectedConversation2), aedhVar3.ax);
            return true;
        }
        if (itemId == R.id.action_report_spam) {
            int i3 = this.a.d;
            emxf.m(i3 == 1, String.format("Attempted to execute report spam action when the number of selected messages is %d.", Integer.valueOf(i3)));
            czyy czyyVar4 = this.k;
            SelectedConversation selectedConversation3 = (SelectedConversation) this.a.g(0);
            aedh aedhVar4 = (aedh) czyyVar4;
            aedhVar4.B.i(new ejlp(((crsl) ((aegg) aedhVar4.C).g.b()).a(selectedConversation3.a)), new ejlm(selectedConversation3), aedhVar4.ay);
            return true;
        }
        if (itemId == 16908332) {
            ((aedh) this.k).o();
            return true;
        }
        if (this.j.isPresent()) {
            engw engwVar = ((aemk) this.j.get()).a;
            int size = engwVar.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                aemi aemiVar2 = (aemi) engwVar.get(i4);
                i4++;
                if (itemId == aemiVar2.a()) {
                    aemiVar = aemiVar2;
                    break;
                }
            }
            if (aemiVar != null) {
                aemiVar.c(this.a.values());
                ((aedh) this.k).o();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, final Menu menu) {
        Context context = this.f;
        if ((context instanceof cwpv) && ((cwpv) context).K()) {
            actionMode.getMenuInflater().inflate(R.menu.conversation_list_fragment_select_menu_action_mode_v2, menu);
        } else {
            actionMode.getMenuInflater().inflate(R.menu.conversation_list_fragment_select_menu, menu);
        }
        this.p = menu;
        this.q = menu.findItem(R.id.action_archive);
        this.r = menu.findItem(R.id.action_unarchive);
        this.s = menu.findItem(R.id.action_add_contact);
        this.t = menu.findItem(R.id.action_block);
        this.u = menu.findItem(R.id.action_report_spam);
        this.j.ifPresent(new Consumer() { // from class: czyx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                engw engwVar = ((aemk) obj).a;
                int i = czyz.d;
                Stream stream = Collection.EL.stream(engwVar);
                final Menu menu2 = menu;
                stream.forEach(new Consumer() { // from class: czyw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        int i2 = czyz.d;
                        ((aemi) obj2).b(menu2);
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
        engw b = b(menu);
        if (!((auxx) this.n.b()).a()) {
            this.c = ehdr.d(this.f, R.attr.colorPrimaryBrandIcon, "MultiSelectActionModeCallback");
            enqv it = b.iterator();
            while (it.hasNext()) {
                MenuItem menuItem = (MenuItem) it.next();
                if (((asot) this.l.b()).a()) {
                    menuItem.setIconTintList(ColorStateList.valueOf(this.c));
                } else {
                    Drawable icon = menuItem.getIcon();
                    if (icon != null) {
                        icon.setTint(this.c);
                    }
                }
            }
        }
        actionMode.getCustomView();
        this.o = true;
        f();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.clear();
        this.o = false;
        ((aedh) this.k).o();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }
}
