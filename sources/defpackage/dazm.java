package defpackage;

import android.R;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dazm {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/debug/cloudstore/DebugCmsUtils");
    public static final enhk b = enhk.q("Set deviceId", "testDeviceId", "Set cmsD2DTimestamp", "2024-06-03T04:00:00-08:00", "Set dailyRetrievedCmsTimestamp", "2024-06-03T04:00:00-08:00", "Set PriorToCmsGaiaId", "testPriorToGaiaId", "Set priorToDeviceId", "testDeviceId", "Set cmsOptOutTimestamp", "2024-06-03T04:00:00-08:00");
    public final axkm c;
    public final errl d;
    public final errl e;
    public final ffbr f;
    public final babf g;
    public final elbx h;
    public final axmm i;

    public dazm(axkm axkmVar, errl errlVar, errl errlVar2, ffbr ffbrVar, babf babfVar, elbx elbxVar, axmm axmmVar) {
        this.c = axkmVar;
        this.d = errlVar;
        this.f = ffbrVar;
        this.g = babfVar;
        this.e = errlVar2;
        this.h = elbxVar;
        this.i = axmmVar;
    }

    public static Spinner a(Context context, List list) {
        rt rtVar = new rt(context);
        rtVar.setAdapter((SpinnerAdapter) new ArrayAdapter(context, R.layout.simple_spinner_dropdown_item, list));
        return rtVar;
    }

    public final void b(dbiq dbiqVar, String str, LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(dbiqVar.a);
        linearLayout2.addView(dbiqVar.b(str));
        linearLayout2.setOrientation(1);
        EditText a2 = dbiqVar.a(1);
        a2.setText((CharSequence) b.get(str));
        a2.setMaxLines(1);
        a2.setImeOptions(6);
        a2.setFocusable(true);
        if ("Set cmsOptOutTimestamp".equals(str)) {
            a2.setId(com.google.android.apps.messaging.R.id.debug_menu_set_opt_out_timestamp);
        }
        a2.addTextChangedListener(new dazl(this, str, a2));
        linearLayout2.addView(a2);
        linearLayout.addView(linearLayout2);
    }

    public final void c(dbiq dbiqVar, String str, LinearLayout linearLayout, csfz csfzVar) {
        TextView b2 = dbiqVar.b(str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 17;
        b2.setTypeface(((AppCompatTextView) b2).d, 1);
        b2.setLayoutParams(layoutParams);
        b2.setPadding(0, 5, 0, 5);
        linearLayout.addView(b2);
        ArrayList arrayList = new ArrayList();
        arrayList.add("Not selected");
        arrayList.add("Off");
        arrayList.add("On");
        Spinner a2 = a(dbiqVar.a, arrayList);
        a2.setSelection(0, false);
        linearLayout.addView(a2);
        a2.setOnItemSelectedListener(new elbw(this.h, new dazd(this, csfzVar)));
    }

    public final void d(dbiq dbiqVar, String str, LinearLayout linearLayout, csfz csfzVar) {
        TextView b2 = dbiqVar.b(str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 17;
        b2.setTypeface(((AppCompatTextView) b2).d, 1);
        b2.setLayoutParams(layoutParams);
        b2.setPadding(0, 5, 0, 5);
        linearLayout.addView(b2);
        ArrayList arrayList = new ArrayList();
        arrayList.add("Not selected");
        arrayList.addAll((Collection) DesugarArrays.stream(axeu.values()).map(new Function() { // from class: dayx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((axeu) obj).name();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new dayw())));
        Spinner a2 = a(dbiqVar.a, arrayList);
        linearLayout.addView(a2);
        a2.setSelection(0, false);
        a2.setOnItemSelectedListener(new elbw(this.h, new dazf(this, csfzVar)));
    }
}
