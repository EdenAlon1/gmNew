package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmld extends ffhv implements ffjm {
    final /* synthetic */ bdhg a;
    final /* synthetic */ String b;
    final /* synthetic */ cmle c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmld(ffgu ffguVar, bdhg bdhgVar, String str, cmle cmleVar) {
        super(2, ffguVar);
        this.a = bdhgVar;
        this.b = str;
        this.c = cmleVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmld) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Instant instant;
        ffci.b(obj);
        final String str = this.b;
        Instant instant2 = (Instant) this.a.m(new Function() { // from class: cmjv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                final bdhg bdhgVar = (bdhg) obj2;
                String[] strArr = btza.a;
                btyv btyvVar = new btyv(btza.a);
                btyvVar.z("getEarliestTimestampForEditedMessage");
                btyvVar.e(new Function() { // from class: cmjw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return new btyi[]{((btyh) obj3).e};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                buxo d = MessagesTable.d();
                d.e(new Function() { // from class: cmjx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return new buun[]{((buum) obj3).i};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final String str2 = str;
                d.h(new Function() { // from class: cmjy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        buxz buxzVar = (buxz) obj3;
                        buxzVar.G(bdhg.this);
                        buxzVar.X(str2);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                btyvVar.G(dtvz.i(d.b(), MessagesTable.c.a, btza.c.a).g());
                btyvVar.d(new btys(btza.c.e));
                btyvVar.x(1);
                dtsu o = btyvVar.b().o();
                try {
                    btyj btyjVar = (btyj) o;
                    if (!btyjVar.moveToFirst()) {
                        ffig.a(o, null);
                        return null;
                    }
                    Instant g = btyjVar.g();
                    ffig.a(o, null);
                    return g;
                } finally {
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (instant2 == null || (instant = this.c.a) == null) {
            return null;
        }
        return Duration.between(instant2, instant);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmld cmldVar = new cmld(ffguVar, this.a, this.b, this.c);
        cmldVar.d = obj;
        return cmldVar;
    }
}
