package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iow extends iuf {
    final /* synthetic */ ipa a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iow(ipa ipaVar, ffjm ffjmVar, String str) {
        super(str);
        this.a = ipaVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        this.a.h.a = ipqVar.q();
        this.a.h.b = ipqVar.ec();
        this.a.h.c = ipqVar.ed();
        if (!ipqVar.eu()) {
            ipa ipaVar = this.a;
            if (ipaVar.a.k != null) {
                ipaVar.e = 0;
                ipo ipoVar = (ipo) this.b.a(ipaVar.i, new jzk(j));
                ipa ipaVar2 = this.a;
                return new iou(ipoVar, ipaVar2, ipaVar2.e, ipoVar);
            }
        }
        ipa ipaVar3 = this.a;
        ipaVar3.d = 0;
        ipo ipoVar2 = (ipo) this.b.a(ipaVar3.h, new jzk(j));
        ipa ipaVar4 = this.a;
        return new iov(ipoVar2, ipaVar4, ipaVar4.d, ipoVar2);
    }
}
