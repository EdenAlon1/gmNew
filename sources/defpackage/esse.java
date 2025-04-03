package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esse extends ffhv implements ffji {
    int a;
    final /* synthetic */ essj b;
    final /* synthetic */ fcek c;
    final /* synthetic */ fcek d;
    final /* synthetic */ Instant e;
    final /* synthetic */ essw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esse(essj essjVar, fcek fcekVar, fcek fcekVar2, Instant instant, essw esswVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = essjVar;
        this.c = fcekVar;
        this.d = fcekVar2;
        this.e = instant;
        this.f = esswVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        elfl b;
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            essj essjVar = this.b;
            fcek fcekVar = this.c;
            fcek fcekVar2 = this.d;
            Instant instant = this.e;
            this.a = 1;
            Optional ofNullable = Optional.ofNullable(fcekVar2);
            fgtg b2 = fgtg.b(fcekVar.b);
            if (b2 == null) {
                b2 = fgtg.UNRECOGNIZED;
            }
            boolean equals = b2.equals(fgtg.GROUP_ID);
            fgtg b3 = fgtg.b(fcekVar.b);
            if (b3 == null) {
                b3 = fgtg.UNRECOGNIZED;
            }
            cpqz cpqzVar = essjVar.a;
            emxf.n(equals, "Group ID expected to be of type GROUP_ID, but instead was type %s.", b3.a());
            ofNullable.ifPresent(new Consumer() { // from class: cpko
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    entd entdVar = cpll.a;
                    fgtg b4 = fgtg.b(((fcek) obj3).b);
                    if (b4 == null) {
                        b4 = fgtg.UNRECOGNIZED;
                    }
                    emxf.m(!b4.equals(fgtg.GROUP_ID), "Updater ID should not be of type GROUP_ID.");
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cpll cpllVar = cpqzVar.a;
            if (((djrv) cpllVar.g.b()).w(cpllVar.f.d)) {
                awvs a = cpllVar.a(fcekVar.c, ofNullable, instant);
                a.b(cpllVar.f);
                b = cpllVar.b((awvt) a.build(), "handleSelfRemovedFromGroup");
            } else {
                b = elfo.d(new cpnd("RCS unavailable for removing self from group.", false));
            }
            b.getClass();
            Object c = fgfz.c(b, this);
            if (c != ffhh.a) {
                c = ffcu.a;
            }
            if (c == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new esse(this.b, this.c, this.d, this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
