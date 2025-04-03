package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.label.ui.recategorize.ChangeCategoryView;
import com.google.android.apps.messaging.otp.deletion.save.SaveOtpView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.material.chip.ChipGroup;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahkw implements ahkv {
    private final ahkc a;
    private final aium b;

    public ahkw(ahkc ahkcVar, aium aiumVar) {
        this.a = ahkcVar;
        this.b = aiumVar;
    }

    @Override // defpackage.ahkv
    public final void a(crly crlyVar, bcse bcseVar) {
        SuperSortLabel superSortLabel;
        SuperSortLabel superSortLabel2;
        SuperSortLabel superSortLabel3;
        SuperSortLabel superSortLabel4;
        SuperSortLabel superSortLabel5 = bcseVar.t;
        String str = bcseVar.u;
        if (!aewg.h() || !bcseVar.az()) {
            crlyVar.g(8);
            return;
        }
        if (aewg.i() && this.b.b && superSortLabel5 == SuperSortLabel.BUSINESS_UPDATE && str.equals("Otp")) {
            crlyVar.f(R.layout.save_otp_view);
            SaveOtpView saveOtpView = (SaveOtpView) crlyVar.b();
            crlyVar.g(0);
            final aivm H = saveOtpView.H();
            H.h = bcseVar;
            H.c();
            H.b.setOnClickListener(new elay(H.e, "SuperSortSaveOtp#openDialog", new View.OnClickListener() { // from class: aivh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final aivm aivmVar = aivm.this;
                    ehft ehftVar = new ehft(aivmVar.b.getContext());
                    ehftVar.x(R.string.save_otp_dialog_title);
                    ehftVar.m(R.string.save_otp_dialog_message);
                    ehftVar.t(R.string.save_otp_confirm_button, new elbb(aivmVar.e, "SuperSortSaveOtp#dialog#positiveListener", new DialogInterface.OnClickListener() { // from class: aivf
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            aivm aivmVar2 = aivm.this;
                            MessageIdType b = bdhb.b(aivmVar2.b());
                            bcse bcseVar2 = aivmVar2.h;
                            bcseVar2.getClass();
                            ellj.g(new aiuz(b, bcseVar2.t), aivmVar2.b);
                            final ConversationIdType a = aivmVar2.a();
                            MessageIdType b2 = bdhb.b(aivmVar2.b());
                            if (((Boolean) aexw.a.e()).booleanValue()) {
                                return;
                            }
                            final aexa aexaVar = aivmVar2.f;
                            axnw.h(aexaVar.b(b2).h(new emwl() { // from class: aewz
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    final Long l = (Long) obj;
                                    final aexa aexaVar2 = aexa.this;
                                    final ConversationIdType conversationIdType = a;
                                    aexaVar2.o(new Supplier() { // from class: aeww
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            Long l2 = l;
                                            l2.getClass();
                                            eqhr c = aexa.this.c(conversationIdType, l2.longValue());
                                            eqhv eqhvVar = (eqhv) eqhw.a.createBuilder();
                                            eqht eqhtVar = (eqht) eqhu.a.createBuilder();
                                            eqhtVar.copyOnWrite();
                                            eqhu eqhuVar = (eqhu) eqhtVar.instance;
                                            eqhuVar.c = 1;
                                            eqhuVar.b |= 1;
                                            eqhvVar.copyOnWrite();
                                            eqhw eqhwVar = (eqhw) eqhvVar.instance;
                                            eqhu eqhuVar2 = (eqhu) eqhtVar.build();
                                            eqhuVar2.getClass();
                                            eqhwVar.c = eqhuVar2;
                                            eqhwVar.b |= 1;
                                            c.copyOnWrite();
                                            eqic eqicVar = (eqic) c.instance;
                                            eqhw eqhwVar2 = (eqhw) eqhvVar.build();
                                            eqic eqicVar2 = eqic.a;
                                            eqhwVar2.getClass();
                                            eqicVar.d = eqhwVar2;
                                            eqicVar.c = 2;
                                            return (eqic) c.build();
                                        }
                                    });
                                    return null;
                                }
                            }, aexaVar.c));
                        }
                    }));
                    ehftVar.o(android.R.string.cancel, null);
                    ehftVar.create().show();
                    final ConversationIdType a = aivmVar.a();
                    MessageIdType b = bdhb.b(aivmVar.b());
                    if (((Boolean) aexw.a.e()).booleanValue()) {
                        return;
                    }
                    final aexa aexaVar = aivmVar.f;
                    axnw.h(aexaVar.b(b).h(new emwl() { // from class: aewy
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            final Long l = (Long) obj;
                            final aexa aexaVar2 = aexa.this;
                            final ConversationIdType conversationIdType = a;
                            aexaVar2.o(new Supplier() { // from class: aewv
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    Long l2 = l;
                                    l2.getClass();
                                    eqhr c = aexa.this.c(conversationIdType, l2.longValue());
                                    eqia eqiaVar = (eqia) eqib.a.createBuilder();
                                    eqhy eqhyVar = (eqhy) eqhz.a.createBuilder();
                                    eqhyVar.copyOnWrite();
                                    eqhz eqhzVar = (eqhz) eqhyVar.instance;
                                    eqhzVar.c = 1;
                                    eqhzVar.b |= 1;
                                    eqiaVar.copyOnWrite();
                                    eqib eqibVar = (eqib) eqiaVar.instance;
                                    eqhz eqhzVar2 = (eqhz) eqhyVar.build();
                                    eqhzVar2.getClass();
                                    eqibVar.c = eqhzVar2;
                                    eqibVar.b |= 1;
                                    c.copyOnWrite();
                                    eqic eqicVar = (eqic) c.instance;
                                    eqib eqibVar2 = (eqib) eqiaVar.build();
                                    eqic eqicVar2 = eqic.a;
                                    eqibVar2.getClass();
                                    eqicVar.d = eqibVar2;
                                    eqicVar.c = 1;
                                    return (eqic) c.build();
                                }
                            });
                            return null;
                        }
                    }, aexaVar.c));
                }
            }));
            return;
        }
        if (!superSortLabel5.b() || superSortLabel5 == SuperSortLabel.UNKNOWN || superSortLabel5 == SuperSortLabel.ALL || superSortLabel5 == SuperSortLabel.PERSONAL || superSortLabel5 == SuperSortLabel.BUSINESS_UPDATE || ((superSortLabel5 == (superSortLabel = SuperSortLabel.UPDATE) && aewg.g(superSortLabel)) || ((superSortLabel5 == (superSortLabel2 = SuperSortLabel.TRANSACTION) && aewg.g(superSortLabel2)) || ((superSortLabel5 == (superSortLabel3 = SuperSortLabel.PROMOTION) && aewg.g(superSortLabel3)) || ((superSortLabel5 == (superSortLabel4 = SuperSortLabel.OTP) && aewg.g(superSortLabel4)) || !this.a.b))))) {
            crlyVar.g(8);
            return;
        }
        crlyVar.f(R.layout.change_category_view);
        ChangeCategoryView changeCategoryView = (ChangeCategoryView) crlyVar.b();
        crlyVar.g(0);
        final ahko H2 = changeCategoryView.H();
        H2.l = bcseVar;
        H2.f((ImageView) H2.d.findViewById(R.id.change_category_icon));
        H2.d();
        H2.e();
        H2.d.setOnClickListener(new elay(H2.i, "SuperSortRecategorizer#changeCategory", new View.OnClickListener() { // from class: ahkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final ahko ahkoVar = ahko.this;
                Context context = ahkoVar.d.getContext();
                ehft ehftVar = new ehft(context);
                ehftVar.x(R.string.change_category);
                final View inflate = LayoutInflater.from(context).inflate(R.layout.change_category_dialog_custom_view, (ViewGroup) null);
                if (aewg.g(SuperSortLabel.TRANSACTION)) {
                    inflate.findViewById(R.id.transactions_chip).setVisibility(8);
                }
                if (aewg.g(SuperSortLabel.UPDATE)) {
                    inflate.findViewById(R.id.updates_chip).setVisibility(8);
                }
                if (aewg.g(SuperSortLabel.OTP)) {
                    inflate.findViewById(R.id.otp_chip).setVisibility(8);
                }
                if (aewg.g(SuperSortLabel.PROMOTION)) {
                    inflate.findViewById(R.id.offers_chip).setVisibility(8);
                }
                ahkoVar.f((ImageView) inflate.findViewById(R.id.change_category_dialog_current_icon));
                ((TextView) inflate.findViewById(R.id.change_category_dialog_current_text)).setText(ahkt.a(ahkoVar.a()));
                Integer num = (Integer) ahko.b.get(ahkoVar.a());
                num.getClass();
                inflate.findViewById(num.intValue()).setVisibility(8);
                final crly crlyVar2 = new crly(inflate, R.id.donate_message_view_stub, R.id.donate_message_view);
                ((Optional) ahkoVar.f.b()).ifPresent(new Consumer() { // from class: ahkk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        bcse bcseVar2 = ahko.this.l;
                        bcseVar2.getClass();
                        ((abxd) obj).c(crlyVar2, bcseVar2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                if (crlyVar2.i()) {
                    inflate.findViewById(R.id.change_category_donate_divider).setVisibility(0);
                }
                ehftVar.z(inflate);
                ehftVar.t(R.string.change_category_dialog_submit_button, new elbb(ahkoVar.i, "SuperSortRecategorizer#dialog#positiveListener", new DialogInterface.OnClickListener() { // from class: ahke
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        SuperSortLabel superSortLabel6 = (SuperSortLabel) ((enot) ahko.b).d.get(Integer.valueOf(((ChipGroup) inflate.findViewById(R.id.chip_group)).a()));
                        superSortLabel6.getClass();
                        Optional empty = Optional.empty();
                        ahko ahkoVar2 = ahko.this;
                        if (((Optional) ahkoVar2.f.b()).isPresent()) {
                            empty = ((abxd) ((Optional) ahkoVar2.f.b()).get()).a(crlyVar2, superSortLabel6);
                        }
                        ellj.g(new ahjt(ahkoVar2.c(), superSortLabel6, empty), ahkoVar2.d);
                        final boolean isPresent = empty.isPresent();
                        final boolean z = false;
                        if (isPresent) {
                            for (ezfq ezfqVar : ((ezfz) empty.get()).c) {
                                if ((ezfqVar.b & 1) != 0) {
                                    ezfw ezfwVar = ezfqVar.f;
                                    if (ezfwVar == null) {
                                        ezfwVar = ezfw.a;
                                    }
                                    if (ezfwVar.b != 0 || ezfwVar.c != 0) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                        }
                        final aewt aewtVar = ahkoVar2.g;
                        MessageIdType c = ahkoVar2.c();
                        final ConversationIdType b = ahkoVar2.b();
                        if (((Boolean) aexw.a.e()).booleanValue()) {
                            return;
                        }
                        axnw.h(aewtVar.b(c).h(new emwl() { // from class: aewm
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                final Long l = (Long) obj;
                                final ConversationIdType conversationIdType = b;
                                final boolean z2 = isPresent;
                                final aewt aewtVar2 = aewt.this;
                                final boolean z3 = z;
                                aewtVar2.o(new Supplier() { // from class: aews
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        Long l2 = l;
                                        l2.getClass();
                                        eqhd c2 = aewt.this.c(l2.longValue(), conversationIdType);
                                        eqhh eqhhVar = (eqhh) eqhi.a.createBuilder();
                                        eqhf eqhfVar = (eqhf) eqhg.a.createBuilder();
                                        eqhfVar.copyOnWrite();
                                        eqhg eqhgVar = (eqhg) eqhfVar.instance;
                                        eqhgVar.c = 1;
                                        eqhgVar.b |= 1;
                                        eqhfVar.copyOnWrite();
                                        eqhg eqhgVar2 = (eqhg) eqhfVar.instance;
                                        eqhgVar2.b |= 2;
                                        eqhgVar2.d = z2;
                                        eqhfVar.copyOnWrite();
                                        eqhg eqhgVar3 = (eqhg) eqhfVar.instance;
                                        eqhgVar3.b |= 4;
                                        eqhgVar3.e = z3;
                                        eqhhVar.copyOnWrite();
                                        eqhi eqhiVar = (eqhi) eqhhVar.instance;
                                        eqhg eqhgVar4 = (eqhg) eqhfVar.build();
                                        eqhgVar4.getClass();
                                        eqhiVar.c = eqhgVar4;
                                        eqhiVar.b |= 1;
                                        c2.copyOnWrite();
                                        eqhq eqhqVar = (eqhq) c2.instance;
                                        eqhi eqhiVar2 = (eqhi) eqhhVar.build();
                                        eqhq eqhqVar2 = eqhq.a;
                                        eqhiVar2.getClass();
                                        eqhqVar.d = eqhiVar2;
                                        eqhqVar.c = 2;
                                        return (eqhq) c2.build();
                                    }
                                });
                                return null;
                            }
                        }, aewtVar.c));
                    }
                }));
                ehftVar.o(android.R.string.cancel, null);
                final iv create = ehftVar.create();
                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ahkl
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        iv ivVar = create;
                        ivVar.b(-1).setEnabled(false);
                        ChipGroup chipGroup = (ChipGroup) ivVar.findViewById(R.id.chip_group);
                        chipGroup.getClass();
                        chipGroup.b = new ehdj(chipGroup, new ahkj(ahko.this, ivVar));
                    }
                });
                create.show();
                final aewt aewtVar = ahkoVar.g;
                MessageIdType c = ahkoVar.c();
                final ConversationIdType b = ahkoVar.b();
                if (((Boolean) aexw.a.e()).booleanValue()) {
                    return;
                }
                axnw.h(aewtVar.b(c).h(new emwl() { // from class: aewr
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        final Long l = (Long) obj;
                        final aewt aewtVar2 = aewt.this;
                        final ConversationIdType conversationIdType = b;
                        aewtVar2.o(new Supplier() { // from class: aewo
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                Long l2 = l;
                                l2.getClass();
                                eqhd c2 = aewt.this.c(l2.longValue(), conversationIdType);
                                eqhm eqhmVar = (eqhm) eqhp.a.createBuilder();
                                eqhk eqhkVar = (eqhk) eqhl.a.createBuilder();
                                eqhkVar.copyOnWrite();
                                eqhl eqhlVar = (eqhl) eqhkVar.instance;
                                eqhlVar.c = 1;
                                eqhlVar.b |= 1;
                                eqhmVar.copyOnWrite();
                                eqhp eqhpVar = (eqhp) eqhmVar.instance;
                                eqhl eqhlVar2 = (eqhl) eqhkVar.build();
                                eqhlVar2.getClass();
                                eqhpVar.c = eqhlVar2;
                                eqhpVar.b = 2;
                                c2.copyOnWrite();
                                eqhq eqhqVar = (eqhq) c2.instance;
                                eqhp eqhpVar2 = (eqhp) eqhmVar.build();
                                eqhq eqhqVar2 = eqhq.a;
                                eqhpVar2.getClass();
                                eqhqVar.d = eqhpVar2;
                                eqhqVar.c = 1;
                                return (eqhq) c2.build();
                            }
                        });
                        return null;
                    }
                }, aewtVar.c));
            }
        }));
        if (H2.j || !((Boolean) ahko.a.e()).booleanValue()) {
            return;
        }
        final aewt aewtVar = H2.g;
        MessageIdType c = H2.c();
        final ConversationIdType b = H2.b();
        if (!((Boolean) aexw.a.e()).booleanValue()) {
            axnw.h(aewtVar.b(c).h(new emwl() { // from class: aewn
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    final Long l = (Long) obj;
                    final aewt aewtVar2 = aewt.this;
                    final ConversationIdType conversationIdType = b;
                    aewtVar2.o(new Supplier() { // from class: aewl
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            Long l2 = l;
                            l2.getClass();
                            eqhd c2 = aewt.this.c(l2.longValue(), conversationIdType);
                            eqhm eqhmVar = (eqhm) eqhp.a.createBuilder();
                            eqho eqhoVar = eqho.a;
                            eqhmVar.copyOnWrite();
                            eqhp eqhpVar = (eqhp) eqhmVar.instance;
                            eqhoVar.getClass();
                            eqhpVar.c = eqhoVar;
                            eqhpVar.b = 1;
                            c2.copyOnWrite();
                            eqhq eqhqVar = (eqhq) c2.instance;
                            eqhp eqhpVar2 = (eqhp) eqhmVar.build();
                            eqhq eqhqVar2 = eqhq.a;
                            eqhpVar2.getClass();
                            eqhqVar.d = eqhpVar2;
                            eqhqVar.c = 1;
                            return (eqhq) c2.build();
                        }
                    });
                    return null;
                }
            }, aewtVar.c));
        }
        H2.j = true;
    }
}
