package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amon {
    private final ffbr a;
    private final ffbr b;

    public amon(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public static final bsob b(final bsol bsolVar) {
        bsolVar.getClass();
        bsob e = bsom.e();
        e.z("ConversationsSummary");
        e.i(new Function() { // from class: amoi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bsol.this;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bskp bskpVar = bsom.c;
        e.e(new bsny(bskpVar.r, false), new bsny(bskpVar.a, false));
        e.v(bsom.c.a);
        e.f(new Function() { // from class: amoj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bskp bskpVar2 = (bskp) obj;
                return new bskq[]{bskpVar2.a, bskpVar2.c, bskpVar2.O, bskpVar2.g, bskpVar2.D, bskpVar2.t, bskpVar2.k, bskpVar2.l, bskpVar2.m, bskpVar2.n, bskpVar2.o, bskpVar2.j, bskpVar2.L, bskpVar2.r, bskpVar2.aq, bskpVar2.A, bskpVar2.R, bskpVar2.y};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxo d = MessagesTable.d();
        d.e(new Function() { // from class: amoh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new buun[]{((buum) obj).k};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvvn e2 = ParticipantsTable.e();
        e2.e(new Function() { // from class: amog
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvtg bvtgVar = (bvtg) obj;
                return new bvth[]{bvtgVar.m, bvtgVar.n, bvtgVar.h};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.F(dtvz.i(e2.b(), ParticipantsTable.c.a, MessagesTable.c.c));
        String[] strArr = VmtTable.a;
        byyg byygVar = new byyg(VmtTable.a);
        byygVar.d(new Function() { // from class: amok
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                byxv byxvVar = (byxv) obj;
                return new byxw[]{byxvVar.a, byxvVar.c, byxvVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwdf c = PartsTable.c();
        c.e(new Function() { // from class: amol
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new bwau[]{((bwat) obj).e};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c.F(dtvz.i(byygVar.b(), VmtTable.c.a, PartsTable.d.a));
        d.F(dtvz.i(c.b(), PartsTable.d.b, MessagesTable.c.a));
        e.F(dtvz.i(d.b(), MessagesTable.c.a, bsom.c.f));
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01cf, code lost:
    
        if (r1 != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.bsol r32, defpackage.ffgu r33) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amon.a(bsol, ffgu):java.lang.Object");
    }
}
