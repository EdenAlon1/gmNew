package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcyb {
    public static final bskq[] a;
    public static final buxs b;

    static {
        bskp bskpVar = bsom.c;
        a = new bskq[]{bsom.c.M, bskpVar.O, bskpVar.aa, bskpVar.ab};
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.K(3);
        buxzVar.b(new Function() { // from class: bcxs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar2 = (buxz) obj;
                bskq[] bskqVarArr = bcyb.a;
                buxzVar2.I(byzg.UNKNOWN);
                buxzVar2.E(1);
                return buxzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bcxt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar2 = (buxz) obj;
                bskq[] bskqVarArr = bcyb.a;
                buxzVar2.J(byzg.UNKNOWN);
                buxzVar2.E(2);
                return buxzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bcxu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar2 = (buxz) obj;
                bskq[] bskqVarArr = bcyb.a;
                buxzVar2.I(byzg.NOT_SENT);
                return buxzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bcxv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar2 = (buxz) obj;
                bskq[] bskqVarArr = bcyb.a;
                buxzVar2.J(byzg.NOT_SENT);
                return buxzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int intValue = MessagesTable.g().intValue();
        if (intValue < 37030) {
            dtub.w("report_attempt_acounter", intValue);
        }
        buxzVar.aq(new dtwe("messages.report_attempt_acounter", 10, 10L));
        b = new buxs(buxzVar);
    }

    public static void a(Set set, buxo buxoVar) {
        final enip enipVar = (enip) Collection.EL.stream(set).map(new Function() { // from class: bcxx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((awui) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b);
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.b(new Function() { // from class: bcxy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar2 = (buxz) obj;
                bskq[] bskqVarArr = bcyb.a;
                int intValue = MessagesTable.g().intValue();
                if (intValue < 59340) {
                    dtub.w("msisdn_receiving_rcs_message", intValue);
                }
                buxzVar2.aq(new dtrw("messages.msisdn_receiving_rcs_message", 3, buxz.at(enip.this), false));
                return buxzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bcxz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar2 = (buxz) obj;
                bskq[] bskqVarArr = bcyb.a;
                buxzVar2.Y(enip.this);
                return buxzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxoVar.k(new buxs(buxzVar));
    }

    public static void b(buxo buxoVar) {
        buxoVar.d(new buxl(MessagesTable.c.i, true));
    }
}
