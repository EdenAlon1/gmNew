package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cijc implements ayzt {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/TachygramExecutionKeyExtractor");
    private static final List b = ffdx.g(fbzs.GROUP, fbzs.TACHYGRAM_MESSAGE, fbzs.REFLECTED_TACHYGRAM_MESSAGE);

    @Override // defpackage.ayzt
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        obj.getClass();
        List list = b;
        fbzt fbztVar = (fbzt) obj;
        fbzs b2 = fbzs.b(fbztVar.d);
        if (b2 == null) {
            b2 = fbzs.UNRECOGNIZED;
        }
        if (!list.contains(b2)) {
            fbzs b3 = fbzs.b(fbztVar.d);
            if (b3 == null) {
                b3 = fbzs.UNRECOGNIZED;
            }
            throw new IllegalStateException("TachygramExecutionKeyExtractor called for messageType: " + b3.a());
        }
        fbzr b4 = fbzr.b(fbztVar.k);
        if (b4 == null) {
            b4 = fbzr.UNRECOGNIZED;
        }
        if (b4 == fbzr.EPHEMERAL) {
            return "default key for parallel execution";
        }
        fbzs b5 = fbzs.b(fbztVar.d);
        if (b5 == null) {
            b5 = fbzs.UNRECOGNIZED;
        }
        if (b5 != fbzs.REFLECTED_TACHYGRAM_MESSAGE) {
            if ((fbztVar.b & 4) != 0) {
                fcek fcekVar = fbztVar.j;
                if (fcekVar == null) {
                    fcekVar = fcek.a;
                }
                return "tachygram ".concat(String.valueOf(fcekVar.c));
            }
            fcek fcekVar2 = fbztVar.g;
            if (fcekVar2 == null) {
                fcekVar2 = fcek.a;
            }
            return "tachygram ".concat(String.valueOf(fcekVar2.c));
        }
        try {
            fcju fcjuVar = (fcju) eyfy.parseFrom(fcju.a, ((fbzt) obj).e, eyfc.a());
            fcjuVar.getClass();
            fcek fcekVar3 = fcjuVar.c;
            if (fcekVar3 == null) {
                fcekVar3 = fcek.a;
            }
            return "tachygram ".concat(String.valueOf(fcekVar3.c));
        } catch (eygu unused) {
            ensk j = a.j();
            j.Y(ente.a, "BugleNetwork");
            ((enrr) j.h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/TachygramExecutionKeyExtractor", "extractKey", 46, "TachygramExecutionKeyExtractor.kt")).q("Error parsing ReflectedTachygramMessageContainer proto.");
            return "default key for parallel execution";
        }
    }
}
