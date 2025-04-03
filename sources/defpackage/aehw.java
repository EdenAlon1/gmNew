package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.list.ConversationListItemView;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aehw extends oix implements aehy {
    public static final entd d = entd.c("ConversationListAdapter");
    private final Context e;
    private final Activity f;
    private final ellq g;
    private final elbx h;
    private czyz i;
    private ord j;
    private boolean k;
    private ConversationId l;
    private int m;
    private final tam n;
    private final ffbr o;
    private final ffbr p;
    private final Optional q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aehw(android.content.Context r2, android.app.Activity r3, defpackage.errl r4, defpackage.ellq r5, defpackage.elbx r6, defpackage.aejb r7, defpackage.tam r8, defpackage.ffbr r9, defpackage.ffbr r10, j$.util.Optional r11) {
        /*
            r1 = this;
            mb r0 = new mb
            r0.<init>(r7)
            r0.a = r4
            mc r4 = r0.a()
            r1.<init>(r4)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = defpackage.aeir.a
            r1.l = r4
            r4 = -1
            r1.m = r4
            r1.e = r2
            r1.f = r3
            r1.g = r5
            r1.h = r6
            r1.n = r8
            r1.o = r9
            r1.p = r10
            r1.q = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aehw.<init>(android.content.Context, android.app.Activity, errl, ellq, elbx, aejb, tam, ffbr, ffbr, j$.util.Optional):void");
    }

    private static void R(int i) {
        ((ensz) ((ensz) d.j()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "logGetItemAdapterDetails", 257, "ConversationListAdapter.java")).B("HomescreenBannerEnabled: %s /n position: %s", aewg.h.e(), i);
    }

    @Override // defpackage.oix
    public final void F() {
        this.m = G(this.l.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aehy
    public final int G(String str) {
        oiv m = m();
        if (m == null) {
            return -1;
        }
        for (int i = 0; i < m.size(); i++) {
            aely aelyVar = (aely) m.get(i);
            if (aelyVar != null && str.equals(aelyVar.k().w().a())) {
                return i;
            }
        }
        return -1;
    }

    public final wr H(ViewGroup viewGroup, int i, LayoutInflater layoutInflater) {
        if (i == 0) {
            return aeji.C(layoutInflater, viewGroup);
        }
        View inflate = layoutInflater.inflate(R.layout.conversation_list_item_view_v2, viewGroup, false);
        final aehv aehvVar = new aehv(inflate);
        ellq.e(inflate, "Conversation List Item");
        this.g.a(inflate, new View.OnClickListener() { // from class: aehq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aehw.this.L(false, aehvVar);
            }
        });
        final ellq ellqVar = this.g;
        final View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: aehr
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                aehw.this.L(true, aehvVar);
                return true;
            }
        };
        inflate.setOnLongClickListener(new View.OnLongClickListener() { // from class: ello
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                View.OnLongClickListener onLongClickListener2 = onLongClickListener;
                if (!ekys.a(view)) {
                    return false;
                }
                ellq ellqVar2 = ellq.this;
                ekzm d2 = ellqVar2.a.d(ellq.d("Long clicked", view));
                try {
                    boolean onLongClick = onLongClickListener2.onLongClick(view);
                    d2.close();
                    return onLongClick;
                } catch (Throwable th) {
                    try {
                        d2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        this.q.isPresent();
        this.q.get();
        View findViewById = inflate.findViewById(R.id.contact_avatar_view);
        findViewById.setImportantForAccessibility(2);
        findViewById.setContentDescription(this.e.getString(R.string.a11y_conversation_icon));
        findViewById.setOnClickListener(new elay(this.h, "Avatar click", new View.OnClickListener() { // from class: aehs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aehv aehvVar2 = aehvVar;
                int fr = aehvVar2.fr();
                if (fr == -1) {
                    return;
                }
                aely I = fr == -1 ? null : aehw.this.I(fr);
                View view2 = aehvVar2.a;
                I.getClass();
                SelectedConversation a = aehx.a(I);
                ((ensz) ((ensz) aehw.d.h()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "onAvatarClick", 331, "ConversationListAdapter.java")).E("Avatar for ConversationId:%s clicked with isRead:%s", I.k().w(), I.ab());
                ellj.g(new aehm(view2, a), view2);
            }
        }));
        return aehvVar;
    }

    public final aely I(int i) {
        Object obj;
        if (i == -1) {
            ((ensz) ((ensz) d.j()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "getItem", 235, "ConversationListAdapter.java")).q("getItem returning null because NO_POSITION was requested.");
            if (((asom) this.p.b()).a()) {
                ((akzt) this.o.b()).e("Bugle.ConvList.adapterGetItemIsNull.Count", 0);
            }
            R(-1);
            return null;
        }
        ocd ocdVar = this.a;
        oiv oivVar = ocdVar.f;
        oiv oivVar2 = ocdVar.e;
        if (oivVar != null) {
            obj = oivVar.get(i);
        } else {
            if (oivVar2 == null) {
                throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
            }
            oivVar2.q(i);
            obj = oivVar2.get(i);
        }
        aely aelyVar = (aely) obj;
        if (aelyVar == null) {
            ((ensz) ((ensz) d.j()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "getItem", 247, "ConversationListAdapter.java")).q("getItem returning null because super returned null");
            ((akzt) this.o.b()).e("Bugle.ConvList.adapterGetItemIsNull.Count", 1);
            R(i);
        }
        return aelyVar;
    }

    @Override // defpackage.aehy
    public final SelectedConversation J(wr wrVar) {
        aely I = I(wrVar.fr());
        if (I == null) {
            return null;
        }
        return aehx.a(I);
    }

    @Override // defpackage.aehy
    public final String K(int i) {
        aely I;
        if (i >= 0 && i < a() && (I = I(i)) != null) {
            return I.k().w().a();
        }
        return null;
    }

    public final void L(boolean z, aehv aehvVar) {
        int fr = aehvVar.fr();
        if (fr == -1) {
            return;
        }
        View view = aehvVar.a;
        aely I = I(fr);
        I.getClass();
        SelectedConversation a = aehx.a(I);
        ((ensz) ((ensz) d.h()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "onClick", 354, "ConversationListAdapter.java")).E("ConversationId:%s clicked with isRead:%s", I.k().w(), I.ab());
        ellj.g(new aehf(z, a, view, I.k().x(), new bcyl(null, I.k().J(), null)), view);
    }

    @Override // defpackage.aehy
    public final void M(int i, final Bundle bundle) {
        aely I;
        if (!this.k && i >= 0 && i < a() && (I = I(i)) != null) {
            bundle.putString("adapterState_conversationId", I.k().w().a());
            bundle.putLong("adapterState_sortTimestamp", I.k().o());
            bundle.putBoolean("adapterState_pinStatus", I.k().ae());
            if (ctjd.f() || stl.a() || ddjr.c()) {
                final aeki k = I.k();
                k.C().ifPresent(new Consumer() { // from class: aehu
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        Long l = (Long) obj;
                        entd entdVar = aehw.d;
                        if (l.longValue() > aeki.this.o()) {
                            bundle.putLong("adapterState_nudgeAdjustedTimestamp", l.longValue());
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    @Override // defpackage.aehy
    public final void N(boolean z) {
        this.k = z;
    }

    @Override // defpackage.aehy
    public final void O(czyz czyzVar) {
        this.i = czyzVar;
    }

    @Override // defpackage.aehy
    public final void P(ord ordVar) {
        this.j = ordVar;
    }

    @Override // defpackage.aehy
    public final void Q(ConversationId conversationId) {
        int i = this.m;
        this.m = G(conversationId.b());
        this.l = conversationId;
        q(i);
        q(this.m);
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return I(i) == null ? 0 : 1;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        return H(viewGroup, i, LayoutInflater.from(viewGroup.getContext()));
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        int i2 = engw.d;
        z(wrVar, i, enou.a);
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        aely I = I(i);
        return I != null ? I.k().w().a : -i;
    }

    @Override // defpackage.vk
    public final void z(wr wrVar, int i, List list) {
        boolean z;
        if (wrVar instanceof aeji) {
            ((ensz) d.n().h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "onBindViewHolder", 397, "ConversationListAdapter.java")).q("Showing lottie animation, no need to rebind");
            return;
        }
        aely I = I(i);
        if (I == null) {
            ((ensz) ((ensz) d.j()).h("com/google/android/apps/messaging/home/list/ConversationListAdapter", "onBindViewHolder", 403, "ConversationListAdapter.java")).r("Skipping onBindViewHolder for position= %s since getItem is null ", i);
            return;
        }
        ConversationListItemView conversationListItemView = (ConversationListItemView) wrVar.a;
        ord ordVar = this.j;
        if (ordVar != null) {
            z = ordVar.l(String.valueOf(hb(i)));
        } else {
            czyz czyzVar = this.i;
            z = czyzVar != null && czyzVar.e(new ConversationIdType(hb(i)));
        }
        conversationListItemView.setSelected(z);
        conversationListItemView.setActivated(i == this.m && ahpj.a(this.f, this.n.a));
        aein H = conversationListItemView.H();
        if (list.isEmpty()) {
            H.a(I, z);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof aelw) {
                aelw aelwVar = (aelw) obj;
                enqu listIterator = aelwVar.a().listIterator();
                while (listIterator.hasNext()) {
                    aemb aembVar = (aemb) listIterator.next();
                    aema aemaVar = (aema) H.b.get(aembVar);
                    if (aemaVar == null) {
                        aein.a.r(String.format("Received a change payload for a nonexistent view part: %s", aembVar));
                    } else if (aelwVar.b()) {
                        aemaVar.b(aemaVar.a(I), z);
                    } else {
                        aemaVar.b(I, z);
                    }
                }
            } else if ((obj instanceof String) && "Selection-Changed".equals(obj)) {
                H.a(I, z);
            }
        }
    }
}
