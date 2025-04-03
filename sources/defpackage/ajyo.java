package defpackage;

import android.content.ContentValues;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajyo extends ffhv implements ffjm {
    final /* synthetic */ UUID a;
    final /* synthetic */ akdb b;
    final /* synthetic */ ajyr c;
    final /* synthetic */ akcz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajyo(ffgu ffguVar, UUID uuid, akdb akdbVar, ajyr ajyrVar, akcz akczVar) {
        super(2, ffguVar);
        this.a = uuid;
        this.b = akdbVar;
        this.c = ajyrVar;
        this.d = akczVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajyo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bxle.a;
        bxjg bxjgVar = new bxjg();
        bxjgVar.e(Optional.of(this.a));
        bxjgVar.c(this.b);
        entd entdVar = ajyr.a;
        bxjgVar.f(this.c.d.f());
        bxjgVar.g(akci.CREATED);
        bxjgVar.h(this.c.d.f());
        bxjgVar.d(cvdd.a(this.c.f).b);
        bxjgVar.b(this.d);
        final bxjb a = bxjgVar.a(new Supplier() { // from class: bxje
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bxjc();
            }
        });
        final dtve b = bxle.b();
        dtub.b(bxle.b(), "restore_workflow_executions", a, new Function() { // from class: bxiy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return Long.valueOf(dtve.this.S("restore_workflow_executions", (ContentValues) obj2));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bxiz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                Long l = (Long) obj2;
                if (l.longValue() >= 0) {
                    bxjb bxjbVar = bxjb.this;
                    bxjbVar.a = new bxja(l).a.longValue();
                    bxjbVar.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajyo ajyoVar = new ajyo(ffguVar, this.a, this.b, this.c, this.d);
        ajyoVar.e = obj;
        return ajyoVar;
    }
}
