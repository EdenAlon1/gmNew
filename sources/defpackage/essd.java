package defpackage;

import android.text.TextUtils;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class essd extends ffhv implements ffji {
    int a;
    final /* synthetic */ essj b;
    final /* synthetic */ fcek c;
    final /* synthetic */ esrc d;
    final /* synthetic */ fcgq e;
    final /* synthetic */ Instant f;
    final /* synthetic */ essw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public essd(essj essjVar, fcek fcekVar, esrc esrcVar, fcgq fcgqVar, Instant instant, essw esswVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = essjVar;
        this.c = fcekVar;
        this.d = esrcVar;
        this.e = fcgqVar;
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
            esrc esrcVar = this.d;
            fcek fcekVar2 = this.e.c;
            if (fcekVar2 == null) {
                fcekVar2 = fcek.a;
            }
            cpqz cpqzVar = essjVar.a;
            fcekVar2.getClass();
            Instant instant = this.f;
            fcek e = essj.e(fcekVar2, 10);
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
            ofNullable.ifPresent(new Consumer() { // from class: cple
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
            emxf.m(true ^ esrcVar.a(), "Received an empty GroupPropertiesUpdate from tachygram.");
            final awvs a = cpllVar.a(fcekVar.c, ofNullable, instant);
            esrcVar.a.ifPresent(new Consumer() { // from class: cplf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    String str = (String) obj3;
                    entd entdVar = cpll.a;
                    awvs awvsVar = awvs.this;
                    awvsVar.copyOnWrite();
                    awvt awvtVar = (awvt) awvsVar.instance;
                    eygj eygjVar = awvt.a;
                    str.getClass();
                    awvtVar.d |= 8;
                    awvtVar.l = str;
                    boolean isEmpty = TextUtils.isEmpty(str);
                    awvsVar.copyOnWrite();
                    awvt awvtVar2 = (awvt) awvsVar.instance;
                    awvtVar2.d |= 4;
                    awvtVar2.k = isEmpty;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            esrcVar.b.ifPresent(new Consumer() { // from class: cplg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj3) {
                    esqs esqsVar = (esqs) obj3;
                    String str = esqsVar.b;
                    entd entdVar = cpll.a;
                    awvs awvsVar = awvs.this;
                    awvsVar.copyOnWrite();
                    awvt awvtVar = (awvt) awvsVar.instance;
                    eygj eygjVar = awvt.a;
                    awvtVar.d |= 32;
                    awvtVar.n = str;
                    boolean e2 = ffkj.e(esqsVar, esqs.a);
                    awvsVar.copyOnWrite();
                    awvt awvtVar2 = (awvt) awvsVar.instance;
                    awvtVar2.d |= 16;
                    awvtVar2.m = e2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Object c = fgfz.c(cpllVar.b((awvt) a.build(), "handleGroupPropertiesUpdate"), this);
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
        return new essd(this.b, this.c, this.d, this.e, this.f, this.g, (ffgu) obj).b(ffcu.a);
    }
}
