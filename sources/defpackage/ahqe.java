package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqe {
    public static final void a(Intent intent) {
        ensk h = ahqt.a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) h.h("com/google/android/apps/messaging/main/MainActivityPeer$Companion", "clearDraftMessageData", 2638, "MainActivityPeer.kt")).q("DRAFTBUG(b/348065860): clearDraftMessageData invoked");
        intent.removeExtra("draft_data");
        if (ctid.b) {
            intent.removeExtra("android.remoteInputDraft");
        }
    }

    public static final boolean b(cxra cxraVar) {
        if (cxraVar != null) {
            try {
                ((vvn) cxraVar).O();
                wdm C = ((vvn) cxraVar).C(false);
                if (C != null) {
                    int i = ((wdz) C).o;
                    if (i != 2) {
                        if (i == 3) {
                        }
                    }
                    ((wdz) C).a();
                    return true;
                }
                if (((Boolean) ((vvn) cxraVar).J(new Function() { // from class: vmx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((ugg) obj).q());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: vmy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        czgj czgjVar = (czgj) obj;
                        enru enruVar = vvn.a;
                        boolean z = false;
                        if (czgjVar != null && czgjVar.x()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).booleanValue()) {
                    return true;
                }
                final vvn vvnVar = (vvn) cxraVar;
                return ((Boolean) ((vvn) cxraVar).I(new Function() { // from class: vmz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((uav) obj).q());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: vna
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                        if (!composeMessageView.H().W()) {
                            return false;
                        }
                        dede.b(vvn.this.p(), composeMessageView);
                        composeMessageView.H().c.m.setOnFocusChangeListener(null);
                        return true;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).booleanValue();
            } catch (IllegalStateException e) {
                ensk j = ahqt.a.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/main/MainActivityPeer$Companion", "tryBackPressingOnConversationFragment", 2632, "MainActivityPeer.kt")).q("ConversationFragment threw exception - ignoring");
            }
        }
        return false;
    }
}
