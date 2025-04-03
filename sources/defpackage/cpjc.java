package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpjc implements cpna {
    public final cpsu a;
    public final ffbr b;
    public final errl c;
    private final ffbr d;
    private final ffbr e;

    public cpjc(cpsu cpsuVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar) {
        this.a = cpsuVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.b = ffbrVar3;
        this.c = errlVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ awui a(Object obj) {
        awwf awwfVar = ((awtv) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        awui awuiVar = awwfVar.d;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ awui b(Object obj) {
        awtv awtvVar = (awtv) obj;
        emxf.b((awtvVar.b & 4) != 0, "Self identity is missing in AddUserToGroupChatRequest");
        awui awuiVar = awtvVar.f;
        return awuiVar == null ? awui.a : awuiVar;
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl c(Object obj) {
        final awtv awtvVar = (awtv) obj;
        emxf.l(awtvVar.d.size() != 0);
        emxf.l((awtvVar.b & 4) != 0);
        cpil cpilVar = (cpil) this.e.b();
        awwf awwfVar = awtvVar.c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return cpilVar.a(awwfVar).i(new eroh() { // from class: cpja
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                final esqu esquVar = (esqu) obj2;
                cpjc cpjcVar = cpjc.this;
                final awtv awtvVar2 = awtvVar;
                awui awuiVar = awtvVar2.f;
                if (awuiVar == null) {
                    awuiVar = awui.a;
                }
                return cpjcVar.a.b(awuiVar).i(new eroh() { // from class: cpjb
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj3) {
                        elfl c;
                        cprv cprvVar = (cprv) obj3;
                        final cpiw cpiwVar = new cpiw();
                        Stream map = Collection.EL.stream(awtvVar2.d).map(new Function() { // from class: cpiz
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
                        c = axol.c(cprvVar.b, ffhe.a, ffsm.a, new cprq(cprvVar, esquVar2, engwVar, null));
                        return c;
                    }
                }, cpjcVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl d(Object obj, awud awudVar) {
        avkh avkhVar = (avkh) this.d.b();
        eyee eyeeVar = ((awtv) obj).e;
        awtw awtwVar = (awtw) awtx.a.createBuilder();
        awtwVar.copyOnWrite();
        awtx awtxVar = (awtx) awtwVar.instance;
        eyeeVar.getClass();
        awtxVar.b |= 2;
        awtxVar.d = eyeeVar;
        awtwVar.copyOnWrite();
        awtx awtxVar2 = (awtx) awtwVar.instance;
        awudVar.getClass();
        awtxVar2.c = awudVar;
        awtxVar2.b |= 1;
        return avkhVar.a((awtx) awtwVar.build());
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ elfl e(Object obj, Object obj2) {
        avkh avkhVar = (avkh) this.d.b();
        eyee eyeeVar = ((awtv) obj).e;
        awuc awucVar = awuc.OK;
        awtw awtwVar = (awtw) awtx.a.createBuilder();
        awtwVar.copyOnWrite();
        awtx awtxVar = (awtx) awtwVar.instance;
        eyeeVar.getClass();
        awtxVar.b |= 2;
        awtxVar.d = eyeeVar;
        awty awtyVar = (awty) awud.a.createBuilder();
        awtyVar.copyOnWrite();
        awud awudVar = (awud) awtyVar.instance;
        awudVar.c = awucVar.f;
        awudVar.b |= 1;
        awud awudVar2 = (awud) awtyVar.build();
        awtwVar.copyOnWrite();
        awtx awtxVar2 = (awtx) awtwVar.instance;
        awudVar2.getClass();
        awtxVar2.c = awudVar2;
        awtxVar2.b |= 1;
        return avkhVar.a((awtx) awtwVar.build());
    }

    @Override // defpackage.cpna
    public final /* bridge */ /* synthetic */ String f(Object obj) {
        awwf awwfVar = ((awtv) obj).c;
        if (awwfVar == null) {
            awwfVar = awwf.a;
        }
        return awwfVar.c;
    }

    @Override // defpackage.cpna
    public final String g() {
        return "TachygramAddUserToGroupOperation";
    }

    @Override // defpackage.cpna
    public final boolean h() {
        return false;
    }
}
