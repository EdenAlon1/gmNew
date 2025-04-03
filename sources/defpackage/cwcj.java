package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwcj implements Consumer {
    final /* synthetic */ cwcm a;
    final /* synthetic */ String b;

    public cwcj(cwcm cwcmVar, String str) {
        this.a = cwcmVar;
        this.b = str;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ceyt ceytVar = (ceyt) obj;
        ceytVar.getClass();
        if (ceytVar.e()) {
            return;
        }
        this.a.c(this.b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
