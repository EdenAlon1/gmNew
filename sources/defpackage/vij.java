package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vij {
    public static final dqgm a = new dqgm(-1000000001);
    public final vhp b;
    public final dsfh c;
    public final ffbr d;
    public final dsma e;
    public final ffbr f;
    public final ffbr g;
    public final dqnj h;
    public ffjm i;
    public final Optional j;
    public final ffbz k;
    public final ffbz l;
    public final cmqs m;
    public final vif n;
    public final vig o;
    public dsfg p;
    private final vhr q;

    public vij(vhp vhpVar, dsfh dsfhVar, ffbr ffbrVar, dsma dsmaVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, dqki dqkiVar, dqnk dqnkVar, final Optional optional, final Optional optional2, vhr vhrVar) {
        Optional empty;
        ffbrVar.getClass();
        dsmaVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        dqkiVar.getClass();
        this.b = vhpVar;
        this.c = dsfhVar;
        this.d = ffbrVar;
        this.e = dsmaVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.q = vhrVar;
        this.h = dqnkVar.a(dqkiVar, a);
        if ((vhrVar.b & 1) != 0) {
            cmrl cmrlVar = vhrVar.c;
            empty = Optional.of(cmrlVar == null ? cmrl.a : cmrlVar);
        } else {
            empty = Optional.empty();
        }
        this.j = empty;
        this.k = ffca.a(new ffix() { // from class: vhx
            @Override // defpackage.ffix
            public final Object invoke() {
                return (dqsv) ((ffbr) Optional.this.orElse(new ffbr() { // from class: vhz
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return new dqsv(null, null, PrivateKeyType.INVALID);
                    }
                })).b();
            }
        });
        this.l = ffca.a(new ffix() { // from class: vhy
            @Override // defpackage.ffix
            public final Object invoke() {
                return (drxd) ((ffbr) Optional.this.orElse(new ffbr() { // from class: via
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return new drxd(false, false, false, false, 0.0f, false, 2047);
                    }
                })).b();
            }
        });
        this.m = ((cmqt) ffbrVar4.b()).a(eptu.FULL_SCREEN, eptm.ADD_CUSTOM_REACTION_BUTTON_CLICK, bdhb.b(vhrVar.d));
        this.n = new vif();
        this.o = new vig(this);
    }

    public static final vhp a(Optional optional, Optional optional2) {
        final vhq vhqVar = (vhq) vhr.a.createBuilder();
        vhqVar.getClass();
        final ffji ffjiVar = new ffji() { // from class: vib
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cmrl cmrlVar = (cmrl) obj;
                cmrlVar.getClass();
                vhq vhqVar2 = vhq.this;
                vhqVar2.copyOnWrite();
                vhr vhrVar = (vhr) vhqVar2.instance;
                vhr vhrVar2 = vhr.a;
                vhrVar.c = cmrlVar;
                vhrVar.b |= 1;
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: vic
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final ffji ffjiVar2 = new ffji() { // from class: vid
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                vhq vhqVar2 = vhq.this;
                vhqVar2.copyOnWrite();
                vhr vhrVar = (vhr) vhqVar2.instance;
                vhr vhrVar2 = vhr.a;
                vhrVar.b |= 2;
                vhrVar.d = str;
                return ffcu.a;
            }
        };
        optional2.ifPresent(new Consumer() { // from class: vie
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        vhr vhrVar = (vhr) vhqVar.build();
        vhp vhpVar = new vhp();
        fbae.e(vhpVar);
        ekku.a(vhpVar, vhrVar);
        return vhpVar;
    }
}
