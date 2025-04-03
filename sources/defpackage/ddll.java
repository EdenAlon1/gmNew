package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.ddll;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddll implements ddle {
    public static final cskc a = cskc.g("Bugle", "ReminderDateTimePickerMixinImpl");
    public final ejlq b;
    public final fazb c;
    public final ejlr d;
    public final ejlr e;
    public final ejlr f;
    private final Context g;
    private final cqoh h;
    private final ffbr i;
    private final ea j;
    private final ffbr k;
    private boolean l = false;

    /* compiled from: PG */
    final class a implements ellf {
        public final ddlo a;

        public a(ddlo ddloVar) {
            this.a = ddloVar;
        }
    }

    /* compiled from: PG */
    final class b implements ellf {
        public final ddlo a;

        public b(ddlo ddloVar) {
            this.a = ddloVar;
        }
    }

    /* compiled from: PG */
    final class c implements ellf {
    }

    /* compiled from: PG */
    final class d implements ellf {
    }

    /* compiled from: PG */
    final class e implements ellf {
    }

    /* compiled from: PG */
    final class f implements ellf {
    }

    public ddll(Context context, cqoh cqohVar, ffbr ffbrVar, ejlq ejlqVar, final ea eaVar, fazb fazbVar, ffbr ffbrVar2, final ffbr ffbrVar3) {
        this.g = context;
        this.h = cqohVar;
        this.i = ffbrVar;
        this.j = eaVar;
        this.b = ejlqVar;
        this.c = fazbVar;
        this.k = ffbrVar2;
        ejlr<eyjv<ddlo>, Boolean> ejlrVar = new ejlr<eyjv<ddlo>, Boolean>() { // from class: ddll.1
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                eyjv eyjvVar = (eyjv) obj;
                Boolean bool = (Boolean) obj2;
                if (bool == null || !bool.booleanValue()) {
                    ddll.a.n("The reminder was not set successfully.");
                } else {
                    ellj.f(((ddlv) ffbr.this.b()).a((ddlo) eyjvVar.a(ddlo.a, eyfc.a())), eaVar);
                }
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                ddll.a.o("Failed to set reminder.", th);
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.d = ejlrVar;
        ejlr<eyjv<ddlo>, Boolean> ejlrVar2 = new ejlr<eyjv<ddlo>, Boolean>() { // from class: ddll.2
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                eyjv eyjvVar = (eyjv) obj;
                Boolean bool = (Boolean) obj2;
                if (bool == null || !bool.booleanValue()) {
                    ddll.a.n("The reminder was not updated successfully.");
                    return;
                }
                final ddlo ddloVar = (ddlo) eyjvVar.a(ddlo.a, eyfc.a());
                final ddlv ddlvVar = (ddlv) ffbr.this.b();
                ellj.f(new cvms(ddlvVar.c.b(ddloVar.c, ddloVar.f), ddlvVar.b.getResources().getString(R.string.reminder_snackbar_action_text), new Runnable() { // from class: ddlq
                    @Override // java.lang.Runnable
                    public final void run() {
                        ddlo ddloVar2 = ddloVar;
                        MessageIdType b2 = bdhb.b(ddloVar2.d);
                        ConversationIdType b3 = bdgq.b(ddloVar2.e);
                        long j = ddloVar2.g;
                        ddlv ddlvVar2 = ddlv.this;
                        ddlvVar2.d.u(b2, b3, j, 6).k(axou.a(new ddlu()), ddlvVar2.e);
                    }
                }), eaVar);
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                ddll.a.o("Failed to update reminder.", th);
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.e = ejlrVar2;
        ejlr<eyjv<ddlo>, Boolean> ejlrVar3 = new ejlr<eyjv<ddlo>, Boolean>() { // from class: ddll.3
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                eyjv eyjvVar = (eyjv) obj;
                if (!((Boolean) obj2).booleanValue()) {
                    ddll.a.n("Failed to remove reminder: No reminder is on message");
                    return;
                }
                final ddlo ddloVar = (ddlo) eyjvVar.a(ddlo.a, eyfc.a());
                final ddlv ddlvVar = (ddlv) ffbr.this.b();
                ellj.f(new cvms(ddlvVar.b.getResources().getString(R.string.reminder_snackbar_delete_reminder_title_text), ddlvVar.b.getResources().getString(R.string.reminder_snackbar_action_text), new Runnable() { // from class: ddlp
                    @Override // java.lang.Runnable
                    public final void run() {
                        ddlo ddloVar2 = ddloVar;
                        MessageIdType b2 = bdhb.b(ddloVar2.d);
                        ConversationIdType b3 = bdgq.b(ddloVar2.e);
                        long j = ddloVar2.g;
                        ddlv ddlvVar2 = ddlv.this;
                        elfl.g(ddlvVar2.d.v(b2, b3, j, 6)).k(axou.a(new ddls()), ddlvVar2.e);
                    }
                }), eaVar);
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                ddll.a.o("Failed to remove reminder", th);
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.f = ejlrVar3;
        ejlqVar.k(ejlrVar);
        ejlqVar.k(ejlrVar2);
        ejlqVar.k(ejlrVar3);
    }

    @Override // defpackage.ddle
    public final void a(ddlo ddloVar) {
        if (!this.l) {
            ellj.c(this.j, b.class, new ellh() { // from class: ddlf
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    ddlo ddloVar2 = ((ddll.b) ellfVar).a;
                    ejlm a2 = ejlm.a(ddloVar2);
                    boolean z = ddloVar2.f;
                    ddll ddllVar = ddll.this;
                    if (z) {
                        ejlq ejlqVar = ddllVar.b;
                        cnla cnlaVar = (cnla) ddllVar.c.b();
                        MessageIdType b2 = bdhb.b(ddloVar2.d);
                        ConversationIdType b3 = bdgq.b(ddloVar2.e);
                        long j = ddloVar2.c;
                        int a3 = ephm.a(ddloVar2.h);
                        ejlqVar.i(new ejlp(cnlaVar.u(b2, b3, j, a3 == 0 ? 1 : a3)), a2, ddllVar.e);
                    } else {
                        ejlq ejlqVar2 = ddllVar.b;
                        cnla cnlaVar2 = (cnla) ddllVar.c.b();
                        MessageIdType b4 = bdhb.b(ddloVar2.d);
                        ConversationIdType b5 = bdgq.b(ddloVar2.e);
                        long j2 = ddloVar2.c;
                        int a4 = ephm.a(ddloVar2.h);
                        ejlqVar2.i(new ejlp(cnlaVar2.v(b4, b5, j2, a4 == 0 ? 1 : a4)), a2, ddllVar.d);
                    }
                    return elli.a;
                }
            });
            ellj.c(this.j, a.class, new ellh() { // from class: ddlg
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    ddlo ddloVar2 = ((ddll.a) ellfVar).a;
                    ddll ddllVar = ddll.this;
                    ddllVar.b.i(new ejlp(((cnla) ddllVar.c.b()).h(bdhb.b(ddloVar2.d), bdgq.b(ddloVar2.e))), ejlm.a(ddloVar2), ddllVar.f);
                    return elli.a;
                }
            });
            ellj.c(this.j, e.class, new ellh() { // from class: ddlh
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    ((cnla) ddll.this.c.b()).x(2);
                    return elli.a;
                }
            });
            ellj.c(this.j, d.class, new ellh() { // from class: ddli
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    ((cnla) ddll.this.c.b()).x(3);
                    return elli.a;
                }
            });
            ellj.c(this.j, f.class, new ellh() { // from class: ddlj
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    ((cnla) ddll.this.c.b()).x(4);
                    return elli.a;
                }
            });
            ellj.c(this.j, c.class, new ellh() { // from class: ddlk
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    ((cnla) ddll.this.c.b()).x(5);
                    return elli.a;
                }
            });
            this.l = true;
        }
        boolean z = ddloVar.f;
        acbh acbhVar = (acbh) acbi.a.createBuilder();
        ZonedDateTime withSecond = this.h.f().atZone(ZoneId.systemDefault()).withSecond(0);
        ZonedDateTime plusHours = withSecond.plusHours(1L);
        acbj acbjVar = (acbj) acbk.a.createBuilder();
        int i = acbn.a.h;
        acbjVar.copyOnWrite();
        ((acbk) acbjVar.instance).c = i;
        int i2 = acbn.a.g;
        acbjVar.copyOnWrite();
        ((acbk) acbjVar.instance).b = i2;
        long epochMilli = plusHours.toInstant().toEpochMilli();
        acbjVar.copyOnWrite();
        ((acbk) acbjVar.instance).d = epochMilli;
        acbk acbkVar = (acbk) acbjVar.build();
        ZonedDateTime withMinute = withSecond.withMinute(0);
        ZonedDateTime withHour = withMinute.withHour(12);
        acbj acbjVar2 = (acbj) acbk.a.createBuilder();
        int i3 = acbn.b.h;
        acbjVar2.copyOnWrite();
        ((acbk) acbjVar2.instance).c = i3;
        int i4 = acbn.b.g;
        acbjVar2.copyOnWrite();
        ((acbk) acbjVar2.instance).b = i4;
        long epochMilli2 = withHour.toInstant().toEpochMilli();
        acbjVar2.copyOnWrite();
        ((acbk) acbjVar2.instance).d = epochMilli2;
        acbk acbkVar2 = (acbk) acbjVar2.build();
        ZonedDateTime withHour2 = withMinute.withHour(20);
        acbj acbjVar3 = (acbj) acbk.a.createBuilder();
        int i5 = acbn.c.h;
        acbjVar3.copyOnWrite();
        ((acbk) acbjVar3.instance).c = i5;
        int i6 = acbn.c.g;
        acbjVar3.copyOnWrite();
        ((acbk) acbjVar3.instance).b = i6;
        long epochMilli3 = withHour2.toInstant().toEpochMilli();
        acbjVar3.copyOnWrite();
        ((acbk) acbjVar3.instance).d = epochMilli3;
        acbk acbkVar3 = (acbk) acbjVar3.build();
        ZonedDateTime plusDays = withMinute.plusDays(1L);
        ZonedDateTime withHour3 = plusDays.withHour(8);
        acbj acbjVar4 = (acbj) acbk.a.createBuilder();
        int i7 = acbn.d.h;
        acbjVar4.copyOnWrite();
        ((acbk) acbjVar4.instance).c = i7;
        int i8 = acbn.d.g;
        acbjVar4.copyOnWrite();
        ((acbk) acbjVar4.instance).b = i8;
        long epochMilli4 = withHour3.toInstant().toEpochMilli();
        acbjVar4.copyOnWrite();
        ((acbk) acbjVar4.instance).d = epochMilli4;
        acbk acbkVar4 = (acbk) acbjVar4.build();
        ZonedDateTime withHour4 = plusDays.withHour(12);
        acbj acbjVar5 = (acbj) acbk.a.createBuilder();
        int i9 = acbn.e.h;
        acbjVar5.copyOnWrite();
        ((acbk) acbjVar5.instance).c = i9;
        int i10 = acbn.e.g;
        acbjVar5.copyOnWrite();
        ((acbk) acbjVar5.instance).b = i10;
        long epochMilli5 = withHour4.toInstant().toEpochMilli();
        acbjVar5.copyOnWrite();
        ((acbk) acbjVar5.instance).d = epochMilli5;
        acbk acbkVar5 = (acbk) acbjVar5.build();
        ZonedDateTime withHour5 = plusDays.withHour(20);
        acbj acbjVar6 = (acbj) acbk.a.createBuilder();
        int i11 = acbn.f.h;
        acbjVar6.copyOnWrite();
        ((acbk) acbjVar6.instance).c = i11;
        int i12 = acbn.f.g;
        acbjVar6.copyOnWrite();
        ((acbk) acbjVar6.instance).b = i12;
        long epochMilli6 = withHour5.toInstant().toEpochMilli();
        acbjVar6.copyOnWrite();
        ((acbk) acbjVar6.instance).d = epochMilli6;
        acbk acbkVar6 = (acbk) acbjVar6.build();
        int hour = withMinute.getHour();
        acbhVar.a((hour < 0 || hour >= 8) ? (hour < 8 || hour >= 18) ? engw.u(acbkVar, acbkVar4, acbkVar5, acbkVar6) : engw.u(acbkVar, acbkVar3, acbkVar4, acbkVar5) : engw.u(acbkVar, acbkVar2, acbkVar3, acbkVar4));
        long j = ddloVar.g;
        acbhVar.copyOnWrite();
        ((acbi) acbhVar.instance).f = j;
        String string = this.g.getResources().getString(z ? R.string.reminder_datetime_picker_dialog_menu_title_update : R.string.reminder_datetime_picker_dialog_menu_title_add);
        acbhVar.copyOnWrite();
        acbi acbiVar = (acbi) acbhVar.instance;
        string.getClass();
        acbiVar.c = string;
        if (z) {
            String string2 = this.g.getResources().getString(R.string.reminder_datetime_picker_dialog_delete_button);
            acbhVar.copyOnWrite();
            acbi acbiVar2 = (acbi) acbhVar.instance;
            string2.getClass();
            acbiVar2.e = string2;
            ddlw ddlwVar = (ddlw) this.k.b();
            String string3 = ddlwVar.a.getResources().getString(R.string.reminder_datetime_picker_dialog_sub_title, ddlwVar.a(ddloVar.g));
            acbhVar.copyOnWrite();
            acbi acbiVar3 = (acbi) acbhVar.instance;
            string3.getClass();
            acbiVar3.d = string3;
        }
        ((acdr) this.i.b()).b((acbi) acbhVar.build(), new ddlm(ddloVar));
    }
}
