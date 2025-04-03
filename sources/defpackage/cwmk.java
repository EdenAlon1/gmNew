package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwmk {
    private final ffbr a;
    private final Optional b;
    private final ffbr c;
    private final ffbr d;
    private final Map e = ffew.g(new ffcf(cwml.a, Integer.valueOf(R.style.Theme_AppCompat_Translucent_NoTitleBar)), new ffcf(cwml.b, Integer.valueOf(R.style.BugleBaseTheme_NoActionBar)), new ffcf(cwml.c, Integer.valueOf(R.style.BugleTheme)), new ffcf(cwml.d, Integer.valueOf(R.style.BugleCameraActivityTheme)), new ffcf(cwml.e, Integer.valueOf(R.style.BugleTheme_ConversationActivity)), new ffcf(cwml.f, Integer.valueOf(R.style.BugleTheme_ContactDetails)), new ffcf(cwml.g, Integer.valueOf(R.style.BugleTheme_DiagnosticsActivity)), new ffcf(cwml.h, Integer.valueOf(R.style.BugleTheme_DialogActivity)), new ffcf(cwml.i, Integer.valueOf(R.style.Invisible)), new ffcf(cwml.k, Integer.valueOf(R.style.BugleTheme_MessageDetails)), new ffcf(cwml.j, Integer.valueOf(R.style.MediaViewerActivityTheme)), new ffcf(cwml.l, Integer.valueOf(R.style.BugleTheme_SettingsActivity)), new ffcf(cwml.m, Integer.valueOf(R.style.BugleTheme_SwipeActionSettingsActivity)), new ffcf(cwml.n, Integer.valueOf(R.style.BugleTheme_ToolbarSettingsActivity)), new ffcf(cwml.o, Integer.valueOf(R.style.BugleToolbarTheme)), new ffcf(cwml.p, Integer.valueOf(R.style.InvisibleWithNoTitle)), new ffcf(cwml.q, Integer.valueOf(R.style.Theme_GoogleMaterial3_DayNight_NoActionBar)));

    public cwmk(ffbr ffbrVar, Optional optional, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = optional;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    public final void a(final Activity activity, cwml cwmlVar) {
        int intValue;
        cwmlVar.getClass();
        if (((auxx) this.c.b()).a()) {
            this.b.isPresent();
            this.b.get();
            cwml cwmlVar2 = cwml.b;
            Integer valueOf = Integer.valueOf(R.style.Theme_GoogleMaterial3Expressive_DayNight_NoActionBar);
            cwml cwmlVar3 = cwml.a;
            Integer valueOf2 = Integer.valueOf(R.style.Theme_AppCompat_Translucent_NoTitleBar);
            cwml cwmlVar4 = cwml.g;
            Integer valueOf3 = Integer.valueOf(R.style.Theme_BugleCoolRanch_DayNight_NoActionBar);
            Integer num = (Integer) ffew.g(new ffcf(cwmlVar2, valueOf), new ffcf(cwmlVar3, valueOf2), new ffcf(cwml.c, Integer.valueOf(R.style.Theme_BugleCoolRanch_DayNight_ActionBar)), new ffcf(cwml.d, Integer.valueOf(R.style.Theme_BugleCoolRanch_Camera_DayNight_NoActionBar)), new ffcf(cwml.e, Integer.valueOf(R.style.Theme_BugleCoolRanch_Conversation_DayNight_NoActionBar)), new ffcf(cwml.f, valueOf), new ffcf(cwmlVar4, valueOf3), new ffcf(cwml.h, Integer.valueOf(R.style.Theme_BugleCoolRanch_Dialog_DayNight_ActionBar)), new ffcf(cwml.i, Integer.valueOf(R.style.Theme_BugleCoolRanch_Invisible)), new ffcf(cwml.j, valueOf3), new ffcf(cwml.k, valueOf), new ffcf(cwml.o, valueOf3), new ffcf(cwml.l, Integer.valueOf(R.style.Theme_BugleCoolRanch_Settings_DayNight_ActionBar)), new ffcf(cwml.m, Integer.valueOf(R.style.Theme_BugleCoolRanch_SettingsSwipe_DayNight_NoActionBar)), new ffcf(cwml.n, Integer.valueOf(R.style.Theme_BugleCoolRanch_Settings_DayNight_NoActionBar)), new ffcf(cwml.p, valueOf2), new ffcf(cwml.q, valueOf)).get(cwmlVar);
            if (num == null) {
                Objects.toString(cwmlVar);
                throw new IllegalArgumentException("Unknown theme choice: ".concat(cwmlVar.toString()));
            }
            intValue = num.intValue();
        } else {
            Integer num2 = (Integer) this.e.get(cwmlVar);
            if (num2 == null) {
                Objects.toString(cwmlVar);
                throw new IllegalArgumentException("Unknown theme choice: ".concat(cwmlVar.toString()));
            }
            intValue = num2.intValue();
        }
        activity.getTheme().applyStyle(intValue, true);
        Optional a = ((cwmm) this.a.b()).a();
        final ffji ffjiVar = new ffji() { // from class: cwmi
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Integer num3 = (Integer) obj;
                num3.getClass();
                activity.getTheme().applyStyle(num3.intValue(), true);
                return ffcu.a;
            }
        };
        a.ifPresent(new Consumer() { // from class: cwmj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
