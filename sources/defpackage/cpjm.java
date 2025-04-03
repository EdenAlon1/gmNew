package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.net.URI;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpjm implements cpna {
    public final asqj a;
    private final cpsu b;
    private final ffbr c;
    private final ffbr d;
    private final cpke e;
    private final errl f;

    public cpjm(cpsu cpsuVar, ffbr ffbrVar, ffbr ffbrVar2, cpke cpkeVar, errl errlVar, asqj asqjVar) {
        this.b = cpsuVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = cpkeVar;
        this.f = errlVar;
        this.a = asqjVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ awui a(Object obj) {
        throw new IllegalStateException("Cannot get remote user for create group request");
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ awui b(Object obj) {
        awuw awuwVar = (awuw) obj;
        emxf.b((awuwVar.b & 8) != 0, "Self identity is missing in CreateGroupChatRequest");
        awui awuiVar = awuwVar.f;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        final awuw awuwVar = (awuw) obj;
        awui awuiVar = awuwVar.f;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        return this.b.b(awuiVar).i(new eroh() { // from class: cpjl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                int i;
                esqd esqdVar;
                elfl c;
                cprv cprvVar = (cprv) obj2;
                esqz a = esra.a();
                awuw awuwVar2 = awuwVar;
                String str = (awuwVar2.b & 2) != 0 ? awuwVar2.d : "";
                cpjm cpjmVar = cpjm.this;
                a.d(str);
                if (cpjmVar.a.a()) {
                    awwj awwjVar = awuwVar2.i;
                    if (awwjVar == null) {
                        awwjVar = awwj.a;
                    }
                    awwjVar.getClass();
                    ffga ffgaVar = new ffga();
                    if ((awwjVar.b & 1) != 0) {
                        ffgaVar.put("is_upgrade_from_mms_group", true != awwjVar.c ? "0" : "1");
                    }
                    a.c(ffew.b(ffgaVar));
                }
                a.b((awuwVar2.b & 4) != 0 ? new esqs(awuwVar2.e) : esqs.a);
                esqg esqgVar = new esqg();
                fcej a2 = cpta.a();
                fgtg fgtgVar = fgtg.GROUP_ID;
                a2.copyOnWrite();
                fcek fcekVar = (fcek) a2.instance;
                fcek fcekVar2 = fcek.a;
                fcekVar.b = fgtgVar.a();
                String str2 = awuwVar2.c;
                a2.copyOnWrite();
                fcek fcekVar3 = (fcek) a2.instance;
                str2.getClass();
                fcekVar3.c = str2;
                esqgVar.c((fcek) a2.build());
                esqu a3 = esqgVar.a();
                esrb a4 = a.a();
                int i2 = engw.d;
                engr engrVar = new engr();
                engrVar.j(awuwVar2.g);
                awui awuiVar2 = awuwVar2.f;
                if (awuiVar2 == null) {
                    awuiVar2 = awui.a;
                }
                engrVar.h(awuiVar2);
                engw g = engrVar.g();
                final cpiw cpiwVar = new cpiw();
                engw engwVar = (engw) Collection.EL.stream(g).map(new Function() { // from class: cpjk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return (fcek) cpiw.this.fP((awui) obj3);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a);
                engwVar.getClass();
                enin eninVar = new enin();
                eninVar.j(engwVar);
                if ((awuwVar2.b & 64) != 0) {
                    axad axadVar = awuwVar2.j;
                    if (axadVar == null) {
                        axadVar = axad.a;
                    }
                    esqdVar = new esqd(axadVar.c);
                    i = 15;
                } else {
                    i = 7;
                    esqdVar = null;
                }
                enip g2 = eninVar.g();
                if (((~i) & 8) != 0) {
                    esqdVar = null;
                }
                c = axol.c(cprvVar.b, ffhe.a, ffsm.a, new cprr(cprvVar, new esqm(a3, a4, g2, esqdVar), null));
                return c;
            }
        }, this.f);
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl d(Object obj, awud awudVar) {
        avkh avkhVar = (avkh) this.c.b();
        awuy awuyVar = (awuy) awuz.a.createBuilder();
        eyee eyeeVar = ((awuw) obj).h;
        awuyVar.copyOnWrite();
        awuz awuzVar = (awuz) awuyVar.instance;
        eyeeVar.getClass();
        awuzVar.b |= 4;
        awuzVar.e = eyeeVar;
        awuyVar.copyOnWrite();
        awuz awuzVar2 = (awuz) awuyVar.instance;
        awudVar.getClass();
        awuzVar2.c = awudVar;
        awuzVar2.b |= 1;
        return avkhVar.b((awuz) awuyVar.build());
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl e(Object obj, Object obj2) {
        final awuw awuwVar = (awuw) obj;
        final esqv esqvVar = (esqv) obj2;
        emxf.m(esqvVar.a.b.isPresent(), "Expect conference URI in create group response.");
        eyee eyeeVar = esqvVar.a.a.e;
        if (!eyee.b.equals(eyeeVar)) {
            return this.e.c(esqvVar.a.a.c, eyeeVar).i(new eroh() { // from class: cpjj
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj3) {
                    return cpjm.this.i(awuwVar, esqvVar);
                }
            }, this.f);
        }
        ensz enszVar = (ensz) cpjn.a.h();
        enszVar.Y(csux.J, esqvVar.a.a.c);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramCreateGroupWorkHandler$TachygramCreateGroupOperation", "onSuccess", 168, "TachygramCreateGroupWorkHandler.java")).q("Created a tachygram group with a missing routing info token.");
        return i(awuwVar, esqvVar);
    }

    @Override // defpackage.cpna
    public final /* synthetic */ String f(Object obj) {
        return ((awuw) obj).c;
    }

    @Override // defpackage.cpna
    public final String g() {
        return "TachygramCreateGroupOperation";
    }

    @Override // defpackage.cpna
    public final boolean h() {
        return false;
    }

    public final elfl i(awuw awuwVar, esqv esqvVar) {
        avkh avkhVar = (avkh) this.c.b();
        awuy awuyVar = (awuy) awuz.a.createBuilder();
        eyee eyeeVar = awuwVar.h;
        awuyVar.copyOnWrite();
        awuz awuzVar = (awuz) awuyVar.instance;
        eyeeVar.getClass();
        awuzVar.b |= 4;
        awuzVar.e = eyeeVar;
        awui e = ((avkc) this.d.b()).e(((URI) esqvVar.a.b.get()).toString());
        awuyVar.copyOnWrite();
        awuz awuzVar2 = (awuz) awuyVar.instance;
        e.getClass();
        awuzVar2.d = e;
        awuzVar2.b |= 2;
        awty awtyVar = (awty) awud.a.createBuilder();
        awuc awucVar = awuc.OK;
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awud awudVar2 = (awud) awtyVar.build();
        awuyVar.copyOnWrite();
        awuz awuzVar3 = (awuz) awuyVar.instance;
        awudVar2.getClass();
        awuzVar3.c = awudVar2;
        awuzVar3.b |= 1;
        eqyl eqylVar = eqyl.RCS_TACHYGRAM;
        awuyVar.copyOnWrite();
        awuz awuzVar4 = (awuz) awuyVar.instance;
        awuzVar4.f = eqylVar.h;
        awuzVar4.b |= 8;
        return avkhVar.b((awuz) awuyVar.build());
    }
}
