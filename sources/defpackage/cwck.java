package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwck implements Consumer {
    final /* synthetic */ cwcm a;
    final /* synthetic */ String b;

    public cwck(cwcm cwcmVar, String str) {
        this.a = cwcmVar;
        this.b = str;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        csjb e = cwcm.a.e();
        e.I("Failed to add member to Rcs group chat");
        e.s((Throwable) obj);
        this.a.c(this.b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
