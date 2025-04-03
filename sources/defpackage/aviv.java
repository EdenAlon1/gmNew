package defpackage;

import android.webkit.URLUtil;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aviv {
    public final comc a;

    public aviv(ffbr ffbrVar) {
        comy comyVar = (comy) ffbrVar.b();
        comu c = comv.c();
        c.d(comb.BUSINESS_APP_DATA);
        c.f(avip.a);
        this.a = comyVar.a(c.a());
    }

    public final elfl a() {
        return this.a.h().h(new emwl() { // from class: aviq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                avip avipVar = (avip) obj;
                if ((avipVar.b & 1) != 0) {
                    avix avixVar = avipVar.c;
                    if (avixVar == null) {
                        avixVar = avix.a;
                    }
                    if (!avixVar.b.isEmpty()) {
                        avix avixVar2 = avipVar.c;
                        if (avixVar2 == null) {
                            avixVar2 = avix.a;
                        }
                        return Optional.of(avixVar2.b);
                    }
                }
                return Optional.empty();
            }
        }, erpp.a);
    }

    public final elfl b(final String str) {
        return this.a.j(new emwl() { // from class: avit
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aviw aviwVar;
                avip avipVar = (avip) obj;
                if ((avipVar.b & 1) != 0) {
                    avix avixVar = avipVar.c;
                    if (avixVar == null) {
                        avixVar = avix.a;
                    }
                    aviwVar = (aviw) avixVar.toBuilder();
                } else {
                    aviwVar = (aviw) avix.a.createBuilder();
                }
                String str2 = str;
                avio avioVar = (avio) avipVar.toBuilder();
                String b = emxe.b(str2);
                if (true != URLUtil.isHttpsUrl(b)) {
                    b = "";
                }
                aviwVar.copyOnWrite();
                ((avix) aviwVar.instance).b = b;
                avioVar.copyOnWrite();
                avip avipVar2 = (avip) avioVar.instance;
                avix avixVar2 = (avix) aviwVar.build();
                avixVar2.getClass();
                avipVar2.c = avixVar2;
                avipVar2.b |= 1;
                return (avip) avioVar.build();
            }
        }).h(new emwl() { // from class: aviu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }
}
