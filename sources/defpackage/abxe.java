package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;
import com.google.android.apps.messaging.datadonation.ui.singlemessage.RecategorizeDonateView;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.notification.receiver.DismissNotificationReceiver;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxe implements abxd {
    private final ffbr b;
    private final ffbr c;

    public abxe(ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.abxd
    public final Optional a(crly crlyVar, SuperSortLabel superSortLabel) {
        abwy abwyVar;
        emxf.l(aewg.h());
        if (!crlyVar.i()) {
            return Optional.empty();
        }
        acam H = ((RecategorizeDonateView) crlyVar.b()).H();
        if (!((CheckBox) ((RecategorizeDonateView) H.b.b()).findViewById(R.id.donate_checkbox)).isChecked()) {
            return Optional.empty();
        }
        H.f.getClass();
        H.g.getClass();
        Editable text = ((EditText) ((RecategorizeDonateView) H.b.b()).findViewById(R.id.message_editor)).getText();
        text.getClass();
        Optional b = acah.b(H.g, text);
        if (b.isPresent()) {
            text = ((acae) b.get()).a;
            abwyVar = ((acae) b.get()).b;
        } else {
            abwyVar = null;
        }
        Editable editable = text;
        abwy abwyVar2 = abwyVar;
        emxf.l(H.f.az());
        cfva cfvaVar = aoqm.a;
        ezfx a = acah.a(editable, ((Boolean) new aopr().get()).booleanValue() ? H.f.r().o() : H.f.S(), H.f.i(), 0, abwyVar2);
        ezfy ezfyVar = (ezfy) acam.a.get(H.f.t);
        ezfyVar.getClass();
        a.copyOnWrite();
        ezfz ezfzVar = (ezfz) a.instance;
        ezfz ezfzVar2 = ezfz.a;
        ezfzVar.f = ezfyVar.a();
        ezfy ezfyVar2 = (ezfy) acam.a.get(superSortLabel);
        ezfyVar2.getClass();
        a.copyOnWrite();
        ((ezfz) a.instance).g = ezfyVar2.a();
        return Optional.of((ezfz) a.build());
    }

    @Override // defpackage.abxd
    public final void b() {
        emxf.l(e());
        ((abxj) this.b.b()).a.j(cinj.DATA_DONATION);
    }

    @Override // defpackage.abxd
    public final void c(crly crlyVar, bcse bcseVar) {
        emxf.l(aewg.h());
        if (bcseVar.ar()) {
            crlyVar.f(R.layout.recategorize_donate);
            final acam H = ((RecategorizeDonateView) crlyVar.b()).H();
            H.f = bcseVar;
            CheckBox checkBox = (CheckBox) ((RecategorizeDonateView) H.b.b()).findViewById(R.id.donate_checkbox);
            Context context = ((RecategorizeDonateView) H.b.b()).getContext();
            TextView textView = (TextView) ((RecategorizeDonateView) H.b.b()).findViewById(R.id.learn_more);
            String a = crmi.a(context);
            textView.setText(ddyi.b(context, H.c, H.d, a, a, acaf.a, acaf.b));
            egyl.b(textView);
            egyl.c(textView);
            final View findViewById = ((RecategorizeDonateView) H.b.b()).findViewById(R.id.message_container);
            EditText editText = (EditText) findViewById.findViewById(R.id.message_editor);
            String V = bcseVar.V(context);
            V.getClass();
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(V);
            Collection.EL.stream(abxk.a()).forEach(new Consumer() { // from class: acak
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    enhk enhkVar = acam.a;
                    ((abxp) obj).a(spannableStringBuilder);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            editText.setText(spannableStringBuilder);
            H.g = spannableStringBuilder;
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: acal
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ekzm b = ((elbx) acam.this.e.b()).b("RecategorizeDonateViewPeer#dbind#setOnCheckedChangeListener");
                    try {
                        findViewById.setVisibility(true != z ? 8 : 0);
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
            });
            crlyVar.g(0);
        }
    }

    @Override // defpackage.abxd
    public final void d(final ezfz ezfzVar) {
        emxf.l(aewg.h());
        acaj acajVar = (acaj) this.c.b();
        final abya abyaVar = (abya) acajVar.a.b();
        final String uuid = UUID.randomUUID().toString();
        abyaVar.a(new abxz() { // from class: abxx
            @Override // defpackage.abxz
            public final engw a() {
                ezft ezftVar = (ezft) ezfu.a.createBuilder();
                ezfr ezfrVar = (ezfr) ezfs.a.createBuilder();
                ezfrVar.copyOnWrite();
                ezfs ezfsVar = (ezfs) ezfrVar.instance;
                ezfz ezfzVar2 = ezfzVar;
                ezfzVar2.getClass();
                ezfsVar.a();
                ezfsVar.b.add(ezfzVar2);
                ezftVar.copyOnWrite();
                ezfu ezfuVar = (ezfu) ezftVar.instance;
                ezfs ezfsVar2 = (ezfs) ezfrVar.build();
                ezfsVar2.getClass();
                ezfuVar.a();
                ezfuVar.c.add(ezfsVar2);
                abya abyaVar2 = abya.this;
                String r = abyaVar2.g.r();
                ezftVar.copyOnWrite();
                ezfu ezfuVar2 = (ezfu) ezftVar.instance;
                r.getClass();
                ezfuVar2.e = r;
                String languageTag = ctid.c(abyaVar2.f).toLanguageTag();
                ezftVar.copyOnWrite();
                ezfu ezfuVar3 = (ezfu) ezftVar.instance;
                languageTag.getClass();
                ezfuVar3.d = languageTag;
                ezga ezgaVar = (ezga) ezgb.a.createBuilder();
                ezgaVar.copyOnWrite();
                ezgb ezgbVar = (ezgb) ezgaVar.instance;
                String str = uuid;
                str.getClass();
                ezgbVar.b = str;
                ezgaVar.copyOnWrite();
                ((ezgb) ezgaVar.instance).d = 0;
                ezgaVar.copyOnWrite();
                ((ezgb) ezgaVar.instance).c = 1;
                ezftVar.copyOnWrite();
                ezfu ezfuVar4 = (ezfu) ezftVar.instance;
                ezgb ezgbVar2 = (ezgb) ezgaVar.build();
                ezgbVar2.getClass();
                ezfuVar4.f = ezgbVar2;
                ezfuVar4.b |= 1;
                return engw.r((ezfu) ezftVar.build());
            }
        }).k(new acai(acajVar), erpp.a);
    }

    @Override // defpackage.abxd
    public final boolean e() {
        return ((Boolean) abxd.a.e()).booleanValue();
    }

    @Override // defpackage.abxd
    public final boolean f() {
        emxf.l(e());
        abxj abxjVar = (abxj) this.b.b();
        if (!abxjVar.a.K()) {
            return false;
        }
        cins cinsVar = abxjVar.a;
        final abxi abxiVar = abxjVar.b;
        cinsVar.I(abxiVar.b.a(new ciql() { // from class: abxh
            @Override // defpackage.ciql
            public final Notification a(String str) {
                abxi abxiVar2 = abxi.this;
                kml kmlVar = new kml(abxiVar2.a, str);
                PendingIntent f = DismissNotificationReceiver.f(abxiVar2.a, cinj.DATA_DONATION);
                Intent intent = new Intent(abxiVar2.a, (Class<?>) DataDonationActivity.class);
                intent.putExtra("DATA_DONATION_OPEN_SOURCE", 2);
                intent.putExtra("EXTRA_COLLECTOR_KEY", "AllMessagesDonationConversationCollector");
                knx knxVar = new knx(abxiVar2.a);
                knxVar.e(intent);
                PendingIntent a = knxVar.a(0, 201326592);
                a.getClass();
                kmlVar.i(abxiVar2.a.getString(R.string.donation_notification_title));
                kmlVar.h(abxiVar2.a.getString(R.string.donation_notification_body));
                kmlVar.l = 3;
                kmlVar.r(R.drawable.notification_icon);
                kmlVar.d(R.drawable.ic_check_circle_gray, abxiVar2.a.getString(R.string.automoved_spam_notification_action_dismiss), f);
                kmlVar.d(R.drawable.quantum_ic_googleplus_reshare_googblue_24, abxiVar2.a.getString(R.string.automoved_spam_notification_action_view), a);
                kmlVar.g = a;
                kmlVar.g(true);
                kmlVar.p(true);
                kmlVar.C = abxiVar2.a.getColor(R.color.primary_color);
                return kmlVar.a();
            }
        }, cinj.DATA_DONATION));
        abxg abxgVar = abxjVar.c;
        eoxp eoxpVar = (eoxp) eoyf.a.createBuilder();
        eoxx eoxxVar = (eoxx) eoxz.a.createBuilder();
        eoxxVar.copyOnWrite();
        eoxz eoxzVar = (eoxz) eoxxVar.instance;
        eoxzVar.c = 1;
        eoxzVar.b |= 1;
        eoxpVar.copyOnWrite();
        eoyf eoyfVar = (eoyf) eoxpVar.instance;
        eoxz eoxzVar2 = (eoxz) eoxxVar.build();
        eoxzVar2.getClass();
        eoyfVar.c = eoxzVar2;
        eoyfVar.b = 5;
        abxgVar.a(eoxpVar);
        return true;
    }
}
