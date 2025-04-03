package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crbz {
    public static awvb a(crbv crbvVar) {
        final avty avtyVar = new avty();
        final awva awvaVar = (awva) awvb.a.createBuilder();
        crbg crbgVar = (crbg) crbvVar;
        String uri = crbgVar.c.toString();
        awvaVar.copyOnWrite();
        awvb awvbVar = (awvb) awvaVar.instance;
        uri.getClass();
        awvbVar.f = uri;
        crbgVar.e.ifPresent(new LongConsumer() { // from class: crbw
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                awva awvaVar2 = awva.this;
                awvaVar2.copyOnWrite();
                awvb awvbVar2 = (awvb) awvaVar2.instance;
                awvb awvbVar3 = awvb.a;
                awvbVar2.d = (int) j;
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
                return LongConsumer$CC.$default$andThen(this, longConsumer);
            }
        });
        crbgVar.d.ifPresent(new Consumer() { // from class: crbx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                awva awvaVar2 = awva.this;
                String str = (String) obj;
                awvaVar2.copyOnWrite();
                awvb awvbVar2 = (awvb) awvaVar2.instance;
                awvb awvbVar3 = awvb.a;
                str.getClass();
                awvbVar2.c = str;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        crbgVar.b.ifPresent(new Consumer() { // from class: crby
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                awup awupVar = (awup) avtyVar.m().fP((ContentType) obj);
                awva awvaVar2 = awva.this;
                awvaVar2.copyOnWrite();
                awvb awvbVar2 = (awvb) awvaVar2.instance;
                awvb awvbVar3 = awvb.a;
                awupVar.getClass();
                awvbVar2.e = awupVar;
                awvbVar2.b |= 1;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return (awvb) awvaVar.build();
    }
}
