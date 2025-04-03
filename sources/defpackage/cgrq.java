package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgrq {
    public final cgrc a;
    public final errm b;
    public final asix c;

    public cgrq(cgrc cgrcVar, errm errmVar, asix asixVar) {
        this.a = cgrcVar;
        this.b = errmVar;
        this.c = asixVar;
    }

    public final elfl a(MessageIdType messageIdType) {
        final SettableFuture create = SettableFuture.create();
        csvw csvwVar = new csvw(new cgrn(create), new Consumer() { // from class: cgrp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                SettableFuture.this.set(ceyt.k());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cgra cgraVar = (cgra) cgrb.a.createBuilder();
        cgraVar.b(messageIdType.b());
        cgrb cgrbVar = (cgrb) cgraVar.build();
        cetp cetpVar = new cetp();
        cetpVar.e = csvwVar;
        this.a.c(cgrbVar, cetpVar.a());
        return elfl.g(create);
    }

    public final elfl b(MessageIdType messageIdType, cgrr cgrrVar) {
        if (!this.c.a()) {
            return a(messageIdType);
        }
        final SettableFuture create = SettableFuture.create();
        csvw csvwVar = new csvw(new cgrn(create), new Consumer() { // from class: cgro
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                SettableFuture.this.set(ceyt.k());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cgrc cgrcVar = this.a;
        cgra cgraVar = (cgra) cgrb.a.createBuilder();
        cgraVar.b(messageIdType.b());
        cgraVar.copyOnWrite();
        cgrb cgrbVar = (cgrb) cgraVar.instance;
        cgrbVar.e = cgrrVar.a();
        cgrbVar.b |= 1;
        cgrb cgrbVar2 = (cgrb) cgraVar.build();
        cetp cetpVar = new cetp();
        cetpVar.e = csvwVar;
        cgrcVar.c(cgrbVar2, cetpVar.a());
        return elfl.g(create);
    }

    public final elfl c(List list) {
        cgra cgraVar = (cgra) cgrb.a.createBuilder();
        cgraVar.a((Iterable) Collection.EL.stream(list).map(new cgrj()).collect(Collectors.toCollection(new cgrk())));
        return this.a.a((cgrb) cgraVar.build()).i(new cgrl(), this.b).h(new cgrm(), this.b);
    }

    public final void d(MessageIdType messageIdType) {
        cgra cgraVar = (cgra) cgrb.a.createBuilder();
        cgraVar.b(messageIdType.b());
        this.a.d((cgrb) cgraVar.build());
    }

    public final void e(MessageIdType messageIdType) {
        cgra cgraVar = (cgra) cgrb.a.createBuilder();
        cgraVar.b(messageIdType.b());
        this.a.b((cgrb) cgraVar.build());
    }

    public final void f(MessageIdType messageIdType, cgrr cgrrVar) {
        if (!this.c.a()) {
            d(messageIdType);
            return;
        }
        cgrc cgrcVar = this.a;
        cgra cgraVar = (cgra) cgrb.a.createBuilder();
        cgraVar.b(messageIdType.b());
        cgraVar.copyOnWrite();
        cgrb cgrbVar = (cgrb) cgraVar.instance;
        cgrbVar.e = cgrrVar.a();
        cgrbVar.b |= 1;
        cgrcVar.d((cgrb) cgraVar.build());
    }

    public final void g(MessageIdType messageIdType, cgrr cgrrVar) {
        if (!this.c.a()) {
            e(messageIdType);
            return;
        }
        cgrc cgrcVar = this.a;
        cgra cgraVar = (cgra) cgrb.a.createBuilder();
        cgraVar.b(messageIdType.b());
        cgraVar.copyOnWrite();
        cgrb cgrbVar = (cgrb) cgraVar.instance;
        cgrbVar.e = cgrrVar.a();
        cgrbVar.b |= 1;
        cgrcVar.b((cgrb) cgraVar.build());
    }

    public final void h(List list) {
        cgra cgraVar = (cgra) cgrb.a.createBuilder();
        cgraVar.a((Iterable) Collection.EL.stream(list).map(new cgrj()).collect(Collectors.toCollection(new cgrk())));
        this.a.d((cgrb) cgraVar.build());
    }

    @Deprecated
    public final void i(List list) {
        cgra cgraVar = (cgra) cgrb.a.createBuilder();
        cgraVar.a((Iterable) Collection.EL.stream(list).map(new cgrj()).collect(Collectors.toCollection(new cgrk())));
        this.a.b((cgrb) cgraVar.build());
    }
}
