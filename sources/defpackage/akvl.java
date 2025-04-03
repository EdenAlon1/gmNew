package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.alarm.BugleAlarmReceiver;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akvl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Intent b;
    final /* synthetic */ BugleAlarmReceiver c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akvl(ffgu ffguVar, Intent intent, BugleAlarmReceiver bugleAlarmReceiver) {
        super(2, ffguVar);
        this.b = intent;
        this.c = bugleAlarmReceiver;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akvl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (!ffkj.e(this.b.getAction(), "com.google.android.apps.messaging.shared.alarm.ACTION_BUGLE_ALARM")) {
                ((enrr) BugleAlarmReceiver.a.j().h("com/google/android/apps/messaging/shared/alarm/BugleAlarmReceiver$doInBackgroundAsync$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 72, "BugleAlarmReceiver.kt")).q("Unexpected intent action sent to BugleAlarmReceiver");
                return ffcu.a;
            }
            ffbr ffbrVar = this.c.c;
            if (ffbrVar == null) {
                ffkj.c("bugleAlarmExecutor");
                ffbrVar = null;
            }
            akvk akvkVar = (akvk) ffbrVar.b();
            Intent intent = this.b;
            BugleAlarmReceiver bugleAlarmReceiver = this.c;
            this.a = 1;
            String stringExtra = intent.getStringExtra("com.google.android.apps.messaging.shared.alarm.task");
            if (stringExtra == null) {
                throw new IllegalArgumentException("Bugle Alarm: no task ID provided in Intent");
            }
            akvw akvwVar = (akvw) akvkVar.a.get(stringExtra);
            if (akvwVar == null) {
                throw new IllegalStateException("Bugle Alarm: no ScheduledTask registered for the taskId ".concat(stringExtra));
            }
            Object a = akvwVar.a(intent, bugleAlarmReceiver, this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akvl akvlVar = new akvl(ffguVar, this.b, this.c);
        akvlVar.d = obj;
        return akvlVar;
    }
}
