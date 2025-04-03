package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayhu {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/conversation/match/ConversationDetailsLogger");
    public final ffbr b;
    public final ffbr c;

    public ayhu(ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public static evhq a(engw engwVar, final ayvm ayvmVar) {
        return new evhq(evhp.CONFIRMED_UPLOAD_SAFE_USER_DATA, Collection.EL.stream(engwVar).map(new Function() { // from class: ayhn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ayhf) ayvm.this.a((String) obj)).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }
}
