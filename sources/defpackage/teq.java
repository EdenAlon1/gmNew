package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class teq {
    public static boolean a(eszz eszzVar) {
        return eszzVar.h.contains("SERVER_DELIVERED");
    }

    public static final int b() {
        efbd.b();
        bsob e = bsom.e();
        e.z("countUnknownSenderConversations");
        e.i(new Function() { // from class: tek
            public final /* synthetic */ String a = "ʼUNKNOWN_SENDER!ʼ";

            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                bsolVar.C(this.a);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return e.b().i();
    }
}
