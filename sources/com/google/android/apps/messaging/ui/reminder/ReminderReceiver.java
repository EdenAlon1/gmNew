package com.google.android.apps.messaging.ui.reminder;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.reminder.ReminderReceiver;
import defpackage.bdgq;
import defpackage.bdhb;
import defpackage.ciwj;
import defpackage.cixf;
import defpackage.cjcj;
import defpackage.csux;
import defpackage.ddbu;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReminderReceiver extends ddbu {
    private static final enru e = enru.c("com/google/android/apps/messaging/ui/reminder/ReminderReceiver");
    public Optional a;
    public elbx b;
    public ffbr c;
    public ffbr d;

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.b.b("ReminderReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.Reminder.Latency";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.apps.messaging.set_reminder".equals(action)) {
            final ConversationIdType b = bdgq.b(intent.getStringExtra("conversation_id"));
            final MessageIdType b2 = bdhb.b(intent.getStringExtra("message_id"));
            if (b2.c() || b.b()) {
                return;
            }
            ensk h = e.h();
            h.Y(ente.a, "BugleNotifications");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.o, b.toString());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/ui/reminder/ReminderReceiver", "processBroadcast", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ReminderReceiver.java")).q("Setting reminder, canceling IM notification");
            ((ciwj) this.c.b()).b(cixf.NT_INCOMING_MESSAGE, ((cjcj) this.d.b()).a(b));
            this.a.ifPresent(new Consumer() { // from class: ddjw
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ReminderReceiver.this.q("ReminderReceiver", ((cnla) obj).s(b2, b, 4));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if ("com.google.android.apps.messaging.trigger_reminder".equals(action)) {
            final String stringExtra = intent.getStringExtra("reminder_id");
            if (TextUtils.isEmpty(stringExtra)) {
                this.a.ifPresent(new Consumer() { // from class: ddjy
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ReminderReceiver.this.q("ReminderReceiver", ((cnla) obj).e());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            } else {
                this.a.ifPresent(new Consumer() { // from class: ddjx
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ReminderReceiver.this.q("ReminderReceiver", ((cnla) obj).f(stringExtra));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
        }
        if ("com.google.android.apps.messaging.dismiss_reminder_notifications".equals(action)) {
            final String[] stringArrayExtra = intent.getStringArrayExtra("reminder_ids");
            if (stringArrayExtra != null) {
                this.a.ifPresent(new Consumer() { // from class: ddjz
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ReminderReceiver.this.q("ReminderReceiver", ((cnla) obj).c(stringArrayExtra));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            return;
        }
        if ("com.google.android.apps.messaging.mark_as_done".equals(action)) {
            final String stringExtra2 = intent.getStringExtra("reminder_id");
            if (TextUtils.isEmpty(stringExtra2)) {
                return;
            }
            this.a.ifPresent(new Consumer() { // from class: ddka
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ReminderReceiver.this.q("ReminderReceiver", ((cnla) obj).r(stringExtra2, bdgq.a, 3));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if ("com.google.android.apps.messaging.snooze_reminder".equals(action)) {
            final String stringExtra3 = intent.getStringExtra("reminder_id");
            final ConversationIdType b3 = bdgq.b(intent.getStringExtra("conversation_id"));
            if (TextUtils.isEmpty(stringExtra3)) {
                return;
            }
            this.a.ifPresent(new Consumer() { // from class: ddkb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ReminderReceiver.this.q("ReminderReceiver", ((cnla) obj).t(b3, stringExtra3, 3));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if ("com.google.android.apps.messaging.view_reminder".equals(action)) {
            final ConversationIdType b4 = bdgq.b(intent.getStringExtra("conversation_id"));
            final String stringExtra4 = intent.getStringExtra("reminder_id");
            if (b4.b() || TextUtils.isEmpty(stringExtra4)) {
                return;
            }
            this.a.ifPresent(new Consumer() { // from class: ddkc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ReminderReceiver.this.q("ReminderReceiver", ((cnla) obj).i(new BugleConversationId(b4), stringExtra4));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }
}
