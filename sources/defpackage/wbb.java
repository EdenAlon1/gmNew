package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.provider.Settings;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView;
import com.google.android.apps.messaging.conversation.settings.dataservice.SpamReportingStatus;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wbb implements ellh {
    final /* synthetic */ waz a;

    public wbb(waz wazVar) {
        this.a = wazVar;
    }

    @Override // defpackage.ellh
    public final /* synthetic */ elli a(ellf ellfVar) {
        BusinessInfoProperty privacyPolicyUrl;
        ConversationSettingsOptionItemView.a aVar = (ConversationSettingsOptionItemView.a) ellfVar;
        int ordinal = aVar.a.h.ordinal();
        waz wazVar = this.a;
        switch (ordinal) {
            case 8:
                BusinessInfoData businessInfoData = wazVar.b;
                privacyPolicyUrl = businessInfoData != null ? businessInfoData.getPrivacyPolicyUrl() : null;
                if (privacyPolicyUrl != null) {
                    wazVar.d(privacyPolicyUrl.getValue());
                    break;
                }
                break;
            case 9:
                BusinessInfoData businessInfoData2 = wazVar.b;
                privacyPolicyUrl = businessInfoData2 != null ? businessInfoData2.getTermsAndConditionsUrl() : null;
                if (privacyPolicyUrl != null) {
                    wazVar.d(privacyPolicyUrl.getValue());
                    break;
                }
                break;
            case 10:
                wazVar.g.e(wazVar.e.G(), "business_messaging");
                break;
            default:
                vzg vzgVar = (vzg) wazVar.e.I().h("conversation_settings_base_fragment");
                vzgVar.getClass();
                final vzn H = vzgVar.H();
                final bcun bcunVar = aVar.a;
                boolean z = !bcunVar.f;
                int ordinal2 = bcunVar.h.ordinal();
                if (ordinal2 == 11) {
                    SpamReportingStatus spamReportingStatus = new SpamReportingStatus(bcunVar.a(), bcunVar.k);
                    if (bcunVar.k == byyt.SPAM_FOLDER) {
                        ejlq ejlqVar = (ejlq) H.q.b();
                        final ParticipantsTable.BindData bindData = spamReportingStatus.a;
                        ejlqVar.g(new ejlp(elfo.g(new Callable() { // from class: vzj
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                vzn vznVar = vzn.this;
                                return Boolean.valueOf(((cucf) vznVar.r.b()).b(cuch.a(false, vznVar.y, bindData.S(), cukx.b, true, true, eoko.CONVERSATION_FROM_UNSPAM_ACTION, null, null, 3, 6, 2)) != null);
                            }
                        }, (Executor) H.u.b())), H.E);
                    } else {
                        ParticipantsTable.BindData bindData2 = spamReportingStatus.a;
                        taa taaVar = (taa) H.m.b();
                        taf k = tak.k();
                        k.d(H.c.b ? taj.GROUP_SPAM : taj.SPAM);
                        syk sykVar = (syk) k;
                        sykVar.e = 2;
                        sykVar.b = bindData2;
                        k.c(H.y);
                        sykVar.c = new sya(4);
                        sykVar.d = syf.a(bindData2);
                        k.e();
                        sykVar.f = 6;
                        taaVar.d(k.f());
                    }
                } else if (ordinal2 != 12) {
                    switch (ordinal2) {
                        case 0:
                            bcuj bcujVar = H.c;
                            bcujVar.d.a(bcujVar.a, Boolean.valueOf(z), null, null, null).t();
                            csjy.i("Bugle", a.q(z, "notifications enabled = "));
                            break;
                        case 1:
                            H.x.startActivityForResult(((akvg) H.i.b()).R(H.x.B().getString(R.string.notification_sound_pref_title), bcunVar.d, Settings.System.DEFAULT_NOTIFICATION_URI), 1000);
                            break;
                        case 2:
                            bcuj bcujVar2 = H.c;
                            bcujVar2.d.a(bcujVar2.a, null, null, Boolean.valueOf(z), null).t();
                            csjy.i("Bugle", a.q(z, "vibration enabled = "));
                            break;
                        case 3:
                            byyt byytVar = bcunVar.k;
                            emxf.m(H.e.m(), "Opening notification settings when conversation name is not loaded");
                            String str = H.e.a;
                            if (ctid.d) {
                                H.g = ((csll) H.n.b()).f(H.y);
                                csll csllVar = (csll) H.n.b();
                                String str2 = H.g;
                                str2.getClass();
                                boolean k2 = csllVar.k(str2);
                                Optional d = H.d.a.a().d();
                                boolean z2 = byytVar != null && byytVar.g();
                                boolean g = H.d.a.a().g();
                                if (!z2 && !k2) {
                                    ejlq ejlqVar2 = (ejlq) H.q.b();
                                    csll csllVar2 = (csll) H.n.b();
                                    ConversationId conversationId = H.z;
                                    aoku aokuVar = (aoku) d.orElse(null);
                                    String str3 = H.g;
                                    str3.getClass();
                                    ejlqVar2.g(new ejlp(csllVar2.c(conversationId, str, aokuVar, str3, g)), H.I);
                                    break;
                                }
                            }
                            H.a(str);
                            break;
                        case 4:
                            ((akvg) H.i.b()).L(H.x.G());
                            break;
                        case 5:
                            bcuj bcujVar3 = H.c;
                            bcujVar3.d.a(bcujVar3.a, null, null, null, Integer.valueOf(z ? 1 : 0)).t();
                            csjy.i("Bugle", a.q(z, "xms sending enabled = "));
                            break;
                        case 6:
                            if (((bzqa) H.k.b()).p()) {
                                ParticipantsTable.BindData bindData3 = bcunVar.j;
                                bindData3.getClass();
                                ffbr ffbrVar = H.h;
                                final String S = bindData3.S();
                                Conversation a = ((alxl) ffbrVar.b()).a(new BugleConversationId(H.y), alxk.MINIMAL);
                                ejlq ejlqVar3 = (ejlq) H.q.b();
                                final vzq vzqVar = (vzq) H.H.b();
                                ejlqVar3.i(ejlp.a(a.h().b().h(new emwl() { // from class: vzo
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        aqux f = ((alxj) obj).f();
                                        f.getClass();
                                        awui awuiVar = (awui) f.m().flatMap(new Function() { // from class: vzp
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                return ((aoku) obj2).e();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).orElseThrow();
                                        ffbr ffbrVar2 = vzq.this.b;
                                        ffbrVar2.getClass();
                                        int d2 = ((ctwb) ffbrVar2.b()).h(f.b()).d() + 1;
                                        ajkm createBuilder = ajkn.a.createBuilder();
                                        createBuilder.copyOnWrite();
                                        ajkn ajknVar = (ajkn) createBuilder.instance;
                                        String str4 = S;
                                        str4.getClass();
                                        ajknVar.b |= 2;
                                        ajknVar.d = str4;
                                        createBuilder.copyOnWrite();
                                        ajkn ajknVar2 = (ajkn) createBuilder.instance;
                                        awuiVar.getClass();
                                        ajknVar2.c = awuiVar;
                                        ajknVar2.b |= 1;
                                        ajlc ajlcVar = (ajlc) ajld.a.createBuilder();
                                        int a2 = f.a();
                                        ajlcVar.copyOnWrite();
                                        ajld ajldVar = (ajld) ajlcVar.instance;
                                        ajldVar.b |= 2;
                                        ajldVar.d = a2;
                                        String p = f.p();
                                        ajlcVar.copyOnWrite();
                                        ajld ajldVar2 = (ajld) ajlcVar.instance;
                                        ajldVar2.b |= 4;
                                        ajldVar2.e = p;
                                        ajlcVar.copyOnWrite();
                                        ajld ajldVar3 = (ajld) ajlcVar.instance;
                                        ajldVar3.b |= 1;
                                        ajldVar3.c = d2;
                                        ajld ajldVar4 = (ajld) ajlcVar.build();
                                        createBuilder.copyOnWrite();
                                        ajkn ajknVar3 = (ajkn) createBuilder.instance;
                                        ajldVar4.getClass();
                                        ajknVar3.e = ajldVar4;
                                        ajknVar3.b |= 4;
                                        return createBuilder.build();
                                    }
                                }, vzqVar.a)), new ejlm(null), H.G);
                                break;
                            }
                            break;
                        case 7:
                            ParticipantsTable.BindData a2 = bcunVar.a();
                            if (a2 != null && a2.Y()) {
                                ((ejlq) H.q.b()).i(ejlp.b(((wbh) H.o.b()).c(H.y, a2)), new ejlm(a2), H.F);
                                return elli.a;
                            }
                            csjy.i("Bugle", "asking user to confirm blocking ".concat(String.valueOf(cskt.b(((bdrt) H.v.b()).a(a2, true)))));
                            taa taaVar2 = (taa) H.m.b();
                            taf k3 = tak.k();
                            k3.d(taj.BLOCK);
                            syk sykVar2 = (syk) k3;
                            sykVar2.e = 2;
                            sykVar2.b = a2;
                            k3.c(H.y);
                            sykVar2.c = new sya(4);
                            sykVar2.d = syf.a(a2);
                            k3.e();
                            sykVar2.f = 6;
                            taaVar2.d(k3.f());
                            break;
                        default:
                            csix.c("Unsupported conversation setting item id: ".concat(String.valueOf(String.valueOf(bcunVar.h))));
                            break;
                    }
                } else {
                    vzg vzgVar2 = H.x;
                    vzgVar2.getClass();
                    Context z3 = vzgVar2.z();
                    if (bcunVar.m.isEmpty() || bcunVar.l.isEmpty()) {
                        ((ensz) ((ensz) vzn.b.j()).h("com/google/android/apps/messaging/conversation/settings/ConversationSettingsBaseFragmentPeer", "handleOptionsItemViewClicked", 518, "ConversationSettingsBaseFragmentPeer.java")).q("Cannot show SIM picker, self identities not available");
                    } else {
                        iu iuVar = new iu(z3);
                        iuVar.g(R.string.info_and_options_change_active_sim);
                        iuVar.f((CharSequence[]) Collection.EL.stream((engw) bcunVar.l.get()).map(new Function() { // from class: vzk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((aqux) obj).o();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).toArray(new IntFunction() { // from class: vzl
                            @Override // java.util.function.IntFunction
                            public final Object apply(int i) {
                                cskc cskcVar = vzn.a;
                                return new String[i];
                            }
                        }), ((engw) bcunVar.l.get()).indexOf(bcunVar.m.get()), new DialogInterface.OnClickListener() { // from class: vzm
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                vzn vznVar = vzn.this;
                                ((ejvp) vznVar.w.b()).a(((alxl) vznVar.h.b()).t(vznVar.z, (aqux) ((engw) bcunVar.l.get()).get(i)), "OPTIONS_LIST_KEY");
                                dialogInterface.dismiss();
                            }
                        });
                        iuVar.a();
                    }
                }
                return elli.a;
        }
        return elli.a;
    }
}
