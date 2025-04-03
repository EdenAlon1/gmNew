package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpni implements cpna {
    public final cpsu a;
    public final ffbr b;
    public final errl c;
    private final ffbr d;
    private final ffbr e;

    public cpni(cpsu cpsuVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar) {
        this.a = cpsuVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.b = ffbrVar3;
        this.c = errlVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ awui a(Object obj) {
        awwf awwfVar = ((awyl) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        awui awuiVar = awwfVar.d;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ awui b(Object obj) {
        awyl awylVar = (awyl) obj;
        emxf.b((awylVar.b & 4) != 0, "Self identity is missing in RemoveUserFromGroupChatRequest");
        awui awuiVar = awylVar.f;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        final awyl awylVar = (awyl) obj;
        emxf.l(awylVar.d.size() != 0);
        emxf.l((awylVar.b & 4) != 0);
        cpil cpilVar = (cpil) this.e.b();
        awwf awwfVar = awylVar.c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return cpilVar.a(awwfVar).i(new eroh() { // from class: cpnh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                final esqu esquVar = (esqu) obj2;
                cpni cpniVar = cpni.this;
                final awyl awylVar2 = awylVar;
                awui awuiVar = awylVar2.f;
                if (awuiVar == null) {
                    awuiVar = awui.a;
                }
                return cpniVar.a.b(awuiVar).i(new eroh() { // from class: cpnf
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj3) {
                        elfl c;
                        cprv cprvVar = (cprv) obj3;
                        final cpiw cpiwVar = new cpiw();
                        Stream map = Collection.EL.stream(awylVar2.d).map(new Function() { // from class: cpng
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj4) {
                                return (fcek) cpiw.this.fP((awui) obj4);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = engw.d;
                        engw engwVar = (engw) map.collect(endq.a);
                        esqu esquVar2 = esqu.this;
                        esquVar2.getClass();
                        engwVar.getClass();
                        c = axol.c(cprvVar.b, ffhe.a, ffsm.a, new cprt(cprvVar, esquVar2, engwVar, null));
                        return c;
                    }
                }, cpniVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl d(Object obj, awud awudVar) {
        avkh avkhVar = (avkh) this.d.b();
        eyee eyeeVar = ((awyl) obj).e;
        awym awymVar = (awym) awyn.a.createBuilder();
        awymVar.copyOnWrite();
        awyn awynVar = (awyn) awymVar.instance;
        eyeeVar.getClass();
        awynVar.b |= 2;
        awynVar.d = eyeeVar;
        awymVar.copyOnWrite();
        awyn awynVar2 = (awyn) awymVar.instance;
        awudVar.getClass();
        awynVar2.c = awudVar;
        awynVar2.b |= 1;
        return avkhVar.f((awyn) awymVar.build());
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl e(Object obj, Object obj2) {
        avkh avkhVar = (avkh) this.d.b();
        eyee eyeeVar = ((awyl) obj).e;
        awuc awucVar = awuc.OK;
        awym awymVar = (awym) awyn.a.createBuilder();
        awymVar.copyOnWrite();
        awyn awynVar = (awyn) awymVar.instance;
        eyeeVar.getClass();
        awynVar.b |= 2;
        awynVar.d = eyeeVar;
        awty awtyVar = (awty) awud.a.createBuilder();
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awud awudVar2 = (awud) awtyVar.build();
        awymVar.copyOnWrite();
        awyn awynVar2 = (awyn) awymVar.instance;
        awudVar2.getClass();
        awynVar2.c = awudVar2;
        awynVar2.b |= 1;
        return avkhVar.f((awyn) awymVar.build());
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ String f(Object obj) {
        awwf awwfVar = ((awyl) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return awwfVar.c;
    }

    @Override // defpackage.cpna
    public final String g() {
        return "TachygramRemoveUserFromGroupOperation";
    }

    @Override // defpackage.cpna
    public final boolean h() {
        return false;
    }
}
