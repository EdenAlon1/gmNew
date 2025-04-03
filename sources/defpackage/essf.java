package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class essf extends ffhv implements ffji {
    int a;
    final /* synthetic */ essj b;
    final /* synthetic */ fcek c;
    final /* synthetic */ fcht d;
    final /* synthetic */ fcek e;
    final /* synthetic */ Instant f;
    final /* synthetic */ essw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public essf(essj essjVar, fcek fcekVar, fcht fchtVar, fcek fcekVar2, Instant instant, essw esswVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = essjVar;
        this.c = fcekVar;
        this.d = fchtVar;
        this.e = fcekVar2;
        this.f = instant;
        this.g = esswVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            essj essjVar = this.b;
            fcek fcekVar = this.c;
            eygr eygrVar = this.d.e;
            eygrVar.getClass();
            fcek fcekVar2 = this.e;
            Instant instant = this.f;
            this.a = 1;
            Optional ofNullable = Optional.ofNullable(fcekVar2);
            fgtg b = fgtg.b(fcekVar.b);
            if (b == null) {
                b = fgtg.UNRECOGNIZED;
            }
            boolean equals = b.equals(fgtg.GROUP_ID);
            fgtg b2 = fgtg.b(fcekVar.b);
            if (b2 == null) {
                b2 = fgtg.UNRECOGNIZED;
            }
            cpqz cpqzVar = essjVar.a;
            emxf.n(equals, "Group ID expected to be of type GROUP_ID, but instead was type %s.", b2.a());
            ofNullable.ifPresent(new Consumer() { // from class: cpli
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
            String str = fcekVar.c;
            cpll cpllVar = cpqzVar.a;
            awvs a = cpllVar.a(str, ofNullable, instant);
            engw c = cpll.c(eygrVar);
            a.copyOnWrite();
            awvt awvtVar = (awvt) a.instance;
            eygj eygjVar = awvt.a;
            awvtVar.b();
            eydl.addAll(c, awvtVar.h);
            Object c2 = fgfz.c(cpllVar.b((awvt) a.build(), "handleOthersRemovedFromGroup"), this);
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
        return new essf(this.b, this.c, this.d, this.e, this.f, this.g, (ffgu) obj).b(ffcu.a);
    }
}
