package defpackage;

import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpzs {
    public static final dtzj a(dtry dtryVar, boolean z) {
        return new dtzq("$V $R", new Object[]{dtryVar, true != z ? "DESC" : "ASC"});
    }

    public static final dtzj b(dtry dtryVar, final dtry dtryVar2, ctsx ctsxVar, cqoh cqohVar) {
        Object apply;
        cqohVar.getClass();
        if (!ctjd.f()) {
            return new dtzq("$V", new Object[]{0});
        }
        Long l = (Long) ctjd.Z.e();
        Long l2 = (Long) ctjd.aa.e();
        long epochMilli = cqohVar.f().toEpochMilli();
        btvs a = btvy.a();
        a.z("getIsNudgeableExpression");
        apply = new Function() { // from class: bpzq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((btvf) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(btvy.c);
        btvg[] btvgVarArr = {(btvg) apply};
        int intValue = btvy.c().intValue();
        if (((Integer) btvy.b.getOrDefault(btvgVarArr[0].toString(), -1)).intValue() > intValue) {
            dtub.w("columnReference.toString()", intValue);
        }
        a.m(btvgVarArr);
        a.c(new Function() { // from class: bpzr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btvx btvxVar = (btvx) obj;
                btvxVar.aq(new dtru("message_classifications_table.message_id", 1, dtry.this));
                btvxVar.b(fbrc.NUDGE_CLASSIFICATION);
                return btvxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btvr b = a.b();
        dtzq dtzqVar = new dtzq(true != ctsxVar.c ? "0" : "1", new Object[0]);
        Long valueOf = Long.valueOf(epochMilli);
        return new dtzq("$V AND $V AND EXISTS $V AND $V", new Object[]{new dtzq("$V >= ($V + $V)", new Object[]{valueOf, dtryVar, l}), new dtzq("$V <= ($V + $V + $V)", new Object[]{valueOf, dtryVar, l, l2}), b, dtzqVar});
    }

    public static final dtzj c(final dtry dtryVar, cqoh cqohVar, ctsx ctsxVar) {
        Object apply;
        cqohVar.getClass();
        if (!stl.a() || (((Boolean) ((cfup) stl.c.get()).e()).booleanValue() && !ctsxVar.e)) {
            return new dtzq("$V", new Object[]{0});
        }
        final String monthDay = sth.c(cqohVar).toString();
        monthDay.getClass();
        brbn a = brbs.a();
        a.z("getBirthdayExpression");
        apply = new Function() { // from class: bpzo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((brax) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(brbs.c);
        bray[] brayVarArr = {(bray) apply};
        int intValue = brbs.c().intValue();
        if (((Integer) brbs.b.getOrDefault(brayVarArr[0].toString(), -1)).intValue() > intValue) {
            dtub.w("columnReference.toString()", intValue);
        }
        a.m(brayVarArr);
        a.c(new Function() { // from class: bpzp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brbr brbrVar = (brbr) obj;
                brbrVar.aq(new dtru("conversation_classifications_table.conversation_id", 1, dtry.this));
                brbrVar.c(axcl.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
                brbrVar.b(axcj.CONVERSATION_CLASSIFICATION_STATE_DISMISSED);
                brbrVar.e(monthDay);
                return brbrVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return new dtzq("EXISTS $V", new Object[]{a.b()});
    }

    public static final dtzj d(final dtry dtryVar, final dtry dtryVar2, final cqoh cqohVar) {
        cqohVar.getClass();
        if (!ddjr.c()) {
            return new dtzq("$V", new Object[]{0});
        }
        bxco c = bxct.c();
        c.z("getReminderNudgeExpression");
        c.c(new Function() { // from class: bpzl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bxby) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c.e(new Function() { // from class: bpzm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxcs bxcsVar = (bxcs) obj;
                bxcsVar.b(dtry.this);
                bxcsVar.e(cqohVar.f().toEpochMilli());
                bxcsVar.aq(new dtru("reminders.trigger_time", 7, dtryVar2));
                return bxcsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return new dtzq("EXISTS $V", new Object[]{c.b()});
    }

    public static final dtzj e(final dtry dtryVar) {
        coin b = ScheduledSendTable.b();
        b.z("getScheduledMessageExpression");
        b.c(ScheduledSendTable.c.a);
        b.e(new Function() { // from class: bpzn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                coit coitVar = (coit) obj;
                coitVar.b(dtry.this);
                return coitVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return new dtzq("EXISTS $V", new Object[]{b.b()});
    }

    public static final dtzj f(dtry dtryVar, dtry dtryVar2, final dtry dtryVar3, ctsx ctsxVar, final cqoh cqohVar) {
        char c;
        char c2;
        char c3;
        cqohVar.getClass();
        dtzq dtzqVar = new dtzq("WHEN 1 THEN '$R'", new Object[]{"NUDGE"});
        if (ctjd.e()) {
            dtzqVar = new dtzq("WHEN $V THEN '$R'", new Object[]{e(dtryVar3), "NONE"});
        }
        dtzq dtzqVar2 = new dtzq("", new Object[0]);
        if (ctjd.f()) {
            dtzqVar2 = new dtzq("WHEN $V THEN '$R'", new Object[]{b(dtryVar, dtryVar2, ctsxVar, cqohVar), "NUDGE"});
        }
        dtzq dtzqVar3 = new dtzq("", new Object[0]);
        if (stl.a()) {
            dtzqVar3 = new dtzq("WHEN $R AND $V THEN '$R'", new Object[]{(!((Boolean) ((cfup) stl.c.get()).e()).booleanValue() || ctsxVar.e) ? "1" : "0", c(dtryVar3, cqohVar, ctsxVar), "BIRTHDAY"});
        }
        dtzq dtzqVar4 = new dtzq("", new Object[0]);
        if (ddjr.c()) {
            dtzqVar4 = new dtzq("WHEN $V THEN '$R'", new Object[]{d(dtryVar3, dtryVar, cqohVar), "REMINDER"});
        }
        dtzq dtzqVar5 = new dtzq("CASE $V $V $V $V ELSE '$R' END", new Object[]{dtzqVar, dtzqVar4, dtzqVar3, dtzqVar2, "NONE"});
        Long valueOf = Long.valueOf(sth.a(cqohVar));
        dtzq dtzqVar6 = new dtzq("CASE WHEN $V > $V THEN $V ELSE $V END", new Object[]{valueOf, dtryVar, valueOf, dtryVar});
        dtzq dtzqVar7 = new dtzq("($V + $V)", new Object[]{dtryVar, (Long) ctjd.Z.e()});
        if (((Boolean) ((cfup) aiql.a.get()).e()).booleanValue()) {
            Long l = (Long) aiql.b.e();
            c = 5;
            c2 = 4;
            c3 = 0;
            dtzqVar7 = new dtzq("($V + $V)", new Object[]{dtzqVar7, new dtzq("(($V / $V) * $V)", new Object[]{new dtzq("($V - $V)", new Object[]{Long.valueOf(cqohVar.f().toEpochMilli()), dtzqVar7}), l, l})});
        } else {
            c = 5;
            c2 = 4;
            c3 = 0;
        }
        bxco c4 = bxct.c();
        c4.z("getLatestReminderTimestampSql");
        c4.c(new Function() { // from class: ddkl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bxby) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c4.e(new Function() { // from class: ddkm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxcs bxcsVar = (bxcs) obj;
                bxcsVar.b(dtry.this);
                bxcsVar.e(cqohVar.f().toEpochMilli());
                return bxcsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bxcl[] bxclVarArr = new bxcl[1];
        bxclVarArr[c3] = new bxcl(bxct.c.d);
        c4.C((String) DesugarArrays.stream(bxclVarArr).map(new Function() { // from class: bxcn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bxcl) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        c4.x(1);
        bxcm b = c4.b();
        Object[] objArr = new Object[8];
        objArr[c3] = dtzqVar5;
        objArr[1] = "REMINDER";
        objArr[2] = b;
        objArr[3] = "BIRTHDAY";
        objArr[c2] = dtzqVar6;
        objArr[c] = "NUDGE";
        objArr[6] = dtzqVar7;
        objArr[7] = dtryVar;
        return new dtzq("CASE $V WHEN '$R' THEN $V WHEN '$R' THEN $V WHEN '$R' THEN $V ELSE $V END", objArr);
    }
}
