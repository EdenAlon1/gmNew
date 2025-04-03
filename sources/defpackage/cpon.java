package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpon implements cpna {
    public final cpsu a;
    public final errl b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public cpon(cpsu cpsuVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, ffbr ffbrVar3) {
        this.a = cpsuVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.b = errlVar;
        this.e = ffbrVar3;
    }

    public static final awui i(axaq axaqVar) {
        emxf.b((axaqVar.b & 8) != 0, "Self identity is missing in UpdateGroupChatRequest");
        awui awuiVar = axaqVar.f;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ awui a(Object obj) {
        awwf awwfVar = ((axaq) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        awui awuiVar = awwfVar.d;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ awui b(Object obj) {
        return i((axaq) obj);
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        final axaq axaqVar = (axaq) obj;
        int i = axaqVar.b;
        if ((i & 2) == 0 && (i & 32) == 0) {
            return elfo.e(null);
        }
        if (!((atzo) this.e.b()).a() && (axaqVar.b & 2) == 0) {
            return elfo.e(null);
        }
        cpil cpilVar = (cpil) this.d.b();
        awwf awwfVar = axaqVar.c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return cpilVar.a(awwfVar).i(new eroh() { // from class: cpol
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                final axaq axaqVar2 = axaqVar;
                cpon cponVar = cpon.this;
                final esqu esquVar = (esqu) obj2;
                return cponVar.a.b(cpon.i(axaqVar2)).i(new eroh() { // from class: cpom
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj3) {
                        esqd esqdVar;
                        axaq axaqVar3 = axaq.this;
                        cprv cprvVar = (cprv) obj3;
                        int i2 = axaqVar3.b;
                        int i3 = 0;
                        emxf.l(((i2 & 2) == 0 && (i2 & 32) == 0) ? false : true);
                        Optional empty = Optional.empty();
                        Optional empty2 = Optional.empty();
                        if ((axaqVar3.b & 2) != 0) {
                            empty = Optional.of(axaqVar3.d);
                            i3 = 1;
                        }
                        if ((axaqVar3.b & 32) != 0) {
                            empty2 = Optional.of(new esqs(axaqVar3.h));
                            i3 |= 2;
                        }
                        if ((axaqVar3.b & 16) != 0) {
                            axad axadVar = axaqVar3.g;
                            if (axadVar == null) {
                                axadVar = axad.a;
                            }
                            esqdVar = new esqd(axadVar.c);
                            i3 |= 4;
                        } else {
                            esqdVar = null;
                        }
                        esqu esquVar2 = esquVar;
                        esrc esrcVar = new esrc(empty, empty2, esqdVar, (~i3) & 7);
                        esquVar2.getClass();
                        return axol.i(cprvVar.b, new cpru(cprvVar, esquVar2, esrcVar, null));
                    }
                }, cponVar.b);
            }
        }, this.b);
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl d(Object obj, awud awudVar) {
        avkh avkhVar = (avkh) this.c.b();
        eyee eyeeVar = ((axaq) obj).e;
        axas axasVar = (axas) axat.a.createBuilder();
        axasVar.copyOnWrite();
        axat axatVar = (axat) axasVar.instance;
        eyeeVar.getClass();
        axatVar.b |= 2;
        axatVar.d = eyeeVar;
        axasVar.copyOnWrite();
        axat axatVar2 = (axat) axasVar.instance;
        awudVar.getClass();
        axatVar2.c = awudVar;
        axatVar2.b |= 1;
        return avkhVar.j((axat) axasVar.build());
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl e(Object obj, Object obj2) {
        avkh avkhVar = (avkh) this.c.b();
        eyee eyeeVar = ((axaq) obj).e;
        awuc awucVar = awuc.OK;
        axas axasVar = (axas) axat.a.createBuilder();
        axasVar.copyOnWrite();
        axat axatVar = (axat) axasVar.instance;
        eyeeVar.getClass();
        axatVar.b |= 2;
        axatVar.d = eyeeVar;
        awty awtyVar = (awty) awud.a.createBuilder();
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awud awudVar2 = (awud) awtyVar.build();
        axasVar.copyOnWrite();
        axat axatVar2 = (axat) axasVar.instance;
        awudVar2.getClass();
        axatVar2.c = awudVar2;
        axatVar2.b |= 1;
        return avkhVar.j((axat) axasVar.build());
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ String f(Object obj) {
        awwf awwfVar = ((axaq) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return awwfVar.c;
    }

    @Override // defpackage.cpna
    public final String g() {
        return "TachygramUpdateGroupOperation";
    }

    @Override // defpackage.cpna
    public final boolean h() {
        return false;
    }
}
