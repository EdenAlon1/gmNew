package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxj implements aaxh {
    private static final enru d = enru.c("com/google/android/apps/messaging/conversation2/messagelist/suggestion/CalendarSuggestionClickHandlerImpl");
    public final alxs a;
    public final ffbr b;
    public final Context c;
    private final ffsk e;

    public aaxj(ffsk ffskVar, alxs alxsVar, ffbr ffbrVar, Context context) {
        ffskVar.getClass();
        alxsVar.getClass();
        context.getClass();
        this.e = ffskVar;
        this.a = alxsVar;
        this.b = ffbrVar;
        this.c = context;
    }

    @Override // defpackage.aaxh
    public final boolean a(Long l, Long l2, String str, String str2, String str3, aoax aoaxVar) {
        Intent a = czts.a("android.intent.action.INSERT", l, l2);
        if (!TextUtils.isEmpty(str)) {
            a.putExtra("eventLocation", str);
        }
        if (str2 != null) {
            a.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, str2);
        }
        if (str3 != null) {
            a.putExtra("description", str3);
        }
        dlps dlpsVar = (dlps) dlpv.a.createBuilder();
        dlpsVar.copyOnWrite();
        dlpv.a((dlpv) dlpsVar.instance);
        dlpt dlptVar = (dlpt) dlpu.a.createBuilder();
        String string = this.c.getString(R.string.calendar_suggestion_event_chat_title);
        dlptVar.copyOnWrite();
        dlpu dlpuVar = (dlpu) dlptVar.instance;
        string.getClass();
        dlpuVar.b |= 16;
        dlpuVar.c = string;
        dlpsVar.copyOnWrite();
        dlpv dlpvVar = (dlpv) dlpsVar.instance;
        dlpu dlpuVar2 = (dlpu) dlptVar.build();
        dlpuVar2.getClass();
        dlpvVar.h = dlpuVar2;
        dlpvVar.b |= 8192;
        if (a.hasExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE)) {
            String stringExtra = a.getStringExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
            stringExtra.getClass();
            dlpsVar.copyOnWrite();
            dlpv dlpvVar2 = (dlpv) dlpsVar.instance;
            dlpvVar2.b |= 2;
            dlpvVar2.c = stringExtra;
        }
        if (a.hasExtra("eventLocation")) {
            String stringExtra2 = a.getStringExtra("eventLocation");
            stringExtra2.getClass();
            dlpsVar.copyOnWrite();
            dlpv dlpvVar3 = (dlpv) dlpsVar.instance;
            dlpvVar3.b |= 64;
            dlpvVar3.f = stringExtra2;
        }
        if (a.hasExtra("description")) {
            String stringExtra3 = a.getStringExtra("description");
            stringExtra3.getClass();
            dlpsVar.copyOnWrite();
            dlpv dlpvVar4 = (dlpv) dlpsVar.instance;
            dlpvVar4.b |= 128;
            dlpvVar4.g = stringExtra3;
        }
        if (a.hasExtra("beginTime")) {
            long longExtra = a.getLongExtra("beginTime", 0L);
            dlpsVar.copyOnWrite();
            dlpv dlpvVar5 = (dlpv) dlpsVar.instance;
            dlpvVar5.b |= 8;
            dlpvVar5.d = longExtra;
        }
        if (a.hasExtra("endTime")) {
            long longExtra2 = a.getLongExtra("endTime", 0L);
            dlpsVar.copyOnWrite();
            dlpv dlpvVar6 = (dlpv) dlpsVar.instance;
            dlpvVar6.b |= 16;
            dlpvVar6.e = longExtra2;
        }
        eyfy build = dlpsVar.build();
        build.getClass();
        a.putExtra("proto", ((dlpv) build).toByteArray());
        aiir aiirVar = new aiir("CalendarSuggestion", new ael(), a);
        if (((aigz) this.b.b()).i(aiirVar)) {
            axol.m(this.e, new aaxi(this, aiirVar, aoaxVar, null));
            return true;
        }
        ((enrr) d.j().h("com/google/android/apps/messaging/conversation2/messagelist/suggestion/CalendarSuggestionClickHandlerImpl", "startActivityAndHandleCalendarResultV2", 86, "CalendarSuggestionClickHandlerImpl.kt")).q("Unable to navigate to calendar");
        return false;
    }
}
