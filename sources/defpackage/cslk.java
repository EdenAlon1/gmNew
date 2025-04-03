package defpackage;

import android.text.TextUtils;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cslk {
    private final ffbr a;
    private final ffbr b;

    public cslk(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    private final String b(bcrs bcrsVar) {
        String t = bcrsVar.t();
        String str = (String) bcrsVar.p().map(new Function() { // from class: cslj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfva cfvaVar = aoqm.a;
                return ((aoku) obj).p(((Boolean) new aoov().get()).booleanValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        if (true == TextUtils.isEmpty(t)) {
            t = str;
        }
        return ((cuxh) this.a.b()).c(emxe.b(t));
    }

    public final boolean a(bcrs bcrsVar) {
        return ((autu) this.b.b()).a() ? !TextUtils.isEmpty(b(bcrsVar)) && bcrsVar.B() && (!TextUtils.isEmpty(bcrsVar.u()) || bcrsVar.X()) && !bcrsVar.F() && !bcrsVar.W() && bcrsVar.R() == byyt.UNARCHIVED : (TextUtils.isEmpty(b(bcrsVar)) || !bcrsVar.B() || TextUtils.isEmpty(bcrsVar.u()) || bcrsVar.F() || bcrsVar.W() || bcrsVar.R() != byyt.UNARCHIVED) ? false : true;
    }
}
