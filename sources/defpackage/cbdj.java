package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbdj {
    public static final cfva a = cfvl.q(154643523);
    public static final entd b = entd.c("BugleJobs");
    public final ffbr c;
    private final Set i;
    public final emyl e = emys.a(new emyl() { // from class: cbcp
        @Override // defpackage.emyl
        public final Object get() {
            cfva cfvaVar = cbdj.a;
            buxo d = MessagesTable.d();
            d.z("TableChangeObserver-messages");
            d.e(new Function() { // from class: cbcu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    cfva cfvaVar2 = cbdj.a;
                    return new buun[]{buumVar.a, buumVar.n, buumVar.k};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            return d.b();
        }
    });
    public final emyl f = emys.a(new emyl() { // from class: cbcq
        @Override // defpackage.emyl
        public final Object get() {
            cfva cfvaVar = cbdj.a;
            bsob e = bsom.e();
            e.z("TableChangeObserver-conversations");
            e.f(new Function() { // from class: cbct
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cfva cfvaVar2 = cbdj.a;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bsom.c.a);
                    arrayList.add(bsom.c.c);
                    arrayList.add(bsom.c.q);
                    arrayList.add(bsom.c.aq);
                    return (bskq[]) arrayList.toArray(new bskq[arrayList.size()]);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            return e.b();
        }
    });
    public final emyl g = emys.a(new emyl() { // from class: cbcr
        @Override // defpackage.emyl
        public final Object get() {
            cfva cfvaVar = cbdj.a;
            bvvn e = ParticipantsTable.e();
            e.z("TableChangeObserver-participants");
            e.e(new Function() { // from class: cbcv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvtg bvtgVar = (bvtg) obj;
                    cfva cfvaVar2 = cbdj.a;
                    return new bvth[]{bvtgVar.a, bvtgVar.m, bvtgVar.h, bvtgVar.f, bvtgVar.r};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            return e.b();
        }
    });
    public final emyl h = emys.a(new emyl() { // from class: cbcs
        @Override // defpackage.emyl
        public final Object get() {
            cfva cfvaVar = cbdj.a;
            btta b2 = bttf.b();
            b2.z("TableChangeObserver-message_annotations");
            b2.c(new Function() { // from class: cbco
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btsl btslVar = (btsl) obj;
                    cfva cfvaVar2 = cbdj.a;
                    return new btsm[]{btslVar.a, btslVar.c, btslVar.e};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            return b2.b();
        }
    });
    public final AtomicBoolean d = new AtomicBoolean(false);

    public cbdj(Set set, ffbr ffbrVar) {
        this.i = set;
        this.c = ffbrVar;
    }

    public final cbcx a(int i) {
        return new cbcw(this.i, b, i);
    }
}
