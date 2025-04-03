package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
final /* synthetic */ class cgnr implements BiConsumer {
    private final /* synthetic */ ffjm a;

    public cgnr(ffjm ffjmVar) {
        this.a = ffjmVar;
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        this.a.a(obj, obj2);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
