package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sir extends ffhv implements ffjm {
    int a;
    final /* synthetic */ siz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sir(ffgu ffguVar, siz sizVar) {
        super(2, ffguVar);
        this.b = sizVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sir) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
            return obj;
        }
        ffci.b(obj);
        this.c = this;
        this.a = 1;
        ffrh ffrhVar = new ffrh(ffhi.c(this), 1);
        ffrhVar.B();
        Optional optional = (Optional) this.b.c.b();
        final sis sisVar = new sis(this.b, ffrhVar);
        optional.ifPresentOrElse(new Consumer() { // from class: six
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final /* synthetic */ void o(Object obj2) {
                ffji.this.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new sit(ffrhVar));
        Object m = ffrhVar.m();
        return m == ffhhVar ? ffhhVar : m;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sir sirVar = new sir(ffguVar, this.b);
        sirVar.c = obj;
        return sirVar;
    }
}
