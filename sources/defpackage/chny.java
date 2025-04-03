package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chny implements chln {
    public final comc a;

    public chny(ffbr ffbrVar) {
        comu c = comv.c();
        c.d(comb.GAIA_DITTO_TACHYON);
        c.f(chll.a);
        c.c(new Supplier() { // from class: chnt
            @Override // java.util.function.Supplier
            public final Object get() {
                return new chlm();
            }
        });
        this.a = ((comy) ffbrVar.b()).a(c.a());
    }

    @Override // defpackage.chln
    public final elfl a() {
        return this.a.h().h(new emwl() { // from class: chnm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((chll) obj).d.I();
            }
        }, erpp.a);
    }

    @Override // defpackage.chln
    public final elfl b() {
        return this.a.h().h(new emwl() { // from class: chnj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((chll) obj).e);
            }
        }, erpp.a);
    }

    @Override // defpackage.chln
    public final elfl c(final String str) {
        return this.a.j(new emwl() { // from class: chnk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlk chlkVar = (chlk) ((chll) obj).toBuilder();
                chlkVar.copyOnWrite();
                ((chll) chlkVar.instance).c = str;
                return (chll) chlkVar.build();
            }
        }).h(new emwl() { // from class: chnl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.chln
    public final elfl d(final byte[] bArr) {
        return this.a.j(new emwl() { // from class: chno
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlk chlkVar = (chlk) ((chll) obj).toBuilder();
                eyee x = eyee.x(bArr);
                chlkVar.copyOnWrite();
                ((chll) chlkVar.instance).d = x;
                return (chll) chlkVar.build();
            }
        }).h(new emwl() { // from class: chnp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.chln
    public final elfl e(final Long l) {
        return this.a.j(new emwl() { // from class: chnh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlk chlkVar = (chlk) ((chll) obj).toBuilder();
                long longValue = l.longValue();
                chlkVar.copyOnWrite();
                ((chll) chlkVar.instance).e = longValue;
                return (chll) chlkVar.build();
            }
        }).h(new emwl() { // from class: chni
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.chln
    public final elfl f(final chmd chmdVar) {
        return this.a.j(new emwl() { // from class: chnq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlk chlkVar = (chlk) ((chll) obj).toBuilder();
                chlkVar.copyOnWrite();
                chll chllVar = (chll) chlkVar.instance;
                chmd chmdVar2 = chmd.this;
                chmdVar2.getClass();
                chllVar.g = chmdVar2;
                chllVar.b |= 2;
                return (chll) chlkVar.build();
            }
        }).h(new emwl() { // from class: chnr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.chln
    public final elfl g(final chmd chmdVar) {
        return this.a.j(new emwl() { // from class: chnw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlk chlkVar = (chlk) ((chll) obj).toBuilder();
                chlkVar.copyOnWrite();
                chll chllVar = (chll) chlkVar.instance;
                chmd chmdVar2 = chmd.this;
                chmdVar2.getClass();
                chllVar.f = chmdVar2;
                chllVar.b |= 1;
                return (chll) chlkVar.build();
            }
        }).h(new emwl() { // from class: chnx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    public final elfl h() {
        return this.a.h().h(new emwl() { // from class: chns
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chll chllVar = (chll) obj;
                return Long.valueOf(chllVar != null ? chllVar.h : 0L);
            }
        }, erpp.a);
    }
}
