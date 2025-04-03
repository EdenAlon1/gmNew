package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.receiver.DefaultSmsSubscriptionChangeReceiver;
import com.google.android.apps.messaging.ui.common.BugleSearchView;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.Compose2oRootView;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.ekkz;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import vvn.a;
import vvn.b;
import vvn.c;
import vvn.d;
import vvn.f;
import vvn.g;
import vvn.h;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjs extends vxx implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    private vvn a;
    private boolean ah;
    private Context d;
    private final lkv e = new lkv(this);
    private final ells ag = new ells();

    @Deprecated
    public vjs() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return vvn.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final vvn H = H();
            H.cr = (View) H.J(new Function() { // from class: vnc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    enru enruVar = vvn.a;
                    return layoutInflater.inflate(R.layout.conversation_fragment, viewGroup, false);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: vnd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    enru enruVar = vvn.a;
                    return layoutInflater.inflate(R.layout.conversation_fragment_with_c2o, viewGroup, false);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (((Optional) H.be.b()).isPresent()) {
                H.aw.b(((cymq) ((Optional) H.be.b()).get()).a(), new vvd(H));
            }
            ea g = H.N.I().g(R.id.message_list_fragment_container);
            if (g == null) {
                eisx eisxVar = H.cd;
                String a = H.M.a();
                cfup cfupVar = uuy.a;
                urp urpVar = new urp();
                fbae.e(urpVar);
                ekky.b(urpVar, eisxVar);
                ekku.b(urpVar, a);
                cg cgVar = new cg(H.N.I());
                cgVar.s(R.id.message_list_fragment_container, urpVar);
                cgVar.c();
                g = urpVar;
            }
            g.P().c(new vve(H, g));
            H.S(new Consumer() { // from class: vnf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((uav) obj).l(vvn.this.A());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: vng
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    final vvn vvnVar = vvn.this;
                    final View findViewById = vvnVar.cr.findViewById(R.id.message_compose_view_container_with_c2o);
                    vvnVar.T(new Consumer() { // from class: vox
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            vvn.this.cv = (ComposeMessageView) ((ViewStub) findViewById).inflate();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, new Consumer() { // from class: vpi
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            vvn.this.cv = (ComposeMessageView) findViewById;
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    vvnVar.cv.setOnApplyWindowInsetsListener(new vvf(vvnVar));
                    vvnVar.cv.addOnLayoutChangeListener(new elbi(vvnVar.aT, new View.OnLayoutChangeListener() { // from class: vps
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            vvn.this.aP(i4 - i2);
                        }
                    }));
                    if (vvnVar.cA.g()) {
                        bcqs bcqsVar = (bcqs) vvnVar.cA.a();
                        bcvr a2 = vvnVar.aa.a(bcqsVar.e, bcqsVar.q());
                        vvnVar.bx.b = a2;
                        vvnVar.cv.H().x(a2, vvnVar.A());
                    }
                    vvnVar.cv.H().J(vvnVar.cd);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            H.cs = H.cr.findViewById(R.id.message_list_fragment_container);
            H.cS = (Compose2oRootView) H.cr.findViewById(R.id.c2o_root);
            H.cT = (ConversationScrollToBottomButton) H.cr.findViewById(R.id.conversation_scroll_to_bottom_button);
            ConversationScrollToBottomButton conversationScrollToBottomButton = H.cT;
            if (conversationScrollToBottomButton != null) {
                H.aQ.b(conversationScrollToBottomButton, new vjj());
            }
            if (bundle != null) {
                H.T(null, new Consumer() { // from class: vnh
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        czgj czgjVar = (czgj) obj;
                        enru enruVar = vvn.a;
                        if (czgjVar != null) {
                            czgjVar.r(bundle);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            ((ckge) H.am.a()).h(H.A());
            H.cQ = (TextView) H.cr.findViewById(R.id.no_reply_pinned_message);
            if (!H.aW.isEmpty()) {
                if (bundle == null) {
                    Intent s = H.s();
                    if (s != null && s.hasExtra("search_text")) {
                        String stringExtra = s.getStringExtra("search_text");
                        stringExtra.getClass();
                        H.cp = stringExtra;
                        H.cp = TextUtils.isEmpty(H.cp) ? null : H.cp;
                        s.removeExtra("search_text");
                    }
                } else if (bundle.containsKey("saved_instance_state_search_query_key")) {
                    H.cp = bundle.getString("saved_instance_state_search_query_key");
                }
            }
            View view = H.cr;
            final Compose2oRootView compose2oRootView = H.cS;
            view.setSystemUiVisibility(1792);
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: vqy
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(final View view2, final WindowInsets windowInsets) {
                    View findViewById;
                    WindowInsets windowInsets2;
                    vvn vvnVar = vvn.this;
                    vvnVar.A = windowInsets;
                    view2.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                    vvnVar.T(null, new Consumer() { // from class: vrg
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            czgj czgjVar = (czgj) obj;
                            enru enruVar = vvn.a;
                            if (czgjVar == null || !czgjVar.m) {
                                return;
                            }
                            WindowInsets windowInsets3 = windowInsets;
                            view2.setPadding(windowInsets3.getSystemWindowInsetLeft(), 0, windowInsets3.getSystemWindowInsetRight(), 0);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    vvnVar.aO(false);
                    if (!ctid.d && (findViewById = vvnVar.p().findViewById(R.id.appBarLayout)) != null && (windowInsets2 = vvnVar.A) != null) {
                        findViewById.dispatchApplyWindowInsets(windowInsets2);
                    }
                    return windowInsets;
                }
            });
            H.T(null, new Consumer() { // from class: vqz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = new View.OnApplyWindowInsetsListener() { // from class: vll
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                            enru enruVar = vvn.a;
                            view2.setPadding(0, 0, 0, 0);
                            return windowInsets;
                        }
                    };
                    Compose2oRootView compose2oRootView2 = compose2oRootView;
                    compose2oRootView2.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
                    final vvn vvnVar = vvn.this;
                    ViewTreeObserver viewTreeObserver = compose2oRootView2.getViewTreeObserver();
                    if (vvnVar.cX == null) {
                        vvnVar.cX = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: vpk
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                View view2;
                                vvn vvnVar2 = vvn.this;
                                czgj czgjVar = vvnVar2.ct;
                                if (czgjVar != null) {
                                    boolean z = czgjVar.m;
                                    if (vvnVar2.v != z || czgjVar.z()) {
                                        WindowInsets windowInsets = vvnVar2.A;
                                        if (windowInsets != null && (view2 = vvnVar2.cr) != null) {
                                            view2.dispatchApplyWindowInsets(windowInsets);
                                        }
                                        vvnVar2.v = z;
                                    }
                                }
                            }
                        };
                    }
                    viewTreeObserver.addOnGlobalLayoutListener(vvnVar.cX);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            uoy uoyVar = H.bu;
            ejwl ejwlVar = H.aw;
            Runnable runnable = new Runnable() { // from class: vni
                @Override // java.lang.Runnable
                public final void run() {
                    vvn vvnVar = vvn.this;
                    ((bcqs) vvnVar.cA.a()).p = ampg.NONE;
                    Snackbar snackbar = vvnVar.cj;
                    if (snackbar != null) {
                        snackbar.e();
                        vvnVar.cj = null;
                    }
                    vvnVar.af();
                }
            };
            Consumer consumer = new Consumer() { // from class: vnj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    vvn vvnVar = vvn.this;
                    ampg ampgVar = (ampg) obj;
                    ((bcqs) vvnVar.cA.a()).p = ampgVar;
                    vvnVar.Y();
                    ea g2 = vvnVar.N.I().g(R.id.input_manager_fragment);
                    tys tysVar = ((bcqs) vvnVar.cA.a()).d;
                    View u = vvnVar.u();
                    final Snackbar snackbar = null;
                    View view2 = g2 != null ? g2.Q : null;
                    uox uoxVar = vvnVar.bv;
                    final ConversationIdType conversationIdType = vvnVar.M;
                    typ typVar = (typ) tysVar;
                    final upb upbVar = new upb(typVar.g, vvnVar.L(), typVar.d);
                    if (uoxVar.a.containsKey(ampgVar)) {
                        upc upcVar = (upc) ((ffbr) uoxVar.a.get(ampgVar)).b();
                        snackbar = Snackbar.r(u, upcVar.b(), -2);
                        upcVar.a().ifPresent(new Consumer() { // from class: uow
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                final upa upaVar = (upa) obj2;
                                String string = upaVar.a.getString(R.string.snackbar_action_label_add_to_group);
                                elbx elbxVar = upaVar.b;
                                final ConversationIdType conversationIdType2 = conversationIdType;
                                final upf upfVar = upbVar;
                                Snackbar.this.t(string, new elay(elbxVar, "AddToGroupSnackbarAction", new View.OnClickListener() { // from class: uoz
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        upf upfVar2 = upfVar;
                                        ayhd ayhdVar = ayhd.RCS_GROUP_SELF_ONLY;
                                        upb upbVar2 = (upb) upfVar2;
                                        String str = upbVar2.b;
                                        boolean z = upbVar2.c;
                                        int i = upbVar2.a;
                                        upa upaVar2 = upa.this;
                                        upaVar2.c.c(upaVar2.a, conversationIdType2, true, i, z, str, 4, ayhdVar);
                                    }
                                }));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                return Consumer$CC.$default$andThen(this, consumer2);
                            }
                        });
                        snackbar.n(view2);
                    }
                    vvnVar.cj = snackbar;
                    Snackbar snackbar2 = vvnVar.cj;
                    if (snackbar2 == null) {
                        throw new IllegalStateException(String.format("InputDisableSnackbarProvider not configured for disable mode %s", ampgVar));
                    }
                    snackbar2.i();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            };
            ConversationIdType conversationIdType = H.M;
            uou uouVar = uoyVar.a;
            BugleConversationId bugleConversationId = new BugleConversationId(conversationIdType);
            ejwlVar.b(uouVar.a.a(uouVar.b.d(bugleConversationId), new ejtz(String.format("conversation_disable_mode_%s", bugleConversationId.b())), uouVar.c), new uov(runnable, consumer));
            View view2 = H.cr;
            if (view2 == null) {
                vxi.a(this, H());
            }
            ekyf.q();
            return view2;
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
    public final vvn H() {
        vvn vvnVar = this.a;
        if (vvnVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return vvnVar;
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

    /* JADX WARN: Removed duplicated region for block: B:38:0x02e6 A[Catch: all -> 0x0867, TryCatch #2 {all -> 0x0867, blocks: (B:3:0x0008, B:5:0x0017, B:11:0x0023, B:14:0x0034, B:15:0x0030, B:18:0x004c, B:22:0x0059, B:25:0x0080, B:27:0x00a2, B:28:0x00ac, B:30:0x00bc, B:32:0x00d5, B:34:0x00e3, B:35:0x00f1, B:36:0x02d8, B:38:0x02e6, B:39:0x0343, B:40:0x02f6, B:42:0x0304, B:43:0x0314, B:45:0x0322, B:46:0x0332, B:47:0x010d, B:48:0x0114, B:49:0x0115, B:51:0x012a, B:53:0x0138, B:56:0x0145, B:58:0x0154, B:60:0x015c, B:61:0x0160, B:63:0x0174, B:65:0x018e, B:69:0x01b1, B:71:0x01b7, B:73:0x01c1, B:75:0x01c5, B:76:0x01cb, B:78:0x01d8, B:79:0x01f3, B:81:0x0204, B:82:0x0269, B:84:0x0213, B:86:0x0221, B:87:0x0230, B:89:0x023e, B:90:0x024d, B:92:0x025b, B:94:0x0296, B:99:0x02a1, B:101:0x02b1, B:102:0x02c0, B:103:0x0383, B:104:0x038a, B:107:0x0391, B:110:0x03b9, B:113:0x03d7, B:116:0x03e1, B:119:0x03ff, B:122:0x0409, B:124:0x0419, B:125:0x043a, B:126:0x0441, B:129:0x0447, B:134:0x048f, B:139:0x04b2, B:141:0x04b8, B:142:0x0500, B:145:0x050a, B:148:0x051c, B:151:0x052e, B:153:0x053d, B:155:0x0543, B:156:0x0556, B:158:0x0566, B:160:0x056e, B:162:0x057e, B:163:0x0587, B:164:0x0601, B:165:0x052a, B:168:0x062b, B:169:0x063a, B:171:0x063e, B:174:0x0666, B:176:0x0674, B:179:0x067e, B:182:0x068c, B:184:0x069a, B:185:0x06bd, B:187:0x06cd, B:188:0x06f0, B:189:0x0735, B:190:0x0758, B:193:0x0762, B:196:0x0770, B:198:0x0780, B:199:0x07a3, B:201:0x07b3, B:202:0x07d6, B:203:0x081a, B:204:0x083c, B:205:0x084e, B:207:0x0854, B:210:0x0860), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f6 A[Catch: all -> 0x0867, TryCatch #2 {all -> 0x0867, blocks: (B:3:0x0008, B:5:0x0017, B:11:0x0023, B:14:0x0034, B:15:0x0030, B:18:0x004c, B:22:0x0059, B:25:0x0080, B:27:0x00a2, B:28:0x00ac, B:30:0x00bc, B:32:0x00d5, B:34:0x00e3, B:35:0x00f1, B:36:0x02d8, B:38:0x02e6, B:39:0x0343, B:40:0x02f6, B:42:0x0304, B:43:0x0314, B:45:0x0322, B:46:0x0332, B:47:0x010d, B:48:0x0114, B:49:0x0115, B:51:0x012a, B:53:0x0138, B:56:0x0145, B:58:0x0154, B:60:0x015c, B:61:0x0160, B:63:0x0174, B:65:0x018e, B:69:0x01b1, B:71:0x01b7, B:73:0x01c1, B:75:0x01c5, B:76:0x01cb, B:78:0x01d8, B:79:0x01f3, B:81:0x0204, B:82:0x0269, B:84:0x0213, B:86:0x0221, B:87:0x0230, B:89:0x023e, B:90:0x024d, B:92:0x025b, B:94:0x0296, B:99:0x02a1, B:101:0x02b1, B:102:0x02c0, B:103:0x0383, B:104:0x038a, B:107:0x0391, B:110:0x03b9, B:113:0x03d7, B:116:0x03e1, B:119:0x03ff, B:122:0x0409, B:124:0x0419, B:125:0x043a, B:126:0x0441, B:129:0x0447, B:134:0x048f, B:139:0x04b2, B:141:0x04b8, B:142:0x0500, B:145:0x050a, B:148:0x051c, B:151:0x052e, B:153:0x053d, B:155:0x0543, B:156:0x0556, B:158:0x0566, B:160:0x056e, B:162:0x057e, B:163:0x0587, B:164:0x0601, B:165:0x052a, B:168:0x062b, B:169:0x063a, B:171:0x063e, B:174:0x0666, B:176:0x0674, B:179:0x067e, B:182:0x068c, B:184:0x069a, B:185:0x06bd, B:187:0x06cd, B:188:0x06f0, B:189:0x0735, B:190:0x0758, B:193:0x0762, B:196:0x0770, B:198:0x0780, B:199:0x07a3, B:201:0x07b3, B:202:0x07d6, B:203:0x081a, B:204:0x083c, B:205:0x084e, B:207:0x0854, B:210:0x0860), top: B:2:0x0008 }] */
    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean aM(android.view.MenuItem r20) {
        /*
            Method dump skipped, instructions count: 2162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vjs.aM(android.view.MenuItem):boolean");
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ae(Bundle bundle) {
        ejuh a;
        final Bundle bundle2 = bundle;
        this.c.k();
        try {
            aU(bundle);
            final vvn H = H();
            if (H.cA.g()) {
                H.cl.c(bundle2);
                ensk e = vvn.a.e();
                e.Y(ente.a, "Bugle");
                enrr enrrVar = (enrr) e;
                enrrVar.Y(csux.p, H.M);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "addSubscriptionMixins", 2222, "ConversationFragmentPeer.java")).q("ConversationFragment: Subscribing to DataSources");
                lkk P = H.N.P();
                twr twrVar = H.Q;
                ConversationIdType conversationIdType = H.M;
                if (((txl) twrVar).t.a()) {
                    bzac bzacVar = ((txl) twrVar).c;
                    bifx b = ((bcsy) ((txl) twrVar).q.b()).b(true, blyg.e(conversationIdType, 100).b()).b();
                    final txl txlVar = (txl) twrVar;
                    a = bzacVar.a(b, new byzu() { // from class: txc
                        @Override // defpackage.byzu
                        public final elfl a(Object obj) {
                            final bifx bifxVar = (bifx) obj;
                            final txl txlVar2 = txl.this;
                            return elfo.g(new Callable() { // from class: txh
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    bifu bifuVar = (bifu) bifxVar.o();
                                    try {
                                        Optional empty = !bifuVar.moveToFirst() ? Optional.empty() : Optional.of(txl.this.f.c(bifuVar));
                                        bifuVar.close();
                                        return empty;
                                    } catch (Throwable th) {
                                        try {
                                            bifuVar.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            }, txlVar2.d);
                        }
                    }, "latest_message", P);
                } else {
                    bzac bzacVar2 = ((txl) twrVar).c;
                    bjjg b2 = ((bcsq) ((txl) twrVar).p.b()).c(true, blyg.e(conversationIdType, 100).b()).b();
                    final txl txlVar2 = (txl) twrVar;
                    a = bzacVar2.a(b2, new byzu() { // from class: twz
                        @Override // defpackage.byzu
                        public final elfl a(Object obj) {
                            final bjjg bjjgVar = (bjjg) obj;
                            final txl txlVar3 = txl.this;
                            return elfo.g(new Callable() { // from class: twy
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    bjjd bjjdVar = (bjjd) bjjgVar.o();
                                    try {
                                        Optional empty = !bjjdVar.moveToFirst() ? Optional.empty() : Optional.of(txl.this.f.e(bjjdVar));
                                        bjjdVar.close();
                                        return empty;
                                    } catch (Throwable th) {
                                        try {
                                            bjjdVar.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            }, txlVar3.d);
                        }
                    }, "latest_message", P);
                }
                H.M(a, new vvh(H));
                twr twrVar2 = H.Q;
                final ConversationIdType conversationIdType2 = H.M;
                buxo d = MessagesTable.d();
                d.z("getConversationMessagesUpdatedDataSource");
                d.f(new Function() { // from class: txi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((buum) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d.h(new Function() { // from class: txj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        buxzVar.m(ConversationIdType.this);
                        buxzVar.an(axuh.b);
                        buxzVar.P(false);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                buxm b3 = d.b();
                buxo d2 = MessagesTable.d();
                d2.f(new Function() { // from class: txk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((buum) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d2.h(new Function() { // from class: twt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        buxzVar.m(ConversationIdType.this);
                        buxzVar.an(axuh.b);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                buxm b4 = d2.b();
                buxo d3 = MessagesTable.d();
                d3.z("+getConversationMessagesUpdatedDataSource");
                d3.u();
                d3.h(new Function() { // from class: twu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        buxzVar.m(ConversationIdType.this);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d3.n(b4.u(), "message_count");
                d3.n(b3.u(), "unread_count");
                final txl txlVar3 = (txl) twrVar2;
                H.M(((txl) twrVar2).c.a(d3.b(), new byzu() { // from class: twv
                    @Override // defpackage.byzu
                    public final elfl a(Object obj) {
                        final buxm buxmVar = (buxm) obj;
                        return elfo.g(new Callable() { // from class: tws
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                buuo buuoVar = (buuo) buxm.this.o();
                                try {
                                    tyn tynVar = buuoVar.moveToFirst() ? new tyn(Integer.parseInt(buuoVar.dd("message_count")), Integer.parseInt(buuoVar.dd("unread_count"))) : new tyn(0, 0);
                                    buuoVar.close();
                                    return tynVar;
                                } catch (Throwable th) {
                                    try {
                                        buuoVar.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }, txl.this.d);
                    }
                }, "message_count", P), new vvi(H));
                H.M(H.o.a().a(), new vtt(H));
                twr twrVar3 = H.Q;
                H.M(((byzz) ((txl) twrVar3).n.b()).a(((aqvh) ((txl) twrVar3).o.b()).a(), "self_identity", P), new vty(H));
                H.M(H.o.e().a(), new vtz(H));
                if (H.cl.b()) {
                    H.M(H.o.c().a(), new vtw(H));
                } else {
                    ejuh a2 = H.o.b().a();
                    H.M(a2, new vtx(H));
                    final cuyd cuydVar = H.aB;
                    H.M(new ejuw(a2, new eroh() { // from class: cuya
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            ParticipantsTable.BindData a3 = ((bctw) obj).a();
                            if (a3 == null) {
                                cuyd.a.m("Participant was null");
                                return elfo.e(new cuyc(1));
                            }
                            if (!a3.D().a()) {
                                cuyd.a.m("Participant is not verified sms applicable.");
                                return elfo.e(new cuyc(1));
                            }
                            final cuyd cuydVar2 = cuyd.this;
                            if (!cuydVar2.c.c()) {
                                cuyd.a.m("Verified Sms is not enabled, don't load brand info.");
                                return elfo.e(new cuyc(1));
                            }
                            if (a3.D() != byzi.VERIFICATION_VERIFIED) {
                                cuyd.a.m("Participant is unverified. Hide conversation start view.");
                                return elfo.e(new cuyc(2));
                            }
                            final String o = cuydVar2.e.q(a3).o();
                            return elfo.g(new Callable() { // from class: cuyb
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    baam baamVar = cuyd.this.d;
                                    String str = o;
                                    bpyj a4 = baamVar.a(str);
                                    Optional empty = a4 == null ? Optional.empty() : Optional.ofNullable(a4.a);
                                    if (empty.isEmpty()) {
                                        cuyd.a.r("No brand data found for sender ".concat(str));
                                        return new cuyc(2);
                                    }
                                    cuyd.a.p("Successfully loaded brand data");
                                    byul byulVar = (byul) empty.get();
                                    Uri k = byulVar.k();
                                    BusinessInfoData.Builder builder = BusinessInfoData.builder(byulVar.l());
                                    builder.setName(byulVar.n());
                                    builder.setVerifiedBrand(true);
                                    builder.setDescription(byulVar.m());
                                    builder.setLogoImageLocalUri(k == null ? null : k.toString());
                                    return new cuyc(builder.build());
                                }
                            }, cuydVar2.b);
                        }
                    }, cuydVar.b), new vtr(H));
                }
                twr twrVar4 = H.Q;
                final ConversationIdType conversationIdType3 = H.M;
                final ahrl ahrlVar = ((txl) twrVar4).u;
                blxv a3 = blxy.a();
                a3.z("+getMessageAnnotationsDataSource");
                if (conversationIdType3.b()) {
                    a3.r();
                } else {
                    a3.c(new Function() { // from class: ahrh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            blxx blxxVar = (blxx) obj;
                            blxxVar.b(ConversationIdType.this);
                            return blxxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
                H.M(ahrlVar.a.a(a3.b(), new byzu() { // from class: ahri
                    @Override // defpackage.byzu
                    public final elfl a(Object obj) {
                        final blxu blxuVar = (blxu) obj;
                        erov f = eldl.f(new erov() { // from class: ahrj
                            @Override // defpackage.erov
                            public final Object a(erpc erpcVar) {
                                blxt blxtVar = (blxt) blxu.this.o();
                                erpcVar.a(blxtVar, erpp.a);
                                return blxtVar;
                            }
                        });
                        ahrl ahrlVar2 = ahrl.this;
                        return elfl.g(erph.c(f, ahrlVar2.b).e(eldl.g(new erow() { // from class: ahrk
                            @Override // defpackage.erow
                            public final Object a(erpc erpcVar, Object obj2) {
                                return bttf.a((blxt) obj2).cW();
                            }
                        }), ahrlVar2.b).g());
                    }
                }, "message_annotations", P), new vvj(H));
                ea eaVar = H.N;
                lkk P2 = eaVar.P();
                tyk tykVar = H.S;
                eaVar.z().getClass();
                ejuh b5 = tykVar.b(P2, H.M, H.a());
                H.M(b5, new vto(H));
                H.M(H.S.a(b5), new vtq(H));
                final avjw avjwVar = (avjw) H.bE.b();
                final ConversationIdType conversationIdType4 = H.M;
                H.M(new ejuy(avjwVar.a, new eros() { // from class: avjk
                    @Override // defpackage.eros
                    public final erph a(erpc erpcVar) {
                        return new erph(avjw.this.a(conversationIdType4));
                    }
                }, "RBM_SPAM_CONTENT_KEY".concat(String.valueOf(conversationIdType4.a()))), new vua(H));
                twr twrVar5 = H.Q;
                ConversationIdType conversationIdType5 = H.M;
                twq twqVar = ((txl) twrVar5).e;
                errl errlVar = (errl) twqVar.a.b();
                errlVar.getClass();
                errl errlVar2 = (errl) twqVar.b.b();
                errlVar2.getClass();
                cqoh cqohVar = (cqoh) twqVar.c.b();
                cqohVar.getClass();
                avff avffVar = (avff) twqVar.d.b();
                avffVar.getClass();
                cowf cowfVar = (cowf) twqVar.e.b();
                cowfVar.getClass();
                cers cersVar = (cers) twqVar.f.b();
                cersVar.getClass();
                H.M(new twp(errlVar, errlVar2, cqohVar, avffVar, cowfVar, cersVar, conversationIdType5), new vtg(H));
                H.M(H.T.b(P, H.M), new vth(H));
                final udz a4 = H.aZ.a(H.M);
                H.cg = a4;
                H.M((ejuh) H.I(new Function() { // from class: vpn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return axoo.a(vvn.this.db, Optional.empty());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: vpo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        vvn vvnVar = vvn.this;
                        MessageCoreData messageCoreData = vvnVar.cy;
                        if (messageCoreData == null || messageCoreData.U() == null) {
                            boolean z = true;
                            if (messageCoreData != null && messageCoreData.U() != null) {
                                z = false;
                            }
                            emxf.b(z, "DraftDataService does not accept incoming drafts that are replies");
                        } else {
                            ((ensz) ((ensz) udz.a.j()).h("com/google/android/apps/messaging/conversation/draft/dataservice/DraftDataService", "readDraftData", 177, "DraftDataService.java")).q("DraftDataService does not accept incoming drafts that are replies: clearing the reply context");
                            messageCoreData.bO(null);
                        }
                        eisx eisxVar = vvnVar.cd;
                        udz udzVar = a4;
                        udzVar.p.set(ueb.a);
                        udzVar.q.set(messageCoreData);
                        return udzVar.a(eisxVar);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }), new vud(H));
                if (((Boolean) ctjd.e.e()).booleanValue()) {
                    H.M(H.T.a(P, H.M), new vti(H));
                }
                H.aw.b(H.bh.a(), new vtj(H));
                if (H.ck == null) {
                    wdd wddVar = H.R;
                    ffjm ffjmVar = new ffjm() { // from class: vpp
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            final SelfIdentityId selfIdentityId = (SelfIdentityId) obj;
                            final Integer num = (Integer) obj2;
                            final vvn vvnVar = vvn.this;
                            Consumer consumer = new Consumer() { // from class: voe
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj3) {
                                    ((uav) obj3).d().T(selfIdentityId, num.intValue());
                                    vvn.this.aW();
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                    return Consumer$CC.$default$andThen(this, consumer2);
                                }
                            };
                            Consumer consumer2 = new Consumer() { // from class: vof
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj3) {
                                    vvn vvnVar2 = vvn.this;
                                    ((bcvr) vvnVar2.cM.a()).T(selfIdentityId, num.intValue());
                                    vvnVar2.aW();
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer3) {
                                    return Consumer$CC.$default$andThen(this, consumer3);
                                }
                            };
                            if (!vvnVar.ba()) {
                                consumer2.o(vvnVar.cv);
                            } else if (vvnVar.N.aF()) {
                                uav w = vvnVar.w();
                                w.getClass();
                                consumer.o(w);
                            } else {
                                ensk j = vvn.a.j();
                                j.Y(ente.a, "Bugle");
                                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "switchSelectedSimInDraft", 7689, "ConversationFragmentPeer.java")).q("Not showing SIM picker dialog; fragment not initialized.");
                            }
                            return ffcu.a;
                        }
                    };
                    ejwl ejwlVar = (ejwl) wddVar.b.b();
                    ejwlVar.getClass();
                    wez wezVar = (wez) wddVar.c.b();
                    wezVar.getClass();
                    wds wdsVar = (wds) wddVar.d.b();
                    wdsVar.getClass();
                    H.ck = new wdc(ejwlVar, wezVar, wdsVar, wddVar.e, wddVar.f, ffjmVar);
                }
                wdc wdcVar = H.ck;
                wdcVar.i = bundle2 != null ? bundle2.containsKey("saved_instance_state_active_sim_checker_key") : false;
                ejwl ejwlVar2 = wdcVar.b;
                final wez wezVar2 = wdcVar.c;
                final Boolean bool = (Boolean) ((cfup) wfa.a.get()).e();
                tzj tzjVar = (tzj) wezVar2.c.a(tzj.class);
                ejwlVar2.b(ejvb.a(tzjVar.e().a(), tzjVar.a().a(), new ejke() { // from class: weu
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejke
                    public final Object a(Object obj, Object obj2) {
                        wez wezVar3 = wez.this;
                        Optional optional = (Optional) obj2;
                        wezVar3.d.j((engw) obj);
                        if (!optional.isPresent()) {
                            return wex.a;
                        }
                        Boolean bool2 = bool;
                        SelfIdentityId c = aqvf.c(((bejf) optional.get()).m());
                        bool2.getClass();
                        bdtd bdtdVar = wezVar3.d;
                        boolean booleanValue = bool2.booleanValue();
                        aztg d4 = bdtdVar.d(c);
                        List i = wezVar3.d.i();
                        i.getClass();
                        ArrayList arrayList = new ArrayList();
                        enqv it = ((engw) i).iterator();
                        while (it.hasNext()) {
                            E next = it.next();
                            if (!((aztg) next).j()) {
                                arrayList.add(next);
                            }
                        }
                        if (d4 != null && d4.i() && d4.e() >= 0) {
                            if (booleanValue) {
                                ensk h = wez.a.h();
                                h.Y(ente.a, "BugleConversation");
                                ((enrr) h.h("com/google/android/apps/messaging/conversation/simpicker/dataservice/MultiSimDialogPickerDataService", "multiSimDialogDataFromSelfParticipantId", 86, "MultiSimDialogPickerDataService.kt")).D("Should not display SIM picker dialog: there is an active subscription (%d) for conversation's self participant (%s).", Integer.valueOf(d4.e()), c);
                            }
                            return wex.a;
                        }
                        if (arrayList.isEmpty()) {
                            if (booleanValue) {
                                ensk h2 = wez.a.h();
                                h2.Y(ente.a, "BugleConversation");
                                ((enrr) h2.h("com/google/android/apps/messaging/conversation/simpicker/dataservice/MultiSimDialogPickerDataService", "multiSimDialogDataFromSelfParticipantId", 98, "MultiSimDialogPickerDataService.kt")).D("Should not display SIM picker dialog: the conversation's self participant (%s) subscription (%d) is inactive but there are no other active subscriptions.", c, d4 != null ? Integer.valueOf(d4.e()) : null);
                            }
                            return wex.a;
                        }
                        if (arrayList.size() != 1) {
                            if (booleanValue) {
                                ensk h3 = wez.a.h();
                                h3.Y(ente.a, "BugleConversation");
                                ((enrr) h3.h("com/google/android/apps/messaging/conversation/simpicker/dataservice/MultiSimDialogPickerDataService", "multiSimDialogDataFromSelfParticipantId", 127, "MultiSimDialogPickerDataService.kt")).J("Should display multi SIM picker dialog: the conversation's self participant (%s) subscription (%d) is inactive and there are %d active subscriptions.", c, d4 != null ? Integer.valueOf(d4.e()) : null, Integer.valueOf(arrayList.size()));
                            }
                            return new wew(arrayList);
                        }
                        aztg aztgVar = (aztg) ffdx.K(arrayList);
                        SelfIdentityId g = aztgVar.g();
                        int e2 = aztgVar.e();
                        if (booleanValue) {
                            ensk h4 = wez.a.h();
                            h4.Y(ente.a, "BugleConversation");
                            ((enrr) h4.h("com/google/android/apps/messaging/conversation/simpicker/dataservice/MultiSimDialogPickerDataService", "multiSimDialogDataFromSelfParticipantId", 113, "MultiSimDialogPickerDataService.kt")).K("Should automatically switch to only available SIM: the conversation's self participant (%s) subscription (%d) is inactive and there is only a single active subscription (subId: %d, selfParticipantId: %s).", c, d4 != null ? Integer.valueOf(d4.e()) : null, Integer.valueOf(e2), g);
                        }
                        return new wev(g, e2);
                    }
                }, wezVar2.b), wdcVar.j);
                H.bT.isPresent();
                if (ctjd.c()) {
                    H.M(((wgw) H.bT.get()).a(), new vtk(H));
                    ((Optional) H.bf.b()).ifPresent(new Consumer() { // from class: vpq
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            final vvn vvnVar = vvn.this;
                            ((cync) obj).h(new cynb() { // from class: vnr
                                @Override // defpackage.cynb
                                public final void gl() {
                                    ensk e2 = vvn.a.e();
                                    e2.Y(ente.a, "Bugle");
                                    enrr enrrVar2 = (enrr) e2;
                                    vvn vvnVar2 = vvn.this;
                                    enrrVar2.Y(csux.p, vvnVar2.M);
                                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "addSubscriptionMixins", 2418, "ConversationFragmentPeer.java")).q("ConversationFragment: Updating Magic Compose visibility on conversation scale change");
                                    vvnVar2.aN();
                                }
                            });
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                if (ctjd.c() && ((Boolean) ((cfup) ctjd.aY.get()).e()).booleanValue()) {
                    final woi woiVar = (woi) H.bU.b();
                    H.M(new ejuy(woiVar.d, new eros() { // from class: wnr
                        @Override // defpackage.eros
                        public final erph a(erpc erpcVar) {
                            elfl c;
                            woi woiVar2 = woi.this;
                            c = axol.c(woiVar2.a, ffhe.a, ffsm.a, new wnv(woiVar2, null));
                            return new erph(c);
                        }
                    }, "MAGIC_COMPOSE_SETTINGS_DATASERVICE_KEY"), new vtl(H));
                }
                if (bundle2 != null) {
                    bcqs bcqsVar = (bcqs) H.cA.a();
                    if (bcqsVar.l == null) {
                        bcqsVar.l = new bcyl(bundle2);
                    }
                    H.I = bundle2.getString("saved_instance_state_clicked_suggestion_id");
                } else {
                    bundle2 = null;
                }
                H.S(new Consumer() { // from class: vqv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        uav uavVar = (uav) obj;
                        bcpw bcpwVar = new bcpw(uavVar.e().H().s());
                        final vvn vvnVar = vvn.this;
                        vvnVar.cM = bcpwVar;
                        uavVar.e().addOnLayoutChangeListener(new elbi(vvnVar.aT, new View.OnLayoutChangeListener() { // from class: vsl
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                                vvn.this.aP(i4 - i2);
                            }
                        }));
                        vvnVar.aq();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: vqw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        final ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                        final vvn vvnVar = vvn.this;
                        final Bundle bundle3 = bundle2;
                        vvnVar.T(null, new Consumer() { // from class: voz
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                vvn vvnVar2 = vvn.this;
                                cpbs cpbsVar = vvnVar2.au;
                                ComposeMessageView composeMessageView2 = composeMessageView;
                                Activity p = vvnVar2.p();
                                vvn A = vvnVar2.A();
                                cxtc H2 = composeMessageView2.H();
                                vjt vjtVar = vvnVar2.cC;
                                fr I = vvnVar2.N.I();
                                cpbn a5 = cpbsVar.a(vvnVar2.a());
                                bcpw s = composeMessageView2.H().s();
                                czgk czgkVar = vvnVar2.ac;
                                czfy czfyVar = (czfy) czgkVar.a.b();
                                czfyVar.getClass();
                                czfh czfhVar = (czfh) czgkVar.b.b();
                                czfhVar.getClass();
                                alct alctVar = (alct) czgkVar.c.b();
                                alctVar.getClass();
                                alcb alcbVar = (alcb) czgkVar.d.b();
                                alcbVar.getClass();
                                czgc czgcVar = (czgc) czgkVar.e.b();
                                czgcVar.getClass();
                                dede dedeVar = (dede) czgkVar.f.b();
                                dedeVar.getClass();
                                ctud ctudVar = (ctud) czgkVar.g.b();
                                ctudVar.getClass();
                                csmj csmjVar = (csmj) czgkVar.h.b();
                                csmjVar.getClass();
                                ((altk) czgkVar.i.b()).getClass();
                                cqoh cqohVar2 = (cqoh) czgkVar.j.b();
                                cqohVar2.getClass();
                                ddzb ddzbVar = (ddzb) czgkVar.k.b();
                                ddzbVar.getClass();
                                ((Optional) czgkVar.l.b()).getClass();
                                vjtVar.getClass();
                                I.getClass();
                                csuk csukVar = vvnVar2.X;
                                csukVar.getClass();
                                vvnVar2.ct = new czgj(czfyVar, czfhVar, alctVar, alcbVar, czgcVar, dedeVar, ctudVar, csmjVar, cqohVar2, ddzbVar, czgkVar.m, p, A, H2, vjtVar, I, csukVar, a5, vvnVar2.cA, s, vvnVar2.ba);
                                vvnVar2.ct.r(bundle3);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        composeMessageView.H().K(new bcpw(vvnVar.cA));
                        vvnVar.cM = composeMessageView.H().s();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ((bcvr) H.cM.a()).D(H.A());
                H.cC.c();
                final uuy uuyVar = H.cx;
                uuyVar.aL = new bcpw(H.cA);
                uuyVar.aZ.ifPresent(new Consumer() { // from class: uso
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((ajvi) obj).c(uuy.this.aL);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                H.cx.A();
                final cycm cycmVar = (cycm) H.ad.b();
                final ConversationIdType conversationIdType6 = H.M;
                axnw.h(elfo.f(new Runnable() { // from class: cycl
                    @Override // java.lang.Runnable
                    public final void run() {
                        ekzz f = eleg.f("AddContactBannerDatabaseOperations#incrementConversationOpenCount");
                        cycm cycmVar2 = cycm.this;
                        ConversationIdType conversationIdType7 = conversationIdType6;
                        try {
                            int a5 = cycmVar2.a(conversationIdType7);
                            if (a5 <= ((Integer) cybw.a.e()).intValue() + 1) {
                                bczy bczyVar = (bczy) cycmVar2.a.b();
                                String[] strArr = bsom.a;
                                bsoe bsoeVar = new bsoe();
                                bsoeVar.ap("incrementConversationOpenCount");
                                bsoeVar.E(a5 + 1);
                                bczyVar.ak(conversationIdType7, bsoeVar);
                            }
                            f.close();
                        } catch (Throwable th) {
                            try {
                                f.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, cycmVar.b));
                H.dc.a(H.M).t();
                if (H.ai.i()) {
                    bduy bduyVar = H.ak;
                    bduyVar.c = H.M;
                    H.N.P().c(bduyVar);
                }
                cxyt cxytVar = (cxyt) H.N.I().h("banners2oFragment");
                if (cxytVar == null) {
                    ConversationIdType conversationIdType7 = H.M;
                    cxyw cxywVar = cxyw.CONVERSATION;
                    entd entdVar = cxze.a;
                    cxyu cxyuVar = (cxyu) cxyx.a.createBuilder();
                    String a5 = conversationIdType7.a();
                    cxyuVar.copyOnWrite();
                    cxyx cxyxVar = (cxyx) cxyuVar.instance;
                    a5.getClass();
                    cxyxVar.b |= 1;
                    cxyxVar.c = a5;
                    cxyuVar.copyOnWrite();
                    cxyx cxyxVar2 = (cxyx) cxyuVar.instance;
                    cxyxVar2.d = cxywVar.d;
                    cxyxVar2.b |= 2;
                    cxyx cxyxVar3 = (cxyx) cxyuVar.build();
                    cxyt cxytVar2 = new cxyt();
                    fbae.e(cxytVar2);
                    ekku.a(cxytVar2, cxyxVar3);
                    cxytVar = cxytVar2;
                }
                cg cgVar = new cg(H.N.I());
                cgVar.x(R.id.banners_fragment, cxytVar, "banners2oFragment");
                cgVar.c();
                H.cu = new vvk(H);
                H.T(new Consumer() { // from class: vqx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((ugg) obj).d(vvn.this.cu);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, null);
                H.bq();
                if (((Boolean) ((cfup) cyml.a.get()).e()).booleanValue()) {
                    cymk cymkVar = (cymk) H.N.I().h("ConversationBottomBarFragmentTag");
                    if (cymkVar == null) {
                        cymk cymkVar2 = new cymk();
                        fbae.e(cymkVar2);
                        H.cw = cymkVar2;
                    } else {
                        H.cw = cymkVar;
                    }
                    H.cw.a.c(new vvg(H));
                    cg cgVar2 = new cg(H.N.I());
                    cgVar2.x(R.id.conversation_bottom_bar_fragment, H.cw, "ConversationBottomBarFragmentTag");
                    cgVar2.c();
                }
            } else {
                ensk i = vvn.a.i();
                i.Y(ente.a, "Bugle");
                enrr enrrVar2 = (enrr) i;
                enrrVar2.Y(csux.p, H.M);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onActivityCreated", 2097, "ConversationFragmentPeer.java")).q("ConversationFragment: binding is not bound, user left conversation before it was created.");
                H.p().finish();
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.c.f();
        try {
            aV(i, i2, intent);
            final vvn H = H();
            if (i != 5001) {
                if (i == 132) {
                    if (i2 == -1) {
                        uot uotVar = H.y;
                        MediaContentItem mediaContentItem = (MediaContentItem) intent.getParcelableExtra("gif_content_item");
                        mediaContentItem.getClass();
                        epts eptsVar = epts.GIF;
                        dcle dcleVar = dcle.a;
                        H.c(uotVar.a(mediaContentItem, dcle.b(eptsVar, eptu.EXPANDED)));
                    } else {
                        i = 132;
                    }
                }
                if (i == 143) {
                    if (i2 == -1) {
                        Uri data = intent.getData();
                        if (data != null) {
                            H.ag.c(data, new ddzp() { // from class: vma
                                @Override // defpackage.ddzp
                                public final void a(Uri uri) {
                                    vvn vvnVar = vvn.this;
                                    vvnVar.c(vvnVar.aK.a(uri, eohh.CONTACT_SUGGESTION).a());
                                }
                            });
                        }
                    } else {
                        i = 143;
                    }
                }
                if (i == 152 && i2 == -1) {
                    Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                    if (uri != null) {
                        bcwz bcwzVar = H.aV;
                        bcxb C = bcxc.C();
                        ((bcqk) C).c = intent.getType();
                        ((bcqk) C).d = uri;
                        ((bcqk) C).e = uri;
                        C.o(eohh.MEDIA_EDITOR_ATTACH);
                        H.c(bcwzVar.c(C.r()));
                    }
                } else if (((Boolean) dedt.a.e()).booleanValue() && i == 501 && i2 == -1 && intent.getData() != null) {
                    Uri a = dedu.a(intent.getData(), ((Boolean) uky.g.e()).booleanValue() ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : bdjd.a());
                    bcwz bcwzVar2 = H.aV;
                    bcxb C2 = bcxc.C();
                    ((bcqk) C2).c = "video/mp4";
                    ((bcqk) C2).d = a;
                    ((bcqk) C2).e = a;
                    C2.o(eohh.VIDEO_TRIMMER);
                    final MessagePartData c = bcwzVar2.c(C2.r());
                    if (((Boolean) uky.g.e()).booleanValue()) {
                        H.T(new Consumer() { // from class: vmb
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                enru enruVar = vvn.a;
                                ((ugg) obj).i(Collections.singletonList(MessagePartCoreData.this));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, null);
                    }
                    H.c(c);
                } else if (i == 1 && i2 == -1) {
                    H.af();
                }
            } else if (i2 == -1) {
                Context z = H.N.z();
                z.getClass();
                Toast.makeText(z, R.string.calendar_event_added, 0).show();
                String str = H.I;
                H.I = null;
                if (str != null) {
                    axnw.h(((ctjh) H.bi.b()).a(str));
                    ((ctqh) H.bd.b()).a(H.M, str, fbre.CONSUMED).k(axnw.b(), erpp.a);
                }
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vxx, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.efaf, defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        BugleSearchView bugleSearchView;
        super.ah(menu, menuInflater);
        vvn H = H();
        if (H.cC.a().isPresent()) {
            return;
        }
        menuInflater.inflate(R.menu.conversation_menu, menu);
        bcqs bcqsVar = (bcqs) H.cA.a();
        if (((Boolean) adwg.a.e()).booleanValue()) {
            menu.findItem(R.id.action_help_and_feedback).setVisible(false);
            menu.findItem(R.id.action_help).setVisible(true);
            menu.findItem(R.id.action_advanced_feedback).setVisible(true);
        }
        if (H.aZ()) {
            menu.findItem(R.id.action_search_starred_messages).setVisible(true).setTitle(R.string.action_search_starred_messages);
        }
        if (((Boolean) cnvu.a.e()).booleanValue()) {
            menu.findItem(R.id.action_show_subject_field).setVisible(((Boolean) H.I(new Function() { // from class: vsc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    enru enruVar = vvn.a;
                    return Boolean.valueOf(((uav) obj).e().H().U());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: vsd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    enru enruVar = vvn.a;
                    return Boolean.valueOf(((ComposeMessageView) obj).H().U());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })).booleanValue());
        }
        if (bcqsVar.p()) {
            menu.findItem(R.id.action_info_and_options).setVisible(true);
            menu.findItem(R.id.action_people_and_options).setVisible(false);
            menu.findItem(R.id.action_add_contact).setVisible(false);
            menu.findItem(R.id.action_block_and_report_spam).setVisible(true);
        } else {
            menu.findItem(R.id.action_info_and_options).setVisible(false);
            MenuItem findItem = menu.findItem(R.id.action_people_and_options);
            findItem.setTitle(true != bcqsVar.d.y() ? R.string.action_people_and_options : R.string.action_people_and_options_group);
            findItem.setEnabled(bcqsVar.f);
            if (((Boolean) ((cfup) cubs.i.get()).e()).booleanValue() && !bcqsVar.d.y()) {
                menu.findItem(R.id.action_block_and_report_spam).setVisible(true);
            }
            ParticipantsTable.BindData a = bcqsVar.g.a();
            menu.findItem(R.id.action_add_contact).setVisible((a == null || !TextUtils.isEmpty(a.T()) || bdqu.n(a) || !((bcqs) H.cA.a()).n() || a.D().a()) ? false : true);
        }
        byyt byytVar = ((typ) bcqsVar.d).a;
        menu.findItem(R.id.action_archive).setVisible(!byytVar.d());
        menu.findItem(R.id.action_unarchive).setVisible(byytVar.d() && !byytVar.h());
        boolean h = byytVar.h();
        boolean z = !h;
        bcqs bcqsVar2 = (bcqs) H.cA.a();
        TelephonyManager telephonyManager = (TelephonyManager) ((ctvs) H.aq.d.b()).d.get();
        boolean z2 = (telephonyManager == null || !telephonyManager.isVoiceCapable() || !bcqsVar2.g.d().isPresent() || bcqsVar2.g.h() || h) ? false : true;
        H.r = menu.findItem(R.id.action_call);
        H.r.setVisible(z2);
        menu.findItem(R.id.action_call).setVisible(z2);
        if (((Boolean) cvfg.a.e()).booleanValue() && bcqsVar.f) {
            H.aR(menu, z);
        }
        H.t = menu.findItem(R.id.action_rbm_verification_badge);
        H.aQ();
        if (H.aE) {
            ((dafa) H.al.b()).a(menu.addSubMenu(0, 0, 1000, "Debug"), true);
        }
        if (!H.aW.isEmpty()) {
            H.p = menu.findItem(R.id.action_search);
            H.bs(H.p);
            MenuItem menuItem = H.p;
            if (menuItem != null && (bugleSearchView = (BugleSearchView) menuItem.getActionView()) != null) {
                bugleSearchView.setMaxWidth(Alert.DURATION_SHOW_INDEFINITELY);
                bugleSearchView.setQueryHint(H.N.B().getString(R.string.search_hint));
                elhm elhmVar = new elhm(H.aU, new vuf(H, bugleSearchView));
                MenuItem menuItem2 = H.p;
                menuItem2.getClass();
                menuItem2.setOnActionExpandListener(new vuh(H));
                if (H.cp != null) {
                    H.p.expandActionView();
                    bugleSearchView.setOnQueryTextListener(elhmVar);
                    bugleSearchView.clearFocus();
                    bugleSearchView.setQuery(H.cp, false);
                    H.Z();
                } else {
                    H.aW.ifPresent(new Consumer() { // from class: vta
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ((czqb) obj).b();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    H.Z();
                }
            }
        }
        H.q = menu.findItem(R.id.action_zero_state_search);
        H.bs(H.q);
        menu.findItem(R.id.action_search).setVisible(false);
        menu.findItem(R.id.action_zero_state_search).setVisible(true);
        MenuItem findItem2 = menu.findItem(R.id.action_add_recipients);
        if (H.bb.a) {
            H.u = false;
            findItem2.setVisible(false);
        } else {
            menu.findItem(R.id.action_add_contact).setVisible(false);
            Intent s = H.s();
            boolean z3 = s != null && s.getBooleanExtra("render_add_recipient_button", false);
            H.u = z3;
            if (!z3) {
                findItem2.setShowAsAction(0);
            }
            findItem2.setVisible(!bcqsVar.p());
        }
        cvde.a(menu);
        wpg wpgVar = H.bA;
        enqu listIterator = ((enpd) wpgVar.a).listIterator();
        while (listIterator.hasNext()) {
            ((wpf) listIterator.next()).b();
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ai() {
        elav b = this.c.b();
        try {
            ba();
            vvn H = H();
            H.cK = false;
            H.S(null, new Consumer() { // from class: vnl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                    enru enruVar = vvn.a;
                    if (composeMessageView != null) {
                        composeMessageView.H().R();
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (H.cA.g()) {
                H.cA.f();
            }
            Object obj = H.F;
            Activity p = H.p();
            if (((Boolean) cful.T.e()).booleanValue()) {
                try {
                    p.unregisterReceiver((BroadcastReceiver) obj);
                } catch (IllegalArgumentException e) {
                    wdf.a.s("Exception while un-registering receiver", e);
                }
            }
            Object obj2 = H.E;
            Activity p2 = H.p();
            try {
                if (DefaultSmsSubscriptionChangeReceiver.f()) {
                    p2.unregisterReceiver((BroadcastReceiver) obj2);
                }
            } catch (IllegalArgumentException e2) {
                DefaultSmsSubscriptionChangeReceiver.a.s("Exception while un-registering receiver", e2);
            }
            decz deczVar = H.B;
            if (deczVar != null) {
                H.aD.h(deczVar);
            }
            iv ivVar = H.d;
            if (ivVar != null) {
                ivVar.dismiss();
                H.d = null;
            }
            if (ctjd.c()) {
                ((Optional) H.bV.b()).ifPresent(new Consumer() { // from class: vnm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        enru enruVar = vvn.a;
                        ((wmu) obj3).i();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            ((wge) H.O.a(wge.class)).f = null;
            ((cojr) H.cc.b()).c();
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
    public final void al(boolean z) {
        H().T(null, new Consumer() { // from class: vpf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                czgj czgjVar = (czgj) obj;
                enru enruVar = vvn.a;
                if (czgjVar != null) {
                    czgjVar.q();
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void am() {
        final vlk vlkVar;
        this.c.k();
        try {
            bh();
            final vvn H = H();
            H.ao();
            H.aW();
            H.cH = false;
            H.T(new Consumer() { // from class: vnp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    final ugg uggVar = (ugg) obj;
                    vvn.this.S(new Consumer() { // from class: vkh
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            enru enruVar = vvn.a;
                            ugg.this.d(((uav) obj2).e().H());
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, new Consumer() { // from class: vki
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            enru enruVar = vvn.a;
                            ugg.this.d(((ComposeMessageView) obj2).H());
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: voa
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    czgj czgjVar = (czgj) obj;
                    enru enruVar = vvn.a;
                    if (czgjVar != null) {
                        czfg czfgVar = (czfg) czgjVar.c;
                        czfgVar.j = czfgVar.i.b;
                        czgj czgjVar2 = (czgj) czfgVar.h;
                        czfgVar.d = czgjVar2.n;
                        czfgVar.k = czgjVar2.m;
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((carb) H.aR.b()).e(bdgq.a);
            lpf.a(H.p()).c(H.r());
            String[] strArr = {"Bugle.UI.ConversationActivity.Send.Duration.Sms", "Bugle.UI.ConversationActivity.Send.Duration.Mms.Text", "Bugle.UI.ConversationActivity.Send.Duration.Mms.Attachment", "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Text", "Bugle.UI.ConversationActivity.Send.Duration.Rcs.Attachment", "Bugle.UI.ConversationActivity.Send.Duration.Cloud.Sync"};
            for (int i = 0; i < 6; i++) {
                H.V.h(strArr[i]);
            }
            ensk g = vvn.a.g();
            g.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) g;
            enrrVar.Y(csux.p, H.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onPause", 4753, "ConversationFragmentPeer.java")).q("ConversationFragment: Conversation.onPause");
            H.co = -1L;
            if (H.aW.isPresent()) {
                H.P();
            }
            if (((Boolean) cnvu.a.e()).booleanValue() && (vlkVar = H.dd) != null) {
                H.bp.ifPresent(new Consumer() { // from class: vom
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = vvn.a;
                        ((aktl) obj).a.remove(vlk.this);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            ekyf.q();
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[Catch: all -> 0x010f, TRY_LEAVE, TryCatch #1 {all -> 0x010f, blocks: (B:3:0x000f, B:5:0x001d, B:8:0x0037, B:10:0x003b, B:15:0x0053, B:16:0x0087, B:19:0x00bb, B:21:0x00ca, B:22:0x00f5), top: B:2:0x000f }] */
    @Override // defpackage.efaf, defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void an(android.view.Menu r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vjs.an(android.view.Menu):void");
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ao() {
        elav b = this.c.b();
        try {
            bi();
            final vvn H = H();
            ((uph) H.bI.b()).g(4);
            H.cK = true;
            ensk e = vvn.a.e();
            e.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, H.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onResume", 3653, "ConversationFragmentPeer.java")).q("ConversationFragment: DraftDataService : refresh onResume");
            if (H.cy == null && H.cL) {
                ((bcvr) H.cM.a()).G();
            }
            H.S(new Consumer() { // from class: vkz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    uav uavVar = (uav) obj;
                    MessageCoreData messageCoreData = vvn.this.cy;
                    if (messageCoreData != null) {
                        uavVar.m(messageCoreData);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: vlc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    vvn vvnVar = vvn.this;
                    udz udzVar = vvnVar.cg;
                    udzVar.getClass();
                    udzVar.c(vvnVar.cy, false, false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            H.cy = null;
            H.cL = false;
            if (!H.ba()) {
                H.ch = false;
            }
            H.S(new Consumer() { // from class: vld
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((uav) obj).f(vvn.this.cC.ag());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: vle
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    enru enruVar = vvn.a;
                    ((ComposeMessageView) obj).H().F();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (!H.ba()) {
                H.ch = true;
            }
            if (!((Boolean) tvt.a.e()).booleanValue() && H.cC.ag()) {
                H.cC.ae();
                H.S(new Consumer() { // from class: vlf
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = vvn.a;
                        ((uav) obj).e().H().G(true);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: vlg
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = vvn.a;
                        ((ComposeMessageView) obj).H().G(true);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            H.S(null, new Consumer() { // from class: vlh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    enru enruVar = vvn.a;
                    ((ComposeMessageView) obj).H().c.ag();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            H.aA();
            H.cx.p();
            H.T(new Consumer() { // from class: vli
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    final ugg uggVar = (ugg) obj;
                    vvn.this.S(new Consumer() { // from class: vmh
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            enru enruVar = vvn.a;
                            ugg.this.d(((uav) obj2).e().H());
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, new Consumer() { // from class: vmj
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            enru enruVar = vvn.a;
                            ugg.this.d(((ComposeMessageView) obj2).H());
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: vlj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    czgj czgjVar = (czgj) obj;
                    enru enruVar = vvn.a;
                    if (czgjVar != null) {
                        czfg czfgVar = (czfg) czgjVar.c;
                        czfgVar.b.z((true != czfgVar.j ? 2 : 4) | 16);
                        if (czfgVar.j) {
                            return;
                        }
                        if (czfgVar.k || ((czgj) czfgVar.h).m) {
                            czfgVar.k = true;
                            czfgVar.h.c(false);
                            czfgVar.b();
                            czfgVar.k = false;
                            if (czfgVar.d || ((czgj) czfgVar.h).n) {
                                czfgVar.h.d(false);
                                czfgVar.h.f();
                                czfgVar.d = false;
                            }
                        }
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            lpf.a(H.p()).b(H.r(), new IntentFilter("conversation_self_id_change"));
            if (((Boolean) cnvu.a.e()).booleanValue()) {
                final vlk vlkVar = new vlk(H);
                H.dd = vlkVar;
                H.bp.ifPresent(new Consumer() { // from class: vla
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        enru enruVar = vvn.a;
                        ((aktl) obj).a.add(vlk.this);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (ctjd.c()) {
                ensk e2 = vvn.a.e();
                e2.Y(ente.a, "Bugle");
                enrr enrrVar2 = (enrr) e2;
                enrrVar2.Y(csux.p, H.M);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onResume", 3733, "ConversationFragmentPeer.java")).q("ConversationFragment: Updating Magic Compose visibility on conversation resume.");
                H.aN();
            }
            if (H.co > 0) {
                long epochMilli = H.aj.f().toEpochMilli() - H.co;
                ensk g = vvn.a.g();
                g.Y(ente.a, "Bugle");
                enrr enrrVar3 = (enrr) g;
                enrrVar3.Y(csux.p, H.M);
                ((enrr) enrrVar3.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onResume", 3742, "ConversationFragmentPeer.java")).s("ConversationFragment: Conversation load time (msec): %d", epochMilli);
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            ellg.b(this).b = view;
            H();
            vxi.a(this, H());
            bm(view, bundle);
            ((arcs) H().bz.b()).d();
            ((ViewStub) view.findViewById(R.id.conversation_statusbar_scrim_stub)).inflate();
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

    @Override // defpackage.vxx
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

    @Override // defpackage.ellr
    public final elli e(ellf ellfVar) {
        return this.ag.a(ellfVar);
    }

    @Override // defpackage.ellr
    public final void f(Class cls, ellh ellhVar) {
        this.ag.b(cls, ellhVar);
    }

    @Override // defpackage.vxx, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    Activity activity = (Activity) ((akgo) aX).d.i.b();
                    wpk wpkVar = (wpk) ((akgo) aX).v.b();
                    crnx crnxVar = (crnx) ((akgo) aX).a.a.Df.b();
                    cuyd cuydVar = new cuyd((errl) ((akgo) aX).a.t.b(), (aolr) ((akgo) aX).a.a.Z.b(), (cuye) ((akgo) aX).a.a.ff.b(), (baam) ((akgo) aX).b.on.b());
                    ctvb ctvbVar = (ctvb) ((akgo) aX).a.a.u.b();
                    fazb a = fbaz.a(((akgo) aX).u);
                    cqoh cqohVar = (cqoh) ((akgo) aX).a.cz.b();
                    akfv akfvVar = ((akgo) aX).d;
                    bzac bC = akfvVar.b.bC();
                    errl errlVar = (errl) akfvVar.b.aK.b();
                    akko akkoVar = akfvVar.b.b;
                    ahrl ahrlVar = new ahrl(akkoVar.a.bC(), (errl) akkoVar.a.t.b());
                    akis akisVar = akfvVar.b;
                    twq twqVar = new twq(akisVar.t, akisVar.p, akisVar.cz, akisVar.a.uf, akisVar.li, akfvVar.c.eu);
                    bcsf bcsfVar = (bcsf) akfvVar.b.a.vK.b();
                    errl errlVar2 = (errl) akfvVar.b.p.b();
                    akhy akhyVar = akfvVar.c;
                    fbbf fbbfVar = akhyVar.cD;
                    fbbf fbbfVar2 = akhyVar.fc;
                    akkp akkpVar = akfvVar.b.a;
                    txl txlVar = new txl(bC, errlVar, ahrlVar, twqVar, bcsfVar, errlVar2, fbbfVar, fbbfVar2, akkpVar.nK, akkpVar.ej, akhyVar.gn, akhyVar.df, akkpVar.Z, akfvVar.y, akhyVar.M, akkpVar.rq, akkpVar.vL, akhyVar.cX, akhyVar.fd, (atky) akkpVar.rs.b());
                    fbbf fbbfVar3 = ((akgo) aX).d.i;
                    fbbf fbbfVar4 = ((akgo) aX).g;
                    fbbf fbbfVar5 = ((akgo) aX).bL;
                    fbbf fbbfVar6 = ((akgo) aX).bO;
                    akkp akkpVar2 = ((akgo) aX).a.a;
                    wdd wddVar = new wdd(fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, akkpVar2.f, akkpVar2.Pu);
                    tym a2 = ((akgo) aX).d.a();
                    cwjx cwjxVar = (cwjx) ((akgo) aX).a.b.fk.b();
                    fbbf fbbfVar7 = ((akgo) aX).bP;
                    fbbf fbbfVar8 = ((akgo) aX).bQ;
                    fbbf fbbfVar9 = ((akgo) aX).an;
                    fbbf fbbfVar10 = ((akgo) aX).p;
                    fbbf fbbfVar11 = ((akgo) aX).bR;
                    akis akisVar2 = ((akgo) aX).a;
                    fbbf fbbfVar12 = akisVar2.b.iq;
                    fbbf fbbfVar13 = akisVar2.cT;
                    fbbf fbbfVar14 = ((akgo) aX).bS;
                    akkp akkpVar3 = akisVar2.a;
                    czgk czgkVar = new czgk(fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, fbbfVar14, akkpVar3.fP, akisVar2.cz, akkpVar3.nk, ((akgo) aX).bT, ((akgo) aX).F);
                    Optional optional = (Optional) ((akgo) aX).w.b();
                    akzt akztVar = (akzt) ((akgo) aX).a.a.f.b();
                    fazb a3 = fbaz.a(((akgo) aX).b.oO);
                    ddxs ddxsVar = (ddxs) ((akgo) aX).bm.b();
                    bcvs bcvsVar = (bcvs) ((akgo) aX).D.b();
                    cstx cstxVar = (cstx) ((akgo) aX).a.cp.b();
                    csuk csukVar = (csuk) ((akgo) aX).a.a.ha.b();
                    dfpi dfpiVar = (dfpi) ((akgo) aX).a.dF.b();
                    adsd adsdVar = (adsd) ((akgo) aX).a.a.fo.b();
                    fbbf fbbfVar15 = ((akgo) aX).b.ob;
                    csmj csmjVar = (csmj) ((akgo) aX).bS.b();
                    akis akisVar3 = ((akgo) aX).a;
                    alcz alczVar = new alcz(akisVar3.a.dF, new alcs(), (Executor) akisVar3.p.b());
                    cpbs cpbsVar = (cpbs) ((akgo) aX).a.a.ft.b();
                    cpbw cpbwVar = (cpbw) ((akgo) aX).a.a.fw.b();
                    ctml ctmlVar = (ctml) ((akgo) aX).a.a.ni.b();
                    fbbf fbbfVar16 = ((akgo) aX).b.bb;
                    azze azzeVar = (azze) ((akgo) aX).a.a.fx.b();
                    fbbf fbbfVar17 = ((akgo) aX).d.r;
                    cskx cskxVar = (cskx) ((akgo) aX).a.a.alj.b();
                    csjk csjkVar = (csjk) ((akgo) aX).a.a.fQ.b();
                    cuxh cuxhVar = (cuxh) ((akgo) aX).a.a.ae.b();
                    bduy bduyVar = (bduy) ((akgo) aX).a.b.iV.b();
                    csll csllVar = (csll) ((akgo) aX).b.N.b();
                    ejwl ejwlVar = (ejwl) ((akgo) aX).g.b();
                    albq albqVar = (albq) ((akgo) aX).a.a.di.b();
                    akis akisVar4 = ((akgo) aX).a;
                    akkp akkpVar4 = akisVar4.a;
                    fbbf fbbfVar18 = akkpVar4.ej;
                    fbbf fbbfVar19 = akkpVar4.Px;
                    axul axulVar = (axul) akisVar4.b.id.b();
                    cuxz cuxzVar = (cuxz) ((akgo) aX).a.kf.b();
                    fbbf fbbfVar20 = ((akgo) aX).bU;
                    bbab bbabVar = (bbab) ((akgo) aX).b.bY.b();
                    fbbf fbbfVar21 = ((akgo) aX).a.a.fP;
                    ddzq ddzqVar = (ddzq) ((akgo) aX).ar.b();
                    cuye cuyeVar = (cuye) ((akgo) aX).a.a.ff.b();
                    fazb a4 = fbaz.a(((akgo) aX).a.a.fp);
                    cvff cY = ((akgo) aX).a.cY();
                    cztl cztlVar = new cztl(((akgo) aX).bW, ((akgo) aX).bX, (cpfi) ((akgo) aX).a.a.nn.b(), new czuc(((akgo) aX).a.a.kp()));
                    ddou ddouVar = (ddou) ((akgo) aX).a.b.iY.b();
                    uot uotVar = (uot) ((akgo) aX).T.b();
                    fazb a5 = fbaz.a(((akgo) aX).bZ);
                    dede dedeVar = (dede) ((akgo) aX).a.b.iq.b();
                    cssv cssvVar = (cssv) ((akgo) aX).a.a.db.b();
                    akhy akhyVar2 = ((akgo) aX).b;
                    fbbf fbbfVar22 = akhyVar2.P;
                    fbbf fbbfVar23 = akhyVar2.cX;
                    akis akisVar5 = akhyVar2.a;
                    crmk crmkVar = new crmk(fbbfVar22, fbbfVar23, akisVar5.a.aO, akisVar5.cz);
                    bcvw bcvwVar = (bcvw) ((akgo) aX).b.bo.b();
                    ddzb ddzbVar = (ddzb) ((akgo) aX).a.a.nk.b();
                    ddyc ddycVar = (ddyc) ((akgo) aX).ca.b();
                    Optional of = Optional.of((ddle) ((akgo) aX).bj.b());
                    dbzl dbzlVar = (dbzl) ((akgo) aX).a.b.fn.b();
                    ejlq ejlqVar = (ejlq) ((akgo) aX).f.b();
                    coly colyVar = (coly) ((akgo) aX).a.b.cc.b();
                    ctud ctudVar = (ctud) ((akgo) aX).a.cT.b();
                    fbri fbriVar = fbri.REMINDER;
                    ddkf ddkfVar = new ddkf((ea) ((fbbb) ((akgo) aX).e).a, (cnla) ((akgo) aX).b.gQ.b(), (cqoh) ((akgo) aX).a.cz.b(), (ctml) ((akgo) aX).a.a.ni.b(), (ddle) ((akgo) aX).bj.b(), (ddlv) ((akgo) aX).bi.b());
                    akis akisVar6 = ((akgo) aX).a;
                    enhk m = enhk.m(fbriVar, ddkfVar, fbri.STARRING, new cvpf((ffsk) akisVar6.a.p.b(), ((akgo) aX).d.A(), ((akgo) aX).b.aS));
                    Optional optional2 = (Optional) ((akgo) aX).b.gR.b();
                    adtn adtnVar = (adtn) ((akgo) aX).a.nX.b();
                    ellq ellqVar = (ellq) ((akgo) aX).d.e.b();
                    vzx vzxVar = (vzx) ((akgo) aX).b.oP.b();
                    fbbf fbbfVar24 = ((akgo) aX).a.a.sY;
                    bbfd bbfdVar = (bbfd) ((akgo) aX).b.fm.b();
                    aljt aljtVar = (aljt) ((akgo) aX).a.a.il.b();
                    elbx elbxVar = (elbx) ((akgo) aX).b.ap.b();
                    elhn V = ((akgo) aX).V();
                    bcwz bcwzVar = (bcwz) ((akgo) aX).a.a.ad.b();
                    Optional optional3 = (Optional) ((akgo) aX).bo.b();
                    akko akkoVar2 = ((akgo) aX).a.b;
                    fbbf fbbfVar25 = akkoVar2.ja;
                    akis akisVar7 = akkoVar2.a;
                    Optional of2 = Optional.of(new czpx(fbbfVar25, akisVar7.a.sr, (errl) akisVar7.t.b()));
                    enpx enpxVar = new enpx(new clao(((akgo) aX).b.ea()));
                    uea c = ((akgo) aX).c();
                    tam tamVar = (tam) ((akgo) aX).d.s.b();
                    Optional optional4 = (Optional) ((akgo) aX).b.fr.b();
                    Optional of3 = Optional.of(new akta((cqoh) ((akgo) aX).a.cz.b(), (acdr) ((akgo) aX).bf.b(), (ea) ((fbbb) ((akgo) aX).e).a));
                    Optional of4 = Optional.of(new aktn());
                    akis akisVar8 = ((akgo) aX).a.b.a;
                    Optional of5 = Optional.of(new akpa(akisVar8.a.dF, new akpq(), (Executor) akisVar8.p.b()));
                    akis akisVar9 = ((akgo) aX).a.b.a;
                    Optional of6 = Optional.of(new akpg(akisVar9.a.dF, new akpq(), (Executor) akisVar9.p.b()));
                    Optional of7 = Optional.of(new akqy());
                    Optional of8 = Optional.of(((akgo) aX).d.z());
                    cxzh ac = ((cyal) ((fbas) ((ekki) ((akgo) aX).d.j.b()).a).aX()).ac();
                    ac.getClass();
                    fbbf fbbfVar26 = ((akgo) aX).b.fo;
                    aolr aolrVar = (aolr) ((akgo) aX).a.a.Z.b();
                    fbbf fbbfVar27 = ((akgo) aX).b.aS;
                    fbbf fbbfVar28 = ((akgo) aX).a.a.cf;
                    fazb a6 = fbaz.a(((akgo) aX).bE);
                    fazb a7 = fbaz.a(((akgo) aX).by);
                    fbbf fbbfVar29 = ((akgo) aX).cd;
                    cvmd y = ((akgo) aX).y();
                    wgd wgdVar = new wgd(((akgo) aX).a.a.ej, (wpk) ((akgo) aX).v.b());
                    wgc e = ((akgo) aX).e();
                    fbbf fbbfVar30 = ((akgo) aX).a.kk;
                    uoy uoyVar = new uoy(new uou((byzz) ((akgo) aX).o.b(), (alxl) ((akgo) aX).b.ao.b(), (lkk) ((akgo) aX).ce.b()));
                    akfv akfvVar2 = ((akgo) aX).d;
                    uox uoxVar = new uox(enhk.m(ampg.RCS_GROUP_SELF_ONLY, akfvVar2.z, ampg.RCS_GROUP_CREATED_TOO_LARGE, akfvVar2.A));
                    fbbf fbbfVar31 = ((akgo) aX).p;
                    uaj b = ((akgo) aX).b();
                    aepz p = ((akgo) aX).p();
                    adgn adgnVar = (adgn) ((akgo) aX).x.b();
                    fbbf fbbfVar32 = ((akgo) aX).t;
                    fbbf fbbfVar33 = ((akgo) aX).a.aZ;
                    fbbf fbbfVar34 = ((akgo) aX).cf;
                    Bundle a8 = ((akgo) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgo) aX).a.b.gz.b();
                    emxf.b(a8.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    vjr vjrVar = (vjr) ProtoParsers.f(a8, "TIKTOK_FRAGMENT_ARGUMENT", vjr.a, eyfcVar);
                    vjrVar.getClass();
                    eisx eisxVar = (eisx) ((akgo) aX).b.b.b();
                    fbbf fbbfVar35 = ((akgo) aX).a.a.az;
                    wpg wpgVar = new wpg(enpd.a);
                    Optional optional5 = (Optional) ((akgo) aX).y.b();
                    akis akisVar10 = ((akgo) aX).a;
                    akko akkoVar3 = akisVar10.b;
                    axop bt = akkoVar3.bt();
                    fbbf fbbfVar36 = ((akgo) aX).cg;
                    fbbf fbbfVar37 = ((akgo) aX).ch;
                    fbbf fbbfVar38 = ((akgo) aX).ci;
                    fbbf fbbfVar39 = ((akgo) aX).ck;
                    fbbf fbbfVar40 = ((akgo) aX).b.hv;
                    akkp akkpVar5 = akisVar10.a;
                    fbbf fbbfVar41 = akkpVar5.gp;
                    fbbf fbbfVar42 = ((akgo) aX).d.B;
                    fbbf fbbfVar43 = akkoVar3.jc;
                    fbbf fbbfVar44 = ((akgo) aX).cl;
                    fbbf fbbfVar45 = akkoVar3.jd;
                    fbbf fbbfVar46 = ((akgo) aX).F;
                    fbbf fbbfVar47 = akkpVar5.ap;
                    fbbf fbbfVar48 = akkoVar3.ak;
                    ea eaVar2 = (ea) ((fbbb) ((akgo) aX).e).a;
                    fbbf fbbfVar49 = ((akgo) aX).cm;
                    fbbf fbbfVar50 = ((akgo) aX).cn;
                    fbbf fbbfVar51 = akkpVar5.Px;
                    ffsk ffskVar = (ffsk) ((akgo) aX).N.b();
                    fbbf fbbfVar52 = ((akgo) aX).a.aU;
                    Optional optional6 = (Optional) ((akgo) aX).bY.b();
                    akko akkoVar4 = ((akgo) aX).a.b;
                    Optional of9 = Optional.of(new wlg(eaVar2, fbbfVar49, fbbfVar50, fbbfVar51, ffskVar, fbbfVar52, optional6, akkoVar4.je, akkoVar4.hO, akkoVar4.jf));
                    Optional optional7 = (Optional) ((akgo) aX).cq.b();
                    Optional optional8 = (Optional) ((akgo) aX).ct.b();
                    Optional optional9 = (Optional) ((akgo) aX).cu.b();
                    Context context2 = (Context) ((akgo) aX).a.q.b();
                    fbbf fbbfVar53 = ((akgo) aX).cr;
                    akis akisVar11 = ((akgo) aX).a;
                    akko akkoVar5 = akisVar11.b;
                    fbbf fbbfVar54 = akkoVar5.jo;
                    fbbf fbbfVar55 = ((akgo) aX).bY;
                    fbbf fbbfVar56 = ((akgo) aX).G;
                    fbbf fbbfVar57 = akkoVar5.hO;
                    ecrj ecrjVar = (ecrj) akisVar11.cN.b();
                    ffsk ffskVar2 = (ffsk) ((akgo) aX).a.a.p.b();
                    akhy akhyVar3 = ((akgo) aX).b;
                    akis akisVar12 = ((akgo) aX).a;
                    Optional of10 = Optional.of(new wls(context2, fbbfVar53, fbbfVar54, fbbfVar55, fbbfVar56, fbbfVar57, ecrjVar, ffskVar2, new dqiz(akhyVar3.oR, akisVar12.a.p, akisVar12.b.jq, akisVar12.lm, akhyVar3.jB)));
                    Optional optional10 = (Optional) ((akgo) aX).cw.b();
                    Optional of11 = Optional.of(((akgo) aX).f());
                    fbbf fbbfVar58 = ((akgo) aX).cm;
                    fbbf fbbfVar59 = ((akgo) aX).G;
                    fbbf fbbfVar60 = ((akgo) aX).bY;
                    Optional of12 = Optional.of((cjxc) ((akgo) aX).b.gc.b());
                    akis akisVar13 = ((akgo) aX).a;
                    akkp akkpVar6 = akisVar13.a;
                    vvn vvnVar = new vvn(eaVar, activity, wpkVar, crnxVar, cuydVar, ctvbVar, a, cqohVar, txlVar, wddVar, a2, cwjxVar, czgkVar, optional, akztVar, a3, ddxsVar, bcvsVar, cstxVar, csukVar, dfpiVar, adsdVar, fbbfVar15, csmjVar, alczVar, cpbsVar, cpbwVar, ctmlVar, fbbfVar16, azzeVar, fbbfVar17, cskxVar, csjkVar, cuxhVar, bduyVar, csllVar, ejwlVar, albqVar, fbbfVar18, fbbfVar19, axulVar, cuxzVar, fbbfVar20, bbabVar, fbbfVar21, ddzqVar, cuyeVar, a4, cY, cztlVar, ddouVar, uotVar, a5, dedeVar, cssvVar, crmkVar, bcvwVar, ddzbVar, ddycVar, of, dbzlVar, ejlqVar, colyVar, ctudVar, m, optional2, adtnVar, ellqVar, vzxVar, fbbfVar24, bbfdVar, aljtVar, elbxVar, V, bcwzVar, optional3, of2, enpxVar, c, tamVar, optional4, of3, of4, of5, of6, of7, of8, ac, fbbfVar26, aolrVar, fbbfVar27, fbbfVar28, a6, a7, fbbfVar29, y, wgdVar, e, fbbfVar30, uoyVar, uoxVar, fbbfVar31, b, p, adgnVar, fbbfVar32, fbbfVar33, fbbfVar34, vjrVar, eisxVar, fbbfVar35, wpgVar, optional5, bt, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar39, fbbfVar40, fbbfVar41, fbbfVar42, fbbfVar43, fbbfVar44, fbbfVar45, fbbfVar46, fbbfVar47, fbbfVar48, of9, optional7, optional8, optional9, of10, optional10, of11, fbbfVar58, fbbfVar59, fbbfVar60, of12, akkpVar6.lO, akisVar13.fM, akkpVar6.br, akisVar13.cN, ((akgo) aX).n, ((akgo) aX).cy, akisVar13.b.jr, akkpVar6.Pu);
                    this.a = vvnVar;
                    vvnVar.de = this;
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
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
        this.c.k();
        try {
            aY(bundle);
            final vvn H = H();
            ((uph) H.bI.b()).g(2);
            ensk h = vvn.a.h();
            h.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.p, H.M);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onCreate", 1735, "ConversationFragmentPeer.java")).q("ConversationFragment: onCreate begin");
            H.o = (tzj) H.O.a(tzj.class);
            ((wge) H.O.a(wge.class)).f = new vuk(H);
            wgd wgdVar = H.bs;
            if (bundle == null) {
                alrv alrvVar = (alrv) wgdVar.a.b();
                alrvVar.e(alrv.u);
                alrvVar.e(alrv.v);
            }
            if (!H.ba()) {
                H.bt.a(bundle);
            }
            H.cK = true;
            H.N.av(true);
            H.cP = false;
            H.co = H.aj.f().toEpochMilli();
            H.cB = H.N.B().getColor(R.color.action_bar_background_color);
            Activity p = H.p();
            wdf wdfVar = new wdf();
            if (((Boolean) cful.T.e()).booleanValue()) {
                koa.g(p, wdfVar, new IntentFilter("com.lge.android.intent.action.DUAL_SIM_SWITCHING_DONE"));
            }
            H.F = wdfVar;
            Activity p2 = H.p();
            DefaultSmsSubscriptionChangeReceiver defaultSmsSubscriptionChangeReceiver = new DefaultSmsSubscriptionChangeReceiver();
            if (DefaultSmsSubscriptionChangeReceiver.f()) {
                koa.g(p2, defaultSmsSubscriptionChangeReceiver, new IntentFilter("com.huawei.android.dsdscardmanager.SIM_CARD_NAME_SUB1_UPDATED_ACTION"));
                koa.g(p2, defaultSmsSubscriptionChangeReceiver, new IntentFilter("com.huawei.android.dsdscardmanager.SIM_CARD_NAME_SUB2_UPDATED_ACTION"));
            }
            H.E = defaultSmsSubscriptionChangeReceiver;
            H.B = new decz() { // from class: vns
                @Override // defpackage.decz
                public final void a(boolean z) {
                    vvn.this.aI();
                }
            };
            H.aD.d(H.B);
            H.cV = ddzb.a(H.N.G());
            ensk h2 = vvn.a.h();
            h2.Y(ente.a, "Bugle");
            enrr enrrVar2 = (enrr) h2;
            enrrVar2.Y(csux.p, H.M);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onCreate", 1781, "ConversationFragmentPeer.java")).q("ConversationFragment: Registering FutureMixins");
            H.f = H.new c();
            H.g = H.new g();
            H.h = H.bR.map(new Function() { // from class: vnt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((wlh) obj).a(new vuv(vvn.this));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            H.i = H.new h();
            H.j = H.new f();
            H.k = H.new d();
            H.l = H.new a();
            H.m = H.new b();
            H.n = new ajsb(new BiConsumer() { // from class: vru
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    final MessageIdType messageIdType = (MessageIdType) obj;
                    final RepliedToDataAdapter repliedToDataAdapter = (RepliedToDataAdapter) obj2;
                    vvn.this.S(null, new Consumer() { // from class: vlo
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj3) {
                            ComposeMessageView composeMessageView = (ComposeMessageView) obj3;
                            enru enruVar = vvn.a;
                            ((bcvr) composeMessageView.H().c.x.a()).y = cnmc.a(MessageIdType.this);
                            composeMessageView.H().P(repliedToDataAdapter);
                            composeMessageView.H().G(true);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, new BiConsumer() { // from class: vrv
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    enru enruVar = vvn.a;
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
            H.aL.k(H.f);
            H.aL.k(H.g);
            H.h.ifPresent(new Consumer() { // from class: vnu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    vvn.this.aL.k((ejlr) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            H.aL.k(H.i);
            H.aL.k(H.j);
            H.aL.k(H.k);
            H.aL.k(H.l);
            H.aL.k(H.m);
            H.aL.k(H.bx);
            H.aL.k(((arcs) H.bz.b()).d);
            H.aL.k(H.n);
            ((taa) H.bg.b()).c(new Supplier() { // from class: vnv
                @Override // java.util.function.Supplier
                public final Object get() {
                    int i = engw.d;
                    return enou.a;
                }
            });
            if (((Optional) H.bf.b()).isPresent()) {
                H.N.P().c((lkq) ((Optional) H.bf.b()).get());
            }
            enqu listIterator = ((enpd) H.bA.a).listIterator();
            while (listIterator.hasNext()) {
                ((wpf) listIterator.next()).d();
            }
            ((cpev) H.bG.b()).c();
            H.e = H.N.O(new ael(), new adf() { // from class: vnw
                @Override // defpackage.adf
                public final void a(Object obj) {
                    if (((ade) obj).a == -1) {
                        vvn vvnVar = vvn.this;
                        vvnVar.bk.ifPresent(new vtb());
                    }
                }
            });
            ((cojr) H.cc.b()).b((ejxn) H.cb.b(), H.N.A());
            ekzz f = eleg.f("ConversationFragment::initializeExpressiveStickers");
            try {
                if (((Boolean) cful.f.e()).booleanValue()) {
                    ((dccz) H.cm.b()).b();
                }
                f.close();
                ensk h3 = vvn.a.h();
                h3.Y(ente.a, "Bugle");
                enrr enrrVar3 = (enrr) h3;
                enrrVar3.Y(csux.p, H.M);
                ((enrr) enrrVar3.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "onCreate", 1829, "ConversationFragmentPeer.java")).q("ConversationFragment: onCreate complete");
                ekyf.q();
            } finally {
            }
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
    public final void i() {
        elav b = this.c.b();
        try {
            bf();
            final vvn H = H();
            ((ckge) H.am.a()).l(H.A());
            H.S(null, new Consumer() { // from class: vsh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    enru enruVar = vvn.a;
                    ((ComposeMessageView) obj).H().B();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (H.cX != null) {
                H.cS.getViewTreeObserver().removeOnGlobalLayoutListener(H.cX);
            }
            H.T(null, new Consumer() { // from class: vss
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    vvn.this.cS.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: vpy
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            enru enruVar = vvn.a;
                            return windowInsets;
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
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

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ah = true;
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void k(final Bundle bundle) {
        String str;
        this.c.k();
        try {
            bj(bundle);
            vvn H = H();
            H.cK = false;
            if (H.aW.isPresent() && (str = H.cp) != null) {
                bundle.putString("saved_instance_state_search_query_key", str);
            }
            H.S(null, new Consumer() { // from class: vsv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    enru enruVar = vvn.a;
                    ((ComposeMessageView) obj).H().H(bundle);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (H.cA.g()) {
                bcqs bcqsVar = (bcqs) H.cA.a();
                Context z = H.N.z();
                z.getClass();
                new bcyl(Integer.valueOf(bcqsVar.a(z)), bcqsVar.l(), bcqsVar.m()).a(bundle);
            }
            String str2 = H.I;
            if (str2 != null) {
                bundle.putString("saved_instance_state_clicked_suggestion_id", str2);
            }
            H.cl.a(bundle);
            enqu listIterator = ((enpd) H.bA.a).listIterator();
            while (listIterator.hasNext()) {
                ((wpf) listIterator.next()).e();
            }
            wdc wdcVar = H.ck;
            if (wdcVar != null && wdcVar.h) {
                bundle.putBoolean("saved_instance_state_active_sim_checker_key", true);
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void l() {
        this.c.k();
        try {
            bk();
            final vvn H = H();
            ((uph) H.bI.b()).g(3);
            uuy uuyVar = H.cx;
            uuyVar.aB.f.p();
            uuyVar.aC.f();
            H.S(null, new Consumer() { // from class: vlp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    enru enruVar = vvn.a;
                    ((ComposeMessageView) obj).H().D();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            View view = H.cR;
            if (view != null) {
                view.requestFocus();
            }
            if (((Boolean) cful.q.e()).booleanValue()) {
                Context z = H.N.z();
                z.getClass();
                if (algx.a(z) == 3) {
                    H.S(null, new Consumer() { // from class: vlq
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ((ComposeMessageView) obj).H().L(((bcqs) vvn.this.cA.a()).e);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void m() {
        this.c.k();
        try {
            bl();
            final vvn H = H();
            eg G = H.N.G();
            if (G != null) {
                H.cR = G.getCurrentFocus();
                if (G.isFinishing() && H.bl()) {
                    H.S(new Consumer() { // from class: vku
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            if (((uav) obj).d().ab()) {
                                return;
                            }
                            ((sft) vvn.this.bF.b()).a(3);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, new Consumer() { // from class: vkv
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            if (((bcvr) ((ComposeMessageView) obj).H().s().a()).ab()) {
                                return;
                            }
                            ((sft) vvn.this.bF.b()).a(3);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            }
            View view = H.N.Q;
            if (view != null) {
                View findViewById = view.findViewById(R.id.focus_sink);
                if (findViewById != null) {
                    findViewById.requestFocus();
                }
                H.T(new Consumer() { // from class: vkw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        vvn vvnVar = vvn.this;
                        final ugg uggVar = (ugg) obj;
                        EditText d = vvnVar.d();
                        if (d != null) {
                            d.clearFocus();
                        }
                        vvnVar.S(new Consumer() { // from class: vpa
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                enru enruVar = vvn.a;
                                ugg.this.n(((uav) obj2).e().H());
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, new Consumer() { // from class: vpb
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                enru enruVar = vvn.a;
                                ugg.this.n(((ComposeMessageView) obj2).H());
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: vkx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        PlainTextEditText v;
                        czgj czgjVar = (czgj) obj;
                        enru enruVar = vvn.a;
                        if (czgjVar == null || (v = ((cxtc) czgjVar.b).v()) == null) {
                            return;
                        }
                        v.clearFocus();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
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

    @Override // defpackage.efaf, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vvn H = H();
        Optional.ofNullable(H.cx.az.E).ifPresent(new Consumer() { // from class: usn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((vr) obj).c();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        H.T(null, new Consumer() { // from class: vlr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                czgj czgjVar = (czgj) obj;
                enru enruVar = vvn.a;
                if (czgjVar != null) {
                    Configuration configuration2 = configuration;
                    if (czgjVar.o && configuration2.orientation == 1) {
                        czgjVar.o = false;
                        czgjVar.k();
                    } else if (!czgjVar.o && configuration2.orientation == 2) {
                        czgjVar.o = true;
                        czgjVar.m();
                    }
                    czgjVar.q();
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        H.aI();
        H.bc.b();
        MenuItem menuItem = H.q;
        if (menuItem == null || !menuItem.isVisible()) {
            return;
        }
        H.q.setShowAsAction(0);
        H.bp();
    }

    @Override // defpackage.vxx, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
