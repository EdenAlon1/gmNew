package defpackage;

import android.content.Intent;
import com.google.android.rcs.client.messaging.GetGroupNotificationsRequest;
import com.google.android.rcs.client.messaging.GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clfo implements clhc {
    public static final cskc a = cskc.g("BugleRcs", "GetGroupNotificationsMethod");
    public final avkh b;
    public final cliq c;
    public final errl d;
    public final clhd e;
    private final ctzw f;
    private final BiFunction g;
    private final clfb h;
    private final errl i;
    private final errl j;

    public clfo(avkh avkhVar, cliq cliqVar, ctzw ctzwVar, BiFunction biFunction, clfb clfbVar, clhd clhdVar, errl errlVar, errl errlVar2, errl errlVar3) {
        this.b = avkhVar;
        this.c = cliqVar;
        this.f = ctzwVar;
        this.g = biFunction;
        this.h = clfbVar;
        this.e = clhdVar;
        this.d = errlVar;
        this.i = errlVar2;
        this.j = errlVar3;
    }

    public static void c(String str, awud awudVar) {
        awuc awucVar = awuc.OK;
        awuc b = awuc.b(awudVar.c);
        if (b == null) {
            b = awuc.UNKNOWN_STATUS;
        }
        if (awucVar.equals(b)) {
            return;
        }
        csjb e = a.e();
        e.I("Processing incoming RCS group notification failed");
        e.g(str);
        awua b2 = awua.b(awudVar.d);
        if (b2 == null) {
            b2 = awua.UNKNOWN_CAUSE;
        }
        e.A("errorCode", b2);
        awua b3 = awua.b(awudVar.d);
        if (b3 == null) {
            b3 = awua.UNKNOWN_CAUSE;
        }
        e.A("errorCause", b3);
        e.r();
    }

    @Override // defpackage.clhc
    public final elfl a(Intent intent) {
        emxf.a("com.google.android.apps.messaging.shared.messaging.incoming_group_notification_action".equals(intent.getAction()));
        return this.h.a(this.f.a(this.g, RcsMessagingService.class).h(new emwl() { // from class: clfm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((RcsMessagingService) obj).getGroupNotifications(GetGroupNotificationsRequest.a);
            }
        }, this.j).i(new eroh() { // from class: clfn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cliq cliqVar;
                Object obj2;
                awvs awvsVar;
                Optional of;
                GetGroupNotificationsResponse getGroupNotificationsResponse = (GetGroupNotificationsResponse) obj;
                if (!MessagingResult.d.equals(getGroupNotificationsResponse.a())) {
                    csjb e = clfo.a.e();
                    e.I("Fetching incoming RCS group notifications failed");
                    e.y("errorCode", getGroupNotificationsResponse.a().b());
                    e.r();
                    return elfo.e(null);
                }
                clfo clfoVar = clfo.this;
                engw b = getGroupNotificationsResponse.b();
                clfoVar.e.b.e("Bugle.MessagingService.GetGroupNotifications.BatchSize.Count", clhd.a(b.size()));
                if (b.isEmpty()) {
                    csjb e2 = clfo.a.e();
                    e2.I("Fetching incoming RCS group notifications successful but no messages returned");
                    e2.r();
                    return elfo.e(null);
                }
                engr engrVar = new engr();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    GroupNotification groupNotification = (GroupNotification) b.get(i);
                    boolean z = true;
                    if (groupNotification.c().isPresent()) {
                        final String b2 = groupNotification.a().b();
                        try {
                            final cliq cliqVar2 = clfoVar.c;
                            emxf.b(groupNotification.c().isPresent(), "Unexpected missing groupInformation");
                            Object obj3 = groupNotification.c().get();
                            emxf.b(!((GroupInformation) obj3).d().isEmpty(), "Unexpected empty conversation URI ");
                            emxf.b(!((GroupInformation) obj3).e().isEmpty(), "Unexpected empty group conversation id");
                            awui a2 = ((avkc) cliqVar2.a.b()).a(((GroupInformation) obj3).d(), true);
                            final awvx awvxVar = (awvx) awvy.b.createBuilder();
                            String e3 = ((GroupInformation) obj3).e();
                            awvxVar.copyOnWrite();
                            awvy awvyVar = (awvy) awvxVar.instance;
                            awvyVar.c |= 1;
                            awvyVar.d = e3;
                            awvxVar.copyOnWrite();
                            awvy awvyVar2 = (awvy) awvxVar.instance;
                            a2.getClass();
                            awvyVar2.f = a2;
                            awvyVar2.c |= 4;
                            engr engrVar2 = new engr();
                            engw a3 = ((GroupInformation) obj3).a();
                            int size2 = a3.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                GroupMember groupMember = (GroupMember) a3.get(i2);
                                boolean z2 = z;
                                final awwn awwnVar = (awwn) awwq.a.createBuilder();
                                Object obj4 = obj3;
                                awui a4 = ((avkc) cliqVar2.a.b()).a(groupMember.b().a(), false);
                                awwnVar.copyOnWrite();
                                awwq awwqVar = (awwq) awwnVar.instance;
                                a4.getClass();
                                awwqVar.c = a4;
                                awwqVar.b |= 1;
                                eifw a5 = groupMember.a();
                                awwp awwpVar = (djag.d() && a5.equals(eifw.ABSENT)) ? awwp.DEPARTED : a5.equals(eifw.PENDING) ? awwp.PENDING : awwp.JOINED;
                                awwnVar.copyOnWrite();
                                awwq awwqVar2 = (awwq) awwnVar.instance;
                                awwqVar2.d = awwpVar.e;
                                awwqVar2.b |= 2;
                                groupMember.c().ifPresent(new Consumer() { // from class: clip
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj5) {
                                        awxe awxeVar = (awxe) awxf.a.createBuilder();
                                        awui a6 = ((avkc) cliq.this.a.b()).a(((RcsDestinationId) obj5).a(), false);
                                        awxeVar.copyOnWrite();
                                        awxf awxfVar = (awxf) awxeVar.instance;
                                        a6.getClass();
                                        awxfVar.c = a6;
                                        awxfVar.b |= 1;
                                        awwn awwnVar2 = awwnVar;
                                        awwnVar2.copyOnWrite();
                                        awwq awwqVar3 = (awwq) awwnVar2.instance;
                                        awxf awxfVar2 = (awxf) awxeVar.build();
                                        awwq awwqVar4 = awwq.a;
                                        awxfVar2.getClass();
                                        awwqVar3.e = awxfVar2;
                                        awwqVar3.b |= 4;
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                engrVar2.h((awwq) awwnVar.build());
                                i2++;
                                z = z2;
                                obj3 = obj4;
                            }
                            Object obj5 = obj3;
                            awvxVar.b(engrVar2.g());
                            enin eninVar = new enin();
                            Optional b3 = ((GroupInformation) obj5).b();
                            if (b3.isPresent()) {
                                if (((GroupRemoteCapabilities) b3.get()).c()) {
                                    eninVar.c(awvh.SUBJECT_UPDATE);
                                }
                                if (((GroupRemoteCapabilities) b3.get()).a().isPresent() && ((Boolean) ((GroupRemoteCapabilities) b3.get()).a().get()).booleanValue()) {
                                    eninVar.c(awvh.REMOVE_PARTICIPANT_BY_ADMIN);
                                } else if (((GroupRemoteCapabilities) b3.get()).b().isPresent() && ((Boolean) ((GroupRemoteCapabilities) b3.get()).b().get()).booleanValue()) {
                                    eninVar.c(awvh.REMOVE_PARTICIPANT_BY_ALL);
                                }
                            }
                            awvxVar.a(eninVar.g());
                            awui a6 = cliqVar2.a();
                            awvxVar.copyOnWrite();
                            awvy awvyVar3 = (awvy) awvxVar.instance;
                            a6.getClass();
                            awvyVar3.l = a6;
                            awvyVar3.c |= 64;
                            if (((GroupInformation) obj5).f().isEmpty() && ((GroupInformation) obj5).c().isEmpty()) {
                                of = Optional.empty();
                            } else {
                                awwx awwxVar = (awwx) awwy.a.createBuilder();
                                String f = ((GroupInformation) obj5).f();
                                awwxVar.copyOnWrite();
                                awwy awwyVar = (awwy) awwxVar.instance;
                                awwyVar.b |= 1;
                                awwyVar.c = f;
                                if (((GroupInformation) obj5).c().isPresent()) {
                                    Object obj6 = ((GroupInformation) obj5).c().get();
                                    if (((SubjectExtension) obj6).a().isPresent()) {
                                        final awxe awxeVar = (awxe) awxf.a.createBuilder();
                                        awui a7 = ((avkc) cliqVar2.a.b()).a(((RcsDestinationId) ((SubjectExtension) obj6).a().get()).a(), false);
                                        awxeVar.copyOnWrite();
                                        awxf awxfVar = (awxf) awxeVar.instance;
                                        a7.getClass();
                                        awxfVar.c = a7;
                                        awxfVar.b |= 1;
                                        ((SubjectExtension) obj6).b().ifPresent(new Consumer() { // from class: clio
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void o(Object obj7) {
                                                eyja b4 = eykj.b((Instant) obj7);
                                                awxe awxeVar2 = awxe.this;
                                                awxeVar2.copyOnWrite();
                                                awxf awxfVar2 = (awxf) awxeVar2.instance;
                                                awxf awxfVar3 = awxf.a;
                                                b4.getClass();
                                                awxfVar2.d = b4;
                                                awxfVar2.b |= 2;
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                        awxf awxfVar2 = (awxf) awxeVar.build();
                                        awwxVar.copyOnWrite();
                                        awwy awwyVar2 = (awwy) awwxVar.instance;
                                        awxfVar2.getClass();
                                        awwyVar2.d = awxfVar2;
                                        awwyVar2.b |= 2;
                                    }
                                }
                                of = Optional.of((awwy) awwxVar.build());
                            }
                            of.ifPresent(new Consumer() { // from class: clin
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj7) {
                                    awvx awvxVar2 = awvx.this;
                                    awwy awwyVar3 = (awwy) obj7;
                                    awvxVar2.copyOnWrite();
                                    awvy awvyVar4 = (awvy) awvxVar2.instance;
                                    eygj eygjVar = awvy.a;
                                    awwyVar3.getClass();
                                    awvyVar4.i = awwyVar3;
                                    awvyVar4.c |= 8;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            engrVar.h(clfoVar.b.d((awvy) awvxVar.build()).h(new emwl() { // from class: clfk
                                @Override // defpackage.emwl
                                public final Object apply(Object obj7) {
                                    clfo.c(b2, (awud) obj7);
                                    return null;
                                }
                            }, clfoVar.d));
                        } catch (IllegalArgumentException e4) {
                            csjb b4 = clfo.a.b();
                            b4.I("Ignoring invalid incoming RCS group notification with group information");
                            b4.g(b2);
                            b4.s(e4);
                        }
                    } else if (groupNotification.b().isPresent() && djag.n()) {
                        final String b5 = groupNotification.a().b();
                        try {
                            cliqVar = clfoVar.c;
                            emxf.b(groupNotification.b().isPresent(), "Unexpected missing groupEvent");
                            obj2 = groupNotification.b().get();
                            emxf.b(!((GroupEvent) obj2).a().isEmpty(), "Unexpected empty changedMember");
                            awvsVar = (awvs) awvt.c.createBuilder();
                            String b6 = groupNotification.a().b();
                            awvsVar.copyOnWrite();
                            awvt awvtVar = (awvt) awvsVar.instance;
                            awvtVar.d |= 1;
                            awvtVar.e = b6;
                        } catch (IllegalArgumentException e5) {
                            e = e5;
                        }
                        try {
                            awui a8 = ((avkc) cliqVar.a.b()).a(((GroupMember) ((GroupEvent) obj2).a().get(0)).b().a(), false);
                            if (((GroupMember) ((GroupEvent) obj2).a().get(0)).a() == eifw.ABSENT) {
                                awvsVar.b(a8);
                            } else if (((GroupMember) ((GroupEvent) obj2).a().get(0)).a() == eifw.PRESENT) {
                                awvsVar.a(a8);
                            }
                            awui a9 = cliqVar.a();
                            awvsVar.copyOnWrite();
                            awvt awvtVar2 = (awvt) awvsVar.instance;
                            a9.getClass();
                            awvtVar2.r = a9;
                            awvtVar2.d |= 512;
                            if (((GroupMember) ((GroupEvent) obj2).a().get(0)).c().isPresent()) {
                                awxe awxeVar2 = (awxe) awxf.a.createBuilder();
                                awui a10 = ((avkc) cliqVar.a.b()).a(((RcsDestinationId) ((GroupMember) ((GroupEvent) obj2).a().get(0)).c().get()).a(), false);
                                awxeVar2.copyOnWrite();
                                awxf awxfVar3 = (awxf) awxeVar2.instance;
                                a10.getClass();
                                awxfVar3.c = a10;
                                awxfVar3.b |= 1;
                                awxf awxfVar4 = (awxf) awxeVar2.build();
                                awvsVar.copyOnWrite();
                                awvt awvtVar3 = (awvt) awvsVar.instance;
                                awxfVar4.getClass();
                                awvtVar3.p = awxfVar4;
                                awvtVar3.d |= 128;
                            }
                            engrVar.h(clfoVar.b.c((awvt) awvsVar.build()).h(new emwl() { // from class: clfl
                                @Override // defpackage.emwl
                                public final Object apply(Object obj7) {
                                    clfo.c(b5, (awud) obj7);
                                    return null;
                                }
                            }, clfoVar.d));
                        } catch (IllegalArgumentException e6) {
                            e = e6;
                            csjb b7 = clfo.a.b();
                            b7.I("Ignoring invalid incoming RCS group notification with group event");
                            b7.g(b5);
                            b7.s(e);
                        }
                    }
                }
                return elfo.j(engrVar.g()).b(new erog() { // from class: clfj
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        csjb c = clfo.a.c();
                        c.I("Finished processing incoming RCS messages");
                        c.r();
                        return elfo.e(null);
                    }
                }, clfoVar.d);
            }
        }, this.i), "GetGroupNotifications");
    }

    @Override // defpackage.clhc
    public final String b() {
        return "Bugle.MessagingService.Intent.IncomingGroupNotification.Latency";
    }
}
