package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dijz extends dijp {
    private final Context b;

    public dijz(Context context, djix djixVar, dkpp dkppVar, errl errlVar, dijt dijtVar) {
        super(djixVar, dkppVar, eplu.CARRIER_SERVICES_EVENT_SOURCE_RCS, errlVar, dijtVar);
        this.b = context;
    }

    public static eyyi f(int i, String str, Optional optional) {
        final eyyi eyyiVar = (eyyi) eyyn.a.createBuilder();
        eyyiVar.copyOnWrite();
        eyyn eyynVar = (eyyn) eyyiVar.instance;
        eyynVar.c = i - 1;
        eyynVar.b |= 1;
        eyyiVar.copyOnWrite();
        eyyn eyynVar2 = (eyyn) eyyiVar.instance;
        str.getClass();
        eyynVar2.b |= 32;
        eyynVar2.h = str;
        optional.ifPresent(new Consumer() { // from class: dijx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                eyyi eyyiVar2 = eyyi.this;
                eyyiVar2.copyOnWrite();
                eyyn eyynVar3 = (eyyn) eyyiVar2.instance;
                eyyn eyynVar4 = eyyn.a;
                eyynVar3.e = ((eyyh) obj).f;
                eyynVar3.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return eyyiVar;
    }

    public final dijy d(boolean z, String str) {
        return new dijy(this, str, true != z ? 4 : 5);
    }

    public final void e(eyyi eyyiVar) {
        epls K = K(this.b);
        if (K == null) {
            dkty.q("Unable to send :s/http/HTTP/ file transfer log. (event is null)", new Object[0]);
            return;
        }
        K.copyOnWrite();
        eplx eplxVar = (eplx) K.instance;
        eyyn eyynVar = (eyyn) eyyiVar.build();
        eplx eplxVar2 = eplx.a;
        eyynVar.getClass();
        eplxVar.f = eyynVar;
        eplxVar.e = 37;
        M(this.b, (eplx) K.build(), ezee.FILE_TRANSFER_EVENT);
    }

    public final void g(int i, String str, int i2, Optional optional, final Optional optional2) {
        final eyyi f = f(i, str, optional);
        f.copyOnWrite();
        eyyn eyynVar = (eyyn) f.instance;
        eyyn eyynVar2 = eyyn.a;
        eyynVar.f = i2 - 1;
        eyynVar.b |= 8;
        optional2.ifPresent(new Consumer() { // from class: dijw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                eyyl eyylVar = (eyyl) optional2.get();
                eyyi eyyiVar = eyyi.this;
                eyyiVar.copyOnWrite();
                eyyn eyynVar3 = (eyyn) eyyiVar.instance;
                eyyn eyynVar4 = eyyn.a;
                eyynVar3.g = eyylVar.n;
                eyynVar3.b |= 16;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        e(f);
    }
}
