package defpackage;

import com.google.android.apps.messaging.R;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akta implements aksy {
    public int a = -1;
    private final cqoh b;
    private final acdr c;
    private final ea d;

    public akta(cqoh cqohVar, acdr acdrVar, ea eaVar) {
        this.b = cqohVar;
        this.c = acdrVar;
        this.d = eaVar;
    }

    @Override // defpackage.aksy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aksy
    public final void b() {
        engw t;
        acbh acbhVar = (acbh) acbi.a.createBuilder();
        String Z = this.d.Z(R.string.scheduled_send_datetime_picker_title, TimeZone.getDefault().getDisplayName(ZoneId.systemDefault().getRules().isDaylightSavings(this.b.f()), 0));
        acbhVar.copyOnWrite();
        acbi acbiVar = (acbi) acbhVar.instance;
        Z.getClass();
        acbiVar.c = Z;
        String Y = this.d.Y(R.string.scheduled_send_datetime_picker_subtitle);
        acbhVar.copyOnWrite();
        acbi acbiVar2 = (acbi) acbhVar.instance;
        Y.getClass();
        acbiVar2.d = Y;
        ZonedDateTime withNano = this.b.f().atZone(ZoneId.systemDefault()).withMinute(0).withSecond(0).withNano(0);
        int hour = withNano.getHour();
        if (hour < 8) {
            acbj acbjVar = (acbj) acbk.a.createBuilder();
            acbjVar.copyOnWrite();
            ((acbk) acbjVar.instance).c = R.string.datetime_picker_preset_option_later_today;
            acbjVar.copyOnWrite();
            ((acbk) acbjVar.instance).b = R.drawable.quantum_gm_ic_brightness_low_black_24;
            long epochMilli = withNano.withHour(8).toInstant().toEpochMilli();
            acbjVar.copyOnWrite();
            ((acbk) acbjVar.instance).d = epochMilli;
            acbjVar.copyOnWrite();
            ((acbk) acbjVar.instance).e = 1;
            acbk acbkVar = (acbk) acbjVar.build();
            acbj acbjVar2 = (acbj) acbk.a.createBuilder();
            acbjVar2.copyOnWrite();
            ((acbk) acbjVar2.instance).c = R.string.datetime_picker_preset_option_later_today;
            acbjVar2.copyOnWrite();
            ((acbk) acbjVar2.instance).b = R.drawable.quantum_gm_ic_brightness_medium_black_24;
            long epochMilli2 = withNano.withHour(13).toInstant().toEpochMilli();
            acbjVar2.copyOnWrite();
            ((acbk) acbjVar2.instance).d = epochMilli2;
            acbjVar2.copyOnWrite();
            ((acbk) acbjVar2.instance).e = 2;
            acbk acbkVar2 = (acbk) acbjVar2.build();
            acbj acbjVar3 = (acbj) acbk.a.createBuilder();
            acbjVar3.copyOnWrite();
            ((acbk) acbjVar3.instance).c = R.string.datetime_picker_preset_option_later_today;
            acbjVar3.copyOnWrite();
            ((acbk) acbjVar3.instance).b = R.drawable.quantum_ic_brightness_2_black_24;
            long epochMilli3 = withNano.withHour(18).toInstant().toEpochMilli();
            acbjVar3.copyOnWrite();
            ((acbk) acbjVar3.instance).d = epochMilli3;
            acbjVar3.copyOnWrite();
            ((acbk) acbjVar3.instance).e = 3;
            t = engw.t(acbkVar, acbkVar2, (acbk) acbjVar3.build());
        } else if (hour < 16) {
            acbj acbjVar4 = (acbj) acbk.a.createBuilder();
            acbjVar4.copyOnWrite();
            ((acbk) acbjVar4.instance).c = R.string.datetime_picker_preset_option_later_today;
            acbjVar4.copyOnWrite();
            ((acbk) acbjVar4.instance).b = R.drawable.quantum_gm_ic_brightness_medium_black_24;
            long epochMilli4 = withNano.withHour(17).toInstant().toEpochMilli();
            acbjVar4.copyOnWrite();
            ((acbk) acbjVar4.instance).d = epochMilli4;
            acbjVar4.copyOnWrite();
            ((acbk) acbjVar4.instance).e = 4;
            acbk acbkVar3 = (acbk) acbjVar4.build();
            acbj acbjVar5 = (acbj) acbk.a.createBuilder();
            acbjVar5.copyOnWrite();
            ((acbk) acbjVar5.instance).c = R.string.scheduled_send_preset_option_later_tonight;
            acbjVar5.copyOnWrite();
            ((acbk) acbjVar5.instance).b = R.drawable.quantum_ic_brightness_2_black_24;
            long epochMilli5 = withNano.withHour(21).toInstant().toEpochMilli();
            acbjVar5.copyOnWrite();
            ((acbk) acbjVar5.instance).d = epochMilli5;
            acbjVar5.copyOnWrite();
            ((acbk) acbjVar5.instance).e = 5;
            acbk acbkVar4 = (acbk) acbjVar5.build();
            acbj acbjVar6 = (acbj) acbk.a.createBuilder();
            acbjVar6.copyOnWrite();
            ((acbk) acbjVar6.instance).c = R.string.datetime_picker_preset_option_tomorrow;
            acbjVar6.copyOnWrite();
            ((acbk) acbjVar6.instance).b = R.drawable.quantum_gm_ic_brightness_low_black_24;
            long epochMilli6 = withNano.plusDays(1L).withHour(8).toInstant().toEpochMilli();
            acbjVar6.copyOnWrite();
            ((acbk) acbjVar6.instance).d = epochMilli6;
            acbjVar6.copyOnWrite();
            ((acbk) acbjVar6.instance).e = 6;
            t = engw.t(acbkVar3, acbkVar4, (acbk) acbjVar6.build());
        } else {
            acbj acbjVar7 = (acbj) acbk.a.createBuilder();
            acbjVar7.copyOnWrite();
            ((acbk) acbjVar7.instance).c = R.string.datetime_picker_preset_option_tomorrow;
            acbjVar7.copyOnWrite();
            ((acbk) acbjVar7.instance).b = R.drawable.quantum_gm_ic_brightness_low_black_24;
            long epochMilli7 = withNano.plusDays(1L).withHour(8).toInstant().toEpochMilli();
            acbjVar7.copyOnWrite();
            ((acbk) acbjVar7.instance).d = epochMilli7;
            acbjVar7.copyOnWrite();
            ((acbk) acbjVar7.instance).e = 7;
            acbk acbkVar5 = (acbk) acbjVar7.build();
            acbj acbjVar8 = (acbj) acbk.a.createBuilder();
            acbjVar8.copyOnWrite();
            ((acbk) acbjVar8.instance).c = R.string.datetime_picker_preset_option_tomorrow;
            acbjVar8.copyOnWrite();
            ((acbk) acbjVar8.instance).b = R.drawable.quantum_gm_ic_brightness_medium_black_24;
            long epochMilli8 = withNano.plusDays(1L).withHour(13).toInstant().toEpochMilli();
            acbjVar8.copyOnWrite();
            ((acbk) acbjVar8.instance).d = epochMilli8;
            acbjVar8.copyOnWrite();
            ((acbk) acbjVar8.instance).e = 8;
            acbk acbkVar6 = (acbk) acbjVar8.build();
            acbj acbjVar9 = (acbj) acbk.a.createBuilder();
            acbjVar9.copyOnWrite();
            ((acbk) acbjVar9.instance).c = R.string.datetime_picker_preset_option_tomorrow;
            acbjVar9.copyOnWrite();
            ((acbk) acbjVar9.instance).b = R.drawable.quantum_ic_brightness_2_black_24;
            long epochMilli9 = withNano.plusDays(1L).withHour(18).toInstant().toEpochMilli();
            acbjVar9.copyOnWrite();
            ((acbk) acbjVar9.instance).d = epochMilli9;
            acbjVar9.copyOnWrite();
            ((acbk) acbjVar9.instance).e = 9;
            t = engw.t(acbkVar5, acbkVar6, (acbk) acbjVar9.build());
        }
        acbhVar.a(t);
        this.c.b((acbi) acbhVar.build(), new aksz(this));
    }
}
