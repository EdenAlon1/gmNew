package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoUnit;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yif implements yht {
    public final Context a;
    private final ajjc b;
    private final cqoh c;
    private final acdc d;

    public yif(Context context, ffsk ffskVar, ajjc ajjcVar, cqoh cqohVar, acdc acdcVar) {
        context.getClass();
        ffskVar.getClass();
        ajjcVar.getClass();
        cqohVar.getClass();
        acdcVar.getClass();
        this.a = context;
        this.b = ajjcVar;
        this.c = cqohVar;
        this.d = acdcVar;
    }

    @Override // defpackage.yht
    public final void a(final ffix ffixVar, final ffji ffjiVar) {
        final ZonedDateTime atZone = this.c.f().truncatedTo(ChronoUnit.MINUTES).atZone(ZoneId.systemDefault());
        int hour = atZone.getHour();
        if (hour < 8) {
            atZone.getClass();
            this.b.d(true, new ffji() { // from class: yhu
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ajiy ajiyVar = (ajiy) obj;
                    ajiyVar.getClass();
                    yif yifVar = yif.this;
                    ZonedDateTime zonedDateTime = atZone;
                    String e = yifVar.e();
                    String d = yifVar.d();
                    ZonedDateTime withMinute = zonedDateTime.withHour(8).withSecond(0).withMinute(0);
                    withMinute.getClass();
                    ffji ffjiVar2 = ffjiVar;
                    ZonedDateTime withMinute2 = zonedDateTime.withHour(13).withSecond(0).withMinute(0);
                    withMinute2.getClass();
                    ZonedDateTime withMinute3 = zonedDateTime.withHour(18).withSecond(0).withMinute(0);
                    withMinute3.getClass();
                    return new dmvi(e, ffdx.g(yifVar.b(withMinute, dmzz.L, R.string.datetime_picker_preset_option_later_today, ajiyVar, ffjiVar2), yifVar.b(withMinute2, dmzz.J, R.string.datetime_picker_preset_option_later_today, ajiyVar, ffjiVar2), yifVar.b(withMinute3, dmzz.cn, R.string.datetime_picker_preset_option_later_today, ajiyVar, ffjiVar2), new dnha(null), yifVar.c(zonedDateTime, ajiyVar, ffixVar, ffjiVar2)), d, null, null, yifVar.f(ajiyVar), null, 88);
                }
            });
        } else if (hour < 16) {
            atZone.getClass();
            this.b.d(true, new ffji() { // from class: yhz
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ajiy ajiyVar = (ajiy) obj;
                    ajiyVar.getClass();
                    yif yifVar = yif.this;
                    ZonedDateTime zonedDateTime = atZone;
                    String e = yifVar.e();
                    String d = yifVar.d();
                    ZonedDateTime withMinute = zonedDateTime.withHour(17).withSecond(0).withMinute(0);
                    withMinute.getClass();
                    ffji ffjiVar2 = ffjiVar;
                    ZonedDateTime withMinute2 = zonedDateTime.withHour(21).withSecond(0).withMinute(0);
                    withMinute2.getClass();
                    ZonedDateTime withMinute3 = zonedDateTime.plusDays(1L).withHour(8).withSecond(0).withMinute(0);
                    withMinute3.getClass();
                    return new dmvi(e, ffdx.g(yifVar.b(withMinute, dmzz.L, R.string.datetime_picker_preset_option_later_today, ajiyVar, ffjiVar2), yifVar.b(withMinute2, dmzz.J, R.string.scheduled_send_preset_option_later_tonight, ajiyVar, ffjiVar2), yifVar.b(withMinute3, dmzz.cn, R.string.datetime_picker_preset_option_tomorrow, ajiyVar, ffjiVar2), new dnha(null), yifVar.c(zonedDateTime, ajiyVar, ffixVar, ffjiVar2)), d, null, null, yifVar.f(ajiyVar), null, 88);
                }
            });
        } else {
            atZone.getClass();
            this.b.d(true, new ffji() { // from class: yhx
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ajiy ajiyVar = (ajiy) obj;
                    ajiyVar.getClass();
                    yif yifVar = yif.this;
                    ZonedDateTime zonedDateTime = atZone;
                    String e = yifVar.e();
                    String d = yifVar.d();
                    ZonedDateTime withMinute = zonedDateTime.plusDays(1L).withHour(8).withSecond(0).withMinute(0);
                    withMinute.getClass();
                    ffji ffjiVar2 = ffjiVar;
                    ZonedDateTime withMinute2 = zonedDateTime.plusDays(1L).withHour(13).withSecond(0).withMinute(0);
                    withMinute2.getClass();
                    ZonedDateTime withMinute3 = zonedDateTime.plusDays(1L).withHour(18).withSecond(0).withMinute(0);
                    withMinute3.getClass();
                    return new dmvi(e, ffdx.g(yifVar.b(withMinute, dmzz.L, R.string.datetime_picker_preset_option_tomorrow, ajiyVar, ffjiVar2), yifVar.b(withMinute2, dmzz.J, R.string.datetime_picker_preset_option_tomorrow, ajiyVar, ffjiVar2), yifVar.b(withMinute3, dmzz.cn, R.string.datetime_picker_preset_option_tomorrow, ajiyVar, ffjiVar2), new dnha(null), yifVar.c(zonedDateTime, ajiyVar, ffixVar, ffjiVar2)), d, null, null, yifVar.f(ajiyVar), null, 88);
                }
            });
        }
    }

    public final dnlz b(final ZonedDateTime zonedDateTime, dmzz dmzzVar, int i, final ajiy ajiyVar, final ffji ffjiVar) {
        dnlf dnlfVar = new dnlf(dmzzVar);
        String string = this.a.getString(i, this.d.b(zonedDateTime.toInstant().toEpochMilli()));
        string.getClass();
        return new dnlz(string, null, null, null, null, dnlfVar, null, new ffix() { // from class: yhy
            @Override // defpackage.ffix
            public final Object invoke() {
                ajiy.this.a();
                Instant instant = zonedDateTime.toInstant();
                instant.getClass();
                ffjiVar.invoke(instant);
                return ffcu.a;
            }
        }, 94);
    }

    public final dnlz c(final ZonedDateTime zonedDateTime, final ajiy ajiyVar, final ffix ffixVar, final ffji ffjiVar) {
        dnlf dnlfVar = new dnlf(dmzz.aX);
        String string = this.a.getString(R.string.datetime_picker_preset_option_custom);
        string.getClass();
        return new dnlz(string, null, null, null, null, dnlfVar, null, new ffix() { // from class: yia
            @Override // defpackage.ffix
            public final Object invoke() {
                final ZonedDateTime zonedDateTime2 = zonedDateTime;
                Instant instant = zonedDateTime2.toInstant();
                instant.getClass();
                final yif yifVar = this;
                boolean is24HourFormat = DateFormat.is24HourFormat(yifVar.a);
                ffji ffjiVar2 = new ffji() { // from class: yib
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() >= ZonedDateTime.this.getYear());
                    }
                };
                ffji ffjiVar3 = new ffji() { // from class: yic
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        LocalDate localDate = (LocalDate) obj;
                        localDate.getClass();
                        return Boolean.valueOf(localDate.compareTo((ChronoLocalDate) ZonedDateTime.this.b()) >= 0);
                    }
                };
                final ajiy ajiyVar2 = ajiy.this;
                final ffji ffjiVar4 = ffjiVar;
                ffji ffjiVar5 = new ffji() { // from class: yid
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        long longValue = ((Long) obj).longValue();
                        ajiy.this.a();
                        Instant ofEpochMilli = Instant.ofEpochMilli(longValue);
                        ofEpochMilli.getClass();
                        ffjiVar4.invoke(ofEpochMilli);
                        return ffcu.a;
                    }
                };
                String string2 = yifVar.a.getString(android.R.string.cancel);
                string2.getClass();
                final ffix ffixVar2 = ffixVar;
                doas doasVar = new doas(string2, new ffix() { // from class: yie
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ajiy.this.a();
                        yifVar.a(ffixVar2, ffjiVar4);
                        return ffcu.a;
                    }
                });
                ffix ffixVar3 = new ffix() { // from class: yhv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ajiy.this.a();
                        yifVar.a(ffixVar2, ffjiVar4);
                        return ffcu.a;
                    }
                };
                Context context = yifVar.a;
                String string3 = context.getString(R.string.datetime_picker_dialog_finish_button);
                string3.getClass();
                ajiyVar2.b(new dmvg(context, instant, is24HourFormat, ffjiVar2, ffjiVar3, ffjiVar5, new doas(string3, new ffix() { // from class: dmvf
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return ffcu.a;
                    }
                }), doasVar, ffixVar3));
                return ffcu.a;
            }
        }, 94);
    }

    public final String d() {
        String string = this.a.getString(R.string.scheduled_send_datetime_picker_subtitle);
        string.getClass();
        return string;
    }

    public final String e() {
        String string = this.a.getString(R.string.scheduled_send_datetime_picker_title, TimeZone.getDefault().getDisplayName(ZoneId.systemDefault().getRules().isDaylightSavings(this.c.f()), 0));
        string.getClass();
        return string;
    }

    public final doas f(final ajiy ajiyVar) {
        String string = this.a.getString(R.string.datetime_picker_cancel_button);
        string.getClass();
        return new doas(string, new ffix() { // from class: yhw
            @Override // defpackage.ffix
            public final Object invoke() {
                ajiy.this.a();
                yja.d();
                return ffcu.a;
            }
        });
    }
}
