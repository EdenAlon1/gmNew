package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class essa extends ffhv implements ffji {
    int a;
    final /* synthetic */ essj b;
    final /* synthetic */ fcgg c;
    final /* synthetic */ Instant d;
    final /* synthetic */ essw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public essa(essj essjVar, fcgg fcggVar, Instant instant, essw esswVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = essjVar;
        this.c = fcggVar;
        this.d = instant;
        this.e = esswVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            essj essjVar = this.b;
            fcho fchoVar = this.c.d;
            if (fchoVar == null) {
                fchoVar = fcho.a;
            }
            fcek fcekVar = fchoVar.c;
            if (fcekVar == null) {
                fcekVar = fcek.a;
            }
            fcekVar.getClass();
            fcgg fcggVar = this.c;
            eygr eygrVar = fcggVar.e;
            eygrVar.getClass();
            fcek fcekVar2 = fcggVar.b;
            if (fcekVar2 == null) {
                fcekVar2 = fcek.a;
            }
            cpqz cpqzVar = essjVar.a;
            fcekVar2.getClass();
            Instant instant = this.d;
            fcek e = essj.e(fcekVar2, 8);
            this.a = 1;
            Optional ofNullable = Optional.ofNullable(e);
            fgtg b = fgtg.b(fcekVar.b);
            if (b == null) {
                b = fgtg.UNRECOGNIZED;
            }
            boolean equals = b.equals(fgtg.GROUP_ID);
            fgtg b2 = fgtg.b(fcekVar.b);
            if (b2 == null) {
                b2 = fgtg.UNRECOGNIZED;
            }
            cpll cpllVar = cpqzVar.a;
            emxf.n(equals, "Group ID expected to be of type GROUP_ID, but instead was type %s.", b2.a());
            ofNullable.ifPresent(new Consumer() { // from class: cpkt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    entd entdVar = cpll.a;
                    fgtg b3 = fgtg.b(((fcek) obj3).b);
                    if (b3 == null) {
                        b3 = fgtg.UNRECOGNIZED;
                    }
                    emxf.m(!b3.equals(fgtg.GROUP_ID), "Updater ID should not be of type GROUP_ID.");
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            awvs a = cpllVar.a(fcekVar.c, ofNullable, instant);
            engw c = cpll.c(eygrVar);
            a.copyOnWrite();
            awvt awvtVar = (awvt) a.instance;
            eygj eygjVar = awvt.a;
            awvtVar.a();
            eydl.addAll(c, awvtVar.g);
            Object c2 = fgfz.c(cpllVar.b((awvt) a.build(), "handleOthersAddedToGroup"), this);
            if (c2 != ffhh.a) {
                c2 = ffcu.a;
            }
            if (c2 == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new essa(this.b, this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
