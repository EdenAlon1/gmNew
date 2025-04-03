package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgc extends acfm {
    private final Context g;
    private final ctwb h;
    private final csjk i;
    private final ctvb j;
    private final bdtd k;

    public acgc(acfk acfkVar, Context context, ctwb ctwbVar, csjk csjkVar, ctvb ctvbVar, bdtd bdtdVar) {
        super(acfkVar, "SMS/MMS Connectivity Check");
        this.g = context;
        this.h = ctwbVar;
        this.i = csjkVar;
        this.j = ctvbVar;
        this.k = bdtdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [aoku, java.lang.Object] */
    @Override // defpackage.acfm
    public final acfn a() {
        boolean isDataEnabled;
        String string;
        int simState;
        this.a.b("Checking SIM statuses");
        final ArrayList arrayList = new ArrayList();
        ctwb ctwbVar = this.h;
        int c = ctwbVar.c();
        int b = ctwbVar.b();
        acfj acfjVar = this.a;
        acfo a = acfjVar.a();
        a.y("defaultSmsSubId", c);
        a.r();
        acfo a2 = acfjVar.a();
        a2.y("defaultDataSubId", b);
        a2.r();
        Context context = this.g;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            int e = ctwbVar.e();
            for (int i = 0; i < e; i++) {
                acfo a3 = acfjVar.a();
                a3.y("slotId", i);
                simState = telephonyManager.getSimState(i);
                a3.y("simState", simState);
                a3.r();
            }
        }
        (ctwbVar.q() ? Optional.empty() : Optional.of(context.getString(R.string.set_default_sms_sim_suggestion))).ifPresent(new Consumer() { // from class: acgb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        acfj acfjVar2 = this.a;
        Context context2 = this.g;
        ctwb ctwbVar2 = this.h;
        csjk csjkVar = this.i;
        ctvb ctvbVar = this.j;
        TelephonyManager telephonyManager2 = (TelephonyManager) context2.getSystemService("phone");
        if (telephonyManager2 == null) {
            acfjVar2.b("telephony manager is null");
        } else {
            acfo a4 = acfjVar2.a();
            a4.B("Device is SMS Capable", telephonyManager2.isSmsCapable());
            isDataEnabled = telephonyManager2.isDataEnabled();
            a4.B("Data is enabled", isDataEnabled);
            a4.B("Network is roaming", telephonyManager2.isNetworkRoaming());
            a4.B("Device is in airplaneMode", ctvbVar.E());
            a4.r();
        }
        List m = ctwbVar2.m();
        acga.a(m, 0, acfjVar2, csjkVar);
        acga.a(m, 1, acfjVar2, csjkVar);
        (ctvbVar.E() ? Optional.of(context2.getString(R.string.turn_off_airplane_mode_suggestion)) : Optional.empty()).ifPresent(new Consumer() { // from class: acgb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        acfj acfjVar3 = this.a;
        Context context3 = this.g;
        bdtd bdtdVar = this.k;
        bdtdVar.k();
        enqv it = ((engw) bdtdVar.i()).iterator();
        while (it.hasNext()) {
            aztg aztgVar = (aztg) it.next();
            acfo a5 = acfjVar3.a();
            a5.I("Active subscription:");
            a5.y("subId", aztgVar.e());
            a5.y("simSlotId", aztgVar.d());
            a5.A("selfParticipantId", aztgVar.g());
            if (aztgVar.b().isPresent()) {
                ?? r5 = aztgVar.b().get();
                a5.A("displayDestination", r5.G());
                a5.A("normalizedDestination", r5.p(((Boolean) aoqm.d.e()).booleanValue()));
            }
            a5.r();
        }
        aztg c2 = bdtdVar.c();
        if (c2 == null) {
            string = "Default subscription is null.";
        } else {
            acfo a6 = acfjVar3.a();
            a6.y("default subId", c2.e());
            a6.r();
            string = c2.b().isEmpty() ? context3.getString(R.string.enter_self_phone_number_suggestion) : null;
        }
        Optional.ofNullable(string).ifPresent(new Consumer() { // from class: acgb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return !arrayList.isEmpty() ? new acfn(4, arrayList) : acfn.a;
    }
}
