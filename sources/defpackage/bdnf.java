package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdnf {
    private static final entd a = entd.c("Bugle");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public bdnf(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final engw a(final MessageIdType messageIdType) {
        engw g;
        String[] strArr = buik.a;
        buih buihVar = new buih(buik.a);
        buihVar.z("getMessageSendReceiveAttemptForMessage");
        buihVar.d(new Function() { // from class: bdng
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buij buijVar = (buij) obj;
                buijVar.b(MessageIdType.this);
                return buijVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buihVar.c(new buie(buik.b.c));
        engw y = buihVar.b().y();
        if (y.isEmpty()) {
            g = enou.a;
        } else {
            engr engrVar = new engr();
            int i = ((enou) y).c;
            for (int i2 = 0; i2 < i; i2++) {
                buge bugeVar = (buge) y.get(i2);
                bugeVar.az(4, "message_protocol");
                byzj byzjVar = bugeVar.e;
                bugeVar.az(5, "current_sim_network_country");
                String str = bugeVar.f;
                bugeVar.az(6, "current_sim_country");
                String str2 = bugeVar.g;
                bugeVar.az(8, "settings_country");
                String str3 = bugeVar.i;
                bugeVar.az(9, "default_sms_sim_country");
                String str4 = bugeVar.j;
                bugeVar.az(10, "locale_country");
                String str5 = bugeVar.k;
                bugeVar.az(11, "default_sms_sim_network_country");
                engrVar.h(new bdjh(byzjVar, str, str2, str3, str4, str5, bugeVar.l));
            }
            g = engrVar.g();
        }
        if (g.isEmpty()) {
            return enou.a;
        }
        engr engrVar2 = new engr();
        int i3 = ((enou) g).c;
        for (int i4 = 0; i4 < i3; i4++) {
            bdnk bdnkVar = (bdnk) g.get(i4);
            enhd enhdVar = new enhd();
            enhdVar.k("CURRENT_SIM_NETWORK_COUNTRY", emxe.b(bdnkVar.c()));
            enhdVar.k("CURRENT_SIM_COUNTRY", emxe.b(bdnkVar.b()));
            enhdVar.k("SETTINGS_COUNTRY", emxe.b(bdnkVar.g()));
            enhdVar.k("DEFAULT_SMS_SIM_COUNTRY", emxe.b(bdnkVar.d()));
            enhdVar.k("LOCALE_COUNTRY", emxe.b(bdnkVar.f()));
            enhdVar.k("DEFAULT_SMS_SIM_NETWORK_COUNTRY", emxe.b(bdnkVar.e()));
            engrVar2.h(new bdje(bdnkVar.a(), enhdVar.c()));
        }
        return engrVar2.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map b(final MessageIdType messageIdType) {
        Object apply;
        engw g;
        HashMap hashMap = new HashMap();
        String[] strArr = buik.a;
        buih buihVar = new buih(buik.a);
        buihVar.z("getAllDestinationsForMessage-messageSendReceiveAttempt");
        buihVar.d(new Function() { // from class: bdnh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buij buijVar = (buij) obj;
                buijVar.b(MessageIdType.this);
                return buijVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buihVar.c(new buie(buik.b.c));
        buihVar.x(1);
        buhn buhnVar = (buhn) buihVar.b().p(buik.b.a);
        try {
            engw c = buhnVar.c();
            buhnVar.close();
            if (c.isEmpty()) {
                g = enou.a;
            } else {
                engr engrVar = new engr();
                final UUID uuid = (UUID) c.get(0);
                String[] strArr2 = btxi.a;
                btxf btxfVar = new btxf(btxi.a);
                btxfVar.z("getAllDestinationsForMessage-messageDestinations");
                apply = new Function() { // from class: bdni
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        btxh btxhVar = (btxh) obj;
                        btxhVar.aq(new dtrt("message_destinations.message_send_receive_attempt_id", 1, bdhh.a(uuid)));
                        return btxhVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new btxh());
                btxfVar.k(new btxg((btxh) apply));
                engw y = btxfVar.b().y();
                int i = ((enou) y).c;
                for (int i2 = 0; i2 < i; i2++) {
                    btwf btwfVar = (btwf) y.get(i2);
                    btwfVar.az(2, "message_destination_type");
                    byzb byzbVar = btwfVar.c;
                    btwfVar.az(3, "message_destination_raw");
                    engrVar.h(new bdjg(byzbVar, btwfVar.d));
                }
                g = engrVar.g();
            }
            for (int i3 = 0; i3 < ((enou) g).c; i3++) {
                bdnj bdnjVar = (bdnj) g.get(i3);
                byzb a2 = bdnjVar.a();
                Map.EL.putIfAbsent(hashMap, a2, new ArrayList());
                List list = (List) hashMap.get(a2);
                list.add(bdnjVar.b());
                hashMap.put(a2, list);
            }
            return hashMap;
        } catch (Throwable th) {
            try {
                buhnVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(final UUID uuid, final MessageIdType messageIdType, final long j, final engw engwVar, final byzj byzjVar, int i) {
        if (messageIdType.a == -1) {
            ensz enszVar = (ensz) a.j();
            enszVar.Y(csux.a, messageIdType.toString());
            enszVar.aa(ensy.FULL);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageRecipientAuditor", "saveMessageRecipients", 164, "MessageRecipientAuditor.java")).q("Could not save receiving attempt - messageId was invalid");
            return;
        }
        final String s = ((ctwb) this.d.b()).g().s();
        ffbr ffbrVar = ((ctwb) this.d.b()).g().b;
        ffbrVar.getClass();
        final Optional ofNullable = Optional.ofNullable(emxe.a(((ctuy) ffbrVar.b()).b()));
        final ctwi j2 = ((ctwb) this.d.b()).j();
        final ctwi h = ((ctwb) this.d.b()).h(i);
        ((dtuu) this.b.b()).d("ReceiveSmsMessageHelper#storeMessageSendingDetailsInBugle", new Runnable() { // from class: bdnc
            @Override // java.lang.Runnable
            public final void run() {
                bdnf.this.d(uuid, messageIdType, j, byzjVar, h, ofNullable, j2, s, engwVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void d(UUID uuid, MessageIdType messageIdType, long j, byzj byzjVar, ctwi ctwiVar, Optional optional, ctwi ctwiVar2, String str, engw engwVar) {
        try {
            String p = ctwiVar.p();
            String s = ctwiVar.s();
            String str2 = (String) optional.orElse("");
            String s2 = ctwiVar2.s();
            String b = emxe.b(str);
            String p2 = ctwiVar2.p();
            String[] strArr = buik.a;
            bugj bugjVar = new bugj();
            bugjVar.h(uuid);
            bugjVar.j(messageIdType);
            bugjVar.m(j);
            bugjVar.k(1L);
            bugjVar.n(byzjVar);
            bugjVar.d(p);
            bugjVar.c(s);
            bugjVar.b("");
            bugjVar.l(str2);
            bugjVar.f(s2);
            bugjVar.i(b);
            bugjVar.g(p2);
            bugjVar.e("");
            buge a2 = bugjVar.a(new Supplier() { // from class: bugh
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new bugf();
                }
            });
            final dtve a3 = buik.a();
            dtub.b(buik.a(), "message_send_receive_attempt", a2, new Function() { // from class: bugb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dtve.this.S("message_send_receive_attempt", (ContentValues) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bugc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            enqv it = engwVar.iterator();
            while (it.hasNext()) {
                bdne bdneVar = (bdne) it.next();
                byzb a4 = bdneVar.a();
                String b2 = bdneVar.b();
                String[] strArr2 = btxi.a;
                btwk btwkVar = new btwk();
                btwkVar.d(uuid);
                btwkVar.c(a4);
                btwkVar.b(b2);
                final btwf a5 = btwkVar.a(new Supplier() { // from class: btwi
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new btwg();
                    }
                });
                final dtve a6 = btxi.a();
                dtub.b(btxi.a(), "message_destinations", a5, new Function() { // from class: btwb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dtve.this.S("message_destinations", (ContentValues) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: btwc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        Long l = (Long) obj;
                        if (l.longValue() >= 0) {
                            btwf btwfVar = btwf.this;
                            btwfVar.a = new btwd(l).a.longValue();
                            btwfVar.fY(0);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                a5.az(0, "_id");
                long j2 = a5.a;
            }
        } catch (SQLiteConstraintException unused) {
            ensz enszVar = (ensz) a.j();
            enszVar.Y(csux.a, messageIdType.toString());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageRecipientAuditor", "saveMessageRecipients", 211, "MessageRecipientAuditor.java")).q("Could not save receiving attempt - SQLiteConstraintException was thrown");
        }
    }
}
