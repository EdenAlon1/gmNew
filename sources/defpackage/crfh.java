package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crfh {
    private final ffbr a;
    private final djrk b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public crfh(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, djrk djrkVar) {
        this.a = ffbrVar;
        this.b = djrkVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
    }

    public final Optional a(Optional optional) {
        String str = ((Boolean) this.c.b()).booleanValue() ? (String) this.d.b() : ((Boolean) this.e.b()).booleanValue() ? "https://rcs-copper-dynamic.sandbox.googleapis.com" : null;
        if (str != null) {
            return Optional.of(str);
        }
        return ((djry) this.a.b()).k(this.b.a(((awui) optional.orElseThrow()).d)).map(new Function() { // from class: crfg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((djtp) obj).o().mFtHttpContentServerUri;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
